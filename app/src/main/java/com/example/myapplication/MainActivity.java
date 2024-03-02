package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText text1,text2;
    private Button sumButton,subButton;
    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (EditText) findViewById(R.id.edit1);
        text2 = (EditText) findViewById(R.id.edit2);

        sumButton = (Button) findViewById(R.id.sumBtn);
        subButton = (Button) findViewById(R.id.subBtn);

        textView1 = (TextView) findViewById(R.id.result);

        sumButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        textView1.setOnClickListener(this);

}

    @Override
    public void onClick(View v) {
            String number1 =  text1.getText().toString();
            String number2 =  text2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if(v.getId()==R.id.sumBtn){
                double sum = num1+num2;
                textView1.setText("Result: "+sum);
            }
            else if(v.getId()==R.id.subBtn){
                double sub = num1-num2;
                textView1.setText("Result: "+sub);
            }
    }
}