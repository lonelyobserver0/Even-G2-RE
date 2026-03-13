package R8;

import Qb.C0208m0;
import Qb.L;
import Qb.W;
import com.mapbox.common.HttpServiceInterface;
import com.mapbox.navigation.copilot.work.HistoryUploadWorker;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6339a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(HttpServiceInterface httpServiceInterface, long j, HistoryUploadWorker historyUploadWorker) {
        super(1);
        this.f6341c = httpServiceInterface;
        this.f6340b = j;
        this.f6342d = historyUploadWorker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = this.f6340b;
        Object obj2 = this.f6341c;
        Object obj3 = this.f6342d;
        switch (this.f6339a) {
            case 0:
                D9.l.f(StubApp.getString2(5797) + ((com.mapbox.navigation.base.route.g) obj2).f12506i + StubApp.getString2(5798), StubApp.getString2(277));
                y yVar = (y) obj3;
                yVar.getClass();
                C0208m0 c0208m0 = C0208m0.f5881a;
                Xb.d dVar = W.f5838a;
                L.j(c0208m0, Vb.q.f7968a.f6359c, new w(yVar, j, null), 2);
                break;
            default:
                HttpServiceInterface httpServiceInterface = (HttpServiceInterface) obj2;
                httpServiceInterface.cancelUpload(j, new Y.m(23, (HistoryUploadWorker) obj3, (Throwable) obj));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.mapbox.navigation.base.route.g gVar, y yVar, long j) {
        super(1);
        this.f6341c = gVar;
        this.f6342d = yVar;
        this.f6340b = j;
    }
}
