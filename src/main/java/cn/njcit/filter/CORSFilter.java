package cn.njcit.filter;

import org.apache.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//跨域过滤器
public class CORSFilter implements Filter {
    private ServletContext context;
    public CORSFilter() {
    }
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", ((HttpServletRequest) req).getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "Authorization,Origin, X-Requested-With, Content-Type,Accept,Access-Token");
         response.setHeader("Set-Cookie", "JSESSIONID=" + ((HttpServletRequest) req).getSession().getId() +
                ";HttpOnly;path=/;Secure;SameSite=None");
        if("OPTIONS".equalsIgnoreCase(((HttpServletRequest) req).getMethod())){
            response.setStatus(HttpStatus.SC_OK);
            return;
        }
        chain.doFilter(req, response);
    }

    public void init(FilterConfig fConfig) throws ServletException {
        context = fConfig.getServletContext();
    }
    public void destroy() {
    }

}