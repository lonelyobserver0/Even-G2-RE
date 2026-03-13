package P1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.stub.StubApp;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f5456b = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f5457a;

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5457a = delegate;
    }

    public final boolean A() {
        String string2 = StubApp.getString2(4778);
        SQLiteDatabase sQLiteDatabase = this.f5457a;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, string2);
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor C(O1.e query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Cursor rawQueryWithFactory = this.f5457a.rawQueryWithFactory(new a(new b(query), 0), query.d(), f5456b, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final Cursor F(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return C(new O1.a(query, 0));
    }

    public final void G() {
        this.f5457a.setTransactionSuccessful();
    }

    public final void a() {
        this.f5457a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5457a.close();
    }

    public final void d() {
        this.f5457a.beginTransactionNonExclusive();
    }

    public final k e(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f5457a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new k(compileStatement);
    }

    public final void h() {
        this.f5457a.endTransaction();
    }

    public final void k(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f5457a.execSQL(sql);
    }

    public final void p(Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", StubApp.getString2(4779));
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f5457a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    public final boolean v() {
        return this.f5457a.inTransaction();
    }
}
