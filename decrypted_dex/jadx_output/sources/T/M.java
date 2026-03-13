package T;

import Qb.C0215q;
import Qb.C0220t;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class M extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final M f6783a = new M(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        U msg = (U) obj;
        Throwable th = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        C0215q c0215q = msg.f6811b;
        if (th == null) {
            th = new CancellationException(StubApp.getString2(6084));
        }
        c0215q.L(new C0220t(th, false));
        return Unit.INSTANCE;
    }
}
