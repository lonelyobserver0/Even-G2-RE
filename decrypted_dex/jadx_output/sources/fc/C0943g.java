package fc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import java.util.Arrays;
import java.util.List;

/* renamed from: fc.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0943g implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26007));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(StubApp.getString2(26008));
        intent.putExtra(StubApp.getString2(1415), context.getPackageName());
        intent.putExtra(StubApp.getString2(26009), componentName.getClassName());
        intent.putExtra(StubApp.getString2(26010), i3);
        context.sendBroadcast(intent);
    }
}
