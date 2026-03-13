package com.mapbox.common;

import android.content.Context;
import android.os.Looper;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f12385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Looper f12386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f12387d;

    public /* synthetic */ e(Context context, Looper looper, Function1 function1, int i3) {
        this.f12384a = i3;
        this.f12385b = context;
        this.f12386c = looper;
        this.f12387d = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12384a) {
            case 0:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15(this.f12385b, this.f12386c, this.f12387d);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24(this.f12385b, this.f12386c, this.f12387d);
                break;
        }
    }
}
