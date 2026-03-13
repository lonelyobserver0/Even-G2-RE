package Sb;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class s extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f6724a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6725b;

    /* renamed from: c, reason: collision with root package name */
    public int f6726c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6725b = obj;
        this.f6726c |= Integer.MIN_VALUE;
        return t.a(null, null, this);
    }
}
