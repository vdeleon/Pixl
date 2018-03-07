package tk.pixlapp.models;

import com.squareup.moshi.Json;

public class Urls {

    @Json(name = "small")
    private String small;

    @Json(name = "thumb")
    private String thumb;

    @Json(name = "raw")
    private String raw;

    @Json(name = "regular")
    private String regular;

    @Json(name = "full")
    private String full;

    public String getSmall() {
        return small;
    }

    public String getThumb() {
        return thumb;
    }

    public String getRaw() {
        return raw;
    }

    public String getRegular() {
        return regular;
    }

    public String getFull() {
        return full;
    }
}