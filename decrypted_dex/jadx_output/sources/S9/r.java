package S9;

import Kc.C;
import Kc.C0100g;
import Kc.C0101h;
import Kc.C0104k;
import com.stub.StubApp;
import i2.u;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f6657h = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public C0101h f6658a = new C0101h();

    /* renamed from: b, reason: collision with root package name */
    public C0101h f6659b = new C0101h();

    /* renamed from: c, reason: collision with root package name */
    public final C0100g f6660c = new C0100g();

    /* renamed from: d, reason: collision with root package name */
    public byte[] f6661d = f6657h;

    /* renamed from: e, reason: collision with root package name */
    public int f6662e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f6663f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f6664g;

    public r() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f6663f = LazyKt.lazy(lazyThreadSafetyMode, (Function0) q.f6656a);
        this.f6664g = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Ac.m(this, 10));
    }

    public final void a() {
        byte[] bArr = this.f6661d;
        byte[] bArr2 = f6657h;
        if (bArr == bArr2) {
            return;
        }
        this.f6660c.close();
        this.f6659b.skip(this.f6662e);
        this.f6659b.t(this.f6658a);
        C0101h c0101h = this.f6658a;
        this.f6658a = this.f6659b;
        this.f6659b = c0101h;
        this.f6661d = bArr2;
        this.f6662e = 0;
    }

    public final int b() {
        return (this.f6661d.length - this.f6662e) + ((int) this.f6658a.f3819b);
    }

    public final void c(int i3) {
        if (this.f6662e >= i3) {
            return;
        }
        a();
        C0101h c0101h = this.f6659b;
        C0100g c0100g = this.f6660c;
        c0101h.v(c0100g);
        if (i3 <= 0) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(6072)).toString());
        }
        if (i3 > 8192) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(6071)).toString());
        }
        C0101h c0101h2 = c0100g.f3811a;
        if (c0101h2 == null) {
            throw new IllegalStateException(StubApp.getString2(6070));
        }
        if (!c0100g.f3812b) {
            throw new IllegalStateException(StubApp.getString2(6069));
        }
        long j = c0101h2.f3819b;
        C M5 = c0101h2.M(i3);
        int i10 = 8192 - M5.f3778c;
        M5.f3778c = 8192;
        c0101h2.f3819b = i10 + j;
        c0100g.f3813c = M5;
        c0100g.f3814d = j;
        byte[] bArr = M5.f3776a;
        c0100g.f3815e = bArr;
        c0100g.f3816f = 8192 - i10;
        c0100g.f3817g = 8192;
        if (j == 0) {
            Intrinsics.checkNotNull(bArr);
            if (8192 == bArr.length) {
                byte[] bArr2 = c0100g.f3815e;
                Intrinsics.checkNotNull(bArr2);
                this.f6661d = bArr2;
                this.f6662e = c0100g.f3817g;
                return;
            }
        }
        throw new IllegalStateException(StubApp.getString2(6068));
    }

    public final void d(C0104k value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int e10 = value.e();
        while (e10 != 0) {
            c(1);
            int min = Math.min(this.f6662e, e10);
            int i3 = this.f6662e - min;
            this.f6662e = i3;
            e10 -= min;
            value.c(e10, i3, this.f6661d, min);
        }
    }

    public final void e(int i3) {
        c(4);
        int i10 = this.f6662e;
        int i11 = i10 - 4;
        this.f6662e = i11;
        byte[] bArr = this.f6661d;
        bArr[i11] = (byte) (i3 & 255);
        bArr[i10 - 3] = (byte) ((i3 >>> 8) & 255);
        bArr[i10 - 2] = (byte) ((i3 >>> 16) & 255);
        bArr[i10 - 1] = (byte) ((i3 >>> 24) & 255);
    }

    public final void f(long j) {
        c(8);
        int i3 = this.f6662e;
        int i10 = i3 - 8;
        this.f6662e = i10;
        byte[] bArr = this.f6661d;
        bArr[i10] = (byte) (j & 255);
        bArr[i3 - 7] = (byte) ((j >>> 8) & 255);
        bArr[i3 - 6] = (byte) ((j >>> 16) & 255);
        bArr[i3 - 5] = (byte) ((j >>> 24) & 255);
        bArr[i3 - 4] = (byte) ((j >>> 32) & 255);
        bArr[i3 - 3] = (byte) ((j >>> 40) & 255);
        bArr[i3 - 2] = (byte) ((j >>> 48) & 255);
        bArr[i3 - 1] = (byte) ((j >>> 56) & 255);
    }

    public final void g(int i3, d fieldEncoding) {
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        h((i3 << 3) | fieldEncoding.f6620a);
    }

    public final void h(int i3) {
        int i10 = (i3 & (-128)) == 0 ? 1 : (i3 & (-16384)) == 0 ? 2 : ((-2097152) & i3) == 0 ? 3 : ((-268435456) & i3) == 0 ? 4 : 5;
        c(i10);
        int i11 = this.f6662e - i10;
        this.f6662e = i11;
        while ((i3 & (-128)) != 0) {
            this.f6661d[i11] = (byte) ((i3 & CertificateBody.profileType) | 128);
            i3 >>>= 7;
            i11++;
        }
        this.f6661d[i11] = (byte) i3;
    }

    public final void i(long j) {
        int L10 = Ec.d.L(j);
        c(L10);
        int i3 = this.f6662e - L10;
        this.f6662e = i3;
        while (((-128) & j) != 0) {
            this.f6661d[i3] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i3++;
        }
        this.f6661d[i3] = (byte) j;
    }
}
