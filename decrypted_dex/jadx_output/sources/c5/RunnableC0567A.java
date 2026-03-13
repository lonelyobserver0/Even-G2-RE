package c5;

import android.util.Log;
import android.webkit.WebView;
import com.stub.StubApp;
import e5.C0844c;
import f5.K0;
import i5.C1057a;
import i5.C1059c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sb.C1645f;
import sb.V0;
import sb.W0;

/* renamed from: c5.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class RunnableC0567A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10831e;

    public /* synthetic */ RunnableC0567A(int i3, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f10827a = i3;
        this.f10829c = obj;
        this.f10830d = obj2;
        this.f10831e = obj3;
        this.f10828b = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10827a) {
            case 0:
                C1059c c1059c = (C1059c) this.f10829c;
                c1059c.getClass();
                String string2 = StubApp.getString2(280);
                if (Log.isLoggable(string2, 3)) {
                    Log.d(string2, StubApp.getString2(9416), null);
                }
                ((C1057a) c1059c.f14843b).d((K0) this.f10830d, ((C0844c) this.f10831e).f13607a, this.f10828b);
                break;
            default:
                C1645f callback = new C1645f(11);
                V0 pigeon_instanceArg = (V0) this.f10829c;
                W0 w02 = pigeon_instanceArg.f20913a;
                WebView webViewArg = (WebView) this.f10830d;
                String urlArg = (String) this.f10831e;
                boolean z2 = this.f10828b;
                w02.getClass();
                Intrinsics.checkNotNullParameter(pigeon_instanceArg, "pigeon_instanceArg");
                Intrinsics.checkNotNullParameter(webViewArg, "webViewArg");
                Intrinsics.checkNotNullParameter(urlArg, "urlArg");
                Intrinsics.checkNotNullParameter(callback, "callback");
                B3.s sVar = w02.f21007a;
                sVar.getClass();
                MessageCodec i3 = sVar.i();
                new BasicMessageChannel((BinaryMessenger) sVar.f651c, StubApp.getString2(9415), i3).send(CollectionsKt.listOf(pigeon_instanceArg, webViewArg, urlArg, Boolean.valueOf(z2)), new com.mapbox.common.location.a(7, callback));
                break;
        }
    }
}
