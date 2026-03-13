package b6;

import N5.l;
import N5.m;
import N5.n;
import N5.o;
import java.util.Arrays;
import java.util.EnumMap;

/* renamed from: b6.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0528h implements N5.k {
    public static float d(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i3 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i3 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i3 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i3;
        float f12 = f11 / i10;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            float f15 = iArr2[i12] * f12;
            float f16 = iArr[i12];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void e(int i3, T5.a aVar, int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i11 = aVar.f7182b;
        if (i3 >= i11) {
            throw N5.i.a();
        }
        boolean z2 = !aVar.a(i3);
        while (i3 < i11) {
            if (aVar.a(i3) != z2) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                i10++;
                if (i10 == length) {
                    break;
                }
                iArr[i10] = 1;
                z2 = !z2;
            }
            i3++;
        }
        if (i10 != length) {
            if (i10 != length - 1 || i3 != i11) {
                throw N5.i.a();
            }
        }
    }

    public static void f(int i3, T5.a aVar, int[] iArr) {
        int length = iArr.length;
        boolean a3 = aVar.a(i3);
        while (i3 > 0 && length >= 0) {
            i3--;
            if (aVar.a(i3) != a3) {
                length--;
                a3 = !a3;
            }
        }
        if (length >= 0) {
            throw N5.i.a();
        }
        e(i3 + 1, aVar, iArr);
    }

    @Override // N5.k
    public m a(N5.b bVar, EnumMap enumMap) {
        try {
            return c(bVar, enumMap);
        } catch (N5.i e10) {
            if (enumMap == null || !enumMap.containsKey(N5.d.f4885d) || !bVar.f4880a.f7196a.c()) {
                throw e10;
            }
            N5.g d8 = bVar.f4880a.f7196a.d();
            m c10 = c(new N5.b(new T5.e(d8)), enumMap);
            EnumMap enumMap2 = c10.f4912e;
            n nVar = n.f4913a;
            int i3 = 270;
            if (enumMap2 != null && enumMap2.containsKey(nVar)) {
                i3 = (((Integer) enumMap2.get(nVar)).intValue() + 270) % 360;
            }
            c10.b(nVar, Integer.valueOf(i3));
            o[] oVarArr = c10.f4910c;
            if (oVarArr != null) {
                int i10 = d8.f4898b;
                for (int i11 = 0; i11 < oVarArr.length; i11++) {
                    o oVar = oVarArr[i11];
                    oVarArr[i11] = new o((i10 - oVar.f4927b) - 1.0f, oVar.f4926a);
                }
            }
            return c10;
        }
    }

    public abstract m b(int i3, T5.a aVar, EnumMap enumMap);

    public final m c(N5.b bVar, EnumMap enumMap) {
        EnumMap enumMap2;
        int i3;
        N5.b bVar2 = bVar;
        EnumMap enumMap3 = enumMap;
        N5.g gVar = bVar2.f4880a.f7196a;
        int i10 = gVar.f4897a;
        int i11 = gVar.f4898b;
        T5.a aVar = new T5.a(i10);
        int i12 = 1;
        boolean z2 = enumMap3 != null && enumMap3.containsKey(N5.d.f4885d);
        int max = Math.max(1, i11 >> (z2 ? 8 : 5));
        int i13 = z2 ? i11 : 15;
        int i14 = i11 / 2;
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i15 + 1;
            int i17 = i16 / 2;
            if ((i15 & 1) != 0) {
                i17 = -i17;
            }
            int i18 = (i17 * max) + i14;
            if (i18 < 0 || i18 >= i11) {
                break;
            }
            try {
                aVar = bVar2.b(aVar, i18);
                int i19 = 0;
                while (i19 < 2) {
                    if (i19 == i12) {
                        aVar.e();
                        if (enumMap3 != null) {
                            N5.d dVar = N5.d.f4890k;
                            if (enumMap3.containsKey(dVar)) {
                                EnumMap enumMap4 = new EnumMap(N5.d.class);
                                enumMap4.putAll(enumMap3);
                                enumMap4.remove(dVar);
                                enumMap3 = enumMap4;
                            }
                        }
                    }
                    try {
                        m b2 = b(i18, aVar, enumMap3);
                        if (i19 == i12) {
                            i3 = i12;
                            try {
                                b2.b(n.f4913a, 180);
                                o[] oVarArr = b2.f4910c;
                                if (oVarArr != null) {
                                    float f10 = i10;
                                    try {
                                        o oVar = oVarArr[0];
                                        enumMap2 = enumMap3;
                                        try {
                                            oVarArr[0] = new o((f10 - oVar.f4926a) - 1.0f, oVar.f4927b);
                                            o oVar2 = oVarArr[i3];
                                            oVarArr[i3] = new o((f10 - oVar2.f4926a) - 1.0f, oVar2.f4927b);
                                        } catch (l unused) {
                                            continue;
                                            i19++;
                                            enumMap3 = enumMap2;
                                            i12 = i3;
                                        }
                                    } catch (l unused2) {
                                        enumMap2 = enumMap3;
                                    }
                                }
                            } catch (l unused3) {
                                enumMap2 = enumMap3;
                                i19++;
                                enumMap3 = enumMap2;
                                i12 = i3;
                            }
                        }
                        return b2;
                    } catch (l unused4) {
                        enumMap2 = enumMap3;
                        i3 = i12;
                    }
                }
            } catch (N5.i unused5) {
            }
            bVar2 = bVar;
            i15 = i16;
            i12 = i12;
        }
        throw N5.i.a();
    }

    @Override // N5.k
    public void reset() {
    }
}
