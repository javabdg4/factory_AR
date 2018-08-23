package com.sda.buttons;

import com.sda.interfaces.Button;
import com.sda.Dialog;

public class DrawDialog extends Dialog {
    @Override
    public Button createButton() {
        return new DrawButton();
    }
}
