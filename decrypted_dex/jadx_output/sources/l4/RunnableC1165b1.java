package l4;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: l4.b1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1165b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16388a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f16390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M1 f16391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f16392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1189j1 f16393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16394g;

    public RunnableC1165b1(C1189j1 c1189j1, String str, String str2, M1 m12, boolean z2, com.google.android.gms.internal.measurement.L l9) {
        this.f16389b = str;
        this.f16390c = str2;
        this.f16391d = m12;
        this.f16392e = z2;
        this.f16394g = l9;
        this.f16393f = c1189j1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        K1 k12;
        InterfaceC1151G interfaceC1151G;
        String str;
        C1200n0 c1200n0;
        AtomicReference atomicReference;
        C1189j1 c1189j1;
        InterfaceC1151G interfaceC1151G2;
        switch (this.f16388a) {
            case 0:
                String str2 = this.f16389b;
                com.google.android.gms.internal.measurement.L l9 = (com.google.android.gms.internal.measurement.L) this.f16394g;
                C1189j1 c1189j12 = this.f16393f;
                Bundle bundle2 = new Bundle();
                try {
                    interfaceC1151G = c1189j12.f16480d;
                    str = this.f16390c;
                    c1200n0 = (C1200n0) c1189j12.f4728a;
                } catch (RemoteException e11) {
                    bundle = bundle2;
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    K1 k13 = ((C1200n0) c1189j12.f4728a).j;
                    C1200n0.j(k13);
                    k13.X(l9, bundle2);
                    throw th;
                }
                if (interfaceC1151G == null) {
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.f16242f.d(StubApp.getString2("20347"), str2, str);
                    K1 k14 = c1200n0.j;
                    C1200n0.j(k14);
                    k14.X(l9, bundle2);
                    return;
                }
                List<H1> H2 = interfaceC1151G.H(str2, str, this.f16392e, this.f16391d);
                bundle = new Bundle();
                if (H2 != null) {
                    for (H1 h12 : H2) {
                        String str3 = h12.f16103e;
                        String str4 = h12.f16100b;
                        if (str3 != null) {
                            bundle.putString(str4, str3);
                        } else {
                            Long l10 = h12.f16102d;
                            if (l10 != null) {
                                bundle.putLong(str4, l10.longValue());
                            } else {
                                Double d8 = h12.f16105g;
                                if (d8 != null) {
                                    bundle.putDouble(str4, d8.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    try {
                        c1189j12.x();
                        k12 = c1200n0.j;
                    } catch (RemoteException e12) {
                        e10 = e12;
                        T t10 = ((C1200n0) c1189j12.f4728a).f16541f;
                        C1200n0.l(t10);
                        t10.f16242f.d(StubApp.getString2("20348"), str2, e10);
                        k12 = ((C1200n0) c1189j12.f4728a).j;
                        C1200n0.j(k12);
                        k12.X(l9, bundle);
                        return;
                    }
                    C1200n0.j(k12);
                    k12.X(l9, bundle);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    K1 k132 = ((C1200n0) c1189j12.f4728a).j;
                    C1200n0.j(k132);
                    k132.X(l9, bundle2);
                    throw th;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.f16394g;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c1189j1 = this.f16393f;
                            interfaceC1151G2 = c1189j1.f16480d;
                        } catch (RemoteException e13) {
                            T t11 = ((C1200n0) this.f16393f.f4728a).f16541f;
                            C1200n0.l(t11);
                            t11.f16242f.e(StubApp.getString2("20346"), null, this.f16389b, e13);
                            ((AtomicReference) this.f16394g).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f16394g;
                        }
                        if (interfaceC1151G2 == null) {
                            T t12 = ((C1200n0) c1189j1.f4728a).f16541f;
                            C1200n0.l(t12);
                            t12.f16242f.e(StubApp.getString2("20345"), null, this.f16389b, this.f16390c);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(interfaceC1151G2.H(this.f16389b, this.f16390c, this.f16392e, this.f16391d));
                        } else {
                            atomicReference2.set(interfaceC1151G2.h(null, this.f16389b, this.f16390c, this.f16392e));
                        }
                        c1189j1.x();
                        atomicReference = (AtomicReference) this.f16394g;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.f16394g).notify();
                        throw th3;
                    }
                }
        }
    }

    public RunnableC1165b1(C1189j1 c1189j1, AtomicReference atomicReference, String str, String str2, M1 m12, boolean z2) {
        this.f16394g = atomicReference;
        this.f16389b = str;
        this.f16390c = str2;
        this.f16391d = m12;
        this.f16392e = z2;
        this.f16393f = c1189j1;
    }
}
