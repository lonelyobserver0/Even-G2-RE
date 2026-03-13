package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import java.lang.ref.SoftReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static SoftReference f12052a;

    /* renamed from: b, reason: collision with root package name */
    public static SoftReference f12053b;

    static {
        StubApp.interface11(4339);
    }

    public static native int a(Intent intent);

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
