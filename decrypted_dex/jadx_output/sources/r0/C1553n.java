package r0;

import M4.M;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* renamed from: r0.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1553n {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f20173d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f20174e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final M f20175f = M.l(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f20176a;

    /* renamed from: b, reason: collision with root package name */
    public int f20177b;

    /* renamed from: c, reason: collision with root package name */
    public int f20178c;

    public C1553n() {
        this.f20176a = AbstractC1560u.f20195f;
    }

    public final int A() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = (bArr[i3] & UByte.MAX_VALUE) << 8;
        this.f20177b = i3 + 2;
        return (bArr[i10] & UByte.MAX_VALUE) | i11;
    }

    public final long B() {
        int i3;
        int i10;
        long j = this.f20176a[this.f20177b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j) != 0) {
                i11--;
            } else if (i11 < 6) {
                j &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException(Xa.h.h(j, StubApp.getString2(22542)));
        }
        for (i3 = 1; i3 < i10; i3++) {
            if ((this.f20176a[this.f20177b + i3] & 192) != 128) {
                throw new NumberFormatException(Xa.h.h(j, StubApp.getString2(22541)));
            }
            j = (j << 6) | (r3 & 63);
        }
        this.f20177b += i10;
        return j;
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f20176a;
            int i3 = this.f20177b;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f20177b = i3 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f20176a;
        int i10 = this.f20177b;
        byte b2 = bArr2[i10];
        if (b2 == -2 && bArr2[i10 + 1] == -1) {
            this.f20177b = i10 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f20177b = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void D(int i3) {
        byte[] bArr = this.f20176a;
        if (bArr.length < i3) {
            bArr = new byte[i3];
        }
        E(i3, bArr);
    }

    public final void E(int i3, byte[] bArr) {
        this.f20176a = bArr;
        this.f20178c = i3;
        this.f20177b = 0;
    }

    public final void F(int i3) {
        AbstractC1550k.c(i3 >= 0 && i3 <= this.f20176a.length);
        this.f20178c = i3;
    }

    public final void G(int i3) {
        AbstractC1550k.c(i3 >= 0 && i3 <= this.f20178c);
        this.f20177b = i3;
    }

    public final void H(int i3) {
        G(this.f20177b + i3);
    }

    public final int a() {
        return this.f20178c - this.f20177b;
    }

    public final void b(int i3) {
        byte[] bArr = this.f20176a;
        if (i3 > bArr.length) {
            this.f20176a = Arrays.copyOf(bArr, i3);
        }
    }

    public final char c(Charset charset) {
        AbstractC1550k.b(StubApp.getString2(22543) + charset, f20175f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b2;
        int i3;
        byte b10;
        byte b11;
        boolean equals = charset.equals(StandardCharsets.UTF_8);
        String string2 = StubApp.getString2(22544);
        if ((equals || charset.equals(StandardCharsets.US_ASCII)) && a() >= 1) {
            long j = this.f20176a[this.f20177b] & UByte.MAX_VALUE;
            char c10 = (char) j;
            hc.b.g(j, string2, ((long) c10) == j);
            b2 = (byte) c10;
            i3 = 1;
        } else {
            i3 = 2;
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && a() >= 2) {
                byte[] bArr = this.f20176a;
                int i10 = this.f20177b;
                b10 = bArr[i10];
                b11 = bArr[i10 + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f20176a;
                int i11 = this.f20177b;
                b10 = bArr2[i11 + 1];
                b11 = bArr2[i11];
            }
            b2 = (byte) ((char) ((b11 & UByte.MAX_VALUE) | (b10 << 8)));
        }
        long j3 = b2;
        char c11 = (char) j3;
        hc.b.g(j3, string2, ((long) c11) == j3);
        return (c11 << 16) + i3;
    }

    public final int e() {
        return this.f20176a[this.f20177b] & UByte.MAX_VALUE;
    }

    public final void f(int i3, int i10, byte[] bArr) {
        System.arraycopy(this.f20176a, this.f20177b, bArr, i3, i10);
        this.f20177b += i10;
    }

    public final char g(Charset charset, char[] cArr) {
        int d8 = d(charset);
        if (d8 != 0) {
            char c10 = (char) (d8 >> 16);
            for (char c11 : cArr) {
                if (c11 == c10) {
                    this.f20177b += d8 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = (bArr[i3] & UByte.MAX_VALUE) << 24;
        int i12 = i3 + 2;
        this.f20177b = i12;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 16) | i11;
        int i14 = i3 + 3;
        this.f20177b = i14;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 8);
        this.f20177b = i3 + 4;
        return (bArr[i14] & UByte.MAX_VALUE) | i15;
    }

    public final String i(Charset charset) {
        int i3;
        boolean contains = f20175f.contains(charset);
        String string2 = StubApp.getString2(22543);
        AbstractC1550k.b(string2 + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            C();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i3 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException(string2 + charset);
            }
            i3 = 2;
        }
        int i10 = this.f20177b;
        while (true) {
            int i11 = this.f20178c;
            if (i10 >= i11 - (i3 - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && AbstractC1560u.H(this.f20176a[i10])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f20176a;
                if (bArr[i10] == 0 && AbstractC1560u.H(bArr[i10 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f20176a;
                if (bArr2[i10 + 1] == 0 && AbstractC1560u.H(bArr2[i10])) {
                    break;
                }
            }
            i10 += i3;
        }
        String s10 = s(i10 - this.f20177b, charset);
        if (this.f20177b != this.f20178c && g(charset, f20173d) == '\r') {
            g(charset, f20174e);
        }
        return s10;
    }

    public final int j() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = bArr[i3] & UByte.MAX_VALUE;
        int i12 = i3 + 2;
        this.f20177b = i12;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 8) | i11;
        int i14 = i3 + 3;
        this.f20177b = i14;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 16);
        this.f20177b = i3 + 4;
        return ((bArr[i14] & UByte.MAX_VALUE) << 24) | i15;
    }

    public final long k() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        this.f20177b = i3 + 1;
        this.f20177b = i3 + 2;
        this.f20177b = i3 + 3;
        long j = (bArr[i3] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f20177b = i3 + 4;
        long j3 = j | ((bArr[r8] & 255) << 24);
        this.f20177b = i3 + 5;
        long j10 = j3 | ((bArr[r7] & 255) << 32);
        this.f20177b = i3 + 6;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.f20177b = i3 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 48);
        this.f20177b = i3 + 8;
        return ((bArr[r8] & 255) << 56) | j12;
    }

    public final long l() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        this.f20177b = i3 + 1;
        this.f20177b = i3 + 2;
        this.f20177b = i3 + 3;
        long j = (bArr[i3] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f20177b = i3 + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public final int m() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException(i2.u.p(j, StubApp.getString2(22545)));
    }

    public final int n() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = bArr[i3] & UByte.MAX_VALUE;
        this.f20177b = i3 + 2;
        return ((bArr[i10] & UByte.MAX_VALUE) << 8) | i11;
    }

    public final long o() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        this.f20177b = i3 + 1;
        this.f20177b = i3 + 2;
        this.f20177b = i3 + 3;
        long j = ((bArr[i3] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f20177b = i3 + 4;
        long j3 = j | ((bArr[r4] & 255) << 32);
        this.f20177b = i3 + 5;
        long j10 = j3 | ((bArr[r7] & 255) << 24);
        this.f20177b = i3 + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.f20177b = i3 + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.f20177b = i3 + 8;
        return (bArr[r4] & 255) | j12;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i3 = this.f20177b;
        while (i3 < this.f20178c && this.f20176a[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.f20176a;
        int i10 = this.f20177b;
        int i11 = AbstractC1560u.f20190a;
        String str = new String(bArr, i10, i3 - i10, StandardCharsets.UTF_8);
        this.f20177b = i3;
        if (i3 < this.f20178c) {
            this.f20177b = i3 + 1;
        }
        return str;
    }

    public final String q(int i3) {
        if (i3 == 0) {
            return "";
        }
        int i10 = this.f20177b;
        int i11 = (i10 + i3) - 1;
        int i12 = (i11 >= this.f20178c || this.f20176a[i11] != 0) ? i3 : i3 - 1;
        byte[] bArr = this.f20176a;
        int i13 = AbstractC1560u.f20190a;
        String str = new String(bArr, i10, i12, StandardCharsets.UTF_8);
        this.f20177b += i3;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = (bArr[i3] & UByte.MAX_VALUE) << 8;
        this.f20177b = i3 + 2;
        return (short) ((bArr[i10] & UByte.MAX_VALUE) | i11);
    }

    public final String s(int i3, Charset charset) {
        String str = new String(this.f20176a, this.f20177b, i3, charset);
        this.f20177b += i3;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        this.f20177b = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    public final int v() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = (bArr[i3] & UByte.MAX_VALUE) << 8;
        this.f20177b = i3 + 2;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) | i11;
        this.f20177b = i3 + 4;
        return i12;
    }

    public final long w() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        this.f20177b = i3 + 1;
        this.f20177b = i3 + 2;
        this.f20177b = i3 + 3;
        long j = ((bArr[i3] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f20177b = i3 + 4;
        return (bArr[r4] & 255) | j;
    }

    public final int x() {
        byte[] bArr = this.f20176a;
        int i3 = this.f20177b;
        int i10 = i3 + 1;
        this.f20177b = i10;
        int i11 = (bArr[i3] & UByte.MAX_VALUE) << 16;
        int i12 = i3 + 2;
        this.f20177b = i12;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 8) | i11;
        this.f20177b = i3 + 3;
        return (bArr[i12] & UByte.MAX_VALUE) | i13;
    }

    public final int y() {
        int h2 = h();
        if (h2 >= 0) {
            return h2;
        }
        throw new IllegalStateException(i2.u.p(h2, StubApp.getString2(22545)));
    }

    public final long z() {
        long o5 = o();
        if (o5 >= 0) {
            return o5;
        }
        throw new IllegalStateException(Xa.h.h(o5, StubApp.getString2(22545)));
    }

    public C1553n(int i3) {
        this.f20176a = new byte[i3];
        this.f20178c = i3;
    }

    public C1553n(byte[] bArr) {
        this.f20176a = bArr;
        this.f20178c = bArr.length;
    }

    public C1553n(byte[] bArr, int i3) {
        this.f20176a = bArr;
        this.f20178c = i3;
    }
}
