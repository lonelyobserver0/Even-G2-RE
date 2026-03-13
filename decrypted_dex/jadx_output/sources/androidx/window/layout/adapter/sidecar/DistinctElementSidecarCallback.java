package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import f2.AbstractC0872a;
import f2.f;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f10347b;

    /* renamed from: d, reason: collision with root package name */
    public final f f10349d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f10350e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10346a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f10348c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f10349d = fVar;
        this.f10350e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x001f, code lost:
    
        if (f2.AbstractC0872a.b(r2) == f2.AbstractC0872a.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.f10346a
            monitor-enter(r0)
            f2.f r1 = r3.f10349d     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f10347b     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L21
        L14:
            if (r2 != 0) goto L17
            goto L25
        L17:
            int r1 = f2.AbstractC0872a.b(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = f2.AbstractC0872a.b(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r4 = move-exception
            goto L2e
        L25:
            r3.f10347b = r4     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.f10350e     // Catch: java.lang.Throwable -> L23
            r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b2;
        synchronized (this.f10346a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f10348c.get(iBinder);
                this.f10349d.getClass();
                if (Intrinsics.areEqual(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b2 = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b2 = f.b(AbstractC0872a.c(sidecarWindowLayoutInfo2), AbstractC0872a.c(sidecarWindowLayoutInfo));
                    }
                    b2 = false;
                }
                if (b2) {
                    return;
                }
                this.f10348c.put(iBinder, sidecarWindowLayoutInfo);
                this.f10350e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
