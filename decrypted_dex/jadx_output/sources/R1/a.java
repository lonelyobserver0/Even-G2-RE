package R1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.stub.StubApp;
import f5.u0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f6067d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6068e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f6071c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6070b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6069a = new HashMap();

    public a(Context context) {
        this.f6071c = StubApp.getOrigApplicationContext(context.getApplicationContext());
    }

    public static a c(Context context) {
        if (f6067d == null) {
            synchronized (f6068e) {
                try {
                    if (f6067d == null) {
                        f6067d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f6067d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f6071c.getString(2131755036);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f6070b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new H9.b(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        String string2 = StubApp.getString2(5595);
        if (u0.q()) {
            try {
                Trace.beginSection(u0.A(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(string2 + cls.getName() + StubApp.getString2("5596"));
        }
        HashMap hashMap = this.f6069a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> dependencies = bVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.create(this.f6071c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new H9.b(th2);
            }
        }
        Trace.endSection();
        return obj;
    }

    public final Object d(Class cls) {
        Object obj;
        synchronized (f6068e) {
            try {
                obj = this.f6069a.get(cls);
                if (obj == null) {
                    obj = b(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
