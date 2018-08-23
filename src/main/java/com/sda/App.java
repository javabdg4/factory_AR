package com.sda;

import com.sda.buttons.DrawDialog;
import com.sda.dialog.HtmlDialog;
import com.sda.dialog.SwingDialog;

public class App {

    private static Dialog dialog;
    private static String type;

    public static void main(String[] args) {
        type = "console";
        configure();
        dialog.renderWindow();
    }

    static void configure() {
        if (type.equals("console")) {
            dialog = new DrawDialog();
        } else if (type.equals("graphics")) {
            dialog = new SwingDialog();
        } else if (type.equals("web")) {
            dialog = new HtmlDialog();
        }
    }
}
