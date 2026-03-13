package H1;

import Z9.C0366a;
import android.content.Intent;
import android.content.IntentSender;
import com.stub.StubApp;
import f.C0864d;
import f.InterfaceC0862b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import r0.C1548i;
import r0.InterfaceC1546g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2669d;

    public /* synthetic */ a(int i3, int i10, Object obj, Object obj2) {
        this.f2666a = i10;
        this.f2668c = obj;
        this.f2667b = i3;
        this.f2669d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2666a) {
            case 0:
                ((b) this.f2668c).f2671b.c(this.f2667b, (Serializable) this.f2669d);
                break;
            case 1:
                C0366a c0366a = (C0366a) this.f2669d;
                d.j jVar = (d.j) this.f2668c;
                String str = (String) jVar.f13065a.get(Integer.valueOf(this.f2667b));
                if (str != null) {
                    C0864d c0864d = (C0864d) jVar.f13069e.get(str);
                    InterfaceC0862b interfaceC0862b = c0864d != null ? c0864d.f13687a : null;
                    Map map = (Map) c0366a.f9105b;
                    if (interfaceC0862b != null) {
                        InterfaceC0862b interfaceC0862b2 = c0864d.f13687a;
                        Intrinsics.checkNotNull(interfaceC0862b2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (jVar.f13068d.remove(str)) {
                            interfaceC0862b2.f(map);
                            break;
                        }
                    } else {
                        jVar.f13071g.remove(str);
                        jVar.f13070f.put(str, map);
                        break;
                    }
                }
                break;
            case 2:
                ((d.j) this.f2668c).a(this.f2667b, 0, new Intent().setAction(StubApp.getString2(2488)).putExtra(StubApp.getString2(2489), (IntentSender.SendIntentException) this.f2669d));
                break;
            default:
                Iterator it = ((CopyOnWriteArraySet) this.f2668c).iterator();
                while (it.hasNext()) {
                    C1548i c1548i = (C1548i) it.next();
                    if (!c1548i.f20155d) {
                        int i3 = this.f2667b;
                        if (i3 != -1) {
                            c1548i.f20153b.c(i3);
                        }
                        c1548i.f20154c = true;
                        ((InterfaceC1546g) this.f2669d).mo0invoke(c1548i.f20152a);
                    }
                }
                break;
        }
    }
}
