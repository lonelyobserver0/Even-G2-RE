package l4;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class J0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f16120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0 f16121c;

    public /* synthetic */ J0(P0 p02, AtomicReference atomicReference, int i3, boolean z2) {
        this.f16119a = i3;
        this.f16121c = p02;
        this.f16120b = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f16120b;
        synchronized (atomicReference) {
            try {
                try {
                    C1200n0 c1200n0 = (C1200n0) this.f16121c.f4728a;
                    atomicReference.set(Double.valueOf(c1200n0.f16539d.t(c1200n0.q().q(), AbstractC1148D.f15985e0)));
                } finally {
                    this.f16120b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16119a) {
            case 0:
                AtomicReference atomicReference = this.f16120b;
                synchronized (atomicReference) {
                    try {
                        try {
                            C1200n0 c1200n0 = (C1200n0) this.f16121c.f4728a;
                            atomicReference.set(Boolean.valueOf(c1200n0.f16539d.u(c1200n0.q().q(), AbstractC1148D.f15974a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f16120b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C1200n0 c1200n02 = (C1200n0) this.f16121c.f4728a;
                            atomicReference2.set(c1200n02.f16539d.q(c1200n02.q().q(), AbstractC1148D.f15976b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f16120b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            C1200n0 c1200n03 = (C1200n0) this.f16121c.f4728a;
                            atomicReference3.set(Long.valueOf(c1200n03.f16539d.r(c1200n03.q().q(), AbstractC1148D.f15979c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f16120b;
                synchronized (atomicReference4) {
                    try {
                        try {
                            C1200n0 c1200n04 = (C1200n0) this.f16121c.f4728a;
                            atomicReference4.set(Integer.valueOf(c1200n04.f16539d.s(c1200n04.q().q(), AbstractC1148D.f15982d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                P0 p02 = this.f16121c;
                C1164b0 c1164b0 = ((C1200n0) p02.f4728a).f16540e;
                C1200n0.j(c1164b0);
                Bundle M5 = c1164b0.f16378p.M();
                C1189j1 o5 = ((C1200n0) p02.f4728a).o();
                o5.k();
                o5.l();
                o5.y(new N9.c(o5, this.f16120b, o5.A(false), M5, 7));
                return;
            default:
                C1189j1 o10 = ((C1200n0) this.f16121c.f4728a).o();
                y1 d8 = y1.d(W0.f16268e);
                o10.k();
                o10.l();
                o10.y(new N9.c(o10, this.f16120b, o10.A(false), d8, 8));
                return;
        }
    }

    public J0(P0 p02, AtomicReference atomicReference, int i3) {
        this.f16119a = i3;
        switch (i3) {
            case 1:
                this.f16120b = atomicReference;
                Objects.requireNonNull(p02);
                this.f16121c = p02;
                break;
            case 2:
                this.f16120b = atomicReference;
                Objects.requireNonNull(p02);
                this.f16121c = p02;
                break;
            case 3:
                this.f16120b = atomicReference;
                Objects.requireNonNull(p02);
                this.f16121c = p02;
                break;
            case 4:
                this.f16120b = atomicReference;
                Objects.requireNonNull(p02);
                this.f16121c = p02;
                break;
            default:
                this.f16120b = atomicReference;
                Objects.requireNonNull(p02);
                this.f16121c = p02;
                break;
        }
    }
}
