package e2;

import N.N;
import N.O;
import N.P;
import N.Q;
import N.c0;
import Xa.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import c2.C0550b;
import c2.C0551c;
import c2.C0558j;
import c2.C0559k;
import c2.C0563o;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e {
    public static C0551c a(C0559k windowMetrics, FoldingFeature oemFeature) {
        C0550b c0550b;
        C0550b c0550b2;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(oemFeature, "oemFeature");
        int type = oemFeature.getType();
        if (type == 1) {
            c0550b = C0550b.f10783g;
        } else {
            if (type != 2) {
                return null;
            }
            c0550b = C0550b.f10784h;
        }
        int state = oemFeature.getState();
        if (state == 1) {
            c0550b2 = C0550b.f10781e;
        } else {
            if (state != 2) {
                return null;
            }
            c0550b2 = C0550b.f10782f;
        }
        Rect rect = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(rect, "oemFeature.bounds");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        if (i3 > i11) {
            throw new IllegalArgumentException(h.o(StubApp.getString2(7600), i3, i11, StubApp.getString2(7601)).toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(h.o(StubApp.getString2(7598), i10, i12, StubApp.getString2(7599)).toString());
        }
        Rect a3 = windowMetrics.f10805a.a();
        int i13 = i12 - i10;
        if (i13 == 0 && i11 - i3 == 0) {
            return null;
        }
        int i14 = i11 - i3;
        if (i14 != a3.width() && i13 != a3.height()) {
            return null;
        }
        if (i14 < a3.width() && i13 < a3.height()) {
            return null;
        }
        if (i14 == a3.width() && i13 == a3.height()) {
            return null;
        }
        Rect bounds = oemFeature.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "oemFeature.bounds");
        return new C0551c(new Z1.b(bounds), c0550b, c0550b2);
    }

    public static C0558j b(Context context, WindowLayoutInfo info) {
        String string2;
        boolean z2;
        C0559k c0559k;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            if (i3 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException(StubApp.getString2(17265));
            }
            C0563o c0563o = C0563o.f10811b;
            return c(C0563o.a((Activity) context), info);
        }
        C0563o c0563o2 = C0563o.f10811b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i3 >= 30) {
            Intrinsics.checkNotNullParameter(context, "context");
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            c0 g10 = c0.g(windowInsets, null);
            Intrinsics.checkNotNullExpressionValue(g10, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
            currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics2.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "wm.currentWindowMetrics.bounds");
            c0559k = new C0559k(bounds, g10);
        } else {
            Intrinsics.checkNotNullParameter(context, "context");
            Context context2 = context;
            while (true) {
                boolean z10 = context2 instanceof ContextWrapper;
                string2 = StubApp.getString2(17264);
                if (!z10) {
                    throw new IllegalArgumentException(StubApp.getString2(12567) + context + string2);
                }
                z2 = context2 instanceof Activity;
                if (z2 || (context2 instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                context2 = contextWrapper.getBaseContext();
                Intrinsics.checkNotNullExpressionValue(context2, "iterator.baseContext");
            }
            if (z2) {
                c0559k = C0563o.a((Activity) context);
            } else {
                if (!(context2 instanceof InputMethodService)) {
                    throw new IllegalArgumentException(context + string2);
                }
                Object systemService = context.getSystemService(StubApp.getString2(526));
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                Intrinsics.checkNotNullExpressionValue(display, "wm.defaultDisplay");
                Intrinsics.checkNotNullParameter(display, "display");
                Point point = new Point();
                Intrinsics.checkNotNullParameter(display, "display");
                Intrinsics.checkNotNullParameter(point, "point");
                display.getRealSize(point);
                Rect rect = new Rect(0, 0, point.x, point.y);
                int i10 = Build.VERSION.SDK_INT;
                c0 b2 = (i10 >= 34 ? new Q() : i10 >= 30 ? new P() : i10 >= 29 ? new O() : new N()).b();
                Intrinsics.checkNotNullExpressionValue(b2, "Builder().build()");
                c0559k = new C0559k(rect, b2);
            }
        }
        return c(c0559k, info);
    }

    public static C0558j c(C0559k windowMetrics, WindowLayoutInfo info) {
        C0551c c0551c;
        Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
        Intrinsics.checkNotNullParameter(info, "info");
        List<FoldingFeature> displayFeatures = info.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature feature : displayFeatures) {
            if (feature instanceof FoldingFeature) {
                Intrinsics.checkNotNullExpressionValue(feature, "feature");
                c0551c = a(windowMetrics, feature);
            } else {
                c0551c = null;
            }
            if (c0551c != null) {
                arrayList.add(c0551c);
            }
        }
        return new C0558j(arrayList);
    }
}
