package i7;

import android.animation.ValueAnimator;
import f0.C0868a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0868a f14872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14873c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(C0868a c0868a, long j, int i3) {
        super(1);
        this.f14871a = i3;
        this.f14872b = c0868a;
        this.f14873c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14871a) {
            case 0:
                ValueAnimator createAnchorAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createAnchorAnimator, "$this$createAnchorAnimator");
                createAnchorAnimator.setInterpolator(this.f14872b);
                createAnchorAnimator.setDuration(this.f14873c);
                break;
            case 1:
                ValueAnimator createBearingAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createBearingAnimator, "$this$createBearingAnimator");
                createBearingAnimator.setInterpolator(this.f14872b);
                createBearingAnimator.setDuration(this.f14873c);
                break;
            case 2:
                ValueAnimator createAnchorAnimator2 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createAnchorAnimator2, "$this$createAnchorAnimator");
                createAnchorAnimator2.setInterpolator(this.f14872b);
                createAnchorAnimator2.setDuration(this.f14873c);
                break;
            default:
                ValueAnimator createZoomAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createZoomAnimator, "$this$createZoomAnimator");
                createZoomAnimator.setInterpolator(this.f14872b);
                createZoomAnimator.setDuration(this.f14873c);
                break;
        }
        return Unit.INSTANCE;
    }
}
