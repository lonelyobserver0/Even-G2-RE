package a7;

import android.graphics.PointF;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i3) {
        super(1);
        this.f9298a = i3;
        this.f9299b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f fVar = this.f9299b;
        String string2 = StubApp.getString2(345);
        switch (this.f9298a) {
            case 0:
                Intrinsics.checkNotNullParameter((InteractionContext) obj, string2);
                if (fVar.f9304d != null) {
                    B6.d dVar = fVar.f9310k;
                    PointF pointF = dVar.f701n;
                    ScreenCoordinate screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
                    dVar.f699l.size();
                    fVar.k();
                    fVar.f9303c.dispatch(new PlatformEventInfo(PlatformEventType.DRAG_END, screenCoordinate));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter((InteractionContext) obj, string2);
                int i3 = f.f9300t;
                fVar.k();
                break;
        }
        return Unit.INSTANCE;
    }
}
