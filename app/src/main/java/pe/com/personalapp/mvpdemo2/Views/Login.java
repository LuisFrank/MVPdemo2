package pe.com.personalapp.mvpdemo2.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import pe.com.personalapp.mvpdemo2.Interfaces.LoginPresenter;
import pe.com.personalapp.mvpdemo2.Interfaces.LoginView;
import pe.com.personalapp.mvpdemo2.Presenters.LoginPresenterImpl;
import pe.com.personalapp.mvpdemo2.R;

public class Login extends AppCompatActivity implements LoginView {

    private EditText user,password;
    private ProgressBar progressBar;

    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        user = (EditText) findViewById(R.id.etUserName) ;
        password = (EditText) findViewById(R.id.etPassword);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showErrorUser() {
        user.setError("Campo Obligatorio");
    }

    @Override
    public void showErrorPassword() {
        password.setError("Campo Obligatorio");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this,home.class));
    }

    public void validacion(View view) {

        presenter.ValidarUsuario(user.getText().toString(),password.getText().toString());
    }
}
