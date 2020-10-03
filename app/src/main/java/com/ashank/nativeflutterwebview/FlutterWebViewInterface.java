package com.ashank.nativeflutterwebview;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by ashankbharati on 01,October,2020
 */
public class FlutterWebViewInterface {
    Context context;

    public FlutterWebViewInterface(Context c) {
        context = c;
    }
    //this method is called by flutter web before initialisation
    @JavascriptInterface
    public String getString() {
        return "Hello from Native"; 
    }
}
