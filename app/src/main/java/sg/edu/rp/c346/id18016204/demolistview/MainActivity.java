package sg.edu.rp.c346.id18016204.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView) this.findViewById(R.id.lvFood);
        //create a few food objects in Food array
        food = new ArrayList<>();
        food.add(new Food("Ah Lat Coffee" , false));
        food.add(new Food("Rocky Choc", true));
        food.add(new Food("Kid Cat Choc" , true));

        //link activity object , the row.xml and food string array together
        aa = new FoodAdapter(this, R.layout.row , food);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Food selectedFood = food.get(position);
                Toast.makeText(MainActivity.this, selectedFood.getName()+ "Star: " + selectedFood.isStar(),Toast.LENGTH_LONG).show();
                String selected = selectedFood.getName();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(Intent.EXTRA_TEXT,selected);
                startActivity(intent);
            }
        });
    }
}