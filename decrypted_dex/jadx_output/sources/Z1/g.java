package Z1;

import Ec.l;
import com.stub.StubApp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8959a;

    /* renamed from: b, reason: collision with root package name */
    public final h f8960b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8961c;

    public g(Object value, h verificationMode, a logger) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("f", StubApp.getString2(3514));
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f8959a = value;
        this.f8960b = verificationMode;
        this.f8961c = logger;
    }

    @Override // Ec.l
    public final Object d() {
        return this.f8959a;
    }

    @Override // Ec.l
    public final l t(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Object obj = this.f8959a;
        if (((Boolean) condition.invoke(obj)).booleanValue()) {
            return this;
        }
        return new f(obj, message, this.f8961c, this.f8960b);
    }
}
