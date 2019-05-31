package cn.com.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

/**
 * WebService调用的方式:wsimport客户端方式
 */
public class PhoneTest {

    public static void main(String[] args) {
        //创建服务
        MobileCodeWS ms = new MobileCodeWS();

        //获取服务类
        MobileCodeWSSoap mdao = ms.getPort(MobileCodeWSSoap.class);

        //调用方法
        String code = mdao.getMobileCodeInfo("18272978862", "");

        System.out.println(code);

    }

}
