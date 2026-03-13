package R4;

import H5.C0082o;
import H5.d0;
import R3.ComponentCallbacks2C0235d;
import S3.D;
import W4.m;
import Z9.C;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t.C1691d;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f6191k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final C1692e f6192l = new C1692e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f6193a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6194b;

    /* renamed from: c, reason: collision with root package name */
    public final j f6195c;

    /* renamed from: d, reason: collision with root package name */
    public final W4.f f6196d;

    /* renamed from: g, reason: collision with root package name */
    public final m f6199g;

    /* renamed from: h, reason: collision with root package name */
    public final w5.b f6200h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f6197e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f6198f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f6201i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public h(j jVar, Context context, String str) {
        ?? arrayList;
        int i3 = 1;
        int i10 = 0;
        this.f6193a = context;
        D.e(str);
        this.f6194b = str;
        this.f6195c = jVar;
        a aVar = FirebaseInitProvider.f12069a;
        Trace.beginSection(StubApp.getString2(1188));
        String string2 = StubApp.getString2(5664);
        Trace.beginSection(string2);
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w(string2, StubApp.getString2("5665"));
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w(string2, ComponentDiscoveryService.class + StubApp.getString2("5666"));
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w(string2, StubApp.getString2(5667));
        }
        if (bundle == null) {
            Log.w(string2, StubApp.getString2(5668));
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if (StubApp.getString2(5669).equals(bundle.get(str2)) && str2.startsWith(StubApp.getString2(5670))) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new W4.d((String) it.next(), i10));
        }
        Trace.endSection();
        Trace.beginSection(StubApp.getString2(5671));
        X4.j jVar2 = X4.j.f8405a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new W4.d(new FirebaseCommonRegistrar(), i3));
        arrayList3.add(new W4.d(new ExecutorsRegistrar(), i3));
        arrayList4.add(W4.b.c(context, Context.class, new Class[0]));
        arrayList4.add(W4.b.c(this, h.class, new Class[0]));
        arrayList4.add(W4.b.c(jVar, j.class, new Class[0]));
        C2.i iVar = new C2.i();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f12070b.get()) {
            arrayList4.add(W4.b.c(aVar, a.class, new Class[0]));
        }
        W4.f fVar = new W4.f(arrayList3, arrayList4, iVar);
        this.f6196d = fVar;
        Trace.endSection();
        this.f6199g = new m(new d(0, this, context));
        this.f6200h = fVar.c(u5.c.class);
        e eVar = new e(this);
        a();
        if (this.f6197e.get()) {
            ComponentCallbacks2C0235d.f6114e.f6115a.get();
        }
        this.f6201i.add(eVar);
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f6191k) {
            try {
                Iterator it = ((C1691d) f6192l.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    hVar.a();
                    arrayList.add(hVar.f6194b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static h e() {
        h hVar;
        String string2 = StubApp.getString2(5672);
        synchronized (f6191k) {
            try {
                hVar = (h) f6192l.get(StubApp.getString2("429"));
                if (hVar == null) {
                    throw new IllegalStateException(string2 + W3.b.a() + StubApp.getString2("5673"));
                }
                ((u5.c) hVar.f6200h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static h f(String str) {
        h hVar;
        String str2;
        String string2 = StubApp.getString2(5674);
        String string22 = StubApp.getString2(5675);
        synchronized (f6191k) {
            try {
                hVar = (h) f6192l.get(str.trim());
                if (hVar == null) {
                    ArrayList d8 = d();
                    if (d8.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = string22 + TextUtils.join(StubApp.getString2("81"), d8);
                    }
                    throw new IllegalStateException(string2 + str + StubApp.getString2("5676") + str2);
                }
                ((u5.c) hVar.f6200h.get()).b();
            } finally {
            }
        }
        return hVar;
    }

    public static h i(j jVar, Context context, String str) {
        h hVar;
        AtomicReference atomicReference = f.f6188a;
        if (StubApp.getOrigApplicationContext(context.getApplicationContext()) instanceof Application) {
            Application application = (Application) StubApp.getOrigApplicationContext(context.getApplicationContext());
            AtomicReference atomicReference2 = f.f6188a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                while (true) {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        ComponentCallbacks2C0235d.a(application);
                        ComponentCallbacks2C0235d componentCallbacks2C0235d = ComponentCallbacks2C0235d.f6114e;
                        componentCallbacks2C0235d.getClass();
                        synchronized (componentCallbacks2C0235d) {
                            componentCallbacks2C0235d.f6117c.add(fVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (StubApp.getOrigApplicationContext(context.getApplicationContext()) != null) {
            context = StubApp.getOrigApplicationContext(context.getApplicationContext());
        }
        synchronized (f6191k) {
            C1692e c1692e = f6192l;
            D.j(StubApp.getString2("5677") + trim + StubApp.getString2("5678"), !c1692e.containsKey(trim));
            D.i(context, StubApp.getString2("5679"));
            hVar = new h(jVar, context, trim);
            c1692e.put(trim, hVar);
        }
        hVar.h();
        return hVar;
    }

    public static h j(Context context) {
        synchronized (f6191k) {
            try {
                if (f6192l.containsKey(StubApp.getString2("429"))) {
                    return e();
                }
                j a3 = j.a(context);
                if (a3 == null) {
                    Log.w(StubApp.getString2("5680"), StubApp.getString2("5681"));
                    return null;
                }
                return i(a3, context, StubApp.getString2("429"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        D.j(StubApp.getString2(5682), !this.f6198f.get());
    }

    public final void b() {
        if (this.f6198f.compareAndSet(false, true)) {
            synchronized (f6191k) {
                f6192l.remove(this.f6194b);
            }
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((C0082o) it.next()).getClass();
                Log.w(StubApp.getString2(2668), StubApp.getString2(5683));
                d0.f2857c = null;
            }
        }
    }

    public final Object c(Class cls) {
        a();
        return this.f6196d.get(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.f6194b.equals(hVar.f6194b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f6194b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append(StubApp.getString2(4966));
        a();
        byte[] bytes2 = this.f6195c.f6204b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        HashMap hashMap;
        if (!((UserManager) this.f6193a.getSystemService(UserManager.class)).isUserUnlocked()) {
            String string2 = StubApp.getString2(5680);
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(5684));
            a();
            sb2.append(this.f6194b);
            Log.i(string2, sb2.toString());
            Context context = this.f6193a;
            AtomicReference atomicReference = g.f6189b;
            if (atomicReference.get() == null) {
                g gVar = new g(context);
                while (!atomicReference.compareAndSet(null, gVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gVar, new IntentFilter(StubApp.getString2(5685)));
                return;
            }
            return;
        }
        String string22 = StubApp.getString2(5680);
        StringBuilder sb3 = new StringBuilder(StubApp.getString2(5686));
        a();
        sb3.append(this.f6194b);
        Log.i(string22, sb3.toString());
        W4.f fVar = this.f6196d;
        a();
        boolean equals = StubApp.getString2(429).equals(this.f6194b);
        AtomicReference atomicReference2 = fVar.f8130f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (fVar) {
                    hashMap = new HashMap(fVar.f8125a);
                }
                fVar.g(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((u5.c) this.f6200h.get()).b();
    }

    public final int hashCode() {
        return this.f6194b.hashCode();
    }

    public final boolean k() {
        boolean z2;
        a();
        B5.a aVar = (B5.a) this.f6199g.get();
        synchronized (aVar) {
            z2 = aVar.f666d;
        }
        return z2;
    }

    public final void l(boolean z2) {
        Log.d(StubApp.getString2(5680), StubApp.getString2(5687));
        Iterator it = this.f6201i.iterator();
        while (it.hasNext()) {
            h hVar = ((e) it.next()).f6187a;
            if (z2) {
                hVar.getClass();
            } else {
                ((u5.c) hVar.f6200h.get()).b();
            }
        }
    }

    public final void m(Boolean bool) {
        a();
        B5.a aVar = (B5.a) this.f6199g.get();
        synchronized (aVar) {
            try {
                if (bool == null) {
                    aVar.f664b.edit().remove(StubApp.getString2("642")).apply();
                    aVar.b(aVar.a());
                } else {
                    boolean equals = Boolean.TRUE.equals(bool);
                    aVar.f664b.edit().putBoolean(StubApp.getString2("642"), equals).apply();
                    aVar.b(equals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        C c10 = new C(this);
        c10.a(this.f6194b, StubApp.getString2(ModuleDescriptor.MODULE_VERSION));
        c10.a(this.f6195c, StubApp.getString2(5688));
        return c10.toString();
    }
}
