package androidx.work.impl.workers;

import A3.s;
import J1.v;
import V6.b;
import Y.m;
import a5.c;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import i2.g;
import i2.o;
import i2.u;
import j2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import r2.C1565c;
import r2.f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: g, reason: collision with root package name */
    public static final String f10398g = o.g("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String i(m mVar, b bVar, c cVar, ArrayList arrayList) {
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            C1565c u2 = cVar.u(fVar.f20302a);
            Integer valueOf = u2 != null ? Integer.valueOf(u2.f20296b) : null;
            String str2 = fVar.f20302a;
            mVar.getClass();
            v e10 = v.e(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                e10.x(1);
            } else {
                e10.g(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mVar.f8674b;
            workDatabase_Impl.b();
            Cursor u10 = F1.u(workDatabase_Impl, e10);
            try {
                ArrayList arrayList2 = new ArrayList(u10.getCount());
                while (u10.moveToNext()) {
                    arrayList2.add(u10.getString(0));
                }
                u10.close();
                e10.h();
                ArrayList F3 = bVar.F(fVar.f20302a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", F3);
                String str3 = fVar.f20302a;
                String str4 = fVar.f20304c;
                switch (fVar.f20303b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder t3 = u.t("\n", str3, "\t ", str4, "\t ");
                t3.append(valueOf);
                t3.append("\t ");
                t3.append(str);
                t3.append("\t ");
                t3.append(join);
                t3.append("\t ");
                t3.append(join2);
                t3.append("\t");
                sb2.append(t3.toString());
            } catch (Throwable th) {
                u10.close();
                e10.h();
                throw th;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final i2.m h() {
        v vVar;
        c cVar;
        m mVar;
        b bVar;
        int i3;
        WorkDatabase workDatabase = k.L(this.f10355a).f15298e;
        s u2 = workDatabase.u();
        m s10 = workDatabase.s();
        b v2 = workDatabase.v();
        c r8 = workDatabase.r();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        u2.getClass();
        v e10 = v.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        e10.m(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) u2.f189a;
        workDatabase_Impl.b();
        Cursor u10 = F1.u(workDatabase_Impl, e10);
        try {
            int k3 = D1.k("required_network_type", u10);
            int k4 = D1.k("requires_charging", u10);
            int k10 = D1.k("requires_device_idle", u10);
            int k11 = D1.k("requires_battery_not_low", u10);
            int k12 = D1.k("requires_storage_not_low", u10);
            int k13 = D1.k("trigger_content_update_delay", u10);
            int k14 = D1.k("trigger_max_content_delay", u10);
            int k15 = D1.k("content_uri_triggers", u10);
            int k16 = D1.k("id", u10);
            int k17 = D1.k("state", u10);
            int k18 = D1.k("worker_class_name", u10);
            vVar = e10;
            try {
                int k19 = D1.k("input_merger_class_name", u10);
                int k20 = D1.k("input", u10);
                int k21 = D1.k("output", u10);
                int k22 = D1.k("initial_delay", u10);
                int k23 = D1.k("interval_duration", u10);
                int k24 = D1.k("flex_duration", u10);
                int k25 = D1.k("run_attempt_count", u10);
                int k26 = D1.k("backoff_policy", u10);
                int k27 = D1.k("backoff_delay_duration", u10);
                int k28 = D1.k("period_start_time", u10);
                int k29 = D1.k("minimum_retention_duration", u10);
                int k30 = D1.k("schedule_requested_at", u10);
                int k31 = D1.k("run_in_foreground", u10);
                int k32 = D1.k("out_of_quota_policy", u10);
                int i10 = k21;
                ArrayList arrayList = new ArrayList(u10.getCount());
                while (u10.moveToNext()) {
                    String string = u10.getString(k16);
                    int i11 = k16;
                    String string2 = u10.getString(k18);
                    int i12 = k18;
                    i2.b bVar2 = new i2.b();
                    int i13 = k3;
                    bVar2.f14718a = hc.b.L(u10.getInt(k3));
                    bVar2.f14719b = u10.getInt(k4) != 0;
                    bVar2.f14720c = u10.getInt(k10) != 0;
                    bVar2.f14721d = u10.getInt(k11) != 0;
                    bVar2.f14722e = u10.getInt(k12) != 0;
                    int i14 = k4;
                    int i15 = k10;
                    bVar2.f14723f = u10.getLong(k13);
                    bVar2.f14724g = u10.getLong(k14);
                    bVar2.f14725h = hc.b.f(u10.getBlob(k15));
                    f fVar = new f(string, string2);
                    fVar.f20303b = hc.b.N(u10.getInt(k17));
                    fVar.f20305d = u10.getString(k19);
                    fVar.f20306e = g.a(u10.getBlob(k20));
                    int i16 = i10;
                    fVar.f20307f = g.a(u10.getBlob(i16));
                    int i17 = k17;
                    int i18 = k22;
                    int i19 = k20;
                    fVar.f20308g = u10.getLong(i18);
                    int i20 = k19;
                    int i21 = k23;
                    fVar.f20309h = u10.getLong(i21);
                    int i22 = k24;
                    fVar.f20310i = u10.getLong(i22);
                    int i23 = k25;
                    fVar.f20311k = u10.getInt(i23);
                    int i24 = k26;
                    fVar.f20312l = hc.b.K(u10.getInt(i24));
                    int i25 = k27;
                    fVar.f20313m = u10.getLong(i25);
                    int i26 = k28;
                    fVar.f20314n = u10.getLong(i26);
                    int i27 = k29;
                    fVar.f20315o = u10.getLong(i27);
                    int i28 = k30;
                    fVar.f20316p = u10.getLong(i28);
                    int i29 = k31;
                    fVar.f20317q = u10.getInt(i29) != 0;
                    int i30 = k32;
                    fVar.f20318r = hc.b.M(u10.getInt(i30));
                    fVar.j = bVar2;
                    arrayList.add(fVar);
                    k29 = i27;
                    k19 = i20;
                    k24 = i22;
                    k25 = i23;
                    k26 = i24;
                    i10 = i16;
                    k20 = i19;
                    k4 = i14;
                    k23 = i21;
                    k27 = i25;
                    k28 = i26;
                    k31 = i29;
                    k18 = i12;
                    k32 = i30;
                    k30 = i28;
                    k22 = i18;
                    k17 = i17;
                    k16 = i11;
                    k10 = i15;
                    k3 = i13;
                }
                u10.close();
                vVar.h();
                ArrayList f10 = u2.f();
                ArrayList c10 = u2.c();
                boolean isEmpty = arrayList.isEmpty();
                String str = f10398g;
                if (isEmpty) {
                    cVar = r8;
                    mVar = s10;
                    bVar = v2;
                    i3 = 0;
                } else {
                    i3 = 0;
                    o.e().f(str, "Recently completed work:\n\n", new Throwable[0]);
                    cVar = r8;
                    mVar = s10;
                    bVar = v2;
                    o.e().f(str, i(mVar, bVar, cVar, arrayList), new Throwable[0]);
                }
                if (!f10.isEmpty()) {
                    o.e().f(str, "Running work:\n\n", new Throwable[i3]);
                    o.e().f(str, i(mVar, bVar, cVar, f10), new Throwable[i3]);
                }
                if (!c10.isEmpty()) {
                    o.e().f(str, "Enqueued work:\n\n", new Throwable[i3]);
                    o.e().f(str, i(mVar, bVar, cVar, c10), new Throwable[i3]);
                }
                return new i2.m(g.f14736c);
            } catch (Throwable th) {
                th = th;
                u10.close();
                vVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = e10;
        }
    }
}
