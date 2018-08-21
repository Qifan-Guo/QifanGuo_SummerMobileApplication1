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

import com.qifan.qifanguo_summermobileapplication1.AdvanceListView;
import com.qifan.qifanguo_summermobileapplication1.AdvanceListView2;
import com.qifan.qifanguo_summermobileapplication1.AnimationActivity;
import com.qifan.qifanguo_summermobileapplication1.CustomDialog;
import com.qifan.qifanguo_summermobileapplication1.DemoBox;

import com.qifan.qifanguo_summermobileapplication1.GestureActivity;
import com.qifan.qifanguo_summermobileapplication1.HandlerActivity;
import com.qifan.qifanguo_summermobileapplication1.MyAnimator;
import com.qifan.qifanguo_summermobileapplication1.NinePatchActivity;
import com.qifan.qifanguo_summermobileapplication1.NotificationActivity;
import com.qifan.qifanguo_summermobileapplication1.R;
import com.qifan.qifanguo_summermobileapplication1.ScalePagerActivity;
import com.qifan.qifanguo_summermobileapplication1.ViewPagerActivity;

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
                    case 3:
                        intent = new Intent(getActivity(),NotificationActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent=new Intent(getActivity(),AdvanceListView.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent=new Intent(getActivity(),AdvanceListView2.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent=new Intent(getActivity(),viewPagerState.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent=new Intent(getActivity(),CustomDialog.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent=new Intent(getActivity(),HandlerActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent=new Intent(getActivity(),AnimationActivity.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent=new Intent(getActivity(),GestureActivity.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent=new Intent(getActivity(),MyAnimator.class);
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
