package j8;

import Qb.I;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: j8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1095a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f15374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1095a(File file, String str, Continuation continuation) {
        super(2, continuation);
        this.f15374a = file;
        this.f15375b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1095a(this.f15374a, this.f15375b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1095a) create((I) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File file = this.f15374a;
        File file2 = new File(file.getParent(), this.f15375b);
        file.renameTo(file2);
        return file2;
    }
}
