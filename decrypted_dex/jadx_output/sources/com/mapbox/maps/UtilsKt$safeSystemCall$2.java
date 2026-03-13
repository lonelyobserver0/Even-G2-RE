package com.mapbox.maps;

import Qb.C;
import Qb.I;
import Qb.L;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LQb/I;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.mapbox.maps.UtilsKt$safeSystemCall$2", f = "Utils.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class UtilsKt$safeSystemCall$2<T> extends SuspendLambda implements Function2<I, Continuation<? super T>, Object> {
    final /* synthetic */ C $dispatcher;
    final /* synthetic */ Function1<Continuation<? super T>, Object> $operation;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "LQb/I;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.mapbox.maps.UtilsKt$safeSystemCall$2$1", f = "Utils.kt", i = {}, l = {EACTags.ELEMENT_LIST}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.mapbox.maps.UtilsKt$safeSystemCall$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<I, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $operation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$operation = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$operation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(I i3, Continuation<? super T> continuation) {
            return ((AnonymousClass1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException(StubApp.getString2(275));
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super T>, Object> function1 = this.$operation;
            this.label = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UtilsKt$safeSystemCall$2(C c10, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super UtilsKt$safeSystemCall$2> continuation) {
        super(2, continuation);
        this.$dispatcher = c10;
        this.$operation = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtilsKt$safeSystemCall$2(this.$dispatcher, this.$operation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super T> continuation) {
        return ((UtilsKt$safeSystemCall$2) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(StubApp.getString2(275));
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C c10 = this.$dispatcher;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$operation, null);
        this.label = 1;
        Object n10 = L.n(c10, anonymousClass1, this);
        return n10 == coroutine_suspended ? coroutine_suspended : n10;
    }
}
