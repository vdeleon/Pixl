package tk.pixlapp.models;

import com.squareup.moshi.Json;

public class User {

    @Json(name = "total_photos")
    private int totalPhotos;

    @Json(name = "twitter_username")
    private String twitterUsername;

    @Json(name = "last_name")
    private String lastName;

    @Json(name = "bio")
    private String bio;

    @Json(name = "total_likes")
    private int totalLikes;

    @Json(name = "portfolio_url")
    private String portfolioUrl;

    @Json(name = "profile_image")
    private ProfileImage profileImage;

    @Json(name = "updated_at")
    private String updatedAt;

    @Json(name = "name")
    private String name;

    @Json(name = "location")
    private String location;

    @Json(name = "links")
    private Links links;

    @Json(name = "total_collections")
    private int totalCollections;

    @Json(name = "id")
    private String id;

    @Json(name = "first_name")
    private String firstName;

    @Json(name = "instagram_username")
    private String instagramUsername;

    @Json(name = "username")
    private String username;

    public int getTotalPhotos() {
        return totalPhotos;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public String getPortfolioUrl() {
        return portfolioUrl;
    }

    public ProfileImage getProfileImage() {
        return profileImage;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Links getLinks() {
        return links;
    }

    public int getTotalCollections() {
        return totalCollections;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getInstagramUsername() {
        return instagramUsername;
    }

    public String getUsername() {
        return username;
    }
}