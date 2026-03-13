package Vb;

import Qb.M0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class y extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f7975a = new y(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (!(element instanceof M0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? element : Integer.valueOf(intValue + 1);
    }
}
