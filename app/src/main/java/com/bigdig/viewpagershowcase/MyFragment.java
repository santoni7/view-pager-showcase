package com.bigdig.viewpagershowcase;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragment extends Fragment {

    public static MyFragment newInstance(int bgColor){
        MyFragment f = new MyFragment();
        Bundle args = new Bundle();
        args.putInt("bg", bgColor);
        f.setArguments(args);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(getContext());
        tv.setGravity(Gravity.CENTER);
        tv.setText("MyFragment");
        tv.setBackgroundColor(getArguments().getInt("bg", Color.WHITE));
        return tv;
    }
}
