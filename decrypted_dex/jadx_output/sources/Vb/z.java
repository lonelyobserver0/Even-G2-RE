package Vb;

import Qb.M0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class z extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f7976a = new z(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        M0 m02 = (M0) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (m02 != null) {
            return m02;
        }
        if (element instanceof M0) {
            return (M0) element;
        }
        return null;
    }
}
