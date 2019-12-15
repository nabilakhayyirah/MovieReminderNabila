package com.example.moviedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Author extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
    }

    public void MainActivity(View view) {
        Intent intent = new Intent(Author.this, MainActivity.class);
        startActivity(intent);
    }

    public void Remind(View view){
        EditText titleField = (EditText) findViewById(R.id.title_field);
        String name = titleField.getText().toString();

        EditText descriptionField = (EditText) findViewById(R.id.description_field);
        String desc = descriptionField.getText().toString();

        CheckBox AllDayCheckBox =(CheckBox) findViewById(R.id.all_day);
        boolean AllDay = AllDayCheckBox.isChecked();

        CheckBox notAllDayCheckBox =(CheckBox) findViewById(R.id.not_all_day);
        boolean NotAllDay = notAllDayCheckBox.isChecked();


        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.Events.TITLE, name)
                .putExtra(CalendarContract.Events.DESCRIPTION, desc)
                .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY,AllDay )
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, NotAllDay)
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, NotAllDay);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }}
