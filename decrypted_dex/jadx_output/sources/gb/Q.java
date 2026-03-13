package gb;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Q implements MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f14300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f14301b;

    public Q(T t3, byte[] bArr) {
        this.f14301b = t3;
        this.f14300a = bArr;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String str, String str2, Object obj) {
        Log.e(StubApp.getString2(17862), StubApp.getString2(17860) + str + StubApp.getString2(17861) + str2);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.f14301b.f14304b = this.f14300a;
    }
}
