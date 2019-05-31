package com.java.Phone;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * WebService调用的方式:HTTPURLConnection方式
 */
public class Weather {
    public static void main(String[] args) throws Exception {

        //创建url
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");

        //创建连接
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        //设置请求方式
        conn.setRequestMethod("POST");

        //设置可以写请求数据
        conn.setDoOutput(true);

        //设置请求头
        conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

        //设置请求数据
        OutputStream os = conn.getOutputStream();
        os.write(getXML("13633123359").getBytes());

        //打印响应码
        int code = conn.getResponseCode();
        System.out.println("响应状态码:" + code);

        if (code == 200) {
            //读取响应数据
            InputStream is = conn.getInputStream();
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String line = null;
            while ((line = br.readLine()) != null) {
                //打印响应数据
                System.out.println(line);
            }
            br.close();
        }
    }

    public static String getXML(String tel) {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"" +
                " xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<soap:Body>" +
                "<getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">" +
                "<mobileCode>" + tel + "</mobileCode>" +
                "<userID></userID>" +
                "</getMobileCodeInfo>" +
                "</soap:Body>" +
                "</soap:Envelope>";
    }

}
