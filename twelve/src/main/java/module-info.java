module com.newJavaFeatures.twelve {
    requires com.newJavaFeatures.feature;
    provides com.newJavaFeatures.feature.JavaFeature with com.newJavaFeatures.twelve.JavaTwelveFeatures;
    exports com.newJavaFeatures.twelve;
}