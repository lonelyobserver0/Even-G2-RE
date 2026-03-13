package Qb;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: Qb.i0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0200i0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0200i0 f5872a = new C0200i0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CoroutineContext.Element element = (CoroutineContext.Element) obj;
        if (element instanceof AbstractC0204k0) {
            return (AbstractC0204k0) element;
        }
        return null;
    }
}
