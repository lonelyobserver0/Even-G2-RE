package io.flutter.plugins.firebase.crashlytics;

import W4.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return Collections.singletonList(u0.g(StubApp.getString2(18876), StubApp.getString2(18877)));
    }
}
