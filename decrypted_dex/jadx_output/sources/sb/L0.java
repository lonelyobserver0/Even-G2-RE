package sb;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L0 extends I0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f20878h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final M0 f20879b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20880c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20881d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20882e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20883f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20884g = false;

    public L0(M0 m02) {
        this.f20879b = m02;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage messageArg) {
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23177), sVar.i()).send(CollectionsKt.listOf(this, messageArg), new C1627Q(callback, 20));
        return this.f20881d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23178), sVar.i()).send(CollectionsKt.listOf(this), new C1627Q(callback, 22));
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String originArg, GeolocationPermissions.Callback callbackArg) {
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(originArg, "originArg");
        Intrinsics.checkNotNullParameter(callbackArg, "callbackArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23179), sVar.i()).send(CollectionsKt.listOf(this, originArg, callbackArg), new C1627Q(callback, 21));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23180), sVar.i()).send(CollectionsKt.listOf(this), new C1627Q(callback, 16));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f20882e) {
            return false;
        }
        J0 result = new J0(this, jsResult, 1);
        Intrinsics.checkNotNullParameter(result, "result");
        X2.u callback = new X2.u(result, 5);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23181), sVar.i()).send(CollectionsKt.listOf(this, webViewArg, urlArg, messageArg), new C1656k0(callback, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webViewArg, String urlArg, String messageArg, JsResult jsResult) {
        if (!this.f20883f) {
            return false;
        }
        J0 result = new J0(this, jsResult, 0);
        Intrinsics.checkNotNullParameter(result, "result");
        X2.u callback = new X2.u(result, 5);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23182), sVar.i()).send(CollectionsKt.listOf(this, webViewArg, urlArg, messageArg), new C1656k0(callback, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, JsPromptResult jsPromptResult) {
        if (!this.f20884g) {
            return false;
        }
        X2.t result = new X2.t(2, this, jsPromptResult);
        Intrinsics.checkNotNullParameter(result, "result");
        X2.u callback = new X2.u(result, 5);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(urlArg, "urlArg");
        Intrinsics.checkNotNullParameter(messageArg, "messageArg");
        Intrinsics.checkNotNullParameter(defaultValueArg, "defaultValueArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23183), sVar.i()).send(CollectionsKt.listOf(this, webViewArg, urlArg, messageArg, defaultValueArg), new C1656k0(callback, 0));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest requestArg) {
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(requestArg, "requestArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23184), sVar.i()).send(CollectionsKt.listOf(this, requestArg), new C1627Q(callback, 18));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webViewArg, int i3) {
        long j = i3;
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23185), sVar.i()).send(CollectionsKt.listOf(this, webViewArg, Long.valueOf(j)), new C1627Q(callback, 17));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View viewArg, WebChromeClient.CustomViewCallback callbackArg) {
        C1645f callback = new C1645f(10);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(viewArg, "viewArg");
        Intrinsics.checkNotNullParameter(callbackArg, "callbackArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23186), sVar.i()).send(CollectionsKt.listOf(this, viewArg, callbackArg), new C1627Q(callback, 19));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webViewArg, final ValueCallback valueCallback, WebChromeClient.FileChooserParams paramsArg) {
        final boolean z2 = this.f20880c;
        Function1 result = new Function1() { // from class: sb.K0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                A0 a02 = (A0) obj;
                L0 l02 = L0.this;
                if (a02.f20847d) {
                    B3.s sVar = l02.f20879b.f20977a;
                    Throwable th = a02.f20846c;
                    Objects.requireNonNull(th);
                    sVar.getClass();
                    B3.s.m(th);
                    return null;
                }
                List list = (List) a02.f20845b;
                Objects.requireNonNull(list);
                if (!z2) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i3 = 0; i3 < list.size(); i3++) {
                    uriArr[i3] = Uri.parse((String) list.get(i3));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(result, "result");
        X2.u callback = new X2.u(result, 5);
        M0 m02 = this.f20879b;
        m02.getClass();
        Intrinsics.checkNotNullParameter(this, "pigeon_instanceArg");
        Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
        Intrinsics.checkNotNullParameter(paramsArg, "paramsArg");
        Intrinsics.checkNotNullParameter(callback, "callback");
        B3.s sVar = m02.f20977a;
        sVar.getClass();
        new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23187), sVar.i()).send(CollectionsKt.listOf(this, webViewArg, paramsArg), new C1656k0(callback, 2));
        return z2;
    }
}
