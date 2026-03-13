package Qb;

import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qb.u0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0223u0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient D0 f5895a;

    public C0223u0(String str, Throwable th, D0 d02) {
        super(str);
        this.f5895a = d02;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0223u0)) {
            return false;
        }
        C0223u0 c0223u0 = (C0223u0) obj;
        return Intrinsics.areEqual(c0223u0.getMessage(), getMessage()) && Intrinsics.areEqual(c0223u0.f5895a, this.f5895a) && Intrinsics.areEqual(c0223u0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = (this.f5895a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + StubApp.getString2(25534) + this.f5895a;
    }
}
