package com.gorelax.gorelax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewbyId(R.id.button);
        button.setOnCLickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        }
    }

    public void playVid(View view) {
        Intent intent = new Intent(this, PlayVideo.class);
        startActivity(intent);
    }
    public void openActivity2() {
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }
}
