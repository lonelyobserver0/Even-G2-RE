package sb;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f20866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f20867b;

    public H0(I0 i02, WebView webView) {
        this.f20867b = i02;
        this.f20866a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f20867b.f20870a;
        WebView webView2 = this.f20866a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f20867b.f20870a;
        WebView webView2 = this.f20866a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, str)) {
            return true;
        }
        webView2.loadUrl(str);
        return true;
    }
}
