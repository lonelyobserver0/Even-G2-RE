package kotlin.time.jdk8;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"toJavaInstant", "Ljava/time/Instant;", "Lkotlin/time/Instant;", "toKotlinInstant", "kotlin-stdlib-jdk8"}, k = 2, mv = {2, 2, 0}, pn = "kotlin.time", xi = 48)
@JvmName(name = "InstantConversionsJDK8Kt")
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class InstantConversionsJDK8Kt {
    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    public static final Instant toJavaInstant(kotlin.time.Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Instant ofEpochSecond = Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(...)");
        return ofEpochSecond;
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    public static final kotlin.time.Instant toKotlinInstant(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        return kotlin.time.Instant.INSTANCE.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }
}
