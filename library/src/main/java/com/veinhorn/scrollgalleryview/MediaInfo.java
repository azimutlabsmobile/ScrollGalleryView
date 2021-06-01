package com.veinhorn.scrollgalleryview;

import com.veinhorn.scrollgalleryview.loader.MediaLoader;

/**
 * MediaInfo contains the information required to load and display the media in the gallery.
 */
public class MediaInfo {

    private MediaLoader mLoader;
    private int width;
    private int height;

    public static MediaInfo mediaLoader(MediaLoader mediaLoader, int width, int height) {
        return new MediaInfo().setLoader(mediaLoader).setHeight(height).setWidth(width);
    }

    public MediaLoader getLoader() {
        return mLoader;
    }

    public MediaInfo setLoader(MediaLoader loader) {
        mLoader = loader;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public MediaInfo setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public MediaInfo setWidth(int width) {
        this.width = width;
        return this;
    }

}
