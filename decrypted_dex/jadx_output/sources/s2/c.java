package s2;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import com.stub.StubApp;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20705d = i2.o.g(StubApp.getString2(23042));

    /* renamed from: e, reason: collision with root package name */
    public static final long f20706e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f20707a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.k f20708b;

    /* renamed from: c, reason: collision with root package name */
    public int f20709c = 0;

    public c(Context context, j2.k kVar) {
        this.f20707a = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f20708b = kVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(StubApp.getString2(1822));
        int i3 = J.a.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction(StubApp.getString2(23043));
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
        long currentTimeMillis = System.currentTimeMillis() + f20706e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.c.a():void");
    }

    public final boolean b() {
        this.f20708b.f15297d.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f20705d;
        if (isEmpty) {
            i2.o.e().b(str, StubApp.getString2(23050), new Throwable[0]);
            return true;
        }
        int i3 = f.f20714a;
        String processName = Application.getProcessName();
        boolean equals = !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, this.f20707a.getApplicationInfo().processName);
        i2.o.e().b(str, StubApp.getString2(23051) + equals, new Throwable[0]);
        return equals;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f20705d;
        j2.k kVar = this.f20708b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                j2.j.a(this.f20707a);
                i2.o.e().b(str, StubApp.getString2("23052"), new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i3 = this.f20709c + 1;
                    this.f20709c = i3;
                    if (i3 >= 3) {
                        String string2 = StubApp.getString2("23054");
                        i2.o.e().d(str, string2, e10);
                        IllegalStateException illegalStateException = new IllegalStateException(string2, e10);
                        kVar.f15297d.getClass();
                        throw illegalStateException;
                    }
                    i2.o.e().b(str, StubApp.getString2("23053") + (i3 * 300), e10);
                    try {
                        Thread.sleep(this.f20709c * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            kVar.M();
        }
    }
}
