package C;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.stub.StubApp;
import i.AbstractActivityC1027h;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0026c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f823a = new Object();

    public static Intent a(AbstractActivityC1027h abstractActivityC1027h) {
        Intent parentActivityIntent = abstractActivityC1027h.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String c10 = c(abstractActivityC1027h, abstractActivityC1027h.getComponentName());
            if (c10 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC1027h, c10);
            try {
                return c(abstractActivityC1027h, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e(StubApp.getString2(789), StubApp.getString2(787) + c10 + StubApp.getString2(788));
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static Intent b(AbstractActivityC1027h abstractActivityC1027h, ComponentName componentName) {
        String c10 = c(abstractActivityC1027h, componentName);
        if (c10 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), c10);
        return c(abstractActivityC1027h, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(StubApp.getString2(790))) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = C.AbstractC0026c.f823a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            java.lang.String r6 = "791"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L16
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r5 = move-exception
            goto L88
        L18:
            java.lang.String r1 = "791"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L77
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L16 java.io.FileNotFoundException -> L77
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r3 = "640"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r3 = "792"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r3 = "793"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            java.lang.String r6 = "792"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            r1.endDocument()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            if (r5 == 0) goto L6f
        L56:
            r5.close()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L6f
            goto L6f
        L5a:
            r6 = move-exception
            goto L71
        L5c:
            r6 = move-exception
            java.lang.String r1 = "794"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "795"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L5a
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L6f
            goto L56
        L6f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L87
        L71:
            if (r5 == 0) goto L76
            r5.close()     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L76
        L76:
            throw r6     // Catch: java.lang.Throwable -> L16
        L77:
            java.lang.String r5 = "794"
            java.lang.String r5 = com.stub.StubApp.getString2(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = "796"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L16
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
        L87:
            return
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: C.AbstractC0026c.d(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0032, code lost:
    
        if (r5 != 4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r3.getName().equals(com.stub.StubApp.getString2("792")) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0045, code lost:
    
        r1 = r3.getAttributeValue(null, com.stub.StubApp.getString2("793"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0067, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(android.content.Context r8) {
        /*
            java.lang.Object r0 = C.AbstractC0026c.f823a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L56 java.io.FileNotFoundException -> L82
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            java.lang.String r4 = "640"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
        L1c:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            r6 = 1
            if (r5 == r6) goto L50
            r6 = 3
            if (r5 != r6) goto L2f
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            if (r7 <= r4) goto L50
            goto L2f
        L2d:
            r8 = move-exception
            goto L7c
        L2f:
            if (r5 == r6) goto L1c
            r6 = 4
            if (r5 != r6) goto L35
            goto L1c
        L35:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            java.lang.String r6 = "792"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            if (r5 == 0) goto L1c
            java.lang.String r4 = "793"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L2d java.lang.Throwable -> L58
        L50:
            if (r2 == 0) goto L6a
        L52:
            r2.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L6a
            goto L6a
        L56:
            r8 = move-exception
            goto L84
        L58:
            java.lang.String r3 = "794"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "797"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.lang.Throwable -> L2d
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L6a
            goto L52
        L6a:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L71
            goto L7a
        L71:
            java.lang.String r2 = "791"
            java.lang.String r2 = com.stub.StubApp.getString2(r2)     // Catch: java.lang.Throwable -> L56
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L56
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return r1
        L7c:
            if (r2 == 0) goto L81
            r2.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L81
        L81:
            throw r8     // Catch: java.lang.Throwable -> L56
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return r1
        L84:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C.AbstractC0026c.e(android.content.Context):java.lang.String");
    }
}
