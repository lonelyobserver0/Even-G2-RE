package com.google.protobuf;

import com.stub.StubApp;
import java.nio.ByteBuffer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H0 extends Tc.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12105c;

    public /* synthetic */ H0(int i3) {
        this.f12105c = i3;
    }

    public static int x(long j, byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            Tc.d dVar = J0.f12106a;
            if (i3 > -12) {
                return -1;
            }
            return i3;
        }
        if (i10 == 1) {
            return J0.c(i3, G0.g(j, bArr));
        }
        if (i10 == 2) {
            return J0.d(i3, G0.g(j, bArr), G0.g(j + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // Tc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(int r8, int r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.H0.g(int, int, byte[]):java.lang.String");
    }

    @Override // Tc.d
    public final String i(int i3, ByteBuffer byteBuffer, int i10) {
        long j;
        byte e10;
        byte e11;
        switch (this.f12105c) {
            case 0:
                return Tc.d.h(i3, byteBuffer, i10);
            default:
                if ((i3 | i10 | ((byteBuffer.limit() - i3) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format(StubApp.getString2(12629), Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i3), Integer.valueOf(i10)));
                }
                long j3 = G0.f12099c.j(G0.f12103g, byteBuffer) + i3;
                long j10 = i10 + j3;
                char[] cArr = new char[i10];
                int i11 = 0;
                while (true) {
                    j = 1;
                    if (j3 < j10 && (e11 = G0.f12099c.e(j3)) >= 0) {
                        j3++;
                        cArr[i11] = (char) e11;
                        i11++;
                    }
                }
                int i12 = i11;
                while (j3 < j10) {
                    long j11 = j3 + j;
                    F0 f02 = G0.f12099c;
                    byte e12 = f02.e(j3);
                    if (e12 >= 0) {
                        int i13 = i12 + 1;
                        cArr[i12] = (char) e12;
                        while (j11 < j10 && (e10 = G0.f12099c.e(j11)) >= 0) {
                            j11 += j;
                            cArr[i13] = (char) e10;
                            i13++;
                        }
                        i12 = i13;
                        j3 = j11;
                    } else {
                        if (!(e12 < -32)) {
                            if (e12 < -16) {
                                if (j11 >= j10 - j) {
                                    throw T.b();
                                }
                                long j12 = j3 + 2;
                                j3 += 3;
                                Oc.a.c(e12, f02.e(j11), f02.e(j12), cArr, i12);
                                i12++;
                            } else {
                                if (j11 >= j10 - 2) {
                                    throw T.b();
                                }
                                byte e13 = f02.e(j11);
                                long j13 = j3 + 3;
                                byte e14 = f02.e(j3 + 2);
                                j3 += 4;
                                Oc.a.a(e12, e13, e14, f02.e(j13), cArr, i12);
                                i12 += 2;
                            }
                        } else {
                            if (j11 >= j10) {
                                throw T.b();
                            }
                            j3 += 2;
                            Oc.a.b(e12, f02.e(j11), cArr, i12);
                            i12++;
                        }
                    }
                    j = 1;
                }
                return new String(cArr, 0, i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // Tc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.H0.j(java.lang.String, byte[], int, int):int");
    }

    @Override // Tc.d
    public final int p(int i3, int i10, byte[] bArr) {
        int i11;
        long j;
        int i12 = i3;
        switch (this.f12105c) {
            case 0:
                break;
            default:
                if ((i12 | i10 | (bArr.length - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format(StubApp.getString2(12630), Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i10)));
                }
                long j3 = i12;
                int i13 = (int) (i10 - j3);
                long j10 = 1;
                if (i13 < 16) {
                    i11 = 0;
                } else {
                    int i14 = 8 - (((int) j3) & 7);
                    long j11 = j3;
                    i11 = 0;
                    while (true) {
                        if (i11 < i14) {
                            long j12 = j11 + 1;
                            if (G0.g(j11, bArr) >= 0) {
                                i11++;
                                j11 = j12;
                            }
                        } else {
                            while (true) {
                                int i15 = i11 + 8;
                                if (i15 <= i13) {
                                    if ((G0.f12099c.j(G0.f12102f + j11, bArr) & (-9187201950435737472L)) == 0) {
                                        j11 += 8;
                                        i11 = i15;
                                    }
                                }
                            }
                            while (true) {
                                if (i11 < i13) {
                                    long j13 = j11 + 1;
                                    if (G0.g(j11, bArr) >= 0) {
                                        i11++;
                                        j11 = j13;
                                    }
                                } else {
                                    i11 = i13;
                                }
                            }
                        }
                    }
                }
                int i16 = i13 - i11;
                long j14 = j3 + i11;
                while (true) {
                    byte b2 = 0;
                    while (true) {
                        if (i16 > 0) {
                            long j15 = j14 + j10;
                            b2 = G0.g(j14, bArr);
                            if (b2 >= 0) {
                                i16--;
                                j14 = j15;
                            } else {
                                j14 = j15;
                            }
                        }
                    }
                    if (i16 == 0) {
                        return 0;
                    }
                    int i17 = i16 - 1;
                    if (b2 < -32) {
                        if (i17 == 0) {
                            return b2;
                        }
                        i16 -= 2;
                        if (b2 >= -62) {
                            long j16 = j14 + j10;
                            if (G0.g(j14, bArr) <= -65) {
                                j = j10;
                                j14 = j16;
                                j10 = j;
                            }
                        }
                    } else if (b2 >= -16) {
                        j = j10;
                        if (i17 < 3) {
                            return x(j14, bArr, b2, i17);
                        }
                        i16 -= 4;
                        long j17 = j14 + j;
                        byte g10 = G0.g(j14, bArr);
                        if (g10 <= -65) {
                            if ((((g10 + 112) + (b2 << 28)) >> 30) == 0) {
                                long j18 = 2 + j14;
                                if (G0.g(j17, bArr) <= -65) {
                                    j14 += 3;
                                    if (G0.g(j18, bArr) <= -65) {
                                        j10 = j;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i17 < 2) {
                            return x(j14, bArr, b2, i17);
                        }
                        i16 -= 3;
                        j = j10;
                        long j19 = j14 + j;
                        byte g11 = G0.g(j14, bArr);
                        if (g11 <= -65 && ((b2 != -32 || g11 >= -96) && (b2 != -19 || g11 < -96))) {
                            j14 += 2;
                            if (G0.g(j19, bArr) <= -65) {
                                j10 = j;
                            }
                        }
                    }
                }
                return -1;
        }
        while (i12 < i10 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 < i10) {
            while (i12 < i10) {
                int i18 = i12 + 1;
                byte b10 = bArr[i12];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i18 >= i10) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i12 += 2;
                            if (bArr[i18] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i18 >= i10 - 1) {
                            return J0.a(i18, i10, bArr);
                        }
                        int i19 = i12 + 2;
                        byte b11 = bArr[i18];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i12 += 3;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i18 >= i10 - 2) {
                        return J0.a(i18, i10, bArr);
                    }
                    int i20 = i12 + 2;
                    byte b12 = bArr[i18];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i21 = i12 + 3;
                            if (bArr[i20] <= -65) {
                                i12 += 4;
                                if (bArr[i21] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i12 = i18;
            }
        }
        return 0;
    }
}
