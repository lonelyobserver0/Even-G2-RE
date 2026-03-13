package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0408h extends AbstractC0410j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9785c;

    /* renamed from: d, reason: collision with root package name */
    public int f9786d;

    /* renamed from: e, reason: collision with root package name */
    public int f9787e;

    /* renamed from: f, reason: collision with root package name */
    public int f9788f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9789g;

    /* renamed from: h, reason: collision with root package name */
    public int f9790h;

    /* renamed from: i, reason: collision with root package name */
    public int f9791i = IntCompanionObject.MAX_VALUE;

    public C0408h(byte[] bArr, int i3, int i10, boolean z2) {
        this.f9785c = bArr;
        this.f9786d = i10 + i3;
        this.f9788f = i3;
        this.f9789g = i3;
    }

    public final int A() {
        int i3 = this.f9788f;
        if (this.f9786d - i3 < 4) {
            throw C0424y.e();
        }
        this.f9788f = i3 + 4;
        byte[] bArr = this.f9785c;
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long B() {
        int i3 = this.f9788f;
        if (this.f9786d - i3 < 8) {
            throw C0424y.e();
        }
        this.f9788f = i3 + 8;
        byte[] bArr = this.f9785c;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int C() {
        int i3;
        int i10 = this.f9788f;
        int i11 = this.f9786d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f9785c;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f9788f = i12;
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
                this.f9788f = i13;
                return i3;
            }
        }
        return (int) E();
    }

    public final long D() {
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = this.f9788f;
        int i10 = this.f9786d;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f9785c;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f9788f = i11;
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
                this.f9788f = i12;
                return j;
            }
        }
        return E();
    }

    public final long E() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i10 = this.f9788f;
            if (i10 == this.f9786d) {
                throw C0424y.e();
            }
            this.f9788f = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i3;
            if ((this.f9785c[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw C0424y.c();
    }

    public final void F() {
        int i3 = this.f9786d + this.f9787e;
        this.f9786d = i3;
        int i10 = i3 - this.f9789g;
        int i11 = this.f9791i;
        if (i10 <= i11) {
            this.f9787e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f9787e = i12;
        this.f9786d = i3 - i12;
    }

    public final void G(int i3) {
        if (i3 >= 0) {
            int i10 = this.f9786d;
            int i11 = this.f9788f;
            if (i3 <= i10 - i11) {
                this.f9788f = i11 + i3;
                return;
            }
        }
        if (i3 >= 0) {
            throw C0424y.e();
        }
        throw C0424y.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final void a(int i3) {
        if (this.f9790h != i3) {
            throw new C0424y("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int c() {
        return this.f9788f - this.f9789g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final boolean d() {
        return this.f9788f == this.f9786d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final void e(int i3) {
        this.f9791i = i3;
        F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int f(int i3) {
        if (i3 < 0) {
            throw C0424y.d();
        }
        int c10 = c() + i3;
        if (c10 < 0) {
            throw new C0424y("Failed to parse the message.");
        }
        int i10 = this.f9791i;
        if (c10 > i10) {
            throw C0424y.e();
        }
        this.f9791i = c10;
        F();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final boolean g() {
        return D() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final C0407g h() {
        byte[] bArr;
        int C10 = C();
        byte[] bArr2 = this.f9785c;
        if (C10 > 0) {
            int i3 = this.f9786d;
            int i10 = this.f9788f;
            if (C10 <= i3 - i10) {
                C0407g c10 = C0407g.c(i10, C10, bArr2);
                this.f9788f += C10;
                return c10;
            }
        }
        if (C10 == 0) {
            return C0407g.f9780c;
        }
        if (C10 > 0) {
            int i11 = this.f9786d;
            int i12 = this.f9788f;
            if (C10 <= i11 - i12) {
                int i13 = C10 + i12;
                this.f9788f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                C0407g c0407g = C0407g.f9780c;
                return new C0407g(bArr);
            }
        }
        if (C10 > 0) {
            throw C0424y.e();
        }
        if (C10 != 0) {
            throw C0424y.d();
        }
        bArr = AbstractC0422w.f9853b;
        C0407g c0407g2 = C0407g.f9780c;
        return new C0407g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final double i() {
        return Double.longBitsToDouble(B());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long l() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final float m() {
        return Float.intBitsToFloat(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long o() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long q() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int r() {
        int C10 = C();
        return (-(C10 & 1)) ^ (C10 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long s() {
        long D6 = D();
        return (-(D6 & 1)) ^ (D6 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final String t() {
        int C10 = C();
        if (C10 > 0) {
            int i3 = this.f9786d;
            int i10 = this.f9788f;
            if (C10 <= i3 - i10) {
                String str = new String(this.f9785c, i10, C10, AbstractC0422w.f9852a);
                this.f9788f += C10;
                return str;
            }
        }
        if (C10 == 0) {
            return "";
        }
        if (C10 < 0) {
            throw C0424y.d();
        }
        throw C0424y.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final String u() {
        int C10 = C();
        if (C10 > 0) {
            int i3 = this.f9786d;
            int i10 = this.f9788f;
            if (C10 <= i3 - i10) {
                String e10 = k0.f9816a.e(i10, C10, this.f9785c);
                this.f9788f += C10;
                return e10;
            }
        }
        if (C10 == 0) {
            return "";
        }
        if (C10 <= 0) {
            throw C0424y.d();
        }
        throw C0424y.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int v() {
        if (d()) {
            this.f9790h = 0;
            return 0;
        }
        int C10 = C();
        this.f9790h = C10;
        if ((C10 >>> 3) != 0) {
            return C10;
        }
        throw new C0424y("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long x() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final boolean y(int i3) {
        int i10 = i3 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                G(8);
                return true;
            }
            if (i10 == 2) {
                G(C());
                return true;
            }
            if (i10 == 3) {
                z();
                a(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C0424y.b();
            }
            G(4);
            return true;
        }
        int i12 = this.f9786d - this.f9788f;
        byte[] bArr = this.f9785c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f9788f;
                this.f9788f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C0424y.c();
        }
        while (i11 < 10) {
            int i14 = this.f9788f;
            if (i14 == this.f9786d) {
                throw C0424y.e();
            }
            this.f9788f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw C0424y.c();
        return true;
    }
}
