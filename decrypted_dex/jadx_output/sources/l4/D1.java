package l4;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16034a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16035b;

    public D1(F1 f12, String str) {
        Objects.requireNonNull(f12);
        this.f16034a = str;
        f12.f().getClass();
        this.f16035b = SystemClock.elapsedRealtime();
    }
}
