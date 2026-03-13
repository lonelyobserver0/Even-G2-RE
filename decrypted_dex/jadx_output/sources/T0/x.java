package T0;

import com.stub.StubApp;
import java.util.Collections;
import java.util.List;
import o0.C1406C;
import r0.AbstractC1540a;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final List f7062a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7067f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7068g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7069h;

    /* renamed from: i, reason: collision with root package name */
    public final float f7070i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7071k;

    /* renamed from: l, reason: collision with root package name */
    public final p2.h f7072l;

    public x(List list, int i3, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, String str, p2.h hVar) {
        this.f7062a = list;
        this.f7063b = i3;
        this.f7064c = i10;
        this.f7065d = i11;
        this.f7066e = i12;
        this.f7067f = i13;
        this.f7068g = i14;
        this.f7069h = i15;
        this.f7070i = f10;
        this.j = i16;
        this.f7071k = str;
        this.f7072l = hVar;
    }

    public static x a(C1553n c1553n, boolean z2, p2.h hVar) {
        boolean z10;
        i2.o f10;
        int i3;
        int i10 = 4;
        try {
            if (z2) {
                c1553n.H(4);
            } else {
                c1553n.H(21);
            }
            int u2 = c1553n.u() & 3;
            int u10 = c1553n.u();
            int i11 = c1553n.f20177b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z10 = true;
                if (i13 >= u10) {
                    break;
                }
                c1553n.H(1);
                int A4 = c1553n.A();
                for (int i15 = 0; i15 < A4; i15++) {
                    int A5 = c1553n.A();
                    i14 += A5 + 4;
                    c1553n.H(A5);
                }
                i13++;
            }
            c1553n.G(i11);
            byte[] bArr = new byte[i14];
            p2.h hVar2 = hVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            float f11 = 1.0f;
            String str = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 < u10) {
                int u11 = c1553n.u() & 63;
                int A7 = c1553n.A();
                int i25 = i12;
                p2.h hVar3 = hVar2;
                while (i25 < A7) {
                    boolean z11 = z10;
                    int A10 = c1553n.A();
                    int i26 = u2;
                    System.arraycopy(s0.n.f20647a, i12, bArr, i24, i10);
                    int i27 = i24 + 4;
                    System.arraycopy(c1553n.f20176a, c1553n.f20177b, bArr, i27, A10);
                    if (u11 == 32 && i25 == 0) {
                        hVar3 = s0.n.h(i27, i27 + A10, bArr);
                    } else {
                        if (u11 == 33 && i25 == 0) {
                            s0.j g10 = s0.n.g(bArr, i27, i27 + A10, hVar3);
                            i16 = g10.f20616b + 8;
                            i17 = g10.f20617c + 8;
                            int i28 = g10.f20622h;
                            int i29 = g10.f20623i;
                            i18 = i28;
                            int i30 = g10.j;
                            float f12 = g10.f20620f;
                            int i31 = g10.f20621g;
                            s0.g gVar = g10.f20615a;
                            if (gVar != null) {
                                i3 = i31;
                                str = AbstractC1540a.b(gVar.f20602a, gVar.f20604c, gVar.f20605d, gVar.f20606e, gVar.f20603b, gVar.f20607f);
                            } else {
                                i3 = i31;
                            }
                            i22 = i3;
                            f11 = f12;
                            i20 = i30;
                            i19 = i29;
                        } else if (u11 == 39 && i25 == 0 && (f10 = s0.n.f(i27, i27 + A10, bArr)) != null && hVar3 != null) {
                            i12 = 0;
                            i21 = f10.f14746a == ((s0.f) ((M4.I) hVar3.f19671a).get(0)).f20601b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i24 = i27 + A10;
                    c1553n.H(A10);
                    i25++;
                    z10 = z11;
                    u2 = i26;
                    i10 = 4;
                }
                i23++;
                hVar2 = hVar3;
                i10 = 4;
            }
            return new x(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), u2 + 1, i16, i17, i18, i19, i20, i21, f11, i22, str, hVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C1406C.a(StubApp.getString2(6126).concat(z2 ? StubApp.getString2(6124) : StubApp.getString2(6125)), e10);
        }
    }
}
