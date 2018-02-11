package com.example.jtmoc.volosatoechmo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        char z;
        for (int i = 0; i < s1.length(); i++) {
            if (' ' != s1.charAt(i)) {
                if (s2.charAt(i % s2.length()) != ' ')
                    z = s2.charAt(i % s2.length());
                else
                    z = 'a' - 1;
                x = (char) (s1.charAt(i) + z - 'a' + 1);
                if (x > 'z') x -= 26;
            } else
                x = ' ';
            s3 += String.valueOf(x);
        }
        cMess.setText(s3);
    }

    public void CopyVig(View view) {
        ClipboardManager clipboard = (ClipboardManager)
                getSystemService(Context.CLIPBOARD_SERVICE);
        TextView cMess = (TextView) findViewById(R.id.cMess);
        ClipData clip = ClipData.newPlainText("Crypted message", cMess.getText().toString());
        clipboard.setPrimaryClip(clip);
    }
}
