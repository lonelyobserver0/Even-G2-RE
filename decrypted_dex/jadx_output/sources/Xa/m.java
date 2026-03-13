package Xa;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f8555b;

    public /* synthetic */ m(View view, int i3) {
        this.f8554a = i3;
        this.f8555b = view;
    }

    private final void a(SurfaceTexture surfaceTexture) {
    }

    private final void b(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.f8554a) {
            case 0:
                n nVar = (n) this.f8555b;
                nVar.f8556a = true;
                if ((nVar.f8558c == null || nVar.f8557b) ? false : true) {
                    nVar.a();
                    break;
                }
                break;
            default:
                onSurfaceTextureSizeChanged(surfaceTexture, i3, i10);
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f8554a) {
            case 0:
                n nVar = (n) this.f8555b;
                boolean z2 = false;
                nVar.f8556a = false;
                io.flutter.embedding.engine.renderer.l lVar = nVar.f8558c;
                if (lVar != null && !nVar.f8557b) {
                    z2 = true;
                }
                if (z2) {
                    if (lVar == null) {
                        throw new IllegalStateException(StubApp.getString2(7424));
                    }
                    lVar.g();
                    Surface surface = nVar.f8559d;
                    if (surface != null) {
                        surface.release();
                        nVar.f8559d = null;
                    }
                }
                Surface surface2 = nVar.f8559d;
                if (surface2 != null) {
                    surface2.release();
                    nVar.f8559d = null;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        switch (this.f8554a) {
            case 0:
                n nVar = (n) this.f8555b;
                io.flutter.embedding.engine.renderer.l lVar = nVar.f8558c;
                if (lVar == null || nVar.f8557b) {
                    return;
                }
                if (lVar == null) {
                    throw new IllegalStateException(StubApp.getString2(7423));
                }
                lVar.f15057a.onSurfaceChanged(i3, i10);
                return;
            default:
                m6.q qVar = new m6.q(i3, i10);
                m6.e eVar = (m6.e) this.f8555b;
                eVar.f17082r = qVar;
                eVar.g();
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i3 = this.f8554a;
    }
}
