package sb;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stub.StubApp;
import g5.C0955a;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: sb.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1647g extends X2.g {

    /* renamed from: b, reason: collision with root package name */
    public final B3.s f20956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647g(B3.s registrar) {
        super(2);
        Intrinsics.checkNotNullParameter(registrar, "registrar");
        this.f20956b = registrar;
    }

    @Override // X2.g, io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b2, ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (b2 != Byte.MIN_VALUE) {
            return super.readValueOfType(b2, buffer);
        }
        Object readValue = readValue(buffer);
        Intrinsics.checkNotNull(readValue, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) readValue).longValue();
        Object e10 = ((C1637b) this.f20956b.f650b).e(longValue);
        if (e10 == null) {
            Log.e(StubApp.getString2(23288), StubApp.getString2(23287) + longValue);
        }
        return e10;
    }

    @Override // X2.g, io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        int i3 = 5;
        int i10 = 2;
        Intrinsics.checkNotNullParameter(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC1671s) || (obj instanceof EnumC1655k) || (obj instanceof EnumC1612B) || (obj instanceof F0) || (obj instanceof EnumC1611A) || obj == null) {
            super.writeValue(stream, obj);
            return;
        }
        boolean z2 = obj instanceof WebResourceRequest;
        String string2 = StubApp.getString2(696);
        String string22 = StubApp.getString2(23289);
        String string23 = StubApp.getString2(23290);
        B3.s sVar = this.f20956b;
        if (z2) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            X2.q qVar = new X2.q(9);
            Intrinsics.checkNotNullParameter(webResourceRequest, string22);
            Intrinsics.checkNotNullParameter(qVar, string2);
            C1637b c1637b = (C1637b) sVar.f650b;
            if (c1637b.d(webResourceRequest)) {
                Result.Companion companion = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23200), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b.b(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders()), new C1627Q(qVar, 25));
            }
        } else if (obj instanceof WebResourceResponse) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            X2.q qVar2 = new X2.q(11);
            Intrinsics.checkNotNullParameter(webResourceResponse, string22);
            Intrinsics.checkNotNullParameter(qVar2, string2);
            C1637b c1637b2 = (C1637b) sVar.f650b;
            if (c1637b2.d(webResourceResponse)) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23198), sVar.i()).send(CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(c1637b2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())}), new C1627Q(qVar2, 26));
            }
        } else if (obj instanceof WebResourceError) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            WebResourceError webResourceError = (WebResourceError) obj;
            X2.q qVar3 = new X2.q(23);
            Intrinsics.checkNotNullParameter(webResourceError, string22);
            Intrinsics.checkNotNullParameter(qVar3, string2);
            C1637b c1637b3 = (C1637b) sVar.f650b;
            if (c1637b3.d(webResourceError)) {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23204), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b3.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new C1627Q(qVar3, 23));
            }
        } else if (obj instanceof X1.g) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            X1.g gVar = (X1.g) obj;
            X2.q qVar4 = new X2.q(24);
            Intrinsics.checkNotNullParameter(gVar, string22);
            Intrinsics.checkNotNullParameter(qVar4, string2);
            C1637b c1637b4 = (C1637b) sVar.f650b;
            if (c1637b4.d(gVar)) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                long b2 = c1637b4.b(gVar);
                X1.k.f8248b.getClass();
                if (gVar.f8244a == null) {
                    gVar.f8244a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) X1.l.f8251a.f20712b).convertWebResourceError(Proxy.getInvocationHandler(null));
                }
                long errorCode = gVar.f8244a.getErrorCode();
                X1.k.f8247a.getClass();
                if (gVar.f8244a == null) {
                    gVar.f8244a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) X1.l.f8251a.f20712b).convertWebResourceError(Proxy.getInvocationHandler(null));
                }
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23202), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(b2), Long.valueOf(errorCode), gVar.f8244a.getDescription().toString()), new C1627Q(qVar4, 24));
            }
        } else if (obj instanceof Z0) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            Z0 z02 = (Z0) obj;
            X2.q qVar5 = new X2.q(25);
            Intrinsics.checkNotNullParameter(z02, string22);
            Intrinsics.checkNotNullParameter(qVar5, string2);
            C1637b c1637b5 = (C1637b) sVar.f650b;
            if (c1637b5.d(z02)) {
                Result.Companion companion5 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23291), sVar.i()).send(CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(c1637b5.b(z02)), Long.valueOf(z02.f20920a), Long.valueOf(z02.f20921b)}), new C1674t0(qVar5, i3));
            }
        } else if (obj instanceof ConsoleMessage) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            X2.q qVar6 = new X2.q(26);
            Intrinsics.checkNotNullParameter(consoleMessage, string22);
            Intrinsics.checkNotNullParameter(qVar6, string2);
            C1637b c1637b6 = (C1637b) sVar.f650b;
            if (c1637b6.d(consoleMessage)) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                long b10 = c1637b6.b(consoleMessage);
                long lineNumber = consoleMessage.lineNumber();
                String message = consoleMessage.message();
                int i11 = AbstractC1657l.f20972a[consoleMessage.messageLevel().ordinal()];
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17782), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(b10), Long.valueOf(lineNumber), message, i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? EnumC1655k.f20967h : EnumC1655k.f20962c : EnumC1655k.f20963d : EnumC1655k.f20966g : EnumC1655k.f20964e : EnumC1655k.f20965f, consoleMessage.sourceId()), new C0955a(qVar6, 23));
            }
        } else if (obj instanceof CookieManager) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            CookieManager cookieManager = (CookieManager) obj;
            X2.q qVar7 = new X2.q(27);
            Intrinsics.checkNotNullParameter(cookieManager, string22);
            Intrinsics.checkNotNullParameter(qVar7, string2);
            C1637b c1637b7 = (C1637b) sVar.f650b;
            if (c1637b7.d(cookieManager)) {
                Result.Companion companion7 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17780), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b7.b(cookieManager))), new C0955a(qVar7, 24));
            }
        } else if (obj instanceof WebView) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            WebView webView = (WebView) obj;
            X2.q qVar8 = new X2.q(28);
            Intrinsics.checkNotNullParameter(webView, string22);
            Intrinsics.checkNotNullParameter(qVar8, string2);
            C1637b c1637b8 = (C1637b) sVar.f650b;
            if (c1637b8.d(webView)) {
                Result.Companion companion8 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23292), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b8.b(webView))), new C1674t0(qVar8, 0));
            }
        } else if (obj instanceof WebSettings) {
            sVar.getClass();
            Intrinsics.checkNotNullParameter(sVar, string23);
            WebSettings webSettings = (WebSettings) obj;
            X2.q qVar9 = new X2.q(29);
            Intrinsics.checkNotNullParameter(webSettings, string22);
            Intrinsics.checkNotNullParameter(qVar9, string2);
            C1637b c1637b9 = (C1637b) sVar.f650b;
            if (c1637b9.d(webSettings)) {
                Result.Companion companion9 = Result.INSTANCE;
                Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
            } else {
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23196), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b9.b(webSettings))), new C1627Q(qVar9, 27));
            }
        } else {
            boolean z10 = obj instanceof C1681x;
            String string24 = StubApp.getString2(23293);
            if (z10) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                C1681x c1681x = (C1681x) obj;
                C1645f c1645f = new C1645f(0);
                Intrinsics.checkNotNullParameter(c1681x, string22);
                Intrinsics.checkNotNullParameter(c1645f, string2);
                if (((C1637b) sVar.f650b).d(c1681x)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    Result.Companion companion11 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(string24, StubApp.getString2(23294), ""))));
                    Unit unit = Unit.INSTANCE;
                }
            } else if (obj instanceof WebViewClient) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                WebViewClient webViewClient = (WebViewClient) obj;
                X2.q qVar10 = new X2.q(20);
                Intrinsics.checkNotNullParameter(webViewClient, string22);
                Intrinsics.checkNotNullParameter(qVar10, string2);
                C1637b c1637b10 = (C1637b) sVar.f650b;
                if (c1637b10.d(webViewClient)) {
                    Result.Companion companion12 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23295), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b10.b(webViewClient))), new C1674t0(qVar10, i10));
                }
            } else if (obj instanceof DownloadListener) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                DownloadListener downloadListener = (DownloadListener) obj;
                C1645f c1645f2 = new C1645f(1);
                Intrinsics.checkNotNullParameter(downloadListener, string22);
                Intrinsics.checkNotNullParameter(c1645f2, string2);
                if (((C1637b) sVar.f650b).d(downloadListener)) {
                    Result.Companion companion13 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    Result.Companion companion14 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(string24, StubApp.getString2(23296), ""))));
                    Unit unit2 = Unit.INSTANCE;
                }
            } else if (obj instanceof L0) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                L0 l02 = (L0) obj;
                C1645f c1645f3 = new C1645f(2);
                Intrinsics.checkNotNullParameter(l02, string22);
                Intrinsics.checkNotNullParameter(c1645f3, string2);
                if (((C1637b) sVar.f650b).d(l02)) {
                    Result.Companion companion15 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    Result.Companion companion16 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(ResultKt.createFailure(new C1635a(string24, StubApp.getString2(23297), ""))));
                    Unit unit3 = Unit.INSTANCE;
                }
            } else if (obj instanceof C1673t) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                C1673t c1673t = (C1673t) obj;
                C1645f c1645f4 = new C1645f(3);
                Intrinsics.checkNotNullParameter(c1673t, string22);
                Intrinsics.checkNotNullParameter(c1645f4, string2);
                C1637b c1637b11 = (C1637b) sVar.f650b;
                if (c1637b11.d(c1673t)) {
                    Result.Companion companion17 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17772), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b11.b(c1673t))), new C0955a(c1645f4, 29));
                }
            } else if (obj instanceof WebStorage) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                WebStorage webStorage = (WebStorage) obj;
                C1645f c1645f5 = new C1645f(4);
                Intrinsics.checkNotNullParameter(webStorage, string22);
                Intrinsics.checkNotNullParameter(c1645f5, string2);
                C1637b c1637b12 = (C1637b) sVar.f650b;
                if (c1637b12.d(webStorage)) {
                    Result.Companion companion18 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23194), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b12.b(webStorage))), new C1627Q(c1645f5, 28));
                }
            } else if (obj instanceof WebChromeClient.FileChooserParams) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
                C1645f c1645f6 = new C1645f(5);
                Intrinsics.checkNotNullParameter(fileChooserParams, string22);
                Intrinsics.checkNotNullParameter(c1645f6, string2);
                C1637b c1637b13 = (C1637b) sVar.f650b;
                if (c1637b13.d(fileChooserParams)) {
                    Result.Companion companion19 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    long b11 = c1637b13.b(fileChooserParams);
                    boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
                    List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
                    int mode = fileChooserParams.getMode();
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17774), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(b11), Boolean.valueOf(isCaptureEnabled), asList, mode != 0 ? mode != 1 ? mode != 3 ? EnumC1671s.f20992f : EnumC1671s.f20991e : EnumC1671s.f20990d : EnumC1671s.f20989c, fileChooserParams.getFilenameHint()), new C0955a(c1645f6, 28));
                }
            } else if (obj instanceof PermissionRequest) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                PermissionRequest permissionRequest = (PermissionRequest) obj;
                C1645f c1645f7 = new C1645f(6);
                Intrinsics.checkNotNullParameter(permissionRequest, string22);
                Intrinsics.checkNotNullParameter(c1645f7, string2);
                C1637b c1637b14 = (C1637b) sVar.f650b;
                if (c1637b14.d(permissionRequest)) {
                    Result.Companion companion20 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23225), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b14.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new C1627Q(c1645f7, 4));
                }
            } else if (obj instanceof WebChromeClient.CustomViewCallback) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
                C1645f c1645f8 = new C1645f(7);
                Intrinsics.checkNotNullParameter(customViewCallback, string22);
                Intrinsics.checkNotNullParameter(c1645f8, string2);
                C1637b c1637b15 = (C1637b) sVar.f650b;
                if (c1637b15.d(customViewCallback)) {
                    Result.Companion companion21 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17778), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b15.b(customViewCallback))), new C0955a(c1645f8, 25));
                }
            } else if (obj instanceof View) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                View view = (View) obj;
                C1645f c1645f9 = new C1645f(8);
                Intrinsics.checkNotNullParameter(view, string22);
                Intrinsics.checkNotNullParameter(c1645f9, string2);
                C1637b c1637b16 = (C1637b) sVar.f650b;
                if (c1637b16.d(view)) {
                    Result.Companion companion22 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23213), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b16.b(view))), new C1627Q(c1645f9, 15));
                }
            } else if (obj instanceof GeolocationPermissions.Callback) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
                X2.q qVar11 = new X2.q(10);
                Intrinsics.checkNotNullParameter(callback, string22);
                Intrinsics.checkNotNullParameter(qVar11, string2);
                C1637b c1637b17 = (C1637b) sVar.f650b;
                if (c1637b17.d(callback)) {
                    Result.Companion companion23 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23230), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b17.b(callback))), new C1627Q(qVar11, 0));
                }
            } else if (obj instanceof HttpAuthHandler) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
                X2.q qVar12 = new X2.q(12);
                Intrinsics.checkNotNullParameter(httpAuthHandler, string22);
                Intrinsics.checkNotNullParameter(qVar12, string2);
                C1637b c1637b18 = (C1637b) sVar.f650b;
                if (c1637b18.d(httpAuthHandler)) {
                    Result.Companion companion24 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23228), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b18.b(httpAuthHandler))), new C1627Q(qVar12, 2));
                }
            } else if (obj instanceof Message) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                Message message2 = (Message) obj;
                X2.q qVar13 = new X2.q(13);
                Intrinsics.checkNotNullParameter(message2, string22);
                Intrinsics.checkNotNullParameter(qVar13, string2);
                C1637b c1637b19 = (C1637b) sVar.f650b;
                if (c1637b19.d(message2)) {
                    Result.Companion companion25 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17788), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b19.b(message2))), new C0955a(qVar13, 18));
                }
            } else if (obj instanceof ClientCertRequest) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
                X2.q qVar14 = new X2.q(14);
                Intrinsics.checkNotNullParameter(clientCertRequest, string22);
                Intrinsics.checkNotNullParameter(qVar14, string2);
                C1637b c1637b20 = (C1637b) sVar.f650b;
                if (c1637b20.d(clientCertRequest)) {
                    Result.Companion companion26 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17784), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b20.b(clientCertRequest))), new C0955a(qVar14, 22));
                }
            } else if (obj instanceof PrivateKey) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                PrivateKey privateKey = (PrivateKey) obj;
                X2.q qVar15 = new X2.q(15);
                Intrinsics.checkNotNullParameter(privateKey, string22);
                Intrinsics.checkNotNullParameter(qVar15, string2);
                C1637b c1637b21 = (C1637b) sVar.f650b;
                if (c1637b21.d(privateKey)) {
                    Result.Companion companion27 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23223), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b21.b(privateKey))), new C1627Q(qVar15, 7));
                }
            } else if (obj instanceof X509Certificate) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                X509Certificate x509Certificate = (X509Certificate) obj;
                X2.q qVar16 = new X2.q(16);
                Intrinsics.checkNotNullParameter(x509Certificate, string22);
                Intrinsics.checkNotNullParameter(qVar16, string2);
                C1637b c1637b22 = (C1637b) sVar.f650b;
                if (c1637b22.d(x509Certificate)) {
                    Result.Companion companion28 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23298), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b22.b(x509Certificate))), new C1674t0(qVar16, 6));
                }
            } else if (obj instanceof SslErrorHandler) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
                X2.q qVar17 = new X2.q(17);
                Intrinsics.checkNotNullParameter(sslErrorHandler, string22);
                Intrinsics.checkNotNullParameter(qVar17, string2);
                C1637b c1637b23 = (C1637b) sVar.f650b;
                if (c1637b23.d(sslErrorHandler)) {
                    Result.Companion companion29 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23215), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b23.b(sslErrorHandler))), new C1627Q(qVar17, 12));
                }
            } else if (obj instanceof SslError) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                SslError sslError = (SslError) obj;
                X2.q qVar18 = new X2.q(18);
                Intrinsics.checkNotNullParameter(sslError, string22);
                Intrinsics.checkNotNullParameter(qVar18, string2);
                C1637b c1637b24 = (C1637b) sVar.f650b;
                if (c1637b24.d(sslError)) {
                    Result.Companion companion30 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23217), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b24.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new C1627Q(qVar18, 10));
                }
            } else if (obj instanceof SslCertificate.DName) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                SslCertificate.DName dName = (SslCertificate.DName) obj;
                X2.q qVar19 = new X2.q(19);
                Intrinsics.checkNotNullParameter(dName, string22);
                Intrinsics.checkNotNullParameter(qVar19, string2);
                C1637b c1637b25 = (C1637b) sVar.f650b;
                if (c1637b25.d(dName)) {
                    Result.Companion companion31 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23219), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b25.b(dName))), new C1627Q(qVar19, 9));
                }
            } else if (obj instanceof SslCertificate) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                SslCertificate sslCertificate = (SslCertificate) obj;
                X2.q qVar20 = new X2.q(21);
                Intrinsics.checkNotNullParameter(sslCertificate, string22);
                Intrinsics.checkNotNullParameter(qVar20, string2);
                C1637b c1637b26 = (C1637b) sVar.f650b;
                if (c1637b26.d(sslCertificate)) {
                    Result.Companion companion32 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(23221), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b26.b(sslCertificate))), new C1627Q(qVar20, 8));
                }
            } else if (obj instanceof Certificate) {
                sVar.getClass();
                Intrinsics.checkNotNullParameter(sVar, string23);
                Certificate certificate = (Certificate) obj;
                X2.q qVar21 = new X2.q(22);
                Intrinsics.checkNotNullParameter(certificate, string22);
                Intrinsics.checkNotNullParameter(qVar21, string2);
                C1637b c1637b27 = (C1637b) sVar.f650b;
                if (c1637b27.d(certificate)) {
                    Result.Companion companion33 = Result.INSTANCE;
                    Result.m39boximpl(Result.m40constructorimpl(Unit.INSTANCE));
                } else {
                    new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(17786), sVar.i()).send(CollectionsKt.listOf(Long.valueOf(c1637b27.b(certificate))), new C0955a(qVar21, 20));
                }
            }
        }
        if (!((C1637b) sVar.f650b).d(obj)) {
            throw new IllegalArgumentException(StubApp.getString2(18682) + obj + StubApp.getString2(18683) + obj.getClass().getName() + StubApp.getString2(620));
        }
        stream.write(128);
        C1637b c1637b28 = (C1637b) sVar.f650b;
        c1637b28.f();
        Long l9 = (Long) c1637b28.f20932b.get(obj);
        if (l9 != null) {
            HashMap hashMap = c1637b28.f20934d;
            Intrinsics.checkNotNull(obj);
            hashMap.put(l9, obj);
        }
        writeValue(stream, l9);
    }
}
