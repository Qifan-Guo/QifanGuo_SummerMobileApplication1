package com.qifan.qifanguo_summermobileapplication1.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.qifan.qifanguo_summermobileapplication1.Quiz4;
import com.qifan.qifanguo_summermobileapplication1.Quiz5;
import com.qifan.qifanguo_summermobileapplication1.R;
import com.qifan.qifanguo_summermobileapplication1.ViewPagerActivity;
import com.qifan.qifanguo_summermobileapplication1.quiz2_Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment {
    private Button button;


    public WorkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work, container, false);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       if(data==null){
           Log.d("LOG1","NUll");
       };
       Toast.makeText(this.getContext(),"EXIT",Toast.LENGTH_SHORT).show();


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button=getView().findViewById(R.id.workButton);
        button.setText("QUIZ 5");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Quiz5.class);
                startActivityForResult(intent,1);
            }
        });



    }
}
