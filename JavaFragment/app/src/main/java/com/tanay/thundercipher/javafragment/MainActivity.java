package com.tanay.thundercipher.javafragment;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        if(findViewById(R.id.fragmentContainer) != null)
        {
            if(savedInstanceState != null)                      //if we don't apply this condition, fragments would start overlapping!
            {
                //the condition means that the activity is resuming, i.e. the fragments have already been added
                return;
            }

            FragmentTransaction transaction = manager.beginTransaction();
            BlankFragment blankFragment = new BlankFragment();
            transaction.add(R.id.fragmentContainer, blankFragment, null);
            transaction.commit();
        }
    }
}
