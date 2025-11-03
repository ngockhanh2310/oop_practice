package com.workspace.exercise.exam10;

public class Document {
    private String text;

    public Document() {
        this.text = "";
    }

    public Document(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
