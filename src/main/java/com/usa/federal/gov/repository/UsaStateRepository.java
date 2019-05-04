package com.usa.federal.gov.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usa.federal.gov.entity.USAStateEntity;

@Repository
public interface UsaStateRepository extends JpaRepository<USAStateEntity, Serializable> {

}
