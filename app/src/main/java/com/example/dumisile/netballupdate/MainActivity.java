package com.example.dumisile.netballupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //TextView Declaration
    private TextView txtTeamA;
    private TextView txtTeamB;

    //Button Declaration
     private Button btnTeamA,btnTeamB,btnReset,BtnTeamAm,BtnTeamBm;

    private int countScoreTeamA=0;
    private int countScoreTeamB=0;
    EditText teamA, teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTeamA=(TextView)findViewById(R.id.txtTeamA);
        txtTeamB=(TextView)findViewById(R.id.txtTewamB);
        btnTeamA=(Button)findViewById(R.id.btnTeamA);
        btnTeamB=(Button)findViewById(R.id.button2);
        BtnTeamAm=(Button)findViewById(R.id.BtnTeamAm);
        BtnTeamBm=(Button)findViewById(R.id.BtnTeamBm);
        btnReset=(Button)findViewById(R.id.button3);
        teamA=(EditText)findViewById(R.id.EditteamA);
        teamB=(EditText) findViewById(R.id.EditteamB);



        btnTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countScoreTeamA=countScoreTeamA+1;
                txtTeamA.setText(String.valueOf(countScoreTeamA));

            }
        });
        btnTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countScoreTeamB=countScoreTeamB+1;
                txtTeamB.setText(String.valueOf(countScoreTeamB));
            }
        });

        BtnTeamAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (countScoreTeamA > 0)
                {
                    countScoreTeamA=countScoreTeamA-1;
                    txtTeamA.setText(String.valueOf(countScoreTeamA));
                }else {

                    Toast.makeText(MainActivity.this,"Invalid Score!",Toast.LENGTH_SHORT).show();
                }

            }
        });

        BtnTeamBm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (countScoreTeamB > 0) {
                    countScoreTeamB = countScoreTeamB - 1;
                    txtTeamB.setText(String.valueOf(countScoreTeamB));
                } else {

                    Toast.makeText(MainActivity.this, "Invalid Score!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    countScoreTeamA = 0;
                    txtTeamA.setText(String.valueOf(countScoreTeamA));;
                teamA.setText("");
                    countScoreTeamB = 0;
                    txtTeamB.setText(String.valueOf(countScoreTeamB));
                teamB.setText("");


            }


        });



    }
}
