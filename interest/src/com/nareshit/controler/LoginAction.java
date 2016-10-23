package com.nareshit.controler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.model.LoginModel;
import com.nareshit.view.*;
public class LoginAction extends Action
{
	public LoginAction() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("");
	}
	LoginModel lm=new LoginModel();
	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest req,HttpServletResponse res)
	{
		
		LoginForm lf=(LoginForm)form;
		String user=lf.getUsername();
		String password=lf.getPassword();

		boolean flag=lm.isAutenticated(user,password);
		if(flag)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
}