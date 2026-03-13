package Kc;

import com.stub.StubApp;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* renamed from: Kc.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0100g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public C0101h f3811a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3812b;

    /* renamed from: c, reason: collision with root package name */
    public C f3813c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f3815e;

    /* renamed from: d, reason: collision with root package name */
    public long f3814d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f3816f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3817g = -1;

    public final void a(long j) {
        C0101h c0101h = this.f3811a;
        if (c0101h == null) {
            throw new IllegalStateException(StubApp.getString2(6070));
        }
        if (!this.f3812b) {
            throw new IllegalStateException(StubApp.getString2(25353));
        }
        long j3 = c0101h.f3819b;
        if (j <= j3) {
            if (j < 0) {
                throw new IllegalArgumentException(Xa.h.h(j, StubApp.getString2(25352)).toString());
            }
            long j10 = j3 - j;
            while (true) {
                if (j10 <= 0) {
                    break;
                }
                C c10 = c0101h.f3818a;
                Intrinsics.checkNotNull(c10);
                C c11 = c10.f3782g;
                Intrinsics.checkNotNull(c11);
                int i3 = c11.f3778c;
                long j11 = i3 - c11.f3777b;
                if (j11 > j10) {
                    c11.f3778c = i3 - ((int) j10);
                    break;
                } else {
                    c0101h.f3818a = c11.a();
                    D.a(c11);
                    j10 -= j11;
                }
            }
            this.f3813c = null;
            this.f3814d = j;
            this.f3815e = null;
            this.f3816f = -1;
            this.f3817g = -1;
        } else if (j > j3) {
            long j12 = j - j3;
            int i10 = 1;
            boolean z2 = true;
            for (long j13 = 0; j12 > j13; j13 = 0) {
                C M5 = c0101h.M(i10);
                int min = (int) Math.min(j12, 8192 - M5.f3778c);
                int i11 = M5.f3778c + min;
                M5.f3778c = i11;
                j12 -= min;
                if (z2) {
                    this.f3813c = M5;
                    this.f3814d = j3;
                    this.f3815e = M5.f3776a;
                    this.f3816f = i11 - min;
                    this.f3817g = i11;
                    z2 = false;
                }
                i10 = 1;
            }
        }
        c0101h.f3819b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3811a == null) {
            throw new IllegalStateException(StubApp.getString2(6070));
        }
        this.f3811a = null;
        this.f3813c = null;
        this.f3814d = -1L;
        this.f3815e = null;
        this.f3816f = -1;
        this.f3817g = -1;
    }

    public final int d(long j) {
        C c10;
        C0101h c0101h = this.f3811a;
        if (c0101h == null) {
            throw new IllegalStateException(StubApp.getString2(6070));
        }
        if (j >= -1) {
            long j3 = c0101h.f3819b;
            if (j <= j3) {
                if (j == -1 || j == j3) {
                    this.f3813c = null;
                    this.f3814d = j;
                    this.f3815e = null;
                    this.f3816f = -1;
                    this.f3817g = -1;
                    return -1;
                }
                C c11 = c0101h.f3818a;
                C c12 = this.f3813c;
                long j10 = 0;
                if (c12 != null) {
                    long j11 = this.f3814d;
                    int i3 = this.f3816f;
                    Intrinsics.checkNotNull(c12);
                    long j12 = j11 - (i3 - c12.f3777b);
                    if (j12 > j) {
                        c10 = c11;
                        c11 = this.f3813c;
                        j3 = j12;
                    } else {
                        c10 = this.f3813c;
                        j10 = j12;
                    }
                } else {
                    c10 = c11;
                }
                if (j3 - j > j - j10) {
                    while (true) {
                        Intrinsics.checkNotNull(c10);
                        long j13 = (c10.f3778c - c10.f3777b) + j10;
                        if (j < j13) {
                            break;
                        }
                        c10 = c10.f3781f;
                        j10 = j13;
                    }
                } else {
                    while (j3 > j) {
                        Intrinsics.checkNotNull(c11);
                        c11 = c11.f3782g;
                        Intrinsics.checkNotNull(c11);
                        j3 -= c11.f3778c - c11.f3777b;
                    }
                    c10 = c11;
                    j10 = j3;
                }
                if (this.f3812b) {
                    Intrinsics.checkNotNull(c10);
                    if (c10.f3779d) {
                        byte[] bArr = c10.f3776a;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                        C c13 = new C(copyOf, c10.f3777b, c10.f3778c, false, true);
                        if (c0101h.f3818a == c10) {
                            c0101h.f3818a = c13;
                        }
                        c10.b(c13);
                        C c14 = c13.f3782g;
                        Intrinsics.checkNotNull(c14);
                        c14.a();
                        c10 = c13;
                    }
                }
                this.f3813c = c10;
                this.f3814d = j;
                Intrinsics.checkNotNull(c10);
                this.f3815e = c10.f3776a;
                int i10 = c10.f3777b + ((int) (j - j10));
                this.f3816f = i10;
                int i11 = c10.f3778c;
                this.f3817g = i11;
                return i11 - i10;
            }
        }
        StringBuilder m4 = AbstractC1482f.m(j, StubApp.getString2(25354), StubApp.getString2(25355));
        m4.append(c0101h.f3819b);
        throw new ArrayIndexOutOfBoundsException(m4.toString());
    }
}
