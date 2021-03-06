package com.example.findreal;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class NewsListViewItem implements Serializable {
    private transient Drawable thumbnailDrawable;
    private String newsTitleStr;
    private String urlStr;
    private String thumbnailUrlStr;

    public void setThumbnail(Drawable thumbnail) {
        this.thumbnailDrawable = thumbnail;
    }

    public void setNewsTitle(String newsTitle) { this.newsTitleStr = newsTitle; }

    public void setUrlStr(String url) { this.urlStr = url; }

    public void setThumbnailUrlStr(String thumbnailUrlStr) { this.thumbnailUrlStr = thumbnailUrlStr; }

    public Drawable getThumbnail() {
        return this.thumbnailDrawable;
    }

    public String getNewsTitle() {
        return this.newsTitleStr;
    }

    public String getUrlStr() { return this.urlStr; }

    public String getThumbnailUrlStr() { return this.thumbnailUrlStr; }
}
