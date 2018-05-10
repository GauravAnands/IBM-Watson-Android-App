package sad.is.happy.thaparadmissionqueries2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    ImageButton enquire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enquire = (ImageButton)findViewById(R.id.enquire);

        enquire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QueryPage.class);
                startActivity(intent);

            }
        });


    }
}
