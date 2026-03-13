package b3;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public List f10660a;

    /* renamed from: b, reason: collision with root package name */
    public int f10661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0498N f10662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f10663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0498N c0498n, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f10662c = c0498n;
        this.f10663d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z(this.f10662c, this.f10663d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((Qb.I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f3 A[Catch: Exception -> 0x0149, TryCatch #2 {Exception -> 0x0149, blocks: (B:9:0x00e4, B:11:0x00f3, B:12:0x00f9, B:14:0x0107, B:17:0x013f, B:20:0x0129, B:21:0x014b, B:31:0x016f, B:34:0x0184, B:35:0x017e, B:23:0x018b, B:25:0x0196, B:38:0x015b, B:40:0x01ab, B:41:0x01b0, B:30:0x0153, B:16:0x0114), top: B:8:0x00e4, outer: #5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0107 A[Catch: Exception -> 0x0149, TRY_LEAVE, TryCatch #2 {Exception -> 0x0149, blocks: (B:9:0x00e4, B:11:0x00f3, B:12:0x00f9, B:14:0x0107, B:17:0x013f, B:20:0x0129, B:21:0x014b, B:31:0x016f, B:34:0x0184, B:35:0x017e, B:23:0x018b, B:25:0x0196, B:38:0x015b, B:40:0x01ab, B:41:0x01b0, B:30:0x0153, B:16:0x0114), top: B:8:0x00e4, outer: #5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0196 A[Catch: Exception -> 0x0149, TryCatch #2 {Exception -> 0x0149, blocks: (B:9:0x00e4, B:11:0x00f3, B:12:0x00f9, B:14:0x0107, B:17:0x013f, B:20:0x0129, B:21:0x014b, B:31:0x016f, B:34:0x0184, B:35:0x017e, B:23:0x018b, B:25:0x0196, B:38:0x015b, B:40:0x01ab, B:41:0x01b0, B:30:0x0153, B:16:0x0114), top: B:8:0x00e4, outer: #5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
