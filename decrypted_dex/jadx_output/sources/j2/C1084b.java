package j2;

import B3.q;
import K.m;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.stub.StubApp;
import i2.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p0.AbstractC1482f;
import q2.C1506a;
import sa.C1608a;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1084b implements InterfaceC1083a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f15261m = o.g(StubApp.getString2(18954));

    /* renamed from: b, reason: collision with root package name */
    public final Context f15263b;

    /* renamed from: c, reason: collision with root package name */
    public final La.b f15264c;

    /* renamed from: d, reason: collision with root package name */
    public final C1608a f15265d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f15266e;

    /* renamed from: h, reason: collision with root package name */
    public final List f15269h;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f15268g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f15267f = new HashMap();
    public final HashSet j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f15270k = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f15262a = null;

    /* renamed from: l, reason: collision with root package name */
    public final Object f15271l = new Object();

    public C1084b(Context context, La.b bVar, C1608a c1608a, WorkDatabase workDatabase, List list) {
        this.f15263b = context;
        this.f15264c = bVar;
        this.f15265d = c1608a;
        this.f15266e = workDatabase;
        this.f15269h = list;
    }

    public static boolean b(String str, l lVar) {
        boolean z2;
        if (lVar == null) {
            o.e().b(f15261m, E1.a.j(StubApp.getString2(18958), str), new Throwable[0]);
            return false;
        }
        lVar.f15321t = true;
        lVar.h();
        Q4.c cVar = lVar.f15320s;
        if (cVar != null) {
            z2 = cVar.isDone();
            lVar.f15320s.cancel(true);
        } else {
            z2 = false;
        }
        ListenableWorker listenableWorker = lVar.f15309e;
        if (listenableWorker == null || z2) {
            o.e().b(l.f15304v, StubApp.getString2(18955) + lVar.f15308d + StubApp.getString2(18956), new Throwable[0]);
        } else {
            listenableWorker.g();
        }
        o.e().b(f15261m, E1.a.j(StubApp.getString2(18957), str), new Throwable[0]);
        return true;
    }

    public final void a(InterfaceC1083a interfaceC1083a) {
        synchronized (this.f15271l) {
            this.f15270k.add(interfaceC1083a);
        }
    }

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        synchronized (this.f15271l) {
            try {
                this.f15268g.remove(str);
                o.e().b(f15261m, C1084b.class.getSimpleName() + StubApp.getString2("397") + str + StubApp.getString2("18959") + z2, new Throwable[0]);
                Iterator it = this.f15270k.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1083a) it.next()).c(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z2;
        synchronized (this.f15271l) {
            try {
                z2 = this.f15268g.containsKey(str) || this.f15267f.containsKey(str);
            } finally {
            }
        }
        return z2;
    }

    public final void e(InterfaceC1083a interfaceC1083a) {
        synchronized (this.f15271l) {
            this.f15270k.remove(interfaceC1083a);
        }
    }

    public final void f(String str, i2.h hVar) {
        String string2 = StubApp.getString2(18960);
        synchronized (this.f15271l) {
            try {
                o.e().f(f15261m, string2 + str + StubApp.getString2("18961"), new Throwable[0]);
                l lVar = (l) this.f15268g.remove(str);
                if (lVar != null) {
                    if (this.f15262a == null) {
                        PowerManager.WakeLock a3 = s2.i.a(this.f15263b, StubApp.getString2("18962"));
                        this.f15262a = a3;
                        a3.acquire();
                    }
                    this.f15267f.put(str, lVar);
                    this.f15263b.startForegroundService(C1506a.b(this.f15263b, str, hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, V6.b bVar) {
        String string2 = StubApp.getString2(18963);
        synchronized (this.f15271l) {
            try {
                if (d(str)) {
                    o.e().b(f15261m, string2 + str + StubApp.getString2("18964"), new Throwable[0]);
                    return false;
                }
                Context context = this.f15263b;
                La.b bVar2 = this.f15264c;
                C1608a c1608a = this.f15265d;
                WorkDatabase workDatabase = this.f15266e;
                List list = Collections.EMPTY_LIST;
                Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
                List list2 = this.f15269h;
                l lVar = new l();
                lVar.f15311g = new i2.k();
                lVar.f15319r = new t2.j();
                lVar.f15320s = null;
                lVar.f15305a = origApplicationContext;
                lVar.f15310f = c1608a;
                lVar.j = this;
                lVar.f15306b = str;
                lVar.f15307c = list2;
                lVar.f15309e = null;
                lVar.f15312h = bVar2;
                lVar.f15313k = workDatabase;
                lVar.f15314l = workDatabase.u();
                lVar.f15315m = workDatabase.p();
                lVar.f15316n = workDatabase.v();
                t2.j jVar = lVar.f15319r;
                m mVar = new m(3);
                mVar.f3571b = this;
                mVar.f3572c = str;
                mVar.f3573d = jVar;
                jVar.a(mVar, (q) this.f15265d.f20822c);
                this.f15268g.put(str, lVar);
                ((s2.g) this.f15265d.f20820a).execute(lVar);
                o.e().b(f15261m, AbstractC1482f.h(C1084b.class.getSimpleName(), StubApp.getString2(18965), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f15271l) {
            try {
                if (this.f15267f.isEmpty()) {
                    Context context = this.f15263b;
                    String str = C1506a.f19917k;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction(StubApp.getString2("18966"));
                    try {
                        this.f15263b.startService(intent);
                    } catch (Throwable th) {
                        o.e().d(f15261m, StubApp.getString2("18967"), th);
                    }
                    PowerManager.WakeLock wakeLock = this.f15262a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f15262a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean b2;
        String string2 = StubApp.getString2(18968);
        synchronized (this.f15271l) {
            o.e().b(f15261m, string2 + str, new Throwable[0]);
            b2 = b(str, (l) this.f15267f.remove(str));
        }
        return b2;
    }

    public final boolean j(String str) {
        boolean b2;
        String string2 = StubApp.getString2(18969);
        synchronized (this.f15271l) {
            o.e().b(f15261m, string2 + str, new Throwable[0]);
            b2 = b(str, (l) this.f15268g.remove(str));
        }
        return b2;
    }
}
