package com.google.android.gms.common;

import S3.D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11186b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f11187c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11189e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f11185a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f11188d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f11187c) {
                try {
                    PackageInfo b2 = Y3.c.a(context).b(64, StubApp.getString2("0"));
                    i.a(context);
                    if (b2 == null || i.d(b2, false) || !i.d(b2, true)) {
                        f11186b = false;
                    } else {
                        f11186b = true;
                    }
                    f11187c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w(StubApp.getString2("11495"), StubApp.getString2("11521"), e10);
                    f11187c = true;
                }
            }
            return f11186b || !StubApp.getString2(11522).equals(Build.TYPE);
        } catch (Throwable th) {
            f11187c = true;
            throw th;
        }
    }

    public static boolean b(Context context, String str) {
        boolean equals = str.equals(StubApp.getString2(0));
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled) {
                return false;
            }
            Object systemService = context.getSystemService(StubApp.getString2("11522"));
            D.h(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions == null || !StubApp.getString2("6547").equals(applicationRestrictions.getString(StubApp.getString2("11523")));
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
