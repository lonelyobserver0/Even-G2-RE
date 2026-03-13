package o1;

import C.E;
import M4.I;
import T0.AbstractC0311b;
import T0.J;
import T0.z;
import Y.m;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import o0.AbstractC1405B;
import o0.C1404A;
import o0.C1406C;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    public E f18352n;

    /* renamed from: o, reason: collision with root package name */
    public int f18353o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18354p;

    /* renamed from: q, reason: collision with root package name */
    public z f18355q;

    /* renamed from: r, reason: collision with root package name */
    public A0.c f18356r;

    @Override // o1.i
    public final void a(long j) {
        this.f18346g = j;
        this.f18354p = j != 0;
        z zVar = this.f18355q;
        this.f18353o = zVar != null ? zVar.f7080e : 0;
    }

    @Override // o1.i
    public final long b(C1553n c1553n) {
        byte b2 = c1553n.f20176a[0];
        if ((b2 & 1) == 1) {
            return -1L;
        }
        E e10 = this.f18352n;
        AbstractC1550k.h(e10);
        boolean z2 = ((R4.b[]) e10.f788e)[(b2 >> 1) & (255 >>> (8 - e10.f784a))].f6177b;
        z zVar = (z) e10.f785b;
        int i3 = !z2 ? zVar.f7080e : zVar.f7081f;
        long j = this.f18354p ? (this.f18353o + i3) / 4 : 0;
        byte[] bArr = c1553n.f20176a;
        int length = bArr.length;
        int i10 = c1553n.f20178c + 4;
        if (length < i10) {
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            c1553n.E(copyOf.length, copyOf);
        } else {
            c1553n.F(i10);
        }
        byte[] bArr2 = c1553n.f20176a;
        int i11 = c1553n.f20178c;
        bArr2[i11 - 4] = (byte) (j & 255);
        bArr2[i11 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i11 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i11 - 1] = (byte) ((j >>> 24) & 255);
        this.f18354p = true;
        this.f18353o = i3;
        return j;
    }

    @Override // o1.i
    public final boolean c(C1553n c1553n, long j, m mVar) {
        E e10;
        z zVar;
        int i3;
        z zVar2;
        long j3;
        if (this.f18352n != null) {
            ((C1438m) mVar.f8674b).getClass();
            return false;
        }
        z zVar3 = this.f18355q;
        int i10 = 1;
        int i11 = 4;
        if (zVar3 == null) {
            AbstractC0311b.z(1, c1553n, false);
            c1553n.m();
            int u2 = c1553n.u();
            int m4 = c1553n.m();
            int j10 = c1553n.j();
            if (j10 <= 0) {
                j10 = -1;
            }
            int j11 = c1553n.j();
            int i12 = j11 > 0 ? j11 : -1;
            c1553n.j();
            int u10 = c1553n.u();
            int pow = (int) Math.pow(2.0d, u10 & 15);
            int pow2 = (int) Math.pow(2.0d, (u10 & 240) >> 4);
            c1553n.u();
            byte[] copyOf = Arrays.copyOf(c1553n.f20176a, c1553n.f20178c);
            z zVar4 = new z();
            zVar4.f7076a = u2;
            zVar4.f7077b = m4;
            zVar4.f7078c = j10;
            zVar4.f7079d = i12;
            zVar4.f7080e = pow;
            zVar4.f7081f = pow2;
            zVar4.f7082g = copyOf;
            this.f18355q = zVar4;
        } else {
            A0.c cVar = this.f18356r;
            if (cVar == null) {
                this.f18356r = AbstractC0311b.x(c1553n, true, true);
            } else {
                int i13 = c1553n.f20178c;
                byte[] bArr = new byte[i13];
                System.arraycopy(c1553n.f20176a, 0, bArr, 0, i13);
                int i14 = 5;
                AbstractC0311b.z(5, c1553n, false);
                int u11 = c1553n.u() + 1;
                J j12 = new J(c1553n.f20176a);
                int i15 = 8;
                j12.t(c1553n.f20177b * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 < u11) {
                        int i19 = i15;
                        if (j12.i(24) != 5653314) {
                            throw C1406C.a(StubApp.getString2(21604) + ((j12.f6951d * 8) + j12.f6952e), null);
                        }
                        int i20 = j12.i(16);
                        int i21 = j12.i(24);
                        if (j12.h()) {
                            j12.t(i14);
                            for (int i22 = 0; i22 < i21; i22 += j12.i(AbstractC0311b.n(i21 - i22))) {
                            }
                        } else {
                            boolean h2 = j12.h();
                            for (int i23 = 0; i23 < i21; i23++) {
                                if (!h2) {
                                    j12.t(i14);
                                } else if (j12.h()) {
                                    j12.t(i14);
                                }
                            }
                        }
                        int i24 = j12.i(i11);
                        if (i24 > 2) {
                            throw C1406C.a(StubApp.getString2(21603) + i24, null);
                        }
                        if (i24 == 1 || i24 == 2) {
                            j12.t(32);
                            j12.t(32);
                            int i25 = j12.i(i11) + 1;
                            j12.t(1);
                            if (i24 != 1) {
                                zVar2 = zVar3;
                                j3 = i21 * i20;
                            } else if (i20 != 0) {
                                zVar2 = zVar3;
                                j3 = (long) Math.floor(Math.pow(i21, 1.0d / i20));
                            } else {
                                zVar2 = zVar3;
                                j3 = 0;
                            }
                            j12.t((int) (j3 * i25));
                        } else {
                            zVar2 = zVar3;
                        }
                        i16++;
                        i15 = i19;
                        zVar3 = zVar2;
                        i11 = 4;
                        i14 = 5;
                    } else {
                        z zVar5 = zVar3;
                        int i26 = i15;
                        int i27 = 6;
                        int i28 = j12.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (j12.i(16) != 0) {
                                throw C1406C.a(StubApp.getString2(21605), null);
                            }
                        }
                        int i30 = j12.i(6) + 1;
                        int i31 = 0;
                        while (true) {
                            int i32 = 3;
                            if (i31 < i30) {
                                int i33 = j12.i(i18);
                                if (i33 == 0) {
                                    int i34 = i26;
                                    i3 = i10;
                                    j12.t(i34);
                                    j12.t(16);
                                    j12.t(16);
                                    j12.t(6);
                                    j12.t(i34);
                                    int i35 = j12.i(4) + 1;
                                    int i36 = 0;
                                    while (i36 < i35) {
                                        j12.t(i34);
                                        i36++;
                                        i34 = 8;
                                    }
                                } else {
                                    if (i33 != i10) {
                                        throw C1406C.a(StubApp.getString2(21606) + i33, null);
                                    }
                                    int i37 = j12.i(5);
                                    int[] iArr = new int[i37];
                                    i3 = i10;
                                    int i38 = -1;
                                    for (int i39 = 0; i39 < i37; i39++) {
                                        int i40 = j12.i(4);
                                        iArr[i39] = i40;
                                        if (i40 > i38) {
                                            i38 = i40;
                                        }
                                    }
                                    int i41 = i38 + 1;
                                    int[] iArr2 = new int[i41];
                                    int i42 = 0;
                                    while (i42 < i41) {
                                        iArr2[i42] = j12.i(i32) + 1;
                                        int i43 = j12.i(i17);
                                        int i44 = i26;
                                        if (i43 > 0) {
                                            j12.t(i44);
                                        }
                                        int i45 = 0;
                                        while (i45 < (i3 << i43)) {
                                            j12.t(i44);
                                            i45++;
                                            i44 = 8;
                                        }
                                        i42++;
                                        i26 = 8;
                                        i32 = 3;
                                        i17 = 2;
                                    }
                                    j12.t(i17);
                                    int i46 = j12.i(4);
                                    int i47 = 0;
                                    int i48 = 0;
                                    for (int i49 = 0; i49 < i37; i49++) {
                                        i47 += iArr2[iArr[i49]];
                                        while (i48 < i47) {
                                            j12.t(i46);
                                            i48++;
                                        }
                                    }
                                }
                                i31++;
                                i10 = i3;
                                i26 = 8;
                                i27 = 6;
                                i18 = 16;
                                i17 = 2;
                            } else {
                                int i50 = i10;
                                int i51 = j12.i(i27) + 1;
                                int i52 = 0;
                                while (i52 < i51) {
                                    if (j12.i(16) > 2) {
                                        throw C1406C.a(StubApp.getString2(21607), null);
                                    }
                                    j12.t(24);
                                    j12.t(24);
                                    j12.t(24);
                                    int i53 = j12.i(i27) + 1;
                                    int i54 = 8;
                                    j12.t(8);
                                    int[] iArr3 = new int[i53];
                                    for (int i55 = 0; i55 < i53; i55++) {
                                        iArr3[i55] = ((j12.h() ? j12.i(5) : 0) * 8) + j12.i(3);
                                    }
                                    int i56 = 0;
                                    while (i56 < i53) {
                                        int i57 = 0;
                                        while (i57 < i54) {
                                            if ((iArr3[i56] & (i50 << i57)) != 0) {
                                                j12.t(i54);
                                            }
                                            i57++;
                                            i54 = 8;
                                        }
                                        i56++;
                                        i54 = 8;
                                    }
                                    i52++;
                                    i27 = 6;
                                }
                                int i58 = j12.i(i27) + 1;
                                int i59 = 0;
                                while (i59 < i58) {
                                    int i60 = j12.i(16);
                                    if (i60 != 0) {
                                        AbstractC1550k.k(StubApp.getString2(6105), StubApp.getString2(21608) + i60);
                                        zVar = zVar5;
                                    } else {
                                        int i61 = j12.h() ? j12.i(4) + 1 : i50;
                                        boolean h4 = j12.h();
                                        zVar = zVar5;
                                        int i62 = zVar.f7076a;
                                        if (h4) {
                                            int i63 = j12.i(8) + 1;
                                            for (int i64 = 0; i64 < i63; i64++) {
                                                int i65 = i62 - 1;
                                                j12.t(AbstractC0311b.n(i65));
                                                j12.t(AbstractC0311b.n(i65));
                                            }
                                        }
                                        if (j12.i(2) != 0) {
                                            throw C1406C.a(StubApp.getString2(21609), null);
                                        }
                                        if (i61 > i50) {
                                            for (int i66 = 0; i66 < i62; i66++) {
                                                j12.t(4);
                                            }
                                        }
                                        for (int i67 = 0; i67 < i61; i67++) {
                                            j12.t(8);
                                            j12.t(8);
                                            j12.t(8);
                                        }
                                    }
                                    i59++;
                                    zVar5 = zVar;
                                    i50 = 1;
                                }
                                z zVar6 = zVar5;
                                int i68 = j12.i(6);
                                int i69 = i68 + 1;
                                R4.b[] bVarArr = new R4.b[i69];
                                for (int i70 = 0; i70 < i69; i70++) {
                                    boolean h5 = j12.h();
                                    j12.i(16);
                                    j12.i(16);
                                    j12.i(8);
                                    bVarArr[i70] = new R4.b(h5, 2);
                                }
                                if (!j12.h()) {
                                    throw C1406C.a(StubApp.getString2(21610), null);
                                }
                                e10 = new E(zVar6, cVar, bArr, bVarArr, AbstractC0311b.n(i68));
                            }
                        }
                    }
                }
            }
        }
        e10 = null;
        this.f18352n = e10;
        if (e10 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        z zVar7 = (z) e10.f785b;
        arrayList.add((byte[]) zVar7.f7082g);
        arrayList.add((byte[]) e10.f787d);
        C1404A u12 = AbstractC0311b.u(I.n((String[]) ((A0.c) e10.f786c).f29a));
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(1626));
        c1437l.f18173h = zVar7.f7079d;
        c1437l.f18174i = zVar7.f7078c;
        c1437l.f18156B = zVar7.f7076a;
        c1437l.f18157C = zVar7.f7077b;
        c1437l.f18180p = arrayList;
        c1437l.f18175k = u12;
        mVar.f8674b = new C1438m(c1437l);
        return true;
    }

    @Override // o1.i
    public final void d(boolean z2) {
        super.d(z2);
        if (z2) {
            this.f18352n = null;
            this.f18355q = null;
            this.f18356r = null;
        }
        this.f18353o = 0;
        this.f18354p = false;
    }
}
