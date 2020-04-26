package com.newJavaFeatures.fourteen;

import com.newJavaFeatures.feature.JavaFeature;

public class JavaFourteenFeatures implements JavaFeature {

    public void executeNewFeatures(){
        System.out.println("*******************************\n");
        System.out.println("Now Executing Java 14 Features\n");
        this.records();
        System.out.println("\n");
        this.patternMatchingInstanceOf();
        System.out.println("\n");
        System.out.println("*******************************\n");
    }

    private void records(){
        System.out.println("Java 14 added Records, an object that autogenerates " +
                "a lot of the boilerplate code and makes it easier to build shallow objects");
        record MyRecord(String name, int age){}
        MyRecord record = new MyRecord("Callum", 22);
        System.out.println(record.toString());
    }

    private void patternMatchingInstanceOf(){

        System.out.println("Java 14 also added pattern matching for instance of," +
                " you can now save the result of instance of without needing to cast the object");
        record MyRecord(String name, int age){}

        Object record = new MyRecord("Callum", 22);

        if(record instanceof MyRecord rec && rec.age == 22){
            System.out.println("You old bastard!");
        }
    }
}
