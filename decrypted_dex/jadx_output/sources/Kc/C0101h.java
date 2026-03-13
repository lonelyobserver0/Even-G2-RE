package Kc;

import com.stub.StubApp;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: Kc.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0101h implements InterfaceC0103j, InterfaceC0102i, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public C f3818a;

    /* renamed from: b, reason: collision with root package name */
    public long f3819b;

    public final byte[] A(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25356)).toString());
        }
        if (this.f3819b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        C(bArr);
        return bArr;
    }

    public final void C(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i3 = 0;
        while (i3 < sink.length) {
            int read = read(sink, i3, sink.length - i3);
            if (read == -1) {
                throw new EOFException();
            }
            i3 += read;
        }
    }

    @Override // Kc.InterfaceC0103j
    public final void D(long j) {
        if (this.f3819b < j) {
            throw new EOFException();
        }
    }

    @Override // Kc.F
    public final void E(long j, C0101h source) {
        C c10;
        C b2;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException(StubApp.getString2(25359));
        }
        AbstractC0095b.f(source.f3819b, 0L, j);
        while (j > 0) {
            C c11 = source.f3818a;
            Intrinsics.checkNotNull(c11);
            int i3 = c11.f3778c;
            C c12 = source.f3818a;
            Intrinsics.checkNotNull(c12);
            long j3 = i3 - c12.f3777b;
            int i10 = 0;
            if (j < j3) {
                C c13 = this.f3818a;
                if (c13 != null) {
                    Intrinsics.checkNotNull(c13);
                    c10 = c13.f3782g;
                } else {
                    c10 = null;
                }
                if (c10 != null && c10.f3780e) {
                    if ((c10.f3778c + j) - (c10.f3779d ? 0 : c10.f3777b) <= 8192) {
                        C c14 = source.f3818a;
                        Intrinsics.checkNotNull(c14);
                        c14.d(c10, (int) j);
                        source.f3819b -= j;
                        this.f3819b += j;
                        return;
                    }
                }
                C c15 = source.f3818a;
                Intrinsics.checkNotNull(c15);
                int i11 = (int) j;
                if (i11 <= 0) {
                    c15.getClass();
                } else if (i11 <= c15.f3778c - c15.f3777b) {
                    if (i11 >= 1024) {
                        b2 = c15.c();
                    } else {
                        b2 = D.b();
                        int i12 = c15.f3777b;
                        ArraysKt___ArraysJvmKt.copyInto$default(c15.f3776a, b2.f3776a, 0, i12, i12 + i11, 2, (Object) null);
                    }
                    b2.f3778c = b2.f3777b + i11;
                    c15.f3777b += i11;
                    C c16 = c15.f3782g;
                    Intrinsics.checkNotNull(c16);
                    c16.b(b2);
                    source.f3818a = b2;
                }
                throw new IllegalArgumentException(StubApp.getString2(25357));
            }
            C c17 = source.f3818a;
            Intrinsics.checkNotNull(c17);
            long j10 = c17.f3778c - c17.f3777b;
            source.f3818a = c17.a();
            C c18 = this.f3818a;
            if (c18 == null) {
                this.f3818a = c17;
                c17.f3782g = c17;
                c17.f3781f = c17;
            } else {
                Intrinsics.checkNotNull(c18);
                C c19 = c18.f3782g;
                Intrinsics.checkNotNull(c19);
                c19.b(c17);
                C c20 = c17.f3782g;
                if (c20 == c17) {
                    throw new IllegalStateException(StubApp.getString2(25358));
                }
                Intrinsics.checkNotNull(c20);
                if (c20.f3780e) {
                    int i13 = c17.f3778c - c17.f3777b;
                    C c21 = c17.f3782g;
                    Intrinsics.checkNotNull(c21);
                    int i14 = 8192 - c21.f3778c;
                    C c22 = c17.f3782g;
                    Intrinsics.checkNotNull(c22);
                    if (!c22.f3779d) {
                        C c23 = c17.f3782g;
                        Intrinsics.checkNotNull(c23);
                        i10 = c23.f3777b;
                    }
                    if (i13 <= i14 + i10) {
                        C c24 = c17.f3782g;
                        Intrinsics.checkNotNull(c24);
                        c17.d(c24, i13);
                        c17.a();
                        D.a(c17);
                    }
                }
            }
            source.f3819b -= j10;
            this.f3819b += j10;
            j -= j10;
        }
    }

    public final int F() {
        return AbstractC0095b.h(readInt());
    }

    public final long G() {
        if (this.f3819b < 8) {
            throw new EOFException();
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        int i3 = c10.f3777b;
        int i10 = c10.f3778c;
        if (i10 - i3 < 8) {
            return ((readInt() & BodyPartID.bodyIdMax) << 32) | (BodyPartID.bodyIdMax & readInt());
        }
        byte[] bArr = c10.f3776a;
        int i11 = i3 + 7;
        long j = ((bArr[i3 + 3] & 255) << 32) | ((bArr[i3] & 255) << 56) | ((bArr[i3 + 1] & 255) << 48) | ((bArr[i3 + 2] & 255) << 40) | ((bArr[i3 + 4] & 255) << 24) | ((bArr[i3 + 5] & 255) << 16) | ((bArr[i3 + 6] & 255) << 8);
        int i12 = i3 + 8;
        long j3 = j | (bArr[i11] & 255);
        this.f3819b -= 8;
        if (i12 != i10) {
            c10.f3777b = i12;
            return j3;
        }
        this.f3818a = c10.a();
        D.a(c10);
        return j3;
    }

    public final long H() {
        return AbstractC0095b.i(G());
    }

    public final short I() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String J(long j, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25356)).toString());
        }
        if (this.f3819b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        int i3 = c10.f3777b;
        if (i3 + j > c10.f3778c) {
            return new String(A(j), charset);
        }
        int i10 = (int) j;
        String str = new String(c10.f3776a, i3, i10, charset);
        int i11 = c10.f3777b + i10;
        c10.f3777b = i11;
        this.f3819b -= j;
        if (i11 == c10.f3778c) {
            this.f3818a = c10.a();
            D.a(c10);
        }
        return str;
    }

    public final String K() {
        return J(this.f3819b, Charsets.UTF_8);
    }

    public final C0104k L(int i3) {
        if (i3 == 0) {
            return C0104k.f3820d;
        }
        AbstractC0095b.f(this.f3819b, 0L, i3);
        C c10 = this.f3818a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i3) {
            Intrinsics.checkNotNull(c10);
            int i13 = c10.f3778c;
            int i14 = c10.f3777b;
            if (i13 == i14) {
                throw new AssertionError(StubApp.getString2(25360));
            }
            i11 += i13 - i14;
            i12++;
            c10 = c10.f3781f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        C c11 = this.f3818a;
        int i15 = 0;
        while (i10 < i3) {
            Intrinsics.checkNotNull(c11);
            bArr[i15] = c11.f3776a;
            i10 += c11.f3778c - c11.f3777b;
            iArr[i15] = Math.min(i10, i3);
            iArr[i15 + i12] = c11.f3777b;
            c11.f3779d = true;
            i15++;
            c11 = c11.f3781f;
        }
        return new E(bArr, iArr);
    }

    public final C M(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException(StubApp.getString2(25361));
        }
        C c10 = this.f3818a;
        if (c10 == null) {
            C b2 = D.b();
            this.f3818a = b2;
            b2.f3782g = b2;
            b2.f3781f = b2;
            return b2;
        }
        Intrinsics.checkNotNull(c10);
        C c11 = c10.f3782g;
        Intrinsics.checkNotNull(c11);
        if (c11.f3778c + i3 <= 8192 && c11.f3780e) {
            return c11;
        }
        C b10 = D.b();
        c11.b(b10);
        return b10;
    }

    public final void N(C0104k byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.t(this, byteString.e());
    }

    public final void O(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        P(source, 0, source.length);
    }

    public final void P(byte[] source, int i3, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i10;
        AbstractC0095b.f(source.length, i3, j);
        int i11 = i10 + i3;
        while (i3 < i11) {
            C M5 = M(1);
            int min = Math.min(i11 - i3, 8192 - M5.f3778c);
            int i12 = i3 + min;
            ArraysKt.copyInto(source, M5.f3776a, M5.f3778c, i3, i12);
            M5.f3778c += min;
            i3 = i12;
        }
        this.f3819b += j;
    }

    public final void Q(int i3) {
        C M5 = M(1);
        int i10 = M5.f3778c;
        M5.f3778c = i10 + 1;
        M5.f3776a[i10] = (byte) i3;
        this.f3819b++;
    }

    public final void R(long j) {
        if (j == 0) {
            Q(48);
            return;
        }
        long j3 = (j >>> 1) | j;
        long j10 = j3 | (j3 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i3 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        C M5 = M(i3);
        int i10 = M5.f3778c;
        for (int i11 = (i10 + i3) - 1; i11 >= i10; i11--) {
            M5.f3776a[i11] = Lc.a.f4397a[(int) (15 & j)];
            j >>>= 4;
        }
        M5.f3778c += i3;
        this.f3819b += i3;
    }

    public final void S(int i3) {
        C M5 = M(4);
        int i10 = M5.f3778c;
        byte[] bArr = M5.f3776a;
        bArr[i10] = (byte) ((i3 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i3 & 255);
        M5.f3778c = i10 + 4;
        this.f3819b += 4;
    }

    public final void T(long j) {
        C M5 = M(8);
        int i3 = M5.f3778c;
        byte[] bArr = M5.f3776a;
        bArr[i3] = (byte) ((j >>> 56) & 255);
        bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i3 + 7] = (byte) (j & 255);
        M5.f3778c = i3 + 8;
        this.f3819b += 8;
    }

    public final void U(int i3) {
        C M5 = M(2);
        int i10 = M5.f3778c;
        byte[] bArr = M5.f3776a;
        bArr[i10] = (byte) ((i3 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i3 & 255);
        M5.f3778c = i10 + 2;
        this.f3819b += 2;
    }

    public final void V(int i3, int i10, String string) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i3 < 0) {
            throw new IllegalArgumentException(i2.u.p(i3, StubApp.getString2(25362)).toString());
        }
        if (i10 < i3) {
            throw new IllegalArgumentException(Xa.h.o(StubApp.getString2(25346), i10, i3, StubApp.getString2(2975)).toString());
        }
        if (i10 > string.length()) {
            StringBuilder u2 = Xa.h.u(i10, StubApp.getString2(25345), StubApp.getString2(21089));
            u2.append(string.length());
            throw new IllegalArgumentException(u2.toString().toString());
        }
        while (i3 < i10) {
            char charAt2 = string.charAt(i3);
            if (charAt2 < 128) {
                C M5 = M(1);
                int i11 = M5.f3778c - i3;
                int min = Math.min(i10, 8192 - i11);
                int i12 = i3 + 1;
                byte[] bArr = M5.f3776a;
                bArr[i3 + i11] = (byte) charAt2;
                while (true) {
                    i3 = i12;
                    if (i3 >= min || (charAt = string.charAt(i3)) >= 128) {
                        break;
                    }
                    i12 = i3 + 1;
                    bArr[i3 + i11] = (byte) charAt;
                }
                int i13 = M5.f3778c;
                int i14 = (i11 + i3) - i13;
                M5.f3778c = i13 + i14;
                this.f3819b += i14;
            } else {
                if (charAt2 < 2048) {
                    C M10 = M(2);
                    int i15 = M10.f3778c;
                    byte[] bArr2 = M10.f3776a;
                    bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                    M10.f3778c = i15 + 2;
                    this.f3819b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    C M11 = M(3);
                    int i16 = M11.f3778c;
                    byte b2 = (byte) ((charAt2 >> '\f') | BERTags.FLAGS);
                    byte[] bArr3 = M11.f3776a;
                    bArr3[i16] = b2;
                    bArr3[i16 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                    M11.f3778c = i16 + 3;
                    this.f3819b += 3;
                } else {
                    int i17 = i3 + 1;
                    char charAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        Q(63);
                        i3 = i17;
                    } else {
                        int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + PKIFailureInfo.notAuthorized;
                        C M12 = M(4);
                        int i19 = M12.f3778c;
                        byte[] bArr4 = M12.f3776a;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        M12.f3778c = i19 + 4;
                        this.f3819b += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    public final void W(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        V(0, string.length(), string);
    }

    public final void X(int i3) {
        String string2;
        int i10 = 0;
        if (i3 < 128) {
            Q(i3);
            return;
        }
        if (i3 < 2048) {
            C M5 = M(2);
            int i11 = M5.f3778c;
            byte[] bArr = M5.f3776a;
            bArr[i11] = (byte) ((i3 >> 6) | 192);
            bArr[1 + i11] = (byte) ((i3 & 63) | 128);
            M5.f3778c = i11 + 2;
            this.f3819b += 2;
            return;
        }
        if (55296 <= i3 && i3 < 57344) {
            Q(63);
            return;
        }
        if (i3 < 65536) {
            C M10 = M(3);
            int i12 = M10.f3778c;
            byte b2 = (byte) ((i3 >> 12) | BERTags.FLAGS);
            byte[] bArr2 = M10.f3776a;
            bArr2[i12] = b2;
            bArr2[1 + i12] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[2 + i12] = (byte) ((i3 & 63) | 128);
            M10.f3778c = i12 + 3;
            this.f3819b += 3;
            return;
        }
        if (i3 <= 1114111) {
            C M11 = M(4);
            int i13 = M11.f3778c;
            byte[] bArr3 = M11.f3776a;
            bArr3[i13] = (byte) ((i3 >> 18) | 240);
            bArr3[1 + i13] = (byte) (((i3 >> 12) & 63) | 128);
            bArr3[2 + i13] = (byte) (((i3 >> 6) & 63) | 128);
            bArr3[3 + i13] = (byte) ((i3 & 63) | 128);
            M11.f3778c = i13 + 4;
            this.f3819b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(25363));
        if (i3 != 0) {
            char[] cArr = Lc.b.f4398a;
            char[] cArr2 = {cArr[(i3 >> 28) & 15], cArr[(i3 >> 24) & 15], cArr[(i3 >> 20) & 15], cArr[(i3 >> 16) & 15], cArr[(i3 >> 12) & 15], cArr[(i3 >> 8) & 15], cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
            while (i10 < 8 && cArr2[i10] == '0') {
                i10++;
            }
            string2 = StringsKt__StringsJVMKt.concatToString(cArr2, i10, 8);
        } else {
            string2 = StubApp.getString2(824);
        }
        sb2.append(string2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final long a() {
        long j = this.f3819b;
        if (j == 0) {
            return 0L;
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        C c11 = c10.f3782g;
        Intrinsics.checkNotNull(c11);
        return (c11.f3778c >= 8192 || !c11.f3780e) ? j : j - (r3 - c11.f3777b);
    }

    @Override // Kc.H
    public final J b() {
        return J.f3789d;
    }

    public final Object clone() {
        return d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, Kc.F
    public final void close() {
    }

    public final C0101h d() {
        C0101h c0101h = new C0101h();
        if (this.f3819b == 0) {
            return c0101h;
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        C c11 = c10.c();
        c0101h.f3818a = c11;
        c11.f3782g = c11;
        c11.f3781f = c11;
        for (C c12 = c10.f3781f; c12 != c10; c12 = c12.f3781f) {
            C c13 = c11.f3782g;
            Intrinsics.checkNotNull(c13);
            Intrinsics.checkNotNull(c12);
            c13.b(c12.c());
        }
        c0101h.f3819b = this.f3819b;
        return c0101h;
    }

    public final boolean e() {
        return this.f3819b == 0;
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z10 = false;
        if (!(obj instanceof C0101h)) {
            return false;
        }
        long j = this.f3819b;
        C0101h c0101h = (C0101h) obj;
        if (j != c0101h.f3819b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        C c11 = c0101h.f3818a;
        Intrinsics.checkNotNull(c11);
        int i3 = c10.f3777b;
        int i10 = c11.f3777b;
        long j3 = 0;
        while (j3 < this.f3819b) {
            long min = Math.min(c10.f3778c - i3, c11.f3778c - i10);
            long j10 = 0;
            while (j10 < min) {
                int i11 = i3 + 1;
                boolean z11 = z2;
                byte b2 = c10.f3776a[i3];
                int i12 = i10 + 1;
                boolean z12 = z10;
                if (b2 != c11.f3776a[i10]) {
                    return z12;
                }
                j10++;
                i10 = i12;
                i3 = i11;
                z2 = z11;
                z10 = z12;
            }
            boolean z13 = z2;
            boolean z14 = z10;
            if (i3 == c10.f3778c) {
                C c12 = c10.f3781f;
                Intrinsics.checkNotNull(c12);
                i3 = c12.f3777b;
                c10 = c12;
            }
            if (i10 == c11.f3778c) {
                c11 = c11.f3781f;
                Intrinsics.checkNotNull(c11);
                i10 = c11.f3777b;
            }
            j3 += min;
            z2 = z13;
            z10 = z14;
        }
        return z2;
    }

    @Override // Kc.InterfaceC0103j
    public final C0104k f(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25356)).toString());
        }
        if (this.f3819b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0104k(A(j));
        }
        C0104k L10 = L((int) j);
        skip(j);
        return L10;
    }

    @Override // Kc.InterfaceC0102i, Kc.F, java.io.Flushable
    public final void flush() {
    }

    public final byte h(long j) {
        AbstractC0095b.f(this.f3819b, j, 1L);
        C c10 = this.f3818a;
        if (c10 == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j3 = this.f3819b;
        if (j3 - j < j) {
            while (j3 > j) {
                c10 = c10.f3782g;
                Intrinsics.checkNotNull(c10);
                j3 -= c10.f3778c - c10.f3777b;
            }
            Intrinsics.checkNotNull(c10);
            return c10.f3776a[(int) ((c10.f3777b + j) - j3)];
        }
        long j10 = 0;
        while (true) {
            long j11 = (c10.f3778c - c10.f3777b) + j10;
            if (j11 > j) {
                Intrinsics.checkNotNull(c10);
                return c10.f3776a[(int) ((c10.f3777b + j) - j10)];
            }
            c10 = c10.f3781f;
            Intrinsics.checkNotNull(c10);
            j10 = j11;
        }
    }

    public final int hashCode() {
        C c10 = this.f3818a;
        if (c10 == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i10 = c10.f3778c;
            for (int i11 = c10.f3777b; i11 < i10; i11++) {
                i3 = (i3 * 31) + c10.f3776a[i11];
            }
            c10 = c10.f3781f;
            Intrinsics.checkNotNull(c10);
        } while (c10 != this.f3818a);
        return i3;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i j(long j) {
        T(AbstractC0095b.i(j));
        return this;
    }

    public final long k(C0104k targetBytes) {
        int i3;
        int i10;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        C c10 = this.f3818a;
        if (c10 == null) {
            return -1L;
        }
        long j = this.f3819b;
        long j3 = 0;
        if (j < 0) {
            while (j > 0) {
                c10 = c10.f3782g;
                Intrinsics.checkNotNull(c10);
                j -= c10.f3778c - c10.f3777b;
            }
            byte[] bArr = targetBytes.f3821a;
            if (bArr.length == 2) {
                byte b2 = bArr[0];
                byte b10 = bArr[1];
                while (j < this.f3819b) {
                    byte[] bArr2 = c10.f3776a;
                    i3 = (int) ((c10.f3777b + j3) - j);
                    int i11 = c10.f3778c;
                    while (i3 < i11) {
                        byte b11 = bArr2[i3];
                        if (b11 != b2 && b11 != b10) {
                            i3++;
                        }
                        i10 = c10.f3777b;
                    }
                    j3 = (c10.f3778c - c10.f3777b) + j;
                    c10 = c10.f3781f;
                    Intrinsics.checkNotNull(c10);
                    j = j3;
                }
                return -1L;
            }
            while (j < this.f3819b) {
                byte[] bArr3 = c10.f3776a;
                i3 = (int) ((c10.f3777b + j3) - j);
                int i12 = c10.f3778c;
                while (i3 < i12) {
                    byte b12 = bArr3[i3];
                    for (byte b13 : bArr) {
                        if (b12 == b13) {
                            i10 = c10.f3777b;
                        }
                    }
                    i3++;
                }
                j3 = (c10.f3778c - c10.f3777b) + j;
                c10 = c10.f3781f;
                Intrinsics.checkNotNull(c10);
                j = j3;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j10 = (c10.f3778c - c10.f3777b) + j;
            if (j10 > 0) {
                break;
            }
            c10 = c10.f3781f;
            Intrinsics.checkNotNull(c10);
            j = j10;
        }
        byte[] bArr4 = targetBytes.f3821a;
        if (bArr4.length == 2) {
            byte b14 = bArr4[0];
            byte b15 = bArr4[1];
            while (j < this.f3819b) {
                byte[] bArr5 = c10.f3776a;
                i3 = (int) ((c10.f3777b + j3) - j);
                int i13 = c10.f3778c;
                while (i3 < i13) {
                    byte b16 = bArr5[i3];
                    if (b16 != b14 && b16 != b15) {
                        i3++;
                    }
                    i10 = c10.f3777b;
                }
                j3 = (c10.f3778c - c10.f3777b) + j;
                c10 = c10.f3781f;
                Intrinsics.checkNotNull(c10);
                j = j3;
            }
            return -1L;
        }
        while (j < this.f3819b) {
            byte[] bArr6 = c10.f3776a;
            i3 = (int) ((c10.f3777b + j3) - j);
            int i14 = c10.f3778c;
            while (i3 < i14) {
                byte b17 = bArr6[i3];
                for (byte b18 : bArr4) {
                    if (b17 == b18) {
                        i10 = c10.f3777b;
                    }
                }
                i3++;
            }
            j3 = (c10.f3778c - c10.f3777b) + j;
            c10 = c10.f3781f;
            Intrinsics.checkNotNull(c10);
            j = j3;
        }
        return -1L;
        return (i3 - i10) + j;
    }

    @Override // Kc.InterfaceC0102i
    public final InterfaceC0102i l(int i3) {
        S(AbstractC0095b.h(i3));
        return this;
    }

    @Override // Kc.H
    public final long n(long j, C0101h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25206)).toString());
        }
        long j3 = this.f3819b;
        if (j3 == 0) {
            return -1L;
        }
        if (j > j3) {
            j = j3;
        }
        sink.E(j, this);
        return j;
    }

    public final boolean p(long j, C0104k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.f3821a.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j >= 0 && length >= 0 && this.f3819b - j >= length) {
            byte[] bArr = bytes.f3821a;
            if (bArr.length >= length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (h(i3 + j) == bArr[i3]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // Kc.InterfaceC0102i
    public final /* bridge */ /* synthetic */ InterfaceC0102i q(C0104k c0104k) {
        N(c0104k);
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final /* bridge */ /* synthetic */ InterfaceC0102i r(String str) {
        W(str);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C c10 = this.f3818a;
        if (c10 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), c10.f3778c - c10.f3777b);
        sink.put(c10.f3776a, c10.f3777b, min);
        int i3 = c10.f3777b + min;
        c10.f3777b = i3;
        this.f3819b -= min;
        if (i3 == c10.f3778c) {
            this.f3818a = c10.a();
            D.a(c10);
        }
        return min;
    }

    @Override // Kc.InterfaceC0103j
    public final byte readByte() {
        if (this.f3819b == 0) {
            throw new EOFException();
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        int i3 = c10.f3777b;
        int i10 = c10.f3778c;
        int i11 = i3 + 1;
        byte b2 = c10.f3776a[i3];
        this.f3819b--;
        if (i11 != i10) {
            c10.f3777b = i11;
            return b2;
        }
        this.f3818a = c10.a();
        D.a(c10);
        return b2;
    }

    @Override // Kc.InterfaceC0103j
    public final int readInt() {
        if (this.f3819b < 4) {
            throw new EOFException();
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        int i3 = c10.f3777b;
        int i10 = c10.f3778c;
        if (i10 - i3 < 4) {
            return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
        }
        byte[] bArr = c10.f3776a;
        int i11 = i3 + 3;
        int i12 = ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3] & UByte.MAX_VALUE) << 24) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
        int i13 = i3 + 4;
        int i14 = i12 | (bArr[i11] & UByte.MAX_VALUE);
        this.f3819b -= 4;
        if (i13 != i10) {
            c10.f3777b = i13;
            return i14;
        }
        this.f3818a = c10.a();
        D.a(c10);
        return i14;
    }

    @Override // Kc.InterfaceC0103j
    public final short readShort() {
        if (this.f3819b < 2) {
            throw new EOFException();
        }
        C c10 = this.f3818a;
        Intrinsics.checkNotNull(c10);
        int i3 = c10.f3777b;
        int i10 = c10.f3778c;
        if (i10 - i3 < 2) {
            return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
        }
        int i11 = i3 + 1;
        byte[] bArr = c10.f3776a;
        int i12 = (bArr[i3] & UByte.MAX_VALUE) << 8;
        int i13 = i3 + 2;
        int i14 = (bArr[i11] & UByte.MAX_VALUE) | i12;
        this.f3819b -= 2;
        if (i13 == i10) {
            this.f3818a = c10.a();
            D.a(c10);
        } else {
            c10.f3777b = i13;
        }
        return (short) i14;
    }

    @Override // Kc.InterfaceC0103j
    public final void skip(long j) {
        while (j > 0) {
            C c10 = this.f3818a;
            if (c10 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, c10.f3778c - c10.f3777b);
            long j3 = min;
            this.f3819b -= j3;
            j -= j3;
            int i3 = c10.f3777b + min;
            c10.f3777b = i3;
            if (i3 == c10.f3778c) {
                this.f3818a = c10.a();
                D.a(c10);
            }
        }
    }

    @Override // Kc.InterfaceC0102i
    public final long t(H source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long n10 = source.n(8192L, this);
            if (n10 == -1) {
                return j;
            }
            j += n10;
        }
    }

    public final String toString() {
        long j = this.f3819b;
        if (j <= 2147483647L) {
            return L((int) j).toString();
        }
        throw new IllegalStateException((StubApp.getString2(25364) + this.f3819b).toString());
    }

    @Override // Kc.InterfaceC0103j
    public final long u(x sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = this.f3819b;
        if (j > 0) {
            sink.E(j, this);
        }
        return j;
    }

    public final C0100g v(C0100g unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = Lc.a.f4397a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == AbstractC0095b.f3798a) {
            unsafeCursor = new C0100g();
        }
        if (unsafeCursor.f3811a != null) {
            throw new IllegalStateException(StubApp.getString2(25365));
        }
        unsafeCursor.f3811a = this;
        unsafeCursor.f3812b = true;
        return unsafeCursor;
    }

    @Override // Kc.InterfaceC0102i
    public final /* bridge */ /* synthetic */ InterfaceC0102i write(byte[] bArr) {
        O(bArr);
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final /* bridge */ /* synthetic */ InterfaceC0102i writeByte(int i3) {
        Q(i3);
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final /* bridge */ /* synthetic */ InterfaceC0102i writeInt(int i3) {
        S(i3);
        return this;
    }

    @Override // Kc.InterfaceC0102i
    public final /* bridge */ /* synthetic */ InterfaceC0102i writeShort(int i3) {
        U(i3);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            C M5 = M(1);
            int min = Math.min(i3, 8192 - M5.f3778c);
            source.get(M5.f3776a, M5.f3778c, min);
            i3 -= min;
            M5.f3778c += min;
        }
        this.f3819b += remaining;
        return remaining;
    }

    public final int read(byte[] sink, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        AbstractC0095b.f(sink.length, i3, i10);
        C c10 = this.f3818a;
        if (c10 == null) {
            return -1;
        }
        int min = Math.min(i10, c10.f3778c - c10.f3777b);
        int i11 = c10.f3777b;
        ArraysKt.copyInto(c10.f3776a, sink, i3, i11, i11 + min);
        int i12 = c10.f3777b + min;
        c10.f3777b = i12;
        this.f3819b -= min;
        if (i12 == c10.f3778c) {
            this.f3818a = c10.a();
            D.a(c10);
        }
        return min;
    }
}
