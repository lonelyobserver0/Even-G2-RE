package com.builttoroam.devicecalendar;

import Qb.I;
import android.content.ContentResolver;
import com.builttoroam.devicecalendar.models.Event;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.builttoroam.devicecalendar.CalendarDelegate$createOrUpdateEvent$1", f = "CalendarDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CalendarDelegate$createOrUpdateEvent$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ Event $event;
    final /* synthetic */ Ref.ObjectRef<Long> $eventId;
    int label;
    final /* synthetic */ CalendarDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDelegate$createOrUpdateEvent$1(CalendarDelegate calendarDelegate, Event event, Ref.ObjectRef<Long> objectRef, ContentResolver contentResolver, Continuation<? super CalendarDelegate$createOrUpdateEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = calendarDelegate;
        this.$event = event;
        this.$eventId = objectRef;
        this.$contentResolver = contentResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CalendarDelegate$createOrUpdateEvent$1(this.this$0, this.$event, this.$eventId, this.$contentResolver, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((CalendarDelegate$createOrUpdateEvent$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.insertAttendees(this.$event.getAttendees(), this.$eventId.element, this.$contentResolver);
        this.this$0.insertReminders(this.$event.getReminders(), this.$eventId.element, this.$contentResolver);
        return Unit.INSTANCE;
    }
}
