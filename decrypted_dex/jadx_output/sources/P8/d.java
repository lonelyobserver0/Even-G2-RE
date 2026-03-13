package P8;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f5610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, int i3) {
        super(0);
        this.f5609a = i3;
        this.f5610b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5609a) {
            case 0:
                break;
            case 1:
                this.f5610b.f5628a = false;
                break;
            default:
                this.f5610b.f5628a = true;
                break;
        }
        return Unit.INSTANCE;
    }
}
