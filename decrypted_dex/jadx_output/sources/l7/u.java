package l7;

import android.animation.ValueAnimator;
import com.mapbox.geojson.Point;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f16800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i3) {
        super(1);
        this.f16799a = i3;
        this.f16800b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16799a) {
            case 0:
                this.f16800b.f16811l = ((Number) obj).doubleValue();
                break;
            case 1:
                this.f16800b.f16809i = ((Number) obj).doubleValue();
                break;
            case 2:
                Point it = (Point) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f16800b.f16807g = it;
                break;
            default:
                ValueAnimator animateToBearing = (ValueAnimator) obj;
                Intrinsics.checkNotNullParameter(animateToBearing, "$this$animateToBearing");
                animateToBearing.setDuration(0L);
                animateToBearing.addListener(this.f16800b.f16810k);
                break;
        }
        return Unit.INSTANCE;
    }
}
