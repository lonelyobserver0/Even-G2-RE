package com.google.protobuf;

import java.io.InputStream;
import org.bouncycastle.asn1.eac.CertificateBody;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0741n {

    /* renamed from: a, reason: collision with root package name */
    public int f12200a;

    /* renamed from: b, reason: collision with root package name */
    public Ab.g f12201b;

    public static int b(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0735k f(byte[] bArr, int i3, int i10, boolean z2) {
        C0735k c0735k = new C0735k(bArr, i3, i10, z2);
        try {
            c0735k.i(i10);
            return c0735k;
        } catch (T e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static AbstractC0741n g(InputStream inputStream) {
        if (inputStream != null) {
            return new C0737l(inputStream);
        }
        byte[] bArr = Q.f12120b;
        return f(bArr, 0, bArr.length, false);
    }

    public static int s(InputStream inputStream, int i3) {
        if ((i3 & 128) == 0) {
            return i3;
        }
        int i10 = i3 & CertificateBody.profileType;
        int i11 = 7;
        while (i11 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw T.g();
            }
            i10 |= (read & CertificateBody.profileType) << i11;
            if ((read & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw T.g();
            }
            if ((read2 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw T.d();
    }

    public abstract int A();

    public abstract long B();

    public abstract void a(int i3);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i3);

    public abstract int i(int i3);

    public abstract boolean j();

    public abstract C0731i k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}
