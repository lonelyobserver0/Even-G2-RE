package S3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I extends x {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f6460g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0271e f6461h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0271e abstractC0271e, int i3, IBinder iBinder, Bundle bundle) {
        super(abstractC0271e, i3, bundle);
        this.f6461h = abstractC0271e;
        this.f6460g = iBinder;
    }

    @Override // S3.x
    public final void a(com.google.android.gms.common.b bVar) {
        InterfaceC0269c interfaceC0269c = this.f6461h.f6505r;
        if (interfaceC0269c != null) {
            interfaceC0269c.g(bVar);
        }
        System.currentTimeMillis();
    }

    @Override // S3.x
    public final boolean b() {
        String string2 = StubApp.getString2(5933);
        IBinder iBinder = this.f6460g;
        try {
            D.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0271e abstractC0271e = this.f6461h;
            if (!abstractC0271e.u().equals(interfaceDescriptor)) {
                Log.w(string2, StubApp.getString2(5942) + abstractC0271e.u() + StubApp.getString2(5943) + interfaceDescriptor);
                return false;
            }
            IInterface o5 = abstractC0271e.o(iBinder);
            if (o5 == null || !(AbstractC0271e.z(abstractC0271e, 2, 4, o5) || AbstractC0271e.z(abstractC0271e, 3, 4, o5))) {
                return false;
            }
            abstractC0271e.f6509w = null;
            InterfaceC0268b interfaceC0268b = abstractC0271e.f6504q;
            if (interfaceC0268b == null) {
                return true;
            }
            interfaceC0268b.f();
            return true;
        } catch (RemoteException unused) {
            Log.w(string2, StubApp.getString2(5944));
            return false;
        }
    }
}
