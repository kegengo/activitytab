package com.example.mytabbedactivity.ui.main;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytabbedactivity.R;

/**
 * A simple {@link Fragment} subclass.

 */
public class ProductsFragment extends Fragment {
 TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_products, container, false);
        text = root.findViewById(R.id.txtFriend);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "text view clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }


}
