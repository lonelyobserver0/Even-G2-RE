package J;

import Qb.C0203k;
import android.os.OutcomeReceiver;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C0203k f3253a;

    public c(C0203k c0203k) {
        super(false);
        this.f3253a = c0203k;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            C0203k c0203k = this.f3253a;
            Result.Companion companion = Result.INSTANCE;
            c0203k.resumeWith(Result.m40constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f3253a.resumeWith(Result.m40constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return StubApp.getString2(2886) + get() + ')';
    }
}
