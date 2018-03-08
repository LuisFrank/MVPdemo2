package pe.com.personalapp.mvpdemo2.Interfaces;

/**
 * Created by frank on 08/03/18.
 */

public interface LoginView {

    void showProgress();
    void hideProgress();

    void showErrorUser();
    void showErrorPassword();

    void navigateToHome();

}
