package cn.com.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * WebService���õķ�ʽ:wsimport�ͻ��˷�ʽ
 */
public class PhoneTest {

    public static void main(String[] args) {
        //��������
        MobileCodeWS ms = new MobileCodeWS();

        //��ȡ������
        MobileCodeWSSoap mdao = ms.getPort(MobileCodeWSSoap.class);

        //���÷���
        String code = mdao.getMobileCodeInfo("18272978862", "");

        System.out.println(code);

    }

}
