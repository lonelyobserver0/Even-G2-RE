package l4;

import com.stub.StubApp;

/* renamed from: l4.u0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1214u0 extends Mb.b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16634b;

    public AbstractC1214u0(C1200n0 c1200n0) {
        super(c1200n0);
        ((C1200n0) this.f4728a).f16532D++;
    }

    public abstract boolean l();

    public final void m() {
        if (!this.f16634b) {
            throw new IllegalStateException(StubApp.getString2(19590));
        }
    }

    public final void n() {
        if (this.f16634b) {
            throw new IllegalStateException(StubApp.getString2(5166));
        }
        if (l()) {
            return;
        }
        ((C1200n0) this.f4728a).f16534F.incrementAndGet();
        this.f16634b = true;
    }
}
