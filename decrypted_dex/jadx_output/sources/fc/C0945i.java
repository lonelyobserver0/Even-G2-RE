package fc;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import java.util.Collections;
import java.util.List;

/* renamed from: fc.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0945i implements InterfaceC0858a {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14194a = Uri.parse(StubApp.getString2(26004));

    @Override // ec.InterfaceC0858a
    public final List a() {
        return Collections.singletonList(StubApp.getString2(26014));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2(26003), i3);
        context.getContentResolver().call(this.f14194a, StubApp.getString2(26005), (String) null, bundle);
    }
}
