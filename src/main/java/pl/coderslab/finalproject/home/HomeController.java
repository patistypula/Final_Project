package pl.coderslab.finalproject.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String landingPage(){
        return "admin/landingPage";
    }

    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String logIn(){
        return "redirect:/home/home";
    }

    @RequestMapping("/home")
    public String hello() {
        return  "home/home";
    }

    @GetMapping("/logout")
    public String logOut(){
        return "admin/logout";
    }

    @PostMapping("/logout")
    public String logout(){
        return "home/escape";
    }

}
