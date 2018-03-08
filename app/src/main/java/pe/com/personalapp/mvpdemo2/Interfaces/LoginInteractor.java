package pe.com.personalapp.mvpdemo2.Interfaces;

/**
 * Created by frank on 08/03/18.
 */

public interface LoginInteractor {

    void ValidarUsuario(String user, String pass, OnLoginFinishListener listener);

}
