package Z4;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.stub.StubApp;
import f5.C0888a0;
import f5.D0;
import f5.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8980a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final c f8981b = new c();

    public static C0888a0 a(c cVar, String processName, int i3, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(processName, "processName");
        Z z2 = new Z();
        if (processName == null) {
            throw new NullPointerException(StubApp.getString2(7621));
        }
        z2.f13946a = processName;
        z2.f13947b = i3;
        byte b2 = (byte) (z2.f13950e | 1);
        z2.f13948c = i10;
        z2.f13949d = false;
        z2.f13950e = (byte) (((byte) (b2 | 2)) | 4);
        C0888a0 a3 = z2.a();
        Intrinsics.checkNotNullExpressionValue(a3, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a3;
    }

    public static ArrayList d(Context context) {
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
            Z z2 = new Z();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException(StubApp.getString2(7621));
            }
            z2.f13946a = str2;
            z2.f13947b = runningAppProcessInfo.pid;
            byte b2 = (byte) (z2.f13950e | 1);
            z2.f13948c = runningAppProcessInfo.importance;
            z2.f13950e = (byte) (b2 | 2);
            z2.f13949d = Intrinsics.areEqual(str2, str);
            z2.f13950e = (byte) (z2.f13950e | 4);
            arrayList2.add(z2.a());
        }
        return arrayList2;
    }

    public boolean b(int i3) {
        return 4 <= i3 || Log.isLoggable(StubApp.getString2(280), i3);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d(StubApp.getString2(280), str, null);
        }
    }

    public D0 e(Context context) {
        Object obj;
        String processName;
        Intrinsics.checkNotNullParameter(context, "context");
        int myPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C0888a0) ((D0) obj)).f13956b == myPid) {
                break;
            }
        }
        D0 d02 = (D0) obj;
        if (d02 != null) {
            return d02;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "{\n      Process.myProcessName()\n    }");
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        return a(this, processName, myPid, 0, 12);
    }

    public void f(String str) {
        if (b(2)) {
            Log.v(StubApp.getString2(280), str, null);
        }
    }

    public void g(String str, Exception exc) {
        if (b(5)) {
            Log.w(StubApp.getString2(280), str, exc);
        }
    }
}
