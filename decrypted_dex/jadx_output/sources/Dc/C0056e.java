package Dc;

import Kc.C0101h;
import Kc.C0104k;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* renamed from: Dc.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0056e {

    /* renamed from: a, reason: collision with root package name */
    public final C0101h f1573a;

    /* renamed from: b, reason: collision with root package name */
    public int f1574b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1575c;

    /* renamed from: d, reason: collision with root package name */
    public int f1576d;

    /* renamed from: e, reason: collision with root package name */
    public C0054c[] f1577e;

    /* renamed from: f, reason: collision with root package name */
    public int f1578f;

    /* renamed from: g, reason: collision with root package name */
    public int f1579g;

    /* renamed from: h, reason: collision with root package name */
    public int f1580h;

    public C0056e(C0101h out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f1573a = out;
        this.f1574b = IntCompanionObject.MAX_VALUE;
        this.f1576d = 4096;
        this.f1577e = new C0054c[8];
        this.f1578f = 7;
    }

    public final void a(int i3) {
        int i10;
        if (i3 > 0) {
            int length = this.f1577e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f1578f;
                if (length < i10 || i3 <= 0) {
                    break;
                }
                C0054c c0054c = this.f1577e[length];
                Intrinsics.checkNotNull(c0054c);
                i3 -= c0054c.f1565c;
                int i12 = this.f1580h;
                C0054c c0054c2 = this.f1577e[length];
                Intrinsics.checkNotNull(c0054c2);
                this.f1580h = i12 - c0054c2.f1565c;
                this.f1579g--;
                i11++;
                length--;
            }
            C0054c[] c0054cArr = this.f1577e;
            int i13 = i10 + 1;
            System.arraycopy(c0054cArr, i13, c0054cArr, i13 + i11, this.f1579g);
            C0054c[] c0054cArr2 = this.f1577e;
            int i14 = this.f1578f + 1;
            Arrays.fill(c0054cArr2, i14, i14 + i11, (Object) null);
            this.f1578f += i11;
        }
    }

    public final void b(C0054c c0054c) {
        int i3 = this.f1576d;
        int i10 = c0054c.f1565c;
        if (i10 > i3) {
            ArraysKt___ArraysJvmKt.fill$default(this.f1577e, (Object) null, 0, 0, 6, (Object) null);
            this.f1578f = this.f1577e.length - 1;
            this.f1579g = 0;
            this.f1580h = 0;
            return;
        }
        a((this.f1580h + i10) - i3);
        int i11 = this.f1579g + 1;
        C0054c[] c0054cArr = this.f1577e;
        if (i11 > c0054cArr.length) {
            C0054c[] c0054cArr2 = new C0054c[c0054cArr.length * 2];
            System.arraycopy(c0054cArr, 0, c0054cArr2, c0054cArr.length, c0054cArr.length);
            this.f1578f = this.f1577e.length - 1;
            this.f1577e = c0054cArr2;
        }
        int i12 = this.f1578f;
        this.f1578f = i12 - 1;
        this.f1577e[i12] = c0054c;
        this.f1579g++;
        this.f1580h += i10;
    }

    public final void c(C0104k source) {
        Intrinsics.checkNotNullParameter(source, "data");
        C0101h c0101h = this.f1573a;
        int[] iArr = C.f1542a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int e10 = source.e();
        int i3 = 0;
        int i10 = 0;
        long j = 0;
        while (i10 < e10) {
            int i11 = i10 + 1;
            byte j3 = source.j(i10);
            byte[] bArr = xc.b.f23179a;
            j += C.f1543b[j3 & UByte.MAX_VALUE];
            i10 = i11;
        }
        if (((int) ((j + 7) >> 3)) >= source.e()) {
            e(source.e(), CertificateBody.profileType, 0);
            c0101h.N(source);
            return;
        }
        C0101h sink = new C0101h();
        int[] iArr2 = C.f1542a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int e11 = source.e();
        long j10 = 0;
        int i12 = 0;
        while (i3 < e11) {
            int i13 = i3 + 1;
            byte j11 = source.j(i3);
            byte[] bArr2 = xc.b.f23179a;
            int i14 = j11 & UByte.MAX_VALUE;
            int i15 = C.f1542a[i14];
            byte b2 = C.f1543b[i14];
            j10 = (j10 << b2) | i15;
            i12 += b2;
            while (i12 >= 8) {
                i12 -= 8;
                sink.Q((int) (j10 >> i12));
            }
            i3 = i13;
        }
        if (i12 > 0) {
            sink.Q((int) ((255 >>> i12) | (j10 << (8 - i12))));
        }
        C0104k f10 = sink.f(sink.f3819b);
        e(f10.e(), CertificateBody.profileType, 128);
        c0101h.N(f10);
    }

    public final void d(ArrayList headerBlock) {
        int i3;
        int i10;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f1575c) {
            int i11 = this.f1574b;
            if (i11 < this.f1576d) {
                e(i11, 31, 32);
            }
            this.f1575c = false;
            this.f1574b = IntCompanionObject.MAX_VALUE;
            e(this.f1576d, 31, 32);
        }
        int size = headerBlock.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            C0054c c0054c = (C0054c) headerBlock.get(i12);
            C0104k q10 = c0054c.f1563a.q();
            Integer num = (Integer) AbstractC0057f.f1582b.get(q10);
            C0104k c0104k = c0054c.f1564b;
            if (num != null) {
                int intValue = num.intValue();
                i10 = intValue + 1;
                if (2 <= i10 && i10 < 8) {
                    C0054c[] c0054cArr = AbstractC0057f.f1581a;
                    if (Intrinsics.areEqual(c0054cArr[intValue].f1564b, c0104k)) {
                        i3 = i10;
                    } else if (Intrinsics.areEqual(c0054cArr[i10].f1564b, c0104k)) {
                        i10 = intValue + 2;
                        i3 = i10;
                    }
                }
                i3 = i10;
                i10 = -1;
            } else {
                i3 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                int i14 = this.f1578f + 1;
                int length = this.f1577e.length;
                while (true) {
                    if (i14 >= length) {
                        break;
                    }
                    int i15 = i14 + 1;
                    C0054c c0054c2 = this.f1577e[i14];
                    Intrinsics.checkNotNull(c0054c2);
                    if (Intrinsics.areEqual(c0054c2.f1563a, q10)) {
                        C0054c c0054c3 = this.f1577e[i14];
                        Intrinsics.checkNotNull(c0054c3);
                        if (Intrinsics.areEqual(c0054c3.f1564b, c0104k)) {
                            i10 = AbstractC0057f.f1581a.length + (i14 - this.f1578f);
                            break;
                        } else if (i3 == -1) {
                            i3 = AbstractC0057f.f1581a.length + (i14 - this.f1578f);
                        }
                    }
                    i14 = i15;
                }
            }
            if (i10 != -1) {
                e(i10, CertificateBody.profileType, 128);
            } else if (i3 == -1) {
                this.f1573a.Q(64);
                c(q10);
                c(c0104k);
                b(c0054c);
            } else {
                C0104k prefix = C0054c.f1557d;
                q10.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!q10.n(0, prefix, prefix.e()) || Intrinsics.areEqual(C0054c.f1562i, q10)) {
                    e(i3, 63, 64);
                    c(c0104k);
                    b(c0054c);
                } else {
                    e(i3, 15, 0);
                    c(c0104k);
                }
            }
            i12 = i13;
        }
    }

    public final void e(int i3, int i10, int i11) {
        C0101h c0101h = this.f1573a;
        if (i3 < i10) {
            c0101h.Q(i3 | i11);
            return;
        }
        c0101h.Q(i11 | i10);
        int i12 = i3 - i10;
        while (i12 >= 128) {
            c0101h.Q(128 | (i12 & CertificateBody.profileType));
            i12 >>>= 7;
        }
        c0101h.Q(i12);
    }
}
