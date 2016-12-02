package com.test.n.cs281bodymatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Page1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1layout);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){

                Intent intent = new Intent(Page1Activity.this , Page2Activity.class);

                EditText edt_age = (EditText) findViewById(R.id.editText_Age);
                EditText edt_height = (EditText)findViewById(R.id.editText_Height);
                EditText edt_weight = (EditText)findViewById(R.id.editText_Weight);

                RadioButton radioFemale = (RadioButton) findViewById(R.id.radioButton_Female);
                RadioButton radioMale = (RadioButton) findViewById(R.id.radioButton_male);

                Data input = new Data();

                input.age = Integer.valueOf(edt_age.getText().toString());
                input.height = Integer.valueOf(edt_height.getText().toString());
                input.weight = Integer.valueOf(edt_weight.getText().toString());

                   input.CaLculate();

                intent.putExtra("extra_bmi",input.bmi);


                if(radioFemale.isChecked()){

                    intent.putExtra("extra_bmr",input.female_bmr);

                }
                if(radioMale.isChecked()){

                    intent.putExtra("extra_bmr",input.male_bmr);
                }


                    intent.putExtra("extra_bmiRate",input.Ratebmi());


                startActivity(intent);

            }
        });




    }
}

