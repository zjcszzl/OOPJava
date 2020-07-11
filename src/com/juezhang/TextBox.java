package com.juezhang;

// Access modifier
public class TextBox extends UIControl {
    // data
    private String text;

    public TextBox() {
        super();
        System.out.println("Text Box");
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
        return this.text;
    }

    // method
    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        this.text = "";
    }
}
