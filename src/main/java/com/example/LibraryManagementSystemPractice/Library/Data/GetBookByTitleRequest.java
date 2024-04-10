package com.example.LibraryManagementSystemPractice.Library.Data;

public class GetBookByTitleRequest {

    private final String title;


    public GetBookByTitleRequest(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
