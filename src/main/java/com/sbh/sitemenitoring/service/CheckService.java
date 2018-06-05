package com.sbh.sitemenitoring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbh.sitemenitoring.repository.CheckRepository;
import com.sbh.sitemenitoring.entity.Check;

@Service
public class CheckService {

	@Autowired
	private CheckRepository checkRepository;
	
	public List<Check> findAll() {
		return checkRepository.findAll();
	}

	public void save(Check check) {
		checkRepository.save(check);
	}

	public void remove(Check check) {
		checkRepository.delete(check);	
	}
}
