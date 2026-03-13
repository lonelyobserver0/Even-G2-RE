package io.flutter.plugin.platform;

import android.view.Surface;
import android.view.SurfaceControl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Surface b(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder c() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction d() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction f(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }
}
