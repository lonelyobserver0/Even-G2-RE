package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0409i extends AbstractC0410j {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f9799c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9800d;

    /* renamed from: e, reason: collision with root package name */
    public int f9801e;

    /* renamed from: f, reason: collision with root package name */
    public int f9802f;

    /* renamed from: g, reason: collision with root package name */
    public int f9803g;

    /* renamed from: h, reason: collision with root package name */
    public int f9804h;

    /* renamed from: i, reason: collision with root package name */
    public int f9805i;
    public int j = IntCompanionObject.MAX_VALUE;

    public C0409i(InputStream inputStream) {
        AbstractC0422w.a(inputStream, "input");
        this.f9799c = inputStream;
        this.f9800d = new byte[4096];
        this.f9801e = 0;
        this.f9803g = 0;
        this.f9805i = 0;
    }

    public final byte[] A(int i3) {
        byte[] B7 = B(i3);
        if (B7 != null) {
            return B7;
        }
        int i10 = this.f9803g;
        int i11 = this.f9801e;
        int i12 = i11 - i10;
        this.f9805i += i11;
        this.f9803g = 0;
        this.f9801e = 0;
        ArrayList C10 = C(i3 - i12);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f9800d, i10, bArr, 0, i12);
        Iterator it = C10.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] B(int i3) {
        if (i3 == 0) {
            return AbstractC0422w.f9853b;
        }
        if (i3 < 0) {
            throw C0424y.d();
        }
        int i10 = this.f9805i;
        int i11 = this.f9803g;
        int i12 = i10 + i11 + i3;
        if (i12 - IntCompanionObject.MAX_VALUE > 0) {
            throw new C0424y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            K((i13 - i10) - i11);
            throw C0424y.e();
        }
        int i14 = this.f9801e - i11;
        int i15 = i3 - i14;
        InputStream inputStream = this.f9799c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (C0424y e10) {
                e10.f9854a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f9800d, this.f9803g, bArr, 0, i14);
        this.f9805i += this.f9801e;
        this.f9803g = 0;
        this.f9801e = 0;
        while (i14 < i3) {
            try {
                int read = inputStream.read(bArr, i14, i3 - i14);
                if (read == -1) {
                    throw C0424y.e();
                }
                this.f9805i += read;
                i14 += read;
            } catch (C0424y e11) {
                e11.f9854a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList C(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f9799c.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw C0424y.e();
                }
                this.f9805i += read;
                i10 += read;
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int D() {
        int i3 = this.f9803g;
        if (this.f9801e - i3 < 4) {
            J(4);
            i3 = this.f9803g;
        }
        this.f9803g = i3 + 4;
        byte[] bArr = this.f9800d;
        return ((bArr[i3 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 16);
    }

    public final long E() {
        int i3 = this.f9803g;
        if (this.f9801e - i3 < 8) {
            J(8);
            i3 = this.f9803g;
        }
        this.f9803g = i3 + 8;
        byte[] bArr = this.f9800d;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int F() {
        int i3;
        int i10 = this.f9803g;
        int i11 = this.f9801e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f9800d;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f9803g = i12;
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
                this.f9803g = i13;
                return i3;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = this.f9803g;
        int i10 = this.f9801e;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f9800d;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f9803g = i11;
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
                this.f9803g = i12;
                return j;
            }
        }
        return H();
    }

    public final long H() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f9803g == this.f9801e) {
                J(1);
            }
            int i10 = this.f9803g;
            this.f9803g = i10 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i3;
            if ((this.f9800d[i10] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw C0424y.c();
    }

    public final void I() {
        int i3 = this.f9801e + this.f9802f;
        this.f9801e = i3;
        int i10 = this.f9805i + i3;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f9802f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f9802f = i12;
        this.f9801e = i3 - i12;
    }

    public final void J(int i3) {
        if (L(i3)) {
            return;
        }
        if (i3 <= (IntCompanionObject.MAX_VALUE - this.f9805i) - this.f9803g) {
            throw C0424y.e();
        }
        throw new C0424y("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void K(int i3) {
        int i10 = this.f9801e;
        int i11 = this.f9803g;
        if (i3 <= i10 - i11 && i3 >= 0) {
            this.f9803g = i11 + i3;
            return;
        }
        InputStream inputStream = this.f9799c;
        if (i3 < 0) {
            throw C0424y.d();
        }
        int i12 = this.f9805i;
        int i13 = i12 + i11;
        int i14 = i13 + i3;
        int i15 = this.j;
        if (i14 > i15) {
            K((i15 - i12) - i11);
            throw C0424y.e();
        }
        this.f9805i = i13;
        int i16 = i10 - i11;
        this.f9801e = 0;
        this.f9803g = 0;
        while (i16 < i3) {
            long j = i3 - i16;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i16 += (int) skip;
                    }
                } catch (C0424y e10) {
                    e10.f9854a = true;
                    throw e10;
                }
            } catch (Throwable th) {
                this.f9805i += i16;
                I();
                throw th;
            }
        }
        this.f9805i += i16;
        I();
        if (i16 >= i3) {
            return;
        }
        int i17 = this.f9801e;
        int i18 = i17 - this.f9803g;
        this.f9803g = i17;
        J(1);
        while (true) {
            int i19 = i3 - i18;
            int i20 = this.f9801e;
            if (i19 <= i20) {
                this.f9803g = i19;
                return;
            } else {
                i18 += i20;
                this.f9803g = i20;
                J(1);
            }
        }
    }

    public final boolean L(int i3) {
        int i10 = this.f9803g;
        int i11 = i10 + i3;
        int i12 = this.f9801e;
        if (i11 <= i12) {
            throw new IllegalStateException(Xa.h.g(i3, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f9805i;
        if (i3 <= (IntCompanionObject.MAX_VALUE - i13) - i10 && i13 + i10 + i3 <= this.j) {
            byte[] bArr = this.f9800d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f9805i += i10;
                this.f9801e -= i10;
                this.f9803g = 0;
            }
            int i14 = this.f9801e;
            int min = Math.min(bArr.length - i14, (IntCompanionObject.MAX_VALUE - this.f9805i) - i14);
            InputStream inputStream = this.f9799c;
            try {
                int read = inputStream.read(bArr, i14, min);
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f9801e += read;
                    I();
                    if (this.f9801e >= i3) {
                        return true;
                    }
                    return L(i3);
                }
            } catch (C0424y e10) {
                e10.f9854a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final void a(int i3) {
        if (this.f9804h != i3) {
            throw new C0424y("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int c() {
        return this.f9805i + this.f9803g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final boolean d() {
        return this.f9803g == this.f9801e && !L(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final void e(int i3) {
        this.j = i3;
        I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int f(int i3) {
        if (i3 < 0) {
            throw C0424y.d();
        }
        int i10 = this.f9805i + this.f9803g + i3;
        if (i10 < 0) {
            throw new C0424y("Failed to parse the message.");
        }
        int i11 = this.j;
        if (i10 > i11) {
            throw C0424y.e();
        }
        this.j = i10;
        I();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final boolean g() {
        return G() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final C0407g h() {
        int F3 = F();
        int i3 = this.f9801e;
        int i10 = this.f9803g;
        int i11 = i3 - i10;
        byte[] bArr = this.f9800d;
        if (F3 <= i11 && F3 > 0) {
            C0407g c10 = C0407g.c(i10, F3, bArr);
            this.f9803g += F3;
            return c10;
        }
        if (F3 == 0) {
            return C0407g.f9780c;
        }
        if (F3 < 0) {
            throw C0424y.d();
        }
        byte[] B7 = B(F3);
        if (B7 != null) {
            return C0407g.c(0, B7.length, B7);
        }
        int i12 = this.f9803g;
        int i13 = this.f9801e;
        int i14 = i13 - i12;
        this.f9805i += i13;
        this.f9803g = 0;
        this.f9801e = 0;
        ArrayList C10 = C(F3 - i14);
        byte[] bArr2 = new byte[F3];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        Iterator it = C10.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        C0407g c0407g = C0407g.f9780c;
        return new C0407g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final double i() {
        return Double.longBitsToDouble(E());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int j() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long l() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final float m() {
        return Float.intBitsToFloat(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long o() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long q() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int r() {
        int F3 = F();
        return (-(F3 & 1)) ^ (F3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long s() {
        long G4 = G();
        return (-(G4 & 1)) ^ (G4 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final String t() {
        int F3 = F();
        byte[] bArr = this.f9800d;
        if (F3 > 0) {
            int i3 = this.f9801e;
            int i10 = this.f9803g;
            if (F3 <= i3 - i10) {
                String str = new String(bArr, i10, F3, AbstractC0422w.f9852a);
                this.f9803g += F3;
                return str;
            }
        }
        if (F3 == 0) {
            return "";
        }
        if (F3 < 0) {
            throw C0424y.d();
        }
        if (F3 > this.f9801e) {
            return new String(A(F3), AbstractC0422w.f9852a);
        }
        J(F3);
        String str2 = new String(bArr, this.f9803g, F3, AbstractC0422w.f9852a);
        this.f9803g += F3;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final String u() {
        int F3 = F();
        int i3 = this.f9803g;
        int i10 = this.f9801e;
        int i11 = i10 - i3;
        byte[] bArr = this.f9800d;
        if (F3 <= i11 && F3 > 0) {
            this.f9803g = i3 + F3;
        } else {
            if (F3 == 0) {
                return "";
            }
            if (F3 < 0) {
                throw C0424y.d();
            }
            i3 = 0;
            if (F3 <= i10) {
                J(F3);
                this.f9803g = F3;
            } else {
                bArr = A(F3);
            }
        }
        return k0.f9816a.e(i3, F3, bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int v() {
        if (d()) {
            this.f9804h = 0;
            return 0;
        }
        int F3 = F();
        this.f9804h = F3;
        if ((F3 >>> 3) != 0) {
            return F3;
        }
        throw new C0424y("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final int w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final long x() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0410j
    public final boolean y(int i3) {
        int i10 = i3 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                K(8);
                return true;
            }
            if (i10 == 2) {
                K(F());
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
            K(4);
            return true;
        }
        int i12 = this.f9801e - this.f9803g;
        byte[] bArr = this.f9800d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f9803g;
                this.f9803g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C0424y.c();
        }
        while (i11 < 10) {
            if (this.f9803g == this.f9801e) {
                J(1);
            }
            int i14 = this.f9803g;
            this.f9803g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw C0424y.c();
        return true;
    }
}
