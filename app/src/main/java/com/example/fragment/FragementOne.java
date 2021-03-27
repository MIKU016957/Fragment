package com.example.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class FragementOne extends Fragment implements View.OnClickListener {
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_one, null);

        textView = view.findViewById(R.id.text_one_id);
        textView.setOnClickListener(this);

        //这里就是把view返回给MainActivity里的方法
        return view;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {
        System.out.println();
        switch (v.getId()) {
            case R.id.text_one_id:
                textView.setTextColor(R.color.black);  //将字体颜色改变
                break;
            default:
                break;
        }

    }
}
