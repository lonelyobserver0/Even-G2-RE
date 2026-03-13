package X2;

import io.flutter.plugin.common.BinaryMessenger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: X2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0359a {

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f8256c = LazyKt.lazy(new J2.b(2));

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f8257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8258b;

    public C0359a(BinaryMessenger binaryMessenger, String messageChannelSuffix) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
        this.f8257a = binaryMessenger;
        this.f8258b = messageChannelSuffix;
    }
}
