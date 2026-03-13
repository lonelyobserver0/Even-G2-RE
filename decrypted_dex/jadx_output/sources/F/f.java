package F;

import K.j;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.stub.StubApp;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends a4.f {

    /* renamed from: n, reason: collision with root package name */
    public static Class f2172n;

    /* renamed from: o, reason: collision with root package name */
    public static Constructor f2173o;

    /* renamed from: p, reason: collision with root package name */
    public static Method f2174p;

    /* renamed from: q, reason: collision with root package name */
    public static Method f2175q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f2176r;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2177g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f2178h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f2179i;
    public final Method j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f2180k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2181l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f2182m;

    public f() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName(StubApp.getString2("1989"));
            constructor = cls.getConstructor(new Class[0]);
            method2 = i0(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod(StubApp.getString2("1990"), ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod(StubApp.getString2("1991"), new Class[0]);
            method = cls.getMethod(StubApp.getString2("1992"), new Class[0]);
            method5 = j0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(StubApp.getString2(1994), StubApp.getString2(1993).concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2177g = cls;
        this.f2178h = constructor;
        this.f2179i = method2;
        this.j = method3;
        this.f2180k = method4;
        this.f2181l = method;
        this.f2182m = method5;
    }

    public static boolean d0(Object obj, String str, int i3, boolean z2) {
        g0();
        try {
            return ((Boolean) f2174p.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void g0() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f2176r) {
            return;
        }
        f2176r = true;
        try {
            cls = Class.forName(StubApp.getString2("1989"));
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod(StubApp.getString2("1995"), String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(StubApp.getString2("1996"), Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e(StubApp.getString2(1997), e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f2173o = constructor;
        f2172n = cls;
        f2174p = method2;
        f2175q = method;
    }

    public static Method i0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod(StubApp.getString2(1998), AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void b0(Object obj) {
        try {
            this.f2181l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean c0(Context context, Object obj, String str, int i3, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2179i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Typeface e0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2177g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2182m.invoke(null, newInstance, StubApp.getString2("1999"), -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final boolean f0(Object obj) {
        try {
            return ((Boolean) this.f2180k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // a4.f
    public final Typeface g(Context context, E.e eVar, Resources resources, int i3) {
        Method method = this.f2179i;
        if (method == null) {
            Log.w(StubApp.getString2(1994), StubApp.getString2(2000));
        }
        if (method != null) {
            Object h0 = h0();
            if (h0 != null) {
                E.f[] fVarArr = eVar.f1696a;
                int length = fVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    E.f fVar = fVarArr[i10];
                    Context context2 = context;
                    if (!c0(context2, h0, fVar.f1697a, fVar.f1701e, fVar.f1698b, fVar.f1699c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f1700d))) {
                        b0(h0);
                        return null;
                    }
                    i10++;
                    context = context2;
                }
                if (f0(h0)) {
                    return e0(h0);
                }
            }
            return null;
        }
        g0();
        try {
            Object newInstance = f2173o.newInstance(new Object[0]);
            for (E.f fVar2 : eVar.f1696a) {
                File r8 = android.support.v4.media.session.b.r(context);
                if (r8 == null) {
                    return null;
                }
                try {
                    if (android.support.v4.media.session.b.k(r8, resources, fVar2.f1702f) && d0(newInstance, r8.getPath(), fVar2.f1698b, fVar2.f1699c)) {
                        r8.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    r8.delete();
                    throw th;
                }
                r8.delete();
                return null;
            }
            g0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f2172n, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2175q.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // a4.f
    public final Typeface h(Context context, j[] jVarArr, int i3) {
        Typeface e02;
        boolean z2;
        if (jVarArr.length >= 1) {
            Method method = this.f2179i;
            if (method == null) {
                Log.w(StubApp.getString2(1994), StubApp.getString2(2000));
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (j jVar : jVarArr) {
                    if (jVar.f3568e == 0) {
                        Uri uri = jVar.f3564a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, android.support.v4.media.session.b.t(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object h0 = h0();
                if (h0 != null) {
                    int length = jVarArr.length;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 < length) {
                        j jVar2 = jVarArr[i10];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f3564a);
                        if (byteBuffer != null) {
                            try {
                                z2 = ((Boolean) this.j.invoke(h0, byteBuffer, Integer.valueOf(jVar2.f3565b), null, Integer.valueOf(jVar2.f3566c), Integer.valueOf(jVar2.f3567d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z2 = false;
                            }
                            if (!z2) {
                                b0(h0);
                                return null;
                            }
                            z10 = true;
                        }
                        i10++;
                        z10 = z10;
                    }
                    if (!z10) {
                        b0(h0);
                        return null;
                    }
                    if (f0(h0) && (e02 = e0(h0)) != null) {
                        return Typeface.create(e02, i3);
                    }
                }
            } else {
                j k3 = k(jVarArr, i3);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k3.f3564a, StubApp.getString2("1269"), null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(k3.f3566c).setItalic(k3.f3567d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    public final Object h0() {
        try {
            return this.f2178h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a4.f
    public final Typeface j(Context context, Resources resources, int i3, String str, int i10) {
        Method method = this.f2179i;
        if (method == null) {
            Log.w(StubApp.getString2(1994), StubApp.getString2(2000));
        }
        if (method == null) {
            return super.j(context, resources, i3, str, i10);
        }
        Object h0 = h0();
        if (h0 != null) {
            if (!c0(context, h0, str, 0, -1, -1, null)) {
                b0(h0);
                return null;
            }
            if (f0(h0)) {
                return e0(h0);
            }
        }
        return null;
    }

    public final Method j0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(StubApp.getString2(1996), cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
