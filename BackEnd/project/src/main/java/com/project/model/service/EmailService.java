package com.project.model.service;

import java.util.List;

import com.project.*;
import com.project.model.Email;

public interface EmailService {

	boolean saveEmail(Email email);

	java.util.List<Email> getEmails();

	List<Email> getEmail();


}
