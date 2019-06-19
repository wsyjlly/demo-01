package cn.wsyjlly.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author wsyjlly
 * @create 2019.06.14 - 18:27
 **/
@WebListener
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyServletRequestListener...init...");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyServletRequestListener...destroyed...");
    }

}
