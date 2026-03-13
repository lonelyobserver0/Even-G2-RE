package com.google.protobuf;

import com.stub.StubApp;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0737l extends AbstractC0741n {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f12169c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12170d;

    /* renamed from: e, reason: collision with root package name */
    public int f12171e;

    /* renamed from: f, reason: collision with root package name */
    public int f12172f;

    /* renamed from: g, reason: collision with root package name */
    public int f12173g;

    /* renamed from: h, reason: collision with root package name */
    public int f12174h;

    /* renamed from: i, reason: collision with root package name */
    public int f12175i;
    public int j = IntCompanionObject.MAX_VALUE;

    public C0737l(InputStream inputStream) {
        Q.a(inputStream, StubApp.getString2(294));
        this.f12169c = inputStream;
        this.f12170d = new byte[4096];
        this.f12171e = 0;
        this.f12173g = 0;
        this.f12175i = 0;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int A() {
        return H();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long B() {
        return I();
    }

    public final byte[] C(int i3) {
        byte[] D6 = D(i3);
        if (D6 != null) {
            return D6;
        }
        int i10 = this.f12173g;
        int i11 = this.f12171e;
        int i12 = i11 - i10;
        this.f12175i += i11;
        this.f12173g = 0;
        this.f12171e = 0;
        ArrayList E10 = E(i3 - i12);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f12170d, i10, bArr, 0, i12);
        Iterator it = E10.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] D(int i3) {
        if (i3 == 0) {
            return Q.f12120b;
        }
        if (i3 < 0) {
            throw T.e();
        }
        int i10 = this.f12175i;
        int i11 = this.f12173g;
        int i12 = i10 + i11 + i3;
        if (i12 - IntCompanionObject.MAX_VALUE > 0) {
            throw new T(StubApp.getString2(12647));
        }
        int i13 = this.j;
        if (i12 > i13) {
            M((i13 - i10) - i11);
            throw T.g();
        }
        int i14 = this.f12171e - i11;
        int i15 = i3 - i14;
        InputStream inputStream = this.f12169c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (T e10) {
                e10.f12121a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f12170d, this.f12173g, bArr, 0, i14);
        this.f12175i += this.f12171e;
        this.f12173g = 0;
        this.f12171e = 0;
        while (i14 < i3) {
            try {
                int read = inputStream.read(bArr, i14, i3 - i14);
                if (read == -1) {
                    throw T.g();
                }
                this.f12175i += read;
                i14 += read;
            } catch (T e11) {
                e11.f12121a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList E(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f12169c.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw T.g();
                }
                this.f12175i += read;
                i10 += read;
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int F() {
        int i3 = this.f12173g;
        if (this.f12171e - i3 < 4) {
            L(4);
            i3 = this.f12173g;
        }
        this.f12173g = i3 + 4;
        byte[] bArr = this.f12170d;
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long G() {
        int i3 = this.f12173g;
        if (this.f12171e - i3 < 8) {
            L(8);
            i3 = this.f12173g;
        }
        this.f12173g = i3 + 8;
        byte[] bArr = this.f12170d;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int H() {
        int i3;
        int i10 = this.f12173g;
        int i11 = this.f12171e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f12170d;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f12173g = i12;
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
                this.f12173g = i13;
                return i3;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = this.f12173g;
        int i10 = this.f12171e;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f12170d;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f12173g = i11;
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
                this.f12173g = i12;
                return j;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f12173g == this.f12171e) {
                L(1);
            }
            int i10 = this.f12173g;
            this.f12173g = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i3;
            if ((this.f12170d[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw T.d();
    }

    public final void K() {
        int i3 = this.f12171e + this.f12172f;
        this.f12171e = i3;
        int i10 = this.f12175i + i3;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f12172f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f12172f = i12;
        this.f12171e = i3 - i12;
    }

    public final void L(int i3) {
        if (N(i3)) {
            return;
        }
        if (i3 <= (IntCompanionObject.MAX_VALUE - this.f12175i) - this.f12173g) {
            throw T.g();
        }
        throw new T(StubApp.getString2(12647));
    }

    public final void M(int i3) {
        int i10 = this.f12171e;
        int i11 = this.f12173g;
        if (i3 <= i10 - i11 && i3 >= 0) {
            this.f12173g = i11 + i3;
            return;
        }
        InputStream inputStream = this.f12169c;
        if (i3 < 0) {
            throw T.e();
        }
        int i12 = this.f12175i;
        int i13 = i12 + i11;
        int i14 = i13 + i3;
        int i15 = this.j;
        if (i14 > i15) {
            M((i15 - i12) - i11);
            throw T.g();
        }
        this.f12175i = i13;
        int i16 = i10 - i11;
        this.f12171e = 0;
        this.f12173g = 0;
        while (i16 < i3) {
            long j = i3 - i16;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + StubApp.getString2("12648") + skip + StubApp.getString2("12649"));
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i16 += (int) skip;
                    }
                } catch (T e10) {
                    e10.f12121a = true;
                    throw e10;
                }
            } catch (Throwable th) {
                this.f12175i += i16;
                K();
                throw th;
            }
        }
        this.f12175i += i16;
        K();
        if (i16 >= i3) {
            return;
        }
        int i17 = this.f12171e;
        int i18 = i17 - this.f12173g;
        this.f12173g = i17;
        L(1);
        while (true) {
            int i19 = i3 - i18;
            int i20 = this.f12171e;
            if (i19 <= i20) {
                this.f12173g = i19;
                return;
            } else {
                i18 += i20;
                this.f12173g = i20;
                L(1);
            }
        }
    }

    public final boolean N(int i3) {
        int i10 = this.f12173g;
        int i11 = i10 + i3;
        int i12 = this.f12171e;
        if (i11 <= i12) {
            throw new IllegalStateException(Xa.h.g(i3, StubApp.getString2(12651), StubApp.getString2(12652)));
        }
        int i13 = this.f12175i;
        if (i3 <= (IntCompanionObject.MAX_VALUE - i13) - i10 && i13 + i10 + i3 <= this.j) {
            byte[] bArr = this.f12170d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f12175i += i10;
                this.f12171e -= i10;
                this.f12173g = 0;
            }
            int i14 = this.f12171e;
            int min = Math.min(bArr.length - i14, (IntCompanionObject.MAX_VALUE - this.f12175i) - i14);
            InputStream inputStream = this.f12169c;
            try {
                int read = inputStream.read(bArr, i14, min);
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + StubApp.getString2(12650) + read + StubApp.getString2(12649));
                }
                if (read > 0) {
                    this.f12171e += read;
                    K();
                    if (this.f12171e >= i3) {
                        return true;
                    }
                    return N(i3);
                }
            } catch (T e10) {
                e10.f12121a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final void a(int i3) {
        if (this.f12174h != i3) {
            throw new T(StubApp.getString2(12646));
        }
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int d() {
        return this.f12175i + this.f12173g;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final boolean e() {
        return this.f12173g == this.f12171e && !N(1);
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final void h(int i3) {
        this.j = i3;
        K();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int i(int i3) {
        if (i3 < 0) {
            throw T.e();
        }
        int i10 = this.f12175i + this.f12173g + i3;
        int i11 = this.j;
        if (i10 > i11) {
            throw T.g();
        }
        this.j = i10;
        K();
        return i11;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final boolean j() {
        return I() != 0;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final C0731i k() {
        int H2 = H();
        int i3 = this.f12171e;
        int i10 = this.f12173g;
        int i11 = i3 - i10;
        byte[] bArr = this.f12170d;
        if (H2 <= i11 && H2 > 0) {
            C0731i c10 = AbstractC0733j.c(i10, H2, bArr);
            this.f12173g += H2;
            return c10;
        }
        if (H2 == 0) {
            return AbstractC0733j.f12158b;
        }
        byte[] D6 = D(H2);
        if (D6 != null) {
            return AbstractC0733j.c(0, D6.length, D6);
        }
        int i12 = this.f12173g;
        int i13 = this.f12171e;
        int i14 = i13 - i12;
        this.f12175i += i13;
        this.f12173g = 0;
        this.f12171e = 0;
        ArrayList E10 = E(H2 - i14);
        byte[] bArr2 = new byte[H2];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        Iterator it = E10.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        C0731i c0731i = AbstractC0733j.f12158b;
        return new C0731i(bArr2);
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final double l() {
        return Double.longBitsToDouble(G());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int m() {
        return H();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int n() {
        return F();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long o() {
        return G();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final float p() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int q() {
        return H();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long r() {
        return I();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int t() {
        return F();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long u() {
        return G();
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int v() {
        return AbstractC0741n.b(H());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final long w() {
        return AbstractC0741n.c(I());
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final String x() {
        int H2 = H();
        byte[] bArr = this.f12170d;
        if (H2 > 0) {
            int i3 = this.f12171e;
            int i10 = this.f12173g;
            if (H2 <= i3 - i10) {
                String str = new String(bArr, i10, H2, Q.f12119a);
                this.f12173g += H2;
                return str;
            }
        }
        if (H2 == 0) {
            return "";
        }
        if (H2 > this.f12171e) {
            return new String(C(H2), Q.f12119a);
        }
        L(H2);
        String str2 = new String(bArr, this.f12173g, H2, Q.f12119a);
        this.f12173g += H2;
        return str2;
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final String y() {
        int H2 = H();
        int i3 = this.f12173g;
        int i10 = this.f12171e;
        int i11 = i10 - i3;
        byte[] bArr = this.f12170d;
        if (H2 <= i11 && H2 > 0) {
            this.f12173g = i3 + H2;
        } else {
            if (H2 == 0) {
                return "";
            }
            i3 = 0;
            if (H2 <= i10) {
                L(H2);
                this.f12173g = H2;
            } else {
                bArr = C(H2);
            }
        }
        return J0.f12106a.g(i3, H2, bArr);
    }

    @Override // com.google.protobuf.AbstractC0741n
    public final int z() {
        if (e()) {
            this.f12174h = 0;
            return 0;
        }
        int H2 = H();
        this.f12174h = H2;
        if ((H2 >>> 3) != 0) {
            return H2;
        }
        throw T.a();
    }
}
