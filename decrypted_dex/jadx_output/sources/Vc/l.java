package Vc;

import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f8032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f8033c;

    public /* synthetic */ l(n nVar, byte[] bArr, int i3) {
        this.f8031a = i3;
        this.f8033c = nVar;
        this.f8032b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8031a) {
            case 0:
                Wc.d dVar = this.f8033c.j.f8020d;
                dVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2(1485), this.f8032b);
                dVar.e(StubApp.getString2(25813), hashMap);
                break;
            default:
                Wc.d dVar2 = this.f8033c.j.f8020d;
                dVar2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(StubApp.getString2(1485), this.f8032b);
                dVar2.e(StubApp.getString2(25813), hashMap2);
                break;
        }
    }
}
