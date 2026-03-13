package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;

/* renamed from: gb.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0978g {

    /* renamed from: a, reason: collision with root package name */
    public final BasicMessageChannel f14344a;

    public C0978g(BinaryMessenger binaryMessenger) {
        this.f14344a = new BasicMessageChannel(binaryMessenger, StubApp.getString2(17999), JSONMessageCodec.INSTANCE);
    }
}
