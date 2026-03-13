package k6;

import T5.g;
import com.stub.StubApp;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1109a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15452a = StubApp.getString2(19109).toCharArray();

    public static void a(T5.c cVar, StringBuilder sb2, int i3, boolean z2) {
        while (i3 > 1) {
            if (cVar.a() < 11) {
                throw N5.e.a();
            }
            int b2 = cVar.b(11);
            sb2.append(e(b2 / 45));
            sb2.append(e(b2 % 45));
            i3 -= 2;
        }
        if (i3 == 1) {
            if (cVar.a() < 6) {
                throw N5.e.a();
            }
            sb2.append(e(cVar.b(6)));
        }
        if (z2) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(T5.c r29, java.lang.StringBuilder r30, int r31, T5.d r32, java.util.ArrayList r33, java.util.EnumMap r34) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.AbstractC1109a.b(T5.c, java.lang.StringBuilder, int, T5.d, java.util.ArrayList, java.util.EnumMap):void");
    }

    public static void c(T5.c cVar, StringBuilder sb2, int i3) {
        if (g.f7211c == null) {
            throw N5.e.a();
        }
        if (i3 * 13 > cVar.a()) {
            throw N5.e.a();
        }
        byte[] bArr = new byte[i3 * 2];
        int i10 = 0;
        while (i3 > 0) {
            int b2 = cVar.b(13);
            int i11 = (b2 % 96) | ((b2 / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) ((i12 >> 8) & 255);
            bArr[i10 + 1] = (byte) (i12 & 255);
            i10 += 2;
            i3--;
        }
        sb2.append(new String(bArr, g.f7211c));
    }

    public static void d(T5.c cVar, StringBuilder sb2, int i3) {
        while (i3 >= 3) {
            if (cVar.a() < 10) {
                throw N5.e.a();
            }
            int b2 = cVar.b(10);
            if (b2 >= 1000) {
                throw N5.e.a();
            }
            sb2.append(e(b2 / 100));
            sb2.append(e((b2 / 10) % 10));
            sb2.append(e(b2 % 10));
            i3 -= 3;
        }
        if (i3 == 2) {
            if (cVar.a() < 7) {
                throw N5.e.a();
            }
            int b10 = cVar.b(7);
            if (b10 >= 100) {
                throw N5.e.a();
            }
            sb2.append(e(b10 / 10));
            sb2.append(e(b10 % 10));
            return;
        }
        if (i3 == 1) {
            if (cVar.a() < 4) {
                throw N5.e.a();
            }
            int b11 = cVar.b(4);
            if (b11 >= 10) {
                throw N5.e.a();
            }
            sb2.append(e(b11));
        }
    }

    public static char e(int i3) {
        char[] cArr = f15452a;
        if (i3 < cArr.length) {
            return cArr[i3];
        }
        throw N5.e.a();
    }
}
