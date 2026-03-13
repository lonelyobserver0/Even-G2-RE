package Ra;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import io.flutter.plugin.common.MethodChannel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f6352a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f6353b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f6354c;

    public b(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f6352a = packageManager;
        this.f6353b = activityManager;
        this.f6354c = contentResolver;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|(1:5)|6|(1:8)|33|(2:35|(2:37|(2:39|(2:41|(2:43|(2:45|(2:47|(2:49|(2:51|(2:53|(2:55|(12:57|11|(3:13|(1:18)(2:15|16)|17)|19|20|(2:23|21)|24|25|26|27|28|29))))))))))))|10|11|(0)|19|20|(1:21)|24|25|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0144, code lost:
    
        if (kotlin.text.StringsKt.O(r1, r7) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0248 A[LOOP:1: B:21:0x0242->B:23:0x0248, LOOP_END] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(io.flutter.plugin.common.MethodCall r12, io.flutter.plugin.common.MethodChannel.Result r13) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ra.b.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }
}
