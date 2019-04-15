package com.importNew.controller;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	private JavaMailSender mailSender;

	@GetMapping("/simple")
	public String simpleSend() {
	    SimpleMailMessage message = new SimpleMailMessage();
	    message.setFrom("250867405@qq.com");
	    message.setTo("250867405@qq.com");
	    message.setSubject("主题：来自rock邮件");
	    message.setText("rock，比较寂寞冷啊");
	    mailSender.send(message);        
	    return "发送成功!";
	}
	
	@GetMapping("/attach")
	public String attachSend() throws MessagingException {
	    MimeMessage mimeMessage = mailSender.createMimeMessage();

	    MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
	    helper.setFrom("250867405@qq.com");
	    helper.setTo("250867405@qq.com");    
	    helper.setSubject("主题：来自oKong邮件(带附件)");
	    helper.setText("(含附件)公众号：一枚趔趄的猿(lqdevOps)，作者：oKong");
	    //添加附件
	    File qrCode = new File("bd_logo1.png");
	    //建议文件带上后缀，可支持在线预览 
	    helper.addAttachment("公众号二维码", qrCode);
	    mailSender.send(mimeMessage);
	    return "附件邮件发送成功!";
	}
}
