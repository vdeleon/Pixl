package tk.pixlapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tk.pixlapp.models.Photo;

public interface UnsplashService {

    @GET("photos")
    Call<List<Photo>> getPhotos(@Query("page") int page, @Query("per_page") int perPage);

}
