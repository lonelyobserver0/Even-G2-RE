package Y6;

import N.K;
import android.animation.Animator;
import android.animation.TypeEvaluator;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.threading.AnimationThreadController;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import no.nordicsemi.android.ble.v;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f8750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animator f8751c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Animator animator, int i3) {
        super(0);
        this.f8749a = i3;
        this.f8750b = fVar;
        this.f8751c = animator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Serializable center;
        switch (this.f8749a) {
            case 0:
                f.a(this.f8750b, this.f8751c, 1);
                return Unit.INSTANCE;
            case 1:
                f.a(this.f8750b, this.f8751c, 2);
                return Unit.INSTANCE;
            default:
                f fVar = this.f8750b;
                Animator animator = this.f8751c;
                Unit unit = null;
                MapboxMap mapboxMap = null;
                Z6.d newAnimator = animator instanceof Z6.d ? (Z6.d) animator : null;
                if (newAnimator != null) {
                    if (!newAnimator.f9001k) {
                        j jVar = (j) fVar.f8753b;
                        Ac.m getStartCameraState = jVar.f8784y;
                        Intrinsics.checkNotNullParameter(getStartCameraState, "getStartCameraState");
                        if (!newAnimator.f9003m) {
                            if (newAnimator.f8996d.length == 0) {
                                MapboxLogger.logE(StubApp.getString2(374), StubApp.getString2(7539) + newAnimator.l().name() + StubApp.getString2(7540));
                                newAnimator.f9003m = true;
                            } else {
                                int ordinal = newAnimator.l().ordinal();
                                if (ordinal == 0) {
                                    center = ((CameraState) getStartCameraState.invoke()).getCenter();
                                    Intrinsics.checkNotNullExpressionValue(center, "cameraState().center");
                                } else if (ordinal == 1) {
                                    center = Double.valueOf(((CameraState) getStartCameraState.invoke()).getZoom());
                                } else if (ordinal == 2) {
                                    center = Double.valueOf(((CameraState) getStartCameraState.invoke()).getBearing());
                                } else if (ordinal == 3) {
                                    center = Double.valueOf(((CameraState) getStartCameraState.invoke()).getPitch());
                                } else if (ordinal == 4) {
                                    center = Z6.d.f8992n;
                                } else {
                                    if (ordinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    center = ((CameraState) getStartCameraState.invoke()).getPadding();
                                    Intrinsics.checkNotNullExpressionValue(center, "cameraState().padding");
                                }
                                Serializable serializable = newAnimator.f8995c;
                                if (serializable == null) {
                                    serializable = center;
                                }
                                Object[] o5 = newAnimator.o(serializable);
                                TypeEvaluator typeEvaluator = newAnimator.f8993a;
                                if ((typeEvaluator instanceof Z6.i) && ((Z6.i) typeEvaluator).a(center, serializable, o5)) {
                                    newAnimator.f9003m = true;
                                } else {
                                    newAnimator.setObjectValues(Arrays.copyOf(o5, o5.length));
                                }
                            }
                        }
                        if (!newAnimator.f9003m) {
                            CopyOnWriteArraySet copyOnWriteArraySet = jVar.f8772k;
                            Iterator it = copyOnWriteArraySet.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                String string2 = StubApp.getString2(660);
                                if (hasNext) {
                                    t7.a aVar = (t7.a) it.next();
                                    n l9 = newAnimator.l();
                                    String str = newAnimator.f8994b;
                                    aVar.getClass();
                                    Intrinsics.checkNotNullParameter(l9, string2);
                                    Intrinsics.checkNotNullParameter(newAnimator, "animator");
                                    if (!Intrinsics.areEqual(str, "VIEWPORT_CAMERA_OWNER") && Intrinsics.areEqual(str, "Maps-Gestures")) {
                                        t7.b bVar = aVar.f21210a;
                                        bVar.f21216f.getClass();
                                        t7.c cVar = t7.c.f21217a;
                                        if (Intrinsics.areEqual(cVar, bVar.f21215e)) {
                                            continue;
                                        } else {
                                            t7.c cVar2 = bVar.f21215e;
                                            bVar.f21215e = cVar;
                                            Iterator it2 = bVar.f21212b.iterator();
                                            while (it2.hasNext()) {
                                                if (it2.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                bVar.f21211a.post(new v(cVar2, 3));
                                            }
                                        }
                                    }
                                } else {
                                    MapboxMap mapboxMap2 = jVar.f8783x;
                                    if (mapboxMap2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mapTransformDelegate");
                                    } else {
                                        mapboxMap = mapboxMap2;
                                    }
                                    mapboxMap.setUserAnimationInProgress(true);
                                    Iterator it3 = new HashSet(jVar.f8764a).iterator();
                                    while (it3.hasNext()) {
                                        Z6.d runningAnimator = (Z6.d) it3.next();
                                        if (runningAnimator.l() == newAnimator.l() && runningAnimator.isRunning() && !Intrinsics.areEqual(runningAnimator, newAnimator)) {
                                            Iterator it4 = copyOnWriteArraySet.iterator();
                                            while (it4.hasNext()) {
                                                t7.a aVar2 = (t7.a) it4.next();
                                                n l10 = newAnimator.l();
                                                Intrinsics.checkNotNullExpressionValue(runningAnimator, "existingAnimator");
                                                aVar2.getClass();
                                                Intrinsics.checkNotNullParameter(l10, string2);
                                                Intrinsics.checkNotNullParameter(runningAnimator, "runningAnimator");
                                                Intrinsics.checkNotNullParameter(newAnimator, "newAnimator");
                                            }
                                            AnimationThreadController.INSTANCE.postOnAnimatorThread(new c(runningAnimator, 1));
                                        }
                                    }
                                    if (!AnimationThreadController.INSTANCE.getUsingBackgroundThread() || newAnimator.getDuration() != 0) {
                                        newAnimator.j(new K(new g(jVar, newAnimator), 1));
                                    }
                                    unit = Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (unit == null) {
                    throw new MapboxCameraAnimationException(StubApp.getString2(7541));
                }
                return Unit.INSTANCE;
        }
    }
}
