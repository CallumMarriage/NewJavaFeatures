module com.newJavaFeatures.thirteen {
    requires com.newJavaFeatures.feature;
    provides com.newJavaFeatures.feature.JavaFeature with com.newJavaFeatures.thirteen.JavaThirteenFeatures;
    exports com.newJavaFeatures.thirteen;
}