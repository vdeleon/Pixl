package tk.pixlapp.models;

import com.squareup.moshi.Json;

public class ProfileImage {

    @Json(name = "small")
    private String small;

    @Json(name = "large")
    private String large;

    @Json(name = "medium")
    private String medium;

    public String getSmall() {
        return small;
    }

    public String getLarge() {
        return large;
    }

    public String getMedium() {
        return medium;
    }
}