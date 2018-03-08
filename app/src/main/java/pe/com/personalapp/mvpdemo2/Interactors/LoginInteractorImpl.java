package pe.com.personalapp.mvpdemo2.Interactors;


import android.os.Handler;

import pe.com.personalapp.mvpdemo2.Interfaces.LoginInteractor;
import pe.com.personalapp.mvpdemo2.Interfaces.OnLoginFinishListener;

/**
 * Created by frank on 08/03/18.
 */

public class LoginInteractorImpl  implements LoginInteractor{
    @Override
    public void ValidarUsuario(final String user, final String pass, final OnLoginFinishListener listener) {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!user.equals("") && !pass.equals("")){

                    listener.ExitoOperacion();
                }else{
                    if (user.equals("")){
                        listener.userNammeError();
                    }else if  (pass.equals("")){
                        listener.userPasswordError();
                    }


                }
            }
        },2000);
    }
}
