package T;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class S extends e0 {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6809b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Throwable finalException) {
        super(IntCompanionObject.MAX_VALUE);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f6809b = finalException;
    }
}
