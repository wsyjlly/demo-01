package cn.wsyjlly.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author wsyjlly
 * @create 2019.07.16 - 17:32
 **/
@Component
public class MailService {
    @Autowired
    JavaMailSender javaMailSender;
    public void sendSimpleSender(String from,String to,String cc,String subject,String content){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setCc(cc);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);
    }
    public void sendAttachFileMail(String from, String to, String subject, String content, File file) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content);
        helper.addAttachment(file.getName(),file);
        javaMailSender.send(mimeMessage);

    }
    public void sendMailWithImg(String from, String to, String subject, String content, String[] srcPath,String[] resIDs) throws MessagingException {
        if (srcPath.length != resIDs.length){
            System.out.println("发送失败！");
            return;
        }
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content,true);
        for (int i = 0; i < srcPath.length; i++) {
            FileSystemResource resource = new FileSystemResource(new File(srcPath[i]));
            helper.addInline(resIDs[i],resource);
        }
        javaMailSender.send(mimeMessage);
    }
}
