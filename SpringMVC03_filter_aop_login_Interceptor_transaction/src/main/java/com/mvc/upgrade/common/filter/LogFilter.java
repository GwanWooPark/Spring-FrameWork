package com.mvc.upgrade.common.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LogFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        String remoteAddr = req.getRemoteAddr();
        // 클라이언트의 IP주소를 가져온다
        // IPv6 형태로 가지고온다.

        String uri = req.getRequestURI();
        //localhost뒤의 프로젝트 이름부터 끝까지 가지고 온다.

        String url = req.getRequestURL().toString();
        // WEB-INF의 실제 경로를 가지고옴

        String queryString = req.getQueryString();
        // 쿼리스트링의 값을 가지고온다.

        String referer = req.getHeader("referer");
        // 현재 요청된 페이지의 이전 링크를 가지고 온다.

        String agent = req.getHeader("User-Agent");
        // 클라이언트가 사용중인 브라우저의 정보/버전등을 가지고 온다

        StringBuffer sb = new StringBuffer();
        sb.append("* remoteAddr : " + remoteAddr + "\n")
          .append("* uri : " + uri + "\n")
          .append("* url : " + url + "\n")
          .append("* queryString : " + queryString + "\n")
          .append("* referer : " + referer + "\n")
          .append("* agent : " + agent + "\n");

        logger.info("LOG FILTER\n" + sb);

        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
