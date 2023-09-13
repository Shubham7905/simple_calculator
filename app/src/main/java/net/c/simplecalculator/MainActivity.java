package net.c.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clearBtn = findViewById(R.id.clear);
        Button addBtn = findViewById(R.id.add);
        Button subtractBtn = findViewById(R.id.subtract);
        Button multiplyBtn = findViewById(R.id.multiply);
        Button divideBtn = findViewById(R.id.divide);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);

        result.setEnabled(false);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.setText(null);
                input2.setText(null);
                result.setText(null);
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float inputTxt1 = Float.parseFloat(input1.getText().toString());
                    float inputTxt2 = Float.parseFloat(input2.getText().toString());

                    String resultTxt = String.valueOf(inputTxt1 + inputTxt2);

                    result.setText(resultTxt);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float inputTxt1 = Float.parseFloat(input1.getText().toString());
                    float inputTxt2 = Float.parseFloat(input2.getText().toString());

                    String resultTxt = String.valueOf(inputTxt1 - inputTxt2);

                    result.setText(resultTxt);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float inputTxt1 = Float.parseFloat(input1.getText().toString());
                    float inputTxt2 = Float.parseFloat(input2.getText().toString());

                    String resultTxt = String.valueOf(inputTxt1 * inputTxt2);

                    result.setText(resultTxt);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float inputTxt1 = Float.parseFloat(input1.getText().toString());
                    float inputTxt2 = Float.parseFloat(input2.getText().toString());

                    String resultTxt = String.valueOf(inputTxt1 / inputTxt2);

                    result.setText(resultTxt);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}