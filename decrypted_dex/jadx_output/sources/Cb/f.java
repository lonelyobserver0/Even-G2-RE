package Cb;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Bb.a f1162a;

    /* renamed from: b, reason: collision with root package name */
    public final Ab.f f1163b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1164c;

    public f(Ab.f fVar, Bb.a aVar, boolean z2) {
        this.f1163b = fVar;
        this.f1162a = aVar;
        this.f1164c = z2;
    }

    @Override // Cb.e
    public final int b() {
        return 0;
    }

    @Override // Cb.e
    public final /* bridge */ /* synthetic */ Ab.h c() {
        return Ab.h.f279a;
    }

    @Override // Cb.e
    public final void e(Mb.a aVar) {
        aVar.g(new n(this.f1163b, this.f1162a, this.f1164c));
        aVar.h(this);
    }
}
