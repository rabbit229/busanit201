package com.bnsys.todosample.logic;

import com.bnsys.todosample.model.User;

public interface DataSource {

    public void setRepository(LoginRepository repository);
    public void loginProc(User user);
}
