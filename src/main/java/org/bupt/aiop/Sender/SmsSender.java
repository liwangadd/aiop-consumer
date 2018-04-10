package org.bupt.aiop.Sender;


import javax.mail.MessagingException;

/**
 * 短信发送器
 */
public class SmsSender {

    /**
     * 发送短信到单个手机
     * @param to 手机号
     * @param content 短信内容
     * @param footer 短信落款
     * @throws MessagingException
     */
    public static void send(String to, String content, String footer) throws MessagingException{
        System.out.println("已请求电信运营商发送短信给" + to + ", content=" + content + ", footer=" + footer);
    }
}
