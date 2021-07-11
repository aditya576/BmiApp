package com.example.bmiapk;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }
    public void calcbmi(View view)
    {
        EditText et1=(EditText)findViewById(R.id.edittext1);
        EditText et2=(EditText)findViewById(R.id.edittext2);
        Button b1=(Button) findViewById(R.id.button2);
        TextView t1=(TextView)findViewById(R.id.textView1);
        TextView t2=(TextView)findViewById(R.id.textview2);
        double height=0,weight=0,bmi=0;
        String msg=" ";
        weight=Double.parseDouble(et1.getText().toString());
        height=Double.parseDouble(et2.getText().toString());
        bmi=height*height;
        bmi=weight/bmi;
        t1.setText(String.valueOf(bmi));
        if(bmi<18.5)
            msg="UNDERWEIGHT";
        else if(bmi>=18.5 && bmi<25)
            msg="NORMAL";
        else
            msg="OVERWEIGHT";
        t2.setText(msg);
    }
}
