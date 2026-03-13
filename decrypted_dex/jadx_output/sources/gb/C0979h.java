package gb;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gb.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0979h implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public Map f14350a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0980i f14351b;

    public C0979h(C0980i c0980i) {
        this.f14351b = c0980i;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C0980i c0980i = this.f14351b;
        if (c0980i.f14357a == null) {
            result.success(this.f14350a);
            return;
        }
        String str = methodCall.method;
        str.getClass();
        if (!str.equals(StubApp.getString2(18009))) {
            result.notImplemented();
            return;
        }
        try {
            this.f14350a = Collections.unmodifiableMap(((Xa.w) c0980i.f14357a.f8607a[0]).f8604b);
        } catch (IllegalStateException e10) {
            result.error(StubApp.getString2(435), e10.getMessage(), null);
        }
        result.success(this.f14350a);
    }
}
