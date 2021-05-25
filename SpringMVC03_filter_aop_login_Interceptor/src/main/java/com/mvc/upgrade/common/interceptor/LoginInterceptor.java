package com.mvc.upgrade.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        logger.info("[Interceptor] : preHandle");

        // spring3.2 이상부터는 dispatcher-context.xml에서 <exclude-mapping-path>를 통해 설정 가능
        if (request.getRequestURI().contains("/loginForm.do") ||
            request.getRequestURI().contains("/ajaxLogin.do") ||
            request.getSession().getAttribute("login") != null) {
            return true;
        }

        if (request.getSession().getAttribute("login") == null) {
            response.sendRedirect("/loginForm.do");
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

        logger.info("[Interceptor] : postHandle");

        if (modelAndView != null) {
            logger.info("Target View : " + modelAndView.getViewName());
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        logger.info("[Interceptor] : afterCompletion");
    }
}
