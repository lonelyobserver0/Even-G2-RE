package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: gb.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0983l {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14361a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0982k f14362b;

    public C0983l(Za.d dVar) {
        C0981j c0981j = new C0981j(this);
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(18012), JSONMethodCodec.INSTANCE);
        this.f14361a = methodChannel;
        methodChannel.setMethodCallHandler(c0981j);
    }
}
