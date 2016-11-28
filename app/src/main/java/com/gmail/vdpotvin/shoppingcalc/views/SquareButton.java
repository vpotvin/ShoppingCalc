package com.gmail.vdpotvin.shoppingcalc.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by vdpotvin on 11/27/16.
 */

public class SquareButton extends Button {

    public SquareButton(Context context) {
        super(context);

    }

    public SquareButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
