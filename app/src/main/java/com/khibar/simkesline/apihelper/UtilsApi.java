package com.khibar.simkesline.apihelper;

public class UtilsApi {


    // 10.0.2.2 ini adalah localhost.
    public static final String BASE_URL_API = "http://192.168.1.11/SimasKes/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
