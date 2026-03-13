package sb;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c5.RunnableC0567A;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class V0 extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20912c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final W0 f20913a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20914b = false;

    public V0(W0 w02) {
        this.f20913a = w02;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        this.f20913a.f21007a.p(new RunnableC0567A(1, this, webView, str, z2));
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f20913a.f21007a.p(new G3.a(6, this, webView, message, message2));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f20913a.f21007a.p(new R0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f20913a.f21007a.p(new R0(this, webView, str, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f20913a.f21007a.p(new R0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f20913a.f21007a.p(new R0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f20913a.f21007a.p(new Ab.c(this, webView, clientCertRequest, 15));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(final WebView webView, final int i3, final String str, final String str2) {
        this.f20913a.f21007a.p(new Runnable() { // from class: sb.S0
            @Override // java.lang.Runnable
            public final void run() {
                long j = i3;
                C1645f callback = new C1645f(11);
                V0 pigeon_instanceArg = V0.this;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView webViewArg = webView;
                String descriptionArg = str;
                String failingUrlArg = str2;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(descriptionArg, "descriptionArg");
                Intrinsics.checkNotNullParameter(failingUrlArg, "failingUrlArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = w02.f21007a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(13721), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, Long.valueOf(j), descriptionArg, failingUrlArg), new com.mapbox.common.location.a(16, callback));
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f20913a.f21007a.p(new T0(this, webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f20913a.f21007a.p(new G3.a(9, this, webView, webResourceRequest, webResourceResponse));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f20913a.f21007a.p(new T0(this, webView, str, str2, str3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f20913a.f21007a.p(new G3.a(7, this, webView, sslErrorHandler, sslError));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f10, final float f11) {
        this.f20913a.f21007a.p(new Runnable() { // from class: sb.U0
            @Override // java.lang.Runnable
            public final void run() {
                double d8 = f10;
                double d10 = f11;
                C1645f callback = new C1645f(11);
                V0 pigeon_instanceArg = V0.this;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView viewArg = webView;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = w02.f21007a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(13715), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, Double.valueOf(d8), Double.valueOf(d10)), new com.mapbox.common.location.a(20, callback));
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f20913a.f21007a.p(new Ab.c(this, webView, webResourceRequest, 16));
        return webResourceRequest.isForMainFrame() && this.f20914b;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f20913a.f21007a.p(new G3.a(8, this, webView, webResourceRequest, webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f20913a.f21007a.p(new R0(this, webView, str, 1));
        return this.f20914b;
    }
}
