package j2;

import A3.s;
import androidx.work.impl.WorkDatabase;
import com.stub.StubApp;
import i2.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1086d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15272a = o.g(StubApp.getString2(18970));

    public static void a(La.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        s u2 = workDatabase.u();
        workDatabase.c();
        try {
            ArrayList e10 = u2.e(bVar.f4384c);
            ArrayList c10 = u2.c();
            if (e10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = e10.iterator();
                while (it.hasNext()) {
                    u2.n(currentTimeMillis, ((r2.f) it.next()).f20302a);
                }
            }
            workDatabase.n();
            workDatabase.j();
            if (e10.size() > 0) {
                r2.f[] fVarArr = (r2.f[]) e10.toArray(new r2.f[e10.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1085c interfaceC1085c = (InterfaceC1085c) it2.next();
                    if (interfaceC1085c.b()) {
                        interfaceC1085c.a(fVarArr);
                    }
                }
            }
            if (c10.size() > 0) {
                r2.f[] fVarArr2 = (r2.f[]) c10.toArray(new r2.f[c10.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC1085c interfaceC1085c2 = (InterfaceC1085c) it3.next();
                    if (!interfaceC1085c2.b()) {
                        interfaceC1085c2.a(fVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
