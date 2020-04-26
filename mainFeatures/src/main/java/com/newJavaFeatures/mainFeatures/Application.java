package com.newJavaFeatures.mainFeatures;

import com.newJavaFeatures.eleven.JavaElevenFeatures;
import com.newJavaFeatures.feature.JavaFeature;
import com.newJavaFeatures.fourteen.JavaFourteenFeatures;
import com.newJavaFeatures.nine.JavaNineFeatures;
import com.newJavaFeatures.ten.JavaTenFeatures;
import com.newJavaFeatures.thirteen.JavaThirteenFeatures;
import com.newJavaFeatures.twelve.JavaTwelveFeatures;

import java.util.List;

public class Application {

    public static void main(String[] args){
        List<JavaFeature> features = List.of(new JavaNineFeatures(),
                new JavaTenFeatures(),
                new JavaElevenFeatures(),
                new JavaTwelveFeatures(),
                new JavaThirteenFeatures(),
                new JavaFourteenFeatures()
                );
        features.forEach(JavaFeature::executeNewFeatures);
    }
}
