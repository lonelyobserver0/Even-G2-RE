package Qb;

import kotlin.Unit;

/* renamed from: Qb.c0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0188c0 extends AbstractRunnableC0192e0 {

    /* renamed from: c, reason: collision with root package name */
    public final C0203k f5855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0196g0 f5856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188c0(AbstractC0196g0 abstractC0196g0, long j, C0203k c0203k) {
        super(j);
        this.f5856d = abstractC0196g0;
        this.f5855c = c0203k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5855c.C(this.f5856d, Unit.INSTANCE);
    }

    @Override // Qb.AbstractRunnableC0192e0
    public final String toString() {
        return super.toString() + this.f5855c;
    }
}
