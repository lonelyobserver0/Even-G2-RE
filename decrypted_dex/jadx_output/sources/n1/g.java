package n1;

import T0.H;
import kotlin.UByte;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final H f17658a;

    /* renamed from: d, reason: collision with root package name */
    public r f17661d;

    /* renamed from: e, reason: collision with root package name */
    public d f17662e;

    /* renamed from: f, reason: collision with root package name */
    public int f17663f;

    /* renamed from: g, reason: collision with root package name */
    public int f17664g;

    /* renamed from: h, reason: collision with root package name */
    public int f17665h;

    /* renamed from: i, reason: collision with root package name */
    public int f17666i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17668l;

    /* renamed from: b, reason: collision with root package name */
    public final q f17659b = new q();

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f17660c = new C1553n();
    public final C1553n j = new C1553n(1);

    /* renamed from: k, reason: collision with root package name */
    public final C1553n f17667k = new C1553n();

    public g(H h2, r rVar, d dVar) {
        this.f17658a = h2;
        this.f17661d = rVar;
        this.f17662e = dVar;
        this.f17661d = rVar;
        this.f17662e = dVar;
        h2.d(rVar.f17787a.f17761g);
        e();
    }

    public final int a() {
        int i3 = !this.f17668l ? this.f17661d.f17793g[this.f17663f] : this.f17659b.j[this.f17663f] ? 1 : 0;
        return b() != null ? i3 | 1073741824 : i3;
    }

    public final p b() {
        if (this.f17668l) {
            q qVar = this.f17659b;
            d dVar = qVar.f17771a;
            int i3 = AbstractC1560u.f20190a;
            int i10 = dVar.f17650a;
            p pVar = qVar.f17782m;
            if (pVar == null) {
                p[] pVarArr = this.f17661d.f17787a.f17765l;
                pVar = pVarArr == null ? null : pVarArr[i10];
            }
            if (pVar != null && pVar.f17766a) {
                return pVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f17663f++;
        if (!this.f17668l) {
            return false;
        }
        int i3 = this.f17664g + 1;
        this.f17664g = i3;
        int[] iArr = this.f17659b.f17777g;
        int i10 = this.f17665h;
        if (i3 != iArr[i10]) {
            return true;
        }
        this.f17665h = i10 + 1;
        this.f17664g = 0;
        return false;
    }

    public final int d(int i3, int i10) {
        C1553n c1553n;
        p b2 = b();
        if (b2 == null) {
            return 0;
        }
        q qVar = this.f17659b;
        int i11 = b2.f17769d;
        if (i11 != 0) {
            c1553n = qVar.f17783n;
        } else {
            int i12 = AbstractC1560u.f20190a;
            byte[] bArr = b2.f17770e;
            int length = bArr.length;
            C1553n c1553n2 = this.f17667k;
            c1553n2.E(length, bArr);
            i11 = bArr.length;
            c1553n = c1553n2;
        }
        boolean z2 = qVar.f17780k && qVar.f17781l[this.f17663f];
        boolean z10 = z2 || i10 != 0;
        C1553n c1553n3 = this.j;
        c1553n3.f20176a[0] = (byte) ((z10 ? 128 : 0) | i11);
        c1553n3.G(0);
        H h2 = this.f17658a;
        h2.a(c1553n3, 1, 1);
        h2.a(c1553n, i11, 1);
        if (!z10) {
            return i11 + 1;
        }
        C1553n c1553n4 = this.f17660c;
        if (!z2) {
            c1553n4.D(8);
            byte[] bArr2 = c1553n4.f20176a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i10 & 255);
            bArr2[4] = (byte) ((i3 >> 24) & 255);
            bArr2[5] = (byte) ((i3 >> 16) & 255);
            bArr2[6] = (byte) ((i3 >> 8) & 255);
            bArr2[7] = (byte) (i3 & 255);
            h2.a(c1553n4, 8, 1);
            return i11 + 9;
        }
        C1553n c1553n5 = qVar.f17783n;
        int A4 = c1553n5.A();
        c1553n5.H(-2);
        int i13 = (A4 * 6) + 2;
        if (i10 != 0) {
            c1553n4.D(i13);
            byte[] bArr3 = c1553n4.f20176a;
            c1553n5.f(0, i13, bArr3);
            int i14 = (((bArr3[2] & UByte.MAX_VALUE) << 8) | (bArr3[3] & UByte.MAX_VALUE)) + i10;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
        } else {
            c1553n4 = c1553n5;
        }
        h2.a(c1553n4, i13, 1);
        return i11 + 1 + i13;
    }

    public final void e() {
        q qVar = this.f17659b;
        qVar.f17774d = 0;
        qVar.f17785p = 0L;
        qVar.f17786q = false;
        qVar.f17780k = false;
        qVar.f17784o = false;
        qVar.f17782m = null;
        this.f17663f = 0;
        this.f17665h = 0;
        this.f17664g = 0;
        this.f17666i = 0;
        this.f17668l = false;
    }
}
