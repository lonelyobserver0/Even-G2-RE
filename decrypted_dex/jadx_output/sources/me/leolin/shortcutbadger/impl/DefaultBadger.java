package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import ec.C0859b;
import ec.InterfaceC0858a;
import hc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultBadger implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26100), StubApp.getString2(26098), StubApp.getString2(26099));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(StubApp.getString2(26101));
        intent.putExtra(StubApp.getString2(23836), i3);
        intent.putExtra(StubApp.getString2(26102), componentName.getPackageName());
        intent.putExtra(StubApp.getString2(26103), componentName.getClassName());
        Intent intent2 = new Intent(intent);
        intent2.setAction(StubApp.getString2(26104));
        try {
            b.U(context, intent2);
        } catch (C0859b unused) {
            b.U(context, intent);
        }
    }
}
