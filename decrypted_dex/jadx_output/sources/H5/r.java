package H5;

import T.C0286b;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.stub.StubApp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final r f2913b = new r(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final r f2914c = new r(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i10) {
        super(i3);
        this.f2915a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String processName;
        String processName2;
        switch (this.f2915a) {
            case 0:
                C0286b ex = (C0286b) obj;
                Intrinsics.checkNotNullParameter(ex, "ex");
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(2679));
                if (Build.VERSION.SDK_INT > 33) {
                    processName = Process.myProcessName();
                    Intrinsics.checkNotNullExpressionValue(processName, "myProcessName()");
                } else {
                    processName = Application.getProcessName();
                    if (processName == null && (processName = W3.b.a()) == null) {
                        processName = "";
                    }
                }
                sb2.append(processName);
                sb2.append('.');
                Log.w(StubApp.getString2(2668), sb2.toString(), ex);
                break;
            default:
                C0286b ex2 = (C0286b) obj;
                Intrinsics.checkNotNullParameter(ex2, "ex");
                StringBuilder sb3 = new StringBuilder(StubApp.getString2(2678));
                if (Build.VERSION.SDK_INT > 33) {
                    processName2 = Process.myProcessName();
                    Intrinsics.checkNotNullExpressionValue(processName2, "myProcessName()");
                } else {
                    processName2 = Application.getProcessName();
                    if (processName2 == null && (processName2 = W3.b.a()) == null) {
                        processName2 = "";
                    }
                }
                sb3.append(processName2);
                sb3.append('.');
                Log.w(StubApp.getString2(2668), sb3.toString(), ex2);
                break;
        }
        return new X.b(true);
    }
}
