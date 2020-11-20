package com.matt.mywheelview;

import android.view.MotionEvent;

/**
 * @ Author : 廖健鹏
 * @ Time : 2020/11/9
 * @ e-mail : 329524627@qq.com
 * @ Description :
 */
public final class LoopViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {

    private final MyWheelView wheelView;


    public LoopViewGestureListener(MyWheelView wheelView) {
        this.wheelView = wheelView;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        wheelView.scrollBy(velocityY);
        return true;
    }
}
