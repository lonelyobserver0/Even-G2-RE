package f4;

import android.app.PendingIntent;
import android.os.Parcel;
import com.stub.StubApp;

/* renamed from: f4.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0880d implements R3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PendingIntent f13744b;

    public /* synthetic */ C0880d(int i3, PendingIntent pendingIntent) {
        this.f13743a = i3;
        this.f13744b = pendingIntent;
    }

    @Override // R3.n
    public final void accept(Object obj, Object obj2) {
        com.google.android.gms.common.d dVar;
        q4.k kVar = (q4.k) obj2;
        switch (this.f13743a) {
            case 0:
                C0877a c0877a = new C0877a(kVar);
                PendingIntent pendingIntent = this.f13744b;
                S3.D.i(pendingIntent, StubApp.getString2(7477));
                R3.o oVar = new R3.o(c0877a);
                F f10 = (F) ((C0874B) obj).t();
                Parcel g10 = f10.g();
                g.b(g10, pendingIntent);
                g10.writeStrongBinder(oVar);
                f10.L(g10, 69);
                break;
            default:
                p pVar = (p) obj;
                com.google.android.gms.common.d[] k3 = pVar.k();
                PendingIntent pendingIntent2 = this.f13744b;
                if (k3 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < k3.length) {
                            dVar = k3[i3];
                            if (!StubApp.getString2(6601).equals(dVar.f11182a)) {
                                i3++;
                            }
                        } else {
                            dVar = null;
                        }
                    }
                    if (dVar != null && dVar.d() >= 1) {
                        F f11 = (F) pVar.t();
                        r rVar = new r(3, null, null, pendingIntent2, null);
                        l lVar = new l(null, kVar);
                        Parcel g11 = f11.g();
                        g.b(g11, rVar);
                        g11.writeStrongBinder(lVar);
                        f11.L(g11, 89);
                        break;
                    }
                }
                ((F) pVar.t()).N(new t(2, null, null, null, pendingIntent2, new i((Boolean) null, kVar), null));
                break;
        }
    }
}
