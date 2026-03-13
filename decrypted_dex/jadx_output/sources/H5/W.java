package H5;

import com.stub.StubApp;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f2813a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2815c;

    /* renamed from: d, reason: collision with root package name */
    public int f2816d;

    /* renamed from: e, reason: collision with root package name */
    public O f2817e;

    public W(e0 timeProvider, g0 uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f2813a = timeProvider;
        this.f2814b = uuidGenerator;
        this.f2815c = a();
        this.f2816d = -1;
    }

    public final String a() {
        String replace$default;
        this.f2814b.getClass();
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "uuidGenerator.next().toString()");
        replace$default = StringsKt__StringsJVMKt.replace$default(uuid, StubApp.getString2(999), "", false, 4, (Object) null);
        String lowerCase = replace$default.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
