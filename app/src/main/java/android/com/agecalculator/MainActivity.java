package android.com.agecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click (View view)
    {
        Button btn = (Button) findViewById(R.id.btn);
        EditText ed = (EditText) findViewById(R.id.ed);

        Double year = Double.parseDouble(ed.getText().toString());
        Double age = 2019 - year;
        Toast.makeText(this,"Your age is "+age.toString(),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
