package com.first.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    private AuthenticationService authenticationService;

    public loginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="Login",method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "Login";
    }

    @RequestMapping(value="Login",method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password, ModelMap model) {

        if(authenticationService.authenticate(name, password)) {

            model.put("name", name);
            //Authentication
            //name - in28minutes
            //password - dummy

            return "welcome1";
        }

        return "Login";
    }
}

