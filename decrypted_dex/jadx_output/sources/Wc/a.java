package Wc;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f8211a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8212b;

    public final f a(MethodCall methodCall) {
        int intValue = ((Integer) methodCall.argument(StubApp.getString2(25839))).intValue();
        if (intValue < 0 || intValue > this.f8212b.size()) {
            throw new RuntimeException();
        }
        if (intValue == this.f8212b.size()) {
            this.f8212b.add(intValue, null);
        }
        return (f) this.f8212b.get(intValue);
    }

    public final void b(MethodCall methodCall, MethodChannel.Result result) {
        for (int i3 = 0; i3 < this.f8212b.size(); i3++) {
            if (this.f8212b.get(i3) != null) {
                ((f) this.f8212b.get(i3)).g();
            }
            this.f8212b = new ArrayList();
        }
        result.success(0);
    }
}
