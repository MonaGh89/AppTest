package com.gh.mona.variblesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    TextView result;

    EditText editText;
    private String txt="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        result=findViewById(R.id.Result);


       /* String[] hobbies = new String[3];
        hobbies[0]="Farming";
        hobbies[1]="Fishing";
        hobbies[2]="Programming";

        for (String hobName : hobbies){

            Log.i("HOB" , hobName);
        */

       Boxer name = new Boxer();

       Log.i("TAG",name.toString());

       name.getBoxesiz();
    }
       


      /*  public void resultMaulti(View v){

        txt="";

        int editText1 = Integer.parseInt(editText.getText().toString());
        for (int counter = 0 ; counter<10; counter++){
            txt= txt + editText1 +"X" +(counter+1) + "=" + (editText1 * (counter+1))+"\nThis is an example of simple text.






        }

        result.setText(txt);
*/

      public void resultMaulti(View v){
          txt="";

          String revers = editText.getText().toString();

          char[] textArray = revers.toCharArray();

          for (int i =textArray.length-1 ; i>=0 ; i--){

              txt = txt + textArray[i]+"";
          }

          result.setText(txt);

      }



    }







