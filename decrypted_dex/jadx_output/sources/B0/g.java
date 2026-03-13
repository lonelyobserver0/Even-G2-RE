package B0;

import android.os.SystemClock;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends O0.c {

    /* renamed from: g, reason: collision with root package name */
    public int f419g;

    @Override // O0.s
    public final void b(long j, long j3, long j10, List list, M0.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.f419g, elapsedRealtime)) {
            for (int i3 = this.f5089b - 1; i3 >= 0; i3--) {
                if (!a(i3, elapsedRealtime)) {
                    this.f419g = i3;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // O0.s
    public final int e() {
        return this.f419g;
    }

    @Override // O0.s
    public final int o() {
        return 0;
    }

    @Override // O0.s
    public final Object r() {
        return null;
    }
}
