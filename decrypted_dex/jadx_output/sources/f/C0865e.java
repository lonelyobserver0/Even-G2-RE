package f;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0865e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0865e f13689a = new C0865e(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + PKIFailureInfo.notAuthorized);
    }
}
