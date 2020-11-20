package com.matt.mywheelview;

import android.os.Handler;
import android.os.Message;

/**
 * @ Author : 廖健鹏
 * @ Time : 2020/11/9
 * @ e-mail : 329524627@qq.com
 * @ Description :MyWheelView的消息类
 */
public final class MessageHandler extends Handler {
    public static final int WHAT_INVALIDATE_LOOP_VIEW = 1000;
    public static final int WHAT_SMOOTH_SCROLL = 2000;
    public static final int WHAT_ITEM_SELECTED = 3000;

    private final MyWheelView wheelView;

    public MessageHandler(MyWheelView wheelView) {
        this.wheelView = wheelView;
    }

    @Override
    public final void handleMessage(Message msg) {
        switch (msg.what) {
            case WHAT_INVALIDATE_LOOP_VIEW:
                wheelView.invalidate();
                break;

            case WHAT_SMOOTH_SCROLL:
                wheelView.smoothScroll(MyWheelView.ACTION.FLING);
                break;

            case WHAT_ITEM_SELECTED:
                wheelView.onItemSelected();
                break;
        }
    }

}
