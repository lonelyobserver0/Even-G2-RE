package P1;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends j implements O1.d {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f5483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5483b = delegate;
    }

    public final long a() {
        return this.f5483b.executeInsert();
    }

    public final int d() {
        return this.f5483b.executeUpdateDelete();
    }
}
