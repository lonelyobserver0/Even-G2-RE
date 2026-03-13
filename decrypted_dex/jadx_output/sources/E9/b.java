package E9;

import Qb.J;
import Qb.L;
import Qb.L0;
import Qb.W;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f2052b = new b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f2053c = new b(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f2054d = new b(0, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2055a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i10) {
        super(i3);
        this.f2055a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2055a) {
            case 0:
                L0 b2 = L.b();
                Xb.d dVar = W.f5838a;
                return new D9.f(b2, J.a(CoroutineContext.Element.DefaultImpls.plus(b2, Vb.q.f7968a)));
            case 1:
                L0 b10 = L.b();
                return new D9.f(b10, J.a(CoroutineContext.Element.DefaultImpls.plus(b10, W.f5838a)));
            default:
                L0 b11 = L.b();
                return new D9.f(b11, J.a(CoroutineContext.Element.DefaultImpls.plus(b11, D9.h.f1515c)));
        }
    }
}
