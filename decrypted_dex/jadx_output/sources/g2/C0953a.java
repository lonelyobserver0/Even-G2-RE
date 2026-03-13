package g2;

import N.c0;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0953a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0953a f14214a = new C0953a();

    public final c0 a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        Intrinsics.checkNotNullParameter(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        c0 g10 = c0.g(windowInsets, null);
        Intrinsics.checkNotNullExpressionValue(g10, "toWindowInsetsCompat(platformInsets)");
        return g10;
    }
}
