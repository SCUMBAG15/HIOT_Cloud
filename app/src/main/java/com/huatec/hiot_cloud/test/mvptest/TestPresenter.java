package com.huatec.hiot_cloud.test.mvptest;


import com.huatec.hiot_cloud.test.mvptest.model.User;

public class TestPresenter {
    private TestView view;

    public TestPresenter(TestView view) {
        this.view = view;
    }

    public void login(User user) {
        if ("liuyibing".equals(user.getUserName()) && "123456".equals(user.getPassword())) {
            view.showMessage("登录成功");
        } else {
            view.showMessage("登录失败");
        }
    }
}



