package com.testfan;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testfan.service.MyTestService;

@Controller
@RequestMapping(value = "/hello")
public class HelloSpringboot {
	
	@Autowired
	MyTestService testservice;
	
	@ResponseBody
	@RequestMapping(value = "/map")
	public Map<String,Object> getALL(){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("name", "zhangsan");
		map.put("age", 100);
		return map;
	}
	
	
	   @RequestMapping(value="/mvc",method=RequestMethod.GET)  
	    public String HelloWorld(Model model){  
		  
	        model.addAttribute("message","Hello Spring MVC!!!");  //传参数给前端
	        
	      //视图渲染，/WEB-INF/view/HelloWorld.jsp
	        return "HelloWorld";  //页面的名称，根据此字符串会去寻找名为HelloWorld.jsp的页面
	    } 

}
