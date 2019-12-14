package com.company.apioldversion;

import java.util.ArrayList;
import java.util.Set;

public class ApiTable {
    private String apiName;
    private Set<Integer> version;

    public ApiTable(String apiName, Set<Integer> version) {
        this.apiName = apiName;
        this.version = version;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public Set<Integer> getVersion() {
        return version;
    }

    public void setVersion(Set<Integer> version) {
        this.version = version;
    }

}
