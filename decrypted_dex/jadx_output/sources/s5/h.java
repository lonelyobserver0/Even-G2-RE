package s5;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements p5.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20771a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20772b = false;

    /* renamed from: c, reason: collision with root package name */
    public p5.c f20773c;

    /* renamed from: d, reason: collision with root package name */
    public final f f20774d;

    public h(f fVar) {
        this.f20774d = fVar;
    }

    @Override // p5.g
    public final p5.g add(String str) {
        if (this.f20771a) {
            throw new p5.b(StubApp.getString2(23134));
        }
        this.f20771a = true;
        this.f20774d.h(this.f20773c, str, this.f20772b);
        return this;
    }

    @Override // p5.g
    public final p5.g c(boolean z2) {
        if (this.f20771a) {
            throw new p5.b(StubApp.getString2(23134));
        }
        this.f20771a = true;
        this.f20774d.g(this.f20773c, z2 ? 1 : 0, this.f20772b);
        return this;
    }
}
