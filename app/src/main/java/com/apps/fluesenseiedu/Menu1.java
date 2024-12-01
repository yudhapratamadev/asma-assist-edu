package com.apps.fluesenseiedu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu1 extends AppCompatActivity {

    private CardView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu1);

        initV();
    }

    private void initV() {
        c1 = findViewById(R.id.deskripsi1);
        c1.setBackgroundResource(R.drawable.mn1deskripsi);

    }
}