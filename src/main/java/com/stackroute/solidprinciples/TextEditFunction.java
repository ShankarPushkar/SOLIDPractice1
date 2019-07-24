package com.stackroute.solidprinciples;

public class TextEditFunction extends EditorDefinition {
    public void allLettersToUpperCase() {
        System.out.println(author.toUpperCase());
    }

    public void findSubTextAndDelete(String s) {
        author=author.replaceAll(s," ");
        System.out.println(author);

    }

}
