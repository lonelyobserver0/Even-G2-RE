package A3;

import Z9.C0366a;
import a0.C0379a;
import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import k5.C1107b;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.json.JSONObject;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public Object f189a;

    /* renamed from: b, reason: collision with root package name */
    public Object f190b;

    /* renamed from: c, reason: collision with root package name */
    public Object f191c;

    /* renamed from: d, reason: collision with root package name */
    public Object f192d;

    /* renamed from: e, reason: collision with root package name */
    public Object f193e;

    /* renamed from: f, reason: collision with root package name */
    public Object f194f;

    /* renamed from: g, reason: collision with root package name */
    public Object f195g;

    /* renamed from: h, reason: collision with root package name */
    public Object f196h;

    /* renamed from: i, reason: collision with root package name */
    public Object f197i;

    public s(WorkDatabase_Impl database) {
        this.f189a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f190b = new Q2.c(database, 6);
        this.f191c = new Q2.e(database, 4);
        this.f192d = new Q2.e(database, 5);
        this.f193e = new Q2.e(database, 6);
        this.f194f = new Q2.e(database, 7);
        this.f195g = new Q2.e(database, 8);
        this.f196h = new Q2.e(database, 9);
        this.f197i = new Q2.e(database, 10);
        new Q2.e(database, 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(A3.s r8, java.util.List r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.s.a(A3.s, java.util.List, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void m(JSONObject jSONObject, String str) {
        StringBuilder b2 = AbstractC1856e.b(str);
        b2.append(jSONObject.toString());
        String sb2 = b2.toString();
        String string2 = StubApp.getString2(280);
        if (Log.isLoggable(string2, 3)) {
            Log.d(string2, sb2, null);
        }
    }

    public void b(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Q2.e eVar = (Q2.e) this.f191c;
        P1.k a3 = eVar.a();
        if (str == null) {
            a3.x(1);
        } else {
            a3.g(1, str);
        }
        workDatabase_Impl.c();
        try {
            a3.d();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            eVar.d(a3);
        }
    }

    public ArrayList c() {
        J1.v vVar;
        int k3;
        int k4;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        int k15;
        int k16;
        int k17;
        int k18;
        int k19;
        int k20;
        J1.v e10 = J1.v.e(1, StubApp.getString2(281));
        e10.m(1, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            k3 = D1.k(StubApp.getString2("282"), u2);
            k4 = D1.k(StubApp.getString2("283"), u2);
            k10 = D1.k(StubApp.getString2("284"), u2);
            k11 = D1.k(StubApp.getString2("285"), u2);
            k12 = D1.k(StubApp.getString2("286"), u2);
            k13 = D1.k(StubApp.getString2("287"), u2);
            k14 = D1.k(StubApp.getString2("288"), u2);
            k15 = D1.k(StubApp.getString2("289"), u2);
            k16 = D1.k(StubApp.getString2("290"), u2);
            k17 = D1.k(StubApp.getString2("291"), u2);
            k18 = D1.k(StubApp.getString2("292"), u2);
            k19 = D1.k(StubApp.getString2("293"), u2);
            k20 = D1.k(StubApp.getString2("294"), u2);
            vVar = e10;
        } catch (Throwable th) {
            th = th;
            vVar = e10;
        }
        try {
            int k21 = D1.k(StubApp.getString2("295"), u2);
            int k22 = D1.k(StubApp.getString2("296"), u2);
            int k23 = D1.k(StubApp.getString2("297"), u2);
            int k24 = D1.k(StubApp.getString2("298"), u2);
            int k25 = D1.k(StubApp.getString2("299"), u2);
            int k26 = D1.k(StubApp.getString2("300"), u2);
            int k27 = D1.k(StubApp.getString2("301"), u2);
            int k28 = D1.k(StubApp.getString2("302"), u2);
            int k29 = D1.k(StubApp.getString2("303"), u2);
            int k30 = D1.k(StubApp.getString2("304"), u2);
            int k31 = D1.k(StubApp.getString2("305"), u2);
            int k32 = D1.k(StubApp.getString2("306"), u2);
            int i3 = k21;
            ArrayList arrayList = new ArrayList(u2.getCount());
            while (u2.moveToNext()) {
                String string = u2.getString(k16);
                int i10 = k16;
                String string2 = u2.getString(k18);
                int i11 = k18;
                i2.b bVar = new i2.b();
                int i12 = k3;
                bVar.f14718a = hc.b.L(u2.getInt(k3));
                bVar.f14719b = u2.getInt(k4) != 0;
                bVar.f14720c = u2.getInt(k10) != 0;
                bVar.f14721d = u2.getInt(k11) != 0;
                bVar.f14722e = u2.getInt(k12) != 0;
                int i13 = k4;
                int i14 = k10;
                bVar.f14723f = u2.getLong(k13);
                bVar.f14724g = u2.getLong(k14);
                bVar.f14725h = hc.b.f(u2.getBlob(k15));
                r2.f fVar = new r2.f(string, string2);
                fVar.f20303b = hc.b.N(u2.getInt(k17));
                fVar.f20305d = u2.getString(k19);
                fVar.f20306e = i2.g.a(u2.getBlob(k20));
                int i15 = i3;
                fVar.f20307f = i2.g.a(u2.getBlob(i15));
                int i16 = k20;
                int i17 = k22;
                fVar.f20308g = u2.getLong(i17);
                i3 = i15;
                int i18 = k23;
                fVar.f20309h = u2.getLong(i18);
                int i19 = k11;
                int i20 = k24;
                fVar.f20310i = u2.getLong(i20);
                int i21 = k25;
                fVar.f20311k = u2.getInt(i21);
                int i22 = k26;
                fVar.f20312l = hc.b.K(u2.getInt(i22));
                k24 = i20;
                int i23 = k27;
                fVar.f20313m = u2.getLong(i23);
                int i24 = k28;
                fVar.f20314n = u2.getLong(i24);
                k28 = i24;
                int i25 = k29;
                fVar.f20315o = u2.getLong(i25);
                int i26 = k30;
                fVar.f20316p = u2.getLong(i26);
                int i27 = k31;
                fVar.f20317q = u2.getInt(i27) != 0;
                int i28 = k32;
                fVar.f20318r = hc.b.M(u2.getInt(i28));
                fVar.j = bVar;
                arrayList.add(fVar);
                k27 = i23;
                k11 = i19;
                k26 = i22;
                k32 = i28;
                k4 = i13;
                k22 = i17;
                k23 = i18;
                k25 = i21;
                k30 = i26;
                k18 = i11;
                k3 = i12;
                k31 = i27;
                k29 = i25;
                k20 = i16;
                k16 = i10;
                k10 = i14;
            }
            u2.close();
            vVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            u2.close();
            vVar.h();
            throw th;
        }
    }

    public C1107b d(int i3) {
        String string2 = StubApp.getString2(280);
        C1107b c1107b = null;
        try {
            if (!AbstractC1856e.a(2, i3)) {
                JSONObject w10 = ((C0379a) this.f193e).w();
                if (w10 != null) {
                    C1107b D6 = ((C0366a) this.f191c).D(w10);
                    m(w10, StubApp.getString2("307"));
                    ((c5.C) this.f192d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (AbstractC1856e.a(3, i3) || D6.f15439c >= currentTimeMillis) {
                        try {
                            String string22 = StubApp.getString2("309");
                            if (Log.isLoggable(string2, 2)) {
                                Log.v(string2, string22, null);
                            }
                            return D6;
                        } catch (Exception e10) {
                            e = e10;
                            c1107b = D6;
                            Log.e(string2, StubApp.getString2(311), e);
                            return c1107b;
                        }
                    }
                    String string23 = StubApp.getString2("308");
                    if (Log.isLoggable(string2, 2)) {
                        Log.v(string2, string23, null);
                        return null;
                    }
                } else {
                    String string24 = StubApp.getString2("310");
                    if (Log.isLoggable(string2, 3)) {
                        Log.d(string2, string24, null);
                    }
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public ArrayList e(int i3) {
        J1.v vVar;
        int k3;
        int k4;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        int k15;
        int k16;
        int k17;
        int k18;
        int k19;
        int k20;
        J1.v e10 = J1.v.e(1, StubApp.getString2(312));
        e10.m(1, i3);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            k3 = D1.k(StubApp.getString2("282"), u2);
            k4 = D1.k(StubApp.getString2("283"), u2);
            k10 = D1.k(StubApp.getString2("284"), u2);
            k11 = D1.k(StubApp.getString2("285"), u2);
            k12 = D1.k(StubApp.getString2("286"), u2);
            k13 = D1.k(StubApp.getString2("287"), u2);
            k14 = D1.k(StubApp.getString2("288"), u2);
            k15 = D1.k(StubApp.getString2("289"), u2);
            k16 = D1.k(StubApp.getString2("290"), u2);
            k17 = D1.k(StubApp.getString2("291"), u2);
            k18 = D1.k(StubApp.getString2("292"), u2);
            k19 = D1.k(StubApp.getString2("293"), u2);
            k20 = D1.k(StubApp.getString2("294"), u2);
            vVar = e10;
        } catch (Throwable th) {
            th = th;
            vVar = e10;
        }
        try {
            int k21 = D1.k(StubApp.getString2("295"), u2);
            int k22 = D1.k(StubApp.getString2("296"), u2);
            int k23 = D1.k(StubApp.getString2("297"), u2);
            int k24 = D1.k(StubApp.getString2("298"), u2);
            int k25 = D1.k(StubApp.getString2("299"), u2);
            int k26 = D1.k(StubApp.getString2("300"), u2);
            int k27 = D1.k(StubApp.getString2("301"), u2);
            int k28 = D1.k(StubApp.getString2("302"), u2);
            int k29 = D1.k(StubApp.getString2("303"), u2);
            int k30 = D1.k(StubApp.getString2("304"), u2);
            int k31 = D1.k(StubApp.getString2("305"), u2);
            int k32 = D1.k(StubApp.getString2("306"), u2);
            int i10 = k21;
            ArrayList arrayList = new ArrayList(u2.getCount());
            while (u2.moveToNext()) {
                String string = u2.getString(k16);
                int i11 = k16;
                String string2 = u2.getString(k18);
                int i12 = k18;
                i2.b bVar = new i2.b();
                int i13 = k3;
                bVar.f14718a = hc.b.L(u2.getInt(k3));
                bVar.f14719b = u2.getInt(k4) != 0;
                bVar.f14720c = u2.getInt(k10) != 0;
                bVar.f14721d = u2.getInt(k11) != 0;
                bVar.f14722e = u2.getInt(k12) != 0;
                int i14 = k4;
                int i15 = k10;
                bVar.f14723f = u2.getLong(k13);
                bVar.f14724g = u2.getLong(k14);
                bVar.f14725h = hc.b.f(u2.getBlob(k15));
                r2.f fVar = new r2.f(string, string2);
                fVar.f20303b = hc.b.N(u2.getInt(k17));
                fVar.f20305d = u2.getString(k19);
                fVar.f20306e = i2.g.a(u2.getBlob(k20));
                int i16 = i10;
                fVar.f20307f = i2.g.a(u2.getBlob(i16));
                int i17 = k22;
                int i18 = k20;
                fVar.f20308g = u2.getLong(i17);
                i10 = i16;
                int i19 = k23;
                fVar.f20309h = u2.getLong(i19);
                int i20 = k11;
                int i21 = k24;
                fVar.f20310i = u2.getLong(i21);
                int i22 = k25;
                fVar.f20311k = u2.getInt(i22);
                int i23 = k26;
                fVar.f20312l = hc.b.K(u2.getInt(i23));
                k24 = i21;
                int i24 = k27;
                fVar.f20313m = u2.getLong(i24);
                int i25 = k28;
                fVar.f20314n = u2.getLong(i25);
                k28 = i25;
                int i26 = k29;
                fVar.f20315o = u2.getLong(i26);
                int i27 = k30;
                fVar.f20316p = u2.getLong(i27);
                int i28 = k31;
                fVar.f20317q = u2.getInt(i28) != 0;
                int i29 = k32;
                fVar.f20318r = hc.b.M(u2.getInt(i29));
                fVar.j = bVar;
                arrayList.add(fVar);
                k27 = i24;
                k11 = i20;
                k26 = i23;
                k32 = i29;
                k4 = i14;
                k30 = i27;
                k16 = i11;
                k18 = i12;
                k3 = i13;
                k31 = i28;
                k20 = i18;
                k22 = i17;
                k23 = i19;
                k25 = i22;
                k29 = i26;
                k10 = i15;
            }
            u2.close();
            vVar.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            u2.close();
            vVar.h();
            throw th;
        }
    }

    public ArrayList f() {
        J1.v vVar;
        J1.v e10 = J1.v.e(0, StubApp.getString2(313));
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            int k3 = D1.k(StubApp.getString2("282"), u2);
            int k4 = D1.k(StubApp.getString2("283"), u2);
            int k10 = D1.k(StubApp.getString2("284"), u2);
            int k11 = D1.k(StubApp.getString2("285"), u2);
            int k12 = D1.k(StubApp.getString2("286"), u2);
            int k13 = D1.k(StubApp.getString2("287"), u2);
            int k14 = D1.k(StubApp.getString2("288"), u2);
            int k15 = D1.k(StubApp.getString2("289"), u2);
            int k16 = D1.k(StubApp.getString2("290"), u2);
            int k17 = D1.k(StubApp.getString2("291"), u2);
            int k18 = D1.k(StubApp.getString2("292"), u2);
            int k19 = D1.k(StubApp.getString2("293"), u2);
            int k20 = D1.k(StubApp.getString2("294"), u2);
            vVar = e10;
            try {
                int k21 = D1.k(StubApp.getString2("295"), u2);
                int k22 = D1.k(StubApp.getString2("296"), u2);
                int k23 = D1.k(StubApp.getString2("297"), u2);
                int k24 = D1.k(StubApp.getString2("298"), u2);
                int k25 = D1.k(StubApp.getString2("299"), u2);
                int k26 = D1.k(StubApp.getString2("300"), u2);
                int k27 = D1.k(StubApp.getString2("301"), u2);
                int k28 = D1.k(StubApp.getString2("302"), u2);
                int k29 = D1.k(StubApp.getString2("303"), u2);
                int k30 = D1.k(StubApp.getString2("304"), u2);
                int k31 = D1.k(StubApp.getString2("305"), u2);
                int k32 = D1.k(StubApp.getString2("306"), u2);
                int i3 = k21;
                ArrayList arrayList = new ArrayList(u2.getCount());
                while (u2.moveToNext()) {
                    String string = u2.getString(k16);
                    int i10 = k16;
                    String string2 = u2.getString(k18);
                    int i11 = k18;
                    i2.b bVar = new i2.b();
                    int i12 = k3;
                    bVar.f14718a = hc.b.L(u2.getInt(k3));
                    bVar.f14719b = u2.getInt(k4) != 0;
                    bVar.f14720c = u2.getInt(k10) != 0;
                    bVar.f14721d = u2.getInt(k11) != 0;
                    bVar.f14722e = u2.getInt(k12) != 0;
                    int i13 = k4;
                    int i14 = k10;
                    bVar.f14723f = u2.getLong(k13);
                    bVar.f14724g = u2.getLong(k14);
                    bVar.f14725h = hc.b.f(u2.getBlob(k15));
                    r2.f fVar = new r2.f(string, string2);
                    fVar.f20303b = hc.b.N(u2.getInt(k17));
                    fVar.f20305d = u2.getString(k19);
                    fVar.f20306e = i2.g.a(u2.getBlob(k20));
                    int i15 = i3;
                    fVar.f20307f = i2.g.a(u2.getBlob(i15));
                    int i16 = k20;
                    int i17 = k22;
                    fVar.f20308g = u2.getLong(i17);
                    i3 = i15;
                    int i18 = k23;
                    fVar.f20309h = u2.getLong(i18);
                    int i19 = k11;
                    int i20 = k24;
                    fVar.f20310i = u2.getLong(i20);
                    int i21 = k25;
                    fVar.f20311k = u2.getInt(i21);
                    int i22 = k26;
                    fVar.f20312l = hc.b.K(u2.getInt(i22));
                    k24 = i20;
                    int i23 = k27;
                    fVar.f20313m = u2.getLong(i23);
                    int i24 = k28;
                    fVar.f20314n = u2.getLong(i24);
                    k28 = i24;
                    int i25 = k29;
                    fVar.f20315o = u2.getLong(i25);
                    int i26 = k30;
                    fVar.f20316p = u2.getLong(i26);
                    int i27 = k31;
                    fVar.f20317q = u2.getInt(i27) != 0;
                    int i28 = k32;
                    fVar.f20318r = hc.b.M(u2.getInt(i28));
                    fVar.j = bVar;
                    arrayList.add(fVar);
                    k27 = i23;
                    k11 = i19;
                    k26 = i22;
                    k32 = i28;
                    k4 = i13;
                    k22 = i17;
                    k23 = i18;
                    k25 = i21;
                    k30 = i26;
                    k18 = i11;
                    k3 = i12;
                    k31 = i27;
                    k29 = i25;
                    k20 = i16;
                    k16 = i10;
                    k10 = i14;
                }
                u2.close();
                vVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                u2.close();
                vVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = e10;
        }
    }

    public ArrayList g() {
        J1.v vVar;
        J1.v e10 = J1.v.e(0, StubApp.getString2(314));
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            int k3 = D1.k(StubApp.getString2("282"), u2);
            int k4 = D1.k(StubApp.getString2("283"), u2);
            int k10 = D1.k(StubApp.getString2("284"), u2);
            int k11 = D1.k(StubApp.getString2("285"), u2);
            int k12 = D1.k(StubApp.getString2("286"), u2);
            int k13 = D1.k(StubApp.getString2("287"), u2);
            int k14 = D1.k(StubApp.getString2("288"), u2);
            int k15 = D1.k(StubApp.getString2("289"), u2);
            int k16 = D1.k(StubApp.getString2("290"), u2);
            int k17 = D1.k(StubApp.getString2("291"), u2);
            int k18 = D1.k(StubApp.getString2("292"), u2);
            int k19 = D1.k(StubApp.getString2("293"), u2);
            int k20 = D1.k(StubApp.getString2("294"), u2);
            vVar = e10;
            try {
                int k21 = D1.k(StubApp.getString2("295"), u2);
                int k22 = D1.k(StubApp.getString2("296"), u2);
                int k23 = D1.k(StubApp.getString2("297"), u2);
                int k24 = D1.k(StubApp.getString2("298"), u2);
                int k25 = D1.k(StubApp.getString2("299"), u2);
                int k26 = D1.k(StubApp.getString2("300"), u2);
                int k27 = D1.k(StubApp.getString2("301"), u2);
                int k28 = D1.k(StubApp.getString2("302"), u2);
                int k29 = D1.k(StubApp.getString2("303"), u2);
                int k30 = D1.k(StubApp.getString2("304"), u2);
                int k31 = D1.k(StubApp.getString2("305"), u2);
                int k32 = D1.k(StubApp.getString2("306"), u2);
                int i3 = k21;
                ArrayList arrayList = new ArrayList(u2.getCount());
                while (u2.moveToNext()) {
                    String string = u2.getString(k16);
                    int i10 = k16;
                    String string2 = u2.getString(k18);
                    int i11 = k18;
                    i2.b bVar = new i2.b();
                    int i12 = k3;
                    bVar.f14718a = hc.b.L(u2.getInt(k3));
                    bVar.f14719b = u2.getInt(k4) != 0;
                    bVar.f14720c = u2.getInt(k10) != 0;
                    bVar.f14721d = u2.getInt(k11) != 0;
                    bVar.f14722e = u2.getInt(k12) != 0;
                    int i13 = k4;
                    int i14 = k10;
                    bVar.f14723f = u2.getLong(k13);
                    bVar.f14724g = u2.getLong(k14);
                    bVar.f14725h = hc.b.f(u2.getBlob(k15));
                    r2.f fVar = new r2.f(string, string2);
                    fVar.f20303b = hc.b.N(u2.getInt(k17));
                    fVar.f20305d = u2.getString(k19);
                    fVar.f20306e = i2.g.a(u2.getBlob(k20));
                    int i15 = i3;
                    fVar.f20307f = i2.g.a(u2.getBlob(i15));
                    int i16 = k20;
                    int i17 = k22;
                    fVar.f20308g = u2.getLong(i17);
                    i3 = i15;
                    int i18 = k23;
                    fVar.f20309h = u2.getLong(i18);
                    int i19 = k11;
                    int i20 = k24;
                    fVar.f20310i = u2.getLong(i20);
                    int i21 = k25;
                    fVar.f20311k = u2.getInt(i21);
                    int i22 = k26;
                    fVar.f20312l = hc.b.K(u2.getInt(i22));
                    k24 = i20;
                    int i23 = k27;
                    fVar.f20313m = u2.getLong(i23);
                    int i24 = k28;
                    fVar.f20314n = u2.getLong(i24);
                    k28 = i24;
                    int i25 = k29;
                    fVar.f20315o = u2.getLong(i25);
                    int i26 = k30;
                    fVar.f20316p = u2.getLong(i26);
                    int i27 = k31;
                    fVar.f20317q = u2.getInt(i27) != 0;
                    int i28 = k32;
                    fVar.f20318r = hc.b.M(u2.getInt(i28));
                    fVar.j = bVar;
                    arrayList.add(fVar);
                    k27 = i23;
                    k11 = i19;
                    k26 = i22;
                    k32 = i28;
                    k4 = i13;
                    k22 = i17;
                    k23 = i18;
                    k25 = i21;
                    k30 = i26;
                    k18 = i11;
                    k3 = i12;
                    k31 = i27;
                    k29 = i25;
                    k20 = i16;
                    k16 = i10;
                    k10 = i14;
                }
                u2.close();
                vVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                u2.close();
                vVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            vVar = e10;
        }
    }

    public C1107b h() {
        return (C1107b) ((AtomicReference) this.f196h).get();
    }

    public int i(String str) {
        J1.v e10 = J1.v.e(1, StubApp.getString2(315));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            return u2.moveToFirst() ? hc.b.N(u2.getInt(0)) : 0;
        } finally {
            u2.close();
            e10.h();
        }
    }

    public ArrayList j(String str) {
        J1.v e10 = J1.v.e(1, StubApp.getString2(316));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            ArrayList arrayList = new ArrayList(u2.getCount());
            while (u2.moveToNext()) {
                arrayList.add(u2.getString(0));
            }
            return arrayList;
        } finally {
            u2.close();
            e10.h();
        }
    }

    public r2.f k(String str) {
        J1.v vVar;
        int k3;
        int k4;
        int k10;
        int k11;
        int k12;
        int k13;
        int k14;
        int k15;
        int k16;
        int k17;
        int k18;
        int k19;
        int k20;
        r2.f fVar;
        J1.v e10 = J1.v.e(1, StubApp.getString2(317));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            k3 = D1.k(StubApp.getString2("282"), u2);
            k4 = D1.k(StubApp.getString2("283"), u2);
            k10 = D1.k(StubApp.getString2("284"), u2);
            k11 = D1.k(StubApp.getString2("285"), u2);
            k12 = D1.k(StubApp.getString2("286"), u2);
            k13 = D1.k(StubApp.getString2("287"), u2);
            k14 = D1.k(StubApp.getString2("288"), u2);
            k15 = D1.k(StubApp.getString2("289"), u2);
            k16 = D1.k(StubApp.getString2("290"), u2);
            k17 = D1.k(StubApp.getString2("291"), u2);
            k18 = D1.k(StubApp.getString2("292"), u2);
            k19 = D1.k(StubApp.getString2("293"), u2);
            k20 = D1.k(StubApp.getString2("294"), u2);
            vVar = e10;
        } catch (Throwable th) {
            th = th;
            vVar = e10;
        }
        try {
            int k21 = D1.k(StubApp.getString2("295"), u2);
            int k22 = D1.k(StubApp.getString2("296"), u2);
            int k23 = D1.k(StubApp.getString2("297"), u2);
            int k24 = D1.k(StubApp.getString2("298"), u2);
            int k25 = D1.k(StubApp.getString2("299"), u2);
            int k26 = D1.k(StubApp.getString2("300"), u2);
            int k27 = D1.k(StubApp.getString2("301"), u2);
            int k28 = D1.k(StubApp.getString2("302"), u2);
            int k29 = D1.k(StubApp.getString2("303"), u2);
            int k30 = D1.k(StubApp.getString2("304"), u2);
            int k31 = D1.k(StubApp.getString2("305"), u2);
            int k32 = D1.k(StubApp.getString2("306"), u2);
            if (u2.moveToFirst()) {
                String string = u2.getString(k16);
                String string2 = u2.getString(k18);
                i2.b bVar = new i2.b();
                bVar.f14718a = hc.b.L(u2.getInt(k3));
                bVar.f14719b = u2.getInt(k4) != 0;
                bVar.f14720c = u2.getInt(k10) != 0;
                bVar.f14721d = u2.getInt(k11) != 0;
                bVar.f14722e = u2.getInt(k12) != 0;
                bVar.f14723f = u2.getLong(k13);
                bVar.f14724g = u2.getLong(k14);
                bVar.f14725h = hc.b.f(u2.getBlob(k15));
                fVar = new r2.f(string, string2);
                fVar.f20303b = hc.b.N(u2.getInt(k17));
                fVar.f20305d = u2.getString(k19);
                fVar.f20306e = i2.g.a(u2.getBlob(k20));
                fVar.f20307f = i2.g.a(u2.getBlob(k21));
                fVar.f20308g = u2.getLong(k22);
                fVar.f20309h = u2.getLong(k23);
                fVar.f20310i = u2.getLong(k24);
                fVar.f20311k = u2.getInt(k25);
                fVar.f20312l = hc.b.K(u2.getInt(k26));
                fVar.f20313m = u2.getLong(k27);
                fVar.f20314n = u2.getLong(k28);
                fVar.f20315o = u2.getLong(k29);
                fVar.f20316p = u2.getLong(k30);
                fVar.f20317q = u2.getInt(k31) != 0;
                fVar.f20318r = hc.b.M(u2.getInt(k32));
                fVar.j = bVar;
            } else {
                fVar = null;
            }
            u2.close();
            vVar.h();
            return fVar;
        } catch (Throwable th2) {
            th = th2;
            u2.close();
            vVar.h();
            throw th;
        }
    }

    public ArrayList l(String str) {
        J1.v e10 = J1.v.e(1, StubApp.getString2(318));
        if (str == null) {
            e10.x(1);
        } else {
            e10.g(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Cursor u2 = F1.u(workDatabase_Impl, e10);
        try {
            int k3 = D1.k(StubApp.getString2("290"), u2);
            int k4 = D1.k(StubApp.getString2("291"), u2);
            ArrayList arrayList = new ArrayList(u2.getCount());
            while (u2.moveToNext()) {
                r2.e eVar = new r2.e();
                eVar.f20299a = u2.getString(k3);
                eVar.f20300b = hc.b.N(u2.getInt(k4));
                arrayList.add(eVar);
            }
            return arrayList;
        } finally {
            u2.close();
            e10.h();
        }
    }

    public void n(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Q2.e eVar = (Q2.e) this.f196h;
        P1.k a3 = eVar.a();
        a3.m(1, j);
        if (str == null) {
            a3.x(2);
        } else {
            a3.g(2, str);
        }
        workDatabase_Impl.c();
        try {
            a3.d();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            eVar.d(a3);
        }
    }

    public void o(String str, i2.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Q2.e eVar = (Q2.e) this.f192d;
        P1.k a3 = eVar.a();
        byte[] c10 = i2.g.c(gVar);
        if (c10 == null) {
            a3.x(1);
        } else {
            a3.o(1, c10);
        }
        if (str == null) {
            a3.x(2);
        } else {
            a3.g(2, str);
        }
        workDatabase_Impl.c();
        try {
            a3.d();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            eVar.d(a3);
        }
    }

    public void p(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        Q2.e eVar = (Q2.e) this.f193e;
        P1.k a3 = eVar.a();
        a3.m(1, j);
        if (str == null) {
            a3.x(2);
        } else {
            a3.g(2, str);
        }
        workDatabase_Impl.c();
        try {
            a3.d();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            eVar.d(a3);
        }
    }

    public void q(int i3, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f189a;
        workDatabase_Impl.b();
        StringBuilder builder = new StringBuilder();
        builder.append(StubApp.getString2(319));
        int length = strArr.length;
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i10 = 0; i10 < length; i10++) {
            builder.append(StubApp.getString2(DilithiumEngine.DilithiumPolyT1PackedBytes));
            if (i10 < length - 1) {
                builder.append(StubApp.getString2(321));
            }
        }
        builder.append(StubApp.getString2(74));
        String sql = builder.toString();
        Intrinsics.checkNotNullParameter(sql, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        P1.k e10 = workDatabase_Impl.g().s().e(sql);
        e10.m(1, hc.b.X(i3));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                e10.x(i11);
            } else {
                e10.g(i11, str);
            }
            i11++;
        }
        workDatabase_Impl.c();
        try {
            e10.d();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }
}
