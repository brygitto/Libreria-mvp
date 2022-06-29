package com.byvillamizar.bibliotecataller.Presenter;
import android.content.Context;

import com.byvillamizar.bibliotecataller.Interfaces.LoginModel;
import com.byvillamizar.bibliotecataller.LoginModelImpl;
import com.byvillamizar.bibliotecataller.Presenter.Interface.LoginPresenter;
import com.byvillamizar.bibliotecataller.View.ViewInterface;


public class LoginPresenterImpl implements LoginPresenter {
    private ViewInterface view;
    private LoginModel loginModel;

    public LoginPresenterImpl(Context context, ViewInterface view) {
        this.view = view;
        this.loginModel = new LoginModelImpl(context, this);
    }

    @Override
    public void showLogin() {
        if (view != null) {
            view.showLogin();
        }
    }

    @Override
    public void valideCredentials(String mail, String password, Context context) {
        loginModel.login(mail, password, context);

    }


    @Override
    public void message(String message) {
        view.message(message);

    }

    @Override
    public void navigateToClass(String nameClass) {
        if (view != null) {
            view.navigateToActivity(nameClass);
        }
    }
}
