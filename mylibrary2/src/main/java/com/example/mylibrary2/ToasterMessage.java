package com.example.mylibrary2;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static void showToastMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
