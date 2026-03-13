package C9;

import O8.g;
import Qb.L;
import Qb.W;
import Vb.f;
import Vb.q;
import com.mapbox.common.Cancelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, int i3) {
        super(1);
        this.f1153a = i3;
        this.f1155c = obj;
        this.f1154b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = this.f1154b;
        Object obj2 = this.f1155c;
        switch (this.f1153a) {
            case 0:
                Cancelable cancelable = (Cancelable) ((b) obj2).f1150c.remove(Long.valueOf(j));
                if (cancelable != null) {
                    cancelable.cancel();
                }
                break;
            default:
                g gVar = (g) obj2;
                f fVar = gVar.f5244h.f1513b;
                Xb.d dVar = W.f5838a;
                L.j(fVar, q.f7968a.f6359c, new O8.d(gVar, j, null), 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
