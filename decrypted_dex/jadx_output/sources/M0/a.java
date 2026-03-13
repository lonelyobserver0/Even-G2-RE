package M0;

import Z9.C;
import o0.C1438m;
import r0.AbstractC1550k;
import t0.C1711k;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a extends l {

    /* renamed from: l, reason: collision with root package name */
    public final long f4432l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4433m;

    /* renamed from: n, reason: collision with root package name */
    public C f4434n;

    /* renamed from: p, reason: collision with root package name */
    public int[] f4435p;

    public a(InterfaceC1708h interfaceC1708h, C1711k c1711k, C1438m c1438m, int i3, Object obj, long j, long j3, long j10, long j11, long j12) {
        super(interfaceC1708h, c1711k, c1438m, i3, obj, j, j3, j12);
        this.f4432l = j10;
        this.f4433m = j11;
    }

    public final int c(int i3) {
        int[] iArr = this.f4435p;
        AbstractC1550k.h(iArr);
        return iArr[i3];
    }
}
