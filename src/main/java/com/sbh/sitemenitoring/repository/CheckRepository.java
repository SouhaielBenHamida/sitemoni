package com.sbh.sitemenitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbh.sitemenitoring.entity.Check;

@Repository
public interface CheckRepository extends JpaRepository<Check, Integer>{

}
