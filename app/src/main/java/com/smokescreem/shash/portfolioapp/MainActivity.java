package com.smokescreem.shash.portfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @OnClick({R.id.popular_movies,
            R.id.stock_hawk,
            R.id.build_it_better,
            R.id.make_app_material,
            R.id.go_ubiquitous,
            R.id.capstone})
    public void onClickButton(View view){
        Context context = getApplicationContext();
        CharSequence text = ((Button)view).getText();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
