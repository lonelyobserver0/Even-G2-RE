package s2;

import A3.s;
import androidx.work.impl.WorkDatabase;
import com.stub.StubApp;
import i2.q;
import i2.t;
import j2.AbstractC1086d;
import j2.C1084b;
import j2.InterfaceC1085c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1595a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final V6.b f20698a = new V6.b(19);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2.k f20700c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20701d;

    public RunnableC1595a(j2.k kVar, Object obj, int i3) {
        this.f20699b = i3;
        this.f20700c = kVar;
        this.f20701d = obj;
    }

    public static void a(j2.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f15298e;
        s u2 = workDatabase.u();
        Y.m p8 = workDatabase.p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int i3 = u2.i(str2);
            if (i3 != 3 && i3 != 4) {
                u2.q(6, str2);
            }
            linkedList.addAll(p8.o(str2));
        }
        C1084b c1084b = kVar.f15301h;
        String string2 = StubApp.getString2(23036);
        synchronized (c1084b.f15271l) {
            try {
                i2.o.e().b(C1084b.f15261m, string2 + str, new Throwable[0]);
                c1084b.j.add(str);
                j2.l lVar = (j2.l) c1084b.f15267f.remove(str);
                boolean z2 = lVar != null;
                if (lVar == null) {
                    lVar = (j2.l) c1084b.f15268g.remove(str);
                }
                C1084b.b(str, lVar);
                if (z2) {
                    c1084b.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f15300g.iterator();
        while (it.hasNext()) {
            ((InterfaceC1085c) it.next()).d(str);
        }
    }

    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f20699b) {
            case 0:
                j2.k kVar = this.f20700c;
                workDatabase = kVar.f15298e;
                workDatabase.c();
                try {
                    a(kVar, ((UUID) this.f20701d).toString());
                    workDatabase.n();
                    workDatabase.j();
                    AbstractC1086d.a(kVar.f15297d, kVar.f15298e, kVar.f15300g);
                    return;
                } finally {
                    workDatabase.j();
                }
            default:
                j2.k kVar2 = this.f20700c;
                workDatabase = kVar2.f15298e;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.u().j((String) this.f20701d).iterator();
                    while (it.hasNext()) {
                        a(kVar2, (String) it.next());
                    }
                    workDatabase.n();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        V6.b bVar = this.f20698a;
        try {
            b();
            bVar.X(t.f14751g0);
        } catch (Throwable th) {
            bVar.X(new q(th));
        }
    }
}
