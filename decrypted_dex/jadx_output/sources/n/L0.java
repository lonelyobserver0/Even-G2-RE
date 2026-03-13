package n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public int f17425a;

    /* renamed from: b, reason: collision with root package name */
    public int f17426b;

    /* renamed from: c, reason: collision with root package name */
    public int f17427c;

    /* renamed from: d, reason: collision with root package name */
    public int f17428d;

    /* renamed from: e, reason: collision with root package name */
    public int f17429e;

    /* renamed from: f, reason: collision with root package name */
    public int f17430f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17431g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17432h;

    public final void a(int i3, int i10) {
        this.f17427c = i3;
        this.f17428d = i10;
        this.f17432h = true;
        if (this.f17431g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f17425a = i10;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f17426b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f17425a = i3;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f17426b = i10;
        }
    }
}
