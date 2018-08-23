package com.sda.buttons;

import com.sda.interfaces.Button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button> THIS IS BUTTON </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("BUTTON CLICKED on <button>");

    }
}
