package com.deceax.databinding;

import android.support.design.widget.Snackbar;
import android.view.View;

import com.deceax.databinding.model.Status;

public class ClickHandler {
    private final Status status;

    public ClickHandler(Status status) {
        this.status = status;
    }

    public void onClick(View view) {
        Snackbar.make(view, "Item click", Snackbar.LENGTH_LONG).show();
    }
}
