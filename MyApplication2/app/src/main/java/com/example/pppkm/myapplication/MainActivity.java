package com.example.pppkm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("math-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.sample_text);
        String message = "Rectangle's area = " + invokeMemberFuncFromNative(new Rectangle(4,5)) + '\n';
        Rectangle answer = createObjectFromNative(2);
        message += "Square's area = " + answer.getArea();
        tv.setText(message);
    }

    public native int invokeMemberFuncFromNative(Rectangle obj);

    public native Rectangle createObjectFromNative(int param);
}
