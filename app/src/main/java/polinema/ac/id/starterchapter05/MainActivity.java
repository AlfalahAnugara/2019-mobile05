package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import polinema.ac.id.starterchapter05.activities.DynamicActivity;
import polinema.ac.id.starterchapter05.activities.StaticActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerPraktikumFragment(View view) {
        Intent intent = new Intent (this, PraktikumActivity.class) ;
        startActivity(intent) ;
    }

    public void handlerDynamicFragment(View view) {
        Intent intent = new Intent (this, DynamicActivity.class) ;
        startActivity(intent);
    }

    public void handlerStaticFragment(View view) {
        Intent intent = new Intent (this, StaticActivity.class) ;
        startActivity(intent) ;
    }


}
