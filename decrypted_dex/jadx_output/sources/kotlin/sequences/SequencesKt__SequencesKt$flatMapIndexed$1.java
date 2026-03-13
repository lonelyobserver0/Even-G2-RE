package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0, 0, 0}, l = {383}, m = "invokeSuspend", n = {"$this$sequence", "element", "result", "index"}, nl = {385}, s = {"L$0", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt__SequencesKt$flatMapIndexed$1<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<C, Iterator<R>> $iterator;
    final /* synthetic */ Sequence<T> $source;
    final /* synthetic */ Function2<Integer, T, C> $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$flatMapIndexed$1(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends C> function2, Function1<? super C, ? extends Iterator<? extends R>> function1, Continuation<? super SequencesKt__SequencesKt$flatMapIndexed$1> continuation) {
        super(2, continuation);
        this.$source = sequence;
        this.$transform = function2;
        this.$iterator = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, continuation);
        sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i3;
        Iterator it;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            i3 = 0;
            it = this.$source.iterator();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.I$0;
            it = (Iterator) this.L$1;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            Function2<Integer, T, C> function2 = this.$transform;
            int i11 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Object invoke = function2.invoke(Boxing.boxInt(i3), next);
            Iterator<R> invoke2 = this.$iterator.invoke(invoke);
            this.L$0 = sequenceScope;
            this.L$1 = it;
            this.L$2 = SpillingKt.nullOutSpilledVariable(next);
            this.L$3 = SpillingKt.nullOutSpilledVariable(invoke);
            this.I$0 = i11;
            this.label = 1;
            if (sequenceScope.yieldAll(invoke2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i3 = i11;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super R> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
