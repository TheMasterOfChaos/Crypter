package com.example.jtmoc.volosatoechmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Ceaser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceaser);
    }

    public void crypt(View view) {
        EditText mess = (EditText) findViewById(R.id.editText10);
        Spinner spin = (Spinner) findViewById(R.id.spin);
        TextView cMess = (TextView) findViewById(R.id.ceaMess);
        String s1 = mess.getText().toString().toLowerCase();
        char z = (char) (spin.getSelectedItemPosition());
        String s3 = " ";
        char x;
        for (int i = 0; i < s1.length(); i++) {
            x = (char) (s1.charAt(i) + z);
            if (x > 'z') x -= 26;
            s3 += String.valueOf(x);
        }
        cMess.setText(s3);
    }
}
