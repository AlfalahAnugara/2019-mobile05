package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupsFragment;

import android.os.Bundle;
import android.view.View;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
    }

    public void handleClickPushupsFragment(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new PushupsFragment(),"RED_FRAGMENT");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }



    public void handleClickDips(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new DipsFragment(),"RED_FRAGMENT");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handleClickHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new HandstandFragment(),"RED_FRAGMENT");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
