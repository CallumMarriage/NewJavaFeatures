module com.newJavaFeatures.ten {
    requires com.newJavaFeatures.feature;
    provides com.newJavaFeatures.feature.JavaFeature with com.newJavaFeatures.ten.JavaTenFeatures;
    exports com.newJavaFeatures.ten;
}