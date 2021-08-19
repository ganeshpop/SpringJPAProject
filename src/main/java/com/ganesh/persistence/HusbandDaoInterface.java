package com.ganesh.persistence;

import com.ganesh.pojo.Husband;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HusbandDaoInterface extends JpaRepository<Husband, Integer> {
}
