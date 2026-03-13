package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1, 1}, l = {2451, 2456}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element", "index"}, nl = {2452, 2458}, s = {"L$0", "L$0", "L$1", "L$3", "I$0"}, v = 2)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt___SequencesKt$runningFoldIndexed$1<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ Function3<Integer, R, T, R> $operation;
    final /* synthetic */ Sequence<T> $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(R r8, Sequence<? extends T> sequence, Function3<? super Integer, ? super R, ? super T, ? extends R> function3, Continuation<? super SequencesKt___SequencesKt$runningFoldIndexed$1> continuation) {
        super(2, continuation);
        this.$initial = r8;
        this.$this_runningFoldIndexed = sequence;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, continuation);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r0.yield(r10, r9) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
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
            if (r2 == 0) goto L2b
            if (r2 == r4) goto L27
            if (r2 != r3) goto L1f
            int r2 = r9.I$0
            java.lang.Object r4 = r9.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r9.L$1
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r5
            goto L47
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L3b
        L2b:
            kotlin.ResultKt.throwOnFailure(r10)
            R r10 = r9.$initial
            r9.L$0 = r0
            r9.label = r4
            java.lang.Object r10 = r0.yield(r10, r9)
            if (r10 != r1) goto L3b
            goto L78
        L3b:
            R r10 = r9.$initial
            kotlin.sequences.Sequence<T> r2 = r9.$this_runningFoldIndexed
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r8 = r4
            r4 = r2
            r2 = r8
        L47:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            kotlin.jvm.functions.Function3<java.lang.Integer, R, T, R> r6 = r9.$operation
            int r7 = r2 + 1
            if (r2 >= 0) goto L5a
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L5a:
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            java.lang.Object r10 = r6.invoke(r2, r10, r5)
            r9.L$0 = r0
            r9.L$1 = r10
            r9.L$2 = r4
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r9.L$3 = r2
            r9.I$0 = r7
            r9.label = r3
            java.lang.Object r2 = r0.yield(r10, r9)
            if (r2 != r1) goto L79
        L78:
            return r1
        L79:
            r2 = r7
            goto L47
        L7b:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super R> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
