package com.theincgi.gles_game_fixed;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.theincgi.gles_game_fixed.MainActivity;
import com.theincgi.gles_game_fixed.game.levels.Level1;
import com.theincgi.gles_game_fixed.game.levels.Level2;

public class Levelselector extends AppCompatActivity {

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    MediaPlayer mySong;

    private static Levelselector instance;
    public static void toast(String s) {
        if(instance!=null)
            Toast.makeText(instance, s, Toast.LENGTH_LONG);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_sel);
        instance = this;

        buttonOne = findViewById(R.id.level1);
        buttonTwo = findViewById(R.id.level2);
        mySong = MediaPlayer.create(this, R.raw.coin_grab_3);


    }

    public void onClickLevelOne(View view){

        mySong.start();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtras(new Bundle());
        intent.getExtras().putInt(MainActivity.LEVEL_KEY, 1);
        startActivity(intent);

    }

    public void onClickLevelTwo(View view){

        mySong.start();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtras(new Bundle());
        intent.getExtras().putInt(MainActivity.LEVEL_KEY, 2);
        startActivity(intent);

    }
    //public void onClickLevelThree(View view){

       // Intent intent = new Intent(this, Level3.class);
       // startActivity(intent);

   // }

    @Override
    public void finish() {
        super.finish();
        instance = null;
    }
}
