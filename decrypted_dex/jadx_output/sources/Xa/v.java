package Xa;

import android.content.res.AssetManager;
import android.util.Log;
import android.view.KeyEvent;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8602e;

    public /* synthetic */ v(w wVar, Lc.e eVar, long j, KeyEvent keyEvent, int i3) {
        this.f8598a = i3;
        this.f8599b = wVar;
        this.f8600c = eVar;
        this.f8601d = j;
        this.f8602e = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8598a) {
            case 0:
                w wVar = (w) this.f8599b;
                wVar.getClass();
                wVar.c(false, Long.valueOf(((Lc.e) this.f8600c).f4405b), Long.valueOf(this.f8601d), ((KeyEvent) this.f8602e).getEventTime());
                break;
            case 1:
                w wVar2 = (w) this.f8599b;
                wVar2.getClass();
                wVar2.c(false, Long.valueOf(((Lc.e) this.f8600c).f4405b), Long.valueOf(this.f8601d), ((KeyEvent) this.f8602e).getEventTime());
                break;
            default:
                kb.c cVar = (kb.c) this.f8599b;
                cVar.getClass();
                String str = (String) ((D5.r) ((bb.d) this.f8600c).f10745d).f1449c;
                AssetManager assets = hc.b.f14499b.getAssets();
                if (!cVar.f15523a.get()) {
                    A0.c cVar2 = (A0.c) this.f8602e;
                    String string2 = StubApp.getString2(7449);
                    if (cVar2 != null) {
                        Log.i(string2, StubApp.getString2(7450) + Arrays.toString(cVar2.w()));
                        cVar.f15525c = new Ya.c(hc.b.f14499b, cVar2.w());
                    } else {
                        Log.i(string2, StubApp.getString2(7451));
                        cVar.f15525c = new Ya.c(hc.b.f14499b, null);
                    }
                    FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(this.f8601d);
                    if (lookupCallbackInformation != null) {
                        Za.d dVar = cVar.f15525c.f8863c;
                        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(7453));
                        cVar.f15524b = methodChannel;
                        methodChannel.setMethodCallHandler(cVar);
                        dVar.a(new Q2.g(assets, str, lookupCallbackInformation, 29));
                        break;
                    } else {
                        Log.e(string2, StubApp.getString2(7452));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v(kb.c cVar, bb.d dVar, A0.c cVar2, long j) {
        this.f8598a = 2;
        this.f8599b = cVar;
        this.f8600c = dVar;
        this.f8602e = cVar2;
        this.f8601d = j;
    }
}
