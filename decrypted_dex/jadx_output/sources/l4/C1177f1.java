package l4;

import com.stub.StubApp;
import java.util.Objects;

/* renamed from: l4.f1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1177f1 extends AbstractC1202o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1189j1 f16428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177f1(C1189j1 c1189j1, C1200n0 c1200n0, int i3) {
        super(c1200n0);
        this.f16427e = i3;
        switch (i3) {
            case 1:
                Objects.requireNonNull(c1189j1);
                this.f16428f = c1189j1;
                super(c1200n0);
                break;
            default:
                Objects.requireNonNull(c1189j1);
                this.f16428f = c1189j1;
                break;
        }
    }

    @Override // l4.AbstractC1202o
    public final void a() {
        switch (this.f16427e) {
            case 0:
                C1189j1 c1189j1 = this.f16428f;
                c1189j1.k();
                if (c1189j1.B()) {
                    T t3 = ((C1200n0) c1189j1.f4728a).f16541f;
                    C1200n0.l(t3);
                    t3.f16249p.b(StubApp.getString2(20416));
                    c1189j1.s();
                    break;
                }
                break;
            default:
                T t10 = ((C1200n0) this.f16428f.f4728a).f16541f;
                C1200n0.l(t10);
                t10.j.b(StubApp.getString2(20415));
                break;
        }
    }
}
