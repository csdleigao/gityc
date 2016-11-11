/**  
* @Title: AjaxCorsTest.java
* @Package com.csd.blackcat.Cors
* @Description: TODO(用一句话描述该文件做什么)
* @author lei.gao
* @date 2016年10月19日 下午10:54:27
* @version V1.0  
*/ 
package com.csd.blackcat.Cors.Conterller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csd.blackcat.Cors.Service.CorsServiceI;

/**
* @ClassName: AjaxCorsTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author lei.gao
* @date 2016年10月19日 下午10:54:27
*
*/
@Controller
public class AjaxCorsTest {

	@Autowired
	private CorsServiceI service;
	
	@RequestMapping("toCors")
	@ResponseBody
	public List<String> toCors(HttpServletRequest request) throws Exception 
	{
		String phone = request.getParameter("phone");
		String appid = request.getParameter("appid");
		
		List<String> list = new ArrayList<String>();
		list.add(phone);
		list.add(appid);
		return list;
	}
}

