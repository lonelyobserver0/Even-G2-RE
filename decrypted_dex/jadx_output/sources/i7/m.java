package i7;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f14874b = new m(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f14875c = new m(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f14876d = new m(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final m f14877e = new m(1, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, int i10) {
        super(i3);
        this.f14878a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14878a) {
            case 0:
                ValueAnimator createAnchorAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createAnchorAnimator, "$this$createAnchorAnimator");
                createAnchorAnimator.setDuration(0L);
                break;
            case 1:
                ValueAnimator createBearingAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createBearingAnimator, "$this$createBearingAnimator");
                createBearingAnimator.setDuration(0L);
                break;
            case 2:
                ValueAnimator createAnchorAnimator2 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createAnchorAnimator2, "$this$createAnchorAnimator");
                createAnchorAnimator2.setDuration(0L);
                break;
            default:
                ValueAnimator createZoomAnimator = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(createZoomAnimator, "$this$createZoomAnimator");
                createZoomAnimator.setDuration(0L);
                break;
        }
        return Unit.INSTANCE;
    }
}
