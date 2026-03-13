package ob;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f18653a;

    public j(WebViewActivity webViewActivity) {
        this.f18653a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        i iVar = new i(this);
        WebView webView2 = new WebView(this.f18653a.f15097c.getContext());
        webView2.setWebViewClient(iVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
