package com.springboottest.meowmeowwoof.controller;

import com.springboottest.meowmeowwoof.entity.Animal;
import com.springboottest.meowmeowwoof.service.AnimalService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    @Autowired(required = true)
    AnimalService animalService;

    @Operation(summary = "Create a New Animal")
    @ApiResponse(responseCode = "201", description = "Animal Created Successfully")
    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal){
        return animalService.createAnimal(animal);
    }

    @Operation(summary = "Get a Animal By Id", description = "return a single Animal")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Animal Found"),
            @ApiResponse(responseCode = "404", description = "Animal Not Found")
    })
    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable Integer id){
        return animalService.getAnimalById(id);
    }

    @Operation(summary = "Get All Animals", description = "Return List of Animals")
    @ApiResponse(responseCode = "200", description = "Animals Found")
    @GetMapping
    public List<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
    }

    @Operation(summary = "Update the Animal")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Animal updated successfully"),
            @ApiResponse(responseCode = "404", description = "Animal Not Found")
    })
    @PutMapping
    public Animal updateAnimal(@RequestBody Animal animal){
        return animalService.updateAnimal(animal);
    }

    @Operation(summary = "Delete a Animal By Id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Animal Deleted Successfully"),
            @ApiResponse(responseCode = "404", description = "Animal Not Found")
    })
    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable Integer id){
        animalService.deleteAnimalById(id);
    }

    @Operation(summary = "Delete All Animals")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Animals Deleted Successfully"),
            @ApiResponse(responseCode = "404", description = "Animals Not Found")
    })
    @DeleteMapping
    public void deleteAllAnimals(){
        animalService.deleteAllAnimals();
    }
}
