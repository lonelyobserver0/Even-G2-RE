package da;

import com.stub.StubApp;

/* renamed from: da.A, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0810A extends J {

    /* renamed from: g, reason: collision with root package name */
    public boolean f13458g;

    @Override // da.J
    public final void K(float f10) {
        this.f13458g = Float.floatToIntBits(f10) == 1184802985;
    }

    @Override // da.J
    public final o p() {
        if (this.f13458g) {
            throw new UnsupportedOperationException(StubApp.getString2(16837));
        }
        return super.p();
    }
}
