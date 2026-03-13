package r9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y9.n f20451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20452c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(y9.n nVar, int i3, int i10) {
        super(1);
        this.f20450a = i10;
        this.f20451b = nVar;
        this.f20452c = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20450a) {
            case 0:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                stop.e(this.f20451b.f23549a);
                stop.c(this.f20452c);
                break;
            case 1:
                N6.a stop2 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop2, "$this$stop");
                stop2.e(this.f20451b.f23549a);
                stop2.c(this.f20452c);
                break;
            default:
                N6.a stop3 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop3, "$this$stop");
                stop3.e(this.f20451b.f23549a);
                stop3.c(this.f20452c);
                break;
        }
        return Unit.INSTANCE;
    }
}
