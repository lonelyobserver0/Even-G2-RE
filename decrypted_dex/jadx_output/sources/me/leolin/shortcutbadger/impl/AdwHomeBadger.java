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
public class AdwHomeBadger implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26091), StubApp.getString2(26092));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(StubApp.getString2(26093));
        intent.putExtra(StubApp.getString2(26094), componentName.getPackageName());
        intent.putExtra(StubApp.getString2(26095), componentName.getClassName());
        intent.putExtra(StubApp.getString2(25564), i3);
        b.U(context, intent);
    }
}
