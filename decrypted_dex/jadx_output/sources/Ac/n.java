package Ac;

import Kc.A;
import Kc.B;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final B f358a;

    /* renamed from: b, reason: collision with root package name */
    public final A f359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f360c;

    public n(B source, A sink, e eVar) {
        this.f360c = eVar;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f358a = source;
        this.f359b = sink;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f360c.b(-1L, true, true, null);
    }
}
