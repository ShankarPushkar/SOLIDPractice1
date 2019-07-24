package com.stackroute.solidprinciples;

public class EditorDefinition {
    String text;
    String author;
    int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "EditorDefinition{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", length=" + length +
                '}';
    }


}
