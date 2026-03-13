package sb;

import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sb.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1643e {

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f20950b = LazyKt.lazy(new J2.b(8));

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f20951a;

    public C1643e(BinaryMessenger binaryMessenger) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        this.f20951a = binaryMessenger;
    }
}
