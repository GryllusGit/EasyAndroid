package com.wjj.easy.easyandroidHelper.module.main;

import com.wjj.easy.easyandroid.mvp.EasyBasePresenter;
import com.wjj.easy.easyandroidHelper.common.base.BaseView;
import com.wjj.easy.easyandroidHelper.model.ListCouseInfo;

/**
 * Created by wujiajun on 17/4/6.
 */
public interface HomeContract {

    interface View extends BaseView {
        void showList(ListCouseInfo list);
    }

    interface Presenter extends EasyBasePresenter<View> {
        void getList(String token,String cn);
    }

}
