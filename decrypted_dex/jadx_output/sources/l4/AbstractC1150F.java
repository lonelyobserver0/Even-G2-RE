package l4;

import com.stub.StubApp;

/* renamed from: l4.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1150F extends AbstractC1146B {

    /* renamed from: b, reason: collision with root package name */
    public boolean f16042b;

    public AbstractC1150F(C1200n0 c1200n0) {
        super(c1200n0);
        ((C1200n0) this.f4728a).f16532D++;
    }

    public final void l() {
        if (!this.f16042b) {
            throw new IllegalStateException(StubApp.getString2(19590));
        }
    }

    public final void m() {
        if (this.f16042b) {
            throw new IllegalStateException(StubApp.getString2(5166));
        }
        if (n()) {
            return;
        }
        ((C1200n0) this.f4728a).f16534F.incrementAndGet();
        this.f16042b = true;
    }

    public abstract boolean n();
}
