package R3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;
import java.util.Map;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E extends w {

    /* renamed from: b, reason: collision with root package name */
    public final Fb.a f6090b;

    /* renamed from: c, reason: collision with root package name */
    public final q4.k f6091c;

    /* renamed from: d, reason: collision with root package name */
    public final C0232a f6092d;

    public E(int i3, Fb.a aVar, q4.k kVar, C0232a c0232a) {
        super(i3);
        this.f6091c = kVar;
        this.f6090b = aVar;
        this.f6092d = c0232a;
        if (i3 == 2 && aVar.f2345a) {
            throw new IllegalArgumentException(StubApp.getString2(5618));
        }
    }

    @Override // R3.w
    public final boolean a(r rVar) {
        return this.f6090b.f2345a;
    }

    @Override // R3.w
    public final com.google.android.gms.common.d[] b(r rVar) {
        return (com.google.android.gms.common.d[]) this.f6090b.f2347c;
    }

    @Override // R3.w
    public final void c(Status status) {
        this.f6092d.getClass();
        this.f6091c.c(status.f11172c != null ? new Q3.m(status) : new Q3.e(status));
    }

    @Override // R3.w
    public final void d(RuntimeException runtimeException) {
        this.f6091c.c(runtimeException);
    }

    @Override // R3.w
    public final void e(r rVar) {
        q4.k kVar = this.f6091c;
        try {
            Fb.a aVar = this.f6090b;
            ((n) ((Fb.a) aVar.f2348d).f2347c).accept(rVar.f6149f, kVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            c(w.g(e11));
        } catch (RuntimeException e12) {
            kVar.c(e12);
        }
    }

    @Override // R3.w
    public final void f(E0 e02, boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        Map map = (Map) e02.f16038c;
        q4.k kVar = this.f6091c;
        map.put(kVar, valueOf);
        kVar.f20051a.addOnCompleteListener(new Z9.C(e02, kVar, 21, false));
    }
}
