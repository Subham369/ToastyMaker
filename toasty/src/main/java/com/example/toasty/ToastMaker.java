package com.example.toasty;

import android.content.Context;
import android.widget.Toast;

public class ToastMaker {

    public static String ToastDisplay(Context context, String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
        return str;
    }
}
