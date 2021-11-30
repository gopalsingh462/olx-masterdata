package com.zensar.olx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olx.entity.StatusEntity;

public interface StatusRepository extends JpaRepository<StatusEntity, Integer>{

}
