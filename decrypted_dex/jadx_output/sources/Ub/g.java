package Ub;

import Qb.J;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class g implements r {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f7585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7587c;

    public g(CoroutineContext coroutineContext, int i3, int i10) {
        this.f7585a = coroutineContext;
        this.f7586b = i3;
        this.f7587c = i10;
    }

    public abstract Object a(Sb.v vVar, Continuation continuation);

    public abstract g b(CoroutineContext coroutineContext, int i3, int i10);

    public InterfaceC0327h c() {
        return null;
    }

    @Override // Tb.InterfaceC0327h
    public Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        Object c10 = J.c(new e(interfaceC0328i, this, null), continuation);
        return c10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? c10 : Unit.INSTANCE;
    }

    @Override // Ub.r
    public final InterfaceC0327h s(CoroutineContext coroutineContext, int i3, int i10) {
        CoroutineContext coroutineContext2 = this.f7585a;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        int i11 = this.f7587c;
        int i12 = this.f7586b;
        if (i10 == 1) {
            if (i12 != -3) {
                if (i3 != -3) {
                    if (i12 != -2) {
                        if (i3 != -2) {
                            i3 += i12;
                            if (i3 < 0) {
                                i3 = IntCompanionObject.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i12;
            }
            i10 = i11;
        }
        return (Intrinsics.areEqual(plus, coroutineContext2) && i3 == i12 && i10 == i11) ? this : b(plus, i3, i10);
    }

    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = this.f7585a;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add(StubApp.getString2(25689) + coroutineContext);
        }
        int i3 = this.f7586b;
        if (i3 != -3) {
            arrayList.add(StubApp.getString2(25621) + i3);
        }
        int i10 = this.f7587c;
        if (i10 != 1) {
            arrayList.add(StubApp.getString2(25690).concat(E1.a.x(i10)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), null, null, 0, null, null, 62, null);
        return Xa.h.s(sb2, joinToString$default, ']');
    }
}
