package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Z {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f14319b = new Y();

    /* renamed from: a, reason: collision with root package name */
    public final BasicMessageChannel f14320a;

    public Z(Za.d dVar) {
        this.f14320a = new BasicMessageChannel(dVar, StubApp.getString2(17871), JSONMessageCodec.INSTANCE);
    }
}
