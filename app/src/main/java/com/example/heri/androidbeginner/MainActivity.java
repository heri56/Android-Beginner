package com.example.heri.androidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Info", "Information");
        Log.v(TAG, "index=");
    }

    public void topClick(View view)
    {
        Intent aktivity = new Intent(this, SecondActivity.class);
        startActivity(aktivity);
        Toast.makeText(this,"Akiviti dua", Toast.LENGTH_SHORT).show();
    }
    public void topClickDua(View view)
    {
        Toast.makeText(this,"The user click", Toast.LENGTH_SHORT).show();
    }
}
