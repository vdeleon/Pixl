package tk.pixlapp;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import tk.pixlapp.models.Photo;

public class PhotoDataSource extends PageKeyedDataSource<Integer, Photo> {
    public final MutableLiveData<DataLoadState> loadState;
    private String TAG = "PhotoDataSource";
    private UnsplashService mService;

    public PhotoDataSource() {
        loadState = new MutableLiveData<>();
        mService = UnsplashApi.getService();
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, Photo> callback) {
        loadState.postValue(DataLoadState.LOADING);
        Call<List<Photo>> request = mService.getPhotos(1, params.requestedLoadSize);
        Response<List<Photo>> response;
        try {
            response = request.execute();
            if (response.code() == 200 && response.body() != null) {
                callback.onResult(response.body(), 1, 2);
            } else {
                callback.onResult(new ArrayList<>(), 1, 2);
            }
            loadState.postValue(DataLoadState.SUCCESS);
        } catch (IOException ioe) {
            Log.e(TAG, ioe.getLocalizedMessage());
            loadState.postValue(DataLoadState.FAILED);
        }
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Photo> callback) {
        loadState.postValue(DataLoadState.LOADING);
        Call<List<Photo>> request = mService.getPhotos(params.key, params.requestedLoadSize);
        Response<List<Photo>> response;
        try {
            response = request.execute();
            if (response.code() == 200 && response.body() != null) {
                Integer adjKey = (params.key > 1) ? params.key - 1 : null;
                callback.onResult(response.body(), adjKey);
            } else {
                callback.onResult(new ArrayList<>(), params.key - 1);
            }
            loadState.postValue(DataLoadState.SUCCESS);
        } catch (IOException ioe) {
            Log.e(TAG, ioe.getLocalizedMessage());
            loadState.postValue(DataLoadState.FAILED);
        }
    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Photo> callback) {
        loadState.postValue(DataLoadState.LOADING);
        Call<List<Photo>> request = mService.getPhotos(params.key, params.requestedLoadSize);
        Response<List<Photo>> response;
        try {
            response = request.execute();
            if (response.code() == 200 && response.body() != null) {
                callback.onResult(response.body(), params.key + 1);
            } else {
                callback.onResult(new ArrayList<>(), params.key + 1);
            }
            loadState.postValue(DataLoadState.SUCCESS);
        } catch (IOException ioe) {
            Log.e(TAG, ioe.getLocalizedMessage());
            loadState.postValue(DataLoadState.FAILED);
        }
    }
}
