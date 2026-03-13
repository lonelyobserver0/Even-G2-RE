package i8;

import F7.k;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.stub.StubApp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r9.r;
import y9.n;
import y9.u;

/* renamed from: i8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1064b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14932b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1064b(int i3, int i10, Object obj) {
        super(1);
        this.f14931a = i10;
        this.f14933c = obj;
        this.f14932b = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u uVar;
        boolean z2 = false;
        int i3 = 0;
        z2 = false;
        String string2 = StubApp.getString2(345);
        int i10 = 1;
        Object obj2 = this.f14933c;
        int i11 = this.f14932b;
        switch (this.f14931a) {
            case 0:
                C1063a c1063a = (C1063a) obj;
                Intrinsics.checkNotNullParameter(c1063a, string2);
                if (Oc.a.x(c1063a.f14928a, (DirectionsRoute) obj2) && c1063a.f14929b == i11) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 1:
                List getNonServerAddedWaypointsOnRoute = (List) obj;
                Intrinsics.checkNotNullParameter(getNonServerAddedWaypointsOnRoute, "$this$getNonServerAddedWaypointsOnRoute");
                ((B6.a) obj2).getClass();
                if (i11 < getNonServerAddedWaypointsOnRoute.size()) {
                    int i12 = 0;
                    while (i3 <= i11) {
                        if (W.a.q((k) getNonServerAddedWaypointsOnRoute.get(i12))) {
                            i3++;
                        }
                        i12++;
                    }
                    i10 = i12;
                }
                return Integer.valueOf(i10);
            case 2:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                stop.e(((y9.c) obj2).f23549a);
                stop.c(i11);
                return Unit.INSTANCE;
            default:
                n nVar = (n) obj;
                Intrinsics.checkNotNullParameter(nVar, string2);
                if (nVar.f23550b == i11) {
                    return nVar;
                }
                r rVar = r.f20461a;
                String congestionValue = nVar.f23590c;
                Intrinsics.checkNotNullParameter(congestionValue, "congestionValue");
                y9.d colors = (y9.d) obj2;
                Intrinsics.checkNotNullParameter(colors, "colors");
                switch (congestionValue.hashCode()) {
                    case -1357520532:
                        if (congestionValue.equals(StubApp.getString2(1551))) {
                            uVar = colors.f23562f;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    case -1297282981:
                        if (congestionValue.equals(StubApp.getString2(18601))) {
                            uVar = colors.f23563g;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    case -905723276:
                        if (congestionValue.equals(StubApp.getString2(349))) {
                            uVar = colors.f23560d;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    case -618857213:
                        if (congestionValue.equals(StubApp.getString2(350))) {
                            uVar = colors.f23558b;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    case -284840886:
                        if (congestionValue.equals(StubApp.getString2(351))) {
                            uVar = colors.f23561e;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    case 107348:
                        if (congestionValue.equals(StubApp.getString2(347))) {
                            uVar = colors.f23557a;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    case 99152071:
                        if (congestionValue.equals(StubApp.getString2(348))) {
                            uVar = colors.f23559c;
                            break;
                        }
                        uVar = colors.f23561e;
                        break;
                    default:
                        uVar = colors.f23561e;
                        break;
                }
                u newSegmentColorType = uVar;
                Intrinsics.checkNotNullParameter(newSegmentColorType, "newSegmentColorType");
                return new n(nVar.f23549a, nVar.f23590c, newSegmentColorType, nVar.f23550b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1064b(int i3, y9.d dVar) {
        super(1);
        this.f14931a = 3;
        this.f14932b = i3;
        this.f14933c = dVar;
    }
}
