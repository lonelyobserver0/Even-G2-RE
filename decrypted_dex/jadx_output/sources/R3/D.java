package R3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l4.E0;
import r0.C1552m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D extends w {

    /* renamed from: b, reason: collision with root package name */
    public final q4.k f6087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6088c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6089d;

    public D(int i3, q4.k kVar) {
        super(i3);
        this.f6087b = kVar;
    }

    private final /* bridge */ /* synthetic */ void i(E0 e02, boolean z2) {
    }

    private final /* bridge */ /* synthetic */ void j(E0 e02, boolean z2) {
    }

    @Override // R3.w
    public final boolean a(r rVar) {
        switch (this.f6088c) {
            case 0:
                ((A) this.f6089d).f6077a.getClass();
                return true;
            default:
                return ((A) rVar.j.get((C0241j) this.f6089d)) != null;
        }
    }

    @Override // R3.w
    public final com.google.android.gms.common.d[] b(r rVar) {
        switch (this.f6088c) {
            case 0:
                ((A) this.f6089d).f6077a.getClass();
                break;
            default:
                break;
        }
        return null;
    }

    @Override // R3.w
    public final void c(Status status) {
        this.f6087b.c(new Q3.e(status));
    }

    @Override // R3.w
    public final void d(RuntimeException runtimeException) {
        this.f6087b.c(runtimeException);
    }

    @Override // R3.w
    public final void e(r rVar) {
        try {
            h(rVar);
        } catch (DeadObjectException e10) {
            c(w.g(e10));
            throw e10;
        } catch (RemoteException e11) {
            c(w.g(e11));
        } catch (RuntimeException e12) {
            this.f6087b.c(e12);
        }
    }

    @Override // R3.w
    public final /* bridge */ /* synthetic */ void f(E0 e02, boolean z2) {
        int i3 = this.f6088c;
    }

    public final void h(r rVar) {
        switch (this.f6088c) {
            case 0:
                Bc.i iVar = ((A) this.f6089d).f6077a;
                ((n) ((C1552m) iVar.f768d).f20170b).accept(rVar.f6149f, this.f6087b);
                C0241j c0241j = (C0241j) ((l) ((A) this.f6089d).f6077a.f767c).f6142c;
                if (c0241j != null) {
                    rVar.j.put(c0241j, (A) this.f6089d);
                    break;
                }
                break;
            default:
                A a3 = (A) rVar.j.remove((C0241j) this.f6089d);
                q4.k kVar = this.f6087b;
                if (a3 == null) {
                    kVar.d(Boolean.FALSE);
                    break;
                } else {
                    ((n) ((C1552m) a3.f6078b.f9078c).f20171c).accept(rVar.f6149f, kVar);
                    ((l) a3.f6077a.f767c).a();
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D(C0241j c0241j, q4.k kVar) {
        this(4, kVar);
        this.f6088c = 1;
        this.f6089d = c0241j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D(A a3, q4.k kVar) {
        this(3, kVar);
        this.f6088c = 0;
        this.f6089d = a3;
    }
}
