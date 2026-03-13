package sb;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class I0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public WebViewClient f20870a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f20870a == null) {
            return false;
        }
        webView2.setWebViewClient(new H0(this, webView));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
