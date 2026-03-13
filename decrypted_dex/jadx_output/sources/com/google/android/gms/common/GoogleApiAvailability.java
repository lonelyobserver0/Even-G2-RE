package com.google.android.gms.common;

import C.C0034k;
import C.C0036m;
import R3.AbstractC0239h;
import R3.C0236e;
import R3.F;
import R3.H;
import R3.I;
import R3.InterfaceC0240i;
import R3.x;
import S3.C0284s;
import S3.D;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.stub.StubApp;
import d0.AbstractComponentCallbacksC0789t;
import d0.C0771a;
import d0.C0791v;
import d0.M;
import f.AbstractC0863c;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.Arrays;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {c4.d.class, c4.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class GoogleApiAvailability extends e {
    private String zac;
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = StubApp.getString2(0);
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = e.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final q4.j zai(Q3.l lVar, Q3.l... lVarArr) {
        C0236e c0236e;
        D.i(lVar, StubApp.getString2(11432));
        for (Q3.l lVar2 : lVarArr) {
            D.i(lVar2, StubApp.getString2(11432));
        }
        ArrayList arrayList = new ArrayList(lVarArr.length + 1);
        arrayList.add(lVar);
        arrayList.addAll(Arrays.asList(lVarArr));
        synchronized (C0236e.f6121t) {
            D.i(C0236e.f6122v, StubApp.getString2("11433"));
            c0236e = C0236e.f6122v;
        }
        c0236e.getClass();
        F f10 = new F(arrayList);
        c4.h hVar = c0236e.f6135p;
        hVar.sendMessage(hVar.obtainMessage(2, f10));
        return f10.f6095c.f20051a;
    }

    public q4.j checkApiAvailability(Q3.h hVar, Q3.h... hVarArr) {
        return zai(hVar, hVarArr).onSuccessTask(k.f11197c);
    }

    public int getClientVersion(Context context) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i3 = h.f11189e;
        try {
            packageInfo = Y3.c.a(context).b(128, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt(StubApp.getString2(11434), -1);
    }

    public Dialog getErrorDialog(Activity activity, int i3, int i10) {
        return getErrorDialog(activity, i3, i10, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.e
    public Intent getErrorResolutionIntent(Context context, int i3, String str) {
        return super.getErrorResolutionIntent(context, i3, str);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, b bVar) {
        PendingIntent pendingIntent;
        int i3 = bVar.f11176b;
        return (i3 == 0 || (pendingIntent = bVar.f11177c) == null) ? getErrorResolutionPendingIntent(context, i3, 0) : pendingIntent;
    }

    public final String getErrorString(int i3) {
        int i10 = h.f11189e;
        return b.f(i3);
    }

    @ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, e.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final boolean isUserResolvableError(int i3) {
        int i10 = h.f11189e;
        return i3 == 1 || i3 == 2 || i3 == 3 || i3 == 9;
    }

    public q4.j makeGooglePlayServicesAvailable(Activity activity) {
        int i3 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(StubApp.getString2(11436));
        }
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i3);
        if (isGooglePlayServicesAvailable == 0) {
            return a4.f.m(null);
        }
        InterfaceC0240i b2 = AbstractC0239h.b(activity);
        String string2 = StubApp.getString2(11435);
        x xVar = (x) b2.b(x.class, string2);
        if (xVar == null) {
            xVar = new x(b2, getInstance());
            xVar.f6165f = new q4.k();
            b2.g(string2, xVar);
        } else if (xVar.f6165f.f20051a.isComplete()) {
            xVar.f6165f = new q4.k();
        }
        xVar.l(new b(isGooglePlayServicesAvailable, null), 0);
        return xVar.f6165f.f20051a;
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(Context context, String str) {
        Object systemService = context.getSystemService(StubApp.getString2(490));
        D.h(systemService);
        D.h(((NotificationManager) systemService).getNotificationChannel(str));
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i3, int i10) {
        return showErrorDialogFragment(activity, i3, i10, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i3) {
        zae(context, i3, null, getErrorResolutionPendingIntent(context, i3, 0, StubApp.getString2(1309)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog zaa(Context context, int i3, S3.u uVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = StubApp.getString2(11438).equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(S3.r.b(context, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i3 != 1 ? i3 != 2 ? i3 != 3 ? resources.getString(R.string.ok) : resources.getString(2131755054) : resources.getString(2131755064) : resources.getString(2131755057);
        if (string != null) {
            if (uVar == null) {
                uVar = onClickListener;
            }
            builder.setPositiveButton(string, uVar);
        }
        String c10 = S3.r.c(context, i3);
        if (c10 != null) {
            builder.setTitle(c10);
        }
        Log.w(StubApp.getString2(5987), i2.u.p(i3, StubApp.getString2(11439)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog zab(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(S3.r.b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, StubApp.getString2(11440), onCancelListener);
        return create;
    }

    @ResultIgnorabilityUnspecified
    public final R3.v zac(Context context, R3.u uVar) {
        IntentFilter intentFilter = new IntentFilter(StubApp.getString2(11441));
        intentFilter.addDataScheme(StubApp.getString2(3503));
        R3.v vVar = new R3.v(uVar);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            context.registerReceiver(vVar, intentFilter, i3 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(vVar, intentFilter);
        }
        vVar.f6162a = context;
        if (isUninstalledAppPossiblyUpdating(context, StubApp.getString2(0))) {
            return vVar;
        }
        H h2 = (H) uVar;
        I i10 = (I) h2.f6101b.f5734c;
        i10.f6103c.set(null);
        i10.k();
        Dialog dialog = h2.f6100a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
        synchronized (vVar) {
            try {
                Context context2 = vVar.f6162a;
                if (context2 != null) {
                    context2.unregisterReceiver(vVar);
                }
                vVar.f6162a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public final void zad(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        String string2 = StubApp.getString2(11442);
        try {
            if (activity instanceof AbstractActivityC1027h) {
                C0791v c0791v = (C0791v) ((AbstractActivityC1027h) activity).f14605w.f9233b;
                j jVar = new j();
                D.i(dialog, string2);
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                jVar.f11193C0 = dialog;
                if (onCancelListener != null) {
                    jVar.f11194D0 = onCancelListener;
                }
                jVar.f13332z0 = false;
                jVar.f13319A0 = true;
                M m4 = c0791v.f13394d;
                m4.getClass();
                C0771a c0771a = new C0771a(m4);
                c0771a.f13253o = true;
                c0771a.e(0, jVar, str, 1);
                c0771a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        D.i(dialog, string2);
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        cVar.f11179a = dialog;
        if (onCancelListener != null) {
            cVar.f11180b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void zae(Context context, int i3, String str, PendingIntent pendingIntent) {
        String str2;
        int i10;
        Log.w(StubApp.getString2(5987), Xa.h.g(i3, StubApp.getString2(11443), StubApp.getString2(11444)), new IllegalArgumentException());
        if (i3 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w(StubApp.getString2(5987), StubApp.getString2(11445));
                return;
            }
            return;
        }
        String e10 = i3 == 6 ? S3.r.e(context, StubApp.getString2(11446)) : S3.r.c(context, i3);
        if (e10 == null) {
            e10 = context.getResources().getString(2131755061);
        }
        String d8 = (i3 == 6 || i3 == 19) ? S3.r.d(context, StubApp.getString2(11447), S3.r.a(context)) : S3.r.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService(StubApp.getString2(490));
        D.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C0036m c0036m = new C0036m(context, null);
        c0036m.f879u = true;
        c0036m.d(16, true);
        c0036m.f864e = C0036m.c(e10);
        C0034k c0034k = new C0034k(0);
        c0034k.f848f = C0036m.c(d8);
        c0036m.g(c0034k);
        PackageManager packageManager = context.getPackageManager();
        if (W3.b.f8102c == null) {
            W3.b.f8102c = Boolean.valueOf(packageManager.hasSystemFeature(StubApp.getString2(5692)));
        }
        if (W3.b.f8102c.booleanValue()) {
            c0036m.f857I.icon = context.getApplicationInfo().icon;
            c0036m.f869k = 2;
            if (W3.b.c(context)) {
                c0036m.a(2131165283, resources.getString(2131755069), pendingIntent);
            } else {
                c0036m.f866g = pendingIntent;
            }
        } else {
            c0036m.f857I.icon = R.drawable.stat_sys_warning;
            c0036m.f857I.tickerText = C0036m.c(resources.getString(2131755061));
            c0036m.f857I.when = System.currentTimeMillis();
            c0036m.f866g = pendingIntent;
            c0036m.f865f = C0036m.c(d8);
        }
        synchronized (zaa) {
            str2 = this.zac;
        }
        if (str2 == null) {
            str2 = StubApp.getString2(11448);
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
            String string = context.getResources().getString(2131755060);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(str2, string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        c0036m.f852D = str2;
        Notification b2 = c0036m.b();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            h.f11185a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, b2);
    }

    public final void zaf(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean zag(Activity activity, InterfaceC0240i interfaceC0240i, int i3, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i3, new S3.t(getErrorResolutionIntent(activity, i3, StubApp.getString2(1315)), interfaceC0240i), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, StubApp.getString2(11437), onCancelListener);
        return true;
    }

    public final boolean zah(Context context, b bVar, int i3) {
        PendingIntent errorResolutionPendingIntent;
        if (Y3.a.o(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, bVar)) == null) {
            return false;
        }
        int i10 = bVar.f11176b;
        int i11 = GoogleApiActivity.f11166b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(StubApp.getString2(5239), errorResolutionPendingIntent);
        intent.putExtra(StubApp.getString2(5240), i3);
        intent.putExtra(StubApp.getString2(5241), true);
        zae(context, i10, null, PendingIntent.getActivity(context, 0, intent, c4.g.f10826a | 134217728));
        return true;
    }

    public Dialog getErrorDialog(Activity activity, int i3, int i10, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i3, new C0284s(getErrorResolutionIntent(activity, i3, StubApp.getString2(1315)), activity, i10, 0), onCancelListener, null);
    }

    @Override // com.google.android.gms.common.e
    public int isGooglePlayServicesAvailable(Context context, int i3) {
        return super.isGooglePlayServicesAvailable(context, i3);
    }

    @ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(Activity activity, int i3, int i10, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i3, i10, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, StubApp.getString2(11437), onCancelListener);
        return true;
    }

    public q4.j checkApiAvailability(Q3.l lVar, Q3.l... lVarArr) {
        return zai(lVar, lVarArr).onSuccessTask(k.f11196b);
    }

    public void showErrorNotification(Context context, b bVar) {
        zae(context, bVar.f11176b, null, getErrorResolutionPendingIntent(context, bVar));
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i3, int i10) {
        return getErrorResolutionPendingIntent(context, i3, i10, null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i3, AbstractC0863c abstractC0863c, DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i3, null, onCancelListener, new l(this, activity, i3, abstractC0863c));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, StubApp.getString2(11437), onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, int i3, int i10) {
        return getErrorDialog(abstractComponentCallbacksC0789t, i3, i10, (DialogInterface.OnCancelListener) null);
    }

    public Dialog getErrorDialog(AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, int i3, int i10, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(abstractComponentCallbacksC0789t.I(), i3, new C0284s(getErrorResolutionIntent(abstractComponentCallbacksC0789t.I(), i3, StubApp.getString2(1315)), abstractComponentCallbacksC0789t, i10, 1), onCancelListener, null);
    }
}
