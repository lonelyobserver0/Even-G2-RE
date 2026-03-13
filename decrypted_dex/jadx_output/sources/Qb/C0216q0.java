package Qb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;

/* renamed from: Qb.q0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0216q0 extends AbstractC0225v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5885f = AtomicIntegerFieldUpdater.newUpdater(C0216q0.class, StubApp.getString2(25527));

    @Volatile
    private volatile int _invoked;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f5886e;

    public C0216q0(Function1 function1) {
        this.f5886e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return Unit.INSTANCE;
    }

    @Override // Qb.AbstractC0229x0
    public final void j(Throwable th) {
        if (f5885f.compareAndSet(this, 0, 1)) {
            this.f5886e.invoke(th);
        }
    }
}
