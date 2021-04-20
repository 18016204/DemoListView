package sg.edu.rp.c346.id18016204.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
tv = findViewById(R.id.tv);

Intent intent = getIntent();
String text =  intent.getStringExtra(Intent.EXTRA_TEXT);
tv.setText(text);

    }
}