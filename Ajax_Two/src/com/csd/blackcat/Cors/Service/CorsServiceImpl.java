/**  
* @Title: CorsServiceImpl.java
* @Package com.csd.blackcat.Cors.Service
* @Description: TODO(用一句话描述该文件做什么)
* @author lei.gao
* @date 2016年10月19日 下午11:00:43
* @version V1.0  
*/ 
package com.csd.blackcat.Cors.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csd.blackcat.Cors.Dao.CorsDao;

/**
* @ClassName: CorsServiceImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author lei.gao
* @date 2016年10月19日 下午11:00:43
*
*/
@Service
public class CorsServiceImpl implements CorsServiceI {

	@Autowired
	private CorsDao dao;
	
}
