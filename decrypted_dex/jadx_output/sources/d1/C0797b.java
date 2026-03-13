package d1;

import Ec.l;
import T0.J;
import c1.C0548a;
import e1.C0836a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import o0.C1404A;
import r0.C1553n;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0797b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13410a;

    public static C0836a z(C1553n c1553n) {
        String p8 = c1553n.p();
        p8.getClass();
        String p9 = c1553n.p();
        p9.getClass();
        return new C0836a(p8, p9, c1553n.o(), c1553n.o(), Arrays.copyOfRange(c1553n.f20176a, c1553n.f20177b, c1553n.f20178c));
    }

    @Override // Ec.l
    public final C1404A i(C0548a c0548a, ByteBuffer byteBuffer) {
        boolean z2 = true;
        switch (this.f13410a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                J j = new J(byteBuffer.array(), byteBuffer.limit());
                int i3 = 12;
                j.t(12);
                int f10 = (j.f() + j.i(12)) - 4;
                j.t(44);
                j.u(j.i(12));
                j.t(16);
                ArrayList arrayList = new ArrayList();
                while (j.f() < f10) {
                    j.t(48);
                    int i10 = j.i(8);
                    j.t(4);
                    int f11 = j.f() + j.i(i3);
                    String str = null;
                    String str2 = null;
                    while (j.f() < f11) {
                        int i11 = j.i(8);
                        int i12 = j.i(8);
                        boolean z10 = z2;
                        int f12 = j.f() + i12;
                        if (i11 == 2) {
                            int i13 = j.i(16);
                            j.t(8);
                            if (i13 == 3) {
                                while (j.f() < f12) {
                                    int i14 = j.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i14];
                                    j.l(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = j.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        j.u(j.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i12];
                            j.l(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        j.q(f12 * 8);
                        z2 = z10;
                    }
                    boolean z11 = z2;
                    j.q(f11 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C0796a(i10, str.concat(str2)));
                    }
                    z2 = z11;
                    i3 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C1404A(arrayList);
            default:
                return new C1404A(z(new C1553n(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
