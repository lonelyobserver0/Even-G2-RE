package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebViewRendererClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onRendererResponsive(WebView webView, InvocationHandler invocationHandler);

    void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler);
}
