package L4;

import android.util.Base64;
import com.stub.StubApp;
import o0.InterfaceC1424V;
import v0.C1815j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4194a;

    @Override // L4.k
    public final Object get() {
        switch (this.f4194a) {
            case 0:
                throw new IllegalStateException();
            case 1:
                try {
                    Class<?> cls = Class.forName(StubApp.getString2("3368"));
                    Object invoke = cls.getMethod(StubApp.getString2("3369"), new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    invoke.getClass();
                    return (InterfaceC1424V) invoke;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 2:
                return new C1815j();
            default:
                byte[] bArr = new byte[12];
                w0.e.f22006i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
