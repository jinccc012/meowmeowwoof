package com.springboottest.meowmeowwoof.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"animal\"")
@Schema(description = "Animal Entity")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique Identifier of the Animal", example = "1")
    private Integer animal_id;
    @Schema(description = "Unique Identifier of the Label", example = "1")
    private Integer label_id;
    @Schema(description = "Category of the Animal", example = "dog")
    private String category;
    @Schema(description = "Name of the Animal", example = "HARU")
    private String animal_name;
    @Schema(description = "Age of the Animal", example = "1")
    private Integer animal_age;


}
