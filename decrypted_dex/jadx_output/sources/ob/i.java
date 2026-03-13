package ob;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f18652a;

    public i(j jVar) {
        this.f18652a = jVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f18652a.f18653a.f15097c.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f18652a.f18653a.f15097c.loadUrl(str);
        return true;
    }
}
