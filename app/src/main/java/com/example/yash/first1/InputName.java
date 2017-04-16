package com.example.yash.first1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_name);



        Button b= (Button) findViewById(R.id.button2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText player1=(EditText) findViewById(R.id.editText2);
                EditText player2=(EditText) findViewById(R.id.editText);

                String p1=player1.getText().toString();
                String p2=player2.getText().toString();

                if(p1.equals("") || p2.equals(""))
                    Toast.makeText(InputName.this, "Write name for both the players!!", Toast.LENGTH_SHORT).show();
else{




                    Intent myIntent = new Intent(InputName.this,Game.class);
                myIntent.putExtra("player1",p1);
                myIntent.putExtra("player2",p2);

                startActivity(myIntent);}

            }
        });


    }
}
