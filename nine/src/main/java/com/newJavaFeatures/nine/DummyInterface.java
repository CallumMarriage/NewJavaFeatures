package com.newJavaFeatures.nine;

public interface DummyInterface {

    private static void privateMethod(){
        System.out.println("Very private!");
    }

    default void check(){
        privateMethod();
    }

    void boringPublicMethod();
}
