package l2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.stub.StubApp;
import i2.o;
import i2.u;
import j2.InterfaceC1083a;
import j2.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n2.C1382c;
import r2.C1565c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements InterfaceC1083a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15847d = o.g(StubApp.getString2(19314));

    /* renamed from: a, reason: collision with root package name */
    public final Context f15848a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15849b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f15850c = new Object();

    public b(Context context) {
        this.f15848a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(StubApp.getString2(19315));
        intent.putExtra(StubApp.getString2(19316), str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction(StubApp.getString2(19317));
        intent.putExtra(StubApp.getString2(19316), str);
        return intent;
    }

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        synchronized (this.f15850c) {
            try {
                InterfaceC1083a interfaceC1083a = (InterfaceC1083a) this.f15849b.remove(str);
                if (interfaceC1083a != null) {
                    interfaceC1083a.c(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i3, h hVar) {
        String action = intent.getAction();
        int i10 = 0;
        if (StubApp.getString2(19318).equals(action)) {
            o.e().b(f15847d, String.format(StubApp.getString2(19319), intent), new Throwable[0]);
            d dVar = new d(this.f15848a, i3, hVar);
            ArrayList g10 = hVar.f15876e.f15298e.u().g();
            String str = c.f15851a;
            Iterator it = g10.iterator();
            boolean z2 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                i2.b bVar = ((r2.f) it.next()).j;
                z2 |= bVar.f14721d;
                z10 |= bVar.f14719b;
                z11 |= bVar.f14722e;
                z12 |= bVar.f14718a != 1;
                if (z2 && z10 && z11 && z12) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f10378a;
            Intent intent2 = new Intent(StubApp.getString2(19320));
            Context context = dVar.f15853a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra(StubApp.getString2(3162), z2).putExtra(StubApp.getString2(3163), z10).putExtra(StubApp.getString2(3164), z11).putExtra(StubApp.getString2(3165), z12);
            context.sendBroadcast(intent2);
            C1382c c1382c = dVar.f15855c;
            c1382c.b(g10);
            ArrayList arrayList = new ArrayList(g10.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = g10.iterator();
            while (it2.hasNext()) {
                r2.f fVar = (r2.f) it2.next();
                String str3 = fVar.f20302a;
                if (currentTimeMillis >= fVar.a() && (!fVar.b() || c1382c.a(str3))) {
                    arrayList.add(fVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((r2.f) it3.next()).f20302a;
                Intent a3 = a(context, str4);
                o.e().b(d.f15852d, E1.a.k(StubApp.getString2(19321), str4, StubApp.getString2(74)), new Throwable[0]);
                hVar.e(new g(dVar.f15854b, i10, hVar, a3));
            }
            c1382c.c();
            return;
        }
        if (StubApp.getString2(19322).equals(action)) {
            o.e().b(f15847d, String.format(StubApp.getString2(19323), intent, Integer.valueOf(i3)), new Throwable[0]);
            hVar.f15876e.N();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {StubApp.getString2(19316)};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.e().d(f15847d, E1.a.k(StubApp.getString2(19338), action, StubApp.getString2(19339)), new Throwable[0]);
            return;
        }
        if (!StubApp.getString2(19317).equals(action)) {
            if (StubApp.getString2(19315).equals(action)) {
                String string2 = StubApp.getString2(18955);
                String string22 = StubApp.getString2(19329);
                Bundle extras2 = intent.getExtras();
                synchronized (this.f15850c) {
                    try {
                        String string = extras2.getString(StubApp.getString2("19316"));
                        o e10 = o.e();
                        String str5 = f15847d;
                        e10.b(str5, string22 + string, new Throwable[0]);
                        if (this.f15849b.containsKey(string)) {
                            o.e().b(str5, string2 + string + StubApp.getString2("19330"), new Throwable[0]);
                        } else {
                            e eVar = new e(this.f15848a, i3, string, hVar);
                            this.f15849b.put(string, eVar);
                            eVar.b();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!StubApp.getString2(19331).equals(action)) {
                if (!StubApp.getString2(19334).equals(action)) {
                    o.e().h(f15847d, String.format(StubApp.getString2(19337), intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string3 = extras3.getString(StubApp.getString2(19316));
                boolean z13 = extras3.getBoolean(StubApp.getString2(19335));
                o.e().b(f15847d, String.format(StubApp.getString2(19336), intent, Integer.valueOf(i3)), new Throwable[0]);
                c(string3, z13);
                return;
            }
            String string4 = intent.getExtras().getString(StubApp.getString2(19316));
            o.e().b(f15847d, E1.a.j(StubApp.getString2(19332), string4), new Throwable[0]);
            k kVar = hVar.f15876e;
            kVar.f15299f.j(new s2.h(kVar, string4, false));
            String str6 = AbstractC1143a.f15846a;
            a5.c r8 = hVar.f15876e.f15298e.r();
            C1565c u2 = r8.u(string4);
            if (u2 != null) {
                AbstractC1143a.a(this.f15848a, u2.f20296b, string4);
                o.e().b(AbstractC1143a.f15846a, E1.a.k(StubApp.getString2(19333), string4, StubApp.getString2(74)), new Throwable[0]);
                r8.J(string4);
            }
            hVar.c(string4, false);
            return;
        }
        String string23 = StubApp.getString2(19324);
        String string24 = StubApp.getString2(19325);
        String string5 = intent.getExtras().getString(StubApp.getString2(19316));
        String str7 = f15847d;
        o.e().b(str7, E1.a.j(StubApp.getString2(19326), string5), new Throwable[0]);
        WorkDatabase workDatabase = hVar.f15876e.f15298e;
        workDatabase.c();
        try {
            r2.f k3 = workDatabase.u().k(string5);
            if (k3 == null) {
                o.e().h(str7, "Skipping scheduling " + string5 + StubApp.getString2("19327"), new Throwable[0]);
                return;
            }
            if (u.a(k3.f20303b)) {
                o.e().h(str7, "Skipping scheduling " + string5 + StubApp.getString2("19328"), new Throwable[0]);
                return;
            }
            long a9 = k3.a();
            boolean b2 = k3.b();
            Context context2 = this.f15848a;
            k kVar2 = hVar.f15876e;
            if (b2) {
                o.e().b(str7, string23 + string5 + " at " + a9, new Throwable[0]);
                AbstractC1143a.b(context2, kVar2, string5, a9);
                Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                intent3.setAction(StubApp.getString2("19318"));
                hVar.e(new g(i3, i10, hVar, intent3));
            } else {
                o.e().b(str7, string24 + string5 + " at " + a9, new Throwable[0]);
                AbstractC1143a.b(context2, kVar2, string5, a9);
            }
            workDatabase.n();
        } finally {
            workDatabase.j();
        }
    }
}
