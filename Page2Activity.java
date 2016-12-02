package com.test.n.cs281bodymatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by Lennont on 17/11/2559.
 */
public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2layout);



        TextView txt_bmi = (TextView) findViewById(R.id.editText_showBMI);
        double bmi_value = getIntent().getDoubleExtra("extra_bmi",0);
        String show_bmi = String.valueOf(new DecimalFormat("0.00").format(bmi_value));
        txt_bmi.setText(show_bmi);

        TextView txt_bmr = (TextView) findViewById(R.id.editText_showBMR);
        double bmr_value = getIntent().getDoubleExtra("extra_bmr",0);
        String show_bmr = String.valueOf(new DecimalFormat("0.00").format(bmr_value));
        txt_bmr.setText(show_bmr);

        TextView txt_bmiRate = (TextView) findViewById(R.id.editText_showBMIrate);
        String bmiRate_value = getIntent().getStringExtra("extra_bmiRate");
        txt_bmiRate.setText(bmiRate_value);








    }
}
