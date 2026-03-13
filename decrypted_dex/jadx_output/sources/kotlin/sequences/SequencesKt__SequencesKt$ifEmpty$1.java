package kotlin.sequences;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {0, 0, 1, 1}, l = {102, 104}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "$this$sequence", "iterator"}, nl = {104, 106}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class SequencesKt__SequencesKt$ifEmpty$1<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Sequence<T>> $defaultValue;
    final /* synthetic */ Sequence<T> $this_ifEmpty;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$ifEmpty$1(Sequence<? extends T> sequence, Function0<? extends Sequence<? extends T>> function0, Continuation<? super SequencesKt__SequencesKt$ifEmpty$1> continuation) {
        super(2, continuation);
        this.$this_ifEmpty = sequence;
        this.$defaultValue = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, continuation);
        sequencesKt__SequencesKt$ifEmpty$1.L$0 = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r0.yieldAll(r6, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r0.yieldAll(r2, r5) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            java.lang.Object r0 = r5.L$1
            java.util.Iterator r0 = (java.util.Iterator) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L64
        L23:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.sequences.Sequence<T> r6 = r5.$this_ifEmpty
            java.util.Iterator r6 = r6.iterator()
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.L$0 = r2
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.L$1 = r2
            r5.label = r4
            java.lang.Object r6 = r0.yieldAll(r6, r5)
            if (r6 != r1) goto L64
            goto L63
        L47:
            kotlin.jvm.functions.Function0<kotlin.sequences.Sequence<T>> r2 = r5.$defaultValue
            java.lang.Object r2 = r2.invoke()
            kotlin.sequences.Sequence r2 = (kotlin.sequences.Sequence) r2
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.L$0 = r4
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.L$1 = r6
            r5.label = r3
            java.lang.Object r6 = r0.yieldAll(r2, r5)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super T> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
