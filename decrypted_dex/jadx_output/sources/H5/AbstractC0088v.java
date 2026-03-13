package H5;

import android.app.ActivityManager;
import android.content.Context;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: H5.v, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0088v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0089w f2920a = new C0089w(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C0089w f2921b = new C0089w(1);

    public static ArrayList a(Context context) {
        List filterNotNull;
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(StubApp.getString2(2680));
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = CollectionsKt.emptyList();
        }
        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i3) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new D(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
