package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import com.stub.StubApp;
import m6.h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public h f12258a;

    /* renamed from: b, reason: collision with root package name */
    public DecoratedBarcodeView f12259b;

    static {
        StubApp.interface11(4652);
    }

    @Override // android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native void onDestroy();

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final native boolean onKeyDown(int i3, KeyEvent keyEvent);

    @Override // android.app.Activity
    public final native void onPause();

    @Override // android.app.Activity
    public final native void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr);

    @Override // android.app.Activity
    public final native void onResume();

    @Override // android.app.Activity
    public final native void onSaveInstanceState(Bundle bundle);
}
