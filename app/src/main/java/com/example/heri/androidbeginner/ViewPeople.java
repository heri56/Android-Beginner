package com.example.heri.androidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ViewPeople extends AppCompatActivity {
    private EditText etTextname;
    private EditText etTextadd;
    private EditText etTextid;
    private Button btnprev;
    private Button btnnext;
    private Button btnsave;
    private Button btndelete;

    private static final String Select_SQL = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_people);
    }

    /*private void showPeoples(){
        Intent in = new Intent(this);
        startActivity(in);
        finish();
    }
    /*private void onClick(View v){
        if (v == btnAdd ){
            insertIntoDB();
        }
        if (v == btnView){
            showPeoples();
        }
    }*/
}
