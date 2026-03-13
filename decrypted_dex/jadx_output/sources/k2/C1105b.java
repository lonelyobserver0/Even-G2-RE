package k2;

import a0.C0379a;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.stub.StubApp;
import i2.o;
import j2.InterfaceC1083a;
import j2.InterfaceC1085c;
import j2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.C1382c;
import n2.InterfaceC1381b;
import r2.f;
import s2.h;
import sa.C1608a;

/* renamed from: k2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1105b implements InterfaceC1085c, InterfaceC1381b, InterfaceC1083a {
    public static final String j = o.g(StubApp.getString2(19097));

    /* renamed from: a, reason: collision with root package name */
    public final Context f15426a;

    /* renamed from: b, reason: collision with root package name */
    public final k f15427b;

    /* renamed from: c, reason: collision with root package name */
    public final C1382c f15428c;

    /* renamed from: e, reason: collision with root package name */
    public final C1104a f15430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15431f;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f15433h;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f15429d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Object f15432g = new Object();

    public C1105b(Context context, La.b bVar, C1608a c1608a, k kVar) {
        this.f15426a = context;
        this.f15427b = kVar;
        this.f15428c = new C1382c(context, c1608a, this);
        this.f15430e = new C1104a(this, (C0379a) bVar.f4389h);
    }

    @Override // j2.InterfaceC1085c
    public final void a(f... fVarArr) {
        boolean z2 = false;
        if (this.f15433h == null) {
            La.b bVar = this.f15427b.f15297d;
            int i3 = s2.f.f20714a;
            String processName = Application.getProcessName();
            bVar.getClass();
            this.f15433h = Boolean.valueOf(!TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, this.f15426a.getApplicationInfo().processName));
        }
        if (!this.f15433h.booleanValue()) {
            o.e().f(j, StubApp.getString2(19098), new Throwable[0]);
            return;
        }
        if (!this.f15431f) {
            this.f15427b.f15301h.a(this);
            this.f15431f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (f fVar : fVarArr) {
            long a3 = fVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (fVar.f20303b == 1) {
                if (currentTimeMillis < a3) {
                    C1104a c1104a = this.f15430e;
                    if (c1104a != null) {
                        HashMap hashMap = c1104a.f15425c;
                        Runnable runnable = (Runnable) hashMap.remove(fVar.f20302a);
                        C0379a c0379a = c1104a.f15424b;
                        if (runnable != null) {
                            ((Handler) c0379a.f9233b).removeCallbacks(runnable);
                        }
                        Q4.b bVar2 = new Q4.b(c1104a, fVar, 20, z2);
                        hashMap.put(fVar.f20302a, bVar2);
                        ((Handler) c0379a.f9233b).postDelayed(bVar2, fVar.a() - System.currentTimeMillis());
                    }
                } else if (fVar.b()) {
                    i2.b bVar3 = fVar.j;
                    if (bVar3.f14720c) {
                        o.e().b(j, StubApp.getString2(19099) + fVar + StubApp.getString2(19100), new Throwable[0]);
                    } else if (bVar3.f14725h.f14728a.size() > 0) {
                        o.e().b(j, StubApp.getString2(19099) + fVar + StubApp.getString2(19101), new Throwable[0]);
                    } else {
                        hashSet.add(fVar);
                        hashSet2.add(fVar.f20302a);
                    }
                } else {
                    o.e().b(j, E1.a.j(StubApp.getString2(3176), fVar.f20302a), new Throwable[0]);
                    this.f15427b.O(fVar.f20302a, null);
                }
            }
        }
        synchronized (this.f15432g) {
            try {
                if (!hashSet.isEmpty()) {
                    o.e().b(j, StubApp.getString2("19102") + TextUtils.join(StubApp.getString2("321"), hashSet2) + StubApp.getString2("511"), new Throwable[0]);
                    this.f15429d.addAll(hashSet);
                    this.f15428c.b(this.f15429d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j2.InterfaceC1085c
    public final boolean b() {
        return false;
    }

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        synchronized (this.f15432g) {
            try {
                Iterator it = this.f15429d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar = (f) it.next();
                    if (fVar.f20302a.equals(str)) {
                        o.e().b(j, StubApp.getString2("19103") + str, new Throwable[0]);
                        this.f15429d.remove(fVar);
                        this.f15428c.b(this.f15429d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j2.InterfaceC1085c
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f15433h;
        k kVar = this.f15427b;
        if (bool == null) {
            La.b bVar = kVar.f15297d;
            int i3 = s2.f.f20714a;
            String processName = Application.getProcessName();
            bVar.getClass();
            this.f15433h = Boolean.valueOf(!TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, this.f15426a.getApplicationInfo().processName));
        }
        boolean booleanValue = this.f15433h.booleanValue();
        String str2 = j;
        if (!booleanValue) {
            o.e().f(str2, StubApp.getString2(19104), new Throwable[0]);
            return;
        }
        if (!this.f15431f) {
            kVar.f15301h.a(this);
            this.f15431f = true;
        }
        o.e().b(str2, E1.a.j(StubApp.getString2(19105), str), new Throwable[0]);
        C1104a c1104a = this.f15430e;
        if (c1104a != null && (runnable = (Runnable) c1104a.f15425c.remove(str)) != null) {
            ((Handler) c1104a.f15424b.f9233b).removeCallbacks(runnable);
        }
        kVar.f15299f.j(new h(kVar, str, false));
    }

    @Override // n2.InterfaceC1381b
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.e().b(j, E1.a.j(StubApp.getString2(19106), str), new Throwable[0]);
            k kVar = this.f15427b;
            kVar.f15299f.j(new h(kVar, str, false));
        }
    }

    @Override // n2.InterfaceC1381b
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.e().b(j, E1.a.j(StubApp.getString2(19107), str), new Throwable[0]);
            this.f15427b.O(str, null);
        }
    }
}
