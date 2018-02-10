package com.example.jtmoc.volosatoechmo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void crypt(View view) {
        EditText mess = (EditText) findViewById(R.id.editText5);
        EditText cryp = (EditText) findViewById(R.id.editText4);
        TextView cMess = (TextView) findViewById(R.id.cMess);
        String s1 = mess.getText().toString().toLowerCase();
        String s2 = cryp.getText().toString().toLowerCase();
        String s3 = " ";
        char x;
        for (int i = 0; i < s1.length(); i++) {
            x = (char) (s1.charAt(i) + s2.charAt(i % s2.length()) - 'a' + 1);
            if (x > 'z') x = (char) ('a' + (x - 'z'));
            s3 += String.valueOf(x);
        }
        cMess.setText(s3);
    }
}
