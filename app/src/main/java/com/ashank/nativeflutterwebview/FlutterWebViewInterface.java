package com.ashank.nativeflutterwebview;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;

/**
 * Created by ashankbharati on 01,October,2020
 */
public class FlutterWebViewInterface {
    Context context;

    public FlutterWebViewInterface(Context c) {
        context = c;
    }

    @JavascriptInterface
    public String getString() {
        return "Hello from Native"; // FlutterCoreMethodHandler.getHostName();
    }
}
