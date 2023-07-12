package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    CheckBox dance,singing,movie,drawing;

    Button submit;

    TextView txthobby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Binding();
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String h = "";
               if(dance.isChecked()){
                   h += "Dance\n";
               }
               if(singing.isChecked()){
                   h += "Singing\n";
               }
               if(movie.isChecked()){
                   h += "Movie\n";
               }
               if(drawing.isChecked()){
                   h += "Drawing\n";
               }
               txthobby.setText("Hobby = "+h);
           }
       });

    }



    private void Binding(){

        dance = findViewById(R.id.dance);
        singing = findViewById(R.id.singing);
        movie = findViewById(R.id.movie);
        drawing = findViewById(R.id.drawing);
        submit = findViewById(R.id.submit);
        txthobby = findViewById(R.id.hobby);


    }

}