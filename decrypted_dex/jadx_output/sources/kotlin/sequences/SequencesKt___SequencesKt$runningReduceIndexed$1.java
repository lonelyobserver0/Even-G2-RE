package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [S] */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "S", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2509, 2513}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, nl = {2510, 2516}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt___SequencesKt$runningReduceIndexed$1<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function3<Integer, S, T, S> $operation;
    final /* synthetic */ Sequence<T> $this_runningReduceIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(Sequence<? extends T> sequence, Function3<? super Integer, ? super S, ? super T, ? extends S> function3, Continuation<? super SequencesKt___SequencesKt$runningReduceIndexed$1> continuation) {
        super(2, continuation);
        this.$this_runningReduceIndexed = sequence;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, continuation);
        sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r0.yield(r2, r9) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L29
            if (r2 != r3) goto L21
            int r2 = r9.I$0
            java.lang.Object r4 = r9.L$2
            java.lang.Object r5 = r9.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            kotlin.ResultKt.throwOnFailure(r10)
            r8 = r4
            r4 = r2
            r2 = r8
            goto L55
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L29:
            java.lang.Object r2 = r9.L$2
            java.lang.Object r5 = r9.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            kotlin.ResultKt.throwOnFailure(r10)
            goto L55
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.sequences.Sequence<T> r10 = r9.$this_runningReduceIndexed
            java.util.Iterator r5 = r10.iterator()
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L84
            java.lang.Object r2 = r5.next()
            r9.L$0 = r0
            r9.L$1 = r5
            r9.L$2 = r2
            r9.label = r4
            java.lang.Object r10 = r0.yield(r2, r9)
            if (r10 != r1) goto L55
            goto L80
        L55:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L84
            kotlin.jvm.functions.Function3<java.lang.Integer, S, T, S> r10 = r9.$operation
            int r6 = r4 + 1
            if (r4 >= 0) goto L64
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L64:
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            java.lang.Object r7 = r5.next()
            java.lang.Object r4 = r10.invoke(r4, r2, r7)
            r9.L$0 = r0
            r9.L$1 = r5
            r9.L$2 = r4
            r9.I$0 = r6
            r9.label = r3
            java.lang.Object r10 = r0.yield(r4, r9)
            if (r10 != r1) goto L81
        L80:
            return r1
        L81:
            r2 = r4
            r4 = r6
            goto L55
        L84:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super S> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
