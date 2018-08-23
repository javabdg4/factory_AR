package com.sda.dialog;

import com.sda.Dialog;
import com.sda.buttons.SwingButton;
import com.sda.interfaces.Button;

public class SwingDialog extends Dialog {
    @Override
    public Button createButton() {
        return new SwingButton();
    }
}
