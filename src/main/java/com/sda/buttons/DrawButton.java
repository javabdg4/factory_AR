package com.sda.buttons;

import com.sda.interfaces.Button;

public class DrawButton implements Button {
    @Override
    public void render() {

        System.out.println("CLICK OK");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("THE BUTTON WAS CLICKED");

    }
}
