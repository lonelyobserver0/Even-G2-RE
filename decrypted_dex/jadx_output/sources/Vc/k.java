package Vc;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f8030c;

    public /* synthetic */ k(n nVar, ArrayList arrayList, int i3) {
        this.f8028a = i3;
        this.f8030c = nVar;
        this.f8029b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8028a) {
            case 0:
                Wc.d dVar = this.f8030c.j.f8020d;
                dVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2(1485), this.f8029b);
                dVar.e(StubApp.getString2(25812), hashMap);
                break;
            default:
                Wc.d dVar2 = this.f8030c.j.f8020d;
                dVar2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(StubApp.getString2(1485), this.f8029b);
                dVar2.e(StubApp.getString2(25811), hashMap2);
                break;
        }
    }
}
