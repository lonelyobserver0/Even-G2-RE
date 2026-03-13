package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0444t;
import io.flutter.view.q;
import java.util.Iterator;
import rb.C1585b;
import v0.C1830z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f15021a;

    public b(l lVar) {
        this.f15021a = lVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void d(InterfaceC0444t interfaceC0444t) {
        q qVar;
        boolean z2;
        q qVar2;
        Iterator it = this.f15021a.f15063g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            qVar = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (qVar != null) {
                z2 = flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy;
                if (z2) {
                    flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                    qVar2 = flutterRenderer$ImageReaderSurfaceProducer.callback;
                    C1585b c1585b = (C1585b) qVar2;
                    if (c1585b.f20550e) {
                        ((C1830z) c1585b.f19800d).G(c1585b.f19798b.getSurface());
                        c1585b.f20550e = false;
                    }
                }
            }
        }
    }
}
