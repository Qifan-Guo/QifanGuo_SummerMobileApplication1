package com.qifan.qifanguo_summermobileapplication1.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.qifan.qifanguo_summermobileapplication1.DemoBox;
import com.qifan.qifanguo_summermobileapplication1.NinePatchActivity;
import com.qifan.qifanguo_summermobileapplication1.R;
import com.qifan.qifanguo_summermobileapplication1.ScalePagerActivity;
import com.qifan.qifanguo_summermobileapplication1.ViewPagerActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DemoFragment extends Fragment {

    Intent intent;
    private ListView DemolistTextView;



    public DemoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DemolistTextView=getView().findViewById(R.id.demoListView);

        String [] Demolist=DemoBox.getDemoNames();


        ArrayAdapter<String> adapter=new ArrayAdapter<String >(getActivity(),android.R.layout.simple_list_item_1,Demolist);
        DemolistTextView.setAdapter(adapter);
        DemolistTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        intent = new Intent(getActivity(),ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(getActivity(),ScalePagerActivity.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(getActivity(),NinePatchActivity.class);
                        startActivity(intent);
                        break;


                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo, container, false);
    }

}
