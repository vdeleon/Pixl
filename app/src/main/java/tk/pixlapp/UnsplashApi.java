package tk.pixlapp;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class UnsplashApi {
    private static String CLIENT_ID = "c94869b36aa272dd62dfaeefed769d4115fb3189a9d1ec88ed457207747be626";
    private static String BASE_URL = "https://api.unsplash.com";

    public static UnsplashService getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(getClient())
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        return retrofit.create(UnsplashService.class);
    }

    private static OkHttpClient getClient() {

        return new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    Request request = chain.request();
                    HttpUrl url = request.url();
                    url = url.newBuilder()
                            .addQueryParameter("client_id", CLIENT_ID)
                            .build();
                    request = request.newBuilder()
                            .url(url)
                            .build();
                    return chain.proceed(request);
                })
                .retryOnConnectionFailure(true)
                .build();
    }

}
