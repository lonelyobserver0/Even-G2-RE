package l7;

import Tb.InterfaceC0328i;
import com.mapbox.common.location.Location;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1234d implements InterfaceC0328i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f16745b;

    public /* synthetic */ C1234d(r rVar, int i3) {
        this.f16744a = i3;
        this.f16745b = rVar;
    }

    @Override // Tb.InterfaceC0328i
    public final Object a(Object obj, Continuation continuation) {
        r rVar = this.f16745b;
        switch (this.f16744a) {
            case 0:
                double[] bearing = {((Number) obj).doubleValue()};
                rVar.getClass();
                Intrinsics.checkNotNullParameter(bearing, "bearing");
                v vVar = rVar.f16789c;
                if (vVar != null) {
                    v.d(vVar, Arrays.copyOf(bearing, 1), null, 4);
                }
                break;
            default:
                Double horizontalAccuracy = ((Location) obj).getHorizontalAccuracy();
                if (horizontalAccuracy != null) {
                    double[] radius = {horizontalAccuracy.doubleValue()};
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(radius, "radius");
                    v vVar2 = rVar.f16789c;
                    if (vVar2 != null) {
                        vVar2.f(Arrays.copyOf(radius, 1));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
