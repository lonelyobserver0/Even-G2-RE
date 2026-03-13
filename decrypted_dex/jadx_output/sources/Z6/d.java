package Z6;

import N.K;
import Y6.m;
import Y6.n;
import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.threading.AnimationThreadController;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d extends ValueAnimator {

    /* renamed from: n, reason: collision with root package name */
    public static final ScreenCoordinate f8992n = new ScreenCoordinate(0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final TypeEvaluator f8993a;

    /* renamed from: b, reason: collision with root package name */
    public String f8994b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f8995c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f8996d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8997e;

    /* renamed from: f, reason: collision with root package name */
    public K f8998f;

    /* renamed from: g, reason: collision with root package name */
    public Y6.f f8999g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f9000h;
    public final CopyOnWriteArraySet j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9001k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9002l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9003m;

    public d(TypeEvaluator evaluator, m cameraAnimatorOptions) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(cameraAnimatorOptions, "cameraAnimatorOptions");
        this.f8993a = evaluator;
        this.f8994b = cameraAnimatorOptions.f8788c;
        this.f8995c = cameraAnimatorOptions.f8787b;
        Object[] objArr = cameraAnimatorOptions.f8786a;
        this.f8996d = objArr;
        this.f9000h = new CopyOnWriteArraySet();
        this.j = new CopyOnWriteArraySet();
        Object obj = objArr[0];
        setObjectValues(obj, obj);
        super.setEvaluator(evaluator);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new b(this, animatorListener));
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new c(this, animatorUpdateListener));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new Y6.c(this, 2));
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        if (getDuration() == 0 && getStartDelay() == 0) {
            Object last = ArraysKt.last(this.f8996d);
            Intrinsics.checkNotNull(last, "null cannot be cast to non-null type kotlin.Any");
            return last;
        }
        Object animatedValue = super.getAnimatedValue();
        Intrinsics.checkNotNullExpressionValue(animatedValue, "super.getAnimatedValue()");
        return animatedValue;
    }

    public final void i(Y6.f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.removeAllListeners();
        this.f8997e = true;
        this.f8999g = listener;
        super.addListener(listener);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            super.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void j(K listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.removeAllUpdateListeners();
        this.f8998f = listener;
        super.addUpdateListener(listener);
        Iterator it = this.f9000h.iterator();
        while (it.hasNext()) {
            super.addUpdateListener((ValueAnimator.AnimatorUpdateListener) it.next());
        }
    }

    public final Object k(float f10, CameraState cameraState) {
        Serializable serializable;
        Object[] objArr = this.f8996d;
        if (objArr.length != 1) {
            throw new UnsupportedOperationException(StubApp.getString2(7627));
        }
        Serializable serializable2 = this.f8995c;
        if (serializable2 == null && cameraState == null) {
            throw new UnsupportedOperationException(StubApp.getString2(7625));
        }
        if (serializable2 == null) {
            serializable2 = null;
            if (cameraState != null) {
                int ordinal = l().ordinal();
                if (ordinal == 0) {
                    serializable = cameraState.getCenter();
                    Intrinsics.checkNotNullExpressionValue(serializable, "cameraState().center");
                } else if (ordinal == 1) {
                    serializable = Double.valueOf(cameraState.getZoom());
                } else if (ordinal == 2) {
                    serializable = Double.valueOf(cameraState.getBearing());
                } else if (ordinal == 3) {
                    serializable = Double.valueOf(cameraState.getPitch());
                } else if (ordinal == 4) {
                    serializable = f8992n;
                } else {
                    if (ordinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serializable = cameraState.getPadding();
                    Intrinsics.checkNotNullExpressionValue(serializable, "cameraState().padding");
                }
            } else {
                serializable = null;
            }
            if (serializable != null) {
                serializable2 = serializable;
            }
        }
        if (serializable2 == null) {
            throw new UnsupportedOperationException(StubApp.getString2(7626));
        }
        return this.f8993a.evaluate(getInterpolator().getInterpolation(f10), serializable2, ArraysKt.last(objArr));
    }

    public abstract n l();

    public final void m() {
        super.removeListener(this.f8999g);
        this.f8999g = null;
        this.f8997e = false;
    }

    public final void n() {
        super.removeUpdateListener(this.f8998f);
        this.f8998f = null;
    }

    public Object[] o(Object startValue) {
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Object[] objArr = this.f8996d;
        int length = objArr.length + 1;
        Object[] objArr2 = new Object[length];
        int i3 = 0;
        while (i3 < length) {
            objArr2[i3] = i3 == 0 ? startValue : objArr[i3 - 1];
            i3++;
        }
        return objArr2;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new Y6.c(this, 3));
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new Y6.c(this, 4));
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new b(animatorListener, this));
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new c(animatorUpdateListener, this));
    }

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new Y6.c(this, 5));
    }
}
