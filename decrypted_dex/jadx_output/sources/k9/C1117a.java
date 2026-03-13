package k9;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: k9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1117a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1117a(long j, int i3) {
        super(1);
        this.f15496a = i3;
        this.f15497b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15496a) {
            case 0:
                ValueAnimator createCenterAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createCenterAnimator, "$this$createCenterAnimator");
                createCenterAnimator.setDuration(this.f15497b);
                createCenterAnimator.setInterpolator(C1118b.f15498b);
                break;
            case 1:
                ValueAnimator createZoomAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createZoomAnimator, "$this$createZoomAnimator");
                createZoomAnimator.setDuration(this.f15497b);
                createZoomAnimator.setInterpolator(C1118b.f15498b);
                break;
            case 2:
                ValueAnimator createBearingAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createBearingAnimator, "$this$createBearingAnimator");
                createBearingAnimator.setDuration(this.f15497b);
                createBearingAnimator.setInterpolator(C1118b.f15498b);
                break;
            case 3:
                ValueAnimator createPitchAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createPitchAnimator, "$this$createPitchAnimator");
                createPitchAnimator.setDuration(this.f15497b);
                createPitchAnimator.setInterpolator(C1118b.f15498b);
                break;
            default:
                ValueAnimator createPaddingAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createPaddingAnimator, "$this$createPaddingAnimator");
                createPaddingAnimator.setDuration(this.f15497b);
                createPaddingAnimator.setInterpolator(C1118b.f15498b);
                break;
        }
        return Unit.INSTANCE;
    }
}
