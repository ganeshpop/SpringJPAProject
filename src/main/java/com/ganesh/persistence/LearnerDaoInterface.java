package com.ganesh.persistence;

import com.ganesh.pojo.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface LearnerDaoInterface extends JpaRepository<Learner, Integer> {
}
