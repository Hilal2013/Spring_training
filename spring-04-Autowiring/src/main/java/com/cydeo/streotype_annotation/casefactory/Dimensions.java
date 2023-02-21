package com.cydeo.streotype_annotation.casefactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Component
public class Dimensions {
    private int width;
    private int height;
    private int depth;
    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }

}
