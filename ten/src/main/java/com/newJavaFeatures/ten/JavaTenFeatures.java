package com.newJavaFeatures.ten;

import com.newJavaFeatures.feature.JavaFeature;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class JavaTenFeatures implements JavaFeature {
    public void executeNewFeatures() {
        System.out.println("*******************************\n");
        System.out.println("Now Executing Java 10 Features\n");
        this.streamToUnmodifiableList();
        System.out.println("\n");
        this.streamOptionalElseThrow();
        System.out.println("\n");
        this.var();
        System.out.println("\n");
        System.out.println("*******************************\n");

    }

    private void var(){
        System.out.println("Java 10 added the dynamic casting to vars");
        var i = "Variable";
        System.out.println(i + " is a " + i.getClass());
    }

    private void streamToUnmodifiableList() {
        System.out.println("Java 10 allows you to stream a list into an unmodifiable list");
        List<Integer> evenList = List.of(1, 2, 3).stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        try {
            evenList.add(3);
        } catch (UnsupportedOperationException e) {
            System.out.println("An error wss thrown when I attempt to add to an unmodifiable list");
        }
    }

    private void streamOptionalElseThrow() {
        System.out.println("Java 10 also added the method or else throw for optionals");
        try {
            List.of(1, 5).stream()
                    .filter(i -> i % 2 == 0)
                    .findFirst()
                    .orElseThrow();

        } catch (NoSuchElementException e) {
            System.out.println("An error is thrown if no element is found!");
        }
    }
}
