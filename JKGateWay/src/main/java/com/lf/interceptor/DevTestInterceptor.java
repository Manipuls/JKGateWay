package com.lf.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lf.entity.SysUser;

public class DevTestInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object arg2) throws Exception {
		
		Object attribute = req.getSession().getAttribute("user");
		if(StringUtils.isEmpty(attribute)){
			SysUser user = new SysUser();
			user.setRoleNo("1");
			req.getSession().setAttribute("user", user);
		}
		System.out.println("===>roleNo:"+((SysUser)req.getSession().getAttribute("user")).getRoleNo());
		
		
		return true;
	}

}
