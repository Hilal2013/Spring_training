package com.cydeo.model;

import lombok.Data;

@Data
public class Comment {//under model package//this class has a dependency?No this doesnt require any injecetion
    // second one I need to check->if anybody Comment/this class injected somewhere
    // means->go to other classes see other classes put this class or not.=>no
    //so no component
    private String author;
    private String text;
}
