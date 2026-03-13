package r0;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1543d implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f20144g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20145a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f20146b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f20147c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f20148d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f20149e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f20150f;

    public RunnableC1543d(Handler handler) {
        this.f20145a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20145a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f20150f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
