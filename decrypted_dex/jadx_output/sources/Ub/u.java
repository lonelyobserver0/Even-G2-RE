package Ub;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class u extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final u f7615a = new u(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj).intValue() + 1);
    }
}
