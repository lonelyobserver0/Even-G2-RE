package Y6;

import R8.C0245c;
import android.animation.ValueAnimator;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.threading.AnimationThreadController;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator[] f8759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ValueAnimator[] valueAnimatorArr, j jVar, boolean z2) {
        super(0);
        this.f8759a = valueAnimatorArr;
        this.f8760b = jVar;
        this.f8761c = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ValueAnimator[] valueAnimatorArr = this.f8759a;
        int length = valueAnimatorArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                ValueAnimator valueAnimator = valueAnimatorArr[i3];
                if (!(valueAnimator instanceof Z6.d)) {
                    MapboxLogger.logE(StubApp.getString2(374), StubApp.getString2(7547));
                    break;
                }
                AnimationThreadController.INSTANCE.postOnAnimatorThread(new C0245c(1, (Z6.d) valueAnimator, this.f8761c));
                i3++;
            } else {
                HashSet hashSet = this.f8760b.f8764a;
                ArrayList arrayList = new ArrayList(valueAnimatorArr.length);
                for (ValueAnimator valueAnimator2 : valueAnimatorArr) {
                    Intrinsics.checkNotNull(valueAnimator2, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>");
                    arrayList.add((Z6.d) valueAnimator2);
                }
                hashSet.removeAll(arrayList);
            }
        }
        return Unit.INSTANCE;
    }
}
