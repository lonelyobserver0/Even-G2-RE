package I0;

import H0.C0066i;
import H0.m;
import T0.H;
import T0.q;
import com.stub.StubApp;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.jvm.internal.ByteCompanionObject;
import o0.C1406C;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import s0.n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3057a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3058b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3059c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3060d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3061e;

    /* renamed from: f, reason: collision with root package name */
    public int f3062f;

    /* renamed from: g, reason: collision with root package name */
    public long f3063g;

    /* renamed from: h, reason: collision with root package name */
    public int f3064h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f3065k;

    public e(String str, String str2, long j, int i3, int i10, int i11, int[] iArr, TreeMap treeMap) {
        this.f3057a = 2;
        this.f3058b = str;
        this.f3059c = str2;
        this.f3063g = j;
        this.f3065k = 0L;
        this.f3062f = i3;
        this.f3064h = i10;
        this.j = i11;
        this.f3060d = iArr;
        this.f3061e = treeMap;
    }

    private final void a(long j) {
    }

    private final void f(long j) {
    }

    @Override // I0.i
    public void b(long j, long j3) {
        switch (this.f3057a) {
            case 0:
                this.f3063g = j;
                this.j = 0;
                this.f3065k = j3;
                break;
            default:
                this.f3063g = j;
                this.j = 0;
                this.f3065k = j3;
                break;
        }
    }

    @Override // I0.i
    public void c(C1553n c1553n, long j, int i3, boolean z2) {
        int i10;
        String string2 = StubApp.getString2(2786);
        String string22 = StubApp.getString2(2779);
        String string23 = StubApp.getString2(2778);
        Object obj = this.f3058b;
        int i11 = 1;
        switch (this.f3057a) {
            case 0:
                try {
                    int i12 = c1553n.f20176a[0] & 31;
                    AbstractC1550k.h((H) this.f3061e);
                    if (i12 > 0 && i12 < 24) {
                        int a3 = c1553n.a();
                        this.j = g() + this.j;
                        ((H) this.f3061e).a(c1553n, a3, 0);
                        this.j += a3;
                        this.f3062f = (c1553n.f20176a[0] & 31) == 5 ? 1 : 0;
                    } else if (i12 == 24) {
                        c1553n.u();
                        while (c1553n.a() > 4) {
                            int A4 = c1553n.A();
                            this.j = g() + this.j;
                            ((H) this.f3061e).a(c1553n, A4, 0);
                            this.j += A4;
                        }
                        this.f3062f = 0;
                    } else {
                        if (i12 != 28) {
                            throw C1406C.b(String.format(StubApp.getString2(2800), Integer.valueOf(i12)), null);
                        }
                        byte[] bArr = c1553n.f20176a;
                        byte b2 = bArr[0];
                        byte b10 = bArr[1];
                        int i13 = (b2 & 224) | (b10 & 31);
                        boolean z10 = (b10 & ByteCompanionObject.MIN_VALUE) > 0;
                        boolean z11 = (b10 & 64) > 0;
                        C1553n c1553n2 = (C1553n) obj;
                        if (z10) {
                            this.j = g() + this.j;
                            byte[] bArr2 = c1553n.f20176a;
                            i10 = 1;
                            bArr2[1] = (byte) i13;
                            c1553n2.getClass();
                            c1553n2.E(bArr2.length, bArr2);
                            c1553n2.G(1);
                        } else {
                            i10 = 1;
                            int a9 = C0066i.a(this.f3064h);
                            if (i3 != a9) {
                                int i14 = AbstractC1560u.f20190a;
                                Locale locale = Locale.US;
                                AbstractC1550k.w(StubApp.getString2(2799), AbstractC1482f.e(a9, string23, i3, string22, string2));
                            } else {
                                byte[] bArr3 = c1553n.f20176a;
                                c1553n2.getClass();
                                c1553n2.E(bArr3.length, bArr3);
                                c1553n2.G(2);
                            }
                        }
                        int a10 = c1553n2.a();
                        ((H) this.f3061e).a(c1553n2, a10, 0);
                        this.j += a10;
                        if (z11) {
                            this.f3062f = (i13 & 31) == 5 ? i10 : 0;
                        }
                    }
                    if (z2) {
                        if (this.f3063g == -9223372036854775807L) {
                            this.f3063g = j;
                        }
                        ((H) this.f3061e).c(android.support.v4.media.session.b.B(this.f3065k, j, this.f3063g, 90000), this.f3062f, this.j, 0, null);
                        this.j = 0;
                    }
                    this.f3064h = i3;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw C1406C.b(null, e10);
                }
            default:
                byte[] bArr4 = c1553n.f20176a;
                if (bArr4.length == 0) {
                    throw C1406C.b(StubApp.getString2(2798), null);
                }
                int i15 = (bArr4[0] >> 1) & 63;
                AbstractC1550k.h((H) this.f3061e);
                C1553n c1553n3 = (C1553n) this.f3059c;
                if (i15 >= 0 && i15 < 48) {
                    int a11 = c1553n.a();
                    int i16 = this.j;
                    c1553n3.G(0);
                    int a12 = c1553n3.a();
                    H h2 = (H) this.f3061e;
                    h2.getClass();
                    h2.a(c1553n3, a12, 0);
                    this.j = a12 + i16;
                    ((H) this.f3061e).a(c1553n, a11, 0);
                    this.j += a11;
                    int i17 = (c1553n.f20176a[0] >> 1) & 63;
                    if (i17 != 19 && i17 != 20) {
                        i11 = 0;
                    }
                    this.f3062f = i11;
                } else {
                    if (i15 == 48) {
                        throw new UnsupportedOperationException(StubApp.getString2(2797));
                    }
                    if (i15 != 49) {
                        throw C1406C.b(String.format(StubApp.getString2(2796), Integer.valueOf(i15)), null);
                    }
                    byte[] bArr5 = c1553n.f20176a;
                    if (bArr5.length < 3) {
                        throw C1406C.b(StubApp.getString2(2795), null);
                    }
                    int i18 = bArr5[1] & 7;
                    byte b11 = bArr5[2];
                    int i19 = b11 & 63;
                    boolean z12 = (b11 & ByteCompanionObject.MIN_VALUE) > 0;
                    boolean z13 = (b11 & 64) > 0;
                    C1553n c1553n4 = (C1553n) obj;
                    if (z12) {
                        int i20 = this.j;
                        c1553n3.G(0);
                        int a13 = c1553n3.a();
                        H h4 = (H) this.f3061e;
                        h4.getClass();
                        h4.a(c1553n3, a13, 0);
                        this.j = a13 + i20;
                        byte[] bArr6 = c1553n.f20176a;
                        bArr6[1] = (byte) ((i19 << 1) & CertificateBody.profileType);
                        bArr6[2] = (byte) i18;
                        c1553n4.getClass();
                        c1553n4.E(bArr6.length, bArr6);
                        c1553n4.G(1);
                    } else {
                        int i21 = (this.f3064h + 1) % Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                        if (i3 != i21) {
                            int i22 = AbstractC1560u.f20190a;
                            Locale locale2 = Locale.US;
                            AbstractC1550k.w(StubApp.getString2(2794), AbstractC1482f.e(i21, string23, i3, string22, string2));
                        } else {
                            c1553n4.getClass();
                            c1553n4.E(bArr5.length, bArr5);
                            c1553n4.G(3);
                        }
                    }
                    int a14 = c1553n4.a();
                    ((H) this.f3061e).a(c1553n4, a14, 0);
                    this.j += a14;
                    if (z13) {
                        this.f3062f = (i19 == 19 || i19 == 20) ? 1 : 0;
                    }
                }
                if (z2) {
                    if (this.f3063g == -9223372036854775807L) {
                        this.f3063g = j;
                    }
                    ((H) this.f3061e).c(android.support.v4.media.session.b.B(this.f3065k, j, this.f3063g, 90000), this.f3062f, this.j, 0, null);
                    this.j = 0;
                }
                this.f3064h = i3;
                return;
        }
    }

    @Override // I0.i
    public void d(long j) {
        int i3 = this.f3057a;
    }

    @Override // I0.i
    public void e(q qVar, int i3) {
        switch (this.f3057a) {
            case 0:
                H w10 = qVar.w(i3, 2);
                this.f3061e = w10;
                int i10 = AbstractC1560u.f20190a;
                w10.d(((m) this.f3060d).f2588c);
                break;
            default:
                H w11 = qVar.w(i3, 2);
                this.f3061e = w11;
                w11.d(((m) this.f3060d).f2588c);
                break;
        }
    }

    public int g() {
        C1553n c1553n = (C1553n) this.f3059c;
        c1553n.G(0);
        int a3 = c1553n.a();
        H h2 = (H) this.f3061e;
        h2.getClass();
        h2.a(c1553n, a3, 0);
        return a3;
    }

    public e(m mVar, int i3) {
        this.f3057a = i3;
        switch (i3) {
            case 1:
                this.f3058b = new C1553n();
                this.f3059c = new C1553n(n.f20647a);
                this.f3060d = mVar;
                this.f3063g = -9223372036854775807L;
                this.f3064h = -1;
                break;
            default:
                this.f3059c = new C1553n(n.f20647a);
                this.f3060d = mVar;
                this.f3058b = new C1553n();
                this.f3063g = -9223372036854775807L;
                this.f3064h = -1;
                break;
        }
    }
}
