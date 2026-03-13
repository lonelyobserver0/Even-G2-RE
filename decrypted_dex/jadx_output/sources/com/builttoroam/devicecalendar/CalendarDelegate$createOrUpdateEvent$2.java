package com.builttoroam.devicecalendar;

import Qb.I;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.provider.CalendarContract;
import com.builttoroam.devicecalendar.models.Attendee;
import com.builttoroam.devicecalendar.models.Calendar;
import com.builttoroam.devicecalendar.models.Event;
import com.builttoroam.devicecalendar.models.Reminder;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQb/I;", "", "<anonymous>", "(LQb/I;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.builttoroam.devicecalendar.CalendarDelegate$createOrUpdateEvent$2", f = "CalendarDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nCalendarDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate$createOrUpdateEvent$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1006:1\n766#2:1007\n857#2:1008\n1726#2,3:1009\n858#2:1012\n766#2:1013\n857#2:1014\n1726#2,3:1015\n858#2:1018\n288#2,2:1019\n288#2,2:1021\n*S KotlinDebug\n*F\n+ 1 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate$createOrUpdateEvent$2\n*L\n412#1:1007\n412#1:1008\n412#1:1009,3\n412#1:1012\n417#1:1013\n417#1:1014\n417#1:1015,3\n417#1:1018\n422#1:1019,2\n425#1:1021,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CalendarDelegate$createOrUpdateEvent$2 extends SuspendLambda implements Function2<I, Continuation<? super Unit>, Object> {
    final /* synthetic */ Calendar $calendar;
    final /* synthetic */ ContentResolver $contentResolver;
    final /* synthetic */ Event $event;
    final /* synthetic */ Ref.ObjectRef<Long> $eventId;
    final /* synthetic */ ContentValues $values;
    int label;
    final /* synthetic */ CalendarDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarDelegate$createOrUpdateEvent$2(ContentResolver contentResolver, Ref.ObjectRef<Long> objectRef, ContentValues contentValues, CalendarDelegate calendarDelegate, Calendar calendar, Event event, Continuation<? super CalendarDelegate$createOrUpdateEvent$2> continuation) {
        super(2, continuation);
        this.$contentResolver = contentResolver;
        this.$eventId = objectRef;
        this.$values = contentValues;
        this.this$0 = calendarDelegate;
        this.$calendar = calendar;
        this.$event = event;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CalendarDelegate$createOrUpdateEvent$2(this.$contentResolver, this.$eventId, this.$values, this.this$0, this.$calendar, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(I i3, Continuation<? super Unit> continuation) {
        return ((CalendarDelegate$createOrUpdateEvent$2) create(i3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List retrieveAttendees;
        List list;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException(StubApp.getString2(275));
        }
        ResultKt.throwOnFailure(obj);
        ContentResolver contentResolver = this.$contentResolver;
        Object obj3 = null;
        if (contentResolver != null) {
            Boxing.boxInt(contentResolver.update(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, this.$eventId.element.longValue()), this.$values, null, null));
        }
        retrieveAttendees = this.this$0.retrieveAttendees(this.$calendar, this.$eventId.element.toString(), this.$contentResolver);
        if (this.$event.getAttendees().isEmpty()) {
            list = retrieveAttendees;
        } else {
            Event event = this.$event;
            list = new ArrayList();
            for (Object obj4 : retrieveAttendees) {
                Attendee attendee = (Attendee) obj4;
                List<Attendee> attendees = event.getAttendees();
                if (attendees == null || !attendees.isEmpty()) {
                    Iterator<T> it = attendees.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((Attendee) it.next()).getEmailAddress(), attendee.getEmailAddress())) {
                            break;
                        }
                    }
                }
                list.add(obj4);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            this.this$0.deleteAttendee(this.$eventId.element.longValue(), (Attendee) it2.next(), this.$contentResolver);
        }
        List<Attendee> attendees2 = this.$event.getAttendees();
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : attendees2) {
            Attendee attendee2 = (Attendee) obj5;
            if (retrieveAttendees == null || !retrieveAttendees.isEmpty()) {
                Iterator it3 = retrieveAttendees.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.areEqual(((Attendee) it3.next()).getEmailAddress(), attendee2.getEmailAddress())) {
                        break;
                    }
                }
            }
            arrayList.add(obj5);
        }
        this.this$0.insertAttendees(arrayList, this.$eventId.element, this.$contentResolver);
        this.this$0.deleteExistingReminders(this.$contentResolver, this.$eventId.element.longValue());
        CalendarDelegate calendarDelegate = this.this$0;
        List<Reminder> reminders = this.$event.getReminders();
        Long l9 = this.$eventId.element;
        ContentResolver contentResolver2 = this.$contentResolver;
        Intrinsics.checkNotNull(contentResolver2);
        calendarDelegate.insertReminders(reminders, l9, contentResolver2);
        Calendar calendar = this.$calendar;
        Iterator it4 = retrieveAttendees.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it4.next();
            if (Intrinsics.areEqual(((Attendee) obj2).getEmailAddress(), calendar.getOwnerAccount())) {
                break;
            }
        }
        Attendee attendee3 = (Attendee) obj2;
        List<Attendee> attendees3 = this.$event.getAttendees();
        Calendar calendar2 = this.$calendar;
        Iterator<T> it5 = attendees3.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next = it5.next();
            if (Intrinsics.areEqual(((Attendee) next).getEmailAddress(), calendar2.getOwnerAccount())) {
                obj3 = next;
                break;
            }
        }
        Attendee attendee4 = (Attendee) obj3;
        if (attendee3 != null && attendee4 != null && attendee4.getAttendanceStatus() != null && !Intrinsics.areEqual(attendee3.getAttendanceStatus(), attendee4.getAttendanceStatus())) {
            this.this$0.updateAttendeeStatus(this.$eventId.element.longValue(), attendee4, this.$contentResolver);
        }
        return Unit.INSTANCE;
    }
}
