package T0;

/* renamed from: T0.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0315f implements B {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0317h f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7004b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7005c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7006d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7007e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7008f;

    public C0315f(InterfaceC0317h interfaceC0317h, long j, long j3, long j10, long j11, long j12) {
        this.f7003a = interfaceC0317h;
        this.f7004b = j;
        this.f7005c = j3;
        this.f7006d = j10;
        this.f7007e = j11;
        this.f7008f = j12;
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.B
    public final A i(long j) {
        C c10 = new C(j, C0316g.a(this.f7003a.a(j), 0L, this.f7005c, this.f7006d, this.f7007e, this.f7008f));
        return new A(c10, c10);
    }

    @Override // T0.B
    public final long k() {
        return this.f7004b;
    }
}
