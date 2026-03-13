package x9;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public t f23056a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f23057b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23058c;

    /* renamed from: d, reason: collision with root package name */
    public int f23059d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f23061f;

    /* renamed from: g, reason: collision with root package name */
    public int f23062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23061f = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23060e = obj;
        this.f23062g |= Integer.MIN_VALUE;
        return t.a(this.f23061f, null, null, null, 0, this);
    }
}
