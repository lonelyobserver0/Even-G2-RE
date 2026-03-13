package Qb;

/* renamed from: Qb.d0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0190d0 extends AbstractRunnableC0192e0 {

    /* renamed from: c, reason: collision with root package name */
    public final P0 f5858c;

    public C0190d0(long j, P0 p02) {
        super(j);
        this.f5858c = p02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5858c.run();
    }

    @Override // Qb.AbstractRunnableC0192e0
    public final String toString() {
        return super.toString() + this.f5858c;
    }
}
