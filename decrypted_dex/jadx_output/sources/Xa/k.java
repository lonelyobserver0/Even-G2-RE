package Xa;

import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.journeyapps.barcodescanner.BarcodeView;
import com.stub.StubApp;
import v0.C1830z;
import v0.InterfaceC1820o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8549b;

    public /* synthetic */ k(Object obj, int i3) {
        this.f8548a = i3;
        this.f8549b = obj;
    }

    private final void a(SurfaceHolder surfaceHolder, int i3, int i10, int i11) {
    }

    private final void b(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i10, int i11) {
        Object obj = this.f8549b;
        switch (this.f8548a) {
            case 0:
                l lVar = (l) obj;
                io.flutter.embedding.engine.renderer.l lVar2 = lVar.f8552c;
                if (lVar2 == null || lVar.f8551b) {
                    return;
                }
                if (lVar2 == null) {
                    throw new IllegalStateException(StubApp.getString2(7423));
                }
                lVar2.f15057a.onSurfaceChanged(i10, i11);
                return;
            case 1:
                if (surfaceHolder == null) {
                    int i12 = m6.e.f17064D;
                    Log.e(StubApp.getString2(1958), StubApp.getString2(7422));
                    return;
                } else {
                    BarcodeView barcodeView = (BarcodeView) obj;
                    barcodeView.f17082r = new m6.q(i10, i11);
                    barcodeView.g();
                    return;
                }
            default:
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f8548a) {
            case 0:
                l lVar = (l) this.f8549b;
                lVar.f8550a = true;
                if ((lVar.f8552c == null || lVar.f8551b) ? false : true) {
                    lVar.a();
                    break;
                }
                break;
            case 1:
                break;
            default:
                Surface surface = surfaceHolder.getSurface();
                Object obj = (InterfaceC1820o) this.f8549b;
                ((C1830z) obj).G(surface);
                Mb.b bVar = (Mb.b) obj;
                bVar.getClass();
                bVar.j(((C1830z) bVar).q(), 1L);
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f8548a) {
            case 0:
                l lVar = (l) this.f8549b;
                boolean z2 = false;
                lVar.f8550a = false;
                io.flutter.embedding.engine.renderer.l lVar2 = lVar.f8552c;
                if (lVar2 != null && !lVar.f8551b) {
                    z2 = true;
                }
                if (z2) {
                    if (lVar2 == null) {
                        throw new IllegalStateException(StubApp.getString2(7424));
                    }
                    lVar2.g();
                    return;
                }
                return;
            case 1:
                ((BarcodeView) this.f8549b).f17082r = null;
                return;
            default:
                ((C1830z) ((InterfaceC1820o) this.f8549b)).G(null);
                return;
        }
    }
}
