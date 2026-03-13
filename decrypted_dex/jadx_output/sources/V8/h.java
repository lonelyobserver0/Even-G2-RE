package V8;

import Qb.L;
import com.mapbox.navigator.FallbackVersionsObserver;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements FallbackVersionsObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7830b;

    public /* synthetic */ h(Object obj, int i3) {
        this.f7829a = i3;
        this.f7830b = obj;
    }

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public final void onCanReturnToLatest(String version) {
        switch (this.f7829a) {
            case 0:
                Intrinsics.checkNotNullParameter(version, "version");
                q qVar = (q) this.f7830b;
                L.j(qVar.f7877h.f1513b, null, new C0354f(qVar, version, null), 3);
                return;
            default:
                Intrinsics.checkNotNullParameter(version, "version");
                D9.l.f(StubApp.getString2(6667) + version, StubApp.getString2(6668));
                m8.r rVar = (m8.r) this.f7830b;
                L7.l lVar = rVar.f17221a.f4279c;
                m8.r.a(rVar, false, "");
                Iterator it = rVar.f17209C.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    L7.l lVar2 = rVar.f17221a.f4279c;
                    throw null;
                }
                return;
        }
    }

    @Override // com.mapbox.navigator.FallbackVersionsObserver
    public final void onFallbackVersionsFound(List versions) {
        switch (this.f7829a) {
            case 0:
                Intrinsics.checkNotNullParameter(versions, "versions");
                q qVar = (q) this.f7830b;
                L.j(qVar.f7877h.f1513b, null, new g(qVar, versions, null), 3);
                return;
            default:
                Intrinsics.checkNotNullParameter(versions, "versions");
                D9.l.f(StubApp.getString2(6669) + versions, StubApp.getString2(6668));
                if (versions.isEmpty()) {
                    return;
                }
                String str = (String) CollectionsKt.last(versions);
                m8.r rVar = (m8.r) this.f7830b;
                m8.r.a(rVar, true, str);
                Iterator it = rVar.f17209C.iterator();
                if (it.hasNext()) {
                    throw com.mapbox.common.b.e(it);
                }
                return;
        }
    }
}
