package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.E;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import io.flutter.view.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l implements r {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f15057a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f15059c;

    /* renamed from: h, reason: collision with root package name */
    public final a f15064h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f15058b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f15060d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f15061e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f15062f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15063g = new ArrayList();

    public l(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f15064h = aVar;
        this.f15057a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        E.j.f9871f.a(new b(this));
    }

    public final void a(p pVar) {
        HashSet hashSet = this.f15062f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((p) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(pVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f15058b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f15057a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c(int i3) {
        if (Build.VERSION.SDK_INT < 29) {
            j d8 = d();
            return new o(d8.f15035a, this.f15061e, this.f15057a, d8);
        }
        long andIncrement = this.f15058b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z2 = i3 == 2;
        this.f15057a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z2);
        if (z2) {
            a(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f15063g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final j d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f15058b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        j jVar = new j(this, andIncrement, surfaceTexture);
        this.f15057a.registerTexture(jVar.f15035a, jVar.f15036b);
        a(jVar);
        return jVar;
    }

    public final void e(int i3) {
        Iterator it = this.f15062f.iterator();
        while (it.hasNext()) {
            p pVar = (p) ((WeakReference) it.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public final void f(p pVar) {
        HashSet hashSet = this.f15062f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == pVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f15059c != null) {
            this.f15057a.onSurfaceDestroyed();
            if (this.f15060d) {
                this.f15064h.a();
            }
            this.f15060d = false;
            this.f15059c = null;
        }
    }
}
