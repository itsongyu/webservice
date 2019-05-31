package com.restful.test;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 使用httpClient访问服务
 */
public class JunitTest {


   //Restful接口的调用:HttpClient实现
//    @Test
    public void test1() throws IOException {
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建get对象
        HttpGet get = new HttpGet("http://127.0.0.1:8080/restful/user/query/1");

        //执行请求
        CloseableHttpResponse response = httpClient.execute(get);

        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity, "utf-8");
            System.out.println(result);
        }
        response.close();
        httpClient.close();
    }

    //Restful接口的调用:HttpURLConnection实现
//    @Test
    public void test2() throws IOException {

        //创建url
        URL url = new URL("http://127.0.0.1:8080/restful/user/query/1");

        //打开连接
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        //设置请求方式
        con.setRequestMethod("GET");
        /**默认connection没有读写的权限*/
        con.setDoOutput(true);

        //获取响应
        int code = con.getResponseCode();
        if (code == 200) {
            System.out.println("响应成功");
            //读取数据
            InputStream is = con.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            isr.close();
            is.close();
        } else {
            System.out.println("响应失败");
        }
    }

}
