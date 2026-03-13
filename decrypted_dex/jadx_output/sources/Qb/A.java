package Qb;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class A extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f5794a = new A(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineContext.Element element = (CoroutineContext.Element) obj;
        if (element instanceof C) {
            return (C) element;
        }
        return null;
    }
}
