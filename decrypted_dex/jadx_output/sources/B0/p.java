package B0;

import T0.G;
import T0.H;
import com.stub.StubApp;
import d1.C0797b;
import e1.C0836a;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import o0.InterfaceC1432g;
import r0.AbstractC1550k;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p implements H {

    /* renamed from: f, reason: collision with root package name */
    public static final C1438m f510f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1438m f511g;

    /* renamed from: a, reason: collision with root package name */
    public final H f512a;

    /* renamed from: b, reason: collision with root package name */
    public final C1438m f513b;

    /* renamed from: c, reason: collision with root package name */
    public C1438m f514c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f515d;

    /* renamed from: e, reason: collision with root package name */
    public int f516e;

    static {
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(474));
        f510f = new C1438m(c1437l);
        C1437l c1437l2 = new C1437l();
        c1437l2.f18177m = AbstractC1405B.m(StubApp.getString2(494));
        f511g = new C1438m(c1437l2);
    }

    public p(H h2, int i3) {
        this.f512a = h2;
        if (i3 == 1) {
            this.f513b = f510f;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException(i2.u.p(i3, StubApp.getString2(495)));
            }
            this.f513b = f511g;
        }
        this.f515d = new byte[0];
        this.f516e = 0;
    }

    @Override // T0.H
    public final void a(C1553n c1553n, int i3, int i10) {
        int i11 = this.f516e + i3;
        byte[] bArr = this.f515d;
        if (bArr.length < i11) {
            this.f515d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        c1553n.f(this.f516e, i3, this.f515d);
        this.f516e += i3;
    }

    @Override // T0.H
    public final int b(InterfaceC1432g interfaceC1432g, int i3, boolean z2) {
        int i10 = this.f516e + i3;
        byte[] bArr = this.f515d;
        if (bArr.length < i10) {
            this.f515d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = interfaceC1432g.read(this.f515d, this.f516e, i3);
        if (read != -1) {
            this.f516e += read;
            return read;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // T0.H
    public final void c(long j, int i3, int i10, int i11, G g10) {
        this.f514c.getClass();
        int i12 = this.f516e - i11;
        C1553n c1553n = new C1553n(Arrays.copyOfRange(this.f515d, i12 - i10, i12));
        byte[] bArr = this.f515d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.f516e = i11;
        String str = this.f514c.f18216n;
        C1438m c1438m = this.f513b;
        if (!Objects.equals(str, c1438m.f18216n)) {
            boolean equals = StubApp.getString2(494).equals(this.f514c.f18216n);
            String string2 = StubApp.getString2(496);
            if (!equals) {
                AbstractC1550k.w(string2, StubApp.getString2(499) + this.f514c.f18216n);
                return;
            }
            C0836a z2 = C0797b.z(c1553n);
            C1438m a3 = z2.a();
            String str2 = c1438m.f18216n;
            if (a3 == null || !Objects.equals(str2, a3.f18216n)) {
                AbstractC1550k.w(string2, StubApp.getString2(497) + str2 + StubApp.getString2(498) + z2.a());
                return;
            }
            byte[] c10 = z2.c();
            c10.getClass();
            c1553n = new C1553n(c10);
        }
        int a9 = c1553n.a();
        H h2 = this.f512a;
        h2.a(c1553n, a9, 0);
        h2.c(j, i3, a9, 0, g10);
    }

    @Override // T0.H
    public final void d(C1438m c1438m) {
        this.f514c = c1438m;
        this.f512a.d(this.f513b);
    }
}
