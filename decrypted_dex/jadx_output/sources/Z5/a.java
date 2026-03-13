package Z5;

import N5.b;
import N5.e;
import N5.i;
import N5.k;
import N5.m;
import N5.n;
import N5.o;
import X5.c;
import a6.AbstractC0391a;
import com.stub.StubApp;
import java.text.DecimalFormat;
import java.util.EnumMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    public static final o[] f8982b = new o[0];

    /* renamed from: a, reason: collision with root package name */
    public final c f8983a = new c(1);

    @Override // N5.k
    public final m a(b bVar, EnumMap enumMap) {
        int a3;
        byte[] bArr;
        String sb2;
        T5.b a9 = bVar.a();
        int i3 = a9.f7183a;
        int i10 = a9.f7184b;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < a9.f7184b; i13++) {
            int i14 = 0;
            while (true) {
                int i15 = a9.f7185c;
                if (i14 < i15) {
                    int i16 = a9.f7186d[(i15 * i13) + i14];
                    if (i16 != 0) {
                        if (i13 < i10) {
                            i10 = i13;
                        }
                        if (i13 > i12) {
                            i12 = i13;
                        }
                        int i17 = i14 * 32;
                        if (i17 < i3) {
                            int i18 = 0;
                            while ((i16 << (31 - i18)) == 0) {
                                i18++;
                            }
                            int i19 = i18 + i17;
                            if (i19 < i3) {
                                i3 = i19;
                            }
                        }
                        if (i17 + 31 > i11) {
                            int i20 = 31;
                            while ((i16 >>> i20) == 0) {
                                i20--;
                            }
                            int i21 = i17 + i20;
                            if (i21 > i11) {
                                i11 = i21;
                            }
                        }
                    }
                    i14++;
                }
            }
        }
        int i22 = 1;
        int[] iArr = (i11 < i3 || i12 < i10) ? null : new int[]{i3, i10, (i11 - i3) + 1, (i12 - i10) + 1};
        if (iArr == null) {
            throw i.a();
        }
        int i23 = iArr[0];
        int i24 = iArr[1];
        int i25 = iArr[2];
        int i26 = iArr[3];
        int[] iArr2 = new int[33];
        for (int i27 = 0; i27 < 33; i27++) {
            int min = Math.min((((i26 / 2) + (i27 * i26)) / 33) + i24, i26 - 1);
            int i28 = 0;
            while (i28 < 30) {
                int i29 = i22;
                if (a9.b(Math.min(((((i27 & 1) * i25) / 2) + ((i25 / 2) + (i28 * i25))) / 30, i25 - 1) + i23, min)) {
                    int i30 = (i28 / 32) + i27;
                    iArr2[i30] = iArr2[i30] | (i29 << (i28 & 31));
                }
                i28++;
                i22 = i29;
            }
        }
        int i31 = i22;
        c cVar = this.f8983a;
        cVar.getClass();
        byte[] bArr2 = new byte[144];
        for (int i32 = 0; i32 < 33; i32++) {
            int[] iArr3 = AbstractC0391a.f9285a[i32];
            for (int i33 = 0; i33 < 30; i33++) {
                int i34 = iArr3[i33];
                if (i34 >= 0 && ((iArr2[(i33 / 32) + i32] >>> (i33 & 31)) & 1) != 0) {
                    int i35 = i34 / 6;
                    bArr2[i35] = (byte) (bArr2[i35] | ((byte) (i31 << (5 - (i34 % 6)))));
                }
            }
        }
        int a10 = cVar.a(bArr2, 0, 10, 10, 0);
        int i36 = bArr2[0] & 15;
        if (i36 == 2 || i36 == 3 || i36 == 4) {
            a3 = a10 + cVar.a(bArr2, 20, 84, 40, 1) + cVar.a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i36 != 5) {
                throw e.a();
            }
            a3 = a10 + cVar.a(bArr2, 20, 68, 56, 1) + cVar.a(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb3 = new StringBuilder(144);
        if (i36 == 2 || i36 == 3) {
            if (i36 == 2) {
                int a11 = AbstractC0391a.a(bArr, AbstractC0391a.f9289e);
                int a12 = AbstractC0391a.a(bArr, AbstractC0391a.f9288d);
                if (a12 > 10) {
                    throw e.a();
                }
                sb2 = new DecimalFormat(StubApp.getString2(7622).substring(0, a12)).format(a11);
            } else {
                StringBuilder sb4 = new StringBuilder(6);
                byte[][] bArr3 = AbstractC0391a.f9290f;
                for (int i37 = 0; i37 < 6; i37++) {
                    sb4.append(AbstractC0391a.f9291g[0].charAt(AbstractC0391a.a(bArr, bArr3[i37])));
                }
                sb2 = sb4.toString();
            }
            DecimalFormat decimalFormat = new DecimalFormat(StubApp.getString2(7623));
            String format = decimalFormat.format(AbstractC0391a.a(bArr, AbstractC0391a.f9286b));
            String format2 = decimalFormat.format(AbstractC0391a.a(bArr, AbstractC0391a.f9287c));
            sb3.append(AbstractC0391a.b(10, 84, bArr));
            if (sb3.toString().startsWith(StubApp.getString2(7624))) {
                sb3.insert(9, sb2 + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb3.insert(0, sb2 + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        } else if (i36 == 4) {
            sb3.append(AbstractC0391a.b(i31, 93, bArr));
        } else if (i36 == 5) {
            sb3.append(AbstractC0391a.b(i31, 77, bArr));
        }
        String sb5 = sb3.toString();
        String valueOf = String.valueOf(i36);
        Integer valueOf2 = Integer.valueOf(a3);
        m mVar = new m(sb5, bArr, f8982b, N5.a.f4871k);
        mVar.b(n.f4916d, valueOf2);
        if (valueOf != null) {
            mVar.b(n.f4915c, valueOf);
        }
        return mVar;
    }

    @Override // N5.k
    public final void reset() {
    }
}
