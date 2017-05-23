package io.github.weizc.idouban.model;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Vzc on 2017/5/22.
 */

public class IDouBanManager {
    private static IDouBanService iDouBanService;
    private IDouBanManager(){}

    public static IDouBanService getiDouBanService() {
        if (iDouBanService ==null){
            synchronized (IDouBanManager.class){
                if (iDouBanService ==null) {
                    Retrofit retrofit = createRetrofit();
                    iDouBanService = retrofit.create(IDouBanService.class);
                }
            }
        }
        return iDouBanService;
    }
    private static Retrofit createRetrofit(){
        OkHttpClient httpClient;
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient = new OkHttpClient.Builder().addInterceptor(logging).build();

        return new Retrofit.Builder()
                .baseUrl(IDouBanService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())//Json格式转化
                .client(httpClient)//拦截器
                .build();
    }
}
