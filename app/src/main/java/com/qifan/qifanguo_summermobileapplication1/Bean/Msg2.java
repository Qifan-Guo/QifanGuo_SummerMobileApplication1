package com.qifan.qifanguo_summermobileapplication1.Bean;

public class Msg2 {
    public final int Msg_Received=1;
    public final int Msg_Sent=0;

    private final String content;
    private final int type;

    public Msg2(String content, int type){
        this.content=content;
        this.type=type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
