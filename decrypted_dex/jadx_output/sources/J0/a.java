package J0;

import l4.r;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends M0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3259d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3260e;

    public a(K0.b bVar, int i3) {
        super(i3, bVar.f3586k - 1);
        this.f3260e = bVar;
    }

    @Override // M0.m
    public final long b() {
        switch (this.f3259d) {
            case 0:
                a();
                return ((K0.b) this.f3260e).f3590o[(int) this.f4438c];
            default:
                a();
                return ((r) this.f3260e).f(this.f4438c);
        }
    }

    @Override // M0.m
    public final long g() {
        switch (this.f3259d) {
            case 0:
                return ((K0.b) this.f3260e).b((int) this.f4438c) + b();
            default:
                a();
                return ((r) this.f3260e).e(this.f4438c);
        }
    }

    public a(r rVar, long j, long j3) {
        super(j, j3);
        this.f3260e = rVar;
    }
}
