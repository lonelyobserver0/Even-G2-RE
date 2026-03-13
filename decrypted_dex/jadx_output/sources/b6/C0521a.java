package b6;

import N5.m;
import N5.n;
import N5.o;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.EnumMap;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0521a extends AbstractC0528h {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f10667d = StubApp.getString2(9258).toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10668e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f10669f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f10670a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public int[] f10671b = new int[80];

    /* renamed from: c, reason: collision with root package name */
    public int f10672c = 0;

    public static boolean g(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b6.AbstractC0528h
    public final m b(int i3, T5.a aVar, EnumMap enumMap) {
        int i10;
        int[] iArr;
        int i11;
        Arrays.fill(this.f10671b, 0);
        this.f10672c = 0;
        int c10 = aVar.c(0);
        int i12 = aVar.f7182b;
        if (c10 >= i12) {
            throw N5.i.a();
        }
        int i13 = 1;
        int i14 = 0;
        boolean z2 = true;
        while (c10 < i12) {
            if (aVar.a(c10) != z2) {
                i14++;
            } else {
                int[] iArr2 = this.f10671b;
                int i15 = this.f10672c;
                iArr2[i15] = i14;
                int i16 = i15 + 1;
                this.f10672c = i16;
                if (i16 >= iArr2.length) {
                    int[] iArr3 = new int[i16 * 2];
                    System.arraycopy(iArr2, 0, iArr3, 0, i16);
                    this.f10671b = iArr3;
                }
                z2 = !z2;
                i14 = 1;
            }
            c10++;
        }
        int[] iArr4 = this.f10671b;
        int i17 = this.f10672c;
        iArr4[i17] = i14;
        int i18 = i17 + 1;
        this.f10672c = i18;
        if (i18 >= iArr4.length) {
            int[] iArr5 = new int[i18 * 2];
            System.arraycopy(iArr4, 0, iArr5, 0, i18);
            this.f10671b = iArr5;
        }
        int i19 = 1;
        while (i19 < this.f10672c) {
            int h2 = h(i19);
            if (h2 != -1) {
                char[] cArr = f10667d;
                char c11 = cArr[h2];
                char[] cArr2 = f10669f;
                if (g(cArr2, c11)) {
                    int i20 = 0;
                    for (int i21 = i19; i21 < i19 + 7; i21++) {
                        i20 += this.f10671b[i21];
                    }
                    if (i19 == i13 || this.f10671b[i19 - 1] >= i20 / 2) {
                        StringBuilder sb2 = this.f10670a;
                        sb2.setLength(0);
                        int i22 = i19;
                        while (true) {
                            int h4 = h(i22);
                            if (h4 == -1) {
                                throw N5.i.a();
                            }
                            sb2.append((char) h4);
                            i10 = i22 + 8;
                            if ((sb2.length() <= i13 || !g(cArr2, cArr[h4])) && i10 < this.f10672c) {
                                i22 = i10;
                                i13 = i13;
                            }
                        }
                        int i23 = i22 + 7;
                        int i24 = this.f10671b[i23];
                        int i25 = 0;
                        for (int i26 = -8; i26 < -1; i26++) {
                            i25 += this.f10671b[i10 + i26];
                        }
                        int i27 = 2;
                        if (i10 < this.f10672c && i24 < i25 / 2) {
                            throw N5.i.a();
                        }
                        int[] iArr6 = new int[4];
                        iArr6[0] = 0;
                        iArr6[i13] = 0;
                        iArr6[2] = 0;
                        iArr6[3] = 0;
                        int[] iArr7 = new int[4];
                        iArr7[0] = 0;
                        iArr7[i13] = 0;
                        iArr7[2] = 0;
                        iArr7[3] = 0;
                        int length = sb2.length() - i13;
                        int i28 = i19;
                        int i29 = 0;
                        while (true) {
                            int i30 = 6;
                            iArr = f10668e;
                            if (i29 > length) {
                                break;
                            }
                            int i31 = iArr[sb2.charAt(i29)];
                            while (i30 >= 0) {
                                int i32 = ((i31 & 1) * 2) + (i30 & 1);
                                iArr6[i32] = iArr6[i32] + this.f10671b[i28 + i30];
                                iArr7[i32] = iArr7[i32] + 1;
                                i31 >>= 1;
                                i30--;
                                i13 = i13;
                            }
                            i28 += 8;
                            i29++;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i33 = 0;
                        while (i33 < i27) {
                            fArr2[i33] = 0.0f;
                            int i34 = i33 + 2;
                            int i35 = i27;
                            float f10 = iArr6[i34];
                            float f11 = iArr7[i34];
                            float f12 = ((f10 / f11) + (iArr6[i33] / iArr7[i33])) / 2.0f;
                            fArr2[i34] = f12;
                            fArr[i33] = f12;
                            fArr[i34] = ((f10 * 2.0f) + 1.5f) / f11;
                            i33++;
                            i27 = i35;
                        }
                        int i36 = i19;
                        for (int i37 = 0; i37 <= length; i37++) {
                            int i38 = iArr[sb2.charAt(i37)];
                            for (int i39 = 6; i39 >= 0; i39--) {
                                int i40 = ((i38 & 1) * 2) + (i39 & 1);
                                float f13 = this.f10671b[i36 + i39];
                                if (f13 < fArr2[i40] || f13 > fArr[i40]) {
                                    throw N5.i.a();
                                }
                                i38 >>= 1;
                            }
                            i36 += 8;
                        }
                        for (int i41 = 0; i41 < sb2.length(); i41++) {
                            sb2.setCharAt(i41, cArr[sb2.charAt(i41)]);
                        }
                        if (!g(cArr2, sb2.charAt(0))) {
                            throw N5.i.a();
                        }
                        if (!g(cArr2, sb2.charAt(sb2.length() - 1))) {
                            throw N5.i.a();
                        }
                        if (sb2.length() <= 3) {
                            throw N5.i.a();
                        }
                        if (enumMap == null || !enumMap.containsKey(N5.d.j)) {
                            sb2.deleteCharAt(sb2.length() - 1);
                            i11 = 0;
                            sb2.deleteCharAt(0);
                        } else {
                            i11 = 0;
                        }
                        int i42 = i11;
                        while (i11 < i19) {
                            i42 += this.f10671b[i11];
                            i11++;
                        }
                        float f14 = i42;
                        while (i19 < i23) {
                            i42 += this.f10671b[i19];
                            i19++;
                        }
                        float f15 = i3;
                        m mVar = new m(sb2.toString(), null, new o[]{new o(f14, f15), new o(i42, f15)}, N5.a.f4864b);
                        mVar.b(n.f4924n, StubApp.getString2(9259));
                        return mVar;
                    }
                }
            }
            i19 += 2;
            i13 = i13;
        }
        throw N5.i.a();
    }

    public final int h(int i3) {
        int i10 = i3 + 7;
        if (i10 >= this.f10672c) {
            return -1;
        }
        int[] iArr = this.f10671b;
        int i11 = IntCompanionObject.MAX_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int i15 = i3; i15 < i10; i15 += 2) {
            int i16 = iArr[i15];
            if (i16 < i13) {
                i13 = i16;
            }
            if (i16 > i14) {
                i14 = i16;
            }
        }
        int i17 = (i13 + i14) / 2;
        int i18 = 0;
        for (int i19 = i3 + 1; i19 < i10; i19 += 2) {
            int i20 = iArr[i19];
            if (i20 < i11) {
                i11 = i20;
            }
            if (i20 > i18) {
                i18 = i20;
            }
        }
        int i21 = (i11 + i18) / 2;
        int i22 = 128;
        int i23 = 0;
        for (int i24 = 0; i24 < 7; i24++) {
            i22 >>= 1;
            if (iArr[i3 + i24] > ((i24 & 1) == 0 ? i17 : i21)) {
                i23 |= i22;
            }
        }
        while (true) {
            int[] iArr2 = f10668e;
            if (i12 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i12] == i23) {
                return i12;
            }
            i12++;
        }
    }
}
