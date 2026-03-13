package T;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V extends e0 {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Throwable readException, int i3) {
        super(i3);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f6814b = readException;
    }
}
