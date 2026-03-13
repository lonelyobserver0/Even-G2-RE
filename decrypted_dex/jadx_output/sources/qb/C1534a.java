package qb;

import Xa.k;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.plugin.platform.PlatformView;
import v0.C1830z;
import v0.InterfaceC1820o;

/* renamed from: qb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1534a implements PlatformView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20129a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f20130b;

    public C1534a(Context context, InterfaceC1820o interfaceC1820o) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f20130b = surfaceView;
        if (Build.VERSION.SDK_INT == 28) {
            surfaceView.getHolder().addCallback(new k(interfaceC1820o, 2));
            return;
        }
        C1830z c1830z = (C1830z) interfaceC1820o;
        c1830z.L();
        SurfaceHolder holder = surfaceView.getHolder();
        c1830z.L();
        if (holder == null) {
            c1830z.L();
            c1830z.D();
            c1830z.F(null);
            c1830z.B(0, 0);
            return;
        }
        c1830z.D();
        c1830z.h0 = true;
        c1830z.f21832Z = holder;
        holder.addCallback(c1830z.f21866y);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c1830z.F(null);
            c1830z.B(0, 0);
        } else {
            c1830z.F(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            c1830z.B(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private final void a() {
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final void dispose() {
        switch (this.f20129a) {
            case 0:
                ((SurfaceView) this.f20130b).getHolder().getSurface().release();
                break;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public final View getView() {
        switch (this.f20129a) {
            case 0:
                return (SurfaceView) this.f20130b;
            default:
                return this.f20130b;
        }
    }

    public C1534a(View view) {
        this.f20130b = view;
    }
}
