/**  
* @Title: SimpCorsFilter.java
* @Package com.csd.blackcat.Cors.filter
* @Description: TODO(用一句话描述该文件做什么)
* @author lei.gao
* @date 2016年10月19日 下午11:13:54
* @version V1.0  
*/ 
package com.csd.blackcat.Cors.filter;

import java.io.IOException;
import java.util.logging.LogRecord;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
* @ClassName: SimpCorsFilter
* @Description: TODO(这里用一句话描述这个类的作用)
* @author lei.gao
* @date 2016年10月19日 下午11:13:54
*
*/
public class SimpCorsFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse)response;
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
		resp.setHeader("Access-Control-Max-Age","3600");   
		resp.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");
		chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {	}
	@Override
	public void destroy() {	}
}
