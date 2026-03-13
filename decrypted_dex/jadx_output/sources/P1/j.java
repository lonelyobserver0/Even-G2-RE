package P1;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class j implements O1.d {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f5482a;

    public j(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5482a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5482a.close();
    }

    @Override // O1.d
    public final void g(int i3, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5482a.bindString(i3, value);
    }

    @Override // O1.d
    public final void m(int i3, long j) {
        this.f5482a.bindLong(i3, j);
    }

    @Override // O1.d
    public final void o(int i3, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5482a.bindBlob(i3, value);
    }

    @Override // O1.d
    public final void w(double d8, int i3) {
        this.f5482a.bindDouble(i3, d8);
    }

    @Override // O1.d
    public final void x(int i3) {
        this.f5482a.bindNull(i3);
    }
}
