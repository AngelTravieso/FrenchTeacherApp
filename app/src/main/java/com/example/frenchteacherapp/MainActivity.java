package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // decir el color en frances
    public void sayTheColor(View view) {

        /*
            Diciendo que la vista que se pasa como argumento
            es de tipo Button
         */
        Button clickedBtn = (Button) view; // casting

        MediaPlayer mp = MediaPlayer.create(
                this,
                getResources().getIdentifier(
                        clickedBtn.getTag().toString(),
                        "raw",
                        getPackageName()
                )
        );

        // reproducir sonidos
        mp.start();

    }

}