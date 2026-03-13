package P1;

import U9.o;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5454b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f5453a = i3;
        this.f5454b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        switch (this.f5453a) {
            case 0:
                b tmp0 = (b) this.f5454b;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            default:
                List list = ((o) this.f5454b).f7561b;
                if (list != null) {
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object a3 = o.a(list.get(i3));
                        int i10 = i3 + 1;
                        if (a3 == null) {
                            sQLiteQuery.bindNull(i10);
                        } else if (a3 instanceof byte[]) {
                            sQLiteQuery.bindBlob(i10, (byte[]) a3);
                        } else if (a3 instanceof Double) {
                            sQLiteQuery.bindDouble(i10, ((Double) a3).doubleValue());
                        } else if (a3 instanceof Integer) {
                            sQLiteQuery.bindLong(i10, ((Integer) a3).intValue());
                        } else if (a3 instanceof Long) {
                            sQLiteQuery.bindLong(i10, ((Long) a3).longValue());
                        } else if (a3 instanceof String) {
                            sQLiteQuery.bindString(i10, (String) a3);
                        } else {
                            if (!(a3 instanceof Boolean)) {
                                throw new IllegalArgumentException(StubApp.getString2(4775) + a3 + StubApp.getString2(4776) + i3 + StubApp.getString2(4777));
                            }
                            sQLiteQuery.bindLong(i10, ((Boolean) a3).booleanValue() ? 1L : 0L);
                        }
                        i3 = i10;
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
