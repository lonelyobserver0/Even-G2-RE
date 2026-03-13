package b3;

import D5.C0043g;
import a.AbstractC0378a;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.MapView;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import e9.InterfaceC0853a;
import java.io.File;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* renamed from: b3.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0509k implements InterfaceC0853a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10634b;

    public /* synthetic */ C0509k(C0498N c0498n, int i3) {
        this.f10633a = i3;
        this.f10634b = c0498n;
    }

    @Override // e9.InterfaceC0853a
    public final void accept(Object obj) {
        switch (this.f10633a) {
            case 0:
                Expected value = (Expected) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                C0498N c0498n = this.f10634b;
                MapView mapView = c0498n.f10572e;
                x9.I i3 = null;
                if (mapView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapView");
                    mapView = null;
                }
                Style styleDeprecated = mapView.getMapboxMapDeprecated().getStyleDeprecated();
                if (styleDeprecated != null) {
                    x9.I i10 = c0498n.f10578l;
                    if (i10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("routeLineView");
                    } else {
                        i3 = i10;
                    }
                    i3.j(styleDeprecated, value);
                    break;
                }
                break;
            case 1:
                Expected expected = (Expected) obj;
                Intrinsics.checkNotNullParameter(expected, "expected");
                C0498N c0498n2 = this.f10634b;
                expected.fold(new C0508j(c0498n2, 1), new C0508j(c0498n2, 2));
                break;
            default:
                F9.b speechAnnouncement = (F9.b) obj;
                Intrinsics.checkNotNullParameter(speechAnnouncement, "value");
                C0498N c0498n3 = this.f10634b;
                c0498n3.getClass();
                R2.c.b(StubApp.getString2(103), StubApp.getString2(9186));
                D5.B b2 = c0498n3.f10585p;
                if (b2 != null) {
                    Intrinsics.checkNotNullParameter(speechAnnouncement, "announcement");
                    E0 e02 = (E0) b2.f1343d;
                    e02.getClass();
                    Intrinsics.checkNotNullParameter(speechAnnouncement, "announcement");
                    File file = speechAnnouncement.f2336c;
                    if (file != null) {
                        Z9.C c10 = (Z9.C) e02.f16038c;
                        Intrinsics.checkNotNullParameter(file, "file");
                        Qb.L.j(((D9.f) ((Lazy) c10.f9078c).getValue()).f1513b, null, new E9.d(file, null), 3);
                    }
                    Intrinsics.checkNotNullParameter(speechAnnouncement, "speechAnnouncement");
                    AbstractC0378a.s(speechAnnouncement.f2334a, speechAnnouncement.f2335b).onValue(new C0043g(3, b2, speechAnnouncement));
                    break;
                }
                break;
        }
    }
}
