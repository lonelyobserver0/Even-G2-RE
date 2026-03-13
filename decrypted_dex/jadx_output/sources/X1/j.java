package X1;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i3, String str, String str2) {
        super(2, str, str2);
        this.f8246e = i3;
    }

    @Override // X1.c
    public final boolean b() {
        switch (this.f8246e) {
            case 0:
                if (!super.b() || !Tc.d.m(StubApp.getString2(6963))) {
                    return false;
                }
                int i3 = W1.a.f8064a;
                if (k.f8249c.b()) {
                    return m.f8252a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException(StubApp.getString2(6964));
            default:
                if (Tc.d.m(StubApp.getString2(6962))) {
                    return super.b();
                }
                return false;
        }
    }
}
