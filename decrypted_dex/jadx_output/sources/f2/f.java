package f2;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c2.C0550b;
import c2.C0551c;
import c2.C0558j;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13719a = 0;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.areEqual(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.areEqual(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (a((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public final C0558j c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new C0558j(CollectionsKt.emptyList());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        AbstractC0872a.d(sidecarDeviceState, AbstractC0872a.b(state));
        return new C0558j(d(AbstractC0872a.c(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    public final ArrayList d(List sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            C0551c e10 = e((SidecarDisplayFeature) it.next(), deviceState);
            if (e10 != null) {
                arrayList.add(e10);
            }
        }
        return arrayList;
    }

    public final C0551c e(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        C0550b c0550b;
        C0550b c0550b2;
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(deviceState, "deviceState");
        String tag = StubApp.getString2(4931);
        Intrinsics.checkNotNullExpressionValue(tag, "TAG");
        Z1.a logger = Z1.a.f8944a;
        Intrinsics.checkNotNullParameter(feature, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Z1.h verificationMode = Z1.h.f8962a;
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new Z1.g(feature, verificationMode, logger).t(StubApp.getString2(17414), b.f13715a).t(StubApp.getString2(17415), c.f13716a).t(StubApp.getString2(17416), d.f13717a).t(StubApp.getString2(17417), e.f13718a).d();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            c0550b = C0550b.f10783g;
        } else {
            if (type != 2) {
                return null;
            }
            c0550b = C0550b.f10784h;
        }
        int b2 = AbstractC0872a.b(deviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 != 2) {
            c0550b2 = C0550b.f10781e;
            if (b2 != 3 && b2 == 4) {
                return null;
            }
        } else {
            c0550b2 = C0550b.f10782f;
        }
        Rect rect = feature.getRect();
        Intrinsics.checkNotNullExpressionValue(rect, "feature.rect");
        return new C0551c(new Z1.b(rect), c0550b, c0550b2);
    }
}
