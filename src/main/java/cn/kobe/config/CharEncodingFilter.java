package cn.kobe.config;

/**
 * @author: kobe byrant
 * @Date: 2020/2/17 17:38
 * @Describe
 */
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * 字符过滤器
 */
@WebFilter("/CharEncodingFilter")
public class CharEncodingFilter implements Filter {
    //设置为UTF-8
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }
        //初始化
    public void init(FilterConfig filterConfig) throws ServletException {

    }
        //销毁
    public void destroy() {
    }

}