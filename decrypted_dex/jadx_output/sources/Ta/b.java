package Ta;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuServiceController;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7239a;

    /* renamed from: b, reason: collision with root package name */
    public final DfuServiceController f7240b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f7241c;

    public b(String deviceAddress, DfuServiceController controller, Class serviceClass) {
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        this.f7239a = deviceAddress;
        this.f7240b = controller;
        this.f7241c = serviceClass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f7239a, bVar.f7239a) && Intrinsics.areEqual(this.f7240b, bVar.f7240b) && Intrinsics.areEqual(this.f7241c, bVar.f7241c);
    }

    public final int hashCode() {
        return this.f7241c.hashCode() + ((this.f7240b.hashCode() + (this.f7239a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(6237) + this.f7239a + StubApp.getString2(6238) + this.f7240b + StubApp.getString2(6239) + this.f7241c + StubApp.getString2(74);
    }
}
