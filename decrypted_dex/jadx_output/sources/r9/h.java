package r9;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i10) {
        super(1);
        this.f20431a = i10;
        this.f20432b = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20431a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int i3 = this.f20432b;
                break;
            case 1:
                break;
            case 2:
                N6.a stop = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop, "$this$stop");
                stop.e(0.0d);
                stop.c(this.f20432b);
                break;
            case 3:
                N6.a stop2 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop2, "$this$stop");
                stop2.e(0.0d);
                stop2.c(this.f20432b);
                break;
            default:
                N6.a stop3 = (N6.a) obj;
                Intrinsics.checkNotNullParameter(stop3, "$this$stop");
                stop3.e(0.0d);
                stop3.c(this.f20432b);
                break;
        }
        return Unit.INSTANCE;
    }
}
