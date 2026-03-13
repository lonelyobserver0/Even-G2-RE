package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import hc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ApexHomeBadger implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26096));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(StubApp.getString2(26097));
        intent.putExtra(StubApp.getString2(3503), componentName.getPackageName());
        intent.putExtra(StubApp.getString2(20291), i3);
        intent.putExtra(StubApp.getString2(11020), componentName.getClassName());
        b.U(context, intent);
    }
}
