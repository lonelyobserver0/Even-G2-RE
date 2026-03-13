package T;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: T.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0292h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f6856a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6857b;

    /* renamed from: c, reason: collision with root package name */
    public int f6858c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f6860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0292h(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f6860e = list;
        this.f6861f = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0292h c0292h = new C0292h(this.f6860e, this.f6861f, continuation);
        c0292h.f6859d = obj;
        return c0292h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0292h) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.f6858c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            obj = this.f6859d;
            it = this.f6860e.iterator();
            list = this.f6861f;
        } else if (i3 == 1) {
            Object obj2 = this.f6857b;
            Iterator it2 = this.f6856a;
            List list2 = (List) this.f6859d;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0291g(1, null));
                this.f6859d = list2;
                this.f6856a = it2;
                this.f6857b = null;
                this.f6858c = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            it = this.f6856a;
            list = (List) this.f6859d;
            ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f6859d = list;
        this.f6856a = it;
        this.f6857b = obj;
        this.f6858c = 1;
        throw null;
    }
}
