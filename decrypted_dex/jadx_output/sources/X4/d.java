package X4;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f8391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A0.c f8392d;

    public /* synthetic */ d(f fVar, Runnable runnable, A0.c cVar, int i3) {
        this.f8389a = i3;
        this.f8390b = fVar;
        this.f8391c = runnable;
        this.f8392d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8389a) {
            case 0:
                f fVar = this.f8390b;
                final A0.c cVar = this.f8392d;
                final Runnable runnable = this.f8391c;
                final int i3 = 0;
                fVar.f8396a.execute(new Runnable() { // from class: X4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) cVar.f29a).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) cVar.f29a).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.f29a;
                                try {
                                    runnable2.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                f fVar2 = this.f8390b;
                final A0.c cVar2 = this.f8392d;
                final Runnable runnable2 = this.f8391c;
                final int i10 = 2;
                fVar2.f8396a.execute(new Runnable() { // from class: X4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) cVar2.f29a).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) cVar2.f29a).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) cVar2.f29a;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                f fVar3 = this.f8390b;
                final A0.c cVar3 = this.f8392d;
                final Runnable runnable3 = this.f8391c;
                final int i11 = 1;
                fVar3.f8396a.execute(new Runnable() { // from class: X4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) cVar3.f29a).k(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) cVar3.f29a).k(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) cVar3.f29a;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.k(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
