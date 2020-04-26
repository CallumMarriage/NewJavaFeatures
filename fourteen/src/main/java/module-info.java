module com.newJavaFeatures.fourteen {
    requires com.newJavaFeatures.feature;
    provides com.newJavaFeatures.feature.JavaFeature with com.newJavaFeatures.fourteen.JavaFourteenFeatures;
    exports com.newJavaFeatures.fourteen;
}