package com.example.mytabbedactivity.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mytabbedactivity.R;

/**
 * A simple {@link Fragment} subclass.

 */
public class HomeFragment extends Fragment {
    ImageView picha;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        picha = root.findViewById(R.id.imgPicha);

        picha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "image kenya clicked", Toast.LENGTH_SHORT).show();
            }
        });

        return root;



    }

}
