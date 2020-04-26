module com.newJavaFeatures.nine {
    requires java.net.http;
    requires com.newJavaFeatures.feature;
    provides com.newJavaFeatures.feature.JavaFeature with com.newJavaFeatures.nine.JavaNineFeatures;
    exports com.newJavaFeatures.nine;
}