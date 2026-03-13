package L8;

import B3.s;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public s f4310a;

    /* renamed from: b, reason: collision with root package name */
    public List f4311b;

    /* renamed from: c, reason: collision with root package name */
    public s f4312c;

    /* renamed from: d, reason: collision with root package name */
    public List f4313d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f4315f;

    /* renamed from: g, reason: collision with root package name */
    public int f4316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4315f = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4314e = obj;
        this.f4316g |= Integer.MIN_VALUE;
        return s.b(this.f4315f, null, 0, this);
    }
}
