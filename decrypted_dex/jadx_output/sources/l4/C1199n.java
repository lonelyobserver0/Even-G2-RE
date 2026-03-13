package l4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C0613f1;
import com.google.android.gms.internal.measurement.C0638k1;
import com.google.android.gms.internal.measurement.C0643l1;
import com.google.android.gms.internal.measurement.C0648m1;
import com.google.android.gms.internal.measurement.C0653n1;
import com.google.android.gms.internal.measurement.P3;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;

/* renamed from: l4.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1199n extends A1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f16516f = {StubApp.getString2(20617), StubApp.getString2(20618), StubApp.getString2(20619), StubApp.getString2(20620), StubApp.getString2(20621), StubApp.getString2(20622), StubApp.getString2(20623), StubApp.getString2(20624), StubApp.getString2(20625), StubApp.getString2(20626), StubApp.getString2(20384), StubApp.getString2(20616)};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f16517g = {StubApp.getString2(3139), StubApp.getString2(20628), StubApp.getString2(3140), StubApp.getString2(20627)};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f16518h = {StubApp.getString2(3353), StubApp.getString2(20629)};
    public static final String[] j = {StubApp.getString2(20029), StubApp.getString2(20632), StubApp.getString2(20221), StubApp.getString2(20633), StubApp.getString2(19915), StubApp.getString2(20634), StubApp.getString2(20220), StubApp.getString2(20635), StubApp.getString2(5223), StubApp.getString2(20636), StubApp.getString2(20637), StubApp.getString2(20638), StubApp.getString2(9948), StubApp.getString2(20639), StubApp.getString2(20640), StubApp.getString2(20641), StubApp.getString2(20642), StubApp.getString2(20643), StubApp.getString2(20644), StubApp.getString2(20645), StubApp.getString2(20439), StubApp.getString2(20646), StubApp.getString2(20647), StubApp.getString2(20648), StubApp.getString2(20649), StubApp.getString2(20650), StubApp.getString2(20027), StubApp.getString2(20651), StubApp.getString2(20219), StubApp.getString2(20652), StubApp.getString2(20653), StubApp.getString2(20654), StubApp.getString2(20655), StubApp.getString2(20656), StubApp.getString2(20657), StubApp.getString2(20658), StubApp.getString2(3495), StubApp.getString2(20659), StubApp.getString2(20660), StubApp.getString2(20661), StubApp.getString2(20662), StubApp.getString2(20663), StubApp.getString2(20664), StubApp.getString2(20665), StubApp.getString2(20666), StubApp.getString2(20667), StubApp.getString2(20216), StubApp.getString2(20668), StubApp.getString2(20669), StubApp.getString2(20670), StubApp.getString2(20671), StubApp.getString2(20672), StubApp.getString2(20440), StubApp.getString2(20673), StubApp.getString2(20441), StubApp.getString2(20674), StubApp.getString2(20214), StubApp.getString2(20675), StubApp.getString2(20676), StubApp.getString2(20677), StubApp.getString2(20239), StubApp.getString2(20678), StubApp.getString2(20679), StubApp.getString2(20680), StubApp.getString2(20240), StubApp.getString2(20681), StubApp.getString2(20682), StubApp.getString2(20683), StubApp.getString2(20684), StubApp.getString2(20685), StubApp.getString2(20686), StubApp.getString2(20687), StubApp.getString2(12426), StubApp.getString2(20688), StubApp.getString2(20689), StubApp.getString2(20690), StubApp.getString2(20691), StubApp.getString2(20692), StubApp.getString2(20693), StubApp.getString2(20694), StubApp.getString2(20695), StubApp.getString2(20696), StubApp.getString2(20697), StubApp.getString2(20698), StubApp.getString2(20699), StubApp.getString2(20700), StubApp.getString2(20701), StubApp.getString2(20702), StubApp.getString2(20703), StubApp.getString2(20704), StubApp.getString2(20265), StubApp.getString2(20705), StubApp.getString2(20630), StubApp.getString2(20631)};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f16519k = {StubApp.getString2(19845), StubApp.getString2(20706)};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f16520l = {StubApp.getString2(20708), StubApp.getString2(20709), StubApp.getString2(3137), StubApp.getString2(20707)};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f16521m;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f16522n;

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f16523p;

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f16524q;

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f16525r;

    /* renamed from: d, reason: collision with root package name */
    public final C1196m f16526d;

    /* renamed from: e, reason: collision with root package name */
    public final Cc.a f16527e;

    static {
        String string2 = StubApp.getString2(20710);
        String string22 = StubApp.getString2(20429);
        f16521m = new String[]{string22, string2};
        f16522n = new String[]{string22, StubApp.getString2(20711)};
        f16523p = new String[]{StubApp.getString2(19459), StubApp.getString2(20712)};
        f16524q = new String[]{StubApp.getString2(5206), StubApp.getString2(20715), StubApp.getString2(5207), StubApp.getString2(20716), StubApp.getString2(20713), StubApp.getString2(20714)};
        f16525r = new String[]{StubApp.getString2(20717), StubApp.getString2(20718)};
    }

    public C1199n(F1 f12) {
        super(f12);
        this.f16527e = new Cc.a(((C1200n0) this.f4728a).f16545l);
        ((C1200n0) this.f4728a).getClass();
        this.f16526d = new C1196m(this, ((C1200n0) this.f4728a).f16536a);
    }

    public static final String P(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        return E1.a.k(StubApp.getString2(20719), TextUtils.join(StubApp.getString2(81), arrayList), StubApp.getString2(9720));
    }

    public static final void X(ContentValues contentValues, Object obj) {
        String string2 = StubApp.getString2(1061);
        S3.D.e(string2);
        S3.D.h(obj);
        if (obj instanceof String) {
            contentValues.put(string2, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(string2, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException(StubApp.getString2(20720));
            }
            contentValues.put(string2, (Double) obj);
        }
    }

    public final void A(ArrayList arrayList) {
        S3.D.h(arrayList);
        k();
        l();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20721));
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 != 0) {
                sb2.append(StubApp.getString2(321));
            }
            sb2.append(((Long) arrayList.get(i3)).longValue());
        }
        sb2.append(StubApp.getString2(74));
        int delete = b0().delete(StubApp.getString2(19783), sb2.toString(), null);
        if (delete != arrayList.size()) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            Integer valueOf = Integer.valueOf(delete);
            Integer valueOf2 = Integer.valueOf(arrayList.size());
            t3.f16242f.d(StubApp.getString2(20722), valueOf, valueOf2);
        }
    }

    public final void B(String str) {
        try {
            b0().execSQL(StubApp.getString2("20723"), new String[]{str, str});
        } catch (SQLiteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            S s10 = T.s(str);
            t3.f16242f.d(StubApp.getString2(20724), s10, e10);
        }
    }

    public final long C(String str) {
        S3.D.e(str);
        return H(0L, StubApp.getString2(20725), new String[]{str});
    }

    public final void D(String str, Long l9, long j3, C0613f1 c0613f1) {
        k();
        l();
        S3.D.h(c0613f1);
        S3.D.e(str);
        byte[] a3 = c0613f1.a();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        T t3 = c1200n0.f16541f;
        T t10 = c1200n0.f16541f;
        C1200n0.l(t3);
        String a9 = c1200n0.f16544k.a(str);
        Integer valueOf = Integer.valueOf(a3.length);
        t3.f16249p.d(StubApp.getString2(20726), a9, valueOf);
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(1060), l9);
        contentValues.put(StubApp.getString2(20727), Long.valueOf(j3));
        contentValues.put(StubApp.getString2(20728), a3);
        try {
            if (b0().insertWithOnConflict(StubApp.getString2("20595"), null, contentValues, 5) == -1) {
                C1200n0.l(t10);
                t10.f16242f.c(T.s(str), StubApp.getString2("20729"));
            }
        } catch (SQLiteException e10) {
            C1200n0.l(t10);
            S s10 = T.s(str);
            t10.f16242f.d(StubApp.getString2(20730), s10, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f0 A[Catch: SQLiteException -> 0x030e, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x030e, blocks: (B:79:0x02cd, B:81:0x02f0), top: B:78:0x02cd }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r25, java.lang.Long r26, java.lang.String r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.E(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.C1224z0 F(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4728a
            l4.n0 r0 = (l4.C1200n0) r0
            S3.D.h(r5)
            r4.k()
            r4.l()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 20740(0x5104, float:2.9063E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.b0()     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L53
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L50 android.database.sqlite.SQLiteException -> L53
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            if (r1 != 0) goto L3f
            l4.T r1 = r0.f16541f     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            l4.C1200n0.l(r1)     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            Ac.b r1 = r1.f16249p     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            java.lang.String r3 = "20741"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            r1.b(r3)     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
        L37:
            r5.close()
            goto L69
        L3b:
            r0 = move-exception
            goto L4e
        L3d:
            r1 = move-exception
            goto L56
        L3f:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            l4.z0 r2 = l4.C1224z0.c(r3, r1)     // Catch: java.lang.Throwable -> L3b android.database.sqlite.SQLiteException -> L3d
            goto L37
        L4e:
            r2 = r5
            goto L6f
        L50:
            r5 = move-exception
            r0 = r5
            goto L6f
        L53:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L56:
            l4.T r0 = r0.f16541f     // Catch: java.lang.Throwable -> L3b
            l4.C1200n0.l(r0)     // Catch: java.lang.Throwable -> L3b
            Ac.b r0 = r0.f16242f     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "20742"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L3b
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L69
            goto L37
        L69:
            if (r2 != 0) goto L6e
            l4.z0 r5 = l4.C1224z0.f16709c
            return r5
        L6e:
            return r2
        L6f:
            if (r2 == 0) goto L74
            r2.close()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.F(java.lang.String):l4.z0");
    }

    public final long G(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = b0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException(StubApp.getString2("20743"));
                }
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            } catch (SQLiteException e10) {
                T t3 = ((C1200n0) this.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16242f.d(StubApp.getString2("20744"), str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long H(long j3, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = b0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j3 = cursor.getLong(0);
                }
                cursor.close();
                return j3;
            } catch (SQLiteException e10) {
                T t3 = ((C1200n0) this.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16242f.d(StubApp.getString2("20744"), str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = b0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e10) {
                T t3 = ((C1200n0) this.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16242f.d(StubApp.getString2("20744"), str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void J(ContentValues contentValues) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        String string2 = StubApp.getString2(20385);
        String string22 = StubApp.getString2(3132);
        String string23 = StubApp.getString2(19788);
        try {
            SQLiteDatabase b02 = b0();
            if (contentValues.getAsString(string22) == null) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.f16244h.c(T.s(string22), StubApp.getString2("20745"));
                return;
            }
            new StringBuilder(10).append(string2);
            if (b02.update(string23, contentValues, r6.toString(), new String[]{r5}) == 0 && b02.insertWithOnConflict(string23, null, contentValues, 5) == -1) {
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                t10.f16242f.d(StubApp.getString2("20746"), T.s(string23), T.s(string22));
            }
        } catch (SQLiteException e10) {
            T t11 = c1200n0.f16541f;
            C1200n0.l(t11);
            t11.f16242f.e(StubApp.getString2(20747), T.s(string23), T.s(string22), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.C1209s K(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.K(java.lang.String, java.lang.String, java.lang.String):l4.s");
    }

    public final void L(String str, C1209s c1209s) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        S3.D.h(c1209s);
        k();
        l();
        ContentValues contentValues = new ContentValues();
        String string2 = StubApp.getString2(3132);
        String str2 = c1209s.f16609a;
        contentValues.put(string2, str2);
        contentValues.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), c1209s.f16610b);
        contentValues.put(StubApp.getString2(20748), Long.valueOf(c1209s.f16611c));
        contentValues.put(StubApp.getString2(20749), Long.valueOf(c1209s.f16612d));
        contentValues.put(StubApp.getString2(20750), Long.valueOf(c1209s.f16614f));
        contentValues.put(StubApp.getString2(20617), Long.valueOf(c1209s.f16615g));
        contentValues.put(StubApp.getString2(20619), c1209s.f16616h);
        contentValues.put(StubApp.getString2(20621), c1209s.f16617i);
        contentValues.put(StubApp.getString2(20623), c1209s.j);
        contentValues.put(StubApp.getString2(20384), Long.valueOf(c1209s.f16613e));
        Boolean bool = c1209s.f16618k;
        contentValues.put(StubApp.getString2(20625), (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (b0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.f16242f.c(T.s(str2), StubApp.getString2("20754"));
            }
        } catch (SQLiteException e10) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.d(StubApp.getString2(20755), T.s(str2), e10);
        }
    }

    public final void M(String str, String str2) {
        S3.D.e(str2);
        k();
        l();
        try {
            b0().delete(str, StubApp.getString2("19778"), new String[]{str2});
        } catch (SQLiteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            S s10 = T.s(str2);
            t3.f16242f.d(StubApp.getString2(20756), s10, e10);
        }
    }

    public final G1 N(String str, long j3, byte[] bArr, String str2, String str3, int i3, int i10, long j10, long j11, long j12) {
        G1 g12;
        C1200n0 c1200n0;
        W0 w02;
        boolean isEmpty = TextUtils.isEmpty(str2);
        C1200n0 c1200n02 = (C1200n0) this.f4728a;
        if (isEmpty) {
            T t3 = c1200n02.f16541f;
            C1200n0.l(t3);
            t3.f16248n.b(StubApp.getString2(20757));
            return null;
        }
        try {
            C0638k1 c0638k1 = (C0638k1) W.X(C0643l1.w(), bArr);
            W0[] values = W0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    w02 = W0.f16270g;
                    break;
                }
                w02 = values[i11];
                if (w02.f16272a == i3) {
                    break;
                }
                i11++;
            }
            W0 w03 = w02;
            if (w03 != W0.f16266c && w03 != W0.f16269f && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((C0643l1) c0638k1.f11593b).p()).iterator();
                while (it.hasNext()) {
                    C0648m1 c0648m1 = (C0648m1) ((C0653n1) it.next()).i();
                    c0648m1.b();
                    ((C0653n1) c0648m1.f11593b).T0(i10);
                    arrayList.add((C0653n1) c0648m1.e());
                }
                c0638k1.b();
                ((C0643l1) c0638k1.f11593b).B();
                c0638k1.b();
                ((C0643l1) c0638k1.f11593b).A(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split(StubApp.getString2("4962"));
                int length2 = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split(StubApp.getString2("2359"), 2);
                    if (split2.length != 2) {
                        T t10 = c1200n02.f16541f;
                        C1200n0.l(t10);
                        t10.f16242f.c(str4, StubApp.getString2("20758"));
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            g12 = null;
            c1200n0 = c1200n02;
            try {
                return new G1(j3, (C0643l1) c0638k1.e(), str2, hashMap, w03, j10, j11, j12, i10);
            } catch (IOException e10) {
                e = e10;
                T t11 = c1200n0.f16541f;
                C1200n0.l(t11);
                t11.f16242f.d(StubApp.getString2(20759), str, e);
                return g12;
            }
        } catch (IOException e11) {
            e = e11;
            g12 = null;
            c1200n0 = c1200n02;
        }
    }

    public final String O() {
        ((C1200n0) this.f4728a).f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l9 = (Long) AbstractC1148D.f15958S.a(null);
        l9.getClass();
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20760));
        sb2.append(currentTimeMillis);
        String string2 = StubApp.getString2(20761);
        sb2.append(string2);
        sb2.append(l9);
        String string22 = StubApp.getString2(74);
        sb2.append(string22);
        String sb3 = sb2.toString();
        String q10 = Xa.h.q(AbstractC1482f.m(currentTimeMillis, StubApp.getString2(20762), string2), ((Long) AbstractC1148D.f15956R.a(null)).longValue(), string22);
        StringBuilder sb4 = new StringBuilder(i2.u.C(sb3.length(), 5, q10.length(), 1));
        E1.a.v(sb4, StubApp.getString2(2830), sb3, StubApp.getString2(20763), q10);
        sb4.append(string22);
        return sb4.toString();
    }

    public final void Q(String str, u1 u1Var) {
        k();
        l();
        S3.D.e(str);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C1147C c1147c = AbstractC1148D.f16023v0;
        long longValue = currentTimeMillis - ((Long) c1147c.a(null)).longValue();
        long j3 = u1Var.f16636b;
        T t3 = c1200n0.f16541f;
        if (j3 < longValue || j3 > ((Long) c1147c.a(null)).longValue() + currentTimeMillis) {
            C1200n0.l(t3);
            S s10 = T.s(str);
            Long valueOf = Long.valueOf(currentTimeMillis);
            Long valueOf2 = Long.valueOf(j3);
            t3.j.e(StubApp.getString2(20764), s10, valueOf, valueOf2);
        }
        C1200n0.l(t3);
        t3.f16249p.b(StubApp.getString2(20765));
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(19797), u1Var.f16635a);
        contentValues.put(StubApp.getString2(376), Integer.valueOf(u1Var.f16637c));
        contentValues.put(StubApp.getString2(19798), Long.valueOf(j3));
        try {
            if (b0().insert(StubApp.getString2("18357"), null, contentValues) == -1) {
                C1200n0.l(t3);
                t3.f16242f.c(T.s(str), StubApp.getString2("20766"));
            }
        } catch (SQLiteException e10) {
            C1200n0.l(t3);
            S s11 = T.s(str);
            t3.f16242f.d(StubApp.getString2(20767), s11, e10);
        }
    }

    public final void R(String str, C1224z0 c1224z0) {
        S3.D.h(str);
        S3.D.h(c1224z0);
        k();
        l();
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(20768), c1224z0.g());
        contentValues.put(StubApp.getString2(5206), Integer.valueOf(c1224z0.f16711b));
        J(contentValues);
    }

    public final void S(String str, C1224z0 c1224z0) {
        S3.D.h(str);
        k();
        l();
        R(str, F(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(20713), c1224z0.g());
        J(contentValues);
    }

    public final C1224z0 T(String str) {
        S3.D.h(str);
        k();
        l();
        return C1224z0.c(100, I(StubApp.getString2(20769), new String[]{str}));
    }

    public final C1209s U(String str, C0613f1 c0613f1, String str2) {
        C1209s K10 = K(StubApp.getString2(973), str, c0613f1.s());
        if (K10 != null) {
            long j3 = K10.f16613e + 1;
            long j10 = K10.f16612d + 1;
            return new C1209s(K10.f16609a, K10.f16610b, K10.f16611c + 1, j10, j3, K10.f16614f, K10.f16615g, K10.f16616h, K10.f16617i, K10.j, K10.f16618k);
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        S s10 = T.s(str);
        String a3 = c1200n0.f16544k.a(str2);
        t3.j.d(StubApp.getString2(20770), s10, a3);
        return new C1209s(str, c0613f1.s(), 1L, 1L, 1L, c0613f1.u(), 0L, null, null, null, null);
    }

    public final boolean V() {
        return ((C1200n0) this.f4728a).f16536a.getDatabasePath(StubApp.getString2(19677)).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0259 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(java.lang.String r21, long r22, long r24, R8.B r26) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.W(java.lang.String, long, long, R8.B):void");
    }

    public final void Y() {
        l();
        b0().beginTransaction();
    }

    public final void Z() {
        l();
        b0().setTransactionSuccessful();
    }

    public final void a0() {
        l();
        b0().endTransaction();
    }

    public final SQLiteDatabase b0() {
        k();
        try {
            return this.f16526d.getWritableDatabase();
        } catch (SQLiteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.j.c(e10, StubApp.getString2(20779));
            throw e10;
        }
    }

    public final void c0(String str) {
        C1209s K10;
        String string2 = StubApp.getString2(20572);
        M(string2, str);
        Cursor cursor = null;
        try {
            try {
                cursor = b0().query(StubApp.getString2("973"), (String[]) Collections.singletonList(StubApp.getString2(ModuleDescriptor.MODULE_VERSION)).toArray(new String[0]), StubApp.getString2("19778"), new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (K10 = K(StubApp.getString2("973"), str, string)) != null) {
                            L(string2, K10);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e10) {
                T t3 = ((C1200n0) this.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16242f.d(StubApp.getString2("20780"), T.s(str), e10);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        L(r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.d0(java.lang.String):void");
    }

    public final void e0(String str, String str2) {
        S3.D.e(str);
        S3.D.e(str2);
        k();
        l();
        try {
            b0().delete(StubApp.getString2("19780"), StubApp.getString2("20751"), new String[]{str, str2});
        } catch (SQLiteException e10) {
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            S s10 = T.s(str);
            String c10 = c1200n0.f16544k.c(str2);
            t3.f16242f.e(StubApp.getString2(20782), s10, c10, e10);
        }
    }

    public final boolean f0(I1 i12) {
        k();
        l();
        String str = i12.f16114a;
        String str2 = i12.f16116c;
        I1 g02 = g0(str, str2);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        String str3 = i12.f16115b;
        if (g02 == null) {
            if (K1.i0(str2)) {
                if (G(StubApp.getString2(20783), new String[]{str}) >= Math.max(Math.min(c1200n0.f16539d.s(str, AbstractC1148D.f15964V), 100), 25)) {
                    return false;
                }
            } else if (!StubApp.getString2(19571).equals(str2)) {
                long G4 = G(StubApp.getString2(20784), new String[]{str, str3});
                c1200n0.getClass();
                if (G4 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(3353), str3);
        contentValues.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), str2);
        contentValues.put(StubApp.getString2(20785), Long.valueOf(i12.f16117d));
        X(contentValues, i12.f16118e);
        try {
            if (b0().insertWithOnConflict(StubApp.getString2("19780"), null, contentValues, 5) != -1) {
                return true;
            }
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(T.s(str), StubApp.getString2("20786"));
            return true;
        } catch (SQLiteException e10) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.d(StubApp.getString2(20787), T.s(str), e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.I1 g0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4728a
            r1 = r0
            l4.n0 r1 = (l4.C1200n0) r1
            S3.D.e(r12)
            S3.D.e(r13)
            r11.k()
            r11.l()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.b0()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String r4 = "19780"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String r0 = "20785"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String r5 = "1061"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String r6 = "3353"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String r6 = "20751"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L92
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L89
            if (r0 != 0) goto L4b
            goto Lb1
        L4b:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L89
            r0 = 1
            java.lang.Object r10 = r11.x(r3, r0)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L89
            if (r10 != 0) goto L58
            goto Lb1
        L58:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L89
            l4.I1 r4 = new l4.I1     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L89
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            if (r12 == 0) goto L85
            l4.T r12 = r1.f16541f     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            l4.C1200n0.l(r12)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            Ac.b r12 = r12.f16242f     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            java.lang.String r13 = "20788"
            java.lang.String r13 = com.stub.StubApp.getString2(r13)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            l4.S r0 = l4.T.s(r5)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            r12.c(r0, r13)     // Catch: java.lang.Throwable -> L7f android.database.sqlite.SQLiteException -> L82
            goto L85
        L7f:
            r0 = move-exception
            r12 = r0
            goto L8d
        L82:
            r0 = move-exception
        L83:
            r12 = r0
            goto L97
        L85:
            r3.close()
            return r4
        L89:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L83
        L8d:
            r2 = r3
            goto Lb7
        L8f:
            r0 = move-exception
            r12 = r0
            goto Lb7
        L92:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L97:
            l4.T r13 = r1.f16541f     // Catch: java.lang.Throwable -> L7f
            l4.C1200n0.l(r13)     // Catch: java.lang.Throwable -> L7f
            Ac.b r13 = r13.f16242f     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = "20789"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L7f
            l4.S r4 = l4.T.s(r5)     // Catch: java.lang.Throwable -> L7f
            l4.O r1 = r1.f16544k     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L7f
            r13.e(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L7f
        Lb1:
            if (r3 == 0) goto Lb6
            r3.close()
        Lb6:
            return r2
        Lb7:
            if (r2 == 0) goto Lbc
            r2.close()
        Lbc:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.g0(java.lang.String, java.lang.String):l4.I1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f4728a
            r1 = r0
            l4.n0 r1 = (l4.C1200n0) r1
            S3.D.e(r13)
            r12.k()
            r12.l()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10 = 20546(0x5042, float:2.8791E-41)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.b0()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r3 = "19780"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r4 = "152"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r5 = "3353"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r6 = "20785"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r7 = "1061"
            java.lang.String r7 = com.stub.StubApp.getString2(r7)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r5 = "19778"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            java.lang.String r9 = "19799"
            java.lang.String r9 = com.stub.StubApp.getString2(r9)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            r1.getClass()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Lac
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            if (r2 == 0) goto Lc5
        L60:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            if (r2 != 0) goto L6e
            java.lang.String r2 = ""
        L6e:
            r5 = r2
            goto L73
        L70:
            r0 = move-exception
            r4 = r13
            goto Laf
        L73:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            r2 = 3
            java.lang.Object r9 = r12.x(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            if (r9 != 0) goto L98
            l4.T r2 = r1.f16541f     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            l4.C1200n0.l(r2)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            Ac.b r2 = r2.f16242f     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            java.lang.String r3 = "20790"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            l4.S r4 = l4.T.s(r13)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            r2.c(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            r4 = r13
            goto La1
        L95:
            r0 = move-exception
            r13 = r0
            goto Lcb
        L98:
            l4.I1 r3 = new l4.I1     // Catch: android.database.sqlite.SQLiteException -> L70 java.lang.Throwable -> L95
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Laa
            r0.add(r3)     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Laa
        La1:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L95 android.database.sqlite.SQLiteException -> Laa
            if (r13 != 0) goto La8
            goto Lc5
        La8:
            r13 = r4
            goto L60
        Laa:
            r0 = move-exception
            goto Laf
        Lac:
            r0 = move-exception
            r4 = r13
            r13 = r0
        Laf:
            l4.T r13 = r1.f16541f     // Catch: java.lang.Throwable -> L95
            l4.C1200n0.l(r13)     // Catch: java.lang.Throwable -> L95
            Ac.b r13 = r13.f16242f     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "20791"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L95
            l4.S r2 = l4.T.s(r4)     // Catch: java.lang.Throwable -> L95
            r13.d(r1, r2, r0)     // Catch: java.lang.Throwable -> L95
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L95
        Lc5:
            if (r11 == 0) goto Lca
            r11.close()
        Lca:
            return r0
        Lcb:
            if (r11 == 0) goto Ld0
            r11.close()
        Ld0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.h0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        l4.C1200n0.l(r8);
        r8.f16242f.c(1000, com.stub.StubApp.getString2("20795"));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.i0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean j0(C1172e c1172e) {
        k();
        l();
        String str = c1172e.f16410a;
        S3.D.h(str);
        I1 g02 = g0(str, c1172e.f16412c.f16100b);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (g02 == null) {
            long G4 = G(StubApp.getString2(20798), new String[]{str});
            c1200n0.getClass();
            if (G4 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(3353), c1172e.f16411b);
        contentValues.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), c1172e.f16412c.f16100b);
        Object d8 = c1172e.f16412c.d();
        S3.D.h(d8);
        X(contentValues, d8);
        contentValues.put(StubApp.getString2(12365), Boolean.valueOf(c1172e.f16414e));
        contentValues.put(StubApp.getString2(12356), c1172e.f16415f);
        contentValues.put(StubApp.getString2(12357), Long.valueOf(c1172e.f16417h));
        K1 k12 = c1200n0.j;
        T t3 = c1200n0.f16541f;
        C1200n0.j(k12);
        contentValues.put(StubApp.getString2(20799), K1.O(c1172e.f16416g));
        contentValues.put(StubApp.getString2(3138), Long.valueOf(c1172e.f16413d));
        C1200n0.j(c1200n0.j);
        contentValues.put(StubApp.getString2(20800), K1.O(c1172e.j));
        contentValues.put(StubApp.getString2(12366), Long.valueOf(c1172e.f16412c.f16101c));
        contentValues.put(StubApp.getString2(12362), Long.valueOf(c1172e.f16418k));
        contentValues.put(StubApp.getString2(20801), K1.O(c1172e.f16419l));
        try {
            if (b0().insertWithOnConflict(StubApp.getString2("19781"), null, contentValues, 5) != -1) {
                return true;
            }
            C1200n0.l(t3);
            t3.f16242f.c(T.s(str), StubApp.getString2("20802"));
            return true;
        } catch (SQLiteException e10) {
            C1200n0.l(t3);
            S s10 = T.s(str);
            t3.f16242f.d(StubApp.getString2(20803), s10, e10);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.C1172e k0(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.k0(java.lang.String, java.lang.String):l4.e");
    }

    public final void l0(String str, String str2) {
        S3.D.e(str);
        S3.D.e(str2);
        k();
        l();
        try {
            b0().delete(StubApp.getString2("19781"), StubApp.getString2("20751"), new String[]{str, str2});
        } catch (SQLiteException e10) {
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            S s10 = T.s(str);
            String c10 = c1200n0.f16544k.c(str2);
            t3.f16242f.e(StubApp.getString2(20806), s10, c10, e10);
        }
    }

    public final List m0(String str, String str2, String str3) {
        S3.D.e(str);
        k();
        l();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(19778));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(StubApp.getString2(20793));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(StubApp.getString2(602)));
            sb2.append(StubApp.getString2(20794));
        }
        return n0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // l4.A1
    public final void n() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        r3 = r2.f16541f;
        l4.C1200n0.l(r3);
        r3.f16242f.c(1000, com.stub.StubApp.getString2("20807"));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List n0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.n0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final long o(String str, C0643l1 c0643l1, String str2, Map map, W0 w02, Long l9) {
        int delete;
        k();
        l();
        S3.D.h(c0643l1);
        S3.D.e(str);
        k();
        l();
        boolean V10 = V();
        String string2 = StubApp.getString2(3130);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (V10) {
            F1 f12 = this.f16651b;
            long g10 = f12.j.f16509f.g();
            c1200n0.f16545l.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - g10) > ((Long) AbstractC1148D.f15946M.a(null)).longValue()) {
                f12.j.f16509f.h(elapsedRealtime);
                k();
                l();
                boolean V11 = V();
                T t3 = c1200n0.f16541f;
                if (V11 && (delete = b0().delete(string2, O(), new String[0])) > 0) {
                    C1200n0.l(t3);
                    t3.f16249p.c(Integer.valueOf(delete), StubApp.getString2(20809));
                }
                S3.D.e(str);
                k();
                l();
                try {
                    int s10 = c1200n0.f16539d.s(str, AbstractC1148D.f15922A);
                    if (s10 > 0) {
                        b0().delete(string2, StubApp.getString2("20810"), new String[]{str, String.valueOf(s10)});
                    }
                } catch (SQLiteException e10) {
                    C1200n0.l(t3);
                    t3.f16242f.d(StubApp.getString2(20811), T.s(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append(StubApp.getString2(2359));
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] a3 = c0643l1.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), str);
        contentValues.put(StubApp.getString2(3133), a3);
        contentValues.put(StubApp.getString2(3134), str2);
        contentValues.put(StubApp.getString2(3135), String.join(StubApp.getString2(4962), arrayList));
        contentValues.put(StubApp.getString2(3136), Integer.valueOf(w02.f16272a));
        W3.a aVar = c1200n0.f16545l;
        T t10 = c1200n0.f16541f;
        aVar.getClass();
        contentValues.put(StubApp.getString2(3138), Long.valueOf(System.currentTimeMillis()));
        contentValues.put(StubApp.getString2(3137), (Integer) 0);
        if (l9 != null) {
            contentValues.put(StubApp.getString2(3139), l9);
        }
        try {
            long insert = b0().insert(string2, null, contentValues);
            if (insert != -1) {
                return insert;
            }
            C1200n0.l(t10);
            t10.f16242f.c(str, StubApp.getString2("20812"));
            return -1L;
        } catch (SQLiteException e11) {
            C1200n0.l(t10);
            t10.f16242f.d(StubApp.getString2(20813), str, e11);
            return -1L;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0493: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:124:0x0493 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x04af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.X o0(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.o0(java.lang.String):l4.X");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(java.lang.String r19, l4.y1 r20, int r21) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.p(java.lang.String, l4.y1, int):java.util.List");
    }

    public final void p0(X x7, boolean z2) {
        String string2 = StubApp.getString2(19782);
        k();
        l();
        String D6 = x7.D();
        S3.D.h(D6);
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3132), D6);
        EnumC1222y0 enumC1222y0 = EnumC1222y0.f16685c;
        F1 f12 = this.f16651b;
        String string22 = StubApp.getString2(20190);
        if (z2) {
            contentValues.put(string22, (String) null);
        } else if (f12.d(D6).i(enumC1222y0)) {
            contentValues.put(string22, x7.E());
        }
        contentValues.put(StubApp.getString2(5221), x7.G());
        boolean i3 = f12.d(D6).i(EnumC1222y0.f16684b);
        C1200n0 c1200n0 = x7.f16292a;
        if (i3) {
            C1191k0 c1191k0 = c1200n0.f16542g;
            C1200n0.l(c1191k0);
            c1191k0.k();
            contentValues.put(StubApp.getString2(20814), x7.f16296e);
        }
        C1191k0 c1191k02 = c1200n0.f16542g;
        C1200n0.l(c1191k02);
        c1191k02.k();
        contentValues.put(StubApp.getString2(20815), Long.valueOf(x7.f16298g));
        C1191k0 c1191k03 = c1200n0.f16542g;
        C1200n0.l(c1191k03);
        c1191k03.k();
        contentValues.put(StubApp.getString2(20637), Long.valueOf(x7.f16299h));
        C1191k0 c1191k04 = c1200n0.f16542g;
        C1200n0.l(c1191k04);
        c1191k04.k();
        contentValues.put(StubApp.getString2(20816), Long.valueOf(x7.f16300i));
        contentValues.put(StubApp.getString2(20029), x7.N());
        C1191k0 c1191k05 = c1200n0.f16542g;
        C1200n0.l(c1191k05);
        c1191k05.k();
        contentValues.put(StubApp.getString2(20221), x7.f16302l);
        C1191k0 c1191k06 = c1200n0.f16542g;
        C1200n0.l(c1191k06);
        c1191k06.k();
        contentValues.put(StubApp.getString2(19915), Long.valueOf(x7.f16303m));
        C1191k0 c1191k07 = c1200n0.f16542g;
        C1200n0.l(c1191k07);
        c1191k07.k();
        contentValues.put(StubApp.getString2(20220), Long.valueOf(x7.f16304n));
        C1191k0 c1191k08 = c1200n0.f16542g;
        C1200n0.l(c1191k08);
        c1191k08.k();
        contentValues.put(StubApp.getString2(5223), Boolean.valueOf(x7.f16305o));
        C1191k0 c1191k09 = c1200n0.f16542g;
        C1200n0.l(c1191k09);
        c1191k09.k();
        contentValues.put(StubApp.getString2(9948), Long.valueOf(x7.f16282J));
        C1191k0 c1191k010 = c1200n0.f16542g;
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20640), Long.valueOf(x7.f16283K));
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20642), Long.valueOf(x7.f16284L));
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20644), Long.valueOf(x7.f16285M));
        C1191k0 c1191k011 = c1200n0.f16542g;
        C1200n0.l(c1191k011);
        c1191k011.k();
        contentValues.put(StubApp.getString2(20647), Long.valueOf(x7.f16290R));
        C1191k0 c1191k012 = c1200n0.f16542g;
        C1200n0.l(c1191k012);
        c1191k012.k();
        contentValues.put(StubApp.getString2(20649), Long.valueOf(x7.f16291S));
        contentValues.put(StubApp.getString2(20027), Long.valueOf(x7.P()));
        contentValues.put(StubApp.getString2(20219), x7.J());
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20653), Long.valueOf(x7.f16286N));
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20655), Long.valueOf(x7.f16287O));
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20657), x7.f16288P);
        contentValues.put(StubApp.getString2(3495), (Long) 0L);
        C1191k0 c1191k013 = c1200n0.f16542g;
        C1200n0.l(c1191k013);
        c1191k013.k();
        contentValues.put(StubApp.getString2(20660), Boolean.valueOf(x7.f16306p));
        contentValues.put(StubApp.getString2(20216), Long.valueOf(x7.b()));
        if (f12.d(D6).i(enumC1222y0)) {
            C1191k0 c1191k014 = c1200n0.f16542g;
            C1200n0.l(c1191k014);
            c1191k014.k();
            contentValues.put(StubApp.getString2(20214), x7.f16310t);
        }
        contentValues.put(StubApp.getString2(20676), Boolean.valueOf(x7.y()));
        C1191k0 c1191k015 = c1200n0.f16542g;
        C1200n0.l(c1191k015);
        c1191k015.k();
        contentValues.put(StubApp.getString2(20239), Long.valueOf(x7.f16312v));
        C1191k0 c1191k016 = c1200n0.f16542g;
        C1200n0.l(c1191k016);
        c1191k016.k();
        contentValues.put(StubApp.getString2(20679), Long.valueOf(x7.f16313w));
        P3.a();
        C1200n0 c1200n02 = (C1200n0) this.f4728a;
        if (c1200n02.f16539d.u(D6, AbstractC1148D.f15953P0)) {
            C1191k0 c1191k017 = c1200n0.f16542g;
            C1200n0.l(c1191k017);
            c1191k017.k();
            contentValues.put(StubApp.getString2(20240), Integer.valueOf(x7.f16314x));
            C1191k0 c1191k018 = c1200n0.f16542g;
            C1200n0.l(c1191k018);
            c1191k018.k();
            contentValues.put(StubApp.getString2(20686), Long.valueOf(x7.f16274B));
        }
        C1191k0 c1191k019 = c1200n0.f16542g;
        C1200n0.l(c1191k019);
        c1191k019.k();
        contentValues.put(StubApp.getString2(20682), Boolean.valueOf(x7.f16315y));
        contentValues.put(StubApp.getString2(20684), x7.w());
        C1191k0 c1191k020 = c1200n0.f16542g;
        C1200n0.l(c1191k020);
        c1191k020.k();
        contentValues.put(StubApp.getString2(20693), Long.valueOf(x7.f16278F));
        contentValues.put(StubApp.getString2(12426), x7.C());
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20689), Integer.valueOf(x7.f16276D));
        C1200n0.l(c1191k010);
        c1191k010.k();
        contentValues.put(StubApp.getString2(20691), Integer.valueOf(x7.f16277E));
        contentValues.put(StubApp.getString2(20695), x7.s());
        contentValues.put(StubApp.getString2(20265), Integer.valueOf(x7.t()));
        C1191k0 c1191k021 = c1200n0.f16542g;
        C1200n0.l(c1191k021);
        c1191k021.k();
        ArrayList arrayList = x7.f16309s;
        T t3 = c1200n02.f16541f;
        String string23 = StubApp.getString2(20669);
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C1200n0.l(t3);
                t3.j.c(D6, StubApp.getString2(20822));
            } else {
                contentValues.put(string23, TextUtils.join(StubApp.getString2(321), arrayList));
            }
        }
        if (c1200n02.f16539d.u(null, AbstractC1148D.f15943K0) && !contentValues.containsKey(string23)) {
            contentValues.put(string23, (String) null);
        }
        C1191k0 c1191k022 = c1200n0.f16542g;
        C1200n0.l(c1191k022);
        c1191k022.k();
        contentValues.put(StubApp.getString2(20697), x7.f16316z);
        C1191k0 c1191k023 = c1200n0.f16542g;
        C1200n0.l(c1191k023);
        c1191k023.k();
        contentValues.put(StubApp.getString2(20699), x7.f16273A);
        C1191k0 c1191k024 = c1200n0.f16542g;
        C1200n0.l(c1191k024);
        c1191k024.k();
        contentValues.put(StubApp.getString2(20701), x7.f16280H);
        try {
            SQLiteDatabase b02 = b0();
            if (b02.update(string2, contentValues, StubApp.getString2("20385"), new String[]{D6}) == 0 && b02.insertWithOnConflict(string2, null, contentValues, 5) == -1) {
                C1200n0.l(t3);
                t3.f16242f.c(T.s(D6), StubApp.getString2("20823"));
            }
        } catch (SQLiteException e10) {
            C1200n0.l(t3);
            t3.f16242f.d(StubApp.getString2(20824), T.s(D6), e10);
        }
    }

    public final boolean q(String str) {
        W0[] w0Arr = {W0.f16266c};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(w0Arr[0].f16272a));
        String P10 = P(arrayList);
        String O7 = O();
        StringBuilder sb2 = new StringBuilder(P10.length() + 61 + O7.length());
        sb2.append(StubApp.getString2(20825));
        sb2.append(P10);
        sb2.append(StubApp.getString2(20819));
        sb2.append(O7);
        return G(sb2.toString(), new String[]{str}) != 0;
    }

    public final C1187j q0(long j3, String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        return r0(j3, str, 1L, false, false, z2, false, z10, z11, z12);
    }

    public final void r(Long l9) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        k();
        l();
        try {
            if (b0().delete(StubApp.getString2("3130"), StubApp.getString2("20826"), new String[]{l9.toString()}) != 1) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.j.b(StubApp.getString2("20827"));
            }
        } catch (SQLiteException e10) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.c(e10, StubApp.getString2(20828));
            throw e10;
        }
    }

    public final C1187j r0(long j3, String str, long j10, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        S3.D.e(str);
        k();
        l();
        String[] strArr = {str};
        C1187j c1187j = new C1187j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase b02 = b0();
                cursor = b02.query(StubApp.getString2("19782"), new String[]{StubApp.getString2("9948"), StubApp.getString2("20642"), StubApp.getString2("20640"), StubApp.getString2("20644"), StubApp.getString2("20653"), StubApp.getString2("20655"), StubApp.getString2("20691"), StubApp.getString2("20703")}, StubApp.getString2("19778"), new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j3) {
                        c1187j.f16469b = cursor.getLong(1);
                        c1187j.f16468a = cursor.getLong(2);
                        c1187j.f16470c = cursor.getLong(3);
                        c1187j.f16471d = cursor.getLong(4);
                        c1187j.f16472e = cursor.getLong(5);
                        c1187j.f16473f = cursor.getLong(6);
                        c1187j.f16474g = cursor.getLong(7);
                    }
                    if (z2) {
                        c1187j.f16469b += j10;
                    }
                    if (z10) {
                        c1187j.f16468a += j10;
                    }
                    if (z11) {
                        c1187j.f16470c += j10;
                    }
                    if (z12) {
                        c1187j.f16471d += j10;
                    }
                    if (z13) {
                        c1187j.f16472e += j10;
                    }
                    if (z14) {
                        c1187j.f16473f += j10;
                    }
                    if (z15) {
                        c1187j.f16474g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(StubApp.getString2("9948"), Long.valueOf(j3));
                    contentValues.put(StubApp.getString2("20640"), Long.valueOf(c1187j.f16468a));
                    contentValues.put(StubApp.getString2("20642"), Long.valueOf(c1187j.f16469b));
                    contentValues.put(StubApp.getString2("20644"), Long.valueOf(c1187j.f16470c));
                    contentValues.put(StubApp.getString2("20653"), Long.valueOf(c1187j.f16471d));
                    contentValues.put(StubApp.getString2("20655"), Long.valueOf(c1187j.f16472e));
                    contentValues.put(StubApp.getString2("20691"), Long.valueOf(c1187j.f16473f));
                    contentValues.put(StubApp.getString2("20703"), Long.valueOf(c1187j.f16474g));
                    b02.update(StubApp.getString2("19782"), contentValues, StubApp.getString2("19778"), strArr);
                } else {
                    T t3 = c1200n0.f16541f;
                    C1200n0.l(t3);
                    t3.j.c(T.s(str), StubApp.getString2("20829"));
                }
            } catch (SQLiteException e10) {
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                t10.f16242f.d(StubApp.getString2("20830"), T.s(str), e10);
            }
            if (cursor != null) {
                cursor.close();
            }
            return c1187j;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String s() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.b0()
            r1 = 0
            java.lang.String r2 = "20831"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r2 == 0) goto L3f
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r0.close()
            return r1
        L1e:
            r1 = move-exception
            goto L22
        L20:
            r2 = move-exception
            goto L2b
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L45
        L26:
            r0 = move-exception
            goto L45
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            java.lang.Object r3 = r6.f4728a     // Catch: java.lang.Throwable -> L1e
            l4.n0 r3 = (l4.C1200n0) r3     // Catch: java.lang.Throwable -> L1e
            l4.T r3 = r3.f16541f     // Catch: java.lang.Throwable -> L1e
            l4.C1200n0.l(r3)     // Catch: java.lang.Throwable -> L1e
            Ac.b r3 = r3.f16242f     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "20832"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L1e
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1e
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            return r1
        L45:
            if (r1 == 0) goto L4a
            r1.close()
        L4a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.s():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0084: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:27:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a5.c s0(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4728a
            r1 = r0
            l4.n0 r1 = (l4.C1200n0) r1
            S3.D.e(r12)
            r11.k()
            r11.l()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.b0()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String r4 = "19782"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String r0 = "20439"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String r5 = "20440"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String r6 = "20441"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String r6 = "19778"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L89
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            if (r0 != 0) goto L47
            goto L9f
        L47:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            if (r6 == 0) goto L76
            l4.T r6 = r1.f16541f     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            l4.C1200n0.l(r6)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            Ac.b r6 = r6.f16242f     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            java.lang.String r7 = "20833"
            java.lang.String r7 = com.stub.StubApp.getString2(r7)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            l4.S r8 = l4.T.s(r12)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            goto L76
        L71:
            r0 = move-exception
            r12 = r0
            goto L84
        L74:
            r0 = move-exception
            goto L8b
        L76:
            if (r0 != 0) goto L79
            goto L9f
        L79:
            a5.c r6 = new a5.c     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            r7 = 13
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L74
            r3.close()
            return r6
        L84:
            r2 = r3
            goto La5
        L86:
            r0 = move-exception
            r12 = r0
            goto La5
        L89:
            r0 = move-exception
            r3 = r2
        L8b:
            l4.T r1 = r1.f16541f     // Catch: java.lang.Throwable -> L71
            l4.C1200n0.l(r1)     // Catch: java.lang.Throwable -> L71
            Ac.b r1 = r1.f16242f     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = "20834"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L71
            l4.S r12 = l4.T.s(r12)     // Catch: java.lang.Throwable -> L71
            r1.d(r4, r12, r0)     // Catch: java.lang.Throwable -> L71
        L9f:
            if (r3 == 0) goto La4
            r3.close()
        La4:
            return r2
        La5:
            if (r2 == 0) goto Laa
            r2.close()
        Laa:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.s0(java.lang.String):a5.c");
    }

    public final void t(long j3) {
        k();
        l();
        try {
            if (b0().delete(StubApp.getString2("20581"), StubApp.getString2("20826"), new String[]{String.valueOf(j3)}) == 1) {
            } else {
                throw new SQLiteException(StubApp.getString2("20835"));
            }
        } catch (SQLiteException e10) {
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(e10, StubApp.getString2(20836));
            throw e10;
        }
    }

    public final void t0(C0653n1 c0653n1, boolean z2) {
        k();
        l();
        S3.D.e(c0653n1.p());
        if (!c0653n1.b2()) {
            throw new IllegalStateException();
        }
        u();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.f16545l.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long c22 = c0653n1.c2();
        C1147C c1147c = AbstractC1148D.f15956R;
        long longValue = currentTimeMillis - ((Long) c1147c.a(null)).longValue();
        T t3 = c1200n0.f16541f;
        if (c22 < longValue || c0653n1.c2() > ((Long) c1147c.a(null)).longValue() + currentTimeMillis) {
            C1200n0.l(t3);
            S s10 = T.s(c0653n1.p());
            Long valueOf = Long.valueOf(currentTimeMillis);
            Long valueOf2 = Long.valueOf(c0653n1.c2());
            t3.j.e(StubApp.getString2(20837), s10, valueOf, valueOf2);
        }
        byte[] a3 = c0653n1.a();
        try {
            W w10 = this.f16651b.f16065g;
            F1.S(w10);
            byte[] W10 = w10.W(a3);
            C1200n0.l(t3);
            t3.f16249p.c(Integer.valueOf(W10.length), StubApp.getString2(20838));
            ContentValues contentValues = new ContentValues();
            contentValues.put(StubApp.getString2(3132), c0653n1.p());
            contentValues.put(StubApp.getString2(20839), Long.valueOf(c0653n1.c2()));
            contentValues.put(StubApp.getString2(1485), W10);
            contentValues.put(StubApp.getString2(20708), Integer.valueOf(z2 ? 1 : 0));
            if (c0653n1.p0()) {
                contentValues.put(StubApp.getString2(3137), Integer.valueOf(c0653n1.q0()));
            }
            try {
                if (b0().insert(StubApp.getString2("20581"), null, contentValues) == -1) {
                    C1200n0.l(t3);
                    t3.f16242f.c(T.s(c0653n1.p()), StubApp.getString2("20840"));
                }
            } catch (SQLiteException e10) {
                C1200n0.l(t3);
                S s11 = T.s(c0653n1.p());
                t3.f16242f.d(StubApp.getString2(20841), s11, e10);
            }
        } catch (IOException e11) {
            C1200n0.l(t3);
            S s12 = T.s(c0653n1.p());
            t3.f16242f.d(StubApp.getString2(20842), s12, e11);
        }
    }

    public final void u() {
        k();
        l();
        if (V()) {
            F1 f12 = this.f16651b;
            long g10 = f12.j.f16508e.g();
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            c1200n0.f16545l.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - g10) > ((Long) AbstractC1148D.f15946M.a(null)).longValue()) {
                f12.j.f16508e.h(elapsedRealtime);
                k();
                l();
                if (V()) {
                    SQLiteDatabase b02 = b0();
                    c1200n0.f16545l.getClass();
                    int delete = b02.delete(StubApp.getString2(20581), StubApp.getString2(20843), new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) AbstractC1148D.f15956R.a(null)).longValue())});
                    if (delete > 0) {
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        t3.f16249p.c(Integer.valueOf(delete), StubApp.getString2(20844));
                    }
                }
            }
        }
    }

    public final void v(ArrayList arrayList) {
        k();
        l();
        S3.D.h(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException(StubApp.getString2(20851));
        }
        String string2 = StubApp.getString2(20845);
        String string22 = StubApp.getString2(20846);
        if (V()) {
            String join = TextUtils.join(StubApp.getString2(321), arrayList);
            String n10 = E1.a.n(new StringBuilder(String.valueOf(join).length() + 2), StubApp.getString2(2830), join, StubApp.getString2(74));
            long G4 = G(E1.a.n(new StringBuilder(n10.length() + 80), StubApp.getString2(20847), n10, StubApp.getString2(20848)), null);
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            if (G4 > 0) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.j.b(StubApp.getString2(20849));
            }
            try {
                SQLiteDatabase b02 = b0();
                StringBuilder sb2 = new StringBuilder(n10.length() + CertificateBody.profileType);
                sb2.append(string22);
                sb2.append(n10);
                sb2.append(string2);
                b02.execSQL(sb2.toString());
            } catch (SQLiteException e10) {
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                t10.f16242f.c(e10, StubApp.getString2(20850));
            }
        }
    }

    public final void w(Long l9) {
        k();
        l();
        String string2 = StubApp.getString2(20852);
        String string22 = StubApp.getString2(20853);
        String string23 = StubApp.getString2(20854);
        String string24 = StubApp.getString2(20855);
        if (V()) {
            StringBuilder sb2 = new StringBuilder(l9.toString().length() + 86);
            sb2.append(StubApp.getString2(20856));
            sb2.append(l9);
            sb2.append(StubApp.getString2(20848));
            long G4 = G(sb2.toString(), null);
            C1200n0 c1200n0 = (C1200n0) this.f4728a;
            if (G4 > 0) {
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.j.b(StubApp.getString2(20849));
            }
            try {
                SQLiteDatabase b02 = b0();
                c1200n0.f16545l.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb3.append(string2);
                sb3.append(currentTimeMillis);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l9.toString().length() + 29);
                sb5.append(string24);
                sb5.append(sb4);
                sb5.append(string23);
                sb5.append(l9);
                sb5.append(string22);
                b02.execSQL(sb5.toString());
            } catch (SQLiteException e10) {
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                t10.f16242f.c(e10, StubApp.getString2(20850));
            }
        }
    }

    public final Object x(Cursor cursor, int i3) {
        int type = cursor.getType(i3);
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (type == 0) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20859));
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i3));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i3));
        }
        if (type == 3) {
            return cursor.getString(i3);
        }
        if (type == 4) {
            T t10 = c1200n0.f16541f;
            C1200n0.l(t10);
            t10.f16242f.b(StubApp.getString2(20858));
            return null;
        }
        T t11 = c1200n0.f16541f;
        C1200n0.l(t11);
        t11.f16242f.c(Integer.valueOf(type), StubApp.getString2(20857));
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(3:2|3|4)|(2:6|(3:8|9|10)(1:14))|15|16|(1:18)(2:21|22)|19|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
    
        r0 = r0.f16541f;
        l4.C1200n0.l(r0);
        r0.f16242f.e(com.stub.StubApp.getString2("20864"), l4.T.s(r14), r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e4, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f4728a
            l4.n0 r0 = (l4.C1200n0) r0
            r1 = 20860(0x517c, float:2.9231E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            S3.D.e(r14)
            r2 = 20861(0x517d, float:2.9232E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            S3.D.e(r2)
            r13.k()
            r13.l()
            android.database.sqlite.SQLiteDatabase r3 = r13.b0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r6.append(r1)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r7 = -1
            long r9 = r13.H(r7, r1, r6)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r6 = 20594(0x5072, float:2.8858E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r11 = 3132(0xc3c, float:4.389E-42)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            if (r1 != 0) goto L8e
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r1.<init>()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            java.lang.String r10 = "19459"
            java.lang.String r10 = com.stub.StubApp.getString2(r10)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L8d
            l4.T r1 = r0.f16541f     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            l4.C1200n0.l(r1)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            Ac.b r1 = r1.f16242f     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            java.lang.String r6 = "20862"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            l4.S r9 = l4.T.s(r14)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            r1.d(r6, r9, r2)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> L8b
            goto Le5
        L89:
            r14 = move-exception
            goto Le9
        L8b:
            r1 = move-exception
            goto Ld0
        L8d:
            r9 = r4
        L8e:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            r1.<init>()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            java.lang.String r11 = "20385"
            java.lang.String r11 = com.stub.StubApp.getString2(r11)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto Lca
            l4.T r1 = r0.f16541f     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            l4.C1200n0.l(r1)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            Ac.b r1 = r1.f16242f     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            java.lang.String r4 = "20863"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            l4.S r5 = l4.T.s(r14)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            r1.d(r4, r5, r2)     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            goto Le5
        Lc8:
            r1 = move-exception
            goto Lcf
        Lca:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L89 android.database.sqlite.SQLiteException -> Lc8
            r7 = r9
            goto Le5
        Lcf:
            r4 = r9
        Ld0:
            l4.T r0 = r0.f16541f     // Catch: java.lang.Throwable -> L89
            l4.C1200n0.l(r0)     // Catch: java.lang.Throwable -> L89
            Ac.b r0 = r0.f16242f     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "20864"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L89
            l4.S r14 = l4.T.s(r14)     // Catch: java.lang.Throwable -> L89
            r0.e(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L89
            r7 = r4
        Le5:
            r3.endTransaction()
            return r7
        Le9:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1199n.y(java.lang.String):long");
    }

    public final boolean z(String str, String str2) {
        return G(StubApp.getString2(20865), new String[]{str, str2}) > 0;
    }
}
