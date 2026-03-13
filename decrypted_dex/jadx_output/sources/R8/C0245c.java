package R8;

import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: R8.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0245c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0245c(int i3, Object obj, boolean z2) {
        super(0);
        this.f6279a = i3;
        this.f6280b = z2;
        this.f6281c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6279a) {
            case 0:
                if (this.f6280b) {
                    ((Z9.C) ((A3.s) this.f6281c).f191c).n(StubApp.getString2(5766), null);
                }
                break;
            default:
                boolean z2 = this.f6280b;
                Z6.d dVar = (Z6.d) this.f6281c;
                if (z2) {
                    dVar.cancel();
                }
                dVar.m();
                dVar.n();
                break;
        }
        return Unit.INSTANCE;
    }
}
