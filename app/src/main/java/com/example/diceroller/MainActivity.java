package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.TypeVariable;
import java.util.Random;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void on_button_click(View view) {

        TextView tv = this.findViewById(R.id.textView);
        TextView vt = this.findViewById(R.id.icebreak);
        Random r = new Random();
        int number = r.nextInt(7);

        tv.setText(Integer.toString(number));


        EditText tv3 = this.findViewById(R.id.editText);
        TextView tv2 = this.findViewById(R.id.textView2);

        String StrNum = String.valueOf(number);

        String tv4 = tv3.getText().toString();

        int score = 0;

        vt.setText("");

        TextView score1 = this.findViewById(R.id.scoreView);
        if (StrNum.equals(tv4)) {
            score++;
            score1.setText("Score " + score);
            tv2.setText("Congrats");
        } else {
            tv2.setText("Guess the number");

        }


    }



    public void roll_the_dice() {

            TextView tv = this.findViewById(R.id.textView);

            Random r = new Random();
            int number = r.nextInt(7);

            tv.setText(Integer.toString(number));


            EditText tv3 = this.findViewById(R.id.editText);
            TextView tv2 = this.findViewById(R.id.textView2);

            String StrNum = String.valueOf(number);

            String tv4 = tv3.getText().toString();

            int score = 0;
            TextView vt = this.findViewById(R.id.icebreak);
            vt.setText("");

            TextView score1 = this.findViewById(R.id.scoreView);
            if (StrNum.equals(tv4)) {
                score++;
                score1.setText("Score " + score);
                tv2.setText("Congrats");
            } else {
                tv2.setText("Guess the number");

            }


        while (StrNum.equals(tv4)) if (tv4 == "1") {
            vt.setText("If you could go anywhere in the world, where would you go?");
        } else if (tv4.equals("2")) {
            vt.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        } else if (tv4.equals("3")) {
            vt.setText("If you could eat only one food for the rest of your life, what would that be?");
        } else if (tv4.equals("4")) {
            vt.setText("If you won a million dollars, what is the first thing you would buy?");
        } else if (tv4.equals("5")) {
            vt.setText("If you could spaned the day with one fictional character, who would it be?");
        } else if (tv4.equals("6"))
            vt.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
    }




    }














