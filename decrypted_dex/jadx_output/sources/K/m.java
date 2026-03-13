package K;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.L;
import com.stub.StubApp;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l4.BinderC1212t0;
import l4.C1164b0;
import l4.C1172e;
import l4.C1189j1;
import l4.C1200n0;
import l4.C1215v;
import l4.EnumC1222y0;
import l4.H1;
import l4.InterfaceC1151G;
import l4.K1;
import l4.M1;
import l4.P0;
import l4.T;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3570a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3571b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3572c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3573d;

    public /* synthetic */ m(int i3) {
        this.f3570a = i3;
    }

    private final void a() {
        AtomicReference atomicReference;
        C1189j1 c1189j1;
        C1200n0 c1200n0;
        C1164b0 c1164b0;
        AtomicReference atomicReference2 = (AtomicReference) this.f3571b;
        synchronized (atomicReference2) {
            try {
                try {
                    c1189j1 = (C1189j1) this.f3573d;
                    c1200n0 = (C1200n0) c1189j1.f4728a;
                    c1164b0 = c1200n0.f16540e;
                    C1200n0.j(c1164b0);
                } catch (RemoteException e10) {
                    T t3 = ((C1200n0) ((C1189j1) this.f3573d).f4728a).f16541f;
                    C1200n0.l(t3);
                    t3.f16242f.c(e10, StubApp.getString2("3126"));
                    atomicReference = (AtomicReference) this.f3571b;
                }
                if (c1164b0.r().i(EnumC1222y0.f16685c)) {
                    InterfaceC1151G interfaceC1151G = c1189j1.f16480d;
                    if (interfaceC1151G != null) {
                        atomicReference2.set(interfaceC1151G.w((M1) this.f3572c));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            P0 p02 = ((C1200n0) c1189j1.f4728a).f16547n;
                            C1200n0.k(p02);
                            p02.f16210g.set(str);
                            C1164b0 c1164b02 = c1200n0.f16540e;
                            C1200n0.j(c1164b02);
                            c1164b02.f16372g.l(str);
                        }
                        c1189j1.x();
                        atomicReference = (AtomicReference) this.f3571b;
                        atomicReference.notify();
                        return;
                    }
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.b(StubApp.getString2("3126"));
                    atomicReference2.notify();
                } else {
                    T t11 = c1200n0.f16541f;
                    C1200n0.l(t11);
                    t11.f16246l.b(StubApp.getString2("3125"));
                    P0 p03 = ((C1200n0) c1189j1.f4728a).f16547n;
                    C1200n0.k(p03);
                    p03.f16210g.set(null);
                    C1164b0 c1164b03 = c1200n0.f16540e;
                    C1200n0.j(c1164b03);
                    c1164b03.f16372g.l(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f3571b).notify();
                throw th;
            }
        }
    }

    private final void b() {
        C1200n0 c1200n0;
        boolean i3;
        C1200n0 c1200n02;
        C1164b0 c1164b0;
        T t3;
        String string2 = StubApp.getString2(3126);
        L l9 = (L) this.f3572c;
        C1189j1 c1189j1 = (C1189j1) this.f3573d;
        String str = null;
        try {
            try {
                c1200n0 = (C1200n0) c1189j1.f4728a;
                C1164b0 c1164b02 = c1200n0.f16540e;
                C1200n0.j(c1164b02);
                i3 = c1164b02.r().i(EnumC1222y0.f16685c);
                c1200n02 = (C1200n0) c1189j1.f4728a;
                c1164b0 = c1200n0.f16540e;
                t3 = c1200n0.f16541f;
            } catch (RemoteException e10) {
                T t10 = ((C1200n0) c1189j1.f4728a).f16541f;
                C1200n0.l(t10);
                t10.f16242f.c(e10, string2);
            }
            if (i3) {
                InterfaceC1151G interfaceC1151G = c1189j1.f16480d;
                if (interfaceC1151G != null) {
                    str = interfaceC1151G.w((M1) this.f3571b);
                    if (str != null) {
                        P0 p02 = c1200n02.f16547n;
                        C1200n0.k(p02);
                        p02.f16210g.set(str);
                        C1200n0.j(c1164b0);
                        c1164b0.f16372g.l(str);
                    }
                    c1189j1.x();
                    K1 k12 = ((C1200n0) c1189j1.f4728a).j;
                    C1200n0.j(k12);
                    k12.S(str, l9);
                    return;
                }
                C1200n0.l(t3);
                t3.f16242f.b(string2);
            } else {
                C1200n0.l(t3);
                t3.f16246l.b(StubApp.getString2("3125"));
                P0 p03 = c1200n02.f16547n;
                C1200n0.k(p03);
                p03.f16210g.set(null);
                C1200n0.j(c1164b0);
                c1164b0.f16372g.l(null);
            }
            K1 k13 = c1200n0.j;
            C1200n0.j(k13);
            k13.S(null, l9);
        } catch (Throwable th) {
            K1 k14 = ((C1200n0) c1189j1.f4728a).j;
            C1200n0.j(k14);
            k14.S(null, l9);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0336  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.m.run():void");
    }

    public /* synthetic */ m(int i3, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f3570a = i3;
        this.f3571b = obj2;
        this.f3572c = obj3;
        this.f3573d = obj;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i3) {
        this.f3570a = i3;
        this.f3571b = obj;
        this.f3572c = obj2;
        this.f3573d = obj3;
    }

    public m(BinderC1212t0 binderC1212t0, C1172e c1172e, M1 m12) {
        this.f3570a = 8;
        this.f3571b = c1172e;
        this.f3572c = m12;
        Objects.requireNonNull(binderC1212t0);
        this.f3573d = binderC1212t0;
    }

    public m(BinderC1212t0 binderC1212t0, C1215v c1215v, String str) {
        this.f3570a = 10;
        this.f3571b = c1215v;
        this.f3572c = str;
        Objects.requireNonNull(binderC1212t0);
        this.f3573d = binderC1212t0;
    }

    public m(BinderC1212t0 binderC1212t0, C1215v c1215v, M1 m12) {
        this.f3570a = 9;
        this.f3571b = c1215v;
        this.f3572c = m12;
        Objects.requireNonNull(binderC1212t0);
        this.f3573d = binderC1212t0;
    }

    public m(BinderC1212t0 binderC1212t0, H1 h12, M1 m12) {
        this.f3570a = 11;
        this.f3571b = h12;
        this.f3572c = m12;
        Objects.requireNonNull(binderC1212t0);
        this.f3573d = binderC1212t0;
    }

    public m(C1189j1 c1189j1, AtomicReference atomicReference, M1 m12) {
        this.f3570a = 13;
        this.f3571b = atomicReference;
        this.f3572c = m12;
        Objects.requireNonNull(c1189j1);
        this.f3573d = c1189j1;
    }
}
