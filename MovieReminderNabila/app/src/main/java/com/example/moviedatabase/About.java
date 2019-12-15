package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

public class About {

    @SerializedName("version")
    private String version;
    @SerializedName("serverTime")
    private String serverTime;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

}
