package Xa;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.l f8564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0.o f8565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f8566c;

    public q(r rVar, io.flutter.embedding.engine.renderer.l lVar, B0.o oVar) {
        this.f8566c = rVar;
        this.f8564a = lVar;
        this.f8565b = oVar;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        j jVar;
        this.f8564a.f15057a.removeIsDisplayingFlutterUiListener(this);
        this.f8565b.run();
        r rVar = this.f8566c;
        if ((rVar.f8571d instanceof j) || (jVar = rVar.f8570c) == null) {
            return;
        }
        jVar.detachFromRenderer();
        j jVar2 = rVar.f8570c;
        if (jVar2 != null) {
            jVar2.closeImageReader();
            rVar.removeView(rVar.f8570c);
            rVar.f8570c = null;
        }
    }
}
