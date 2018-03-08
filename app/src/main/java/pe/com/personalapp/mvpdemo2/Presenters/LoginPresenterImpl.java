package pe.com.personalapp.mvpdemo2.Presenters;
import pe.com.personalapp.mvpdemo2.Interfaces.OnLoginFinishListener;
import pe.com.personalapp.mvpdemo2.Interactors.LoginInteractorImpl;
import pe.com.personalapp.mvpdemo2.Interfaces.LoginInteractor;
import pe.com.personalapp.mvpdemo2.Interfaces.LoginPresenter;
import pe.com.personalapp.mvpdemo2.Interfaces.LoginView;

/**
 * Created by frank on 08/03/18.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishListener {

    private LoginView view;
    private LoginInteractor interactor;


    public LoginPresenterImpl(LoginView view){
        this.view = view;
        interactor = new LoginInteractorImpl();

    }


    @Override
    public void ValidarUsuario(String user, String password) {
        if(view != null){
            view.showProgress();
            interactor.ValidarUsuario(user,password,this);
        }
    }

    @Override
    public void userNammeError() {
        if(view != null){
            view.hideProgress();
            view.showErrorUser();
        }

    }

    @Override
    public void userPasswordError() {
        if(view != null){
            view.hideProgress();
            view.showErrorPassword();
        }

    }

    @Override
    public void ExitoOperacion() {
        if(view != null){
            view.hideProgress();
            view.navigateToHome();
        }

    }
}
