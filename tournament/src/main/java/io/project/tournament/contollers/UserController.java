package io.project.tournament.contollers;

import io.project.tournament.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping(value="/createTournament")
    public String createTournament(){
        System.out.println("Create Tournament - UserController");
        return userService.createTournament();
    }
}
