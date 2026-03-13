package Y6;

import N.K;
import R8.C0250h;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.threading.AnimationThreadController;
import com.stub.StubApp;
import e7.InterfaceC0850a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8753b;

    public /* synthetic */ f(Object obj, int i3) {
        this.f8752a = i3;
        this.f8753b = obj;
    }

    public static final void a(f fVar, Animator animator, int i3) {
        MapboxMap mapboxMap = null;
        Z6.d dVar = animator instanceof Z6.d ? (Z6.d) animator : null;
        if (dVar == null) {
            throw new MapboxCameraAnimationException(StubApp.getString2(7543));
        }
        j jVar = (j) fVar.f8753b;
        jVar.getClass();
        if (dVar.f9002l) {
            jVar.n(new ValueAnimator[]{dVar}, false);
        }
        if (dVar.f9003m) {
            return;
        }
        LinkedHashSet linkedHashSet = jVar.f8765b;
        linkedHashSet.remove(animator);
        if (linkedHashSet.isEmpty()) {
            MapboxMap mapboxMap2 = jVar.f8783x;
            if (mapboxMap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mapTransformDelegate");
            } else {
                mapboxMap = mapboxMap2;
            }
            mapboxMap.setUserAnimationInProgress(false);
        }
        Iterator it = jVar.f8772k.iterator();
        while (it.hasNext()) {
            t7.a aVar = (t7.a) it.next();
            int c10 = AbstractC1856e.c(i3);
            String string2 = StubApp.getString2(7542);
            String string22 = StubApp.getString2(660);
            if (c10 == 0) {
                n l9 = dVar.l();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(l9, string22);
                Intrinsics.checkNotNullParameter(dVar, string2);
            } else if (c10 == 1) {
                n l10 = dVar.l();
                aVar.getClass();
                Intrinsics.checkNotNullParameter(l10, string22);
                Intrinsics.checkNotNullParameter(dVar, string2);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f8752a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimationThreadController.INSTANCE.postOnMainThread(new e(this, animation, 0));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f8752a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                AnimationThreadController.INSTANCE.postOnMainThread(new e(this, animation, 1));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animator");
                InterfaceC0850a interfaceC0850a = ((e7.e) this.f8753b).f13658c;
                if (interfaceC0850a == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("compassView");
                    interfaceC0850a = null;
                }
                ((e7.c) interfaceC0850a).setCompassVisible(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                C0250h c0250h = (C0250h) this.f8753b;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) c0250h.f6300e;
                ((j) ((a) c0250h.f6296a)).n((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), false);
                Iterator it = ((CopyOnWriteArrayList) c0250h.f6301f).iterator();
                while (it.hasNext()) {
                    ((k9.d) it.next()).a(c0250h);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f8752a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        String string2 = StubApp.getString2(7544);
        switch (this.f8752a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, string2);
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                if (animationThreadController.getUsingBackgroundThread() && animator.getDuration() == 0) {
                    Z6.d dVar = (Z6.d) animator;
                    KProperty[] kPropertyArr = j.f8762B;
                    j jVar = (j) this.f8753b;
                    jVar.getClass();
                    dVar.j(new K(new g(jVar, dVar), 1));
                }
                animationThreadController.postOnMainThread(new e(this, animator, 2));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animator, "animator");
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, string2);
                break;
        }
    }
}
