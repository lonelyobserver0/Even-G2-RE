package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import y3.C1968a;
import y3.C1970c;

/* renamed from: H5.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0079l {

    /* renamed from: a, reason: collision with root package name */
    public final w5.b f2901a;

    public C0079l(w5.b transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f2901a = transportFactoryProvider;
    }

    public final void a(P sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        y3.f fVar = (y3.f) this.f2901a.get();
        ((B3.r) fVar).a(StubApp.getString2(2665), new C1970c(StubApp.getString2(2547)), new C2.d(this, 16)).q(new C1968a(sessionEvent, y3.d.f23506a, null), new A1.a(2));
    }
}
