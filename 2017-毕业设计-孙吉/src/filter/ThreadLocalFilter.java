package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import util.DBUtil;

/**
 * Servlet Filter implementation class ThreadLocalFilter
 */
@WebFilter("/ThreadLocalFilter")
public class ThreadLocalFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ThreadLocalFilter() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		DBUtil.closeConnection();
		System.out.println("connection is close");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		DBUtil.getConnection();
		System.out.println("connection is open");
	}

}
