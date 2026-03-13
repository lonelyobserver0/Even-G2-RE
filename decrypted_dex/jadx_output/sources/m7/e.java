package m7;

import N.K;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l7.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class e extends ValueAnimator {

    /* renamed from: e, reason: collision with root package name */
    public static final LinearInterpolator f17135e = new LinearInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Lambda f17136a;

    /* renamed from: b, reason: collision with root package name */
    public final ValueAnimator f17137b;

    /* renamed from: c, reason: collision with root package name */
    public t f17138c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17139d;

    public e(TypeEvaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        setObjectValues(new Object[0]);
        super.setEvaluator(evaluator);
        super.addUpdateListener(new K(this, 3));
        setDuration(1000L);
        setInterpolator(f17135e);
        ValueAnimator clone = clone();
        this.f17137b = clone;
        clone.setDuration(getDuration());
    }

    public final void a(Object[] targets, Function1 function1) {
        Intrinsics.checkNotNullParameter(targets, "targets");
        b();
        if (function1 == null) {
            setObjectValues(Arrays.copyOf(targets, targets.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(this, 0));
        } else {
            ValueAnimator valueAnimator = this.f17137b;
            function1.invoke(valueAnimator);
            valueAnimator.setObjectValues(Arrays.copyOf(targets, targets.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(this, 1));
        }
    }

    public final void b() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new d(this, 2));
    }

    public abstract void c(Object obj, float f10);

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator clone() {
        ValueAnimator clone = super.clone();
        Intrinsics.checkNotNullExpressionValue(clone, "super.clone()");
        return clone;
    }
}
