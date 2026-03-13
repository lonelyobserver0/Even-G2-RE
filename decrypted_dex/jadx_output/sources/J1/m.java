package J1;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import q8.AbstractC1526a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f3330m = {StubApp.getString2(2909), StubApp.getString2(2910), StubApp.getString2(2908)};

    /* renamed from: a, reason: collision with root package name */
    public final r f3331a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3332b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3333c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f3334d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3335e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3336f;

    /* renamed from: g, reason: collision with root package name */
    public volatile P1.k f3337g;

    /* renamed from: h, reason: collision with root package name */
    public final j f3338h;

    /* renamed from: i, reason: collision with root package name */
    public final p.f f3339i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3340k;

    /* renamed from: l, reason: collision with root package name */
    public final l f3341l;

    public m(r database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        String string2;
        String string22;
        Object value;
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f3331a = database;
        this.f3332b = shadowTablesMap;
        int i3 = 0;
        this.f3335e = new AtomicBoolean(false);
        this.f3338h = new j(tableNames.length);
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullExpressionValue(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.f3339i = new p.f();
        this.j = new Object();
        this.f3340k = new Object();
        this.f3333c = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        while (true) {
            string2 = StubApp.getString2(2911);
            string22 = StubApp.getString2(2912);
            if (i3 >= length) {
                break;
            }
            String str2 = tableNames[i3];
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, string22);
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, string2);
            this.f3333c.put(lowerCase, Integer.valueOf(i3));
            String str3 = (String) this.f3332b.get(tableNames[i3]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(locale, string22);
                str = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, string2);
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i3] = lowerCase;
            i3++;
        }
        this.f3334d = strArr;
        for (Map.Entry entry : this.f3332b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale2, string22);
            String lowerCase2 = str4.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, string2);
            if (this.f3333c.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(locale2, string22);
                String lowerCase3 = str5.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, string2);
                LinkedHashMap linkedHashMap = this.f3333c;
                value = MapsKt__MapsKt.getValue(linkedHashMap, lowerCase2);
                linkedHashMap.put(lowerCase3, value);
            }
        }
        this.f3341l = new l(this, 0);
    }

    public final boolean a() {
        if (!this.f3331a.l()) {
            return false;
        }
        if (!this.f3336f) {
            this.f3331a.g().s();
        }
        if (this.f3336f) {
            return true;
        }
        Log.e(StubApp.getString2(53), StubApp.getString2(2913));
        return false;
    }

    public final void b(P1.c cVar, int i3) {
        cVar.k(StubApp.getString2(2914) + i3 + StubApp.getString2(2915));
        String str = this.f3334d[i3];
        String[] strArr = f3330m;
        for (int i10 = 0; i10 < 3; i10++) {
            String str2 = strArr[i10];
            String str3 = StubApp.getString2(2916) + AbstractC1526a.w(str, str2) + StubApp.getString2(2917) + str2 + StubApp.getString2(2918) + str + StubApp.getString2(2919) + i3 + StubApp.getString2(2920);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            cVar.k(str3);
        }
    }

    public final void c(P1.c database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.v()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f3331a.f3372i.readLock();
            Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
            readLock.lock();
            try {
                synchronized (this.j) {
                    int[] a3 = this.f3338h.a();
                    if (a3 != null) {
                        Intrinsics.checkNotNullParameter(database, "database");
                        if (database.A()) {
                            database.d();
                        } else {
                            database.a();
                        }
                        try {
                            int length = a3.length;
                            int i3 = 0;
                            int i10 = 0;
                            while (i3 < length) {
                                int i11 = a3[i3];
                                int i12 = i10 + 1;
                                if (i11 == 1) {
                                    b(database, i10);
                                } else if (i11 == 2) {
                                    String str = this.f3334d[i10];
                                    String[] strArr = f3330m;
                                    for (int i13 = 0; i13 < 3; i13++) {
                                        String str2 = StubApp.getString2("2921") + AbstractC1526a.w(str, strArr[i13]);
                                        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.k(str2);
                                    }
                                }
                                i3++;
                                i10 = i12;
                            }
                            database.G();
                            database.h();
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            database.h();
                            throw th;
                        }
                    }
                }
            } finally {
                readLock.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", StubApp.getString2(2907), e10);
        } catch (IllegalStateException e11) {
            Log.e(StubApp.getString2(53), StubApp.getString2(2907), e11);
        }
    }
}
