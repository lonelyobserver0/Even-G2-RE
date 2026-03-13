package com.mapbox.common.location;

import android.app.Activity;
import com.stub.StubApp;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import q4.InterfaceC1522c;
import q4.e;
import q4.f;
import q4.h;
import q4.j;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00028\u0000\"\n\b\u0001\u0010\u0010*\u0004\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\r\u0010\u0013J\u0013\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001dJ%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001e2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010\"J-\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010#J%\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010$J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001b\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006)"}, d2 = {"Lcom/mapbox/common/location/FailedTask;", "T", "Lq4/j;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "isComplete", "()Z", "isSuccessful", "isCanceled", "getResult", "()Ljava/lang/Object;", "", "X", "Ljava/lang/Class;", "exceptionType", "(Ljava/lang/Class;)Ljava/lang/Object;", "getException", "()Ljava/lang/Exception;", "Lq4/e;", "listener", "addOnFailureListener", "(Lq4/e;)Lq4/j;", "Ljava/util/concurrent/Executor;", "p0", "p1", "(Ljava/util/concurrent/Executor;Lq4/e;)Lq4/j;", "Landroid/app/Activity;", "(Landroid/app/Activity;Lq4/e;)Lq4/j;", "Lq4/f;", "addOnSuccessListener", "(Landroid/app/Activity;Lq4/f;)Lq4/j;", "(Ljava/util/concurrent/Executor;Lq4/f;)Lq4/j;", "(Lq4/f;)Lq4/j;", "Lq4/c;", "addOnCanceledListener", "(Lq4/c;)Lq4/j;", "Ljava/lang/Exception;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FailedTask<T> extends j {
    private final Exception exception;

    public FailedTask(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.exception = exception;
    }

    public j addOnCanceledListener(InterfaceC1522c p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return this;
    }

    @Override // q4.j
    public j addOnFailureListener(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.C(this.exception);
        return this;
    }

    public j addOnSuccessListener(Activity p02, f p1) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return this;
    }

    @Override // q4.j
    public Exception getException() {
        return this.exception;
    }

    @Override // q4.j
    public T getResult() {
        throw new h(this.exception);
    }

    @Override // q4.j
    public boolean isCanceled() {
        return false;
    }

    @Override // q4.j
    public boolean isComplete() {
        return true;
    }

    @Override // q4.j
    public boolean isSuccessful() {
        return false;
    }

    @Override // q4.j
    public j addOnFailureListener(Executor p02, e p1) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        throw new NotImplementedError(StubApp.getString2(13635));
    }

    @Override // q4.j
    public j addOnSuccessListener(Executor p02, f p1) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return this;
    }

    public j addOnFailureListener(Activity p02, e p1) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        throw new NotImplementedError(StubApp.getString2(13635));
    }

    @Override // q4.j
    public j addOnSuccessListener(f p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return this;
    }

    @Override // q4.j
    public <X extends Throwable> T getResult(Class<X> exceptionType) {
        Intrinsics.checkNotNullParameter(exceptionType, "exceptionType");
        if (exceptionType.isInstance(this.exception)) {
            throw this.exception;
        }
        throw new h(this.exception);
    }
}
