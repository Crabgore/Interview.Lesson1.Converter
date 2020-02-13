package ru.crabgore.interviewlesson1converter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ConvertActivity extends AppCompatActivity {

    private EditText sourceText;    // Элемент с входным значением, которое надо сконвертировать
    private EditText destText;      // Элемент с результирующим значением

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
        sourceText = findViewById(R.id.celsiusValue);
        destText = findViewById(R.id.fahrenheitValue);
    }

    // обработка нажатия
    @SuppressLint("DefaultLocale")
    public void onToFahrenheitClick(View view) {
        // получить входное значение
        float sourceValue = Float.parseFloat(sourceText.getText().toString());
        // инстанцировать конвертер
        Converter converter = new Converter(sourceValue);
        // преобразовать, обратите внимание на параметр ConvertToFahrenheit
        float destValue = converter.Convert(new ConvertToFahrenheit()).GetResult();
        // записать результат в элемент
        destText.setText(String.format("%.02f", destValue));
    }
}