package com.newJavaFeatures.thirteen;

import com.newJavaFeatures.feature.JavaFeature;

public class JavaThirteenFeatures implements JavaFeature {
    public void executeNewFeatures() {
        System.out.println("*******************************\n");
        System.out.println("Now Executing Java 13 Features\n");
        this.textBlock();
        System.out.println("\n");
        System.out.println("*******************************\n");
    }

    private void textBlock() {
        System.out.println("Java 13 added text blocks that do not require new lines or concat strings for formatting");
        String textBlock = """
                First line of the test block
                Second line
                Third line
                Final line""";
        System.out.println(textBlock);
    }
}
