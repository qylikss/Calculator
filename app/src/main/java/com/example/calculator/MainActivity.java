package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txt_result;
    private Button button_reset;
    private Button button_minus;
    private Button button_plus;
    private Button button_ymn;
    private Button button_del;
    private Button button_proc;
    private Button button_znak;
    private Button button_equels;
    private Button button_point;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, procent, znak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_result = (TextView)findViewById(R.id.txt_result);
        button_reset = (Button) findViewById(R.id.button_reset);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_ymn = (Button) findViewById(R.id.button_ymn);
        button_del = (Button) findViewById(R.id.button_del);
        button_proc = (Button) findViewById(R.id.button_proc);
        button_znak = (Button) findViewById(R.id.button_znak);
        button_equels = (Button) findViewById(R.id.button_equels);
        button_point = (Button) findViewById(R.id.button_point);
        button_0 = (Button) findViewById(R.id.button_0);
        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText("");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "0");
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "1");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "2");
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "3");
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "4");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "5");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "5");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + "9");
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_result.setText(txt_result.getText() + ".");
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_result == null) {
                    txt_result.setText("");
                } else {
                    mValueOne = Float.parseFloat(txt_result.getText() + "");
                    crunchifyAddition = true;
                    txt_result.setText(null);
                }
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_result == null) {
                    txt_result.setText("");
                } else {
                    mValueOne = Float.parseFloat(txt_result.getText() + "");
                    mSubtract = true;
                    txt_result.setText(null);
                }
            }
        });
        button_ymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_result == null) {
                    txt_result.setText("");
                } else {
                    mValueOne = Float.parseFloat(txt_result.getText() + "");
                    crunchifyMultiplication = true;
                    txt_result.setText(null);
                }
            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_result == null) {
                    txt_result.setText("");
                } else {
                    mValueOne = Float.parseFloat(txt_result.getText() + "");
                    crunchifyDivision = true;
                    txt_result.setText(null);
                }
            }
        });
        button_proc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_result == null) {
                    txt_result.setText("");
                } else {
                    mValueOne = Float.parseFloat(txt_result.getText() + "");
                    procent = true;
                    txt_result.setText(null);
                }
            }
        });
        button_equels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(txt_result.getText() + "");

                if (crunchifyAddition) {
                    txt_result.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract) {
                    txt_result.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication) {
                    txt_result.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision) {
                    txt_result.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
                if(procent){
                    txt_result.setText(mValueOne * 0.01 * mValueTwo + "");
                    procent = false;
                }
            }
        });
    }

}