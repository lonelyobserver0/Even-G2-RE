package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import ec.C0859b;
import ec.InterfaceC0858a;
import hc.b;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NewHtcHomeBadger implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return Collections.singletonList(StubApp.getString2(26105));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        boolean z2;
        Intent intent = new Intent(StubApp.getString2(26106));
        intent.putExtra(StubApp.getString2(26107), componentName.flattenToShortString());
        intent.putExtra(StubApp.getString2(26108), i3);
        Intent intent2 = new Intent(StubApp.getString2(26109));
        intent2.putExtra(StubApp.getString2(26110), componentName.getPackageName());
        intent2.putExtra(StubApp.getString2(20291), i3);
        boolean z10 = false;
        try {
            b.U(context, intent);
            z2 = true;
        } catch (C0859b unused) {
            z2 = false;
        }
        try {
            b.U(context, intent2);
            z10 = true;
        } catch (C0859b unused2) {
        }
        if (z2 || z10) {
            return;
        }
        throw new C0859b(StubApp.getString2(26046) + intent2.toString());
    }
}
