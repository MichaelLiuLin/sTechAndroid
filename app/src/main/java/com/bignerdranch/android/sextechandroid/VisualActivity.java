package com.bignerdranch.android.sextechandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;


/**
 * Created by michael on 25/3/18.
 */
public class VisualActivity extends AppCompatActivity {
    private Button btnOnline;
    private Button btnLocal;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual);
        btnOnline=(Button)findViewById(R.id.button);
        btnOnline.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //start the second activity

                Toast.makeText(getApplicationContext(),
                        "You clicked online button",
                        Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=RVY5JtwrG1Y"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        btnLocal=(Button)findViewById(R.id.button2);
        btnLocal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //start the second activity
                Intent intent = new Intent(VisualActivity.this, LocalActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),
                        "You clicked local button",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
