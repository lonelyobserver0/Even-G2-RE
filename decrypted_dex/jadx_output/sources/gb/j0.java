package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel f14359a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f14360b;

    public j0(Za.d dVar) {
        d0 d0Var = new d0(this);
        MethodChannel methodChannel = new MethodChannel(dVar, StubApp.getString2(18010), JSONMethodCodec.INSTANCE);
        this.f14359a = methodChannel;
        methodChannel.setMethodCallHandler(d0Var);
    }

    public static HashMap a(String str, int i3, int i10, int i11, int i12) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(613), str);
        AbstractC1482f.q(i3, hashMap, StubApp.getString2(18005), i10, StubApp.getString2(18006));
        AbstractC1482f.q(i11, hashMap, StubApp.getString2(18007), i12, StubApp.getString2(18008));
        return hashMap;
    }
}
