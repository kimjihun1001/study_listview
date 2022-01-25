package com.jihoon.study_listview;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable iconDrawable;
    private String titleStr;
    private String descStr;

    public void setIcon(Drawable icon) {
        iconDrawable = icon;
    }
    public void setTitle(String title) {
        titleStr = title;
    }
    public void setDesc(String desc) {
        descStr = desc;
    }

    public Drawable getIcon() {
        // TODO : 여기서 this를 사용해야 하는 이유는? private이라서?
        return this.iconDrawable;
    }
    public String getTitle() {
        return this.titleStr;
    }
    public String getDesc() {
        return this.descStr;
    }
}
