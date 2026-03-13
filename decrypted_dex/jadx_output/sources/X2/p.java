package X2;

import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f8315b = LazyKt.lazy(new J2.b(4));

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f8316a;

    public p(BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", StubApp.getString2(7040));
        this.f8316a = binaryMessenger;
    }
}
