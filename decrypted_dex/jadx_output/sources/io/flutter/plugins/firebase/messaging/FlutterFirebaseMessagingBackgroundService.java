package io.flutter.plugins.firebase.messaging;

import com.stub.StubApp;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import kb.c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class FlutterFirebaseMessagingBackgroundService extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final List f15085h;
    public static c j;

    static {
        StubApp.interface11(8305);
        f15085h = Collections.synchronizedList(new LinkedList());
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public final native void onCreate();
}
