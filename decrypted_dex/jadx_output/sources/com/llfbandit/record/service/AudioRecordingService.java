package com.llfbandit.record.service;

import A6.a;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.stub.StubApp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/llfbandit/record/service/AudioRecordingService;", "Landroid/app/Service;", "<init>", "()V", "A6/a", "record_android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AudioRecordingService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final a f12274a = new a();

    /* renamed from: b, reason: collision with root package name */
    public NotificationManager f12275b;

    static {
        StubApp.interface11(4655);
    }

    @Override // android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i3, int i10);
}
