package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f15065a;

    /* renamed from: b, reason: collision with root package name */
    public int f15066b;

    /* renamed from: c, reason: collision with root package name */
    public int f15067c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15068d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f15069e;

    /* renamed from: f, reason: collision with root package name */
    public final j f15070f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f15071g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f15072h;

    public o(long j, Handler handler, FlutterJNI flutterJNI, j jVar) {
        this.f15065a = j;
        this.f15071g = handler;
        this.f15072h = flutterJNI;
        this.f15070f = jVar;
    }

    public final void finalize() {
        try {
            if (this.f15068d) {
                return;
            }
            release();
            this.f15071g.post(new Vc.i(this.f15065a, this.f15072h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f15067c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f15069e == null) {
            this.f15069e = new Surface(this.f15070f.f15036b.surfaceTexture());
        }
        return this.f15069e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f15070f.f15036b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f15066b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f15065a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f15070f.release();
        this.f15069e.release();
        this.f15069e = null;
        this.f15068d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f15072h.markTextureFrameAvailable(this.f15065a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i3, int i10) {
        this.f15066b = i3;
        this.f15067c = i10;
        this.f15070f.f15036b.surfaceTexture().setDefaultBufferSize(i3, i10);
    }
}
