package D;

import C.AbstractC0027d;
import C.J;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1214a = null;

    public static int a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals(StubApp.getString2(783), str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new J(context).f810b.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException(StubApp.getString2(1235));
    }

    public static int b(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, AbstractC0027d.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (b(r8, r8) == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r8, android.content.BroadcastReceiver r9, android.content.IntentFilter r10, int r11) {
        /*
            r0 = r11 & 2
            if (r0 != 0) goto L16
            r1 = r11 & 4
            if (r1 == 0) goto L9
            goto L16
        L9:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r9 = 1236(0x4d4, float:1.732E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        L16:
            if (r0 == 0) goto L2a
            r0 = r11 & 4
            if (r0 != 0) goto L1d
            goto L2a
        L1d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r9 = 1237(0x4d5, float:1.733E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.<init>(r9)
            throw r8
        L2a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r5 = 0
            r6 = 0
            if (r0 < r1) goto L3a
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r11
            r2.registerReceiver(r3, r4, r5, r6, r7)
            return
        L3a:
            r2 = r8
            r3 = r9
            r4 = r10
            r7 = r11
            r8 = r7 & 4
            if (r8 == 0) goto La4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r2.getApplicationContext()
            android.content.Context r9 = com.stub.StubApp.getOrigApplicationContext(r9)
            java.lang.String r9 = r9.getPackageName()
            r8.append(r9)
            r9 = 1238(0x4d6, float:1.735E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r10 = b(r2, r8)
            if (r10 == 0) goto La0
            r10 = 29
            if (r0 < r10) goto L88
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = A.a.j(r2)
            r8.append(r10)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            int r9 = b(r2, r8)
            if (r9 != 0) goto L88
            goto La0
        L88:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            r10 = 1239(0x4d7, float:1.736E-42)
            java.lang.String r10 = com.stub.StubApp.getString2(r10)
            r11 = 1240(0x4d8, float:1.738E-42)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            java.lang.String r8 = E1.a.k(r10, r8, r11)
            r9.<init>(r8)
            throw r9
        La0:
            r2.registerReceiver(r3, r4, r8, r6)
            return
        La4:
            r7 = 0
            r2.registerReceiver(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.a.c(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, int):void");
    }
}
