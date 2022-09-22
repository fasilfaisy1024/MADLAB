package com.example.login;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText x,y;
    Button b;
    String o,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=(EditText)findViewById(R.id.uname);
        y=(EditText)findViewById(R.id.pwd);
        b=(Button)findViewById(R.id.login);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String m="fasil";
        String n="nopassword";
        o=x.getText().toString();
        p=y.getText().toString();
        if(o.equals(m) && p.equals(n)) {
            Toast.makeText(this, "Successfull login", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this,"Login failed",Toast.LENGTH_SHORT).show();
        }

    }
}
