package com.example.dz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // поля
    private TextView output;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // привязка разметки к полям
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        // считывание данных из намерения (приведшего в данную активность)
        Bundle bundle = getIntent().getExtras(); // упаковка всех данных намерения в контейнер Bundle
        int outputSum = bundle.getInt("sum"); // считывание ранее введённого целого числа

        // вывод данных на экран смартфона
        output.setText("Стоимость комплекта:\n" + outputSum + " валютных единиц");

        // обработка нажатия кнопки
        button.setOnClickListener(listener);
    }
    // слушатель нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // создание намерения
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            // запуск намерения
            startActivity(intent);
        }
    };
}