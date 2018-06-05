package com.sbh.sitemenitoring.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbh.sitemenitoring.entity.Check;
import com.sbh.sitemenitoring.repository.CheckRepository;

@Service
public class InitDbService {

	@Autowired
	private CheckRepository checkRepository;

	@PostConstruct
	public void init() {
		System.out.println("***** init database start *******");
		{
			Check check = new Check();
			check.setName("example");
			check.setUrl("http://www.example.com");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("example");
			check.setUrl("http://www.example.com");
			checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("example");
			check.setUrl("http://www.example.com");
			checkRepository.save(check);
		}
		System.out.println("***** init database start *******");
	}
}
