package com.qifan.qifanguo_summermobileapplication1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qifan.qifanguo_summermobileapplication1.Bean.Msg;
import com.qifan.qifanguo_summermobileapplication1.R;

import java.util.ArrayList;

public class AdvanceListViewAdapter2 extends BaseAdapter {

    private final Context context;
    private final ArrayList<Msg> list;
    private LayoutInflater inflater;

    public AdvanceListViewAdapter2(ArrayList<Msg> list, Context context){
        this.list=list;
        this.context=context;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Msg getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public class ViewHolder{
        RelativeLayout leftChat;
        TextView leftMsg;
        RelativeLayout rightChat;
        TextView rightMsg;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Msg msg=getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView==null){
            view=inflater.inflate(R.layout.advance_listview_item2,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.leftChat=view.findViewById(R.id.leftChatLayout);
            viewHolder.leftMsg=view.findViewById(R.id.leftMsg);
            viewHolder.rightChat=view.findViewById(R.id.rightChatLayout);
            viewHolder.rightMsg=view.findViewById(R.id.rightMsg);
            view.setTag(viewHolder);
        }
        else {
            view=convertView;
            viewHolder=(ViewHolder) view.getTag();
        }
        if(msg.getType()==msg.Msg_Received){
            viewHolder.leftChat.setVisibility(View.VISIBLE);
            viewHolder.rightChat.setVisibility(View.GONE);
            viewHolder.leftMsg.setText(msg.getContent());
        }
        if(msg.getType()==msg.Msg_Sent){
            viewHolder.rightChat.setVisibility(View.VISIBLE);
            viewHolder.leftChat.setVisibility(View.GONE);
            viewHolder.rightMsg.setText(msg.getContent());
        }




        return view;
    }
}
