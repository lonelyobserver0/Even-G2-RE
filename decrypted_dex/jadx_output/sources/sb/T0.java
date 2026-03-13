package sb;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20901a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f20902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f20903c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20906f;

    public /* synthetic */ T0(V0 v02, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f20902b = v02;
        this.f20903c = webView;
        this.f20906f = httpAuthHandler;
        this.f20904d = str;
        this.f20905e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20901a) {
            case 0:
                C1645f callback = new C1645f(11);
                V0 pigeon_instanceArg = this.f20902b;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView viewArg = this.f20903c;
                String realmArg = this.f20904d;
                String str = this.f20905e;
                String argsArg = (String) this.f20906f;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(realmArg, "realmArg");
                Intrinsics.checkNotNullParameter(argsArg, "argsArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = w02.f21007a;
                sVar.getClass();
                MessageCodec i3 = sVar.i();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(13731), i3).send(CollectionsKt.listOf(pigeon_instanceArg, viewArg, realmArg, str, argsArg), new com.mapbox.common.location.a(10, callback));
                break;
            default:
                C1645f callback2 = new C1645f(11);
                V0 pigeon_instanceArg2 = this.f20902b;
                W0 w03 = pigeon_instanceArg2.f20913a;
                WebView webViewArg = this.f20903c;
                HttpAuthHandler handlerArg = (HttpAuthHandler) this.f20906f;
                String hostArg = this.f20904d;
                String realmArg2 = this.f20905e;
                w03.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(handlerArg, "handlerArg");
                Intrinsics.checkNotNullParameter(hostArg, "hostArg");
                Intrinsics.checkNotNullParameter(realmArg2, "realmArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                B3.s sVar2 = w03.f21007a;
                sVar2.getClass();
                MessageCodec i10 = sVar2.i();
                new BasicMessageChannel((BinaryMessenger) sVar2.f651c, StubApp.getString2(13719), i10).send(CollectionsKt.listOf(pigeon_instanceArg2, webViewArg, handlerArg, hostArg, realmArg2), new com.mapbox.common.location.a(17, callback2));
                break;
        }
    }

    public /* synthetic */ T0(V0 v02, WebView webView, String str, String str2, String str3) {
        this.f20902b = v02;
        this.f20903c = webView;
        this.f20904d = str;
        this.f20905e = str2;
        this.f20906f = str3;
    }
}
