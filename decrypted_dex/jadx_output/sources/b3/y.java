package b3;

import V8.C0350b;
import com.mapbox.common.location.Location;
import com.mapbox.maps.MapView;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import o8.C1464a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y implements H8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0498N f10659a;

    public y(C0498N c0498n) {
        this.f10659a = c0498n;
    }

    @Override // H8.d
    public final void a(m8.r mapboxNavigation) {
        Intrinsics.checkNotNullParameter(mapboxNavigation, "mapboxNavigation");
        C0498N c0498n = this.f10659a;
        Y2.a aVar = c0498n.f10598w;
        Y2.a aVar2 = Y2.a.f8731b;
        String string2 = StubApp.getString2(103);
        if (aVar == aVar2) {
            R2.c.b(string2, StubApp.getString2(9233));
            return;
        }
        R2.c.b(string2, StubApp.getString2(9232));
        mapboxNavigation.getClass();
        x locationObserver = c0498n.f10539C0;
        Intrinsics.checkNotNullParameter(locationObserver, "locationObserver");
        V8.q qVar = mapboxNavigation.f17229i;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(locationObserver, "locationObserver");
        qVar.f7878i.remove(locationObserver);
        C0515q routesObserver = c0498n.f10537B0;
        Intrinsics.checkNotNullParameter(routesObserver, "routesObserver");
        q8.d dVar = mapboxNavigation.f17228h;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(routesObserver, "routesObserver");
        dVar.f20090b.remove(routesObserver);
        C0496L routeProgressObserver = c0498n.f10541D0;
        Intrinsics.checkNotNullParameter(routeProgressObserver, "routeProgressObserver");
        qVar.getClass();
        Intrinsics.checkNotNullParameter(routeProgressObserver, "routeProgressObserver");
        qVar.j.remove(routeProgressObserver);
        C0497M voiceInstructionsObserver = c0498n.f10535A0;
        Intrinsics.checkNotNullParameter(voiceInstructionsObserver, "voiceInstructionsObserver");
        qVar.getClass();
        Intrinsics.checkNotNullParameter(voiceInstructionsObserver, "voiceInstructionsObserver");
        qVar.f7882n.remove(voiceInstructionsObserver);
        C0517s arrivalObserver = c0498n.f10545F0;
        Intrinsics.checkNotNullParameter(arrivalObserver, "arrivalObserver");
        C1464a c1464a = mapboxNavigation.f17238s;
        c1464a.getClass();
        Intrinsics.checkNotNullParameter(arrivalObserver, "arrivalObserver");
        c1464a.f18386b.remove(arrivalObserver);
    }

    @Override // H8.d
    public final void b(m8.r mapboxNavigation) {
        String string2 = StubApp.getString2(9234);
        String string22 = StubApp.getString2(9235);
        String string23 = StubApp.getString2(9236);
        String string24 = StubApp.getString2(9237);
        Intrinsics.checkNotNullParameter(mapboxNavigation, "mapboxNavigation");
        C0498N c0498n = this.f10659a;
        c0498n.getClass();
        C0517s c0517s = c0498n.f10545F0;
        C0497M c0497m = c0498n.f10535A0;
        C0496L c0496l = c0498n.f10541D0;
        x xVar = c0498n.f10539C0;
        C0515q routesObserver = c0498n.f10537B0;
        String string25 = StubApp.getString2(9238);
        String string26 = StubApp.getString2(103);
        R2.c.b(string26, string25);
        try {
            mapboxNavigation.getClass();
            V8.q qVar = mapboxNavigation.f17229i;
            Intrinsics.checkNotNullParameter(routesObserver, "routesObserver");
            q8.d dVar = mapboxNavigation.f17228h;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(routesObserver, "routesObserver");
            dVar.f20090b.remove(routesObserver);
            Intrinsics.checkNotNullParameter(xVar, string24);
            qVar.getClass();
            Intrinsics.checkNotNullParameter(xVar, string24);
            qVar.f7878i.remove(xVar);
            Intrinsics.checkNotNullParameter(c0496l, string23);
            qVar.getClass();
            Intrinsics.checkNotNullParameter(c0496l, string23);
            qVar.j.remove(c0496l);
            Intrinsics.checkNotNullParameter(c0497m, string22);
            qVar.getClass();
            Intrinsics.checkNotNullParameter(c0497m, string22);
            qVar.f7882n.remove(c0497m);
            Intrinsics.checkNotNullParameter(c0517s, string2);
            C1464a c1464a = mapboxNavigation.f17238s;
            c1464a.getClass();
            Intrinsics.checkNotNullParameter(c0517s, string2);
            c1464a.f18386b.remove(c0517s);
            R2.c.b(string26, StubApp.getString2("9239"));
        } catch (Exception e10) {
            R2.c.b(string26, StubApp.getString2(9240) + e10.getMessage());
        }
        mapboxNavigation.j(routesObserver);
        Intrinsics.checkNotNullParameter(xVar, string24);
        V8.q qVar2 = mapboxNavigation.f17229i;
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(xVar, string24);
        qVar2.f7878i.add(xVar);
        Location location = qVar2.f7889u;
        if (location != null) {
            xVar.b(location);
        }
        C0350b c0350b = qVar2.f7892x;
        if (c0350b != null) {
            xVar.a(c0350b);
        }
        Intrinsics.checkNotNullParameter(c0496l, string23);
        qVar2.c(c0496l);
        Intrinsics.checkNotNullParameter(c0497m, string22);
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(c0497m, string22);
        qVar2.f7882n.add(c0497m);
        Intrinsics.checkNotNullParameter(c0517s, string2);
        C1464a c1464a2 = mapboxNavigation.f17238s;
        c1464a2.getClass();
        Intrinsics.checkNotNullParameter(c0517s, string2);
        c1464a2.f18386b.add(c0517s);
        R2.c.b(string26, StubApp.getString2(9241));
        MapView mapView = c0498n.f10572e;
        if (mapView != null) {
            if (mapView.getMapboxMapDeprecated().getStyleDeprecated() == null) {
                R2.c.b(string26, StubApp.getString2(9243));
                return;
            }
            R2.c.b(string26, StubApp.getString2(9242));
            if (c0498n.f10564T) {
                return;
            }
            c0498n.n();
        }
    }
}
