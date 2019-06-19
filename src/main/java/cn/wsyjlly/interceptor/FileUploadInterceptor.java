package cn.wsyjlly.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wsyjlly
 * @create 2019.06.13 - 16:52
 **/
public class FileUploadInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FileUploadInterceptor...preHandle");
        /*Map<String, String[]> pramMap = request.getParameterMap();
        String[] uploadFiles = pramMap.get("uploadFile");
        System.out.println(uploadFiles);*/

//        String uploadFile = request.getParameter("uploadFile");


        /*if (uploadFile == null){
            System.out.println("uploadFile == null");
            response.setDateHeader("name",137);
            return false;
        }*/

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FileUploadInterceptor...postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FileUploadInterceptor...afterCompletion");
    }
}
