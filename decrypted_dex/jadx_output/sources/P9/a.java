package P9;

import Xa.AbstractActivityC0364d;
import Ya.d;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f5644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EventChannel.EventSink f5645c;

    public a(View view, b bVar, EventChannel.EventSink eventSink) {
        this.f5643a = view;
        this.f5644b = bVar;
        this.f5645c = eventSink;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AbstractActivityC0364d abstractActivityC0364d;
        Resources resources;
        WindowInsets rootWindowInsets;
        int navigationBars;
        AbstractActivityC0364d abstractActivityC0364d2;
        Window window;
        eb.b bVar;
        AbstractActivityC0364d abstractActivityC0364d3;
        Resources resources2;
        AbstractActivityC0364d abstractActivityC0364d4;
        Resources resources3;
        Rect rect = new Rect();
        View view = this.f5643a;
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getHeight();
        b bVar2 = this.f5644b;
        eb.b bVar3 = bVar2.f5648c;
        DisplayMetrics displayMetrics = null;
        Integer valueOf = (bVar3 == null || (abstractActivityC0364d4 = ((d) bVar3).f8882a) == null || (resources3 = abstractActivityC0364d4.getResources()) == null) ? null : Integer.valueOf(resources3.getIdentifier(StubApp.getString2(5041), StubApp.getString2(5040), StubApp.getString2(3400)));
        boolean z2 = false;
        int dimensionPixelSize = (valueOf == null || valueOf.intValue() <= 0 || (bVar = bVar2.f5648c) == null || (abstractActivityC0364d3 = ((d) bVar).f8882a) == null || (resources2 = abstractActivityC0364d3.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(valueOf.intValue());
        int i3 = height - rect.bottom;
        eb.b bVar4 = bVar2.f5648c;
        View decorView = (bVar4 == null || (abstractActivityC0364d2 = ((d) bVar4).f8882a) == null || (window = abstractActivityC0364d2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                navigationBars = WindowInsets.Type.navigationBars();
                z2 = rootWindowInsets.isVisible(navigationBars);
            } else if (rootWindowInsets.getSystemWindowInsetBottom() > 0) {
                z2 = true;
            }
        }
        if (z2) {
            i3 -= dimensionPixelSize;
        }
        eb.b bVar5 = bVar2.f5648c;
        if (bVar5 != null && (abstractActivityC0364d = ((d) bVar5).f8882a) != null && (resources = abstractActivityC0364d.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        float f10 = i3 / (displayMetrics != null ? displayMetrics.density : 1.0f);
        double d8 = i3;
        double d10 = height * 0.15d;
        EventChannel.EventSink eventSink = this.f5645c;
        if (d8 > d10) {
            if (eventSink != null) {
                eventSink.success(Double.valueOf(f10));
            }
        } else if (eventSink != null) {
            eventSink.success(Double.valueOf(0.0d));
        }
    }
}
