package s2;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.stub.StubApp;
import i2.q;
import i2.t;
import j2.AbstractC1086d;
import j2.C1087e;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f20702c = i2.o.g(StubApp.getString2(23037));

    /* renamed from: a, reason: collision with root package name */
    public final C1087e f20703a;

    /* renamed from: b, reason: collision with root package name */
    public final V6.b f20704b = new V6.b(19);

    public b(C1087e c1087e) {
        this.f20703a = c1087e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(j2.C1087e r21) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.b.a(j2.e):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        V6.b bVar = this.f20704b;
        C1087e c1087e = this.f20703a;
        String string2 = StubApp.getString2(23041);
        try {
            c1087e.getClass();
            j2.k kVar = c1087e.f15274f;
            HashSet hashSet = new HashSet();
            hashSet.addAll(c1087e.j);
            HashSet H2 = C1087e.H(c1087e);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(c1087e.j);
                    z2 = false;
                    break;
                } else if (H2.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                throw new IllegalStateException(string2 + c1087e + StubApp.getString2("74"));
            }
            WorkDatabase workDatabase = kVar.f15298e;
            workDatabase.c();
            try {
                boolean a3 = a(c1087e);
                workDatabase.n();
                if (a3) {
                    e.a(kVar.f15296c, RescheduleReceiver.class, true);
                    AbstractC1086d.a(kVar.f15297d, kVar.f15298e, kVar.f15300g);
                }
                bVar.X(t.f14751g0);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            bVar.X(new q(th));
        }
    }
}
