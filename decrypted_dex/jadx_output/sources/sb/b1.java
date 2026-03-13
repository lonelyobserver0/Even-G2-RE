package sb;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b1 extends WebView implements PlatformView {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20943d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c1 f20944a;

    /* renamed from: b, reason: collision with root package name */
    public WebViewClient f20945b;

    /* renamed from: c, reason: collision with root package name */
    public I0 f20946c;

    public b1(c1 c1Var) {
        super((Context) c1Var.f21002a.f653e);
        this.f20944a = c1Var;
        this.f20945b = new WebViewClient();
        this.f20946c = new I0();
        setWebViewClient(this.f20945b);
        setWebChromeClient(this.f20946c);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final void dispose() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this;
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f20946c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Xa.r rVar;
        super.onAttachedToWindow();
        this.f20944a.f21002a.getClass();
        ViewParent viewParent = this;
        while (true) {
            if (viewParent.getParent() == null) {
                rVar = null;
                break;
            }
            viewParent = viewParent.getParent();
            if (viewParent instanceof Xa.r) {
                rVar = (Xa.r) viewParent;
                break;
            }
        }
        if (rVar != null) {
            rVar.setImportantForAutofill(1);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i3, final int i10, final int i11, final int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        this.f20944a.f21002a.p(new Runnable() { // from class: sb.a1
            @Override // java.lang.Runnable
            public final void run() {
                long j = i3;
                long j3 = i10;
                long j10 = i11;
                long j11 = i12;
                C1645f callback = new C1645f(12);
                b1 pigeon_instanceArg = b1.this;
                c1 c1Var = pigeon_instanceArg.f20944a;
                c1Var.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = c1Var.f21002a;
                sVar.getClass();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23261), sVar.i()).send(CollectionsKt.listOf(pigeon_instanceArg, Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j10), Long.valueOf(j11)), new C1674t0(callback, 1));
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof I0)) {
            throw new AssertionError(StubApp.getString2(23262));
        }
        I0 i02 = (I0) webChromeClient;
        this.f20946c = i02;
        i02.f20870a = this.f20945b;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f20945b = webViewClient;
        this.f20946c.f20870a = webViewClient;
    }
}
