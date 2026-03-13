package w1;

import android.text.Layout;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f22085a;

    /* renamed from: b, reason: collision with root package name */
    public int f22086b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22087c;

    /* renamed from: d, reason: collision with root package name */
    public int f22088d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22089e;

    /* renamed from: k, reason: collision with root package name */
    public float f22094k;

    /* renamed from: l, reason: collision with root package name */
    public String f22095l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f22098o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f22099p;

    /* renamed from: r, reason: collision with root package name */
    public b f22101r;

    /* renamed from: f, reason: collision with root package name */
    public int f22090f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f22091g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f22092h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f22093i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f22096m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f22097n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f22100q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f22102s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f22087c && gVar.f22087c) {
                this.f22086b = gVar.f22086b;
                this.f22087c = true;
            }
            if (this.f22092h == -1) {
                this.f22092h = gVar.f22092h;
            }
            if (this.f22093i == -1) {
                this.f22093i = gVar.f22093i;
            }
            if (this.f22085a == null && (str = gVar.f22085a) != null) {
                this.f22085a = str;
            }
            if (this.f22090f == -1) {
                this.f22090f = gVar.f22090f;
            }
            if (this.f22091g == -1) {
                this.f22091g = gVar.f22091g;
            }
            if (this.f22097n == -1) {
                this.f22097n = gVar.f22097n;
            }
            if (this.f22098o == null && (alignment2 = gVar.f22098o) != null) {
                this.f22098o = alignment2;
            }
            if (this.f22099p == null && (alignment = gVar.f22099p) != null) {
                this.f22099p = alignment;
            }
            if (this.f22100q == -1) {
                this.f22100q = gVar.f22100q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.f22094k = gVar.f22094k;
            }
            if (this.f22101r == null) {
                this.f22101r = gVar.f22101r;
            }
            if (this.f22102s == Float.MAX_VALUE) {
                this.f22102s = gVar.f22102s;
            }
            if (!this.f22089e && gVar.f22089e) {
                this.f22088d = gVar.f22088d;
                this.f22089e = true;
            }
            if (this.f22096m != -1 || (i3 = gVar.f22096m) == -1) {
                return;
            }
            this.f22096m = i3;
        }
    }
}
