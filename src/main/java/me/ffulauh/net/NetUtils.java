package me.ffulauh.net;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ffulauh on 2017/4/27.
 */
public class NetUtils {
    public static void main(String[] args)throws Exception {

        CloseableHttpClient httpClient= HttpClients.createDefault();
        String hostIp="http://192.168.1.139";
        String port="8080";
        String requestUri="/api/v1/login/login";
        String requestUrl=hostIp+":"+port+requestUri;
        HttpPost httpPost=new HttpPost(requestUrl);
        List<NameValuePair> params=new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("phoneNumber","13572246203"));
        params.add(new BasicNameValuePair("verificationCode","111111"));
        params.add(new BasicNameValuePair("requestType","c2V0NTma8+I="));
        httpPost.setEntity(new UrlEncodedFormEntity(params));
        CloseableHttpResponse response=httpClient.execute(httpPost);
        HttpEntity entity=response.getEntity();
        BufferedReader reader=new BufferedReader(new InputStreamReader(entity.getContent()));
        String line="";
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(sb.toString());
    }
}
