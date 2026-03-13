package Xa;

import android.os.Build;
import java.util.Iterator;

/* renamed from: Xa.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0365e implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8532b;

    public /* synthetic */ C0365e(Object obj, int i3) {
        this.f8531a = i3;
        this.f8532b = obj;
    }

    private final void c() {
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        switch (this.f8531a) {
            case 0:
                g gVar = (g) this.f8532b;
                gVar.f8535a.getClass();
                gVar.f8541g = false;
                break;
            case 1:
                break;
            default:
                r rVar = (r) this.f8532b;
                rVar.f8574g = false;
                Iterator it = rVar.f8573f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        switch (this.f8531a) {
            case 0:
                g gVar = (g) this.f8532b;
                AbstractActivityC0364d abstractActivityC0364d = gVar.f8535a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0364d.reportFullyDrawn();
                } else {
                    abstractActivityC0364d.getClass();
                }
                gVar.f8541g = true;
                gVar.f8542h = true;
                break;
            case 1:
                l lVar = (l) this.f8532b;
                lVar.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.l lVar2 = lVar.f8552c;
                if (lVar2 != null) {
                    lVar2.f15057a.removeIsDisplayingFlutterUiListener(this);
                    break;
                }
                break;
            default:
                r rVar = (r) this.f8532b;
                rVar.f8574g = true;
                Iterator it = rVar.f8573f.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).b();
                }
                break;
        }
    }
}
