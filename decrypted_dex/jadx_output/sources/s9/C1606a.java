package s9;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o9.C1467c;

/* renamed from: s9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1606a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1467c f20819b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1606a(C1467c c1467c, Lambda lambda, int i3) {
        super(1);
        this.f20818a = i3;
        this.f20819b = c1467c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20818a) {
            case 0:
                ValueAnimator onLocationUpdated = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(onLocationUpdated, "$this$onLocationUpdated");
                onLocationUpdated.setDuration(1000L);
                C1467c c1467c = this.f20819b;
                onLocationUpdated.setInterpolator(c1467c);
                onLocationUpdated.setEvaluator(c1467c);
                break;
            default:
                ValueAnimator onBearingUpdated = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(onBearingUpdated, "$this$onBearingUpdated");
                onBearingUpdated.setInterpolator(this.f20819b);
                onBearingUpdated.setDuration(1000L);
                break;
        }
        return Unit.INSTANCE;
    }
}
