package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14293a;

    /* renamed from: b, reason: collision with root package name */
    public K f14294b;

    public L(Za.d dVar) {
        H h2 = new H(this);
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(17855), StandardMethodCodec.INSTANCE);
        this.f14293a = methodChannel;
        methodChannel.setMethodCallHandler(h2);
    }
}
