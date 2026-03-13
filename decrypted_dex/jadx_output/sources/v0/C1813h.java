package v0;

/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1813h {

    /* renamed from: a, reason: collision with root package name */
    public final long f21748a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21749b;

    /* renamed from: c, reason: collision with root package name */
    public long f21750c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f21751d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f21753f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f21754g = -9223372036854775807L;
    public float j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f21756i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    public float f21757k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f21758l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f21752e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f21755h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f21759m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f21760n = -9223372036854775807L;

    public C1813h(long j, long j3) {
        this.f21748a = j;
        this.f21749b = j3;
    }

    public final void a() {
        long j;
        long j3 = this.f21750c;
        if (j3 != -9223372036854775807L) {
            j = this.f21751d;
            if (j == -9223372036854775807L) {
                long j10 = this.f21753f;
                if (j10 != -9223372036854775807L && j3 < j10) {
                    j3 = j10;
                }
                j = this.f21754g;
                if (j == -9223372036854775807L || j3 <= j) {
                    j = j3;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f21752e == j) {
            return;
        }
        this.f21752e = j;
        this.f21755h = j;
        this.f21759m = -9223372036854775807L;
        this.f21760n = -9223372036854775807L;
        this.f21758l = -9223372036854775807L;
    }
}
