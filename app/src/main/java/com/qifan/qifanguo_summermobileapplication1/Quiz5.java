package com.qifan.qifanguo_summermobileapplication1;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Quiz5 extends BaseActivity implements View.OnTouchListener {
    private GestureDetector gestureDetector;
    private int sumX=0;
    private int sumY=0;
    private boolean isToast;
    private TextView myView;
    private TextView swipe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        makeToast("QUIZ5");
        gestureDetector=new GestureDetector(this,new simpleGestureListener());
        myView=findViewById(R.id.off);
        swipe=findViewById(R.id.swipe);

//        swipe.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myView.bringToFront();
//                ObjectAnimator animator =
//                        ObjectAnimator.ofFloat(myView, "translationX", 0, 425); //translationY
//                animator.setDuration(2000);
//                animator.start();
//
//            }
//        });

        boolean offscreen =true;

        int xOffset = (offscreen) ? 425 : 0;
        RelativeLayout.LayoutParams rlParams =
                (RelativeLayout.LayoutParams)myView.getLayoutParams();
        rlParams.setMargins(-1*xOffset, 0, xOffset, 0);
        myView.setLayoutParams(rlParams);
        swipe.setTranslationZ(0);
        myView.setTranslationZ(2);

        swipe.setOnTouchListener(this);
        swipe.setFocusable(true);
        swipe.setClickable(true);
        swipe.setLongClickable(true);

    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }


    class simpleGestureListener extends GestureDetector.SimpleOnGestureListener{
        public simpleGestureListener() {
        }
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            Log.d("Gesture","onScroll");
//            UtilLog.d("Gesture","distanceX:"+distanceX);
//            UtilLog.d("Gesture","distanceY:"+distanceY);
            sumX+=distanceX;
            sumY+=distanceY;

                if(sumX<0){
                    if(Math.abs(sumX)>800){
                        myView.bringToFront();
                        ObjectAnimator animator =
                                ObjectAnimator.ofFloat(myView, "translationX", 0, 425); //translationY
                        animator.setDuration(1000);
                        animator.start();


                    }
                }
                if(sumX>0){
                    if(Math.abs(sumX)>800){
                        ObjectAnimator animator =
                                ObjectAnimator.ofFloat(myView, "translationX", 425, 0); //translationY
                        animator.setDuration(1000);
                        animator.start();
                    }
                }

                if(sumY<0){
                    if(Math.abs(sumY)>1000){
                        isToast = true;
                        makeToast("You scroll from top to bottom");
                    }
                }
                if(sumY>0){
                    if(Math.abs(sumY)>1000){
                        isToast = true;
                        makeToast("You scroll from bottom to top");
                    }
                }



            return super.onScroll(e1, e2, distanceX, distanceY);
        }
        @Override
        public boolean onDown(MotionEvent e) {
            Log.d("Gesture","onDown");
            isToast=false;
            sumX=0;
            sumY=0;
            return super.onDown(e);
        }
    }
}
