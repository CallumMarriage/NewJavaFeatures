module com.newJavaFeatures.eleven {
    requires com.newJavaFeatures.feature;
    provides com.newJavaFeatures.feature.JavaFeature with com.newJavaFeatures.eleven.JavaElevenFeatures;
    exports com.newJavaFeatures.eleven;
}