package Vc;

import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f7978b;

    public /* synthetic */ a(b bVar, int i3) {
        this.f7977a = i3;
        this.f7978b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.f7977a) {
            case 0:
                this.f7978b.f7986f.d(1, StubApp.getString2(25779));
                break;
            default:
                b bVar = this.f7978b;
                try {
                    j = bVar.f7982b.c();
                } catch (Exception e10) {
                    System.out.println(e10.toString());
                    j = 0;
                }
                bVar.getClass();
                Wc.b bVar2 = bVar.f7986f;
                bVar2.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2(2091), Integer.valueOf((int) j));
                hashMap.put(StubApp.getString2(291), Integer.valueOf(bVar2.h()));
                bVar2.e(StubApp.getString2(25778), hashMap);
                break;
        }
    }
}
