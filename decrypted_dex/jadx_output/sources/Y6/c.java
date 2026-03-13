package Y6;

import N.K;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.mapbox.maps.MapboxLogger;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z6.d f8746b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Z6.d dVar, int i3) {
        super(0);
        this.f8745a = i3;
        this.f8746b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8745a) {
            case 0:
                this.f8746b.cancel();
                break;
            case 1:
                this.f8746b.cancel();
                break;
            case 2:
                Z6.d dVar = this.f8746b;
                dVar.f9001k = true;
                super/*android.animation.ValueAnimator*/.cancel();
                break;
            case 3:
                Z6.d dVar2 = this.f8746b;
                super/*android.animation.Animator*/.removeAllListeners();
                f fVar = dVar2.f8999g;
                if (fVar != null) {
                    super/*android.animation.Animator*/.addListener(fVar);
                }
                dVar2.j.clear();
                break;
            case 4:
                Z6.d dVar3 = this.f8746b;
                super/*android.animation.ValueAnimator*/.removeAllUpdateListeners();
                K k3 = dVar3.f8998f;
                if (k3 != null) {
                    super/*android.animation.ValueAnimator*/.addUpdateListener(k3);
                }
                dVar3.f9000h.clear();
                break;
            default:
                Z6.d dVar4 = this.f8746b;
                if (dVar4.f8997e) {
                    dVar4.f9001k = false;
                    if (dVar4.getDuration() == 0 && dVar4.getStartDelay() == 0) {
                        ArrayList<Animator.AnimatorListener> listeners = dVar4.getListeners();
                        Intrinsics.checkNotNullExpressionValue(listeners, "listeners");
                        List list = CollectionsKt.toList(listeners);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Animator.AnimatorListener) it.next()).onAnimationStart(dVar4);
                        }
                        K k4 = dVar4.f8998f;
                        if (k4 != null) {
                            k4.onAnimationUpdate(dVar4);
                        }
                        Iterator it2 = dVar4.f9000h.iterator();
                        while (it2.hasNext()) {
                            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) it2.next();
                            if (animatorUpdateListener != null) {
                                animatorUpdateListener.onAnimationUpdate(dVar4);
                            }
                        }
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            ((Animator.AnimatorListener) it3.next()).onAnimationEnd(dVar4);
                        }
                    } else {
                        super/*android.animation.ValueAnimator*/.start();
                    }
                } else {
                    MapboxLogger.logW(StubApp.getString2(7538), StubApp.getString2(7536) + dVar4.l() + StubApp.getString2(7537));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
