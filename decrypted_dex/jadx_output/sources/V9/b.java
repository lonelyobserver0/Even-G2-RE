package V9;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel.Result f7909a;

    public b(MethodChannel.Result result) {
        this.f7909a = result;
    }

    @Override // V9.d
    public final void d(Serializable serializable) {
        this.f7909a.success(serializable);
    }

    @Override // V9.d
    public final void m(String str, HashMap hashMap) {
        this.f7909a.error(StubApp.getString2(1340), str, hashMap);
    }
}
