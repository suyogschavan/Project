package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Email;
import com.project.model.service.EmailService;

@RestController
@RequestMapping(path = "/emails")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@CrossOrigin
	@PostMapping(path = "/save")
	public ResponseEntity<String> saveEmails(@RequestBody Email email) {
		if(emailService.saveEmail(email)) {
			return new ResponseEntity<String>("Lead saved",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Lead failed to save", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
		
		@CrossOrigin
		@GetMapping(path = "/getemails")
		public ResponseEntity<java.util.List<Email>> getEmails() {
			return new ResponseEntity<List<Email>>(emailService.getEmails(),HttpStatus.OK);
	}

}
