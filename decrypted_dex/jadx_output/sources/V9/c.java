package V9;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends hc.b {

    /* renamed from: c, reason: collision with root package name */
    public final b f7910c;

    /* renamed from: d, reason: collision with root package name */
    public final MethodCall f7911d;

    public c(MethodCall methodCall, MethodChannel.Result result) {
        super(8);
        this.f7911d = methodCall;
        this.f7910c = new b(result);
    }

    @Override // hc.b
    public final String C() {
        return this.f7911d.method;
    }

    @Override // hc.b
    public final d F() {
        return this.f7910c;
    }

    @Override // hc.b
    public final boolean J() {
        return this.f7911d.hasArgument(StubApp.getString2(6382));
    }

    @Override // hc.b
    public final Object u(String str) {
        return this.f7911d.argument(str);
    }
}
