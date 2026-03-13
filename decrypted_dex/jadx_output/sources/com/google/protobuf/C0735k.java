package com.google.protobuf;

import com.stub.StubApp;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0735k extends AbstractC0741n {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f12161c;

    /* renamed from: d, reason: collision with root package name */
    public int f12162d;

    /* renamed from: e, reason: collision with root package name */
    public int f12163e;

    /* renamed from: f, reason: collision with root package name */
    public int f12164f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12165g;

    /* renamed from: h, reason: collision with root package name */
    public int f12166h;

    /* renamed from: i, reason: collision with root package name */
    public int f12167i = IntCompanionObject.MAX_VALUE;

    public C0735k(byte[] bArr, int i3, int i10, boolean z2) {
        this.f12161c = bArr;
        this.f12162d = i10 + i3;
        this.f12164f = i3;
        this.f12165g = i3;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int A() {
        return E();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long B() {
        return F();
    }

    public final int C() {
        int i3 = this.f12164f;
        if (this.f12162d - i3 < 4) {
            throw T.g();
        }
        this.f12164f = i3 + 4;
        byte[] bArr = this.f12161c;
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long D() {
        int i3 = this.f12164f;
        if (this.f12162d - i3 < 8) {
            throw T.g();
        }
        this.f12164f = i3 + 8;
        byte[] bArr = this.f12161c;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int E() {
        int i3;
        int i10 = this.f12164f;
        int i11 = this.f12162d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f12161c;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f12164f = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    i3 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i3 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i3 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i3 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i19;
                            }
                            i3 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f12164f = i13;
                return i3;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = this.f12164f;
        int i10 = this.f12162d;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f12161c;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f12164f = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i3 + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i3 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i3 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j11 = (-2080896) ^ i17;
                        } else {
                            long j12 = i17;
                            i12 = i3 + 5;
                            long j13 = j12 ^ (bArr[i16] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i16 = i3 + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i12 = i3 + 7;
                                    j13 = j14 ^ (bArr[i16] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i3 + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i12 = i3 + 9;
                                            long j15 = (j14 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i3 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j3 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i12 = i16;
                        j = j11;
                    }
                }
                this.f12164f = i12;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i10 = this.f12164f;
            if (i10 == this.f12162d) {
                throw T.g();
            }
            this.f12164f = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i3;
            if ((this.f12161c[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw T.d();
    }

    public final void H() {
        int i3 = this.f12162d + this.f12163e;
        this.f12162d = i3;
        int i10 = i3 - this.f12165g;
        int i11 = this.f12167i;
        if (i10 <= i11) {
            this.f12163e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f12163e = i12;
        this.f12162d = i3 - i12;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final void a(int i3) {
        if (this.f12166h != i3) {
            throw new T(StubApp.getString2(12646));
        }
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int d() {
        return this.f12164f - this.f12165g;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final boolean e() {
        return this.f12164f == this.f12162d;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final void h(int i3) {
        this.f12167i = i3;
        H();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int i(int i3) {
        if (i3 < 0) {
            throw T.e();
        }
        int d8 = d() + i3;
        if (d8 < 0) {
            throw T.f();
        }
        int i10 = this.f12167i;
        if (d8 > i10) {
            throw T.g();
        }
        this.f12167i = d8;
        H();
        return i10;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final boolean j() {
        return F() != 0;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final C0731i k() {
        byte[] bArr;
        int E10 = E();
        byte[] bArr2 = this.f12161c;
        if (E10 > 0) {
            int i3 = this.f12162d;
            int i10 = this.f12164f;
            if (E10 <= i3 - i10) {
                C0731i c10 = AbstractC0733j.c(i10, E10, bArr2);
                this.f12164f += E10;
                return c10;
            }
        }
        if (E10 == 0) {
            return AbstractC0733j.f12158b;
        }
        if (E10 > 0) {
            int i11 = this.f12162d;
            int i12 = this.f12164f;
            if (E10 <= i11 - i12) {
                int i13 = E10 + i12;
                this.f12164f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                C0731i c0731i = AbstractC0733j.f12158b;
                return new C0731i(bArr);
            }
        }
        if (E10 > 0) {
            throw T.g();
        }
        if (E10 != 0) {
            throw T.e();
        }
        bArr = Q.f12120b;
        C0731i c0731i2 = AbstractC0733j.f12158b;
        return new C0731i(bArr);
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final double l() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int m() {
        return E();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int n() {
        return C();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long o() {
        return D();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final float p() {
        return Float.intBitsToFloat(C());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int q() {
        return E();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long r() {
        return F();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int t() {
        return C();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long u() {
        return D();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int v() {
        return AbstractC0741n.b(E());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long w() {
        return AbstractC0741n.c(F());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final String x() {
        int E10 = E();
        if (E10 > 0) {
            int i3 = this.f12162d;
            int i10 = this.f12164f;
            if (E10 <= i3 - i10) {
                String str = new String(this.f12161c, i10, E10, Q.f12119a);
                this.f12164f += E10;
                return str;
            }
        }
        if (E10 == 0) {
            return "";
        }
        if (E10 < 0) {
            throw T.e();
        }
        throw T.g();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final String y() {
        int E10 = E();
        if (E10 > 0) {
            int i3 = this.f12162d;
            int i10 = this.f12164f;
            if (E10 <= i3 - i10) {
                String g10 = J0.f12106a.g(i10, E10, this.f12161c);
                this.f12164f += E10;
                return g10;
            }
        }
        if (E10 == 0) {
            return "";
        }
        if (E10 <= 0) {
            throw T.e();
        }
        throw T.g();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int z() {
        if (e()) {
            this.f12166h = 0;
            return 0;
        }
        int E10 = E();
        this.f12166h = E10;
        if ((E10 >>> 3) != 0) {
            return E10;
        }
        throw T.a();
    }
}
