package sheepm.aopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import aop.Cost;

public class MainActivity extends AppCompatActivity {

    @Cost
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
