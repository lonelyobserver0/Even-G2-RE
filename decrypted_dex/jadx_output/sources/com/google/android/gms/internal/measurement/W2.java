package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class W2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11401a = 0;

    static {
        if (U2.f11390e && U2.f11389d) {
            int i3 = X1.f11407a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r6, int r7, byte[] r8) {
        /*
        L0:
            if (r6 >= r7) goto L9
            r0 = r8[r6]
            if (r0 < 0) goto L9
            int r6 = r6 + 1
            goto L0
        L9:
            if (r6 < r7) goto Ld
            goto L7a
        Ld:
            if (r6 >= r7) goto L7a
            int r0 = r6 + 1
            r1 = r8[r6]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r7) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r6 = r6 + 2
            r0 = r8[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r7 + (-1)
            if (r0 < r4) goto L36
            int r1 = d(r0, r7, r8)
            goto L57
        L36:
            int r4 = r6 + 2
            r0 = r8[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r6 = r6 + 3
            r0 = r8[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r7 + (-2)
            if (r0 < r2) goto L5a
            int r1 = d(r0, r7, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r6 + 2
            r0 = r8[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r6 + 3
            r1 = r8[r2]
            if (r1 > r3) goto L76
            int r6 = r6 + 4
            r0 = r8[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r6 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.W2.a(int, int, byte[]):boolean");
    }

    public static int b(String str) {
        int length = str.length();
        int i3 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new V2(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i3;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        long j = i11 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 34);
        sb2.append(StubApp.getString2(11856));
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.W2.c(java.lang.String, byte[], int, int):int");
    }

    public static /* synthetic */ int d(int i3, int i10, byte[] bArr) {
        int i11 = i10 - i3;
        byte b2 = bArr[i3 - 1];
        if (i11 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
        }
        if (i11 == 1) {
            byte b10 = bArr[i3];
            if (b2 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b2;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i3];
        byte b12 = bArr[i3 + 1];
        if (b2 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << Tnaf.POW_2_WIDTH) ^ ((b11 << 8) ^ b2);
    }
}
