package Qb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* renamed from: Qb.t, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class C0220t {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5893b = AtomicIntegerFieldUpdater.newUpdater(C0220t.class, StubApp.getString2(25533));

    @Volatile
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5894a;

    public C0220t(Throwable th, boolean z2) {
        this.f5894a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5894a + ']';
    }
}
