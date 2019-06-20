package cn.wsyjlly.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author wsyjlly
 * @create 2019.06.14 - 18:27
 **/
@WebListener
public class MyServletRequestListener implements ServletRequestListener {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.debug("MyServletRequestListener...init...");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.debug("MyServletRequestListener...destroyed...");
    }

}
