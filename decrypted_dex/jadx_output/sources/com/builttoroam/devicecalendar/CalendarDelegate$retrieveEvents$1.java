package com.builttoroam.devicecalendar;

import Qb.I;
import android.content.ContentResolver;
import android.database.Cursor;
import com.builttoroam.devicecalendar.models.Attendee;
import com.builttoroam.devicecalendar.models.Calendar;
import com.builttoroam.devicecalendar.models.Event;
import com.builttoroam.devicecalendar.models.Reminder;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.builttoroam.devicecalendar.CalendarDelegate$retrieveEvents$1", f = "CalendarDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCalendarDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate$retrieveEvents$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1006:1\n288#2,2:1007\n*S KotlinDebug\n*F\n+ 1 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate$retrieveEvents$1\n*L\n356#1:1007,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CalendarDelegate$retrieveEvents$1 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ Calendar $calendar;
    final /* synthetic */ String $calendarId;
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ List<Event> $events;
    final /* synthetic */ Cursor $eventsCursor;
    int label;
    final /* synthetic */ CalendarDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDelegate$retrieveEvents$1(Cursor cursor, CalendarDelegate calendarDelegate, String str, List<Event> list, Calendar calendar, ContentResolver contentResolver, Continuation<? super CalendarDelegate$retrieveEvents$1> continuation) {
        super(2, continuation);
        this.$eventsCursor = cursor;
        this.this$0 = calendarDelegate;
        this.$calendarId = str;
        this.$events = list;
        this.$calendar = calendar;
        this.$contentResolver = contentResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CalendarDelegate$retrieveEvents$1(this.$eventsCursor, this.this$0, this.$calendarId, this.$events, this.$calendar, this.$contentResolver, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((CalendarDelegate$retrieveEvents$1) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<Attendee> retrieveAttendees;
        Object obj2;
        List<Reminder> retrieveReminders;
        Event parseEvent;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        while (true) {
            Cursor cursor = this.$eventsCursor;
            if (cursor == null || !cursor.moveToNext()) {
                break;
            }
            parseEvent = this.this$0.parseEvent(this.$calendarId, this.$eventsCursor);
            if (parseEvent != null) {
                this.$events.add(parseEvent);
            }
        }
        for (Event event : this.$events) {
            CalendarDelegate calendarDelegate = this.this$0;
            Calendar calendar = this.$calendar;
            String eventId = event.getEventId();
            Intrinsics.checkNotNull(eventId);
            retrieveAttendees = calendarDelegate.retrieveAttendees(calendar, eventId, this.$contentResolver);
            Iterator<T> it = retrieveAttendees.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                Attendee attendee = (Attendee) obj2;
                if (attendee.getIsOrganizer() == null || !attendee.getIsOrganizer().booleanValue()) {
                }
            }
            event.setOrganizer((Attendee) obj2);
            event.setAttendees(retrieveAttendees);
            CalendarDelegate calendarDelegate2 = this.this$0;
            String eventId2 = event.getEventId();
            Intrinsics.checkNotNull(eventId2);
            retrieveReminders = calendarDelegate2.retrieveReminders(eventId2, this.$contentResolver);
            event.setReminders(retrieveReminders);
        }
        return Unit.INSTANCE;
    }
}
