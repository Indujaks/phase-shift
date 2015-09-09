package com.example.induja.registration;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseObject;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       final EditText name = (EditText)findViewById(R.id.editText);
        final EditText cname = (EditText)findViewById(R.id.editText2);
       final EditText bname = (EditText)findViewById(R.id.editText3);
        final EditText email = (EditText)findViewById(R.id.editText4);
        final EditText ename = (EditText)findViewById(R.id.editText5);
        final EditText num = (EditText)findViewById(R.id.editText6);




        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = name.getEditableText().toString();

                String name2 = cname.getEditableText().toString();
                String name3 = bname.getEditableText().toString();
                String name4 = email.getEditableText().toString();
                String name5 = ename.getEditableText().toString();
                String name6 = num.getEditableText().toString();
                ParseObject gameScore = new ParseObject("reg");
                gameScore.put("name", name1);
                gameScore.put("college", name2);
                gameScore.put("branch", name3);
                gameScore.put("email",name4);
                gameScore.put("event_name",name5);
                gameScore.put("phone",name6);
                gameScore.saveInBackground();
                Toast.makeText(getApplicationContext(), "REGISTERED", Toast.LENGTH_SHORT).show();


            }
        });


    }




}
