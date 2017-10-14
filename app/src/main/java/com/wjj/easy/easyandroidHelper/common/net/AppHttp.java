package com.wjj.easy.easyandroidHelper.common.net;

import com.wjj.easy.easyandroid.http.Http;
import com.wjj.easy.easyandroidHelper.model.ListCouseInfo;
import com.wjj.easy.easyandroidHelper.model.LoginInfo;
import com.wjj.easy.easyandroidHelper.model.base.BaseStatus;

import javax.inject.Inject;

import retrofit2.Call;

/**
 * Created by wujiajun on 17/4/5.
 */

public class AppHttp {

    private ApiService apiService;

    @Inject
    public AppHttp(ApiService apiService) {
        this.apiService = apiService;
    }

    public void getVerifyCode(String username, String pwd, final Http.HttpCallback<BaseStatus> callback) {
        Call<BaseStatus> call = apiService.getVerifyCode(username, pwd);
        call.enqueue(new Http.CallbackDefault(callback));
        call.request();
    }

    public void login(String username, String pwd, final Http.HttpCallback<LoginInfo> callback) {
        Call<LoginInfo> call = apiService.login(username, pwd);
        call.enqueue(new Http.CallbackDefault(callback));
        call.request();
    }

    public void getList(String token,String cn_normal, final Http.HttpCallback<ListCouseInfo> callback) {
        Call<ListCouseInfo> call = apiService.getList(token,cn_normal);
        call.enqueue(new Http.CallbackDefault(callback));
        call.request();
    }
}
