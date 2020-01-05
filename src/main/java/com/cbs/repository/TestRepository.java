package com.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbs.model.Authority;

public interface TestRepository extends JpaRepository<Authority, String> {


} 
