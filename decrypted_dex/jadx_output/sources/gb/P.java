package gb;

import android.content.pm.PackageManager;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugin.text.ProcessTextPlugin;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f14298a;

    /* renamed from: b, reason: collision with root package name */
    public ProcessTextPlugin f14299b;

    public P(Za.d dVar, PackageManager packageManager) {
        N n10 = new N(this);
        this.f14298a = packageManager;
        new MethodChannel(dVar, StubApp.getString2(17859), StandardMethodCodec.INSTANCE).setMethodCallHandler(n10);
    }
}
