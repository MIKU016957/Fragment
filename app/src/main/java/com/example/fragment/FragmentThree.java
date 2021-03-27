package com.example.fragment;
import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentThree extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_three, null);

        textView = (TextView) view.findViewById(R.id.text_three_id);

        //这里就是把view返回给MainActivity里的方法
        return view;
    }

}