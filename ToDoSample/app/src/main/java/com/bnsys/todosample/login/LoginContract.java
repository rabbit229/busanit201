package com.bnsys.todosample.login;

import com.bnsys.todosample.base.BasePresenter;
import com.bnsys.todosample.base.BaseView;
import com.bnsys.todosample.model.User;

public class LoginContract {

    public interface View extends BaseView {
        void loginDone();
    }

    public interface Presenter extends BasePresenter<View> {
        void loginProc(User user);
        void loginDone();
    }
}
