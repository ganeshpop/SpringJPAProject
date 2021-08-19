package com.ganesh.persistence;

import com.ganesh.pojo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeDaoInterface extends JpaRepository<Employee, Integer> {
}
