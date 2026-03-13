package Qb;

import Vb.AbstractC0355a;
import kotlin.collections.ArrayDeque;

/* renamed from: Qb.b0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0186b0 extends C {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5847d = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f5848a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5849b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayDeque f5850c;

    public final void A(boolean z2) {
        this.f5848a = (z2 ? 4294967296L : 1L) + this.f5848a;
        if (z2) {
            return;
        }
        this.f5849b = true;
    }

    public abstract long C();

    public final boolean F() {
        U u2;
        ArrayDeque arrayDeque = this.f5850c;
        if (arrayDeque == null || (u2 = (U) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        u2.run();
        return true;
    }

    @Override // Qb.C
    public final C limitedParallelism(int i3) {
        AbstractC0355a.a(i3);
        return this;
    }

    public abstract void shutdown();

    public final void v(boolean z2) {
        long j = this.f5848a - (z2 ? 4294967296L : 1L);
        this.f5848a = j;
        if (j <= 0 && this.f5849b) {
            shutdown();
        }
    }
}
