package z1;

import T0.AbstractC0311b;
import T0.C0310a;
import T0.H;
import T0.J;
import com.stub.StubApp;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;
import o0.AbstractC1405B;
import o0.C1406C;
import o0.C1437l;
import o0.C1438m;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* renamed from: z1.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2002g implements InterfaceC2004i {

    /* renamed from: a, reason: collision with root package name */
    public final C1553n f23807a;

    /* renamed from: c, reason: collision with root package name */
    public final String f23809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23810d;

    /* renamed from: e, reason: collision with root package name */
    public String f23811e;

    /* renamed from: f, reason: collision with root package name */
    public H f23812f;

    /* renamed from: h, reason: collision with root package name */
    public int f23814h;

    /* renamed from: i, reason: collision with root package name */
    public int f23815i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public C1438m f23816k;

    /* renamed from: l, reason: collision with root package name */
    public int f23817l;

    /* renamed from: m, reason: collision with root package name */
    public int f23818m;

    /* renamed from: g, reason: collision with root package name */
    public int f23813g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f23821p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f23808b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f23819n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f23820o = -1;

    public C2002g(String str, int i3, int i10) {
        this.f23807a = new C1553n(new byte[i10]);
        this.f23809c = str;
        this.f23810d = i3;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        this.f23813g = 0;
        this.f23814h = 0;
        this.f23815i = 0;
        this.f23821p = -9223372036854775807L;
        this.f23808b.set(0);
    }

    public final boolean b(C1553n c1553n, byte[] bArr, int i3) {
        int min = Math.min(c1553n.a(), i3 - this.f23814h);
        c1553n.f(this.f23814h, min, bArr);
        int i10 = this.f23814h + min;
        this.f23814h = i10;
        return i10 == i3;
    }

    @Override // z1.InterfaceC2004i
    public final void c(C1553n c1553n) {
        int i3;
        boolean z2;
        int i10;
        byte b2;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j;
        int i19;
        int i20;
        long j3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = 4;
        AbstractC1550k.h(this.f23812f);
        while (c1553n.a() > 0) {
            int i26 = this.f23813g;
            int i27 = 8;
            C1553n c1553n2 = this.f23807a;
            switch (i26) {
                case 0:
                    while (c1553n.a() > 0) {
                        int i28 = this.f23815i << 8;
                        this.f23815i = i28;
                        int u2 = i28 | c1553n.u();
                        this.f23815i = u2;
                        int i29 = (u2 == 2147385345 || u2 == -25230976 || u2 == 536864768 || u2 == -14745368) ? 1 : (u2 == 1683496997 || u2 == 622876772) ? 2 : (u2 == 1078008818 || u2 == -233094848) ? 3 : (u2 == 1908687592 || u2 == -398277519) ? 4 : 0;
                        this.f23818m = i29;
                        if (i29 != 0) {
                            byte[] bArr = c1553n2.f20176a;
                            bArr[0] = (byte) ((u2 >> 24) & 255);
                            bArr[1] = (byte) ((u2 >> 16) & 255);
                            bArr[2] = (byte) ((u2 >> 8) & 255);
                            bArr[3] = (byte) (u2 & 255);
                            this.f23814h = 4;
                            this.f23815i = 0;
                            if (i29 == 3 || i29 == 4) {
                                this.f23813g = 4;
                            } else if (i29 == 1) {
                                this.f23813g = 1;
                            } else {
                                this.f23813g = 2;
                            }
                            i25 = 4;
                        }
                    }
                    i25 = 4;
                    break;
                case 1:
                    if (b(c1553n, c1553n2.f20176a, 18)) {
                        byte[] bArr2 = c1553n2.f20176a;
                        if (this.f23816k == null) {
                            String str = this.f23811e;
                            J k3 = AbstractC0311b.k(bArr2);
                            k3.t(60);
                            int i30 = AbstractC0311b.j[k3.i(6)];
                            int i31 = AbstractC0311b.f6965k[k3.i(4)];
                            int i32 = k3.i(5);
                            int i33 = i32 >= 29 ? -1 : (AbstractC0311b.f6966l[i32] * 1000) / 2;
                            k3.t(10);
                            int i34 = i30 + (k3.i(2) > 0 ? 1 : 0);
                            C1437l c1437l = new C1437l();
                            c1437l.f18166a = str;
                            c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(3202));
                            c1437l.f18173h = i33;
                            c1437l.f18156B = i34;
                            c1437l.f18157C = i31;
                            c1437l.f18181q = null;
                            c1437l.f18169d = this.f23809c;
                            c1437l.f18171f = this.f23810d;
                            C1438m c1438m = new C1438m(c1437l);
                            this.f23816k = c1438m;
                            this.f23812f.d(c1438m);
                        }
                        byte b12 = bArr2[0];
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i12 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & UByte.MAX_VALUE) << 4);
                                b11 = bArr2[9];
                            } else if (b12 != 31) {
                                i3 = (((bArr2[5] & 3) << 12) | ((bArr2[6] & UByte.MAX_VALUE) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                                z2 = false;
                            } else {
                                i12 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & UByte.MAX_VALUE) << 4);
                                b11 = bArr2[8];
                            }
                            i3 = (i12 | ((b11 & 60) >> 2)) + 1;
                            z2 = true;
                        } else {
                            i3 = (((bArr2[4] & 3) << 12) | ((bArr2[7] & UByte.MAX_VALUE) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                            z2 = false;
                        }
                        if (z2) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.f23817l = i3;
                        if (b12 != -2) {
                            if (b12 == -1) {
                                i10 = (bArr2[4] & 7) << 4;
                                b10 = bArr2[7];
                            } else if (b12 != 31) {
                                i10 = (bArr2[4] & 1) << 6;
                                b2 = bArr2[5];
                            } else {
                                i10 = (bArr2[5] & 7) << 4;
                                b10 = bArr2[6];
                            }
                            i11 = b10 & 60;
                            this.j = android.support.v4.media.session.b.h(AbstractC1560u.P(this.f23816k.f18194D, (((i11 >> 2) | i10) + 1) * 32));
                            c1553n2.G(0);
                            this.f23812f.a(c1553n2, 18, 0);
                            this.f23813g = 6;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b2 = bArr2[4];
                        }
                        i11 = b2 & 252;
                        this.j = android.support.v4.media.session.b.h(AbstractC1560u.P(this.f23816k.f18194D, (((i11 >> 2) | i10) + 1) * 32));
                        c1553n2.G(0);
                        this.f23812f.a(c1553n2, 18, 0);
                        this.f23813g = 6;
                    }
                    i25 = 4;
                case 2:
                    if (b(c1553n, c1553n2.f20176a, 7)) {
                        J k4 = AbstractC0311b.k(c1553n2.f20176a);
                        k4.t(42);
                        this.f23819n = k4.i(k4.h() ? 12 : 8) + 1;
                        this.f23813g = 3;
                    }
                    i25 = 4;
                case 3:
                    int i35 = i25;
                    if (b(c1553n, c1553n2.f20176a, this.f23819n)) {
                        J k10 = AbstractC0311b.k(c1553n2.f20176a);
                        k10.t(40);
                        int i36 = k10.i(2);
                        if (k10.h()) {
                            i13 = 20;
                            i14 = 12;
                        } else {
                            i13 = 16;
                            i14 = 8;
                        }
                        k10.t(i14);
                        int i37 = k10.i(i13) + 1;
                        boolean h2 = k10.h();
                        if (h2) {
                            i15 = k10.i(2);
                            i16 = (k10.i(3) + 1) * 512;
                            if (k10.h()) {
                                k10.t(36);
                            }
                            int i38 = k10.i(3) + 1;
                            int i39 = k10.i(3) + 1;
                            if (i38 != 1 || i39 != 1) {
                                throw C1406C.c(StubApp.getString2(24868));
                            }
                            int i40 = i36 + 1;
                            int i41 = k10.i(i40);
                            int i42 = 0;
                            while (i42 < i40) {
                                if (((i41 >> i42) & 1) == 1) {
                                    k10.t(i27);
                                }
                                i42++;
                                i27 = 8;
                            }
                            if (k10.h()) {
                                k10.t(2);
                                int i43 = (k10.i(2) + 1) << 2;
                                int i44 = k10.i(2) + 1;
                                for (int i45 = 0; i45 < i44; i45++) {
                                    k10.t(i43);
                                }
                            }
                        } else {
                            i15 = -1;
                            i16 = 0;
                        }
                        k10.t(i13);
                        k10.t(12);
                        if (h2) {
                            if (k10.h()) {
                                k10.t(i35);
                            }
                            if (k10.h()) {
                                k10.t(24);
                            }
                            if (k10.h()) {
                                k10.u(k10.i(10) + 1);
                            }
                            k10.t(5);
                            int i46 = AbstractC0311b.f6967m[k10.i(4)];
                            i17 = k10.i(8) + 1;
                            i18 = i46;
                        } else {
                            i17 = -1;
                            i18 = -2147483647;
                        }
                        if (h2) {
                            if (i15 == 0) {
                                i19 = 32000;
                            } else if (i15 == 1) {
                                i19 = 44100;
                            } else {
                                if (i15 != 2) {
                                    throw C1406C.a(StubApp.getString2(24869) + i15, null);
                                }
                                i19 = 48000;
                            }
                            int i47 = AbstractC1560u.f20190a;
                            j = AbstractC1560u.R(i16, 1000000L, i19, RoundingMode.DOWN);
                        } else {
                            j = -9223372036854775807L;
                        }
                        g(new C0310a(StubApp.getString2(3206), i17, i18, i37, j));
                        this.f23817l = i37;
                        this.j = j == -9223372036854775807L ? 0L : j;
                        c1553n2.G(0);
                        this.f23812f.a(c1553n2, this.f23819n, 0);
                        this.f23813g = 6;
                    }
                    i25 = 4;
                    break;
                case 4:
                    i20 = i25;
                    if (b(c1553n, c1553n2.f20176a, 6)) {
                        J k11 = AbstractC0311b.k(c1553n2.f20176a);
                        k11.t(32);
                        int t3 = AbstractC0311b.t(k11, AbstractC0311b.f6972r) + 1;
                        this.f23820o = t3;
                        int i48 = this.f23814h;
                        if (i48 > t3) {
                            int i49 = i48 - t3;
                            this.f23814h = i48 - i49;
                            c1553n.G(c1553n.f20177b - i49);
                        }
                        this.f23813g = 5;
                    }
                    i25 = i20;
                case 5:
                    if (b(c1553n, c1553n2.f20176a, this.f23820o)) {
                        byte[] bArr3 = c1553n2.f20176a;
                        AtomicInteger atomicInteger = this.f23808b;
                        i20 = i25;
                        J k12 = AbstractC0311b.k(bArr3);
                        int i50 = k12.i(32) == 1078008818 ? 1 : 0;
                        int t10 = AbstractC0311b.t(k12, AbstractC0311b.f6968n);
                        int i51 = t10 + 1;
                        if (i50 == 0) {
                            j3 = -9223372036854775807L;
                            i21 = -2147483647;
                        } else {
                            if (!k12.h()) {
                                throw C1406C.c(StubApp.getString2(24867));
                            }
                            int i52 = t10 - 1;
                            int i53 = ((bArr3[i52] << 8) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) | (bArr3[t10] & UByte.MAX_VALUE);
                            int i54 = AbstractC1560u.f20190a;
                            int i55 = 65535;
                            for (int i56 = 0; i56 < i52; i56++) {
                                byte b13 = bArr3[i56];
                                int i57 = (((b13 & UByte.MAX_VALUE) >> 4) ^ ((i55 >> 12) & 255)) & 255;
                                int i58 = (i55 << 4) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                                int[] iArr = AbstractC1560u.f20203o;
                                int i59 = (iArr[i57] ^ i58) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                                i55 = (((i59 << 4) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ iArr[((b13 & 15) ^ ((i59 >> 12) & 255)) & 255]) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                            }
                            if (i53 != i55) {
                                throw C1406C.a(StubApp.getString2(24866), null);
                            }
                            int i60 = k12.i(2);
                            if (i60 != 0) {
                                if (i60 == 1) {
                                    i23 = 480;
                                } else {
                                    if (i60 != 2) {
                                        throw C1406C.a(StubApp.getString2(24864) + i60, null);
                                    }
                                    i23 = KyberEngine.KyberPolyBytes;
                                }
                                i22 = 3;
                            } else {
                                i22 = 3;
                                i23 = 512;
                            }
                            int i61 = (k12.i(i22) + 1) * i23;
                            int i62 = k12.i(2);
                            if (i62 == 0) {
                                i24 = 32000;
                            } else if (i62 == 1) {
                                i24 = 44100;
                            } else {
                                if (i62 != 2) {
                                    throw C1406C.a(StubApp.getString2(24865) + i62, null);
                                }
                                i24 = 48000;
                            }
                            if (k12.h()) {
                                k12.t(36);
                            }
                            i21 = i24 * (1 << k12.i(2));
                            j3 = AbstractC1560u.R(i61, 1000000L, i24, RoundingMode.DOWN);
                        }
                        int i63 = 0;
                        for (int i64 = 0; i64 < i50; i64++) {
                            i63 += AbstractC0311b.t(k12, AbstractC0311b.f6969o);
                        }
                        if (i50 != 0) {
                            atomicInteger.set(AbstractC0311b.t(k12, AbstractC0311b.f6970p));
                        }
                        int t11 = i63 + (atomicInteger.get() != 0 ? AbstractC0311b.t(k12, AbstractC0311b.f6971q) : 0) + i51;
                        C0310a c0310a = new C0310a(StubApp.getString2(21267), 2, i21, t11, j3);
                        if (this.f23818m == 3) {
                            g(c0310a);
                        }
                        this.f23817l = t11;
                        this.j = j3 == -9223372036854775807L ? 0L : j3;
                        c1553n2.G(0);
                        this.f23812f.a(c1553n2, this.f23820o, 0);
                        this.f23813g = 6;
                        i25 = i20;
                    } else {
                        continue;
                    }
                case 6:
                    int min = Math.min(c1553n.a(), this.f23817l - this.f23814h);
                    this.f23812f.a(c1553n, min, 0);
                    int i65 = this.f23814h + min;
                    this.f23814h = i65;
                    if (i65 == this.f23817l) {
                        AbstractC1550k.g(this.f23821p != -9223372036854775807L);
                        this.f23812f.c(this.f23821p, this.f23818m == i25 ? 0 : 1, this.f23817l, 0, null);
                        this.f23821p += this.j;
                        this.f23813g = 0;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23821p = j;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23811e = c1994f.f23755e;
        c1994f.b();
        this.f23812f = qVar.w(c1994f.f23754d, 1);
    }

    public final void g(C0310a c0310a) {
        int i3;
        int i10 = c0310a.f6954b;
        if (i10 == -2147483647 || (i3 = c0310a.f6955c) == -1) {
            return;
        }
        C1438m c1438m = this.f23816k;
        String str = c0310a.f6953a;
        if (c1438m != null && i3 == c1438m.f18193C && i10 == c1438m.f18194D && str.equals(c1438m.f18216n)) {
            return;
        }
        C1438m c1438m2 = this.f23816k;
        C1437l c1437l = c1438m2 == null ? new C1437l() : c1438m2.a();
        c1437l.f18166a = this.f23811e;
        c1437l.f18177m = AbstractC1405B.m(str);
        c1437l.f18156B = i3;
        c1437l.f18157C = i10;
        c1437l.f18169d = this.f23809c;
        c1437l.f18171f = this.f23810d;
        C1438m c1438m3 = new C1438m(c1437l);
        this.f23816k = c1438m3;
        this.f23812f.d(c1438m3);
    }
}
