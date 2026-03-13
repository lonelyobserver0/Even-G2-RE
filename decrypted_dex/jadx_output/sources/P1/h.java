package P1;

import J1.s;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import com.stub.StubApp;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends SQLiteOpenHelper {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f5469g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5470a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5471b;

    /* renamed from: c, reason: collision with root package name */
    public final s f5472c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5473d;

    /* renamed from: e, reason: collision with root package name */
    public final Q1.a f5474e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, final d dbRef, final s callback) {
        super(context, str, null, callback.f3376b, new DatabaseErrorHandler() { // from class: P1.e
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                s callback2 = s.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                d dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                int i3 = h.f5469g;
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                c db2 = a4.f.t(dbRef2, dbObj);
                callback2.getClass();
                String string2 = StubApp.getString2(4780);
                Intrinsics.checkNotNullParameter(db2, "db");
                Log.e(StubApp.getString2(2952), StubApp.getString2(4781) + db2 + StubApp.getString2(4782));
                SQLiteDatabase sQLiteDatabase = db2.f5457a;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        s.c(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db2.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, string2);
                            s.c((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            s.c(path2);
                        }
                    }
                }
            }
        });
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5470a = context;
        this.f5471b = dbRef;
        this.f5472c = callback;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        this.f5474e = new Q1.a(str2, context.getCacheDir(), false);
    }

    public final c a(boolean z2) {
        Q1.a aVar = this.f5474e;
        try {
            aVar.a((this.f5475f || getDatabaseName() == null) ? false : true);
            this.f5473d = false;
            SQLiteDatabase h2 = h(z2);
            if (!this.f5473d) {
                c d8 = d(h2);
                aVar.b();
                return d8;
            }
            close();
            c a3 = a(z2);
            aVar.b();
            return a3;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        Q1.a aVar = this.f5474e;
        try {
            aVar.a(aVar.f5694a);
            super.close();
            this.f5471b.f5458a = null;
            this.f5475f = false;
        } finally {
            aVar.b();
        }
    }

    public final c d(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return a4.f.t(this.f5471b, sqLiteDatabase);
    }

    public final SQLiteDatabase e(boolean z2) {
        String string2 = StubApp.getString2(4788);
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, string2);
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, string2);
        return readableDatabase;
    }

    public final SQLiteDatabase h(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f5475f;
        Context context = this.f5470a;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w(StubApp.getString2(2952), StubApp.getString2(4789) + parentFile);
            }
        }
        try {
            return e(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return e(z2);
            } catch (Throwable th) {
                super.close();
                if (!(th instanceof f)) {
                    if (th instanceof SQLiteException) {
                        throw th;
                    }
                    throw th;
                }
                f fVar = th;
                int ordinal = fVar.f5461a.ordinal();
                Throwable th2 = fVar.f5462b;
                if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    throw th2;
                }
                if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
                context.deleteDatabase(databaseName);
                try {
                    return e(z2);
                } catch (f e10) {
                    throw e10.f5462b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean z2 = this.f5473d;
        s sVar = this.f5472c;
        if (!z2 && sVar.f3376b != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            sVar.l(d(db2));
        } catch (Throwable th) {
            throw new f(g.f5463a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f5472c.m(d(sqLiteDatabase));
        } catch (Throwable th) {
            throw new f(g.f5464b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i3, int i10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.f5473d = true;
        try {
            this.f5472c.n(d(db2), i3, i10);
        } catch (Throwable th) {
            throw new f(g.f5466d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (!this.f5473d) {
            try {
                this.f5472c.o(d(db2));
            } catch (Throwable th) {
                throw new f(g.f5467e, th);
            }
        }
        this.f5475f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i3, int i10) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f5473d = true;
        try {
            this.f5472c.q(d(sqLiteDatabase), i3, i10);
        } catch (Throwable th) {
            throw new f(g.f5465c, th);
        }
    }
}
