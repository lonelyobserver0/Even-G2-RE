package M8;

import Qb.J;
import Qb.L;
import Qb.L0;
import Qb.W;
import Vb.f;
import Vb.q;
import Xb.d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4681a;

    public a() {
        N8.a replayEvents = new N8.a(new ArrayList());
        Intrinsics.checkNotNullParameter(replayEvents, "replayEvents");
        L0 job = L.b();
        d dVar = W.f5838a;
        f scope = J.a(CoroutineContext.Element.DefaultImpls.plus(job, q.f7968a));
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f4681a = new LinkedHashSet();
    }
}
