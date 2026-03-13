package U9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static Boolean f7499n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7500a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7501b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7502c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7503d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7504e;

    /* renamed from: h, reason: collision with root package name */
    public g f7507h;

    /* renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f7508i;

    /* renamed from: l, reason: collision with root package name */
    public Integer f7510l;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7505f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f7506g = new HashMap();
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7509k = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f7511m = 0;

    public d(Context context, String str, int i3, boolean z2, int i10) {
        this.f7504e = context;
        this.f7501b = str;
        this.f7500a = z2;
        this.f7502c = i3;
        this.f7503d = i10;
    }

    public static HashMap c(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i3 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i3 = cursor.getColumnCount();
                hashMap.put(StubApp.getString2(6391), Arrays.asList(cursor.getColumnNames()));
                hashMap.put(StubApp.getString2(6392), arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i10 = 0; i10 < i3; i10++) {
                int type = cursor.getType(i10);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i10) : cursor.getString(i10) : Double.valueOf(cursor.getDouble(i10)) : Long.valueOf(cursor.getLong(i10)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a() {
        HashMap hashMap = this.f7506g;
        if (!hashMap.isEmpty() && this.f7503d >= 1) {
            Log.d(StubApp.getString2(6389), h() + hashMap.size() + StubApp.getString2(6393));
        }
        this.f7508i.close();
    }

    public final void b(i iVar) {
        try {
            int i3 = iVar.f7527a;
            if (a.a(this.f7503d)) {
                Log.d(StubApp.getString2("6389"), h() + StubApp.getString2("6394") + i3);
            }
            this.f7506g.remove(Integer.valueOf(i3));
            iVar.f7529c.close();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(hc.b r11) {
        /*
            r10 = this;
            boolean r0 = r10.g(r11)
            r1 = 0
            if (r0 != 0) goto L9
            goto Ld8
        L9:
            boolean r0 = r11.E()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L15
            r11.d(r2)
            return r3
        L15:
            r0 = 6395(0x18fb, float:8.961E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            android.database.sqlite.SQLiteDatabase r4 = r10.f7508i     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Lcc
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch: java.lang.Throwable -> Lca java.lang.Exception -> Lcc
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto La5
            int r5 = r0.getCount()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r5 <= 0) goto La5
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r5 == 0) goto La5
            int r5 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            int r6 = r10.f7503d
            if (r5 != 0) goto L75
            if (r6 < r3) goto L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r6 = "6396"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            long r6 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r6 = "74"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            android.util.Log.d(r4, r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            goto L6e
        L69:
            r11 = move-exception
            r2 = r0
            goto Ld9
        L6c:
            r2 = move-exception
            goto Ld0
        L6e:
            r11.d(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r0.close()
            return r3
        L75:
            long r7 = r0.getLong(r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r6 < r3) goto L9a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r5 = r10.h()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.append(r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r5 = "6397"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.append(r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r2.append(r7)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            android.util.Log.d(r4, r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
        L9a:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r11.d(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r0.close()
            return r3
        La5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r6 = r10.h()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r6 = "6398"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r11.d(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            return r3
        Lca:
            r11 = move-exception
            goto Ld9
        Lcc:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
        Ld0:
            r10.i(r2, r11)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto Ld8
            r0.close()
        Ld8:
            return r1
        Ld9:
            if (r2 == 0) goto Lde
            r2.close()
        Lde:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: U9.d.d(hc.b):boolean");
    }

    public final boolean e(hc.b bVar) {
        Cursor cursor;
        Integer num = (Integer) bVar.u(StubApp.getString2(6399));
        String str = (String) bVar.u(StubApp.getString2(4779));
        o oVar = new o(str, (List) bVar.u(StubApp.getString2(6400)));
        if (this.f7503d >= 1) {
            Log.d(StubApp.getString2(6389), h() + oVar);
        }
        i iVar = null;
        try {
            cursor = this.f7508i.rawQueryWithFactory(new P1.a(oVar, 1), str, a.f7495a, null);
            try {
                try {
                    HashMap c10 = c(cursor, num);
                    if (num != null && !cursor.isLast() && !cursor.isAfterLast()) {
                        int i3 = this.f7511m + 1;
                        this.f7511m = i3;
                        c10.put(StubApp.getString2("6384"), Integer.valueOf(i3));
                        i iVar2 = new i(i3, num.intValue(), cursor);
                        try {
                            this.f7506g.put(Integer.valueOf(i3), iVar2);
                            iVar = iVar2;
                        } catch (Exception e10) {
                            e = e10;
                            iVar = iVar2;
                            i(e, bVar);
                            if (iVar != null) {
                                b(iVar);
                            }
                            if (iVar != null || cursor == null) {
                                return false;
                            }
                            cursor.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            iVar = iVar2;
                            if (iVar == null && cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    bVar.d(c10);
                    if (iVar == null) {
                        cursor.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    public final boolean f(hc.b bVar) {
        if (g(bVar)) {
            Cursor cursor = null;
            if (bVar.E()) {
                bVar.d(null);
                return true;
            }
            try {
                try {
                    Cursor rawQuery = this.f7508i.rawQuery(StubApp.getString2("6401"), null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                                int i3 = rawQuery.getInt(0);
                                if (this.f7503d >= 1) {
                                    Log.d("Sqflite", h() + StubApp.getString2("6402") + i3);
                                }
                                bVar.d(Integer.valueOf(i3));
                                rawQuery.close();
                                return true;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            cursor = rawQuery;
                            i(e, bVar);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", h() + StubApp.getString2("6403"));
                    bVar.d(null);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return true;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final boolean g(hc.b bVar) {
        String str = (String) bVar.u(StubApp.getString2(4779));
        o oVar = new o(str, (List) bVar.u(StubApp.getString2(6400)));
        if (this.f7503d >= 1) {
            Log.d(StubApp.getString2(6389), h() + oVar);
        }
        Object u2 = bVar.u(StubApp.getString2(6381));
        Boolean bool = u2 instanceof Boolean ? (Boolean) u2 : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f7508i;
            ArrayList arrayList = new ArrayList();
            List list = oVar.f7561b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(o.a(it.next()));
                }
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e10) {
            i(e10, bVar);
            return false;
        }
    }

    public final String h() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        Thread currentThread = Thread.currentThread();
        sb2.append(this.f7502c + StubApp.getString2(321) + currentThread.getName() + StubApp.getString2(2830) + currentThread.getId() + StubApp.getString2(74));
        sb2.append(StubApp.getString2(1558));
        return sb2.toString();
    }

    public final void i(Exception exc, hc.b bVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            bVar.m(StubApp.getString2(6404) + this.f7501b, null);
            return;
        }
        boolean z2 = exc instanceof SQLException;
        String string2 = StubApp.getString2(6400);
        String string22 = StubApp.getString2(4779);
        if (z2) {
            String message = exc.getMessage();
            String str = (String) bVar.u(string22);
            Collection collection = (List) bVar.u(string2);
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put(string22, str);
            hashMap.put(string2, collection);
            bVar.m(message, hashMap);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) bVar.u(string22);
        Collection collection2 = (List) bVar.u(string2);
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(string22, str2);
        hashMap2.put(string2, collection2);
        bVar.m(message2, hashMap2);
    }

    public final synchronized boolean j() {
        return this.j > 0;
    }

    public final void k() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (f7499n == null) {
            Context context = this.f7504e;
            String string2 = StubApp.getString2(6405);
            boolean z2 = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean(string2, false)) {
                    z2 = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            f7499n = Boolean.valueOf(z2);
            if (z2 && a.a(this.f7503d)) {
                Log.d(StubApp.getString2(6389), h() + StubApp.getString2(6406));
            }
        }
        this.f7508i = SQLiteDatabase.openDatabase(this.f7501b, null, f7499n.booleanValue() ? 805306368 : 268435456);
    }

    public final void l(V9.c cVar, Runnable runnable) {
        Integer num = (Integer) cVar.u(StubApp.getString2(6382));
        Integer num2 = this.f7510l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f7505f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new V9.e(runnable));
            return;
        }
        runnable.run();
        if (this.f7510l != null || arrayList.isEmpty()) {
            return;
        }
        this.f7507h.a(this, new B0.o(this, 11));
    }
}
