package com.tutorial.fullstack.crud.reactspringbootfullstacktutorial.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Course {
        private Long id;
        private String username;
        private String description;
        //no arg constructor
        //constructor with 3 args
        //getters and setters
        //hashcode and equals

}
