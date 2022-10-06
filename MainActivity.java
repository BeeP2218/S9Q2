package com.example.s9q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    TextView t1,t2,t3,t4;
    RadioGroup rgb1;
    RadioButton rb1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.edittext);
        e2=(EditText) findViewById(R.id.edittext2);
        e3=(EditText) findViewById(R.id.edittext3);
        e4=(EditText) findViewById(R.id.edittext4);
        t1=(TextView) findViewById(R.id.textview);
        t2=(TextView) findViewById(R.id.textview2);
        t3=(TextView) findViewById(R.id.textview3);
        t4=(TextView) findViewById(R.id.textview4);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        rgb1=(RadioGroup) findViewById(R.id.radiogroup1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sel_id= rgb1.getCheckedRadioButtonId();
                StringBuilder sb =new StringBuilder();

                sb.append(e1.getText().toString());
                sb.append(e2.getText().toString());
                sb.append(e3.getText().toString());
                sb.append(e4.getText().toString());

                rb1=(RadioButton) findViewById(sel_id);
                if(sel_id==-1)
                    Toast.makeText(MainActivity.this, "NOTHING SELECTED", Toast.LENGTH_SHORT).show();
                else
                    sb.append(rb1.getText());

                String res=String.valueOf(sb);
                Toast.makeText(MainActivity.this,res, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,sb.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                e1.getText().clear();
                e2.getText().clear();
                e3.getText().clear();
                e4.getText().clear();
            }
        });
    }
}