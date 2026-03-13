package d;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f13104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, int i3) {
        super(0);
        this.f13103a = i3;
        this.f13104b = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13103a) {
            case 0:
                this.f13104b.b();
                break;
            case 1:
                this.f13104b.a();
                break;
            default:
                this.f13104b.b();
                break;
        }
        return Unit.INSTANCE;
    }
}
