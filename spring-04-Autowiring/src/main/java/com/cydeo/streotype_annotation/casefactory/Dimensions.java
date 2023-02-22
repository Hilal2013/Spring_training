package com.cydeo.streotype_annotation.casefactory;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
public class Dimensions {//AllArgConstructor(int int int) doesnt accept primitive remove allargconstructor
    private int width;
    private int height;
    private int depth;
    public Dimensions() {
        this.width=10;
        this.height=30;
        this.depth=40;
    }

    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }

}
