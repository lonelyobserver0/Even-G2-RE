package Xa;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends SurfaceView implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8550a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8551b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f8552c;

    /* renamed from: d, reason: collision with root package name */
    public final C0365e f8553d;

    public l(AbstractActivityC0364d abstractActivityC0364d, boolean z2) {
        super(abstractActivityC0364d, null);
        this.f8550a = false;
        this.f8551b = false;
        k kVar = new k(this, 0);
        this.f8553d = new C0365e(this, 1);
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(kVar);
        setAlpha(0.0f);
    }

    public final void a() {
        if (this.f8552c == null || getHolder() == null) {
            throw new IllegalStateException(StubApp.getString2(7425));
        }
        io.flutter.embedding.engine.renderer.l lVar = this.f8552c;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.f8551b;
        if (!z2) {
            lVar.g();
        }
        lVar.f15059c = surface;
        FlutterJNI flutterJNI = lVar.f15057a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void attachToRenderer(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f8552c;
        if (lVar2 != null) {
            lVar2.g();
            this.f8552c.f15057a.removeIsDisplayingFlutterUiListener(this.f8553d);
        }
        this.f8552c = lVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void detachFromRenderer() {
        if (this.f8552c == null) {
            Log.w(StubApp.getString2(7426), StubApp.getString2(7427));
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f8552c;
            if (lVar == null) {
                throw new IllegalStateException(StubApp.getString2(7424));
            }
            lVar.g();
        }
        setAlpha(0.0f);
        this.f8552c.f15057a.removeIsDisplayingFlutterUiListener(this.f8553d);
        this.f8552c = null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f8552c;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void pause() {
        if (this.f8552c == null) {
            Log.w(StubApp.getString2(7426), StubApp.getString2(7428));
        } else {
            this.f8551b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void resume() {
        io.flutter.embedding.engine.renderer.l lVar = this.f8552c;
        if (lVar == null) {
            Log.w(StubApp.getString2(7426), StubApp.getString2(7429));
            return;
        }
        FlutterJNI flutterJNI = lVar.f15057a;
        C0365e c0365e = this.f8553d;
        flutterJNI.addIsDisplayingFlutterUiListener(c0365e);
        if (lVar.f15060d) {
            c0365e.b();
        }
        if (this.f8550a) {
            a();
        }
        this.f8551b = false;
    }
}
