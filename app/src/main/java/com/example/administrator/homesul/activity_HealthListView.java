package com.example.administrator.homesul;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017-07-01.
 */

public class activity_HealthListView extends Fragment{
    View v;  //뷰 객체를 하나 만들었음.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.activity_HealthListView, container, false);
        return v; //v값 반환
    }
}
