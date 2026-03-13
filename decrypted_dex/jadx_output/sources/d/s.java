package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13097a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13098b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13099c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13100d;

    public s(Executor executor, k reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f13097a = executor;
        this.f13098b = new Object();
        this.f13100d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f13098b) {
            try {
                this.f13099c = true;
                Iterator it = this.f13100d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f13100d.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
