package Dc;

import Kc.AbstractC0095b;
import Kc.C0101h;
import Kc.C0104k;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* renamed from: Dc.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0055d {

    /* renamed from: a, reason: collision with root package name */
    public int f1566a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1567b;

    /* renamed from: c, reason: collision with root package name */
    public final Kc.B f1568c;

    /* renamed from: d, reason: collision with root package name */
    public C0054c[] f1569d;

    /* renamed from: e, reason: collision with root package name */
    public int f1570e;

    /* renamed from: f, reason: collision with root package name */
    public int f1571f;

    /* renamed from: g, reason: collision with root package name */
    public int f1572g;

    public C0055d(u source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1566a = 4096;
        this.f1567b = new ArrayList();
        this.f1568c = AbstractC0095b.d(source);
        this.f1569d = new C0054c[8];
        this.f1570e = 7;
    }

    public final int a(int i3) {
        int i10;
        int i11 = 0;
        if (i3 > 0) {
            int length = this.f1569d.length;
            while (true) {
                length--;
                i10 = this.f1570e;
                if (length < i10 || i3 <= 0) {
                    break;
                }
                C0054c c0054c = this.f1569d[length];
                Intrinsics.checkNotNull(c0054c);
                int i12 = c0054c.f1565c;
                i3 -= i12;
                this.f1572g -= i12;
                this.f1571f--;
                i11++;
            }
            C0054c[] c0054cArr = this.f1569d;
            System.arraycopy(c0054cArr, i10 + 1, c0054cArr, i10 + 1 + i11, this.f1571f);
            this.f1570e += i11;
        }
        return i11;
    }

    public final C0104k b(int i3) {
        if (i3 >= 0) {
            C0054c[] c0054cArr = AbstractC0057f.f1581a;
            if (i3 <= c0054cArr.length - 1) {
                return c0054cArr[i3].f1563a;
            }
        }
        int length = this.f1570e + 1 + (i3 - AbstractC0057f.f1581a.length);
        if (length >= 0) {
            C0054c[] c0054cArr2 = this.f1569d;
            if (length < c0054cArr2.length) {
                C0054c c0054c = c0054cArr2[length];
                Intrinsics.checkNotNull(c0054c);
                return c0054c.f1563a;
            }
        }
        throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i3 + 1)));
    }

    public final void c(C0054c c0054c) {
        this.f1567b.add(c0054c);
        int i3 = this.f1566a;
        int i10 = c0054c.f1565c;
        if (i10 > i3) {
            ArraysKt___ArraysJvmKt.fill$default(this.f1569d, (Object) null, 0, 0, 6, (Object) null);
            this.f1570e = this.f1569d.length - 1;
            this.f1571f = 0;
            this.f1572g = 0;
            return;
        }
        a((this.f1572g + i10) - i3);
        int i11 = this.f1571f + 1;
        C0054c[] c0054cArr = this.f1569d;
        if (i11 > c0054cArr.length) {
            C0054c[] c0054cArr2 = new C0054c[c0054cArr.length * 2];
            System.arraycopy(c0054cArr, 0, c0054cArr2, c0054cArr.length, c0054cArr.length);
            this.f1570e = this.f1569d.length - 1;
            this.f1569d = c0054cArr2;
        }
        int i12 = this.f1570e;
        this.f1570e = i12 - 1;
        this.f1569d[i12] = c0054c;
        this.f1571f++;
        this.f1572g += i10;
    }

    public final C0104k d() {
        int i3;
        Kc.B source = this.f1568c;
        byte readByte = source.readByte();
        byte[] bArr = xc.b.f23179a;
        int i10 = readByte & UByte.MAX_VALUE;
        int i11 = 0;
        boolean z2 = (readByte & ByteCompanionObject.MIN_VALUE) == 128;
        long e10 = e(i10, CertificateBody.profileType);
        if (!z2) {
            return source.f(e10);
        }
        C0101h sink = new C0101h();
        int[] iArr = C.f1542a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        B b2 = C.f1544c;
        B b10 = b2;
        long j = 0;
        int i12 = 0;
        while (j < e10) {
            j++;
            byte readByte2 = source.readByte();
            byte[] bArr2 = xc.b.f23179a;
            i11 = (i11 << 8) | (readByte2 & UByte.MAX_VALUE);
            i12 += 8;
            while (i12 >= 8) {
                B[] bArr3 = (B[]) b10.f1541c;
                Intrinsics.checkNotNull(bArr3);
                b10 = bArr3[(i11 >>> (i12 - 8)) & 255];
                Intrinsics.checkNotNull(b10);
                if (((B[]) b10.f1541c) == null) {
                    sink.Q(b10.f1539a);
                    i12 -= b10.f1540b;
                    b10 = b2;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            B[] bArr4 = (B[]) b10.f1541c;
            Intrinsics.checkNotNull(bArr4);
            B b11 = bArr4[(i11 << (8 - i12)) & 255];
            Intrinsics.checkNotNull(b11);
            if (((B[]) b11.f1541c) != null || (i3 = b11.f1540b) > i12) {
                break;
            }
            sink.Q(b11.f1539a);
            i12 -= i3;
            b10 = b2;
        }
        return sink.f(sink.f3819b);
    }

    public final int e(int i3, int i10) {
        int i11 = i3 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte readByte = this.f1568c.readByte();
            byte[] bArr = xc.b.f23179a;
            int i13 = readByte & UByte.MAX_VALUE;
            if ((readByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (readByte & ByteCompanionObject.MAX_VALUE) << i12;
            i12 += 7;
        }
    }
}
