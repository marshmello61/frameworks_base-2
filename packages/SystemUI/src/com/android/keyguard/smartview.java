package com.android.keyguard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.android.systemui.R;

public class smartview extends AppCompatActivity {

    ImageButton close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartview);

        close = findViewById(R.id.closeBT);
        close.setOnClickListener(v -> {
            this.finish();

        });

    }
}
