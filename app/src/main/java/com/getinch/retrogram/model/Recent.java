package com.getinch.retrogram.model;

import java.util.List;

public class Recent {

    private Pagination pagination;
    private List<Media> data;

    public Pagination getPagination() {
        return pagination;
    }

    public List<Media> getMediaList() {
        return data;
    }

}
