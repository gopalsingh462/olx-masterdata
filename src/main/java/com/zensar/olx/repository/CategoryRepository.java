package com.zensar.olx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.olx.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{

}
