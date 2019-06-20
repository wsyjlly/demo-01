package cn.wsyjlly.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wsyjlly
 * @create 2019.06.13 - 16:52
 **/
public class FileUploadInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.debug("FileUploadInterceptor...preHandle");
        /*Map<String, String[]> pramMap = request.getParameterMap();
        String[] uploadFiles = pramMap.get("uploadFile");
        System.out.println(uploadFiles);*/

        //String uploadFile = request.getParameter("uploadFile");


        /*if (uploadFile == null){
            System.out.println("uploadFile == null");
            response.setDateHeader("name",137);
            return false;
        }*/

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("FileUploadInterceptor...postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("FileUploadInterceptor...afterCompletion");
    }
}
