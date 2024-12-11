package com.example.medical_system_backend;


	

	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/api/users")
	public class UserController {

	    @Autowired
	    private UserService userService;

	    @PostMapping("/signup")
	    public User registerUser(@RequestBody User user) {
	        return userService.registerUser(user);
	    }
	}



