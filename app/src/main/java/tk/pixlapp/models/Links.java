package tk.pixlapp.models;

import com.squareup.moshi.Json;

public class Links {

    @Json(name = "followers")
    private String followers;

    @Json(name = "portfolio")
    private String portfolio;

    @Json(name = "following")
    private String following;

    @Json(name = "self")
    private String self;

    @Json(name = "html")
    private String html;

    @Json(name = "photos")
    private String photos;

    @Json(name = "likes")
    private String likes;

    public String getFollowers() {
        return followers;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getFollowing() {
        return following;
    }

    public String getSelf() {
        return self;
    }

    public String getHtml() {
        return html;
    }

    public String getPhotos() {
        return photos;
    }

    public String getLikes() {
        return likes;
    }
}