package com.wjj.easy.easyandroidHelper.module.login.domain;

import com.wjj.easy.easyandroid.http.Http;
import com.wjj.easy.easyandroid.mvp.domain.usecases.AbstractUseCase;
import com.wjj.easy.easyandroidHelper.common.net.AppHttp;
import com.wjj.easy.easyandroidHelper.model.LoginInfo;

import javax.inject.Inject;

/**
 * 登录任务
 *
 * @author wujiajun
 */

public class LoginTask extends AbstractUseCase {

    String publicKey = "11";

    String userName;
    String pwd;
    String verifyCode;

    @Inject
    AppHttp appHttp;

    @Inject
    public LoginTask() {
    }

    @Override
    public void run() {
        appHttp.login(userName,pwd, new Http.HttpCallback<LoginInfo>() {
            @Override
            public void onResponse(LoginInfo baseStatus) {
                getCallback().success(baseStatus);
            }

            @Override
            public void onFailure(Throwable t) {
                getCallback().fail();
            }
        });
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

}
