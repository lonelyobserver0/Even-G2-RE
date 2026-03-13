package com.google.protobuf;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Tc.d f12106a;

    static {
        f12106a = (G0.f12101e && G0.f12100d && !AbstractC0723e.a()) ? new H0(1) : new H0(0);
    }

    public static int a(int i3, int i10, byte[] bArr) {
        byte b2 = bArr[i3 - 1];
        int i11 = i10 - i3;
        if (i11 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i11 == 1) {
            return c(b2, bArr[i3]);
        }
        if (i11 == 2) {
            return d(b2, bArr[i3], bArr[i3 + 1]);
        }
        throw new AssertionError();
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new I0(i10, length2);
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
        throw new IllegalArgumentException(StubApp.getString2(11856) + (i11 + 4294967296L));
    }

    public static int c(int i3, int i10) {
        if (i3 > -12 || i10 > -65) {
            return -1;
        }
        return i3 ^ (i10 << 8);
    }

    public static int d(int i3, int i10, int i11) {
        if (i3 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i3 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
