package com.ganesh.persistence;

import com.ganesh.pojo.Wife;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WifeDaoInterface extends JpaRepository<Wife, Integer> {
}
