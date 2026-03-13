package q2;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import com.stub.StubApp;
import i2.h;
import i2.o;
import j2.InterfaceC1083a;
import j2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.g;
import n2.C1382c;
import n2.InterfaceC1381b;
import p0.AbstractC1482f;
import r2.f;
import sa.C1608a;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1506a implements InterfaceC1381b, InterfaceC1083a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f19917k = o.g(StubApp.getString2(22192));

    /* renamed from: a, reason: collision with root package name */
    public final k f19918a;

    /* renamed from: b, reason: collision with root package name */
    public final C1608a f19919b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19920c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f19921d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f19922e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f19923f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f19924g;

    /* renamed from: h, reason: collision with root package name */
    public final C1382c f19925h;
    public SystemForegroundService j;

    public C1506a(Context context) {
        k L10 = k.L(context);
        this.f19918a = L10;
        C1608a c1608a = L10.f15299f;
        this.f19919b = c1608a;
        this.f19921d = null;
        this.f19922e = new LinkedHashMap();
        this.f19924g = new HashSet();
        this.f19923f = new HashMap();
        this.f19925h = new C1382c(context, c1608a, this);
        L10.f15301h.a(this);
    }

    public static Intent a(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(StubApp.getString2(22193));
        intent.putExtra(StubApp.getString2(22194), hVar.f14738a);
        intent.putExtra(StubApp.getString2(22195), hVar.f14739b);
        intent.putExtra(StubApp.getString2(22196), hVar.f14740c);
        intent.putExtra(StubApp.getString2(19316), str);
        return intent;
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(StubApp.getString2(22197));
        String string2 = StubApp.getString2(19316);
        intent.putExtra(string2, str);
        intent.putExtra(StubApp.getString2(22194), hVar.f14738a);
        intent.putExtra(StubApp.getString2(22195), hVar.f14739b);
        intent.putExtra(StubApp.getString2(22196), hVar.f14740c);
        intent.putExtra(string2, str);
        return intent;
    }

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        Map.Entry entry;
        synchronized (this.f19920c) {
            try {
                f fVar = (f) this.f19923f.remove(str);
                if (fVar != null ? this.f19924g.remove(fVar) : false) {
                    this.f19925h.b(this.f19924g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f19922e.remove(str);
        if (str.equals(this.f19921d) && this.f19922e.size() > 0) {
            Iterator it = this.f19922e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f19921d = (String) entry.getKey();
            if (this.j != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.j;
                systemForegroundService.f10388b.post(new RunnableC1507b(systemForegroundService, hVar2.f14738a, hVar2.f14740c, hVar2.f14739b));
                SystemForegroundService systemForegroundService2 = this.j;
                systemForegroundService2.f10388b.post(new K.a(hVar2.f14738a, 4, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.j;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        o e10 = o.e();
        String str2 = f19917k;
        int i3 = hVar.f14738a;
        int i10 = hVar.f14739b;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(22198));
        sb2.append(i3);
        sb2.append(StubApp.getString2(22199));
        sb2.append(str);
        sb2.append(StubApp.getString2(22200));
        e10.b(str2, AbstractC1482f.f(i10, StubApp.getString2(74), sb2), new Throwable[0]);
        systemForegroundService3.f10388b.post(new K.a(hVar.f14738a, 4, systemForegroundService3));
    }

    public final void d(Intent intent) {
        int i3 = 0;
        int intExtra = intent.getIntExtra(StubApp.getString2(22194), 0);
        int intExtra2 = intent.getIntExtra(StubApp.getString2(22195), 0);
        String stringExtra = intent.getStringExtra(StubApp.getString2(19316));
        Notification notification = (Notification) intent.getParcelableExtra(StubApp.getString2(22196));
        o e10 = o.e();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(22201));
        sb2.append(intExtra);
        sb2.append(StubApp.getString2(22199));
        sb2.append(stringExtra);
        sb2.append(StubApp.getString2(22202));
        e10.b(f19917k, AbstractC1482f.f(intExtra2, StubApp.getString2(74), sb2), new Throwable[0]);
        if (notification == null || this.j == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f19922e;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f19921d)) {
            this.f19921d = stringExtra;
            SystemForegroundService systemForegroundService = this.j;
            systemForegroundService.f10388b.post(new RunnableC1507b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.j;
        systemForegroundService2.f10388b.post(new g(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i3 |= ((h) ((Map.Entry) it.next()).getValue()).f14739b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f19921d);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.j;
            systemForegroundService3.f10388b.post(new RunnableC1507b(systemForegroundService3, hVar2.f14738a, hVar2.f14740c, i3));
        }
    }

    @Override // n2.InterfaceC1381b
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.e().b(f19917k, E1.a.j(StubApp.getString2(22203), str), new Throwable[0]);
            k kVar = this.f19918a;
            kVar.f15299f.j(new s2.h(kVar, str, true));
        }
    }

    @Override // n2.InterfaceC1381b
    public final void f(List list) {
    }

    public final void g() {
        this.j = null;
        synchronized (this.f19920c) {
            this.f19925h.c();
        }
        this.f19918a.f15301h.e(this);
    }
}
