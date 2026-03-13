package Xa;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8556a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8557b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f8558c;

    /* renamed from: d, reason: collision with root package name */
    public Surface f8559d;

    public final void a() {
        if (this.f8558c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException(StubApp.getString2(7430));
        }
        Surface surface = this.f8559d;
        if (surface != null) {
            surface.release();
            this.f8559d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f8559d = surface2;
        io.flutter.embedding.engine.renderer.l lVar = this.f8558c;
        boolean z2 = this.f8557b;
        if (!z2) {
            lVar.g();
        }
        lVar.f15059c = surface2;
        FlutterJNI flutterJNI = lVar.f15057a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void attachToRenderer(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f8558c;
        if (lVar2 != null) {
            lVar2.g();
        }
        this.f8558c = lVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void detachFromRenderer() {
        if (this.f8558c == null) {
            Log.w(StubApp.getString2(7431), StubApp.getString2(7427));
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f8558c;
            if (lVar == null) {
                throw new IllegalStateException(StubApp.getString2(7424));
            }
            lVar.g();
            Surface surface = this.f8559d;
            if (surface != null) {
                surface.release();
                this.f8559d = null;
            }
        }
        this.f8558c = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f8558c;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void pause() {
        if (this.f8558c == null) {
            Log.w(StubApp.getString2(7431), StubApp.getString2(7428));
        } else {
            this.f8557b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void resume() {
        if (this.f8558c == null) {
            Log.w(StubApp.getString2(7431), StubApp.getString2(7429));
            return;
        }
        if (this.f8556a) {
            a();
        }
        this.f8557b = false;
    }

    public void setRenderSurface(Surface surface) {
        this.f8559d = surface;
    }
}
