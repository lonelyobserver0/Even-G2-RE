package i7;

import B6.q;
import android.animation.Animator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14870b;

    public /* synthetic */ k(o oVar, int i3) {
        this.f14869a = i3;
        this.f14870b = oVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f14869a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14869a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                o oVar = this.f14870b;
                Y6.a aVar = oVar.f14914p;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
                    aVar = null;
                }
                ((Y6.j) aVar).l(oVar.h0);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                o oVar2 = this.f14870b;
                B6.a aVar2 = oVar2.f14902f;
                Y6.a aVar3 = null;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gesturesManager");
                    aVar2 = null;
                }
                Intrinsics.checkNotNullExpressionValue((q) aVar2.f670d, "gesturesManager.standardScaleGestureDetector");
                Iterator it = oVar2.f14924x.iterator();
                if (it.hasNext()) {
                    throw com.mapbox.common.b.e(it);
                }
                Y6.a aVar4 = oVar2.f14914p;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
                } else {
                    aVar3 = aVar4;
                }
                ((Y6.j) aVar3).l(oVar2.f14894P);
                return;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f14869a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f14869a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                return;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                return;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                o oVar = this.f14870b;
                B6.a aVar = oVar.f14902f;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gesturesManager");
                    aVar = null;
                }
                Intrinsics.checkNotNullExpressionValue((q) aVar.f670d, "gesturesManager.standardScaleGestureDetector");
                Iterator it = oVar.f14924x.iterator();
                if (it.hasNext()) {
                    throw com.mapbox.common.b.e(it);
                }
                return;
        }
    }
}
