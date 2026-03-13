package k9;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f15502b = new e(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f15503c = new e(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f15504d = new e(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f15505e = new e(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f15506f = new e(1, 4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15507a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, int i10) {
        super(i3);
        this.f15507a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15507a) {
            case 0:
                ValueAnimator createCenterAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createCenterAnimator, "$this$createCenterAnimator");
                createCenterAnimator.setStartDelay(800L);
                createCenterAnimator.setDuration(1000L);
                createCenterAnimator.setInterpolator(f.f15508a);
                break;
            case 1:
                ValueAnimator createZoomAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createZoomAnimator, "$this$createZoomAnimator");
                createZoomAnimator.setStartDelay(0L);
                createZoomAnimator.setDuration(1800L);
                createZoomAnimator.setInterpolator(f.f15508a);
                break;
            case 2:
                ValueAnimator createBearingAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createBearingAnimator, "$this$createBearingAnimator");
                createBearingAnimator.setStartDelay(600L);
                createBearingAnimator.setDuration(1200L);
                createBearingAnimator.setInterpolator(f.f15508a);
                break;
            case 3:
                ValueAnimator createPitchAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createPitchAnimator, "$this$createPitchAnimator");
                createPitchAnimator.setStartDelay(0L);
                createPitchAnimator.setDuration(1000L);
                createPitchAnimator.setInterpolator(f.f15508a);
                break;
            default:
                ValueAnimator createPaddingAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createPaddingAnimator, "$this$createPaddingAnimator");
                createPaddingAnimator.setStartDelay(0L);
                createPaddingAnimator.setDuration(1200L);
                createPaddingAnimator.setInterpolator(f.f15508a);
                break;
        }
        return Unit.INSTANCE;
    }
}
