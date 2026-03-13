package M0;

import o0.C1438m;
import t0.C1711k;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class l extends e {

    /* renamed from: k, reason: collision with root package name */
    public final long f4502k;

    public l(InterfaceC1708h interfaceC1708h, C1711k c1711k, C1438m c1438m, int i3, Object obj, long j, long j3, long j10) {
        super(interfaceC1708h, c1711k, 1, c1438m, i3, obj, j, j3);
        c1438m.getClass();
        this.f4502k = j10;
    }

    public long a() {
        long j = this.f4502k;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean b();
}
