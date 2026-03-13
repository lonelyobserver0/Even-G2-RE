package P1;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O1.e f5455a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(O1.e eVar) {
        super(4);
        this.f5455a = eVar;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        Intrinsics.checkNotNull(sQLiteQuery);
        this.f5455a.a(new j(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
