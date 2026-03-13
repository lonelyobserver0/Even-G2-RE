package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: gb.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0988q {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14365a;

    public C0988q(Za.d dVar) {
        C0987p c0987p = new C0987p();
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(18016), JSONMethodCodec.INSTANCE);
        this.f14365a = methodChannel;
        methodChannel.setMethodCallHandler(c0987p);
    }
}
