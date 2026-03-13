package l4;

import java.lang.Thread;
import java.util.Objects;

/* renamed from: l4.h0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1182h0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f16456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1191k0 f16457b;

    public C1182h0(C1191k0 c1191k0, String str) {
        Objects.requireNonNull(c1191k0);
        this.f16457b = c1191k0;
        this.f16456a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        T t3 = ((C1200n0) this.f16457b.f4728a).f16541f;
        C1200n0.l(t3);
        t3.f16242f.c(th, this.f16456a);
    }
}
