package Qb;

import com.stub.StubApp;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Qb.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0197h extends AbstractC0199i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5870a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5871b;

    public /* synthetic */ C0197h(Object obj, int i3) {
        this.f5870a = i3;
        this.f5871b = obj;
    }

    @Override // Qb.AbstractC0199i
    public final void b(Throwable th) {
        switch (this.f5870a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f5871b).cancel(false);
                    break;
                }
                break;
            case 1:
                ((Y) this.f5871b).dispose();
                break;
            default:
                ((Function1) this.f5871b).invoke(th);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f5870a) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.INSTANCE;
    }

    public final String toString() {
        switch (this.f5870a) {
            case 0:
                return StubApp.getString2(25507) + ((ScheduledFuture) this.f5871b) + ']';
            case 1:
                return StubApp.getString2(25506) + ((Y) this.f5871b) + ']';
            default:
                return StubApp.getString2(25505) + ((Function1) this.f5871b).getClass().getSimpleName() + '@' + L.h(this) + ']';
        }
    }
}
