package w0;

import M4.I;
import W4.s;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r0.InterfaceC1546g;
import x5.InterfaceC1913d;
import y9.t;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class b implements InterfaceC1546g, W4.e, Expected.Transformer, L4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21988a;

    public /* synthetic */ b(int i3) {
        this.f21988a = i3;
    }

    @Override // L4.e, y3.e, I3.f
    public Object apply(Object obj) {
        return I.q(Integer.valueOf(((M0.h) obj).f4470a));
    }

    @Override // W4.e
    public Object h(s sVar) {
        InterfaceC1913d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
        return lambda$getComponents$0;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        RouteLineClearValue clearValue = (RouteLineClearValue) obj;
        Intrinsics.checkNotNullParameter(clearValue, "clearValue");
        y9.j jVar = new y9.j(clearValue.getPrimaryRouteSource(), null);
        List<FeatureCollection> alternativeRoutesSources$ui_maps_release = clearValue.getAlternativeRoutesSources$ui_maps_release();
        ArrayList arrayList = new ArrayList(CollectionsKt.f(alternativeRoutesSources$ui_maps_release));
        Iterator<T> it = alternativeRoutesSources$ui_maps_release.iterator();
        while (it.hasNext()) {
            arrayList.add(new y9.j((FeatureCollection) it.next(), null));
        }
        return new t(jVar, arrayList, clearValue.getWaypointsSource(), clearValue.getCallouts(), null);
    }

    @Override // r0.InterfaceC1546g
    /* renamed from: invoke */
    public void mo0invoke(Object obj) {
        h hVar = (h) obj;
        switch (this.f21988a) {
            case 0:
                hVar.getClass();
                break;
            case 1:
                hVar.getClass();
                break;
            case 2:
                hVar.getClass();
                break;
            case 3:
                hVar.getClass();
                break;
            case 4:
                hVar.getClass();
                break;
            case 5:
                hVar.getClass();
                break;
            case 6:
                hVar.getClass();
                break;
            case 7:
                hVar.getClass();
                break;
            case 8:
                hVar.getClass();
                break;
            case 9:
                hVar.getClass();
                break;
            case 10:
                hVar.getClass();
                break;
            case 11:
                hVar.getClass();
                break;
            case 12:
                hVar.getClass();
                break;
            case 13:
                hVar.getClass();
                break;
            case 14:
                hVar.getClass();
                break;
            case 15:
                hVar.getClass();
                break;
            case 16:
                hVar.getClass();
                break;
            case 17:
                hVar.getClass();
                break;
            case 18:
                hVar.getClass();
                break;
            case 19:
                hVar.getClass();
                break;
            case 20:
                hVar.getClass();
                break;
            case 21:
                hVar.getClass();
                break;
            case 22:
                hVar.getClass();
                break;
            case 23:
                hVar.getClass();
                break;
            case 24:
                hVar.getClass();
                break;
            case 25:
                hVar.getClass();
                break;
            default:
                hVar.getClass();
                break;
        }
    }
}
