package i7;

import X6.t;
import android.view.MotionEvent;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.stub.StubApp;
import f0.C0868a;
import j7.C1094b;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i implements B6.n {

    /* renamed from: a, reason: collision with root package name */
    public final float f14866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14867b;

    public i(o oVar, float f10) {
        this.f14867b = oVar;
        this.f14866a = f10;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        o oVar = this.f14867b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            oVar.f14926z = a4.f.a(motionEvent);
            Y.m mVar = oVar.f14904h;
            if (mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gestureState");
                mVar = null;
            }
            mVar.x(EnumC1061a.f14854a);
            oVar.f14917q0 = true;
        }
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        double abs = Math.abs(motionEvent.getX() - oVar.f14926z.getX());
        double abs2 = Math.abs(motionEvent.getY() - oVar.f14926z.getY());
        double d8 = this.f14866a;
        if (abs > d8 || abs2 > d8) {
            return false;
        }
        C1094b c1094b = oVar.f14919r0;
        if (!c1094b.f15364g) {
            return false;
        }
        ScreenCoordinate screenCoordinate = c1094b.f15366k;
        if (screenCoordinate != null) {
            oVar.f14926z = screenCoordinate;
        }
        oVar.M(true, oVar.f14926z);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        double d8;
        if (motionEvent == null || e22 == null) {
            return false;
        }
        o oVar = this.f14867b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(e22, "e2");
        if (!oVar.f14919r0.f15360c || oVar.N(a4.f.a(e22))) {
            return false;
        }
        Iterator it = oVar.f14921t.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
        if (!oVar.f14919r0.f15369n) {
            return false;
        }
        float f12 = oVar.f14901e;
        double hypot = Math.hypot(f10 / f12, f11 / f12);
        if (hypot < 1000.0d) {
            return false;
        }
        MapboxMap mapboxMap = oVar.f14909m;
        CoreGesturesHandler coreGesturesHandler = null;
        String string2 = StubApp.getString2(689);
        if (mapboxMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            mapboxMap = null;
        }
        double pitch = mapboxMap.getCameraState().getPitch();
        if (pitch < 60.0d) {
            d8 = pitch / 10.0d;
        } else if (60.0d > pitch || pitch > 85.0d) {
            d8 = 0.0d;
        } else {
            double log = Math.log(6.0d);
            d8 = Math.exp((((pitch - 60.0d) * (Math.log(300.0d) - log)) / 25.0d) + log);
        }
        double d10 = (d8 / f12) + 10.0d;
        C1094b c1094b = oVar.f14919r0;
        Intrinsics.checkNotNullParameter(c1094b, "<this>");
        double d11 = c1094b.f15363f == t.f8476b ? 0.0d : f10 / d10;
        C1094b c1094b2 = oVar.f14919r0;
        Intrinsics.checkNotNullParameter(c1094b2, "<this>");
        double d12 = c1094b2.f15363f != t.f8475a ? f11 / d10 : 0.0d;
        Y6.a aVar = oVar.f14914p;
        String string22 = StubApp.getString2(686);
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string22);
            aVar = null;
        }
        ((Y6.j) aVar).b(CollectionsKt.toList(oVar.f14916q));
        long j = (long) (hypot / d10);
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(oVar.f14882A.getX(), oVar.f14882A.getY() * 2.0d);
        Y6.a aVar2 = oVar.f14914p;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string22);
            aVar2 = null;
        }
        MapboxMap mapboxMap2 = oVar.f14909m;
        if (mapboxMap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            mapboxMap2 = null;
        }
        CameraOptions cameraForDrag = mapboxMap2.cameraForDrag(screenCoordinate, new ScreenCoordinate(screenCoordinate.getX() + d11, screenCoordinate.getY() + d12));
        Intrinsics.checkNotNullParameter("Maps-Gestures", StubApp.getString2(9619));
        Long valueOf = Long.valueOf(j);
        C0868a interpolator = oVar.f14912n0;
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Unit unit = Unit.INSTANCE;
        Y6.t tVar = new Y6.t("Maps-Gestures", valueOf, interpolator);
        CoreGesturesHandler coreGesturesHandler2 = oVar.f14913o0;
        if (coreGesturesHandler2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coreGesturesHandler");
        } else {
            coreGesturesHandler = coreGesturesHandler2;
        }
        ((Y6.j) aVar2).e(cameraForDrag, tVar, coreGesturesHandler.getCoreGestureAnimatorHandler());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f14867b.L().dispatch(new PlatformEventInfo(PlatformEventType.LONG_CLICK, a4.f.a(motionEvent)));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f14867b.L().dispatch(new PlatformEventInfo(PlatformEventType.CLICK, a4.f.a(motionEvent)));
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o oVar = this.f14867b;
        Y6.a aVar = oVar.f14914p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraAnimationsPlugin");
            aVar = null;
        }
        ((Y6.j) aVar).b(CollectionsKt.toList(oVar.f14916q));
        return true;
    }
}
