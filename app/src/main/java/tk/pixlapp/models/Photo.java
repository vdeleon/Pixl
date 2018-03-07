package tk.pixlapp.models;

import com.squareup.moshi.Json;

import java.util.List;

public class Photo {
    private transient String titleColor;
    private transient String bodyColor;
    private transient String footerColor;
    @Json(name = "current_user_collections")
    private List<Object> currentUserCollections;
    @Json(name = "color")
    private String color;
    @Json(name = "created_at")
    private String createdAt;
    @Json(name = "description")
    private Object description;
    @Json(name = "sponsored")
    private boolean sponsored;
    @Json(name = "liked_by_user")
    private boolean likedByUser;
    @Json(name = "urls")
    private Urls urls;
    @Json(name = "updated_at")
    private String updatedAt;
    @Json(name = "width")
    private int width;
    @Json(name = "links")
    private Links links;
    @Json(name = "id")
    private String id;
    @Json(name = "categories")
    private List<Object> categories;
    @Json(name = "user")
    private User user;
    @Json(name = "height")
    private int height;
    @Json(name = "likes")
    private int likes;

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getFooterColor() {
        return footerColor;
    }

    public void setFooterColor(String footerColor) {
        this.footerColor = footerColor;
    }

    public List<Object> getCurrentUserCollections() {
        return currentUserCollections;
    }

    public String getColor() {
        return color;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Object getDescription() {
        return description;
    }

    public boolean isSponsored() {
        return sponsored;
    }

    public boolean isLikedByUser() {
        return likedByUser;
    }

    public Urls getUrls() {
        return urls;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public int getWidth() {
        return width;
    }

    public Links getLinks() {
        return links;
    }

    public String getId() {
        return id;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public User getUser() {
        return user;
    }

    public int getHeight() {
        return height;
    }

    public int getLikes() {
        return likes;
    }
}