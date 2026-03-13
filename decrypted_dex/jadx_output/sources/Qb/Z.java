package Qb;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Z extends AbstractC0229x0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5842e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5843f;

    public /* synthetic */ Z(Object obj, int i3) {
        this.f5842e = i3;
        this.f5843f = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f5842e) {
            case 0:
                j((Throwable) obj);
                break;
            case 1:
                j((Throwable) obj);
                break;
            case 2:
                j((Throwable) obj);
                break;
            default:
                j((Throwable) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // Qb.AbstractC0229x0
    public final void j(Throwable th) {
        Object obj = this.f5843f;
        switch (this.f5842e) {
            case 0:
                ((Y) obj).dispose();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            case 2:
                Object E10 = i().E();
                y0 y0Var = (y0) obj;
                if (!(E10 instanceof C0220t)) {
                    Result.Companion companion = Result.INSTANCE;
                    y0Var.resumeWith(Result.m40constructorimpl(L.m(E10)));
                    break;
                } else {
                    Result.Companion companion2 = Result.INSTANCE;
                    y0Var.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(((C0220t) E10).f5894a)));
                    break;
                }
            default:
                Result.Companion companion3 = Result.INSTANCE;
                ((C0203k) obj).resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
                break;
        }
    }
}
