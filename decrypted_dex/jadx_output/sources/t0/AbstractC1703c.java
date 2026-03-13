package t0;

import M4.Z;
import android.os.SystemClock;
import java.util.ArrayList;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1703c implements InterfaceC1708h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21056a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21057b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f21058c;

    /* renamed from: d, reason: collision with root package name */
    public C1711k f21059d;

    public AbstractC1703c(boolean z2) {
        this.f21056a = z2;
    }

    public final void a(int i3) {
        C1711k c1711k = this.f21059d;
        int i10 = AbstractC1560u.f20190a;
        for (int i11 = 0; i11 < this.f21058c; i11++) {
            InterfaceC1726z interfaceC1726z = (InterfaceC1726z) this.f21057b.get(i11);
            boolean z2 = this.f21056a;
            P0.h hVar = (P0.h) interfaceC1726z;
            synchronized (hVar) {
                Z z10 = P0.h.f5397n;
                if (z2 && (c1711k.f21084h & 8) != 8) {
                    hVar.f5411h += i3;
                }
            }
        }
    }

    public final void d() {
        C1711k c1711k = this.f21059d;
        int i3 = AbstractC1560u.f20190a;
        for (int i10 = 0; i10 < this.f21058c; i10++) {
            InterfaceC1726z interfaceC1726z = (InterfaceC1726z) this.f21057b.get(i10);
            boolean z2 = this.f21056a;
            P0.h hVar = (P0.h) interfaceC1726z;
            synchronized (hVar) {
                try {
                    Z z10 = P0.h.f5397n;
                    if (z2 && (c1711k.f21084h & 8) != 8) {
                        AbstractC1550k.g(hVar.f5409f > 0);
                        hVar.f5406c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (elapsedRealtime - hVar.f5410g);
                        hVar.f5412i += i11;
                        long j = hVar.j;
                        long j3 = hVar.f5411h;
                        hVar.j = j + j3;
                        if (i11 > 0) {
                            hVar.f5408e.a((j3 * 8000.0f) / i11, (int) Math.sqrt(j3));
                            if (hVar.f5412i < 2000) {
                                if (hVar.j >= 524288) {
                                }
                                hVar.b(hVar.f5411h, i11, hVar.f5413k);
                                hVar.f5410g = elapsedRealtime;
                                hVar.f5411h = 0L;
                            }
                            hVar.f5413k = (long) hVar.f5408e.b();
                            hVar.b(hVar.f5411h, i11, hVar.f5413k);
                            hVar.f5410g = elapsedRealtime;
                            hVar.f5411h = 0L;
                        }
                        hVar.f5409f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f21059d = null;
    }

    public final void g() {
        for (int i3 = 0; i3 < this.f21058c; i3++) {
            ((InterfaceC1726z) this.f21057b.get(i3)).getClass();
        }
    }

    public final void j(C1711k c1711k) {
        this.f21059d = c1711k;
        for (int i3 = 0; i3 < this.f21058c; i3++) {
            InterfaceC1726z interfaceC1726z = (InterfaceC1726z) this.f21057b.get(i3);
            boolean z2 = this.f21056a;
            P0.h hVar = (P0.h) interfaceC1726z;
            synchronized (hVar) {
                try {
                    Z z10 = P0.h.f5397n;
                    if (z2 && (c1711k.f21084h & 8) != 8) {
                        if (hVar.f5409f == 0) {
                            hVar.f5406c.getClass();
                            hVar.f5410g = SystemClock.elapsedRealtime();
                        }
                        hVar.f5409f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // t0.InterfaceC1708h
    public final void y(InterfaceC1726z interfaceC1726z) {
        interfaceC1726z.getClass();
        ArrayList arrayList = this.f21057b;
        if (arrayList.contains(interfaceC1726z)) {
            return;
        }
        arrayList.add(interfaceC1726z);
        this.f21058c++;
    }
}
