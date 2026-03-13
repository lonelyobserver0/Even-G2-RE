package v;

import com.stub.StubApp;

/* renamed from: v.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1796i extends AbstractC1794g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1797j f21517h;

    public C1796i(C1797j c1797j) {
        this.f21517h = c1797j;
    }

    @Override // v.AbstractC1794g
    public final String h() {
        C1795h c1795h = (C1795h) this.f21517h.f21518a.get();
        if (c1795h == null) {
            return StubApp.getString2(23595);
        }
        return StubApp.getString2(23596) + c1795h.f21513a + StubApp.getString2(511);
    }
}
