package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NovaHomeBadger implements InterfaceC0858a {
    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26111));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(3514), componentName.getPackageName() + StubApp.getString2(601) + componentName.getClassName());
        contentValues.put(StubApp.getString2(20291), Integer.valueOf(i3));
        context.getContentResolver().insert(Uri.parse(StubApp.getString2(26112)), contentValues);
    }
}
