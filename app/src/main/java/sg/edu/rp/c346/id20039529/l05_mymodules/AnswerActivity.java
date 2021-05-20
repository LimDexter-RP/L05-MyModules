package sg.edu.rp.c346.id20039529.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView tvShow;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvShow = findViewById(R.id.textViewShow);
        btnBack = findViewById(R.id.buttonBack);
        Intent i = getIntent();

        String module = i.getStringExtra("Module");


        tvShow.setText(module);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}