package com.java.Phone;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * WebService���õķ�ʽ:HTTPURLConnection��ʽ
 */
public class Weather {
    public static void main(String[] args) throws Exception {

        //����url
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");

        //��������
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        //��������ʽ
        conn.setRequestMethod("POST");

        //���ÿ���д��������
        conn.setDoOutput(true);

        //��������ͷ
        conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");

        //������������
        OutputStream os = conn.getOutputStream();
        os.write(getXML("13633123359").getBytes());

        //��ӡ��Ӧ��
        int code = conn.getResponseCode();
        System.out.println("��Ӧ״̬��:" + code);

        if (code == 200) {
            //��ȡ��Ӧ����
            InputStream is = conn.getInputStream();
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String line = null;
            while ((line = br.readLine()) != null) {
                //��ӡ��Ӧ����
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
