package com.newJavaFeatures.eleven;

import com.newJavaFeatures.feature.JavaFeature;

import java.util.Optional;

public class JavaElevenFeatures implements JavaFeature {

    public void executeNewFeatures(){
        System.out.println("*******************************\n");
        System.out.println("Now Executing Java 11 Features\n");
        this.stringToLines();
        System.out.println("\n");
        this.stringRepeat();
        System.out.println("\n");
        this.optionalIsEmpty();
        System.out.println("\n");
        System.out.println("*******************************\n");
    }

    private void stringToLines(){
        System.out.println("Java 11 added the feature of converting a block of text by lines straight a stream");
        String lines = "Here is line one\n" +
                "Here is line two\n" +
                "Here is line three";
        lines.lines().forEach(val -> System.out.println(val + " -line"));
    }

    private void stringRepeat(){
        System.out.println("Java 11 added the repeat method to the String object");
        String hello = "Hello! ";
        System.out.println(hello.repeat(10));
    }

    private void optionalIsEmpty(){
        System.out.println("Java 11 has added optional is empty method!!!!");
        Optional<String> optional = Optional.empty();

        if(optional.isEmpty()){
            System.out.println("Finally no more negating is present!");
        }
    }
}
