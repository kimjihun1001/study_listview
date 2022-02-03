package com.jihoon.study_listview;

import android.graphics.drawable.Drawable;

public class ListViewBtnItem {
    private Drawable iconDrawable;
    private String textStr;

    public void setIcon(Drawable icon) {
        iconDrawable = icon;
    }
    public void setText(String text) {
        textStr = text;
    }

    public Drawable getIcon() {
        // TODO : 여기서 this를 사용해야 하는 이유는? private이라서?
        return this.iconDrawable;
    }
    public String getText() {
        return this.textStr;
    }
}
