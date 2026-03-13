package R0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.stub.StubApp;
import java.util.Locale;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1544e;
import r0.RunnableC1543d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public RunnableC1543d f5976a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f5977b;

    /* renamed from: c, reason: collision with root package name */
    public Error f5978c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f5979d;

    /* renamed from: e, reason: collision with root package name */
    public h f5980e;

    public final void a(int i3) {
        EGLSurface eglCreatePbufferSurface;
        this.f5976a.getClass();
        RunnableC1543d runnableC1543d = this.f5976a;
        runnableC1543d.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1550k.d(StubApp.getString2(5571), eglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC1550k.d(StubApp.getString2(5572), EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        runnableC1543d.f20147c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC1543d.f20144g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z2 = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i10 = AbstractC1560u.f20190a;
        AbstractC1550k.d(String.format(Locale.US, StubApp.getString2(5573), objArr), z2);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(runnableC1543d.f20147c, eGLConfig, EGL14.EGL_NO_CONTEXT, i3 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1550k.d(StubApp.getString2(5574), eglCreateContext != null);
        runnableC1543d.f20148d = eglCreateContext;
        EGLDisplay eGLDisplay = runnableC1543d.f20147c;
        if (i3 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i3 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1550k.d(StubApp.getString2(5575), eglCreatePbufferSurface != null);
        }
        AbstractC1550k.d(StubApp.getString2(5576), EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        runnableC1543d.f20149e = eglCreatePbufferSurface;
        int[] iArr3 = runnableC1543d.f20146b;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = StubApp.getString2(5577) + Integer.toHexString(glGetError);
            }
            sb2.append(StubApp.getString2(5578));
            sb2.append(gluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new C1544e(sb2.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC1543d.f20150f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC1543d);
        SurfaceTexture surfaceTexture2 = this.f5976a.f20150f;
        surfaceTexture2.getClass();
        this.f5980e = new h(this, surfaceTexture2, i3 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f5976a.getClass();
        RunnableC1543d runnableC1543d = this.f5976a;
        runnableC1543d.f20145a.removeCallbacks(runnableC1543d);
        try {
            SurfaceTexture surfaceTexture = runnableC1543d.f20150f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC1543d.f20146b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC1543d.f20147c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC1543d.f20147c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC1543d.f20149e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC1543d.f20147c, runnableC1543d.f20149e);
            }
            EGLContext eGLContext = runnableC1543d.f20148d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC1543d.f20147c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC1543d.f20147c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC1543d.f20147c);
            }
            runnableC1543d.f20147c = null;
            runnableC1543d.f20148d = null;
            runnableC1543d.f20149e = null;
            runnableC1543d.f20150f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        try {
            if (i3 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e10) {
                    AbstractC1550k.l(StubApp.getString2("5579"), StubApp.getString2("5581"), e10);
                    this.f5978c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    AbstractC1550k.l(StubApp.getString2("5579"), StubApp.getString2("5581"), e11);
                    this.f5979d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (C1544e e12) {
                    AbstractC1550k.l(StubApp.getString2("5579"), StubApp.getString2("5581"), e12);
                    this.f5979d = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i3 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC1550k.l(StubApp.getString2("5579"), StubApp.getString2("5580"), th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
