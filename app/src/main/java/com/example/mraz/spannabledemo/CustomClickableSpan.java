package com.example.mraz.spannabledemo;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;


public class CustomClickableSpan extends ClickableSpan {
    Context mContext;

    public CustomClickableSpan(Context context) {
        this.mContext = context;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(mContext,"发生了点击效果", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        super.updateDrawState(ds);
        //设置文本的颜色
        ds.setColor(Color.RED);
        //超链接形式的下划线，false 表示不显示下划线，true表示显示下划线
        ds.setUnderlineText(false);
    }
}
