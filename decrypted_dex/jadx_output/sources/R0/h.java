package R0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.stub.StubApp;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f5981d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f5982e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5983a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5984b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5985c;

    public h(g gVar, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f5984b = gVar;
        this.f5983a = z2;
    }

    public static synchronized boolean d(Context context) {
        boolean z2;
        int i3;
        synchronized (h.class) {
            try {
                if (!f5982e) {
                    int i10 = AbstractC1560u.f20190a;
                    if (i10 >= 24 && ((i10 >= 26 || (!StubApp.getString2("1759").equals(AbstractC1560u.f20192c) && !StubApp.getString2("5582").equals(AbstractC1560u.f20193d))) && (i10 >= 26 || context.getPackageManager().hasSystemFeature(StubApp.getString2("5583"))))) {
                        String string2 = StubApp.getString2("5584");
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains(string2)) {
                            String string22 = StubApp.getString2("5585");
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            i3 = eglQueryString2 != null && eglQueryString2.contains(string22) ? 1 : 2;
                            f5981d = i3;
                            f5982e = true;
                        }
                    }
                    i3 = 0;
                    f5981d = i3;
                    f5982e = true;
                }
                z2 = f5981d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f5984b) {
            try {
                if (!this.f5985c) {
                    g gVar = this.f5984b;
                    gVar.f5977b.getClass();
                    gVar.f5977b.sendEmptyMessage(2);
                    this.f5985c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
