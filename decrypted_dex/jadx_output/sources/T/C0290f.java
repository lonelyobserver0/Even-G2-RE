package T;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: T.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0290f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f6849a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f6850b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6851c;

    /* renamed from: d, reason: collision with root package name */
    public int f6852d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6851c = obj;
        this.f6852d |= Integer.MIN_VALUE;
        return AbstractC0293i.a(null, null, this);
    }
}
