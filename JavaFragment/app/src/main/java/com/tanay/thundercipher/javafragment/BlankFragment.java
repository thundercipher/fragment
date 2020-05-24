package com.tanay.thundercipher.javafragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    Button button1;

    public void navigate(View view)
    {
        MainActivity.manager.beginTransaction().replace(R.id.fragmentContainer, new NextFragment(), null).commit();
    }

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank, container, false);

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        button1 = view.findViewById(R.id.button1);

        /* button1.setOnClickListener(new View.OnClickListener() {                         //as an alternative to providing an onClick method in the XML attributes
            @Override
            public void onClick(View v)
            {
                MainActivity.manager.beginTransaction().replace(R.id.fragmentContainer, new NextFragment(), null).commit();
            }
        }); */

        return view;
    }
}
