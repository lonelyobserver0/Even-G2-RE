package com.google.android.gms.common;

import S3.D;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.stub.StubApp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11164a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f11165b = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        D.g(StubApp.getString2(11450));
        if (this.f11164a) {
            throw new IllegalStateException(StubApp.getString2(11452));
        }
        this.f11164a = true;
        IBinder iBinder = (IBinder) this.f11165b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException(StubApp.getString2(11451));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11165b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
