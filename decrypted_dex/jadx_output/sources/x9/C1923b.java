package x9;

import Qb.L;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: x9.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1923b extends Ec.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22970d;

    /* renamed from: e, reason: collision with root package name */
    public final Lambda f22971e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1923b(int i3, Function1 anyThreadExpressionGenerator) {
        this.f22970d = i3;
        switch (i3) {
            case 1:
                Intrinsics.checkNotNullParameter(anyThreadExpressionGenerator, "anyThreadExpressionGenerator");
                this.f22971e = (Lambda) anyThreadExpressionGenerator;
                break;
            default:
                Intrinsics.checkNotNullParameter(anyThreadExpressionGenerator, "workerThreadExpressionGenerator");
                this.f22971e = (Lambda) anyThreadExpressionGenerator;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // Ec.d
    public final Object y(CoroutineContext coroutineContext, Object obj, ContinuationImpl continuationImpl) {
        switch (this.f22970d) {
            case 0:
                return L.n(coroutineContext, new C1922a(this, (RouteLineViewOptionsData) obj, null), continuationImpl);
            default:
                return this.f22971e.invoke((RouteLineViewOptionsData) obj);
        }
    }
}
