package com.mapbox.maps.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.threading.AnimationThreadController;
import g7.InterfaceC0962a;
import g7.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/mapbox/maps/util/CoreGesturesHandler;", "", "Lg7/h;", "mapTransformDelegate", "Lg7/a;", "mapCameraManagerDelegate", "<init>", "(Lg7/h;Lg7/a;)V", "", "isSetCenterAltitudeModeNeeded", "()Z", "", "notifyCoreGestureStarted", "()V", "notifyCoreTouchEnded", "Lg7/h;", "Lg7/a;", "gestureAnimationStarted", "Z", "gestureStarted", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "cachedCenterAltitudeMode", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "Landroid/animation/AnimatorListenerAdapter;", "coreGestureAnimatorHandler", "Landroid/animation/AnimatorListenerAdapter;", "getCoreGestureAnimatorHandler", "()Landroid/animation/AnimatorListenerAdapter;", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CoreGesturesHandler {
    private MapCenterAltitudeMode cachedCenterAltitudeMode;
    private final AnimatorListenerAdapter coreGestureAnimatorHandler;
    private boolean gestureAnimationStarted;
    private boolean gestureStarted;
    private final InterfaceC0962a mapCameraManagerDelegate;
    private final h mapTransformDelegate;

    public CoreGesturesHandler(h mapTransformDelegate, InterfaceC0962a mapCameraManagerDelegate) {
        Intrinsics.checkNotNullParameter(mapTransformDelegate, "mapTransformDelegate");
        Intrinsics.checkNotNullParameter(mapCameraManagerDelegate, "mapCameraManagerDelegate");
        this.mapTransformDelegate = mapTransformDelegate;
        this.mapCameraManagerDelegate = mapCameraManagerDelegate;
        this.cachedCenterAltitudeMode = mapCameraManagerDelegate.getCenterAltitudeMode();
        this.coreGestureAnimatorHandler = new AnimatorListenerAdapter() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                final CoreGesturesHandler coreGesturesHandler = CoreGesturesHandler.this;
                animationThreadController.postOnMainThread(new Function0<Unit>() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        boolean isSetCenterAltitudeModeNeeded;
                        h hVar;
                        InterfaceC0962a interfaceC0962a;
                        MapCenterAltitudeMode mapCenterAltitudeMode;
                        CoreGesturesHandler.this.gestureAnimationStarted = false;
                        isSetCenterAltitudeModeNeeded = CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded();
                        if (isSetCenterAltitudeModeNeeded) {
                            interfaceC0962a = CoreGesturesHandler.this.mapCameraManagerDelegate;
                            mapCenterAltitudeMode = CoreGesturesHandler.this.cachedCenterAltitudeMode;
                            interfaceC0962a.setCenterAltitudeMode(mapCenterAltitudeMode);
                        }
                        hVar = CoreGesturesHandler.this.mapTransformDelegate;
                        hVar.setGestureInProgress(false);
                    }
                });
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
                final CoreGesturesHandler coreGesturesHandler = CoreGesturesHandler.this;
                animationThreadController.postOnMainThread(new Function0<Unit>() { // from class: com.mapbox.maps.util.CoreGesturesHandler$coreGestureAnimatorHandler$1$onAnimationStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        boolean isSetCenterAltitudeModeNeeded;
                        InterfaceC0962a interfaceC0962a;
                        CoreGesturesHandler.this.gestureAnimationStarted = true;
                        isSetCenterAltitudeModeNeeded = CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded();
                        if (isSetCenterAltitudeModeNeeded) {
                            interfaceC0962a = CoreGesturesHandler.this.mapCameraManagerDelegate;
                            interfaceC0962a.setCenterAltitudeMode(MapCenterAltitudeMode.SEA);
                        }
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSetCenterAltitudeModeNeeded() {
        return this.cachedCenterAltitudeMode != MapCenterAltitudeMode.SEA;
    }

    public final AnimatorListenerAdapter getCoreGestureAnimatorHandler() {
        return this.coreGestureAnimatorHandler;
    }

    public final void notifyCoreGestureStarted() {
        if (this.gestureStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new Function0<Unit>() { // from class: com.mapbox.maps.util.CoreGesturesHandler$notifyCoreGestureStarted$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC0962a interfaceC0962a;
                h hVar;
                boolean isSetCenterAltitudeModeNeeded;
                InterfaceC0962a interfaceC0962a2;
                CoreGesturesHandler coreGesturesHandler = CoreGesturesHandler.this;
                interfaceC0962a = coreGesturesHandler.mapCameraManagerDelegate;
                coreGesturesHandler.cachedCenterAltitudeMode = interfaceC0962a.getCenterAltitudeMode();
                CoreGesturesHandler.this.gestureStarted = true;
                hVar = CoreGesturesHandler.this.mapTransformDelegate;
                hVar.setGestureInProgress(true);
                isSetCenterAltitudeModeNeeded = CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded();
                if (isSetCenterAltitudeModeNeeded) {
                    interfaceC0962a2 = CoreGesturesHandler.this.mapCameraManagerDelegate;
                    interfaceC0962a2.setCenterAltitudeMode(MapCenterAltitudeMode.SEA);
                }
            }
        });
    }

    public final void notifyCoreTouchEnded() {
        if (!this.gestureStarted || this.gestureAnimationStarted) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnMainThread(new Function0<Unit>() { // from class: com.mapbox.maps.util.CoreGesturesHandler$notifyCoreTouchEnded$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean isSetCenterAltitudeModeNeeded;
                h hVar;
                InterfaceC0962a interfaceC0962a;
                MapCenterAltitudeMode mapCenterAltitudeMode;
                isSetCenterAltitudeModeNeeded = CoreGesturesHandler.this.isSetCenterAltitudeModeNeeded();
                if (isSetCenterAltitudeModeNeeded) {
                    interfaceC0962a = CoreGesturesHandler.this.mapCameraManagerDelegate;
                    mapCenterAltitudeMode = CoreGesturesHandler.this.cachedCenterAltitudeMode;
                    interfaceC0962a.setCenterAltitudeMode(mapCenterAltitudeMode);
                }
                hVar = CoreGesturesHandler.this.mapTransformDelegate;
                hVar.setGestureInProgress(false);
                CoreGesturesHandler.this.gestureStarted = false;
            }
        });
    }
}
