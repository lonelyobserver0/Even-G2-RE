package o7;

import E.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p7.C1495a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f18378b = new c(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f18379c = new c(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18380a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i10) {
        super(i3);
        this.f18380a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18380a) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                Intrinsics.checkNotNullParameter(context, "context");
                b bVar = new b(context, null);
                Resources resources = bVar.getResources();
                ThreadLocal threadLocal = l.f1716a;
                Drawable drawable = resources.getDrawable(2131165554, null);
                if (drawable != null) {
                    bVar.setImageDrawable(drawable);
                }
                float f10 = bVar.getContext().getResources().getDisplayMetrics().density;
                bVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                bVar.setLogoGravity(8388691);
                int i3 = (int) (4 * f10);
                ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(i3, i3, i3, i3);
                layoutParams2.setMarginStart(i3);
                layoutParams2.setMarginEnd(i3);
                return bVar;
            default:
                C1495a LogoSettings = (C1495a) obj;
                Intrinsics.checkNotNullParameter(LogoSettings, "$this$LogoSettings");
                return Unit.INSTANCE;
        }
    }
}
