package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button button1, qua, bbt;
    TextView ketqua;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button1 = findViewById(R.id.button1);
        bbt = findViewById(R.id.bbt);
        ketqua = findViewById(R.id.ketqua);
        qua = findViewById(R.id.qua);
        img1 = findViewById(R.id.img1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(editText1.getText().toString());
                int number2 = Integer.parseInt(editText2.getText().toString());
                int tong = number1 + number2;
                ketqua.setText("ket qua la" + tong);
            }
        });

            qua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setContentView(R.layout.img);
                    bbt = findViewById(R.id.bbt);
                    bbt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            setContentView(R.layout.img);
                            editText1 = findViewById(R.id.editText1);
                            editText2 = findViewById(R.id.editText2);
                            button1 = findViewById(R.id.button1);
                            bbt = findViewById(R.id.bbt);
                            ketqua = findViewById(R.id.ketqua);
                            qua = findViewById(R.id.qua);
                            img1 = findViewById(R.id.img1);


                        }
                    });
            }
        });







    }
}
