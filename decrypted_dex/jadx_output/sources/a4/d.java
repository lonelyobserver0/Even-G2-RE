package a4;

import S3.D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.stub.StubApp;
import i2.o;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f9262f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f9263g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f9264h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f9265i = -1;
    public static Boolean j;

    /* renamed from: n, reason: collision with root package name */
    public static i f9269n;

    /* renamed from: o, reason: collision with root package name */
    public static j f9270o;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9271a;

    /* renamed from: k, reason: collision with root package name */
    public static final ThreadLocal f9266k = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public static final Bc.c f9267l = new Bc.c(1);

    /* renamed from: m, reason: collision with root package name */
    public static final I4.e f9268m = new I4.e(25);

    /* renamed from: b, reason: collision with root package name */
    public static final u5.d f9258b = new u5.d(25);

    /* renamed from: c, reason: collision with root package name */
    public static final C2.i f9259c = new C2.i();

    /* renamed from: d, reason: collision with root package name */
    public static final I4.e f9260d = new I4.e(26);

    /* renamed from: e, reason: collision with root package name */
    public static final u5.d f9261e = new u5.d(26);

    public d(Context context) {
        this.f9271a = context;
    }

    public static int a(Context context, String str) {
        String string2 = StubApp.getString2(8329);
        String string22 = StubApp.getString2(8330);
        String string23 = StubApp.getString2(8331);
        try {
            Class<?> loadClass = StubApp.getOrigApplicationContext(context.getApplicationContext()).getClassLoader().loadClass(string23 + str + StubApp.getString2("8332"));
            Field declaredField = loadClass.getDeclaredField(StubApp.getString2("8333"));
            Field declaredField2 = loadClass.getDeclaredField(StubApp.getString2("8334"));
            if (D.k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e(string2, string22 + String.valueOf(declaredField.get(null)) + StubApp.getString2("8335") + str + StubApp.getString2("620"));
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w(string2, StubApp.getString2(8337) + str + StubApp.getString2(8338));
            return 0;
        } catch (Exception e10) {
            Log.e(string2, StubApp.getString2(8336).concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static d c(Context context, c cVar, String str) {
        long j3;
        R0.d d8;
        d dVar;
        Boolean bool;
        Z3.a N3;
        d dVar2;
        j jVar;
        boolean z2;
        Z3.a N10;
        String string2 = StubApp.getString2(8339);
        String string22 = StubApp.getString2(8340);
        String string23 = StubApp.getString2(8341);
        String string24 = StubApp.getString2(8341);
        String string25 = StubApp.getString2(8342);
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        if (origApplicationContext == null) {
            throw new a(StubApp.getString2(8362));
        }
        ThreadLocal threadLocal = f9266k;
        h hVar = (h) threadLocal.get();
        h hVar2 = new h();
        threadLocal.set(hVar2);
        Bc.c cVar2 = f9267l;
        Long l9 = (Long) cVar2.get();
        long longValue = l9.longValue();
        try {
            cVar2.set(Long.valueOf(SystemClock.uptimeMillis()));
            d8 = cVar.d(context, str, f9268m);
            j3 = longValue;
        } catch (Throwable th) {
            th = th;
            j3 = longValue;
        }
        try {
            Log.i("DynamiteModule", string25 + str + StubApp.getString2("478") + d8.f5935b + StubApp.getString2("8343") + str + StubApp.getString2("478") + d8.f5936c);
            int i3 = d8.f5937d;
            if (i3 != 0) {
                if (i3 == -1) {
                    if (d8.f5935b != 0) {
                        i3 = -1;
                    }
                }
                if (i3 != 1 || d8.f5936c != 0) {
                    if (i3 == -1) {
                        Log.i(StubApp.getString2("8329"), StubApp.getString2("8344").concat(str));
                        dVar = new d(origApplicationContext);
                    } else {
                        if (i3 != 1) {
                            throw new a(string22 + i3);
                        }
                        try {
                            int i10 = d8.f5936c;
                            try {
                                synchronized (d.class) {
                                    if (!g(context)) {
                                        throw new a(StubApp.getString2("8357"));
                                    }
                                    bool = f9262f;
                                }
                                if (bool == null) {
                                    throw new a(StubApp.getString2("8356"));
                                }
                                if (bool.booleanValue()) {
                                    Log.i(StubApp.getString2("8329"), string24 + str + StubApp.getString2("8345") + i10);
                                    synchronized (d.class) {
                                        jVar = f9270o;
                                    }
                                    if (jVar == null) {
                                        throw new a(StubApp.getString2("8350"));
                                    }
                                    h hVar3 = (h) threadLocal.get();
                                    if (hVar3 == null || hVar3.f9278a == null) {
                                        throw new a(StubApp.getString2("8349"));
                                    }
                                    Context origApplicationContext2 = StubApp.getOrigApplicationContext(context.getApplicationContext());
                                    Cursor cursor = hVar3.f9278a;
                                    new Z3.b(null);
                                    synchronized (d.class) {
                                        z2 = f9265i >= 2;
                                    }
                                    if (z2) {
                                        Log.v(StubApp.getString2("8329"), StubApp.getString2("8346"));
                                        N10 = jVar.O(new Z3.b(origApplicationContext2), str, i10, new Z3.b(cursor));
                                    } else {
                                        Log.w(StubApp.getString2("8329"), StubApp.getString2("8347"));
                                        N10 = jVar.N(new Z3.b(origApplicationContext2), str, i10, new Z3.b(cursor));
                                    }
                                    Context context2 = (Context) Z3.b.O(N10);
                                    if (context2 == null) {
                                        throw new a(StubApp.getString2("8348"));
                                    }
                                    dVar2 = new d(context2);
                                } else {
                                    Log.i(StubApp.getString2("8329"), string23 + str + StubApp.getString2("8345") + i10);
                                    i h2 = h(context);
                                    if (h2 == null) {
                                        throw new a(StubApp.getString2("8355"));
                                    }
                                    Parcel e10 = h2.e(h2.g(), 6);
                                    int readInt = e10.readInt();
                                    e10.recycle();
                                    if (readInt >= 3) {
                                        h hVar4 = (h) threadLocal.get();
                                        if (hVar4 == null) {
                                            throw new a(StubApp.getString2("8351"));
                                        }
                                        N3 = h2.O(new Z3.b(context), str, i10, new Z3.b(hVar4.f9278a));
                                    } else if (readInt == 2) {
                                        Log.w(StubApp.getString2("8329"), StubApp.getString2("8352"));
                                        N3 = h2.P(new Z3.b(context), str, i10);
                                    } else {
                                        Log.w(StubApp.getString2("8329"), StubApp.getString2("8353"));
                                        N3 = h2.N(new Z3.b(context), str, i10);
                                    }
                                    Object O7 = Z3.b.O(N3);
                                    if (O7 == null) {
                                        throw new a(StubApp.getString2("8354"));
                                    }
                                    dVar2 = new d((Context) O7);
                                }
                                dVar = dVar2;
                            } catch (a e11) {
                                throw e11;
                            } catch (RemoteException e12) {
                                throw new a(StubApp.getString2("8354"), e12);
                            } catch (Throwable th2) {
                                throw new a(StubApp.getString2("8354"), th2);
                            }
                        } catch (a e13) {
                            Log.w("DynamiteModule", StubApp.getString2("8358") + e13.getMessage());
                            int i11 = d8.f5935b;
                            if (i11 == 0 || cVar.d(context, str, new o(i11)).f5937d != -1) {
                                throw new a(StubApp.getString2("8359"), e13);
                            }
                            Log.i(StubApp.getString2("8329"), StubApp.getString2("8344").concat(str));
                            dVar = new d(origApplicationContext);
                        }
                    }
                    if (j3 == 0) {
                        f9267l.remove();
                    } else {
                        f9267l.set(l9);
                    }
                    Cursor cursor2 = hVar2.f9278a;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    f9266k.set(hVar);
                    return dVar;
                }
            }
            throw new a(string2 + str + StubApp.getString2("8360") + d8.f5935b + StubApp.getString2("8361") + d8.f5936c + StubApp.getString2("1"));
        } catch (Throwable th3) {
            th = th3;
            if (j3 == 0) {
                f9267l.remove();
            } else {
                f9267l.set(l9);
            }
            Cursor cursor3 = hVar2.f9278a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f9266k.set(hVar);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0192, code lost:
    
        if (r2 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0158, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.d.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void f(ClassLoader classLoader) {
        j jVar;
        String string2 = StubApp.getString2(8380);
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass(StubApp.getString2("8381")).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                jVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
                if (queryLocalInterface instanceof j) {
                    jVar = (j) queryLocalInterface;
                } else {
                    try {
                        jVar = new j(iBinder, string2, 2);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        throw new a(StubApp.getString2(8382), e);
                    } catch (InstantiationException e11) {
                        e = e11;
                        throw new a(StubApp.getString2(8382), e);
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        throw new a(StubApp.getString2(8382), e);
                    } catch (InvocationTargetException e13) {
                        e = e13;
                        throw new a(StubApp.getString2(8382), e);
                    }
                }
            }
            f9270o = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e14) {
            e = e14;
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(j)) {
            return true;
        }
        Boolean bool2 = j;
        String string2 = StubApp.getString2(8329);
        boolean z2 = false;
        if (bool2 == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(StubApp.getString2(5945), Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (com.google.android.gms.common.e.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && StubApp.getString2(0).equals(resolveContentProvider.packageName)) {
                z2 = true;
            }
            j = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i(string2, StubApp.getString2(8383));
                f9264h = true;
            }
        }
        if (!z2) {
            Log.e(string2, StubApp.getString2(8384));
        }
        return z2;
    }

    public static i h(Context context) {
        i iVar;
        String string2 = StubApp.getString2(8385);
        synchronized (d.class) {
            i iVar2 = f9269n;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext(StubApp.getString2("0"), 3).getClassLoader().loadClass(StubApp.getString2("8386")).newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(StubApp.getString2("8387"));
                    iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder, StubApp.getString2("8387"), 2);
                }
                if (iVar != null) {
                    f9269n = iVar;
                    return iVar;
                }
            } catch (Exception e10) {
                Log.e(StubApp.getString2("8329"), string2 + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f9271a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a(StubApp.getString2(8388).concat(str), e10);
        }
    }
}
