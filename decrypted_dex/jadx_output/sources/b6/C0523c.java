package b6;

import N5.m;
import N5.n;
import N5.o;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.EnumMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: b6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0523c extends AbstractC0528h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10674d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10675a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f10676b = new StringBuilder(20);

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10677c = new int[9];

    public C0523c(boolean z2) {
        this.f10675a = z2;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            int i10 = IntCompanionObject.MAX_VALUE;
            for (int i11 : iArr) {
                if (i11 < i10 && i11 > i3) {
                    i10 = i11;
                }
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                if (i16 > i10) {
                    i13 |= 1 << ((length - 1) - i15);
                    i12++;
                    i14 += i16;
                }
            }
            if (i12 == 3) {
                for (int i17 = 0; i17 < length && i12 > 0; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > i10) {
                        i12--;
                        if (i18 * 2 >= i14) {
                            return -1;
                        }
                    }
                }
                return i13;
            }
            if (i12 <= 3) {
                return -1;
            }
            i3 = i10;
        }
    }

    @Override // b6.AbstractC0528h
    public final m b(int i3, T5.a aVar, EnumMap enumMap) {
        String string2;
        char c10;
        int[] iArr = this.f10677c;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f10676b;
        sb2.setLength(0);
        int i10 = aVar.f7182b;
        int b2 = aVar.b(0);
        int length = iArr.length;
        boolean z2 = false;
        int i11 = 0;
        int i12 = b2;
        while (b2 < i10) {
            if (aVar.a(b2) != z2) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else if (g(iArr) == 148 && aVar.d(Math.max(0, i12 - ((b2 - i12) / 2)), i12)) {
                    int b10 = aVar.b(new int[]{i12, b2}[1]);
                    while (true) {
                        AbstractC0528h.e(b10, aVar, iArr);
                        int g10 = g(iArr);
                        if (g10 < 0) {
                            throw N5.i.a();
                        }
                        int i13 = 0;
                        while (true) {
                            string2 = StubApp.getString2(9262);
                            if (i13 < 43) {
                                if (f10674d[i13] == g10) {
                                    c10 = string2.charAt(i13);
                                    break;
                                }
                                i13++;
                            } else {
                                if (g10 != 148) {
                                    throw N5.i.a();
                                }
                                c10 = '*';
                            }
                        }
                        sb2.append(c10);
                        int i14 = b10;
                        for (int i15 : iArr) {
                            i14 += i15;
                        }
                        int b11 = aVar.b(i14);
                        if (c10 == '*') {
                            sb2.setLength(sb2.length() - 1);
                            int i16 = 0;
                            for (int i17 : iArr) {
                                i16 += i17;
                            }
                            int i18 = (b11 - b10) - i16;
                            if (b11 != aVar.f7182b && i18 * 2 < i16) {
                                throw N5.i.a();
                            }
                            if (this.f10675a) {
                                int length2 = sb2.length() - 1;
                                int i19 = 0;
                                for (int i20 = 0; i20 < length2; i20++) {
                                    i19 += string2.indexOf(sb2.charAt(i20));
                                }
                                if (sb2.charAt(length2) != string2.charAt(i19 % 43)) {
                                    throw N5.c.a();
                                }
                                sb2.setLength(length2);
                            }
                            if (sb2.length() == 0) {
                                throw N5.i.a();
                            }
                            float f10 = (r5[1] + r5[0]) / 2.0f;
                            float f11 = (i16 / 2.0f) + b10;
                            float f12 = i3;
                            m mVar = new m(sb2.toString(), null, new o[]{new o(f10, f12), new o(f11, f12)}, N5.a.f4865c);
                            mVar.b(n.f4924n, StubApp.getString2(9263));
                            return mVar;
                        }
                        b10 = b11;
                    }
                } else {
                    i12 += iArr[0] + iArr[1];
                    int i21 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i21);
                    iArr[i21] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z2 = !z2;
            }
            b2++;
        }
        throw N5.i.a();
    }
}
