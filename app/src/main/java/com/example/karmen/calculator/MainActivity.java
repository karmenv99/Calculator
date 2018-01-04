package com.example.karmen.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button a, s, m, d;
    EditText no1, no2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.button);
        s=findViewById(R.id.button2);
        m=findViewById(R.id.button3);
        d=findViewById(R.id.button4);
        no1=findViewById(R.id.editText);
        no2=findViewById(R.id.editText2);
        res=findViewById(R.id.editText3);

    }
public void add(View view)
{ String e1=no1.getText().toString();
String e2=no2.getText().toString();

double d1, d2;

d1=Double.parseDouble(no1);
d2=Double.parseDouble(no2);

double result=d1+d2;
res.setText(result+"");

}
public void subtract(View view)
{ String e1=no1.getText().toString();
    String e2=no2.getText().toString();

    double d1, d2;

    d1=Double.parseDouble(no1);
    d2=Double.parseDouble(no2);

    double result=d1-d2;
    res.setText(result+"");

}
public void multiply(View view)
{ String e1=no1.getText().toString();
    String e2=no2.getText().toString();

    double d1, d2;

    d1=Double.parseDouble(no1);
    d2=Double.parseDouble(no2);

    double result=d1*d2;
    res.setText(result+"");

}
public void divide(View view)
{ String e1=no1.getText().toString();
    String e2=no2.getText().toString();

    double d1, d2;

    d1=Double.parseDouble(no1);
    d2=Double.parseDouble(no2);

    double result=d1/d2;
    res.setText(result+"");

}
}
