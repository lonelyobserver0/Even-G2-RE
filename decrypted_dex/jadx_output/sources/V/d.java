package V;

import Kc.y;
import com.stub.StubApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7641b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.f7640a = i3;
        this.f7641b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7640a) {
            case 0:
                e eVar = this.f7641b;
                y yVar = (y) eVar.f7646c.invoke();
                if (Lc.c.a(yVar) != -1) {
                    return C2.i.v(yVar.f3859a.s(), true);
                }
                throw new IllegalStateException((StubApp.getString2(6460) + eVar.f7646c + StubApp.getString2(6461) + yVar).toString());
            default:
                u5.d dVar = e.f7643f;
                e eVar2 = this.f7641b;
                synchronized (dVar) {
                    e.f7642e.remove(((y) eVar2.f7647d.getValue()).f3859a.s());
                }
                return Unit.INSTANCE;
        }
    }
}
