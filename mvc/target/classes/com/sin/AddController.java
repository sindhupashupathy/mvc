package com.sin;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		int k = i+j;
		 ModelAndView mv = new ModelAndView();
		 mv.setView("display.jsp");
		 mv.addObject("result", k);
		 
		 	return mv;
		 	
		 
	
		
	}

}
