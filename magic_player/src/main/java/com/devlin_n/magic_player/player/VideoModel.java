package com.devlin_n.magic_player.player;

import com.devlin_n.magic_player.controller.BaseMediaController;

/**
 * Created by Devlin_n on 2017/4/11.
 */

public class VideoModel {

    public String url;
    public String title;

    public VideoModel(String url, String title, BaseMediaController controller) {
        this.url = url;
        this.title = title;
        this.controller = controller;
    }

    public BaseMediaController controller;
}
