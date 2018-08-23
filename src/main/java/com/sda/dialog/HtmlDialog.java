package com.sda.dialog;

import com.sda.Dialog;
import com.sda.buttons.HtmlButton;
import com.sda.interfaces.Button;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
