package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonOne, buttonTwo, buttonThree;  //三个按钮
    private FragmentManager fragmentManager;  //Fragment 管理器
    private FragmentTransaction fragmentTransaction;  //Fragment 事务处理

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        buttonOne = findViewById(R.id.but_one_id);
        buttonTwo = findViewById(R.id.but_two_id);
        buttonThree = findViewById(R.id.but_three_id);

        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);

        fragmentManager = getFragmentManager(); //得到Fragment 管理器对象

        fragmentTransaction = fragmentManager.beginTransaction(); //开始fragmnet 的事务处理
        //初始化一个 fragment
        FragementOne fragment = new FragementOne(); //实例化 fragment
        fragmentTransaction.add(R.id.fragment_id, fragment); //fragment_id 是布局中给fragment 占位置的控
        fragmentTransaction.commit(); //提交事务
    }

    @Override
    public void onClick(View v) {
        fragmentTransaction = fragmentManager.beginTransaction(); //开始fragmnet 的事务处理
        switch (v.getId()) {
            case R.id.but_one_id:
                fragmentTransaction.replace(R.id.fragment_id, new FragementOne());  //加载第一个 fragment
                fragmentTransaction.addToBackStack(null);  //把 fragment one放到 栈队里  跳转后 返回键可返回
                break;
            case R.id.but_two_id:
                fragmentTransaction.replace(R.id.fragment_id, new FragmentTwo());  //加载第二个 fragment
                fragmentTransaction.addToBackStack(null);  //把 fragment two放到 栈队里 跳转后返回键 可返回
                break;
            case R.id.but_three_id:
                fragmentTransaction.replace(R.id.fragment_id, new FragmentThree());  //加载 第三个 fragment
                fragmentTransaction.addToBackStack(null);  //把 fragment three放到 栈队里 跳转后返回键 可返回
                break;
            default:
                break;
        }

        fragmentTransaction.commit();//提交事务
    }
}
