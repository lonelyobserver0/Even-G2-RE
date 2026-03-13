package com.builttoroam.devicecalendar.models;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR \u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010A\u001a\b\u0012\u0004\u0012\u00020B00X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00103\"\u0004\bD\u00105R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/builttoroam/devicecalendar/models/Event;", "", "<init>", "()V", "eventTitle", "", "getEventTitle", "()Ljava/lang/String;", "setEventTitle", "(Ljava/lang/String;)V", "eventId", "getEventId", "setEventId", "calendarId", "getCalendarId", "setCalendarId", "eventDescription", "getEventDescription", "setEventDescription", "eventStartDate", "", "getEventStartDate", "()Ljava/lang/Long;", "setEventStartDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "eventEndDate", "getEventEndDate", "setEventEndDate", "eventStartTimeZone", "getEventStartTimeZone", "setEventStartTimeZone", "eventEndTimeZone", "getEventEndTimeZone", "setEventEndTimeZone", "eventAllDay", "", "getEventAllDay", "()Z", "setEventAllDay", "(Z)V", "eventLocation", "getEventLocation", "setEventLocation", "eventURL", "getEventURL", "setEventURL", "attendees", "", "Lcom/builttoroam/devicecalendar/models/Attendee;", "getAttendees", "()Ljava/util/List;", "setAttendees", "(Ljava/util/List;)V", "recurrenceRule", "Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "getRecurrenceRule", "()Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "setRecurrenceRule", "(Lcom/builttoroam/devicecalendar/models/RecurrenceRule;)V", "organizer", "getOrganizer", "()Lcom/builttoroam/devicecalendar/models/Attendee;", "setOrganizer", "(Lcom/builttoroam/devicecalendar/models/Attendee;)V", "reminders", "Lcom/builttoroam/devicecalendar/models/Reminder;", "getReminders", "setReminders", "availability", "Lcom/builttoroam/devicecalendar/models/Availability;", "getAvailability", "()Lcom/builttoroam/devicecalendar/models/Availability;", "setAvailability", "(Lcom/builttoroam/devicecalendar/models/Availability;)V", "eventStatus", "Lcom/builttoroam/devicecalendar/models/EventStatus;", "getEventStatus", "()Lcom/builttoroam/devicecalendar/models/EventStatus;", "setEventStatus", "(Lcom/builttoroam/devicecalendar/models/EventStatus;)V", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Event {
    private Availability availability;
    private String calendarId;
    private boolean eventAllDay;
    private String eventDescription;
    private Long eventEndDate;
    private String eventEndTimeZone;
    private String eventId;
    private String eventLocation;
    private Long eventStartDate;
    private String eventStartTimeZone;
    private EventStatus eventStatus;
    private String eventTitle;
    private String eventURL;
    private Attendee organizer;
    private RecurrenceRule recurrenceRule;
    private List<Attendee> attendees = new ArrayList();
    private List<Reminder> reminders = new ArrayList();

    public final List<Attendee> getAttendees() {
        return this.attendees;
    }

    public final Availability getAvailability() {
        return this.availability;
    }

    public final String getCalendarId() {
        return this.calendarId;
    }

    public final boolean getEventAllDay() {
        return this.eventAllDay;
    }

    public final String getEventDescription() {
        return this.eventDescription;
    }

    public final Long getEventEndDate() {
        return this.eventEndDate;
    }

    public final String getEventEndTimeZone() {
        return this.eventEndTimeZone;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventLocation() {
        return this.eventLocation;
    }

    public final Long getEventStartDate() {
        return this.eventStartDate;
    }

    public final String getEventStartTimeZone() {
        return this.eventStartTimeZone;
    }

    public final EventStatus getEventStatus() {
        return this.eventStatus;
    }

    public final String getEventTitle() {
        return this.eventTitle;
    }

    public final String getEventURL() {
        return this.eventURL;
    }

    public final Attendee getOrganizer() {
        return this.organizer;
    }

    public final RecurrenceRule getRecurrenceRule() {
        return this.recurrenceRule;
    }

    public final List<Reminder> getReminders() {
        return this.reminders;
    }

    public final void setAttendees(List<Attendee> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.attendees = list;
    }

    public final void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public final void setCalendarId(String str) {
        this.calendarId = str;
    }

    public final void setEventAllDay(boolean z2) {
        this.eventAllDay = z2;
    }

    public final void setEventDescription(String str) {
        this.eventDescription = str;
    }

    public final void setEventEndDate(Long l9) {
        this.eventEndDate = l9;
    }

    public final void setEventEndTimeZone(String str) {
        this.eventEndTimeZone = str;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setEventLocation(String str) {
        this.eventLocation = str;
    }

    public final void setEventStartDate(Long l9) {
        this.eventStartDate = l9;
    }

    public final void setEventStartTimeZone(String str) {
        this.eventStartTimeZone = str;
    }

    public final void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }

    public final void setEventTitle(String str) {
        this.eventTitle = str;
    }

    public final void setEventURL(String str) {
        this.eventURL = str;
    }

    public final void setOrganizer(Attendee attendee) {
        this.organizer = attendee;
    }

    public final void setRecurrenceRule(RecurrenceRule recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
    }

    public final void setReminders(List<Reminder> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.reminders = list;
    }
}
