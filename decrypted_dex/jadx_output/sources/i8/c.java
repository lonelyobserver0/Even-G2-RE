package i8;

import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.stub.StubApp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f14934b = new c(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f14935c = new c(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14936a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i10) {
        super(i3);
        this.f14936a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string2 = StubApp.getString2(345);
        switch (this.f14936a) {
            case 0:
                C1063a c1063a = (C1063a) obj;
                Intrinsics.checkNotNullParameter(c1063a, string2);
                d dVar = d.f14937a;
                return d.d(c1063a.f14928a);
            default:
                DirectionsRoute directionsRoute = (DirectionsRoute) obj;
                Intrinsics.checkNotNullParameter(directionsRoute, string2);
                d dVar2 = d.f14937a;
                return d.d(directionsRoute);
        }
    }
}
