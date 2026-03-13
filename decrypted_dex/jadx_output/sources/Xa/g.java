package Xa;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.AbstractC1748a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0364d f8535a;

    /* renamed from: b, reason: collision with root package name */
    public Ya.c f8536b;

    /* renamed from: c, reason: collision with root package name */
    public r f8537c;

    /* renamed from: d, reason: collision with root package name */
    public PlatformPlugin f8538d;

    /* renamed from: e, reason: collision with root package name */
    public f f8539e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8540f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8541g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8543i;
    public Integer j;

    /* renamed from: k, reason: collision with root package name */
    public final C0365e f8544k = new C0365e(this, 0);

    /* renamed from: h, reason: collision with root package name */
    public boolean f8542h = false;

    public g(AbstractActivityC0364d abstractActivityC0364d) {
        this.f8535a = abstractActivityC0364d;
    }

    public final void a(Mb.a aVar) {
        String b2 = this.f8535a.b();
        if (b2 == null || b2.isEmpty()) {
            b2 = (String) ((D5.r) ((bb.d) Q2.g.H().f5711b).f10745d).f1449c;
        }
        Za.b bVar = new Za.b(b2, this.f8535a.e());
        String g10 = this.f8535a.g();
        if (g10 == null) {
            AbstractActivityC0364d abstractActivityC0364d = this.f8535a;
            abstractActivityC0364d.getClass();
            g10 = d(abstractActivityC0364d.getIntent());
            if (g10 == null) {
                g10 = StubApp.getString2(601);
            }
        }
        aVar.f4725d = bVar;
        aVar.f4726e = g10;
        aVar.f4727f = (List) this.f8535a.getIntent().getSerializableExtra(StubApp.getString2(7388));
    }

    public final void b() {
        if (this.f8535a.j()) {
            throw new AssertionError(StubApp.getString2(7398) + this.f8535a + StubApp.getString2(7399));
        }
        AbstractActivityC0364d abstractActivityC0364d = this.f8535a;
        abstractActivityC0364d.getClass();
        Log.w(StubApp.getString2(7342), StubApp.getString2(7341) + abstractActivityC0364d + StubApp.getString2(7396) + abstractActivityC0364d.f8528b.f8536b + StubApp.getString2(7397));
        g gVar = abstractActivityC0364d.f8528b;
        if (gVar != null) {
            gVar.e();
            abstractActivityC0364d.f8528b.f();
        }
    }

    public final void c() {
        if (this.f8535a == null) {
            throw new IllegalStateException(StubApp.getString2(7400));
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        Bundle h2;
        AbstractActivityC0364d abstractActivityC0364d = this.f8535a;
        abstractActivityC0364d.getClass();
        try {
            h2 = abstractActivityC0364d.h();
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (h2 != null) {
            String string2 = StubApp.getString2("7401");
            if (h2.containsKey(string2)) {
                z2 = h2.getBoolean(string2);
                if (!z2 && (data = intent.getData()) != null) {
                    return data.toString();
                }
            }
        }
        z2 = true;
        return !z2 ? null : null;
    }

    public final void e() {
        c();
        if (this.f8539e != null) {
            this.f8537c.getViewTreeObserver().removeOnPreDrawListener(this.f8539e);
            this.f8539e = null;
        }
        r rVar = this.f8537c;
        if (rVar != null) {
            rVar.a();
            r rVar2 = this.f8537c;
            rVar2.f8573f.remove(this.f8544k);
        }
    }

    public final void f() {
        if (this.f8543i) {
            c();
            this.f8535a.getClass();
            this.f8535a.getClass();
            AbstractActivityC0364d abstractActivityC0364d = this.f8535a;
            abstractActivityC0364d.getClass();
            if (abstractActivityC0364d.isChangingConfigurations()) {
                K2.c cVar = this.f8536b.f8864d;
                if (cVar.e()) {
                    AbstractC1748a.d(StubApp.getString2(7402));
                    try {
                        cVar.f3638b = true;
                        Iterator it = ((HashMap) cVar.f3642f).values().iterator();
                        while (it.hasNext()) {
                            ((eb.a) it.next()).onDetachedFromActivityForConfigChanges();
                        }
                        Ya.c cVar2 = (Ya.c) cVar.f3640d;
                        cVar2.f8877r.detach();
                        cVar2.f8878s.detach();
                        cVar.f3643g = null;
                        cVar.f3644h = null;
                        Trace.endSection();
                    } finally {
                    }
                } else {
                    Log.e(StubApp.getString2(3243), StubApp.getString2(3246));
                }
            } else {
                this.f8536b.f8864d.c();
            }
            PlatformPlugin platformPlugin = this.f8538d;
            if (platformPlugin != null) {
                platformPlugin.destroy();
                this.f8538d = null;
            }
            this.f8535a.getClass();
            Ya.c cVar3 = this.f8536b;
            if (cVar3 != null) {
                H0.l lVar = cVar3.f8867g;
                lVar.e(1, lVar.f2584c);
            }
            if (this.f8535a.j()) {
                Ya.c cVar4 = this.f8536b;
                Iterator it2 = cVar4.f8879t.iterator();
                while (it2.hasNext()) {
                    ((Ya.b) it2.next()).a();
                }
                K2.c cVar5 = cVar4.f8864d;
                cVar5.d();
                HashMap hashMap = (HashMap) cVar5.f3639c;
                Iterator it3 = new HashSet(hashMap.keySet()).iterator();
                while (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    InterfaceC0825b interfaceC0825b = (InterfaceC0825b) hashMap.get(cls);
                    if (interfaceC0825b != null) {
                        AbstractC1748a.d(StubApp.getString2(7403).concat(cls.getSimpleName()));
                        try {
                            if (interfaceC0825b instanceof eb.a) {
                                if (cVar5.e()) {
                                    ((eb.a) interfaceC0825b).onDetachedFromActivity();
                                }
                                ((HashMap) cVar5.f3642f).remove(cls);
                            }
                            interfaceC0825b.onDetachedFromEngine((C0824a) cVar5.f3641e);
                            hashMap.remove(cls);
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
                hashMap.clear();
                cVar4.f8877r.onDetachedFromJNI();
                cVar4.f8878s.onDetachedFromJNI();
                cVar4.f8863c.f9163a.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar4.f8861a;
                flutterJNI.removeEngineLifecycleListener(cVar4.f8881v);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                Q2.g.H().getClass();
                Ya.c.f8860x.remove(Long.valueOf(cVar4.f8880u));
                if (this.f8535a.d() != null) {
                    if (s2.d.f20710c == null) {
                        s2.d.f20710c = new s2.d(25);
                    }
                    s2.d dVar = s2.d.f20710c;
                    ((HashMap) dVar.f20712b).remove(this.f8535a.d());
                }
                this.f8536b = null;
            }
            this.f8543i = false;
        }
    }
}
