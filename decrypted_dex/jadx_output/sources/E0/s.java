package E0;

import L0.Z;
import R8.C0250h;
import Tb.U;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o0.C1438m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p0.InterfaceC1480d;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import u0.InterfaceC1770a;
import v0.AbstractC1810e;
import v0.C1798A;
import v0.C1803F;
import v0.C1811f;
import v0.C1812g;
import v0.C1817l;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class s extends AbstractC1810e {

    /* renamed from: V0, reason: collision with root package name */
    public static final byte[] f1795V0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public final i f1796A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1797A0;

    /* renamed from: B, reason: collision with root package name */
    public final MediaCodec.BufferInfo f1798B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1799B0;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayDeque f1800C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f1801C0;

    /* renamed from: D, reason: collision with root package name */
    public final x0.w f1802D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f1803D0;

    /* renamed from: E, reason: collision with root package name */
    public C1438m f1804E;

    /* renamed from: E0, reason: collision with root package name */
    public int f1805E0;

    /* renamed from: F, reason: collision with root package name */
    public C1438m f1806F;

    /* renamed from: F0, reason: collision with root package name */
    public int f1807F0;

    /* renamed from: G, reason: collision with root package name */
    public Z9.q f1808G;

    /* renamed from: G0, reason: collision with root package name */
    public int f1809G0;

    /* renamed from: H, reason: collision with root package name */
    public Z9.q f1810H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f1811H0;

    /* renamed from: I, reason: collision with root package name */
    public C1798A f1812I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f1813I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f1814J0;

    /* renamed from: K, reason: collision with root package name */
    public MediaCrypto f1815K;

    /* renamed from: K0, reason: collision with root package name */
    public long f1816K0;

    /* renamed from: L, reason: collision with root package name */
    public final long f1817L;

    /* renamed from: L0, reason: collision with root package name */
    public long f1818L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f1819M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f1820N0;

    /* renamed from: O, reason: collision with root package name */
    public float f1821O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f1822O0;

    /* renamed from: P, reason: collision with root package name */
    public float f1823P;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f1824P0;

    /* renamed from: Q0, reason: collision with root package name */
    public C1817l f1825Q0;

    /* renamed from: R, reason: collision with root package name */
    public m f1826R;

    /* renamed from: R0, reason: collision with root package name */
    public C1811f f1827R0;

    /* renamed from: S0, reason: collision with root package name */
    public r f1828S0;

    /* renamed from: T, reason: collision with root package name */
    public C1438m f1829T;

    /* renamed from: T0, reason: collision with root package name */
    public long f1830T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f1831U0;

    /* renamed from: X, reason: collision with root package name */
    public MediaFormat f1832X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f1833Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f1834Z;
    public ArrayDeque h0;

    /* renamed from: k0, reason: collision with root package name */
    public q f1835k0;

    /* renamed from: l0, reason: collision with root package name */
    public p f1836l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f1837m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f1838n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1839o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1840p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f1841q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f1842r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f1843s0;

    /* renamed from: t, reason: collision with root package name */
    public final l f1844t;

    /* renamed from: t0, reason: collision with root package name */
    public long f1845t0;

    /* renamed from: u0, reason: collision with root package name */
    public long f1846u0;

    /* renamed from: v, reason: collision with root package name */
    public final k f1847v;

    /* renamed from: v0, reason: collision with root package name */
    public int f1848v0;

    /* renamed from: w, reason: collision with root package name */
    public final float f1849w;

    /* renamed from: w0, reason: collision with root package name */
    public int f1850w0;

    /* renamed from: x, reason: collision with root package name */
    public final u0.e f1851x;

    /* renamed from: x0, reason: collision with root package name */
    public ByteBuffer f1852x0;

    /* renamed from: y, reason: collision with root package name */
    public final u0.e f1853y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f1854y0;

    /* renamed from: z, reason: collision with root package name */
    public final u0.e f1855z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f1856z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i3, l lVar, float f10) {
        super(i3);
        k kVar = k.f1775b;
        this.f1844t = lVar;
        this.f1847v = kVar;
        this.f1849w = f10;
        this.f1851x = new u0.e(0);
        this.f1853y = new u0.e(0);
        this.f1855z = new u0.e(2);
        i iVar = new i(2);
        iVar.f1772m = 32;
        this.f1796A = iVar;
        this.f1798B = new MediaCodec.BufferInfo();
        this.f1821O = 1.0f;
        this.f1823P = 1.0f;
        this.f1817L = -9223372036854775807L;
        this.f1800C = new ArrayDeque();
        this.f1828S0 = r.f1790e;
        iVar.u(0);
        iVar.f21396e.order(ByteOrder.nativeOrder());
        x0.w wVar = new x0.w();
        wVar.f22808a = InterfaceC1480d.f19611a;
        wVar.f22810c = 0;
        wVar.f22809b = 2;
        this.f1802D = wVar;
        this.f1834Z = -1.0f;
        this.f1837m0 = 0;
        this.f1805E0 = 0;
        this.f1848v0 = -1;
        this.f1850w0 = -1;
        this.f1846u0 = -9223372036854775807L;
        this.f1816K0 = -9223372036854775807L;
        this.f1818L0 = -9223372036854775807L;
        this.f1830T0 = -9223372036854775807L;
        this.f1845t0 = -9223372036854775807L;
        this.f1807F0 = 0;
        this.f1809G0 = 0;
        this.f1827R0 = new C1811f();
    }

    @Override // v0.AbstractC1810e
    public void A(float f10, float f11) {
        this.f1821O = f10;
        this.f1823P = f11;
        u0(this.f1829T);
    }

    @Override // v0.AbstractC1810e
    public final int B(C1438m c1438m) {
        try {
            return t0(this.f1847v, c1438m);
        } catch (v e10) {
            throw g(e10, c1438m, false, 4002);
        }
    }

    @Override // v0.AbstractC1810e
    public final int C() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0327, code lost:
    
        r25.f1799B0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r26, long r28) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.s.D(long, long):boolean");
    }

    public abstract C1812g E(p pVar, C1438m c1438m, C1438m c1438m2);

    public o F(IllegalStateException illegalStateException, p pVar) {
        return new o(illegalStateException, pVar);
    }

    public final void G() {
        this.f1801C0 = false;
        this.f1796A.s();
        this.f1855z.s();
        this.f1799B0 = false;
        this.f1797A0 = false;
        x0.w wVar = this.f1802D;
        wVar.getClass();
        wVar.f22808a = InterfaceC1480d.f19611a;
        wVar.f22810c = 0;
        wVar.f22809b = 2;
    }

    public final boolean H() {
        if (!this.f1811H0) {
            v0();
            return true;
        }
        this.f1807F0 = 1;
        if (this.f1839o0) {
            this.f1809G0 = 3;
            return false;
        }
        this.f1809G0 = 2;
        return true;
    }

    public final boolean I(long j, long j3) {
        boolean z2;
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        boolean i02;
        ByteBuffer byteBuffer;
        int i3;
        int i10;
        long j10;
        boolean z11;
        boolean z12;
        C1438m c1438m;
        int k3;
        m mVar = this.f1826R;
        mVar.getClass();
        boolean z13 = this.f1850w0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f1798B;
        if (!z13) {
            if (this.f1840p0 && this.f1813I0) {
                try {
                    k3 = mVar.k(bufferInfo2);
                } catch (IllegalStateException unused) {
                    h0();
                    if (this.f1820N0) {
                        k0();
                    }
                }
            } else {
                k3 = mVar.k(bufferInfo2);
            }
            if (k3 < 0) {
                if (k3 == -2) {
                    this.f1814J0 = true;
                    m mVar2 = this.f1826R;
                    mVar2.getClass();
                    MediaFormat f10 = mVar2.f();
                    if (this.f1837m0 != 0 && f10.getInteger(StubApp.getString2(1650)) == 32 && f10.getInteger(StubApp.getString2(1651)) == 32) {
                        this.f1842r0 = true;
                        return true;
                    }
                    this.f1832X = f10;
                    this.f1833Y = true;
                    return true;
                }
                if (this.f1843s0 && (this.f1819M0 || this.f1807F0 == 2)) {
                    h0();
                }
                long j11 = this.f1845t0;
                if (j11 != -9223372036854775807L) {
                    long j12 = j11 + 100;
                    this.f21722g.getClass();
                    if (j12 < System.currentTimeMillis()) {
                        h0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f1842r0) {
                this.f1842r0 = false;
                mVar.e(k3);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                h0();
                return false;
            }
            this.f1850w0 = k3;
            ByteBuffer r8 = mVar.r(k3);
            this.f1852x0 = r8;
            if (r8 != null) {
                r8.position(bufferInfo2.offset);
                this.f1852x0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j13 = bufferInfo2.presentationTimeUs;
            this.f1854y0 = j13 < this.f21726m;
            long j14 = this.f1818L0;
            this.f1856z0 = j14 != -9223372036854775807L && j14 <= j13;
            w0(j13);
        }
        if (this.f1840p0 && this.f1813I0) {
            try {
                byteBuffer = this.f1852x0;
                i3 = this.f1850w0;
                i10 = bufferInfo2.flags;
                j10 = bufferInfo2.presentationTimeUs;
                z11 = this.f1854y0;
                z12 = this.f1856z0;
                c1438m = this.f1806F;
                c1438m.getClass();
                z2 = true;
                z10 = false;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                i02 = i0(j, j3, mVar, byteBuffer, i3, i10, 1, j10, z11, z12, c1438m);
            } catch (IllegalStateException unused3) {
                h0();
                if (!this.f1820N0) {
                    return z10;
                }
                k0();
                return z10;
            }
        } else {
            z2 = true;
            z10 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f1852x0;
            int i11 = this.f1850w0;
            int i12 = bufferInfo.flags;
            long j15 = bufferInfo.presentationTimeUs;
            boolean z14 = this.f1854y0;
            boolean z15 = this.f1856z0;
            C1438m c1438m2 = this.f1806F;
            c1438m2.getClass();
            i02 = i0(j, j3, mVar, byteBuffer2, i11, i12, 1, j15, z14, z15, c1438m2);
        }
        if (!i02) {
            return z10;
        }
        d0(bufferInfo.presentationTimeUs);
        boolean z16 = (bufferInfo.flags & 4) != 0 ? z2 : z10;
        if (!z16 && this.f1813I0 && this.f1856z0) {
            this.f21722g.getClass();
            this.f1845t0 = System.currentTimeMillis();
        }
        this.f1850w0 = -1;
        this.f1852x0 = null;
        if (!z16) {
            return z2;
        }
        h0();
        return z10;
    }

    public final boolean J() {
        m mVar = this.f1826R;
        if (mVar != null && this.f1807F0 != 2 && !this.f1819M0) {
            int i3 = this.f1848v0;
            u0.e eVar = this.f1853y;
            if (i3 < 0) {
                int j = mVar.j();
                this.f1848v0 = j;
                if (j >= 0) {
                    eVar.f21396e = mVar.o(j);
                    eVar.s();
                }
            }
            if (this.f1807F0 == 1) {
                if (!this.f1843s0) {
                    this.f1813I0 = true;
                    mVar.c(this.f1848v0, 0, 0L, 4);
                    this.f1848v0 = -1;
                    eVar.f21396e = null;
                }
                this.f1807F0 = 2;
                return false;
            }
            if (this.f1841q0) {
                this.f1841q0 = false;
                ByteBuffer byteBuffer = eVar.f21396e;
                byteBuffer.getClass();
                byteBuffer.put(f1795V0);
                mVar.c(this.f1848v0, 38, 0L, 0);
                this.f1848v0 = -1;
                eVar.f21396e = null;
                this.f1811H0 = true;
                return true;
            }
            if (this.f1805E0 == 1) {
                int i10 = 0;
                while (true) {
                    C1438m c1438m = this.f1829T;
                    c1438m.getClass();
                    if (i10 >= c1438m.f18219q.size()) {
                        break;
                    }
                    byte[] bArr = (byte[]) this.f1829T.f18219q.get(i10);
                    ByteBuffer byteBuffer2 = eVar.f21396e;
                    byteBuffer2.getClass();
                    byteBuffer2.put(bArr);
                    i10++;
                }
                this.f1805E0 = 2;
            }
            ByteBuffer byteBuffer3 = eVar.f21396e;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            C1803F c1803f = this.f21718c;
            c1803f.c();
            try {
                int w10 = w(c1803f, eVar, 0);
                if (w10 == -3) {
                    if (k()) {
                        this.f1818L0 = this.f1816K0;
                        return false;
                    }
                } else {
                    if (w10 == -5) {
                        if (this.f1805E0 == 2) {
                            eVar.s();
                            this.f1805E0 = 1;
                        }
                        a0(c1803f);
                        return true;
                    }
                    if (!eVar.k(4)) {
                        if (!this.f1811H0 && !eVar.k(1)) {
                            eVar.s();
                            if (this.f1805E0 == 2) {
                                this.f1805E0 = 1;
                            }
                            return true;
                        }
                        if (r0(eVar)) {
                            eVar.s();
                            this.f1827R0.f21735d++;
                            return true;
                        }
                        boolean k3 = eVar.k(1073741824);
                        if (k3) {
                            u0.b bVar = eVar.f21395d;
                            if (position == 0) {
                                bVar.getClass();
                            } else {
                                if (bVar.f21388d == null) {
                                    int[] iArr = new int[1];
                                    bVar.f21388d = iArr;
                                    bVar.f21393i.numBytesOfClearData = iArr;
                                }
                                int[] iArr2 = bVar.f21388d;
                                iArr2[0] = iArr2[0] + position;
                            }
                        }
                        long j3 = eVar.f21398g;
                        if (this.f1822O0) {
                            ArrayDeque arrayDeque = this.f1800C;
                            if (arrayDeque.isEmpty()) {
                                U u2 = this.f1828S0.f1794d;
                                C1438m c1438m2 = this.f1804E;
                                c1438m2.getClass();
                                u2.a(j3, c1438m2);
                            } else {
                                U u10 = ((r) arrayDeque.peekLast()).f1794d;
                                C1438m c1438m3 = this.f1804E;
                                c1438m3.getClass();
                                u10.a(j3, c1438m3);
                            }
                            this.f1822O0 = false;
                        }
                        this.f1816K0 = Math.max(this.f1816K0, j3);
                        if (k() || eVar.k(PKIFailureInfo.duplicateCertReq)) {
                            this.f1818L0 = this.f1816K0;
                        }
                        eVar.v();
                        if (eVar.k(268435456)) {
                            S(eVar);
                        }
                        f0(eVar);
                        int N3 = N(eVar);
                        if (k3) {
                            mVar.a(this.f1848v0, eVar.f21395d, j3, N3);
                        } else {
                            int i11 = this.f1848v0;
                            ByteBuffer byteBuffer4 = eVar.f21396e;
                            byteBuffer4.getClass();
                            mVar.c(i11, byteBuffer4.limit(), j3, N3);
                        }
                        this.f1848v0 = -1;
                        eVar.f21396e = null;
                        this.f1811H0 = true;
                        this.f1805E0 = 0;
                        this.f1827R0.f21734c++;
                        return true;
                    }
                    this.f1818L0 = this.f1816K0;
                    if (this.f1805E0 == 2) {
                        eVar.s();
                        this.f1805E0 = 1;
                    }
                    this.f1819M0 = true;
                    if (!this.f1811H0) {
                        h0();
                        return false;
                    }
                    if (!this.f1843s0) {
                        this.f1813I0 = true;
                        mVar.c(this.f1848v0, 0, 0L, 4);
                        this.f1848v0 = -1;
                        eVar.f21396e = null;
                        return false;
                    }
                }
            } catch (u0.d e10) {
                X(e10);
                j0(0);
                K();
                return true;
            }
        }
        return false;
    }

    public final void K() {
        try {
            m mVar = this.f1826R;
            AbstractC1550k.h(mVar);
            mVar.flush();
        } finally {
            m0();
        }
    }

    public final boolean L() {
        if (this.f1826R == null) {
            return false;
        }
        int i3 = this.f1809G0;
        if (i3 == 3 || ((this.f1838n0 && !this.f1814J0) || (this.f1839o0 && this.f1813I0))) {
            k0();
            return true;
        }
        if (i3 == 2) {
            int i10 = AbstractC1560u.f20190a;
            AbstractC1550k.g(i10 >= 23);
            if (i10 >= 23) {
                try {
                    v0();
                } catch (C1817l e10) {
                    AbstractC1550k.x(StubApp.getString2(1652), StubApp.getString2(1653), e10);
                    k0();
                    return true;
                }
            }
        }
        K();
        return false;
    }

    public final List M(boolean z2) {
        C1438m c1438m = this.f1804E;
        c1438m.getClass();
        k kVar = this.f1847v;
        ArrayList Q10 = Q(kVar, c1438m, z2);
        if (!Q10.isEmpty() || !z2) {
            return Q10;
        }
        ArrayList Q11 = Q(kVar, c1438m, false);
        if (!Q11.isEmpty()) {
            AbstractC1550k.w(StubApp.getString2(1652), StubApp.getString2(1654) + c1438m.f18216n + StubApp.getString2(1655) + Q11 + StubApp.getString2(1));
        }
        return Q11;
    }

    public int N(u0.e eVar) {
        return 0;
    }

    public boolean O() {
        return false;
    }

    public abstract float P(float f10, C1438m[] c1438mArr);

    public abstract ArrayList Q(k kVar, C1438m c1438m, boolean z2);

    public abstract C0250h R(p pVar, C1438m c1438m, MediaCrypto mediaCrypto, float f10);

    public abstract void S(u0.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(E0.p r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.s.T(E0.p, android.media.MediaCrypto):void");
    }

    public final boolean U(long j, long j3) {
        if (j3 >= j) {
            return false;
        }
        C1438m c1438m = this.f1806F;
        return c1438m == null || !Objects.equals(c1438m.f18216n, StubApp.getString2(1609)) || j - j3 > 80000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r7 != 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
    
        if (r1.x() != null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.s.V():void");
    }

    public final void W(MediaCrypto mediaCrypto, boolean z2) {
        C1438m c1438m = this.f1804E;
        c1438m.getClass();
        if (this.h0 == null) {
            try {
                List M5 = M(z2);
                this.h0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) M5;
                if (!arrayList.isEmpty()) {
                    this.h0.add((p) arrayList.get(0));
                }
                this.f1835k0 = null;
            } catch (v e10) {
                throw new q(c1438m, e10, z2, -49998);
            }
        }
        if (this.h0.isEmpty()) {
            throw new q(c1438m, null, z2, -49999);
        }
        ArrayDeque arrayDeque = this.h0;
        arrayDeque.getClass();
        while (this.f1826R == null) {
            p pVar = (p) arrayDeque.peekFirst();
            pVar.getClass();
            if (!q0(pVar)) {
                return;
            }
            try {
                T(pVar, mediaCrypto);
            } catch (Exception e11) {
                AbstractC1550k.x(StubApp.getString2(1652), StubApp.getString2(1681) + pVar, e11);
                arrayDeque.removeFirst();
                q qVar = new q(StubApp.getString2(1682) + pVar.f1777a + StubApp.getString2(81) + c1438m, e11, c1438m.f18216n, z2, pVar, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null);
                X(qVar);
                q qVar2 = this.f1835k0;
                if (qVar2 == null) {
                    this.f1835k0 = qVar;
                } else {
                    this.f1835k0 = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f1786a, qVar2.f1787b, qVar2.f1788c, qVar2.f1789d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f1835k0;
                }
            }
        }
        this.h0 = null;
    }

    public abstract void X(Exception exc);

    public abstract void Y(long j, String str, long j3);

    public abstract void Z(String str);

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0156, code lost:
    
        if (H() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0168, code lost:
    
        if (H() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
    
        if (r4.J(r3) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        if (H() == false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0.C1812g a0(v0.C1803F r14) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.s.a0(v0.F):v0.g");
    }

    public abstract void b0(C1438m c1438m, MediaFormat mediaFormat);

    public void c0() {
    }

    public void d0(long j) {
        this.f1830T0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f1800C;
            if (arrayDeque.isEmpty() || j < ((r) arrayDeque.peek()).f1791a) {
                return;
            }
            r rVar = (r) arrayDeque.poll();
            rVar.getClass();
            p0(rVar);
            e0();
        }
    }

    public abstract void e0();

    public void f0(u0.e eVar) {
    }

    public void g0(C1438m c1438m) {
    }

    public final void h0() {
        int i3 = this.f1809G0;
        if (i3 == 1) {
            K();
            return;
        }
        if (i3 == 2) {
            K();
            v0();
        } else if (i3 != 3) {
            this.f1820N0 = true;
            l0();
        } else {
            k0();
            V();
        }
    }

    public abstract boolean i0(long j, long j3, m mVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j10, boolean z2, boolean z10, C1438m c1438m);

    public final boolean j0(int i3) {
        C1803F c1803f = this.f21718c;
        c1803f.c();
        u0.e eVar = this.f1851x;
        eVar.s();
        int w10 = w(c1803f, eVar, i3 | 4);
        if (w10 == -5) {
            a0(c1803f);
            return true;
        }
        if (w10 != -4 || !eVar.k(4)) {
            return false;
        }
        this.f1819M0 = true;
        h0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0() {
        try {
            m mVar = this.f1826R;
            if (mVar != null) {
                mVar.release();
                this.f1827R0.f21733b++;
                p pVar = this.f1836l0;
                pVar.getClass();
                Z(pVar.f1777a);
            }
            this.f1826R = null;
            try {
                MediaCrypto mediaCrypto = this.f1815K;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f1826R = null;
            try {
                MediaCrypto mediaCrypto2 = this.f1815K;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void l0() {
    }

    public void m0() {
        this.f1848v0 = -1;
        this.f1853y.f21396e = null;
        this.f1850w0 = -1;
        this.f1852x0 = null;
        this.f1846u0 = -9223372036854775807L;
        this.f1813I0 = false;
        this.f1845t0 = -9223372036854775807L;
        this.f1811H0 = false;
        this.f1841q0 = false;
        this.f1842r0 = false;
        this.f1854y0 = false;
        this.f1856z0 = false;
        this.f1816K0 = -9223372036854775807L;
        this.f1818L0 = -9223372036854775807L;
        this.f1830T0 = -9223372036854775807L;
        this.f1807F0 = 0;
        this.f1809G0 = 0;
        this.f1805E0 = this.f1803D0 ? 1 : 0;
    }

    @Override // v0.AbstractC1810e
    public boolean n() {
        boolean h2;
        if (this.f1804E != null) {
            if (k()) {
                h2 = this.f21728p;
            } else {
                Z z2 = this.j;
                z2.getClass();
                h2 = z2.h();
            }
            if (!h2) {
                if (!(this.f1850w0 >= 0)) {
                    if (this.f1846u0 != -9223372036854775807L) {
                        this.f21722g.getClass();
                        if (SystemClock.elapsedRealtime() < this.f1846u0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void n0() {
        m0();
        this.f1825Q0 = null;
        this.h0 = null;
        this.f1836l0 = null;
        this.f1829T = null;
        this.f1832X = null;
        this.f1833Y = false;
        this.f1814J0 = false;
        this.f1834Z = -1.0f;
        this.f1837m0 = 0;
        this.f1838n0 = false;
        this.f1839o0 = false;
        this.f1840p0 = false;
        this.f1843s0 = false;
        this.f1803D0 = false;
        this.f1805E0 = 0;
    }

    @Override // v0.AbstractC1810e
    public void o() {
        this.f1804E = null;
        p0(r.f1790e);
        this.f1800C.clear();
        L();
    }

    public final void o0(Z9.q qVar) {
        Z9.q qVar2 = this.f1808G;
        if (qVar2 != qVar) {
            if (qVar != null) {
                qVar.f(null);
            }
            if (qVar2 != null) {
                qVar2.I(null);
            }
        }
        this.f1808G = qVar;
    }

    public final void p0(r rVar) {
        this.f1828S0 = rVar;
        if (rVar.f1793c != -9223372036854775807L) {
            this.f1831U0 = true;
            c0();
        }
    }

    @Override // v0.AbstractC1810e
    public void q(long j, boolean z2) {
        this.f1819M0 = false;
        this.f1820N0 = false;
        this.f1824P0 = false;
        if (this.f1797A0) {
            this.f1796A.s();
            this.f1855z.s();
            this.f1799B0 = false;
            x0.w wVar = this.f1802D;
            wVar.getClass();
            wVar.f22808a = InterfaceC1480d.f19611a;
            wVar.f22810c = 0;
            wVar.f22809b = 2;
        } else if (L()) {
            V();
        }
        if (this.f1828S0.f1794d.g() > 0) {
            this.f1822O0 = true;
        }
        this.f1828S0.f1794d.b();
        this.f1800C.clear();
    }

    public boolean q0(p pVar) {
        return true;
    }

    public boolean r0(u0.e eVar) {
        return false;
    }

    public boolean s0(C1438m c1438m) {
        return false;
    }

    public abstract int t0(k kVar, C1438m c1438m);

    public final boolean u0(C1438m c1438m) {
        if (AbstractC1560u.f20190a >= 23 && this.f1826R != null && this.f1809G0 != 3 && this.f21723h != 0) {
            float f10 = this.f1823P;
            c1438m.getClass();
            C1438m[] c1438mArr = this.f21724k;
            c1438mArr.getClass();
            float P10 = P(f10, c1438mArr);
            float f11 = this.f1834Z;
            if (f11 != P10) {
                if (P10 == -1.0f) {
                    if (this.f1811H0) {
                        this.f1807F0 = 1;
                        this.f1809G0 = 3;
                        return false;
                    }
                    k0();
                    V();
                    return false;
                }
                if (f11 != -1.0f || P10 > this.f1849w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat(StubApp.getString2(1685), P10);
                    m mVar = this.f1826R;
                    mVar.getClass();
                    mVar.b(bundle);
                    this.f1834Z = P10;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // v0.AbstractC1810e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(o0.C1438m[] r13, long r14, long r16, L0.B r18) {
        /*
            r12 = this;
            E0.r r13 = r12.f1828S0
            long r0 = r13.f1793c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            E0.r r4 = new E0.r
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.p0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f1800C
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f1816K0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f1830T0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            E0.r r5 = new E0.r
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.p0(r5)
            E0.r r13 = r12.f1828S0
            long r13 = r13.f1793c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.e0()
        L51:
            return
        L52:
            E0.r r5 = new E0.r
            long r6 = r12.f1816K0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.s.v(o0.m[], long, long, L0.B):void");
    }

    public final void v0() {
        Z9.q qVar = this.f1810H;
        qVar.getClass();
        InterfaceC1770a q10 = qVar.q();
        if (q10 instanceof A0.k) {
            try {
                MediaCrypto mediaCrypto = this.f1815K;
                mediaCrypto.getClass();
                ((A0.k) q10).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e10) {
                throw g(e10, this.f1804E, false, 6006);
            }
        }
        o0(this.f1810H);
        this.f1807F0 = 0;
        this.f1809G0 = 0;
    }

    public final void w0(long j) {
        C1438m c1438m = (C1438m) this.f1828S0.f1794d.e(j);
        if (c1438m == null && this.f1831U0 && this.f1832X != null) {
            c1438m = (C1438m) this.f1828S0.f1794d.d();
        }
        if (c1438m != null) {
            this.f1806F = c1438m;
        } else if (!this.f1833Y || this.f1806F == null) {
            return;
        }
        C1438m c1438m2 = this.f1806F;
        c1438m2.getClass();
        b0(c1438m2, this.f1832X);
        this.f1833Y = false;
        this.f1831U0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[LOOP:1: B:33:0x005b->B:42:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081 A[EDGE_INSN: B:43:0x0081->B:44:? BREAK  A[LOOP:1: B:33:0x005b->B:42:0x0080], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1 A[LOOP:2: B:45:0x0081->B:54:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2 A[EDGE_INSN: B:55:0x00a2->B:56:0x00a2 BREAK  A[LOOP:2: B:45:0x0081->B:54:0x00a1], SYNTHETIC] */
    @Override // v0.AbstractC1810e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.s.x(long, long):void");
    }
}
