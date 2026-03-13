package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f15086a;

    static {
        StubApp.interface11(8307);
        f15086a = new HashMap();
    }

    @Override // android.content.BroadcastReceiver
    public final native void onReceive(Context context, Intent intent);
}
