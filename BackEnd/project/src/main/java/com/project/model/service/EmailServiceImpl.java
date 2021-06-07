package com.project.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.*;
import com.project.dao.EmailRepository;
import com.project.model.Email;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	EmailRepository emailRepository;
	

	@Override
	public boolean saveEmail(Email email) {
		try {
			Email saveEmail=emailRepository.save(email);
			
			if(email != null) {
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			
		
		
		}
		
		return false;
	}

	@Override
	public List<Email> getEmail() {
		
		return null;
	}

	@Override
	public List<Email> getEmails() {
		
		return emailRepository.findAll();
	}

}
