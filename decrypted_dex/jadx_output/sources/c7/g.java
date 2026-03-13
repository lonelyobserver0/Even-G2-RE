package c7;

import E.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import d7.C0807b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f11035b = new g(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f11036c = new g(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i10) {
        super(i3);
        this.f11037a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11037a) {
            case 0:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                Intrinsics.checkNotNullParameter(context, "context");
                j jVar = new j(context, null, 0);
                Resources resources = jVar.getResources();
                ThreadLocal threadLocal = l.f1716a;
                Drawable drawable = resources.getDrawable(2131165346, null);
                if (drawable != null) {
                    jVar.setImageDrawable(drawable);
                }
                jVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                jVar.setContentDescription(context.getString(2131755150));
                return jVar;
            default:
                C0807b AttributionSettings = (C0807b) obj;
                Intrinsics.checkNotNullParameter(AttributionSettings, "$this$AttributionSettings");
                return Unit.INSTANCE;
        }
    }
}
