package com.prog.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
