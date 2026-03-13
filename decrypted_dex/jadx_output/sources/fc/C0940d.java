package fc;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import java.util.Collections;
import java.util.List;

/* renamed from: fc.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0940d implements InterfaceC0858a {

    /* renamed from: a, reason: collision with root package name */
    public int f14193a;

    @Override // ec.InterfaceC0858a
    public final List a() {
        return Collections.singletonList(StubApp.getString2(26002));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        if (this.f14193a == i3) {
            return;
        }
        this.f14193a = i3;
        Bundle bundle = new Bundle();
        bundle.putInt(StubApp.getString2("26003"), i3);
        context.getContentResolver().call(Uri.parse(StubApp.getString2("26004")), StubApp.getString2("26005"), (String) null, bundle);
    }
}
