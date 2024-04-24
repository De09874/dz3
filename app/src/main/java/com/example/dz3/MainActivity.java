package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // поля
    private Button button;
    private EditText inputEngine, inputTransmission, inputBody; // поля вводных данных

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка разметки к полям
        button = findViewById(R.id.button);
        inputEngine = findViewById(R.id.inputEngine);
        inputTransmission = findViewById(R.id.inputTransmission);
        inputBody = findViewById(R.id.inputBody);

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    // слушатель нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // считывание данных
            int engine = Integer.parseInt(inputEngine.getText().toString());
            int transmission = Integer.parseInt(inputTransmission.getText().toString());
            int body = Integer.parseInt(inputBody.getText().toString());

            //стоимость комплекта
            int sum = engine + transmission + body;

            // создание намерения
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            // упаковка в намерение простых данных
            intent.putExtra("sum", sum);
            // запуск намерения
            startActivity(intent);
        }
    };

}