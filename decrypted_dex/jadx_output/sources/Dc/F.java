package Dc;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class F extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0053b f1548a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(EnumC0053b errorCode) {
        super(Intrinsics.stringPlus("stream was reset: ", errorCode));
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f1548a = errorCode;
    }
}
