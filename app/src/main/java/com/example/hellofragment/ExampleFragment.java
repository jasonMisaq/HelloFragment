package com.example.hellofragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by johndoe on 11/17/17.
 */

public class ExampleFragment extends Fragment {
    public ExampleFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.example_fragment, container,false);
        ImageView image = rootView.findViewById(R.id.image);
        image.setImageResource(R.drawable.worm);
        ImageView image1 = rootView.findViewById(R.id.image1);
        image1.setImageResource(R.drawable.worm1);
        return rootView;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
