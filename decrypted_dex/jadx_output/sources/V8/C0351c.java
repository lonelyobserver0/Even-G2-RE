package V8;

import com.mapbox.navigator.RoadObjectMatcher;
import com.mapbox.navigator.RoadObjectsStore;
import com.stub.StubApp;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: V8.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0351c implements Z8.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7821b;

    public /* synthetic */ C0351c(Object obj, int i3) {
        this.f7820a = i3;
        this.f7821b = obj;
    }

    @Override // Z8.g
    public final void a() {
        switch (this.f7820a) {
            case 0:
                q this$0 = (q) this.f7821b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean isEmpty = this$0.f7883o.isEmpty();
                Z8.f fVar = this$0.f7872c;
                if (!isEmpty) {
                    fVar.a().setFallbackVersionsObserver(this$0.f7894z);
                }
                if (this$0.f7886r == E.f7802a) {
                    String string2 = StubApp.getString2(6665);
                    i iVar = this$0.f7869B;
                    Intrinsics.checkNotNullParameter(iVar, string2);
                    fVar.f9062o.add(iVar);
                    fVar.a().addObserver(iVar);
                    break;
                }
                break;
            case 1:
                B3.s this$02 = (B3.s) this.f7821b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (!((CopyOnWriteArraySet) this$02.f652d).isEmpty()) {
                    Z8.f fVar2 = (Z8.f) this$02.f651c;
                    fVar2.a().setElectronicHorizonObserver((A0.c) this$02.f653e);
                    String string22 = StubApp.getString2(6664);
                    Z9.q qVar = (Z9.q) this$02.f654f;
                    Intrinsics.checkNotNullParameter(qVar, string22);
                    RoadObjectsStore roadObjectsStore = fVar2.f9055g;
                    if (roadObjectsStore == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roadObjectsStore");
                        roadObjectsStore = null;
                    }
                    roadObjectsStore.addObserver(qVar);
                    break;
                }
                break;
            default:
                String string23 = StubApp.getString2(392);
                Q2.g gVar = (Q2.g) this.f7821b;
                Intrinsics.checkNotNullParameter(gVar, string23);
                if (!((CopyOnWriteArraySet) gVar.f5712c).isEmpty()) {
                    RoadObjectMatcher roadObjectMatcher = ((Z8.f) gVar.f5711b).f9054f;
                    if (roadObjectMatcher == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("roadObjectMatcher");
                        roadObjectMatcher = null;
                    }
                    roadObjectMatcher.setListener((s2.d) gVar.f5713d);
                    break;
                }
                break;
        }
    }
}
