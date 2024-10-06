package com.example.mentalstresschecker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button[] MainScreen;
    private Button[] Opts;
    private Button B;
    private TextView Quest, Meter;
    private TextView[] Colors;
    private Button EndHelp;
    private TextView[] help;
    private TextView[] abt;

    String[] Q;
    int score = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        MainScreen[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainScreen[0].setVisibility(View.INVISIBLE);
                MainScreen[1].setVisibility(View.INVISIBLE);
                MainScreen[2].setVisibility(View.INVISIBLE);
                Quest.setText(Q[count]);
                count++;
                Quest.setVisibility(View.VISIBLE);

                for(int i=0;i<Opts.length;i++)
                    Opts[i].setVisibility(View.VISIBLE);
            }
        });

        MainScreen[1].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    int i;
                    for(i=0;i<MainScreen.length;i++)
                        MainScreen[i].setVisibility(View.INVISIBLE);
                    for(i=0;i<help.length;i++)
                        help[i].setVisibility(View.VISIBLE);
                    B.setVisibility(View.VISIBLE);
                }
        });

        MainScreen[2].setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i;
                for(i=0;i<MainScreen.length;i++)
                    MainScreen[i].setVisibility(View.INVISIBLE);
                for(i=0;i<abt.length;i++)
                    abt[i].setVisibility(View.VISIBLE);
                B.setVisibility(View.VISIBLE);
            }
        });

        EndHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i;
                for(i=0;i<MainScreen.length;i++)
                    MainScreen[0].setVisibility(View.INVISIBLE);

                Quest.setVisibility(View.INVISIBLE);
                Meter.setVisibility(View.INVISIBLE);
                EndHelp.setVisibility(View.INVISIBLE);
                for(i=0;i<Colors.length;i++)
                    Colors[i].setVisibility(View.INVISIBLE);
                for(i=0;i<help.length;i++)
                    help[i].setVisibility(View.VISIBLE);
                B.setVisibility(View.VISIBLE);
            }
        });

        B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int i;
                for(i=0;i<help.length;i++)
                    help[i].setVisibility(View.INVISIBLE);
                for(i=0;i<abt.length;i++)
                    abt[i].setVisibility(View.INVISIBLE);
                Quest.setTextColor(Color.BLACK);
                B.setVisibility(View.INVISIBLE);
                for(i=0;i<MainScreen.length;i++)
                    MainScreen[i].setVisibility(View.VISIBLE);
                count = 0;
                score = 0;
            }
        });

        Opts[0].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!(count>9))
                Quest.setText(Q[count]);
                score+=1;
                if(count<=9)
                    count ++;
                else{
                    for(int j=0;j<Opts.length;j++)
                        Opts[j].setVisibility(View.INVISIBLE);
                    Quest.setTextColor(Color.BLUE);
                    Quest.setText("Score : "+score+"/50");
                    Meter.setVisibility(View.VISIBLE);
                    EndHelp.setVisibility(View.VISIBLE);
                    double per = 100 - ((score*100)/50);

                    if(per>=50)
                        Meter.setTextColor(Color.RED);
                    else if(per>=25)
                        Meter.setTextColor(Color.YELLOW);
                    else
                        Meter.setTextColor(Color.parseColor("#00a000"));

                    Meter.setText("Stress Percent : "+per+"%");
                    for(int h=0;h<Colors.length;h++)
                        Colors[h].setVisibility(View.VISIBLE);
                }
            }
        });

        Opts[1].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!(count>9))
                Quest.setText(Q[count]);
                score+=3;
                if(count<=9)
                    count ++;
                else{
                    for(int j=0;j<Opts.length;j++)
                        Opts[j].setVisibility(View.INVISIBLE);
                    Quest.setTextColor(Color.BLUE);
                    Quest.setText("Score : "+score+"/50");
                    Meter.setVisibility(View.VISIBLE);
                    EndHelp.setVisibility(View.VISIBLE);
                    double per = 100 - ((score*100)/50);

                    if(per>=50)
                        Meter.setTextColor(Color.RED);
                    else if(per>=25)
                        Meter.setTextColor(Color.YELLOW);
                    else
                        Meter.setTextColor(Color.parseColor("#00a000"));

                    Meter.setText("Stress Percent : "+per+"%");
                    for(int h =0;h<Colors.length;h++)
                        Colors[h].setVisibility(View.VISIBLE);
                }
            }
        });

        Opts[2].setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!(count>9))
                Quest.setText(Q[count]);
                score+=5;
                if(count<=9)
                    count ++;
                else{
                    for(int j=0;j<Opts.length;j++)
                        Opts[j].setVisibility(View.INVISIBLE);
                    Quest.setTextColor(Color.BLUE);
                    Quest.setText("Score : "+score+"/50");
                    Meter.setVisibility(View.VISIBLE);
                    EndHelp.setVisibility(View.VISIBLE);
                    double per = 100 - ((score*100)/50);

                    if(per>=50)
                        Meter.setTextColor(Color.RED);
                    else if(per>=25)
                        Meter.setTextColor(Color.YELLOW);
                    else
                        Meter.setTextColor(Color.parseColor("#00a000"));

                    Meter.setText("Stress Percent : "+per+"%");
                    for(int h =0;h<Colors.length;h++)
                        Colors[h].setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void setupUIViews() {

        Q = new String[10];
        help = new TextView[2];

        abt = new TextView[2];
        abt[0] = (TextView)findViewById(R.id.Developer);
        abt[1] = (TextView)findViewById(R.id.AboutApp);

        Colors = new TextView[3];
        Colors[0] = (TextView) findViewById(R.id.Red);
        Colors[1] = (TextView) findViewById(R.id.Yellow);
        Colors[2] = (TextView) findViewById(R.id.Green);

        Q[0] = "How often do you get impatient over small delays like traffic lights or elevators ?" ;
        Q[1] = "How often do you get angry when someone interrupts while you are speaking ?" ;
        Q[2] = "How often do you find yourself panicking ?" ;
        Q[3] = "How often do you get upset over small things ?" ;
        Q[4] = "How often do you find yourself screaming at others for small reasons ?" ;
        Q[5] = "How often do you feel lonely ?";
        Q[6] = "How often do you get intolerant ?";
        Q[7] = "How often do you find yourself worrying about future ?";
        Q[8] = "How often do you find yourself overeating or eating less than usual ?";
        Q[9] = "How often do you experience struggle in falling asleep ?";

        help[0] = (TextView)findViewById(R.id.SomeTips);
        help[1] = (TextView)findViewById(R.id.Helpline);

        MainScreen = new Button[3];
        MainScreen[0] = (Button)findViewById(R.id.Test);
        MainScreen[1] = (Button)findViewById(R.id.Help);
        MainScreen[2] = (Button)findViewById(R.id.About);


        Opts = new Button[3];
        Opts[0] = (Button)findViewById(R.id.Worst);
        Opts[1] = (Button)findViewById(R.id.Ok);
        Opts[2] = (Button)findViewById(R.id.Great);

        EndHelp = (Button)findViewById(R.id.EndHelp);

        B = (Button)findViewById(R.id.Back);

        Quest = (TextView)findViewById(R.id.Ques);
        Meter = (TextView)findViewById(R.id.StressMeter);

    }
}