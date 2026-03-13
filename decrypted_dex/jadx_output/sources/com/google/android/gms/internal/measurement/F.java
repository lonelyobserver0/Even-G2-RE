package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import com.stub.StubApp;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f11261a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f11262b;

    static {
        Method method;
        String string2 = StubApp.getString2(11669);
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod(StubApp.getString2("11670"), JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable(string2, 6)) {
                Log.e(string2, StubApp.getString2(11671));
            }
            method = null;
        }
        f11261a = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod(StubApp.getString2("11672"), new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable(string2, 6)) {
                Log.e(string2, StubApp.getString2(11673));
            }
        }
        f11262b = method2;
    }
}
