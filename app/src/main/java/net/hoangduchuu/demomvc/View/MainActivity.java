package net.hoangduchuu.demomvc.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import net.hoangduchuu.demomvc.Controller.MainActivityController;
import net.hoangduchuu.demomvc.R;

public class MainActivity extends AppCompatActivity {
    MainActivityController mainActivityController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityController = new MainActivityController();

        Toast.makeText(this, "" + mainActivityController.getInfoUser(), Toast.LENGTH_SHORT).show();
    }
}
