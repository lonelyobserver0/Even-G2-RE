package Y6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8748b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(s sVar, int i3) {
        super(0);
        this.f8747a = i3;
        this.f8748b = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8747a) {
            case 0:
                s sVar = this.f8748b;
                sVar.f8825b.cancel();
                sVar.f8825b.removeAllListeners();
                break;
            case 1:
                this.f8748b.f8825b.start();
                break;
            default:
                this.f8748b.f8825b.cancel();
                break;
        }
        return Unit.INSTANCE;
    }
}
