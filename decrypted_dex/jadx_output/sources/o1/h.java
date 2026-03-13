package o1;

import M4.I;
import T0.AbstractC0311b;
import Y.m;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f18337o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f18338p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f18339n;

    public static boolean e(C1553n c1553n, byte[] bArr) {
        if (c1553n.a() < bArr.length) {
            return false;
        }
        int i3 = c1553n.f20177b;
        byte[] bArr2 = new byte[bArr.length];
        c1553n.f(0, bArr.length, bArr2);
        c1553n.G(i3);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // o1.i
    public final long b(C1553n c1553n) {
        byte[] bArr = c1553n.f20176a;
        return (this.f18348i * AbstractC0311b.l(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // o1.i
    public final boolean c(C1553n c1553n, long j, m mVar) {
        if (e(c1553n, f18337o)) {
            byte[] copyOf = Arrays.copyOf(c1553n.f20176a, c1553n.f20178c);
            int i3 = copyOf[9] & UByte.MAX_VALUE;
            ArrayList c10 = AbstractC0311b.c(copyOf);
            if (((C1438m) mVar.f8674b) == null) {
                C1437l c1437l = new C1437l();
                c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(1609));
                c1437l.f18156B = i3;
                c1437l.f18157C = 48000;
                c1437l.f18180p = c10;
                mVar.f8674b = new C1438m(c1437l);
                return true;
            }
        } else {
            if (!e(c1553n, f18338p)) {
                AbstractC1550k.h((C1438m) mVar.f8674b);
                return false;
            }
            AbstractC1550k.h((C1438m) mVar.f8674b);
            if (!this.f18339n) {
                this.f18339n = true;
                c1553n.H(8);
                C1404A u2 = AbstractC0311b.u(I.n((String[]) AbstractC0311b.x(c1553n, false, false).f29a));
                if (u2 != null) {
                    C1437l a3 = ((C1438m) mVar.f8674b).a();
                    a3.f18175k = u2.e(((C1438m) mVar.f8674b).f18214l);
                    mVar.f8674b = new C1438m(a3);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // o1.i
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f18339n = false;
        }
    }
}
