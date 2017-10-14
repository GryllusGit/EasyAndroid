package com.wjj.easy.easyandroidHelper.model;

/**
 * Created by zhaotun on 2016/12/20.
 */

public class LoginInfo  {


    /**
     * code : 1000
     * info : 操作成功
     * result : {"nim_info":{"nim_id":"","nim_token":"","tx_sign":""},"user_info":{"role":1,"user_id":5010,"user_name":"长生","user_token":"46bce8007b114bd9bd957a28069aa5d6"},"jpush_info":{"alias":"JG_TEST105010"}}
     */

    public String code;
    public String info;
    public ResultBean result;

    public static class ResultBean {
        /**
         * nim_info : {"nim_id":"","nim_token":"","tx_sign":""}
         * user_info : {"role":1,"user_id":5010,"user_name":"长生","user_token":"46bce8007b114bd9bd957a28069aa5d6"}
         * jpush_info : {"alias":"JG_TEST105010"}
         */

        public NimInfoBean nim_info;
        public UserInfoBean user_info;
        public JpushInfoBean jpush_info;

        public static class NimInfoBean {
            /**
             * nim_id :
             * nim_token :
             * tx_sign :
             */

            public String nim_id;
            public String nim_token;
            public String tx_sign;
        }

        public static class UserInfoBean {
            /**
             * role : 1
             * user_id : 5010
             * user_name : 长生
             * user_token : 46bce8007b114bd9bd957a28069aa5d6
             */

            public int role;
            public int user_id;
            public String user_name;
            public String user_token;

            @Override
            public String toString() {
                return "UserInfoBean{" +
                        "role=" + role +
                        ", user_id=" + user_id +
                        ", user_name='" + user_name + '\'' +
                        ", user_token='" + user_token + '\'' +
                        '}';
            }
        }

        public static class JpushInfoBean {
            /**
             * alias : JG_TEST105010
             */

            public String alias;
        }
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                ", result=" + result +
                '}';
    }
}
