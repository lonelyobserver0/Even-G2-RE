package A9;

import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.stub.StubApp;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r9.r;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final com.mapbox.navigation.base.route.g f231a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f232b;

    public f(com.mapbox.navigation.base.route.g route, Function1 trafficProvider) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(trafficProvider, "trafficProvider");
        this.f231a = route;
        this.f232b = trafficProvider;
    }

    @Override // A9.a
    public final Object a(Function function) {
        Function2 f10 = (Function2) function;
        Intrinsics.checkNotNullParameter(f10, "f");
        return f10.invoke(this.f231a, this.f232b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x02b5, code lost:
    
        if (r1 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02f2, code lost:
    
        if (r13 == null) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e8 A[LOOP:3: B:108:0x00d7->B:133:0x01e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        com.mapbox.navigation.base.route.g gVar = this.f231a;
        int hashCode = this.f232b.hashCode() + (gVar.f12506i.hashCode() * 31);
        List<RouteLeg> legs = gVar.f12498a.legs();
        if (legs != null) {
            for (RouteLeg routeLeg : legs) {
                int i3 = hashCode * 31;
                LegAnnotation annotation = routeLeg.annotation();
                List<String> congestion = annotation != null ? annotation.congestion() : null;
                int hashCode2 = (i3 + (congestion != null ? congestion.hashCode() : 0)) * 31;
                LegAnnotation annotation2 = routeLeg.annotation();
                List<Integer> congestionNumeric = annotation2 != null ? annotation2.congestionNumeric() : null;
                int hashCode3 = (hashCode2 + (congestionNumeric != null ? congestionNumeric.hashCode() : 0)) * 31;
                List<Closure> closures = routeLeg.closures();
                hashCode = hashCode3 + (closures != null ? closures.hashCode() : 0);
                r rVar = r.f20461a;
                String[] i10 = r.i(routeLeg.steps());
                int length = i10.length;
                for (int i11 = 0; i11 < length; i11++) {
                    String str = i10[i11];
                    hashCode = (hashCode * 31) + (str != null ? str.hashCode() : 0);
                }
            }
        }
        return hashCode;
    }

    public final String toString() {
        return StubApp.getString2(371) + this.f231a + StubApp.getString2(372) + this.f232b + ')';
    }
}
