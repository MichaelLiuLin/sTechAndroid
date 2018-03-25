package com.bignerdranch.android.sextechandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton btnShop;
    private ImageButton btnPlayhouse;
    private ImageButton btnWorld;
    private ImageButton btnVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShop=(ImageButton)findViewById(R.id.imageButtonShop);
        btnShop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            //start the second activity
                Intent intent = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "You clicked Shop button",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnWorld=(ImageButton)findViewById(R.id.imageButtonWorld);
        btnWorld.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //start the second activity
                Intent intent = new Intent(MainActivity.this, WorldActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "You clicked World button",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnVisual=(ImageButton)findViewById(R.id.imageButtonVisual);
        btnVisual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //start the second activity
                Intent intent = new Intent(MainActivity.this, VisualActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "You clicked Visual button",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnPlayhouse=(ImageButton)findViewById(R.id.imageButtonPlayhouse);
        btnPlayhouse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //start the second activity
                Intent intent = new Intent(MainActivity.this, PlayhouseActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "You clicked Playhouse button",
                        Toast.LENGTH_SHORT).show();
            }
        });




    }


}
