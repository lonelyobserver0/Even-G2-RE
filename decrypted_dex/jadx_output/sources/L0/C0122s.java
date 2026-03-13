package L0;

import android.net.Uri;
import java.util.Map;
import r0.AbstractC1550k;
import r0.C1553n;
import t0.C1711k;
import t0.InterfaceC1708h;
import t0.InterfaceC1726z;

/* renamed from: L0.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0122s implements InterfaceC1708h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1708h f4124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4125b;

    /* renamed from: c, reason: collision with root package name */
    public final N f4126c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4127d;

    /* renamed from: e, reason: collision with root package name */
    public int f4128e;

    public C0122s(InterfaceC1708h interfaceC1708h, int i3, N n10) {
        AbstractC1550k.c(i3 > 0);
        this.f4124a = interfaceC1708h;
        this.f4125b = i3;
        this.f4126c = n10;
        this.f4127d = new byte[1];
        this.f4128e = i3;
    }

    @Override // t0.InterfaceC1708h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // t0.InterfaceC1708h
    public final long n(C1711k c1711k) {
        throw new UnsupportedOperationException();
    }

    @Override // o0.InterfaceC1432g
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = this.f4128e;
        InterfaceC1708h interfaceC1708h = this.f4124a;
        if (i11 == 0) {
            byte[] bArr2 = this.f4127d;
            if (interfaceC1708h.read(bArr2, 0, 1) != -1) {
                int i12 = (bArr2[0] & 255) << 4;
                if (i12 != 0) {
                    byte[] bArr3 = new byte[i12];
                    int i13 = i12;
                    int i14 = 0;
                    while (i13 > 0) {
                        int read = interfaceC1708h.read(bArr3, i14, i13);
                        if (read != -1) {
                            i14 += read;
                            i13 -= read;
                        }
                    }
                    while (i12 > 0 && bArr3[i12 - 1] == 0) {
                        i12--;
                    }
                    if (i12 > 0) {
                        C1553n c1553n = new C1553n(bArr3, i12);
                        N n10 = this.f4126c;
                        long max = !n10.f3931m ? n10.j : Math.max(n10.f3932n.m(true), n10.j);
                        int a3 = c1553n.a();
                        T0.H h2 = n10.f3930l;
                        h2.getClass();
                        h2.a(c1553n, a3, 0);
                        h2.c(max, 1, a3, 0, null);
                        n10.f3931m = true;
                    }
                }
                this.f4128e = this.f4125b;
            }
            return -1;
        }
        int read2 = interfaceC1708h.read(bArr, i3, Math.min(this.f4128e, i10));
        if (read2 != -1) {
            this.f4128e -= read2;
        }
        return read2;
    }

    @Override // t0.InterfaceC1708h
    public final Map s() {
        return this.f4124a.s();
    }

    @Override // t0.InterfaceC1708h
    public final void y(InterfaceC1726z interfaceC1726z) {
        interfaceC1726z.getClass();
        this.f4124a.y(interfaceC1726z);
    }

    @Override // t0.InterfaceC1708h
    public final Uri z() {
        return this.f4124a.z();
    }
}
