package O9;

import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final MethodChannel.Result f5314a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5315b = new Handler(Looper.getMainLooper());

    public i(MethodChannel.Result result) {
        this.f5314a = result;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String str, String str2, Object obj) {
        this.f5315b.post(new g(this, str, str2, obj));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.f5315b.post(new h(this));
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        this.f5315b.post(new f(this, obj));
    }
}
