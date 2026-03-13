package com.dexterous.flutterlocalnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static a f11102b;

    /* renamed from: c, reason: collision with root package name */
    public static Ya.c f11103c;

    /* renamed from: a, reason: collision with root package name */
    public F2.a f11104a;

    static {
        StubApp.interface11(3004);
    }

    @Keep
    public ActionBroadcastReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
