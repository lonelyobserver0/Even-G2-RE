package v0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: v0.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class SurfaceHolderCallbackC1827w implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1830z f21810a;

    public SurfaceHolderCallbackC1827w(C1830z c1830z) {
        this.f21810a = c1830z;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        C1830z c1830z = this.f21810a;
        c1830z.getClass();
        Surface surface = new Surface(surfaceTexture);
        c1830z.F(surface);
        c1830z.f21831Y = surface;
        c1830z.B(i3, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1830z c1830z = this.f21810a;
        c1830z.F(null);
        c1830z.B(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        this.f21810a.B(i3, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i10, int i11) {
        this.f21810a.B(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1830z c1830z = this.f21810a;
        if (c1830z.h0) {
            c1830z.F(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1830z c1830z = this.f21810a;
        if (c1830z.h0) {
            c1830z.F(null);
        }
        c1830z.B(0, 0);
    }
}
