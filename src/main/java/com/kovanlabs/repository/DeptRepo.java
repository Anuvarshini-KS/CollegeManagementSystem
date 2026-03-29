package com.kovanlabs.repository;

import com.kovanlabs.entity.DeptEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptRepo extends JpaRepository<DeptEntity, Long> {
    List<DeptEntity> findByDeptName(String deptName);
}
