package com.juezhang;


// final class cannot be extended anymore.
public abstract class UIControl {
    private boolean isEnabled = true;
    // protected: limited in the package
    /*
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UI Control");
    }
    */

    //abstrct class
    public abstract void render();

    public void enable(){
        this.isEnabled = true;
    }
    public void disable(){
        this.isEnabled = false;
    }
    public boolean isEnabled(){
        return this.isEnabled;
    }
}
