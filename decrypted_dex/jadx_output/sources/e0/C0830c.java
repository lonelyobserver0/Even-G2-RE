package e0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0830c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0830c f13567c = new C0830c(SetsKt.emptySet(), MapsKt.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public final Set f13568a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13569b;

    public C0830c(Set flags, Map allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f13568a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : allowedViolations.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
        }
        this.f13569b = linkedHashMap;
    }
}
