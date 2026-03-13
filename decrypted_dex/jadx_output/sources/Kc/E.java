package Kc;

import com.stub.StubApp;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class E extends C0104k {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f3786e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f3787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(byte[][] segments, int[] directory) {
        super(C0104k.f3820d.f3821a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f3786e = segments;
        this.f3787f = directory;
    }

    @Override // Kc.C0104k
    public final String a() {
        throw null;
    }

    @Override // Kc.C0104k
    public final void c(int i3, int i10, byte[] target, int i11) {
        Intrinsics.checkNotNullParameter(target, "target");
        long j = i11;
        AbstractC0095b.f(e(), i3, j);
        AbstractC0095b.f(target.length, i10, j);
        int i12 = i11 + i3;
        int a3 = Lc.d.a(this, i3);
        while (i3 < i12) {
            int[] iArr = this.f3787f;
            int i13 = a3 == 0 ? 0 : iArr[a3 - 1];
            int i14 = iArr[a3] - i13;
            byte[][] bArr = this.f3786e;
            int i15 = iArr[bArr.length + a3];
            int min = Math.min(i12, i14 + i13) - i3;
            int i16 = (i3 - i13) + i15;
            ArraysKt.copyInto(bArr[a3], target, i10, i16, i16 + min);
            i10 += min;
            i3 += min;
            a3++;
        }
    }

    @Override // Kc.C0104k
    public final C0104k d(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f3786e;
        int length = bArr.length;
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            int[] iArr = this.f3787f;
            int i11 = iArr[length + i3];
            int i12 = iArr[i3];
            messageDigest.update(bArr[i3], i11, i12 - i10);
            i3++;
            i10 = i12;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new C0104k(digest);
    }

    @Override // Kc.C0104k
    public final int e() {
        return this.f3787f[this.f3786e.length - 1];
    }

    @Override // Kc.C0104k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0104k) {
            C0104k c0104k = (C0104k) obj;
            if (c0104k.e() == e() && n(0, c0104k, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // Kc.C0104k
    public final String f() {
        return u().f();
    }

    @Override // Kc.C0104k
    public final int g(int i3, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u().g(i3, other);
    }

    @Override // Kc.C0104k
    public final int hashCode() {
        int i3 = this.f3822b;
        if (i3 != 0) {
            return i3;
        }
        byte[][] bArr = this.f3786e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f3787f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f3822b = i11;
        return i11;
    }

    @Override // Kc.C0104k
    public final byte[] i() {
        return r();
    }

    @Override // Kc.C0104k
    public final byte j(int i3) {
        byte[][] bArr = this.f3786e;
        int length = bArr.length - 1;
        int[] iArr = this.f3787f;
        AbstractC0095b.f(iArr[length], i3, 1L);
        int a3 = Lc.d.a(this, i3);
        return bArr[a3][(i3 - (a3 == 0 ? 0 : iArr[a3 - 1])) + iArr[bArr.length + a3]];
    }

    @Override // Kc.C0104k
    public final int k(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return u().k(other);
    }

    @Override // Kc.C0104k
    public final boolean m(int i3, int i10, byte[] other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i3 < 0 || i3 > e() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i3;
        int a3 = Lc.d.a(this, i3);
        while (i3 < i12) {
            int[] iArr = this.f3787f;
            int i13 = a3 == 0 ? 0 : iArr[a3 - 1];
            int i14 = iArr[a3] - i13;
            byte[][] bArr = this.f3786e;
            int i15 = iArr[bArr.length + a3];
            int min = Math.min(i12, i14 + i13) - i3;
            if (!AbstractC0095b.a(bArr[a3], (i3 - i13) + i15, other, i10, min)) {
                return false;
            }
            i10 += min;
            i3 += min;
            a3++;
        }
        return true;
    }

    @Override // Kc.C0104k
    public final boolean n(int i3, C0104k other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i3 >= 0 && i3 <= e() - i10) {
            int i11 = i10 + i3;
            int a3 = Lc.d.a(this, i3);
            int i12 = 0;
            while (i3 < i11) {
                int[] iArr = this.f3787f;
                int i13 = a3 == 0 ? 0 : iArr[a3 - 1];
                int i14 = iArr[a3] - i13;
                byte[][] bArr = this.f3786e;
                int i15 = iArr[bArr.length + a3];
                int min = Math.min(i11, i14 + i13) - i3;
                if (other.m(i12, (i3 - i13) + i15, bArr[a3], min)) {
                    i12 += min;
                    i3 += min;
                    a3++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // Kc.C0104k
    public final C0104k o(int i3, int i10) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i10 == -1234567890) {
            i10 = e();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(Xa.h.g(i3, StubApp.getString2(25334), StubApp.getString2(25335)).toString());
        }
        int e10 = e();
        String string2 = StubApp.getString2(25331);
        if (i10 > e10) {
            StringBuilder u2 = Xa.h.u(i10, string2, StubApp.getString2(25333));
            u2.append(e());
            u2.append(')');
            throw new IllegalArgumentException(u2.toString().toString());
        }
        int i11 = i10 - i3;
        if (i11 < 0) {
            throw new IllegalArgumentException(Xa.h.o(string2, i10, i3, StubApp.getString2(25332)).toString());
        }
        if (i3 == 0 && i10 == e()) {
            return this;
        }
        if (i3 == i10) {
            return C0104k.f3820d;
        }
        int a3 = Lc.d.a(this, i3);
        int a9 = Lc.d.a(this, i10 - 1);
        byte[][] bArr = this.f3786e;
        byte[][] bArr2 = (byte[][]) ArraysKt.copyOfRange(bArr, a3, a9 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f3787f;
        if (a3 <= a9) {
            int i12 = a3;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(iArr2[i12] - i3, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                if (i12 == a9) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = a3 != 0 ? iArr2[a3 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i3 - i15) + iArr[length];
        return new E(bArr2, iArr);
    }

    @Override // Kc.C0104k
    public final C0104k q() {
        return u().q();
    }

    @Override // Kc.C0104k
    public final byte[] r() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.f3786e;
        int length = bArr2.length;
        int i3 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i3 < length) {
            int[] iArr = this.f3787f;
            int i12 = iArr[length + i3];
            int i13 = iArr[i3];
            int i14 = i13 - i10;
            ArraysKt.copyInto(bArr2[i3], bArr, i11, i12, i12 + i14);
            i11 += i14;
            i3++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // Kc.C0104k
    public final void t(C0101h buffer, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int a3 = Lc.d.a(this, 0);
        int i10 = 0;
        while (i10 < i3) {
            int[] iArr = this.f3787f;
            int i11 = a3 == 0 ? 0 : iArr[a3 - 1];
            int i12 = iArr[a3] - i11;
            byte[][] bArr = this.f3786e;
            int i13 = iArr[bArr.length + a3];
            int min = Math.min(i3, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            C c10 = new C(bArr[a3], i14, i14 + min, true, false);
            C c11 = buffer.f3818a;
            if (c11 == null) {
                c10.f3782g = c10;
                c10.f3781f = c10;
                buffer.f3818a = c10;
            } else {
                Intrinsics.checkNotNull(c11);
                C c12 = c11.f3782g;
                Intrinsics.checkNotNull(c12);
                c12.b(c10);
            }
            i10 += min;
            a3++;
        }
        buffer.f3819b += i3;
    }

    @Override // Kc.C0104k
    public final String toString() {
        return u().toString();
    }

    public final C0104k u() {
        return new C0104k(r());
    }
}
