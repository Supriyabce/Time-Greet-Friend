package com.example.timegreetfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView tv;
    Button bt1;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        ed=findViewById(R.id.greet);
        bt1 = findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        ed.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        TextView textMessage = (TextView) findViewById(R.id.tv);
        EditText editFriendName = (EditText) findViewById(R.id.greet);
        String friendName = editFriendName.getText().toString();
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        String greeting = null;
        if(hour>=6 && hour<12){
            greeting = "Good Morning";
        } else if(hour>= 12 && hour < 17){
            greeting = "Good Afternoon";
        } else if(hour >= 17 && hour < 21){
            greeting = "Good Evening";
        } else if(hour >= 21 && hour < 24){
            greeting = "Good Night";
        }
        switch (v.getId()) {

            case R.id.bt1:
                textMessage.setText( greeting + " " + friendName + "!");

                break;

            default:
                break;
        }

    }
}
