package com.google.android.gms.common;

import S3.P;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.stub.StubApp;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class e {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final e zza;
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = StubApp.getString2(0);
    public static final String GOOGLE_PLAY_STORE_PACKAGE = StubApp.getString2(3519);
    static final String TRACKING_SOURCE_DIALOG = StubApp.getString2(1315);
    static final String TRACKING_SOURCE_NOTIFICATION = StubApp.getString2(1309);

    static {
        int i3 = h.f11189e;
        GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
        zza = new e();
    }

    public static e getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        if (h.f11185a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(StubApp.getString2("490"));
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException e10) {
            Log.d(StubApp.getString2(11495), StubApp.getString2(11496), e10);
        }
    }

    public int getApkVersion(Context context) {
        int i3 = h.f11189e;
        try {
            return context.getPackageManager().getPackageInfo(StubApp.getString2("0"), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w(StubApp.getString2(11495), StubApp.getString2(11497));
            return 0;
        }
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i3) {
        return getErrorResolutionIntent(null, i3, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i3, int i10, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i3, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i10, errorResolutionIntent, 201326592);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:2|3)|4|(4:8|3b|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(11:52|(1:54)(1:106)|55|(2:102|103)(1:57)|58|59|60|(1:62)(2:(2:72|(1:74))|(4:80|(1:82)(1:99)|(1:84)|(1:86)(4:87|(2:93|94)|89|(1:91)(1:92)))(1:79))|63|(1:(1:66)(1:67))|(1:69)(1:70)))|107|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0231, code lost:
    
        android.util.Log.w(com.stub.StubApp.getString2(11495), java.lang.String.valueOf(r3).concat(com.stub.StubApp.getString2(11518)));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0261 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0262 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int isGooglePlayServicesAvailable(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.e.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i3) {
        int i10 = h.f11189e;
        if (i3 == 18) {
            return true;
        }
        if (i3 == 1) {
            return h.b(context, StubApp.getString2(0));
        }
        return false;
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i3) {
        if (i3 == 9) {
            return h.b(context, StubApp.getString2(3519));
        }
        int i10 = h.f11189e;
        return false;
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return h.b(context, str);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i3) throws g, f {
        int i10 = h.f11189e;
        int isGooglePlayServicesAvailable = getInstance().isGooglePlayServicesAvailable(context, i3);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, StubApp.getString2(1958));
            Xa.h.B(isGooglePlayServicesAvailable, StubApp.getString2(11519), StubApp.getString2(11495));
            if (errorResolutionIntent != null) {
                throw new g(StubApp.getString2(11520));
            }
            throw new f();
        }
    }

    public Intent getErrorResolutionIntent(Context context, int i3, String str) {
        String string2 = StubApp.getString2(0);
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            int i10 = P.f6488a;
            Uri fromParts = Uri.fromParts(StubApp.getString2(3503), string2, null);
            Intent intent = new Intent(StubApp.getString2(143));
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && W3.b.c(context)) {
            int i11 = P.f6488a;
            Intent intent2 = new Intent(StubApp.getString2(11498));
            intent2.setPackage(StubApp.getString2(11499));
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11500));
        sb2.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        String string22 = StubApp.getString2(999);
        sb2.append(string22);
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append(string22);
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append(string22);
        if (context != null) {
            try {
                sb2.append(Y3.c.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        int i12 = P.f6488a;
        Intent intent3 = new Intent(StubApp.getString2(5111));
        Uri.Builder appendQueryParameter = Uri.parse(StubApp.getString2(11501)).buildUpon().appendQueryParameter(StubApp.getString2(290), string2);
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter(StubApp.getString2(11502), sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage(StubApp.getString2(3519));
        intent3.addFlags(PKIFailureInfo.signerNotTrusted);
        return intent3;
    }
}
