package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import com.stub.StubApp;

@KeepName
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11166b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f11167a = 0;

    static {
        StubApp.interface11(3953);
    }

    @Override // android.app.Activity
    public final native void onActivityResult(int i3, int i10, Intent intent);

    @Override // android.content.DialogInterface.OnCancelListener
    public final native void onCancel(DialogInterface dialogInterface);

    @Override // android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // android.app.Activity
    public final native void onSaveInstanceState(Bundle bundle);
}
