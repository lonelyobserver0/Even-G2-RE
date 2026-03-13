package I3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import y3.C1970c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements d, J3.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1970c f3117f = new C1970c(StubApp.getString2(636));

    /* renamed from: a, reason: collision with root package name */
    public final j f3118a;

    /* renamed from: b, reason: collision with root package name */
    public final K3.a f3119b;

    /* renamed from: c, reason: collision with root package name */
    public final K3.a f3120c;

    /* renamed from: d, reason: collision with root package name */
    public final a f3121d;

    /* renamed from: e, reason: collision with root package name */
    public final Pb.a f3122e;

    public h(K3.a aVar, K3.a aVar2, a aVar3, j jVar, Pb.a aVar4) {
        this.f3118a = jVar;
        this.f3119b = aVar;
        this.f3120c = aVar2;
        this.f3121d = aVar3;
        this.f3122e = aVar4;
    }

    public static Object A(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, B3.j jVar) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2826));
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f628a, String.valueOf(L3.a.a(jVar.f630c))));
        byte[] bArr = jVar.f629b;
        if (bArr != null) {
            sb2.append(StubApp.getString2(2827));
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(StubApp.getString2(2828));
        }
        Cursor query = sQLiteDatabase.query(StubApp.getString2(1046), new String[]{StubApp.getString2(2829)}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String v(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2830));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f3110a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public final SQLiteDatabase a() {
        j jVar = this.f3118a;
        Objects.requireNonNull(jVar);
        K3.a aVar = this.f3120c;
        long f10 = aVar.f();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.f() >= this.f3121d.f3107c + f10) {
                    throw new J3.a(StubApp.getString2(2831), e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3118a.close();
    }

    public final Object e(f fVar) {
        SQLiteDatabase a3 = a();
        a3.beginTransaction();
        try {
            Object apply = fVar.apply(a3);
            a3.setTransactionSuccessful();
            return apply;
        } finally {
            a3.endTransaction();
        }
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase, B3.j jVar, int i3) {
        ArrayList arrayList = new ArrayList();
        Long d8 = d(sQLiteDatabase, jVar);
        if (d8 == null) {
            return arrayList;
        }
        A(sQLiteDatabase.query(StubApp.getString2(973), new String[]{StubApp.getString2(2829), StubApp.getString2(1048), StubApp.getString2(1049), StubApp.getString2(1050), StubApp.getString2(1051), StubApp.getString2(1055), StubApp.getString2(1052), StubApp.getString2(1054), StubApp.getString2(1056), StubApp.getString2(1057), StubApp.getString2(1058), StubApp.getString2(1059)}, StubApp.getString2(2832), new String[]{d8.toString()}, null, null, null, String.valueOf(i3)), new C2.e(this, arrayList, jVar, 5));
        return arrayList;
    }

    public final void k(long j, E3.c cVar, String str) {
        e(new C9.a(str, cVar, j));
    }

    public final Object p(J3.b bVar) {
        SQLiteDatabase a3 = a();
        K3.a aVar = this.f3120c;
        long f10 = aVar.f();
        while (true) {
            try {
                a3.beginTransaction();
                try {
                    Object f11 = bVar.f();
                    a3.setTransactionSuccessful();
                    return f11;
                } finally {
                    a3.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.f() >= this.f3121d.f3107c + f10) {
                    throw new J3.a(StubApp.getString2(2833), e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
