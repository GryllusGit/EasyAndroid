package com.wjj.easy.easyandroidHelper.module.main;

import android.util.Log;

import com.wjj.easy.easyandroid.mvp.domain.usecases.UseCase;
import com.wjj.easy.easyandroidHelper.common.base.BasePresenter;
import com.wjj.easy.easyandroidHelper.model.ListCouseInfo;
import com.wjj.easy.easyandroidHelper.module.main.domain.GetListTask;

import javax.inject.Inject;

/**
 * Created by wujiajun on 17/4/6.
 */

public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {

    @Inject
    GetListTask getListTask;

    @Inject
    public HomePresenter() {

    }

    @Override
    public void getList(String token,String cn) {
        Log.i("xx", "getList: "+"token:"+token+" cn:"+cn);
        getListTask.setCallback(new UseCase.Callback<ListCouseInfo>() {
            @Override
            public void success(ListCouseInfo list) {
                Log.i("xx", "success: ");
                getView().showList(list);
            }

            @Override
            public void fail() {
                Log.i("xx", "fail: ");
                getView().hiddenLoading();
            }
        });
        execute(getListTask);
    }
}
