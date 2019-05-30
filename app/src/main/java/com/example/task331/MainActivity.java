package com.example.task331;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private double firstVariable;
    private double secondVariable;
    private FrameLayout frameEngineer;

    boolean mMultiply;
    boolean mDivide;
    boolean mPlus;
    boolean mMinus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {

        result = findViewById(R.id.result);
        frameEngineer = findViewById(R.id.Engineer);
    }

    public void engineerSwitchClicked(View view) {
        if (frameEngineer.getVisibility() == View.GONE) {
            frameEngineer.setVisibility(View.VISIBLE);
        } else {
            frameEngineer.setVisibility(View.GONE);
        }

    }

    public void buttonClicked(View view) {

        if (view.getId() == R.id.btn_0) {
            result.setText(String.format("%s0", result.getText()));
        } else if (view.getId() == R.id.btn_1) {
            result.setText(String.format("%s1", result.getText()));
        } else if (view.getId() == R.id.btn_2) {
            result.setText(String.format("%s2", result.getText()));
        } else if (view.getId() == R.id.btn_3) {
            result.setText(String.format("%s3", result.getText()));
        } else if (view.getId() == R.id.btn_4) {
            result.setText(String.format("%s4", result.getText()));
        } else if (view.getId() == R.id.btn_5) {
            result.setText(String.format("%s5", result.getText()));
        } else if (view.getId() == R.id.btn_6) {
            result.setText(String.format("%s6", result.getText()));
        } else if (view.getId() == R.id.btn_7) {
            result.setText(String.format("%s7", result.getText()));
        } else if (view.getId() == R.id.btn_8) {
            result.setText(String.format("%s8", result.getText()));
        } else if (view.getId() == R.id.btn_9) {
            result.setText(String.format("%s9", result.getText()));

        } else if (view.getId() == R.id.btn_plus) {
            firstVariable = Double.parseDouble(result.getText().toString());
            mPlus = true;
            result.setText(null);
            result.setHint("+");


        } else if (view.getId() == R.id.btn_min) {
            firstVariable = Double.parseDouble(result.getText().toString());
            mMinus = true;
            result.setText(null);
            result.setHint("-");

        } else if (view.getId() == R.id.btn_mult) {
            firstVariable = Double.parseDouble(result.getText().toString());
            mMultiply = true;
            result.setText(null);
            result.setHint("*");

        } else if (view.getId() == R.id.btn_div) {
            firstVariable = Double.parseDouble(result.getText().toString());
            mDivide = true;
            result.setText(null);
            result.setHint("/");

        } else if (view.getId() == R.id.btn_plusminus) {
            firstVariable = Double.parseDouble(result.getText().toString());
            result.setText(String.format("%s", (firstVariable * -1)));

        } else if (view.getId() == R.id.btn_percent) {
            firstVariable = Double.parseDouble(result.getText().toString());
            result.setText(String.format("%s", (firstVariable / 100)));

        } else if (view.getId() == R.id.btn_C) {
            result.setText(null);
            result.setHint("0");


        } else if (view.getId() == R.id.btn_equal) {
            secondVariable = Double.parseDouble(result.getText().toString());
            if (mMultiply) {
                result.setText(String.format("%s", firstVariable * secondVariable));
            }
            if (mDivide) {
                if (secondVariable != 0)
                    result.setText(String.format("%s", firstVariable / secondVariable));
                else result.setText("Деление на 0!");
            }
            if (mPlus) {
                result.setText(String.format("%s", firstVariable + secondVariable));
            }
            if (mMinus) {
                result.setText(String.format("%s", firstVariable - secondVariable));
            }

        } else if (view.getId() == R.id.btn_comma) {
            result.setText(String.format("%s.", result.getText()));
        }
    }
}
