package com.ptg.purchase.console.util;


import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class IPUtil {
	private static final org.apache.commons.logging.Log logger	= LogFactory.getLog(IPUtil.class);
	public static String getRemoteIP(HttpServletRequest request) {
		String ip = request.getHeader("X-Real-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("x-forwarded-for");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		logger.info("IPUtil.getRemoteIP>>>>ip:"+ip);
		return ip;
	}
	
	public static String getWebsite(HttpServletRequest request) {
		String website = request.getHeader("referer");
		if ("".equals(website)) {
			return "www.baidu.com";
		}
		int start = website.indexOf("https://") + 8;
		int end = website.substring(start).indexOf("/") + 8;
		return website.substring(start, end);
	}
	
	public static Map<String, String> getHeaders(HttpServletRequest request) {

	    Map<String, String> map = new HashMap<String, String>();

	    Enumeration headerNames = request.getHeaderNames();
	    while (headerNames.hasMoreElements()) {
	        String key = (String) headerNames.nextElement();
	        String value = request.getHeader(key);
	        map.put(key, value);
	    }

	    return map;
	  }

}
