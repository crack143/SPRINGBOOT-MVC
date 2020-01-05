package com.cbs.resource;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbs.model.Authority;
import com.cbs.repository.TestRepository;


@RestController
@RequestMapping("/api")
public class TestResourse {

	@Autowired
	TestRepository testRepository;
	
	
	 @RequestMapping(value = "/save", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)	
	 @ResponseBody
	 public ResponseEntity<Authority> save(@RequestBody Authority authority){
		 Authority authorities=testRepository.save(authority);
		 return Optional.ofNullable(authorities)
		            .map(result -> new ResponseEntity<>(
		                    result,
		                    HttpStatus.OK))
		                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));	 
				 }
}
