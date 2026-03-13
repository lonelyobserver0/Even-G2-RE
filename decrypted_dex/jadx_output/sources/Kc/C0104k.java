package Kc;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: Kc.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class C0104k implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0104k f3820d = new C0104k(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3821a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f3822b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f3823c;

    public C0104k(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f3821a = data;
    }

    public static int h(C0104k c0104k, C0104k other) {
        c0104k.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c0104k.g(0, other.f3821a);
    }

    public static int l(C0104k c0104k, C0104k other) {
        c0104k.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return c0104k.k(other.f3821a);
    }

    public static /* synthetic */ C0104k p(C0104k c0104k, int i3, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i3 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return c0104k.o(i3, i10);
    }

    public String a() {
        byte[] map = AbstractC0094a.f3797a;
        byte[] bArr = this.f3821a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i3 = 0;
        int i10 = 0;
        while (i3 < length) {
            byte b2 = bArr[i3];
            int i11 = i3 + 2;
            byte b10 = bArr[i3 + 1];
            i3 += 3;
            byte b11 = bArr[i11];
            bArr2[i10] = map[(b2 & UByte.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[((b2 & 3) << 4) | ((b10 & UByte.MAX_VALUE) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b10 & 15) << 2) | ((b11 & UByte.MAX_VALUE) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i3];
            bArr2[i10] = map[(b12 & UByte.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[(b12 & 3) << 4];
            bArr2[i10 + 2] = Base64.padSymbol;
            bArr2[i10 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            int i13 = i3 + 1;
            byte b13 = bArr[i3];
            byte b14 = bArr[i13];
            bArr2[i10] = map[(b13 & UByte.MAX_VALUE) >> 2];
            bArr2[i10 + 1] = map[((b13 & 3) << 4) | ((b14 & UByte.MAX_VALUE) >> 4)];
            bArr2[i10 + 2] = map[(b14 & 15) << 2];
            bArr2[i10 + 3] = Base64.padSymbol;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0104k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int e10 = e();
        int e11 = other.e();
        int min = Math.min(e10, e11);
        for (int i3 = 0; i3 < min; i3++) {
            int j = j(i3) & UByte.MAX_VALUE;
            int j3 = other.j(i3) & UByte.MAX_VALUE;
            if (j != j3) {
                return j < j3 ? -1 : 1;
            }
        }
        if (e10 == e11) {
            return 0;
        }
        return e10 < e11 ? -1 : 1;
    }

    public void c(int i3, int i10, byte[] target, int i11) {
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(this.f3821a, target, i10, i3, i11 + i3);
    }

    public C0104k d(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f3821a, 0, e());
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        return new C0104k(digest);
    }

    public int e() {
        return this.f3821a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0104k) {
            C0104k c0104k = (C0104k) obj;
            int e10 = c0104k.e();
            byte[] bArr = this.f3821a;
            if (e10 == bArr.length && c0104k.m(0, 0, bArr, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f3821a;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b2 : bArr) {
            int i10 = i3 + 1;
            char[] cArr2 = Lc.b.f4398a;
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            i3 += 2;
            cArr[i10] = cArr2[b2 & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public int g(int i3, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        byte[] bArr = this.f3821a;
        int length = bArr.length - other.length;
        int max = Math.max(i3, 0);
        if (max > length) {
            return -1;
        }
        while (!AbstractC0095b.a(bArr, max, other, 0, other.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public int hashCode() {
        int i3 = this.f3822b;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Arrays.hashCode(this.f3821a);
        this.f3822b = hashCode;
        return hashCode;
    }

    public byte[] i() {
        return this.f3821a;
    }

    public byte j(int i3) {
        return this.f3821a[i3];
    }

    public int k(byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(this, "<this>");
        int e10 = e();
        byte[] bArr = this.f3821a;
        for (int min = Math.min(e10, bArr.length - other.length); -1 < min; min--) {
            if (AbstractC0095b.a(bArr, min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean m(int i3, int i10, byte[] other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i3 < 0) {
            return false;
        }
        byte[] bArr = this.f3821a;
        return i3 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && AbstractC0095b.a(bArr, i3, other, i10, i11);
    }

    public boolean n(int i3, C0104k other, int i10) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.m(0, i3, this.f3821a, i10);
    }

    public C0104k o(int i3, int i10) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (i10 == -1234567890) {
            i10 = e();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f3821a;
        if (i10 > bArr.length) {
            throw new IllegalArgumentException(com.mapbox.common.b.j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i10 - i3 >= 0) {
            return (i3 == 0 && i10 == bArr.length) ? this : new C0104k(ArraysKt.copyOfRange(bArr, i3, i10));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0104k q() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f3821a;
            if (i3 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i3];
            if (b2 >= 65 && b2 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                copyOf[i3] = (byte) (b2 + 32);
                for (int i10 = i3 + 1; i10 < copyOf.length; i10++) {
                    byte b10 = copyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        copyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new C0104k(copyOf);
            }
            i3++;
        }
    }

    public byte[] r() {
        byte[] bArr = this.f3821a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final String s() {
        String str = this.f3823c;
        if (str != null) {
            return str;
        }
        byte[] i3 = i();
        Intrinsics.checkNotNullParameter(i3, "<this>");
        String str2 = new String(i3, Charsets.UTF_8);
        this.f3823c = str2;
        return str2;
    }

    public void t(C0101h buffer, int i3) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.P(this.f3821a, 0, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0102, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00fa, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0138, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x013c, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00da, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0096, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00c8, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0085, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x017b, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0174, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b7, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bd, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0148, code lost:
    
        if (r8 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c0, code lost:
    
        if (r8 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kc.C0104k.toString():java.lang.String");
    }
}
