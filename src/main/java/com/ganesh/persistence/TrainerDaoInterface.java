package com.ganesh.persistence;

import com.ganesh.pojo.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TrainerDaoInterface extends JpaRepository<Trainer, Integer> {
}
