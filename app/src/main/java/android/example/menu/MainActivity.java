package android.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textItem1 = findViewById(R.id.menu_item_1);
        String menueItem1 = textItem1.getText().toString();
        Log.v("MainActivity",menueItem1);

        // Find second menu item TextView and print the text to the logs

        TextView textItem2 = findViewById(R.id.menu_item_2);
        String menueItem2 = textItem1.getText().toString();
        Log.v("MainActivity",menueItem2);

        // Find third menu item TextView and print the text to the logs

        TextView textItem3 = findViewById(R.id.menu_item_1);
        String menueItem3 = textItem1.getText().toString();
        Log.v("MainActivity",menueItem3);

    }
}
