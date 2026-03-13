package da;

import com.stub.StubApp;
import java.io.File;
import java.io.InputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z extends G {
    @Override // da.G
    public final J a(F f10) {
        return new C0810A(f10);
    }

    @Override // da.G
    public final J b(F f10) {
        return (C0810A) super.b(f10);
    }

    @Override // da.G
    public final J c(File file) {
        throw null;
    }

    @Override // da.G
    public final J d(InputStream inputStream) {
        throw null;
    }

    @Override // da.G
    public final H e(J j, String str) {
        return (str.equals(StubApp.getString2(17241)) || str.equals(StubApp.getString2(17242)) || str.equals(StubApp.getString2(17243)) || str.equals(StubApp.getString2(17141)) || str.equals(StubApp.getString2(17244))) ? new C0817g(j) : str.equals(StubApp.getString2(7708)) ? new C0812b(j) : new H(j);
    }

    public final C0810A f(File file) {
        return (C0810A) super.c(file);
    }

    public final C0810A g(oa.h hVar) {
        return (C0810A) super.d(hVar);
    }
}
