package sb;

import android.webkit.WebView;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f20891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f20892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20893d;

    public /* synthetic */ R0(V0 v02, WebView webView, String str, int i3) {
        this.f20890a = i3;
        this.f20891b = v02;
        this.f20892c = webView;
        this.f20893d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20890a) {
            case 0:
                C1645f callback = new C1645f(11);
                V0 pigeon_instanceArg = this.f20891b;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView webViewArg = this.f20892c;
                String urlArg = this.f20893d;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = w02.f21007a;
                sVar.getClass();
                MessageCodec i3 = sVar.i();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(13729), i3).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, urlArg), new com.mapbox.common.location.a(11, callback));
                break;
            case 1:
                C1645f callback2 = new C1645f(11);
                V0 pigeon_instanceArg2 = this.f20891b;
                W0 w03 = pigeon_instanceArg2.f20913a;
                WebView webViewArg2 = this.f20892c;
                String urlArg2 = this.f20893d;
                w03.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg2, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg2, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg2, "urlArg");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                B3.s sVar2 = w03.f21007a;
                sVar2.getClass();
                MessageCodec i10 = sVar2.i();
                new BasicMessageChannel((BinaryMessenger) sVar2.f651c, StubApp.getString2(13737), i10).send(CollectionsKt.listOf(pigeon_instanceArg2, webViewArg2, urlArg2), new com.mapbox.common.location.a(6, callback2));
                break;
            case 2:
                C1645f callback3 = new C1645f(11);
                V0 pigeon_instanceArg3 = this.f20891b;
                W0 w04 = pigeon_instanceArg3.f20913a;
                WebView viewArg = this.f20892c;
                String urlArg3 = this.f20893d;
                w04.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg3, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg, "viewArg");
                Intrinsics.checkNotNullParameter(urlArg3, "urlArg");
                Intrinsics.checkNotNullParameter(callback3, "callback");
                B3.s sVar3 = w04.f21007a;
                sVar3.getClass();
                MessageCodec i11 = sVar3.i();
                new BasicMessageChannel((BinaryMessenger) sVar3.f651c, StubApp.getString2(13733), i11).send(CollectionsKt.listOf(pigeon_instanceArg3, viewArg, urlArg3), new com.mapbox.common.location.a(9, callback3));
                break;
            case 3:
                C1645f callback4 = new C1645f(11);
                V0 pigeon_instanceArg4 = this.f20891b;
                W0 w05 = pigeon_instanceArg4.f20913a;
                WebView webViewArg3 = this.f20892c;
                String urlArg4 = this.f20893d;
                w05.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg4, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg3, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg4, "urlArg");
                Intrinsics.checkNotNullParameter(callback4, "callback");
                B3.s sVar4 = w05.f21007a;
                sVar4.getClass();
                MessageCodec i12 = sVar4.i();
                new BasicMessageChannel((BinaryMessenger) sVar4.f651c, StubApp.getString2(13723), i12).send(CollectionsKt.listOf(pigeon_instanceArg4, webViewArg3, urlArg4), new com.mapbox.common.location.a(15, callback4));
                break;
            default:
                C1645f callback5 = new C1645f(11);
                V0 pigeon_instanceArg5 = this.f20891b;
                W0 w06 = pigeon_instanceArg5.f20913a;
                WebView viewArg2 = this.f20892c;
                String urlArg5 = this.f20893d;
                w06.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg5, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(viewArg2, "viewArg");
                Intrinsics.checkNotNullParameter(urlArg5, "urlArg");
                Intrinsics.checkNotNullParameter(callback5, "callback");
                B3.s sVar5 = w06.f21007a;
                sVar5.getClass();
                MessageCodec i13 = sVar5.i();
                new BasicMessageChannel((BinaryMessenger) sVar5.f651c, StubApp.getString2(13725), i13).send(CollectionsKt.listOf(pigeon_instanceArg5, viewArg2, urlArg5), new com.mapbox.common.location.a(14, callback5));
                break;
        }
    }
}
