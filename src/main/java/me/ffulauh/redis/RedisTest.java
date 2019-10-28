package me.ffulauh.redis;

import me.ffulauh.me.Me;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RedisTest {

    private static final String REDIS_HOST="192.168.1.12";

    public static void main(String[] args) {
        Jedis jedis=new Jedis(REDIS_HOST);

        //字符串 string
//        jedis.set("myName","hsh");
//        System.out.println(jedis.get("myName"));

        //list 链表上的每个节点都包含了一个字符串
//        jedis.lpush("list","listV1");
//        jedis.lpush("list","listV2");
//        jedis.lpush("list","listV3");
        List<String> list=jedis.lrange("list",0,-1);
//        jedis.blpop()
//        System.out.println(list);

        //set 包含字符串的无序收集器
//        jedis.sadd("set","set1");
//        jedis.sadd("set","set2");
//        jedis.sadd("set","set3");
//        Set<String> set=jedis.smembers("set");
//        System.out.println(set);


        //hash 无序散列表
//        Me me1=new Me();
//        me1.setName("han");
//        Me me2=new Me();
//        me1.setName("han2");

//        Map<String,String> mes = new HashMap<>();
//        mes.put("me1","me1v");
//        mes.put("me2","me2v");

//        Map<String,Me> me = new HashMap<>();
//        me.put("me1",me1);
//        me.put("m2",me2);
        //存储的map中只能有一个值
//        jedis.hset("mess",mes);
        //map中可以有多个
//        jedis.hmset("mess",mes);
//        jedis.hset("mess","me3","me3v");
//        String getString =jedis.hget("mess","me1");
//        System.out.println(getString);


        //有序集合 与浮点分值之间的有序映射
//        jedis.zadd("zset",3,"set1");
//        jedis.zadd("zset",2,"set2");
        jedis.zadd("zset",4,"set3");
//        Set<String> set=jedis.zrange("zset",0,-1);
//        System.out.println(set);

    }
}
