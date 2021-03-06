package com.tobdev.qywxthird.controller;

import com.tobdev.qywxthird.utils.CommonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

    @RequestMapping("/admin/index")
    String admin(){
        return  "admin/index";
    }

    @RequestMapping("/admin/pri/index")
    String index(HttpServletRequest request, ModelMap model){
        //获取身份
        //当前登录身份
        String userId = (String) request.getAttribute("user_id");
        String corpId = (String) request.getAttribute("corp_id");

        System.out.println(userId);
        System.out.println(corpId);

        model.put("user_id",userId);

        String contactUrl = CommonUtils.RouteToUrl(request,"/contact/index");
        model.put("contact_url",contactUrl);

        return  "admin/pri/index";
    }

}
