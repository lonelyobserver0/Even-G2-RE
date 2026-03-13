package c2;

import N.N;
import N.O;
import N.P;
import N.Q;
import N.c0;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.stub.StubApp;
import g2.C0953a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0563o implements InterfaceC0562n {

    /* renamed from: b, reason: collision with root package name */
    public static final C0563o f10811b = new C0563o();

    /* renamed from: c, reason: collision with root package name */
    public static final String f10812c;

    static {
        String simpleName = C0563o.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f10812c = simpleName;
        CollectionsKt.arrayListOf(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public static C0559k a(Activity activity) {
        Rect b2;
        c0 b10;
        WindowMetrics currentWindowMetrics;
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i3 = Build.VERSION.SDK_INT;
        String string2 = StubApp.getString2(354);
        if (i3 >= 30) {
            Intrinsics.checkNotNullParameter(activity, string2);
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            b2 = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(b2, "wm.currentWindowMetrics.bounds");
        } else if (i3 >= 29) {
            String str = f10812c;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField(StubApp.getString2("9403"));
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod(StubApp.getString2("9391"), new Class[0]).invoke(obj, new Object[0]);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                b2 = new Rect((Rect) invoke);
            } catch (IllegalAccessException e10) {
                Log.w(str, e10);
                b2 = b(activity);
            } catch (NoSuchFieldException e11) {
                Log.w(str, e11);
                b2 = b(activity);
            } catch (NoSuchMethodException e12) {
                Log.w(str, e12);
                b2 = b(activity);
            } catch (InvocationTargetException e13) {
                Log.w(str, e13);
                b2 = b(activity);
            }
        } else {
            b2 = b(activity);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            Intrinsics.checkNotNullParameter(activity, string2);
            if (i10 < 30) {
                throw new Exception(StubApp.getString2(8415));
            }
            b10 = C0953a.f14214a.a(activity);
        } else {
            b10 = (i10 >= 34 ? new Q() : i10 >= 30 ? new P() : i10 >= 29 ? new O() : new N()).b();
            Intrinsics.checkNotNullExpressionValue(b10, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new C0559k(new Z1.b(b2), b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Rect b(android.app.Activity r12) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C0563o.b(android.app.Activity):android.graphics.Rect");
    }
}
