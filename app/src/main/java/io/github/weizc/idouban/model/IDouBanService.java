package io.github.weizc.idouban.model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Vzc on 2017/5/22.
 */

public interface IDouBanService {
    String BASE_URL = "https://api.douban.com/v2/";

    @GET("movie/in_theaters")
    Call<HotMoviesData> searchHotMovesData();
}
