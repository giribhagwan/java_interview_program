package com.company.apioldversion;

public class AppApiData {

    private String appName;
    private String apiName;
    private String apiVersion;

    public AppApiData(String appName, String apiName, String apiVersion) {
        this.appName = appName;
        this.apiName = apiName;
        this.apiVersion = apiVersion;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @Override
    public String toString() {
        return "AppApiData{" +
                "appName='" + appName + '\'' +
                ", apiName='" + apiName + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                '}';
    }
}
