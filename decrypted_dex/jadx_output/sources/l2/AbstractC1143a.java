package l2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.stub.StubApp;
import i2.o;
import j2.k;
import r2.C1564b;
import r2.C1565c;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1143a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15846a = o.g(StubApp.getString2(19312));

    public static void a(Context context, int i3, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(StubApp.getString2(1822));
        PendingIntent service = PendingIntent.getService(context, i3, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        o.e().b(f15846a, StubApp.getString2(19313) + str + StubApp.getString2(81) + i3 + StubApp.getString2(74), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j) {
        int intValue;
        WorkDatabase workDatabase = kVar.f15298e;
        a5.c r8 = workDatabase.r();
        C1565c u2 = r8.u(str);
        if (u2 != null) {
            a(context, u2.f20296b, str);
            int i3 = u2.f20296b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(StubApp.getString2(1822));
            PendingIntent service = PendingIntent.getService(context, i3, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (s2.d.class) {
            String string2 = StubApp.getString2("18989");
            workDatabase.c();
            try {
                Long D6 = workDatabase.q().D(string2);
                intValue = D6 != null ? D6.intValue() : 0;
                workDatabase.q().G(new C1564b(string2, intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.n();
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        r8.z(new C1565c(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(StubApp.getString2(1822));
        PendingIntent service2 = PendingIntent.getService(context, intValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
