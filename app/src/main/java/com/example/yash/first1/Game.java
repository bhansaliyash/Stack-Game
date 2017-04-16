package com.example.yash.first1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {

    int click1=0;
    int click2=0;
    int click3=0;
    int click4=0;
    int click5=0;
    int click6=0;
    int click7=0;
    int click8=0;
    int click9=0;
    int click10=0;
    int click11=0;
    int click12=0;
    int click13=0;
    int click14=0;
    int click15=0;
     int count = 0,tempcount=0;
    int player = 1,playerClick=0;
    int flag=0,temp=1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final String p1 = getIntent().getExtras().getString("player1").toUpperCase();
        final String p2 = getIntent().getExtras().getString("player2").toUpperCase();

        TextView vs = (TextView) findViewById(R.id.textView4);


        vs.setText(p1 + " vs " + p2);
        TableRow tr2=(TableRow) findViewById(R.id.tableRow);
        TableRow tr3=(TableRow) findViewById(R.id.tableRow2);
        TableRow tr1=(TableRow) findViewById(R.id.tableRow3);


        final Intent myIntent = new Intent(Game.this,ResultActivity.class);

        Button tab1 = (Button) findViewById(R.id.t1);
            Button tab2 = (Button) findViewById(R.id.t2);
            Button tab3 = (Button) findViewById(R.id.t3);
            Button tab4 = (Button) findViewById(R.id.t4);
            Button tab5 = (Button) findViewById(R.id.t5);
            Button tab6 = (Button) findViewById(R.id.t6);
            Button tab7 = (Button) findViewById(R.id.t7);
            Button tab8 = (Button) findViewById(R.id.t8);
            Button tab9 = (Button) findViewById(R.id.t9);
            Button tab10 = (Button) findViewById(R.id.t10);
            Button tab11 = (Button) findViewById(R.id.t11);
            Button tab12 = (Button) findViewById(R.id.t12);
            Button tab13 = (Button) findViewById(R.id.t13);
            Button tab14 = (Button) findViewById(R.id.t14);
            Button tab15 = (Button) findViewById(R.id.t15);
            Button button = (Button) findViewById(R.id.button3);
            TextView playerName=(TextView) findViewById(R.id.textView5);

            if(player==1){
                playerName.setText(p1 +"'S TURN");
            }


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    if(playerClick>0) {
                        if (player == 1) {

                            temp=player;
                            player = 2;
                            playerClick=0;
                        } else {
                            temp=player;
                            player = 1;
                            playerClick=0;
                        }
                    }

                    else
                        Toast.makeText(Game.this, "Atleast one selection is required", Toast.LENGTH_SHORT).show();



                    TextView playerName = (TextView) findViewById(R.id.textView5);

                    if (player == 1) {

                        playerName.setText(p1+"'S TURN");
                    } else {

                        playerName.setText(p2 +"'S TURN");
                    }


                }
            });


            tab1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if (click1 == 0) {

                        if(temp==player && (flag==2 || flag==3 ));
                        else flag=1;

                            if(flag==1) {
                                temp=player;
                                Button tab1 = (Button) findViewById(R.id.t1);

                                tab1.setText("X");
                                if (player == 1)
                                    tab1.setTextColor(Color.RED);
                                else tab1.setTextColor(Color.BLUE);
                                count++;playerClick++;
                                click1++;


                                if (count == 14) {
                                    TextView vs = (TextView) findViewById(R.id.textView4);
                                    if(player==1)
                                    {
                                        myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
                                        startActivity(myIntent); }

                                    else
                                        {
                                            myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
                                            startActivity(myIntent); }

                                }

                            }
                        else
                                Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();

                }
            });


            tab2.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if (click2 == 0) {

                        if(temp==player && (flag==2 || flag==3 ));
                        else flag=1;

                        if(flag==1) {
                            temp=player;
                        Button tab2 = (Button) findViewById(R.id.t2);
                        tab2.setText("X");
                        if (player == 1)
                            tab2.setTextColor(Color.RED);
                        else tab2.setTextColor(Color.BLUE);
                           count++;playerClick++;
                        click2++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            { String result="Player " + p1 + " wins the game!!!!";
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }

                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }


                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}

                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab3.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click3==0){

                        if(temp==player && (flag==2 || flag==3 ));
                        else flag=1;

                        if(flag==1) {temp=player;

                    Button tab3 = (Button) findViewById(R.id.t3);
                    tab3.setText("X");
                    if(player==1)
                        tab3.setTextColor(Color.RED);
                    else tab3.setTextColor(Color.BLUE);
                    count++;playerClick++;
                        click3++;
                    if (count == 14) {
                        TextView vs = (TextView) findViewById(R.id.textView4);

                        if(player==1)
                        {
                            myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }

                        else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }
                    }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}

                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab4.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click4==0) {
                        if(temp==player && (flag==1 || flag==3 ));
                        else flag=2;

                        if(flag==2) {temp=player;
                        Button tab4 = (Button) findViewById(R.id.t4);
                        tab4.setText("X");
                        if (player == 1)
                            tab4.setTextColor(Color.RED);
                        else tab4.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click4++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            {
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }

                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(click5==0) {
                        if(temp==player && (flag==1 || flag==3 ));
                        else flag=2;

                        if(flag==2) {temp=player;
                        Button tab5 = (Button) findViewById(R.id.t5);
                        tab5.setText("X");
                        if (player == 1)
                            tab5.setTextColor(Color.RED);
                        else tab5.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click5++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            {
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
                                startActivity(myIntent); }
                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab6.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click6==0) {
                        if(temp==player && (flag==1 || flag==3 ));
                        else flag=2;

                        if(flag==2) {temp=player;
                        Button tab6 = (Button) findViewById(R.id.t6);
                        tab6.setText("X");
                        if (player == 1)
                            tab6.setTextColor(Color.RED);
                        else tab6.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click6++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            {
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
                                startActivity(myIntent); }
                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(click7==0) {
                        if(temp==player && (flag==1 || flag==3 ));
                        else flag=2;

                        if(flag==2) {temp=player;
                        Button tab7 = (Button) findViewById(R.id.t7);
                        tab7.setText("X");
                        if (player == 1)
                            tab7.setTextColor(Color.RED);
                        else tab7.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click7++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            {
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
                                startActivity(myIntent); }

                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab8.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click8==0) {
                        if(temp==player && (flag==1 || flag==3 ));
                        else flag=2;

                        if(flag==2) {temp=player;
                        Button tab8 = (Button) findViewById(R.id.t8);
                        tab8.setText("X");
                        if (player == 1)
                            tab8.setTextColor(Color.RED);
                        else tab8.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click8++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)                                     { myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }
                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab9.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click9==0) {
                        if(temp==player && (flag==2 || flag==1 ));
                        else flag=3;

                        if(flag==3) {temp=player;
                        Button tab9 = (Button) findViewById(R.id.t9);
                        tab9.setText("X");
                        if (player == 1)
                            tab9.setTextColor(Color.RED);
                        else tab9.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click9++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            {
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }

                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab10.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click10==0) {
                        if(temp==player && (flag==2 || flag==1 ));
                        else flag=3;

                        if(flag==3) {temp=player;
                        Button tab10 = (Button) findViewById(R.id.t10);
                        tab10.setText("X");
                        if (player == 1)
                            tab10.setTextColor(Color.RED);
                        else tab10.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click10++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)                                     { myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }
                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab11.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click11==0) {
                        if(temp==player && (flag==2 || flag==1 ));
                        else flag=3;

                        if(flag==3) {temp=player;
                        Button tab11 = (Button) findViewById(R.id.t11);
                        tab11.setText("X");
                        if (player == 1)
                            tab11.setTextColor(Color.RED);
                        else tab11.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click11++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)                                     {  myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }
                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab12.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if(click12==0){
                        if(temp==player && (flag==2 || flag==1 ));
                        else flag=3;

                        if(flag==3) {temp=player;
                    Button tab12 = (Button) findViewById(R.id.t12);
                    tab12.setText("X");
                    if (player == 1)
                        tab12.setTextColor(Color.RED);
                    else tab12.setTextColor(Color.BLUE);
                    count++;playerClick++;
                        click12++;

                    if (count == 14) {
                        TextView vs = (TextView) findViewById(R.id.textView4);

                        if(player==1)                                     { myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }
                        else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }

                    }
                }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab13.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
                    if (click13 == 0) {
                        if (temp == player && (flag == 2 || flag == 1)) ;
                        else flag = 3;

                        if (flag == 3) {temp=player;

                            Button tab13 = (Button) findViewById(R.id.t13);
                            tab13.setText("X");
                            if (player == 1)
                                tab13.setTextColor(Color.RED);
                            else tab13.setTextColor(Color.BLUE);
                            count++;playerClick++;
                            click13++;
                            if (count == 14) {
                                TextView vs = (TextView) findViewById(R.id.textView4);

                                if(player==1)                                     {  myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }
                                else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }
                            }
                        }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab14.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(click14==0) {
                        if(temp==player && (flag==2 || flag==1 ));
                        else flag=3;

                        if(flag==3) {temp=player;
                        Button tab14 = (Button) findViewById(R.id.t14);
                        tab14.setText("X");
                        if (player == 1)
                            tab14.setTextColor(Color.RED);
                        else tab14.setTextColor(Color.BLUE);
                        count++;playerClick++;
                        click14++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)                                     { myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }
                            else
                            {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }


                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });

            tab15.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(click15==0) {
                        if(temp==player && (flag==2 || flag==1 ));
                        else flag=3;

                        if(flag==3) {temp=player;
                        Button tab15 = (Button) findViewById(R.id.t15);


                        tab15.setText("X");
                        if (player == 1)
                            tab15.setTextColor(Color.RED);
                        else tab15.setTextColor(Color.BLUE);

                        count++;playerClick++;
                        click15++;
                        if (count == 14) {
                            TextView vs = (TextView) findViewById(R.id.textView4);

                            if(player==1)
                            {
                                myIntent.putExtra("winner",p1);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2); startActivity(myIntent); }

                            else                                         {
myIntent.putExtra("winner",p2);
myIntent.putExtra("pl1",p1);
myIntent.putExtra("pl2",p2);
startActivity(myIntent); }


                        }
                    }else
                            Toast.makeText(Game.this, "U cannot change the row", Toast.LENGTH_SHORT).show();}
                    else
                        Toast.makeText(Game.this, "U have already marked it", Toast.LENGTH_SHORT).show();
                }
            });




        }
    }
