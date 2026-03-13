package i7;

import X6.t;
import android.graphics.PointF;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.stub.StubApp;
import j7.C1094b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public B6.d f14861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f14862b;

    public e(o oVar) {
        this.f14862b = oVar;
    }

    public final void a(B6.d detector, float f10, float f11) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (!(f10 == 0.0f && f11 == 0.0f) && detector.f699l.size() <= 2) {
            o oVar = this.f14862b;
            if (oVar.f14919r0.f15373s || detector.f699l.size() <= 1) {
                B6.a aVar = oVar.f14902f;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gesturesManager");
                    aVar = null;
                }
                if (((B6.k) aVar.f672f).f709q) {
                    return;
                }
                PointF pointF = detector.f701n;
                double d8 = pointF.x;
                double d10 = pointF.y;
                boolean isInfinite = Double.isInfinite(d8);
                String string2 = StubApp.getString2(18582);
                String string22 = StubApp.getString2(18583);
                if (isInfinite || Double.isNaN(d8) || Double.isInfinite(d10) || Double.isNaN(d10)) {
                    MapboxLogger.logE(string22, StubApp.getString2(18586) + detector.f701n + string2);
                    return;
                }
                if (Float.isInfinite(f10) || Float.isNaN(f10) || Float.isInfinite(f11) || Float.isNaN(f11)) {
                    MapboxLogger.logE(string22, StubApp.getString2(18584) + f10 + StubApp.getString2(18585) + f11 + string2);
                    return;
                }
                if (oVar.N(new ScreenCoordinate(d8, d10))) {
                    return;
                }
                C1094b c1094b = oVar.f14919r0;
                Intrinsics.checkNotNullParameter(c1094b, "<this>");
                double d11 = c1094b.f15363f == t.f8476b ? 0.0d : f10;
                C1094b c1094b2 = oVar.f14919r0;
                Intrinsics.checkNotNullParameter(c1094b2, "<this>");
                oVar.L().dispatch(new PlatformEventInfo(PlatformEventType.DRAG, new ScreenCoordinate(d8 - d11, d10 - (c1094b2.f15363f != t.f8475a ? f11 : 0.0d))));
            }
        }
    }
}
