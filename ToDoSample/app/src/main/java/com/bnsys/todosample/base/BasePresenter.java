package com.bnsys.todosample.base;

public interface BasePresenter<T> {

    void setView(T View);
    void removeView();


}
