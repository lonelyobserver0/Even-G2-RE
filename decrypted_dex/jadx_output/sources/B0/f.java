package B0;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends M0.b {

    /* renamed from: d, reason: collision with root package name */
    public final List f417d;

    /* renamed from: e, reason: collision with root package name */
    public final long f418e;

    public f(long j, List list) {
        super(0L, list.size() - 1);
        this.f418e = j;
        this.f417d = list;
    }

    @Override // M0.m
    public final long b() {
        a();
        return this.f418e + ((C0.g) this.f417d.get((int) this.f4438c)).f932e;
    }

    @Override // M0.m
    public final long g() {
        a();
        C0.g gVar = (C0.g) this.f417d.get((int) this.f4438c);
        return this.f418e + gVar.f932e + gVar.f930c;
    }
}
