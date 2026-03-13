package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2423, 2427}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element"}, nl = {2424, 2429}, s = {"L$0", "L$0", "L$1", "L$3"}, v = 2)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt___SequencesKt$runningFold$1<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ Function2<R, T, R> $operation;
    final /* synthetic */ Sequence<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFold$1(R r8, Sequence<? extends T> sequence, Function2<? super R, ? super T, ? extends R> function2, Continuation<? super SequencesKt___SequencesKt$runningFold$1> continuation) {
        super(2, continuation);
        this.$initial = r8;
        this.$this_runningFold = sequence;
        this.$operation = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, continuation);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r0.yield(r7, r6) == r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L29
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r2 = r6.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r6.L$1
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r4
            goto L41
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L25:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L39
        L29:
            kotlin.ResultKt.throwOnFailure(r7)
            R r7 = r6.$initial
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r7 = r0.yield(r7, r6)
            if (r7 != r1) goto L39
            goto L65
        L39:
            R r7 = r6.$initial
            kotlin.sequences.Sequence<T> r2 = r6.$this_runningFold
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r2.next()
            kotlin.jvm.functions.Function2<R, T, R> r5 = r6.$operation
            java.lang.Object r7 = r5.invoke(r7, r4)
            r6.L$0 = r0
            r6.L$1 = r7
            r6.L$2 = r2
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r6.L$3 = r4
            r6.label = r3
            java.lang.Object r4 = r0.yield(r7, r6)
            if (r4 != r1) goto L41
        L65:
            return r1
        L66:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super R> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
