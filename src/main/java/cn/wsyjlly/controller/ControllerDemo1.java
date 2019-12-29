package cn.wsyjlly.controller;

import cn.wsyjlly.components.JmsComponent;
import cn.wsyjlly.entity.Message;
import cn.wsyjlly.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.File;
import java.util.Date;

/**
 * @author wsyjlly
 * @create 2019.06.10 - 19:00
 **/
@RestController
public class ControllerDemo1 {

    @Value("${server.port}")
    private String location;

    @Autowired
    JmsComponent jmsComponent;
    @Autowired
    MailService mailService;

    @RequestMapping("/demo")
    public void demo(){
        System.out.println(location);
        jmsComponent.send(new Message("ysw",new Date()));
    }
    @RequestMapping("/mail1")
    public void mail1(){
        mailService.sendSimpleSender("wsyjlly@qq.com","895864393@qq.com","211874876@qq.com","你爱我吗","你这个坏孩子！");
    }
    @RequestMapping("/mail2")
    public void mail2() throws MessagingException {
        mailService.sendAttachFileMail("wsyjlly@qq.com","wsyjlly@qq.com","你信命吗？","你这个坏孩子！",new File("./mail/aaa.jpg"));
    }
    @RequestMapping("/mail3")
    public void mail3() throws MessagingException {
        mailService.sendMailWithImg("wsyjlly@qq.com","wsyjlly@qq.com","你信神吗？","<div>hello,坏孩子！"
                +"<div><img src='cid:p01'/></div>"
                +"<div><img src='cid:p02'/></div>"
                +"</div>",
                new String[]{"./mail/aaa.jpg","./mail/abc.gif"},
                new String[]{"p01","p02"});
    }
    
}
