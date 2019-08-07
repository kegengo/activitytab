package com.example.mytabbedactivity.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mytabbedactivity.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class Services extends Fragment {

    Button karibu;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_services, container, false);

        karibu = root.findViewById(R.id.btnWelcome);

        karibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getContext(), "welcome button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }


}
