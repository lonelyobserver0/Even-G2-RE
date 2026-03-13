package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface WebMessageListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z2, InvocationHandler invocationHandler2);
}
