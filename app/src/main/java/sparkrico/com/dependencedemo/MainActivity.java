package sparkrico.com.dependencedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sparkrico.com.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test test = new Test();
        test.x();
    }
}
