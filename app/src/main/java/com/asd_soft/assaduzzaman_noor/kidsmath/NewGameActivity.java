package com.asd_soft.assaduzzaman_noor.kidsmath;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import android.os.Handler;


public class NewGameActivity extends AppCompatActivity {
    TextView bestTV;
    TextView scoreTV;
    TextView eqnTV;
    TextView ansTV;
    SessionManager sessionManager;
    AI ai;
    int score;
    int progressStatus;
    Handler handler;
    ProgressBar Progress;
    int is_true;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        bestTV = (TextView) findViewById(R.id.best);
        scoreTV = (TextView) findViewById(R.id.score);
        eqnTV = (TextView) findViewById(R.id.eqn);
        ansTV = (TextView) findViewById(R.id.ans);
        sessionManager = new SessionManager(NewGameActivity.this);
        ai = new AI();
        score=sessionManager.getNewScore();
        if(score<20){
            bestTV.setText(String.valueOf(sessionManager.getScore()));
            scoreTV.setText(String.valueOf(score));
            eqnTV.setText(ai.getEqn());
            ansTV.setText(ai.getAns());
            is_true=ai.getIs_true();

        }else {
            bestTV.setText(String.valueOf(sessionManager.getScore()));
            scoreTV.setText(String.valueOf(score));
            eqnTV.setText(ai.getEqn2());
            ansTV.setText(ai.getAns2());
            is_true=ai.getIs_true2();
        }
        handler = new Handler();
        Progress = (ProgressBar) findViewById(R.id.progressBar);
        progressStatus=0;
        if(score!=0)
            run_timer();



    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(NewGameActivity.this,MainActivity.class);
        startActivity(intent);
    }

    void run_timer(){




        progressStatus=0;



        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 100) {
                    progressStatus += 1;

                    //Update progress bar with completion of operation

                    handler.post(new Runnable() {
                        public void run() {
                            Progress.setProgress(progressStatus);

                        }
                    });
                    try {
                        // Sleep for 200 milliseconds.
                        //Just to display the progress slowly
                        int time=25;
                        if(sessionManager.getDiff()==1){
                            time=25;
                        }
                        else if(sessionManager.getDiff()==2){
                            time=17;
                        }
                        else if(sessionManager.getDiff()==3){
                            time=10;
                        }


                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    void time_out(){
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(NewGameActivity.this);
        dlgAlert.setMessage("  NEW : " + String.valueOf(score)+"            BEST : "+String.valueOf(sessionManager.getScore())+"\n Are you want to play again ?");
        dlgAlert.setIcon(R.drawable.ic_launcher);
        dlgAlert.setTitle("TIME OVER");
        dlgAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(sessionManager.getScore()<score){
                    sessionManager.setScore(score);
                }
                sessionManager.setNewScore(0);
                Intent intent = new Intent(NewGameActivity.this,NewGameActivity.class);
                startActivity(intent);

            }
        });
        dlgAlert.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(sessionManager.getScore()<score){
                    sessionManager.setScore(score);
                }
                sessionManager.setNewScore(0);
                Intent intent = new Intent(NewGameActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        dlgAlert.setCancelable(false);
        dlgAlert.create().show();

    }


    void game_over(){
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(NewGameActivity.this);
        dlgAlert.setMessage("  NEW : " + String.valueOf(score)+"            BEST : "+String.valueOf(sessionManager.getScore())+"\n Are you want to play again ?");
        dlgAlert.setIcon(R.drawable.ic_launcher);
        dlgAlert.setTitle("GAME OVER");
        dlgAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(sessionManager.getScore()<score){
                    sessionManager.setScore(score);
                }
                sessionManager.setNewScore(0);
                Intent intent = new Intent(NewGameActivity.this,NewGameActivity.class);
                startActivity(intent);

            }
        });
        dlgAlert.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(sessionManager.getScore()<score){
                    sessionManager.setScore(score);
                }
                sessionManager.setNewScore(0);
                Intent intent = new Intent(NewGameActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        dlgAlert.setCancelable(false);
        dlgAlert.create().show();
    }




    public void right(View view) {
        if(progressStatus<100){
            if(is_true==1){
                score++;
                sessionManager.setNewScore(score);
                Intent intent = new Intent(this,NewGameActivity.class);
                startActivity(intent);
            }else{
                game_over();

            }
        }else {
            time_out();
        }


    }

    public void cross(View view) {
        if (progressStatus<100){
            if(is_true==0){
                score++;
                sessionManager.setNewScore(score);
                Intent intent = new Intent(this,NewGameActivity.class);
                startActivity(intent);
            }else{
                game_over();
            }
        }else{
            time_out();
        }
    }
}
