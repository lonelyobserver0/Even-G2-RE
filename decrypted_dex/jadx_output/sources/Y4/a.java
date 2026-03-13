package Y4;

import I4.e;
import R3.l;
import Z9.C0366a;
import android.os.Bundle;
import android.util.Log;
import b5.InterfaceC0520a;
import c5.q;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import w5.InterfaceC1865a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements InterfaceC0520a, a5.a, InterfaceC1865a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f8742a;

    public /* synthetic */ a(l lVar) {
        this.f8742a = lVar;
    }

    @Override // w5.InterfaceC1865a
    public void c(w5.b bVar) {
        l lVar = this.f8742a;
        lVar.getClass();
        Z4.c cVar = Z4.c.f8980a;
        cVar.c(StubApp.getString2(7528));
        T4.a aVar = (T4.a) bVar.get();
        A0.c cVar2 = new A0.c(aVar);
        V6.b bVar2 = new V6.b(2, false);
        T4.b bVar3 = (T4.b) aVar;
        e b2 = bVar3.b(StubApp.getString2(56), bVar2);
        if (b2 == null) {
            String string2 = StubApp.getString2(280);
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(7529), null);
            }
            e b10 = bVar3.b(StubApp.getString2(7530), bVar2);
            if (b10 != null) {
                Log.w(string2, StubApp.getString2(7531), null);
            }
            b2 = b10;
        }
        if (b2 == null) {
            cVar.g(StubApp.getString2(7533), null);
            return;
        }
        cVar.c(StubApp.getString2(7532));
        C0366a c0366a = new C0366a(1, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a5.c cVar3 = new a5.c(cVar2);
        synchronized (lVar) {
            try {
                Iterator it = ((ArrayList) lVar.f6140a).iterator();
                while (it.hasNext()) {
                    c0366a.u((q) it.next());
                }
                bVar2.f7762c = c0366a;
                bVar2.f7761b = cVar3;
                lVar.f6142c = c0366a;
                lVar.f6141b = cVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a5.a
    public void m(Bundle bundle) {
        ((a5.a) this.f8742a.f6141b).m(bundle);
    }

    @Override // b5.InterfaceC0520a
    public void u(q qVar) {
        l lVar = this.f8742a;
        synchronized (lVar) {
            if (((InterfaceC0520a) lVar.f6142c) instanceof b5.b) {
                ((ArrayList) lVar.f6140a).add(qVar);
            }
            ((InterfaceC0520a) lVar.f6142c).u(qVar);
        }
    }
}
