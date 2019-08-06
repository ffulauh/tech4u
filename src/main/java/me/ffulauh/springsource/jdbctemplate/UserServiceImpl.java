package me.ffulauh.springsource.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

public class UserServiceImpl implements UserService{

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into user(name,age) VALUES(?,?)",new Object[]{user.getName(),user.getAge()},
                new int[]{Types.VARCHAR,Types.INTEGER});
    }

    @Override
    public List<User> getUsers() {
        List<User> list=jdbcTemplate.query("select * from user",new UserRowMapper());
        return list;
    }
}
