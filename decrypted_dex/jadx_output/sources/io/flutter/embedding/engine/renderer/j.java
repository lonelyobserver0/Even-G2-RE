package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.p;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j implements TextureRegistry$SurfaceTextureEntry, p {

    /* renamed from: a, reason: collision with root package name */
    public final long f15035a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f15036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15037c;

    /* renamed from: d, reason: collision with root package name */
    public p f15038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f15039e;

    public j(l lVar, long j, SurfaceTexture surfaceTexture) {
        this.f15039e = lVar;
        this.f15035a = j;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new e(this, 1));
        this.f15036b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.i
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                j jVar = j.this;
                if (jVar.f15037c) {
                    return;
                }
                l lVar2 = jVar.f15039e;
                if (lVar2.f15057a.isAttached()) {
                    jVar.f15036b.markDirty();
                    lVar2.f15057a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f15037c) {
                return;
            }
            l lVar = this.f15039e;
            lVar.f15061e.post(new Vc.i(this.f15035a, lVar.f15057a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f15035a;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i3) {
        p pVar = this.f15038d;
        if (pVar != null) {
            pVar.onTrimMemory(i3);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f15037c) {
            return;
        }
        this.f15036b.release();
        l lVar = this.f15039e;
        lVar.f15057a.unregisterTexture(this.f15035a);
        lVar.f(this);
        this.f15037c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.o oVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(p pVar) {
        this.f15038d = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f15036b.surfaceTexture();
    }
}
