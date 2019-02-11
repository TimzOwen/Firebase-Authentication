package com.example.firebase;

public class post {
    private  String title, comment;

    public  post()
    {

    }
    public  post(String title, String comment)
    {
        this.comment = comment;
        this.title = title;
    }
    public  String getTitle()
    {
        return  title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}




