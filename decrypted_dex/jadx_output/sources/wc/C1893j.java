package wc;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1893j {

    /* renamed from: a, reason: collision with root package name */
    public final Ac.q f22392a;

    public C1893j() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Ac.q delegate = new Ac.q(zc.c.f24147h);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f22392a = delegate;
    }
}
