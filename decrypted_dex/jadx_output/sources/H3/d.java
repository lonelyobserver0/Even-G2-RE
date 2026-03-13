package H3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.D1;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2707a;

    /* renamed from: b, reason: collision with root package name */
    public final I3.d f2708b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2709c;

    public d(Context context, I3.d dVar, b bVar) {
        this.f2707a = context;
        this.f2708b = dVar;
        this.f2709c = bVar;
    }

    public final void a(B3.j jVar, int i3, boolean z2) {
        Context context = this.f2707a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(StubApp.getString2(2528));
        Adler32 adler32 = new Adler32();
        String packageName = context.getPackageName();
        String string2 = StubApp.getString2(640);
        adler32.update(packageName.getBytes(Charset.forName(string2)));
        adler32.update(jVar.f628a.getBytes(Charset.forName(string2)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        y3.d dVar = jVar.f630c;
        adler32.update(allocate.putInt(L3.a.a(dVar)).array());
        byte[] bArr = jVar.f629b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        String string22 = StubApp.getString2(2529);
        String string23 = StubApp.getString2(2530);
        if (!z2) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt(string23);
                if (next.getId() == value) {
                    if (i10 >= i3) {
                        D1.e(string22, StubApp.getString2(2531), jVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a3 = ((I3.h) this.f2708b).a();
        String valueOf = String.valueOf(L3.a.a(dVar));
        String str = jVar.f628a;
        Cursor rawQuery = a3.rawQuery(StubApp.getString2(2532), new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f2709c;
            builder.setMinimumLatency(bVar.a(dVar, longValue, i3));
            Set set = ((c) bVar.f2703b.get(dVar)).f2706c;
            if (set.contains(e.f2710a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f2712c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f2711b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt(string23, i3);
            persistableBundle.putString(StubApp.getString2(2533), str);
            persistableBundle.putInt(StubApp.getString2(1044), L3.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString(StubApp.getString2(702), Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {jVar, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i3)), valueOf2, Integer.valueOf(i3)};
            String concat = StubApp.getString2(1063).concat(string22);
            if (Log.isLoggable(concat, 3)) {
                Log.d(concat, String.format(StubApp.getString2(2534), objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
