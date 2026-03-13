package T;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: T.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0298n extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f6880a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f6881b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6882c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6883d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f6884e;

    /* renamed from: f, reason: collision with root package name */
    public int f6885f;

    /* renamed from: g, reason: collision with root package name */
    public int f6886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q f6887h;
    public final /* synthetic */ D5.B j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0298n(Q q10, D5.B b2, Continuation continuation) {
        super(1, continuation);
        this.f6887h = q10;
        this.j = b2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C0298n(this.f6887h, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0298n) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0298n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
