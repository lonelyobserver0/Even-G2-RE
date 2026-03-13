package R8;

import Qb.C0203k;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0203k f6348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(C0203k c0203k, int i3) {
        super(1);
        this.f6347a = i3;
        this.f6348b = c0203k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0203k c0203k = this.f6348b;
        switch (this.f6347a) {
            case 0:
                H it = (H) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                c0203k.resumeWith(Result.m40constructorimpl(it));
                return Unit.INSTANCE;
            default:
                Result.Companion companion = Result.INSTANCE;
                Unit unit = Unit.INSTANCE;
                c0203k.resumeWith(Result.m40constructorimpl(unit));
                return unit;
        }
    }
}
