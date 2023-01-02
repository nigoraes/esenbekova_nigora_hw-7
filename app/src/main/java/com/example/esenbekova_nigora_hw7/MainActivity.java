package com.example.esenbekova_nigora_hw7;

import androidx.appcompat.app.AppCompatActivity;

  import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        String operator;
        String oldNumber;
        Boolean isNew = true;
        TextView textView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView = findViewById(R.id.text_view);

        }

        public void onNumberClick(View view) {
            if (isNew)
                textView.setText("");
            isNew=false;
            String number = textView.getText().toString();
            switch (view.getId()){
                case R.id.btn_one: number = number+"1" ; break;
                case R.id.btn_two: number = number+"2" ; break;
                case R.id.btn_three: number = number+"3" ; break;
                case R.id.btn_four: number = number+"4" ; break;
                case R.id.btn_fife: number = number+"5" ; break;
                case R.id.btn_six: number = number+"6" ; break;
                case R.id.btn_seven: number = number+"7" ; break;
                case R.id.btn_eight: number = number+"8" ; break;
                case R.id.btn_nine: number = number+"9" ; break;
                case R.id.btn_zero: number = number+"0" ; break;
                case R.id.btn_Dot: number = number+"." ; break;
                case R.id.btn_percent: number = number+"%" ; break;
                case R.id.btn_PlusMinus: number = "-" +number  ; break;

            }
            textView.setText(number);

        }
        public void onOperationClick(View view) {
            isNew = true;
            oldNumber = textView.getText().toString();
            switch (view.getId()){
                case R.id.btn_add: operator="+"; break;
                case R.id.btn_multiplication: operator="*"; break;
                case R.id.btn_division: operator="/"; break;
                case R.id.btn_subtraction: operator="-"; break;
            }
        }
        public void clickEqual(View view){
            String newNumber = textView.getText().toString();
            Double result = 0.0;
            switch (operator){
                case "+":result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);break;
                case "*":result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);break;
                case "/":result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);break;
                case "-":result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);break;
            }
            textView.setText(result+"");
        }

        public void acClick(View view) {
            textView.setText("0");
            isNew = true;
        }
    }