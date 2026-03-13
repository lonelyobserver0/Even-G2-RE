package q1;

import T0.G;
import T0.H;
import com.stub.StubApp;
import java.io.EOFException;
import kotlin.jvm.internal.LongCompanionObject;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import o0.InterfaceC1432g;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class n implements H {

    /* renamed from: a, reason: collision with root package name */
    public final H f19909a;

    /* renamed from: b, reason: collision with root package name */
    public final j f19910b;

    /* renamed from: g, reason: collision with root package name */
    public l f19915g;

    /* renamed from: h, reason: collision with root package name */
    public C1438m f19916h;

    /* renamed from: d, reason: collision with root package name */
    public int f19912d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19913e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f19914f = AbstractC1560u.f20195f;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f19911c = new C1553n();

    public n(H h2, j jVar) {
        this.f19909a = h2;
        this.f19910b = jVar;
    }

    @Override // T0.H
    public final void a(C1553n c1553n, int i3, int i10) {
        if (this.f19915g == null) {
            this.f19909a.a(c1553n, i3, i10);
            return;
        }
        e(i3);
        c1553n.f(this.f19913e, i3, this.f19914f);
        this.f19913e += i3;
    }

    @Override // T0.H
    public final int b(InterfaceC1432g interfaceC1432g, int i3, boolean z2) {
        if (this.f19915g == null) {
            return this.f19909a.b(interfaceC1432g, i3, z2);
        }
        e(i3);
        int read = interfaceC1432g.read(this.f19914f, this.f19913e, i3);
        if (read != -1) {
            this.f19913e += read;
            return read;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // T0.H
    public final void c(long j, int i3, int i10, int i11, G g10) {
        if (this.f19915g == null) {
            this.f19909a.c(j, i3, i10, i11, g10);
            return;
        }
        AbstractC1550k.b(StubApp.getString2(22191), g10 == null);
        int i12 = (this.f19913e - i11) - i10;
        this.f19915g.n(this.f19914f, i12, i10, k.f19903c, new m(this, j, i3));
        int i13 = i12 + i10;
        this.f19912d = i13;
        if (i13 == this.f19913e) {
            this.f19912d = 0;
            this.f19913e = 0;
        }
    }

    @Override // T0.H
    public final void d(C1438m c1438m) {
        c1438m.f18216n.getClass();
        String str = c1438m.f18216n;
        AbstractC1550k.c(AbstractC1405B.h(str) == 3);
        boolean equals = c1438m.equals(this.f19916h);
        j jVar = this.f19910b;
        if (!equals) {
            this.f19916h = c1438m;
            this.f19915g = jVar.c(c1438m) ? jVar.e(c1438m) : null;
        }
        l lVar = this.f19915g;
        H h2 = this.f19909a;
        if (lVar == null) {
            h2.d(c1438m);
            return;
        }
        C1437l a3 = c1438m.a();
        a3.f18177m = AbstractC1405B.m(StubApp.getString2(462));
        a3.j = str;
        a3.f18182r = LongCompanionObject.MAX_VALUE;
        a3.f18162H = jVar.b(c1438m);
        E1.a.w(a3, h2);
    }

    public final void e(int i3) {
        int length = this.f19914f.length;
        int i10 = this.f19913e;
        if (length - i10 >= i3) {
            return;
        }
        int i11 = i10 - this.f19912d;
        int max = Math.max(i11 * 2, i3 + i11);
        byte[] bArr = this.f19914f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f19912d, bArr2, 0, i11);
        this.f19912d = 0;
        this.f19913e = i11;
        this.f19914f = bArr2;
    }
}
