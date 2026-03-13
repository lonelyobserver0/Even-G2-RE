package V5;

import com.stub.StubApp;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f7746h = new a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f7747i = new a(1033, 1024, 1);
    public static final a j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f7748k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f7749l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f7750m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f7751n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f7752o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f7753a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7754b;

    /* renamed from: c, reason: collision with root package name */
    public final E0 f7755c;

    /* renamed from: d, reason: collision with root package name */
    public final E0 f7756d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7757e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7758f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7759g;

    static {
        a aVar = new a(67, 64, 1);
        j = aVar;
        f7748k = new a(19, 16, 1);
        f7749l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f7750m = aVar2;
        f7751n = aVar2;
        f7752o = aVar;
    }

    public a(int i3, int i10, int i11) {
        this.f7758f = i3;
        this.f7757e = i10;
        this.f7759g = i11;
        this.f7753a = new int[i10];
        this.f7754b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f7753a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i3) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f7754b[this.f7753a[i14]] = i14;
        }
        this.f7755c = new E0(this, new int[]{0});
        this.f7756d = new E0(this, new int[]{1});
    }

    public final int a(int i3) {
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        return this.f7753a[(this.f7757e - this.f7754b[i3]) - 1];
    }

    public final int b(int i3, int i10) {
        if (i3 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f7754b;
        return this.f7753a[(iArr[i3] + iArr[i10]) % (this.f7757e - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(6511));
        sb2.append(Integer.toHexString(this.f7758f));
        sb2.append(',');
        return com.mapbox.common.b.j(sb2, this.f7757e, ')');
    }
}
