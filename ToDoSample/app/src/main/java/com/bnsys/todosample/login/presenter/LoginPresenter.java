package com.bnsys.todosample.login.presenter;

import com.bnsys.todosample.base.BasePresenterImpl;
import com.bnsys.todosample.login.LoginContract;
import com.bnsys.todosample.model.User;

public class LoginPresenter
        extends BasePresenterImpl<LoginContract.View>
        implements LoginContract.Presenter{

    LoginContract.View view;

    @Override
    public void loginProc(User user) {

    }

    @Override
    public void loginDone() {

    }
}
