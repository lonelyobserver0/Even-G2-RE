package com.google.firebase.messaging;

import D5.AbstractServiceC0044h;
import P3.b;
import android.content.Intent;
import com.stub.StubApp;
import java.util.ArrayDeque;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FirebaseMessagingService extends AbstractServiceC0044h {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f12067g;

    /* renamed from: f, reason: collision with root package name */
    public b f12068f;

    static {
        StubApp.interface11(4348);
        f12067g = new ArrayDeque(10);
    }

    @Override // D5.AbstractServiceC0044h
    public final native void b(Intent intent);

    public native void c(String str);
}
