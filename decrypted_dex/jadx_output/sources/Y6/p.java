package Y6;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final p f8805b = new p(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final p f8806c = new p(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final p f8807d = new p(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final p f8808e = new p(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final p f8809f = new p(1, 4);

    /* renamed from: g, reason: collision with root package name */
    public static final p f8810g = new p(1, 5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i3, int i10) {
        super(i3);
        this.f8811a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8811a) {
            case 0:
                ValueAnimator put = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(put, "$this$put");
                put.setDuration(300L);
                put.setInterpolator(r.f8819d);
                break;
            case 1:
                ValueAnimator put2 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(put2, "$this$put");
                put2.setDuration(300L);
                put2.setInterpolator(r.f8819d);
                break;
            case 2:
                ValueAnimator put3 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(put3, "$this$put");
                put3.setDuration(300L);
                put3.setInterpolator(r.f8819d);
                break;
            case 3:
                ValueAnimator put4 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(put4, "$this$put");
                put4.setDuration(300L);
                put4.setInterpolator(r.f8819d);
                break;
            case 4:
                ValueAnimator put5 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(put5, "$this$put");
                put5.setDuration(300L);
                put5.setInterpolator(r.f8819d);
                break;
            default:
                ValueAnimator put6 = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(put6, "$this$put");
                put6.setDuration(300L);
                put6.setInterpolator(r.f8819d);
                break;
        }
        return Unit.INSTANCE;
    }
}
