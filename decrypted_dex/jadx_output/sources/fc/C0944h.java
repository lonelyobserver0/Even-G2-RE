package fc;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fc.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0944h implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return new ArrayList(0);
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2(26003), i3);
        bundle.putString(StubApp.getString2(26011), componentName.flattenToString());
        context.getContentResolver().call(Uri.parse(StubApp.getString2(26012)), StubApp.getString2(26013), (String) null, bundle);
    }
}
