package com.springboot.demo.web;


import com.springboot.demo.service.UserService;
import com.springboot.demo.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }


    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){

        userService.save(registrationDto);
        return "redirect:/registration?success";

    }
}