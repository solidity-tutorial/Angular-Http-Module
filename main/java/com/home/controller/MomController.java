package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@RequestMapping("/mom")
public class MomController {
	
	@CrossOrigin(origins="http://localhost:4200")
    @RequestMapping("/sugar")
        public String giveSugar(){
            return "/WEB-INF/view/momview.jsp";
        }

}
