package com.ganesh.persistence;

import com.ganesh.pojo.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DepartmentDaoInterface extends JpaRepository<Department, Integer> {
}
