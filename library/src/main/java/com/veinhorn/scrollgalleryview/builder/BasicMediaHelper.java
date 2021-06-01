package com.veinhorn.scrollgalleryview.builder;

import android.view.ViewGroup;

import com.veinhorn.scrollgalleryview.MediaInfo;
import com.veinhorn.scrollgalleryview.loader.DefaultVideoLoader;

/**
 * Basic implementation of MediaHelper which supports adding video
 */
public abstract class BasicMediaHelper implements MediaHelper {
    @Override
    public MediaInfo video(String url, int placeholderViewId) {
        return MediaInfo.mediaLoader(new DefaultVideoLoader(url, placeholderViewId), ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }
}
