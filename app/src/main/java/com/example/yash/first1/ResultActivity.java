package com.example.yash.first1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final String p1 = getIntent().getExtras().getString("winner");
        final String pla1 = getIntent().getExtras().getString("pl1");
        final String pla2 = getIntent().getExtras().getString("pl2");

        Button newGame=(Button) findViewById(R.id.button6);

        TextView tab=(TextView) findViewById(R.id.textView9);
        tab.setText(p1 + " WINS THE GAME");

        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, InputName.class));
            }
        });

        Button again=(Button) findViewById(R.id.button5);
        Button home=(Button) findViewById(R.id.button8);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent game=new Intent(ResultActivity.this, Game.class);

                game.putExtra("player1", pla1);
                game.putExtra("player2", pla2);
                startActivity(game);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
            }
        });
    }
}
