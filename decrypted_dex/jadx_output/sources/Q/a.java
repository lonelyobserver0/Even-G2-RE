package Q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f5659a;

    /* renamed from: b, reason: collision with root package name */
    public int f5660b;

    /* renamed from: c, reason: collision with root package name */
    public float f5661c;

    /* renamed from: d, reason: collision with root package name */
    public float f5662d;

    /* renamed from: e, reason: collision with root package name */
    public long f5663e;

    /* renamed from: f, reason: collision with root package name */
    public long f5664f;

    /* renamed from: g, reason: collision with root package name */
    public long f5665g;

    /* renamed from: h, reason: collision with root package name */
    public float f5666h;

    /* renamed from: i, reason: collision with root package name */
    public int f5667i;

    public final float a(long j) {
        if (j < this.f5663e) {
            return 0.0f;
        }
        long j3 = this.f5665g;
        if (j3 < 0 || j < j3) {
            return d.b((j - r0) / this.f5659a, 0.0f, 1.0f) * 0.5f;
        }
        float f10 = this.f5666h;
        return (d.b((j - j3) / this.f5667i, 0.0f, 1.0f) * f10) + (1.0f - f10);
    }
}
