package Z6;

import N.K;
import android.animation.ValueAnimator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8989a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f8990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f8991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        super(0);
        this.f8991c = dVar;
        this.f8990b = animatorUpdateListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8989a) {
            case 0:
                d dVar = this.f8991c;
                K k3 = dVar.f8998f;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f8990b;
                if (k3 != null) {
                    super/*android.animation.ValueAnimator*/.addUpdateListener(animatorUpdateListener);
                }
                dVar.f9000h.add(animatorUpdateListener);
                break;
            default:
                d dVar2 = this.f8991c;
                K k4 = dVar2.f8998f;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = this.f8990b;
                if (!Intrinsics.areEqual(animatorUpdateListener2, k4)) {
                    super/*android.animation.ValueAnimator*/.removeUpdateListener(animatorUpdateListener2);
                }
                CopyOnWriteArraySet copyOnWriteArraySet = dVar2.f9000h;
                if (copyOnWriteArraySet.contains(animatorUpdateListener2)) {
                    copyOnWriteArraySet.remove(animatorUpdateListener2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ValueAnimator.AnimatorUpdateListener animatorUpdateListener, d dVar) {
        super(0);
        this.f8990b = animatorUpdateListener;
        this.f8991c = dVar;
    }
}
