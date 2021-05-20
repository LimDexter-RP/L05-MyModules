package sg.edu.rp.c346.id20039529.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c206;
    TextView c203;
    TextView c218;
    TextView c235;
    TextView g953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.textViewC346);
        c206 = findViewById(R.id.textViewC206);
        c203 = findViewById(R.id.textView203);
        c218 = findViewById(R.id.textViewC218);
        c235 = findViewById(R.id.textViewC235);
        g953 = findViewById(R.id.textViewG953);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Module", "Module Code: C346 \nModule Name: Android Programming \nAcademic Year: 2021 \nSemester: 1\nModule Credit: 4\nVenue: E26E");
                startActivity(i);
            }
        });
        c206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Module", "Module Code: C206 \nModule Name: Software Development Process \nAcademic Year: 2021 \nSemester: 1\nModule Credit: 4\nVenue: W67M");
                startActivity(i);
            }
        });
        c218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Module", "Module Code: C218 \nModule Name: UI/UX Design For Apps \nAcademic Year: 2021 \nSemester: 1\nModule Credit: 4\nVenue: W64G");
                startActivity(i);
            }
        });
        c235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Module", "Module Code: C235 \nModule Name: IT Security & Management \nAcademic Year: 2021 \nSemester: 1\nModule Credit: 4\nVenue: W67M");
                startActivity(i);
            }
        });
        g953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Module", "Module Code: G953 \nModule Name: Life Skills III \nAcademic Year: 2021 \nSemester: 1\nModule Credit: 4\nVenue: HBL");
                startActivity(i);
            }
        });
        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra("Module", "Module Code: C203 \nModule Name: Web Appln Development In PHP \nAcademic Year: 2021 \nSemester: 1\nModule Credit: 4\nVenue: HBL/W67M");
                startActivity(i);
            }
        });

    }
}