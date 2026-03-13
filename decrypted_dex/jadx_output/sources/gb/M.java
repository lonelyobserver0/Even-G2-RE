package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14295a;

    /* renamed from: b, reason: collision with root package name */
    public G f14296b;

    public M(Za.d dVar) {
        C0970B c0970b = new C0970B(this);
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(17856), StandardMethodCodec.INSTANCE);
        this.f14295a = methodChannel;
        methodChannel.setMethodCallHandler(c0970b);
    }
}
