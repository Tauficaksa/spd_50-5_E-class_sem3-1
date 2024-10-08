package com.tauficaksa.SDP_project50_test_2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String demo(){
        System.out.println("hi taufic aksa");
        return "index";
    }

    @RequestMapping("/login")
    public String login()
    {
        System.out.println("in login page ");
        return "login";
    }

    @RequestMapping("/forgotpassword")
    public String forgotpassword()
    {
        System.out.println("in forgot password page");
        return "forgot_password";
    }

    @RequestMapping("/register")
    public String register()
    {
        System.out.println("in register page");
        return "register";
    }

    @RequestMapping("/userdashboard")
    public String userdashboard()
    {
        System.out.println("in userdashboard page");
        return "user/userdashboard";
    }
    @RequestMapping("/usercourse")
    public String usercourse()
    {
        System.out.println("in usercourse page");
        return "user/usercourse";
    }

    @RequestMapping("/userproject")
    public String userproject()
    {
        System.out.println("in userproject page");
        return "user/userproject";
    }

    @RequestMapping("/uservideo")
    public String uservideo()
    {
        System.out.println("in uservideo page");
        return "user/uservideo";
    }

    @RequestMapping("/nodatafound")
    public String nodatafound()
    {
        System.out.println("in nodatafound page");
        return "user/nodatafound";
    }
}
