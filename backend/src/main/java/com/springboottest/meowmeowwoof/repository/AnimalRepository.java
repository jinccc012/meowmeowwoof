package com.springboottest.meowmeowwoof.repository;

import com.springboottest.meowmeowwoof.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {



}
