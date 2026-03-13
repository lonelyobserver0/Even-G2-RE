package P1;

import Ac.m;
import J1.s;
import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements O1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5477b;

    /* renamed from: c, reason: collision with root package name */
    public final s f5478c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5479d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f5480e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5481f;

    public i(Context context, String str, s callback, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5476a = context;
        this.f5477b = str;
        this.f5478c = callback;
        this.f5479d = z2;
        this.f5480e = LazyKt.lazy(new m(this, 7));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.f5480e;
        if (lazy.isInitialized()) {
            ((h) lazy.getValue()).close();
        }
    }

    @Override // O1.c
    public final c s() {
        return ((h) this.f5480e.getValue()).a(true);
    }

    @Override // O1.c
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        Lazy lazy = this.f5480e;
        if (lazy.isInitialized()) {
            h sQLiteOpenHelper = (h) lazy.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z2);
        }
        this.f5481f = z2;
    }
}
