package b6;

import N5.m;
import N5.n;
import N5.o;
import com.stub.StubApp;
import java.util.EnumMap;

/* renamed from: b6.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0526f extends AbstractC0528h {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10687b = {6, 8, 10, 12, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10688c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f10689d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f10690e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    public int f10691a = -1;

    public static int g(int[] iArr) {
        float f10 = 0.38f;
        int i3 = -1;
        for (int i10 = 0; i10 < 20; i10++) {
            float d8 = AbstractC0528h.d(iArr, f10690e[i10], 0.5f);
            if (d8 < f10) {
                i3 = i10;
                f10 = d8;
            } else if (d8 == f10) {
                i3 = -1;
            }
        }
        if (i3 >= 0) {
            return i3 % 10;
        }
        throw N5.i.a();
    }

    public static int[] h(int i3, T5.a aVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i10 = aVar.f7182b;
        int i11 = i3;
        boolean z2 = false;
        int i12 = 0;
        while (i3 < i10) {
            if (aVar.a(i3) != z2) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (AbstractC0528h.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i3};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z2 = !z2;
            }
            i3++;
        }
        throw N5.i.a();
    }

    @Override // b6.AbstractC0528h
    public final m b(int i3, T5.a aVar, EnumMap enumMap) {
        int[] h2;
        boolean z2;
        int i10 = aVar.f7182b;
        int b2 = aVar.b(0);
        if (b2 == i10) {
            throw N5.i.a();
        }
        int[] h4 = h(b2, aVar, f10688c);
        int i11 = h4[1];
        int i12 = h4[0];
        this.f10691a = (i11 - i12) / 4;
        i(aVar, i12);
        int[][] iArr = f10689d;
        aVar.e();
        try {
            int i13 = aVar.f7182b;
            int b10 = aVar.b(0);
            if (b10 == i13) {
                throw N5.i.a();
            }
            try {
                h2 = h(b10, aVar, iArr[0]);
            } catch (N5.i unused) {
                h2 = h(b10, aVar, iArr[1]);
            }
            i(aVar, h2[0]);
            int i14 = h2[0];
            int i15 = aVar.f7182b;
            h2[0] = i15 - h2[1];
            h2[1] = i15 - i14;
            aVar.e();
            StringBuilder sb2 = new StringBuilder(20);
            int i16 = h4[1];
            int i17 = h2[0];
            int[] iArr2 = new int[10];
            int[] iArr3 = new int[5];
            int[] iArr4 = new int[5];
            while (i16 < i17) {
                AbstractC0528h.e(i16, aVar, iArr2);
                for (int i18 = 0; i18 < 5; i18++) {
                    int i19 = i18 * 2;
                    iArr3[i18] = iArr2[i19];
                    iArr4[i18] = iArr2[i19 + 1];
                }
                sb2.append((char) (g(iArr3) + 48));
                sb2.append((char) (g(iArr4) + 48));
                for (int i20 = 0; i20 < 10; i20++) {
                    i16 += iArr2[i20];
                }
            }
            String sb3 = sb2.toString();
            int[] iArr5 = enumMap != null ? (int[]) enumMap.get(N5.d.f4887f) : null;
            if (iArr5 == null) {
                iArr5 = f10687b;
            }
            int length = sb3.length();
            int length2 = iArr5.length;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i21 >= length2) {
                    z2 = false;
                    break;
                }
                int i23 = iArr5[i21];
                if (length == i23) {
                    z2 = true;
                    break;
                }
                if (i23 > i22) {
                    i22 = i23;
                }
                i21++;
            }
            if (!z2 && length > i22) {
                z2 = true;
            }
            if (!z2) {
                throw N5.e.a();
            }
            float f10 = i3;
            m mVar = new m(sb3, null, new o[]{new o(h4[1], f10), new o(h2[0], f10)}, N5.a.j);
            mVar.b(n.f4924n, StubApp.getString2(9268));
            return mVar;
        } catch (Throwable th) {
            aVar.e();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(T5.a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f10691a
            int r0 = r0 * 10
            int r0 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L1a
            if (r4 < 0) goto L1a
            boolean r1 = r3.a(r4)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L1a:
            if (r0 != 0) goto L1d
            return
        L1d:
            N5.i r3 = N5.i.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0526f.i(T5.a, int):void");
    }
}
