package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.BlueFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

import android.os.Bundle;
import android.view.View;

public class DynamicActivity extends AppCompatActivity {
    private RedFragment RF;
    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment Red = fragmentManager.findFragmentByTag("RED");
    Fragment Blue = fragmentManager.findFragmentByTag("BLUE");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

//    public void handleClickLoadRedFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment());
//        fragmentTransaction.commit();
//    }
//
//    public void handleClickLoadBlueFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment());
//        fragmentTransaction.commit();
//    }

//    public void handleClickLoadRedFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new RedFragment(),"RED_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }
//
//    public void handleClickLoadBlueFragment(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new BlueFragment(),"BLUE_FRAGMENT");
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }

    public void handleClickLoadRedFragment(View view) {
        if (Red == null){
            Red = new RedFragment();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left);
            ft.add(R.id.dynamic_fragment_placeholder,Red,"RED");
            ft.commit();

        }else {

            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left);
            ft.replace(R.id.dynamic_fragment_placeholder,Red,"RED");
            ft.commit();
        }



    }

    public void handleClickLoadBlueFragment(View view) {
        if (Blue == null){
            Blue = new BlueFragment();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left);
            ft.add(R.id.dynamic_fragment_placeholder,Blue,"BLUE");
            ft.commit();

        }else {

            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left);
            ft.replace(R.id.dynamic_fragment_placeholder,Blue,"BLUE");
            ft.commit();
        }
    }
}
