package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.stub.StubApp;
import ec.InterfaceC0858a;
import fc.C0942f;
import java.util.Arrays;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SonyHomeBadger implements InterfaceC0858a {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f17356a = Uri.parse(StubApp.getString2(26113));

    /* renamed from: b, reason: collision with root package name */
    public C0942f f17357b;

    @Override // ec.InterfaceC0858a
    public final List a() {
        return Arrays.asList(StubApp.getString2(26114), StubApp.getString2(26115));
    }

    @Override // ec.InterfaceC0858a
    public final void b(Context context, ComponentName componentName, int i3) {
        if (context.getPackageManager().resolveContentProvider(StubApp.getString2(26116), 0) == null) {
            Intent intent = new Intent(StubApp.getString2(26118));
            intent.putExtra(StubApp.getString2(26119), componentName.getPackageName());
            intent.putExtra(StubApp.getString2(26120), componentName.getClassName());
            intent.putExtra(StubApp.getString2(26121), String.valueOf(i3));
            intent.putExtra(StubApp.getString2(26122), i3 > 0);
            context.sendBroadcast(intent);
            return;
        }
        if (i3 < 0) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(23836), Integer.valueOf(i3));
        contentValues.put(StubApp.getString2(5234), componentName.getPackageName());
        contentValues.put(StubApp.getString2(26117), componentName.getClassName());
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        Uri uri = this.f17356a;
        if (myLooper != mainLooper) {
            StubApp.getOrigApplicationContext(context.getApplicationContext()).getContentResolver().insert(uri, contentValues);
            return;
        }
        if (this.f17357b == null) {
            this.f17357b = new C0942f(StubApp.getOrigApplicationContext(context.getApplicationContext()).getContentResolver());
        }
        this.f17357b.startInsert(0, null, uri, contentValues);
    }
}
