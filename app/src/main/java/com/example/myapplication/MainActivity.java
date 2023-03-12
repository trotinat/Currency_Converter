package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button b;
    Spinner s;
    TextView txt1;
    TextView txt2;
    EditText et;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] money = { "Dollar", "Mad",
                "Euro" };
         b = findViewById(R.id.button);
         et=findViewById(R.id.n1);
         txt1=findViewById(R.id.txtview1);
         txt2=findViewById(R.id.txtview2);
         s = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, money);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.getSelectedItem().toString()=="Dollar"){
                    double USD = Double.parseDouble(et.getText().toString());
                    double MAD = USD*10.34;
                    double EUR=USD*0.94;

                    txt1.setText(MAD+" MAD");
                    txt2.setText(EUR+" EUR");
                }

                if(s.getSelectedItem().toString()=="Mad"){
                    double USD = Double.parseDouble(et.getText().toString());
                    double MAD = USD*0.097;
                    double EUR=USD*0.091;

                    txt1.setText(MAD+" USD");
                    txt2.setText(EUR+" EUR");
                }

                if(s.getSelectedItem().toString()=="Euro"){
                    double EUR = Double.parseDouble(et.getText().toString());
                    double MAD = EUR*11.01;
                    double USD=EUR*1.09;

                    txt1.setText(MAD+" MAD");
                    txt2.setText(USD+" USD");
                }
            }
        });
    }

}