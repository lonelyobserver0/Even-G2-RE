package Ac;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class r extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final IOException f385a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f385a = firstConnectException;
        this.f386b = firstConnectException;
    }
}
