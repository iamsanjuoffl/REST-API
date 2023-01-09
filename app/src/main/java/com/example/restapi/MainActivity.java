package com.example.restapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.Some;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String s1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.t1);

    }

    public void set(View view) {
        Asynclas a=new Asynclas();
        a.execute();
    }

    private class Asynclas extends AsyncTask {
        @Override
        protected Object doInBackground(Object[] objects) {
            Some s=new Some();
            s1=s.abc("https://reqres.in/api/users?page=2");
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            tv.setText(s1);
        }
    }
}