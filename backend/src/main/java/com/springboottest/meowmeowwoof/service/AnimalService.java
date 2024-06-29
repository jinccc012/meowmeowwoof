package com.springboottest.meowmeowwoof.service;

import com.springboottest.meowmeowwoof.entity.Animal;
import com.springboottest.meowmeowwoof.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired(required = true)
    AnimalRepository animalRepository;

    public Animal createAnimal(Animal animal){
        return animalRepository.save(animal);
    }

    public Optional<Animal> getAnimalById(Integer id){
        return animalRepository.findById(id);
    }

    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    public Animal updateAnimal(Animal animal){
        return animalRepository.save(animal);
    }

    public void deleteAnimalById(Integer id){
        animalRepository.deleteById(id);
    }

    public void deleteAllAnimals(){
        animalRepository.deleteAll();
    }

}
