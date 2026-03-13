package l7;

import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f16785a;

    public final void a(Point it) {
        String string2 = StubApp.getString2(392);
        r rVar = this.f16785a;
        Intrinsics.checkNotNullParameter(rVar, string2);
        Intrinsics.checkNotNullParameter(it, "it");
        rVar.getClass();
        Iterator it2 = rVar.f16793g.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).a(it);
        }
    }
}
