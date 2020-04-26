package com.newJavaFeatures.twelve;

import com.newJavaFeatures.feature.JavaFeature;

public class JavaTwelveFeatures implements JavaFeature {
    public void executeNewFeatures() {
        System.out.println("*******************************\n");
        System.out.println("Now Executing Java 12 Features\n");
        this.switchExpressions();
        System.out.println("\n");
        System.out.println("*******************************\n");
    }

    private void switchExpressions(){
        System.out.println("Java 12 added the switch expression");
        int i = 10;
        // No longer need the default case or a return statement.
        // Having multiple cases lead to single result is much cleaner now.
        switch (i) {
            case 10,8,6,2 -> System.out.println("Even");
            case 9,7,5,3,1 -> System.out.println("Odd");
        }
    }

    //TODO Add teeing example
}
