package com.builttoroam.devicecalendar;

import Ya.d;
import android.app.Activity;
import android.content.Context;
import com.builttoroam.devicecalendar.common.DayOfWeek;
import com.builttoroam.devicecalendar.common.RecurrenceFrequency;
import com.builttoroam.devicecalendar.models.Attendee;
import com.builttoroam.devicecalendar.models.Availability;
import com.builttoroam.devicecalendar.models.Event;
import com.builttoroam.devicecalendar.models.EventStatus;
import com.builttoroam.devicecalendar.models.RecurrenceRule;
import com.builttoroam.devicecalendar.models.Reminder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import eb.b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u0010*\u0004\u0018\u00010\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u0010*\u0004\u0018\u00010\u0010H\u0082\b¢\u0006\u0004\b\u0016\u0010\u0014J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020 2\u0006\u0010#\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010\u0005J\u0017\u0010)\u001a\u00020 2\u0006\u0010#\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010\u0005J\u001f\u0010-\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010<\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u00109R\u0014\u0010=\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010>\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u00109R\u0014\u0010?\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010@\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u00109R\u0014\u0010A\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010B\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u00109R\u0014\u0010C\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bC\u00109R\u0014\u0010D\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u00109R\u0014\u0010E\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u00109R\u0014\u0010F\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u00109R\u0014\u0010G\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u00109R\u0014\u0010H\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bH\u00109R\u0014\u0010I\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u00109R\u0014\u0010J\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bJ\u00109R\u0014\u0010K\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bK\u00109R\u0014\u0010L\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bL\u00109R\u0014\u0010M\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bM\u00109R\u0014\u0010N\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u00109R\u0014\u0010O\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u00109R\u0014\u0010P\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u00109R\u0014\u0010Q\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bQ\u00109R\u0014\u0010R\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u00109R\u0014\u0010S\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u00109R\u0014\u0010T\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u00109R\u0014\u0010U\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bU\u00109R\u0014\u0010V\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u00109R\u0014\u0010W\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bW\u00109R\u0014\u0010X\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u00109R\u0014\u0010Y\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bY\u00109R\u0014\u0010Z\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bZ\u00109R\u0014\u0010[\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b[\u00109R\u0014\u0010\\\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\\\u00109R\u0014\u0010]\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b]\u00109R\u0014\u0010^\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b^\u00109R\u0014\u0010_\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b_\u00109R\u0014\u0010`\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b`\u00109R\u0014\u0010a\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\ba\u00109R\u0014\u0010b\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bb\u00109R\u0014\u0010c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bc\u00109R\u0014\u0010d\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bd\u00109R\u0016\u0010f\u001a\u00020e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006h"}, d2 = {"Lcom/builttoroam/devicecalendar/DeviceCalendarPlugin;", "Ldb/b;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Leb/a;", "<init>", "()V", "Lio/flutter/plugin/common/MethodCall;", "call", "", "calendarId", "Lcom/builttoroam/devicecalendar/models/Event;", "parseEventArgs", "(Lio/flutter/plugin/common/MethodCall;Ljava/lang/String;)Lcom/builttoroam/devicecalendar/models/Event;", "Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "parseRecurrenceRuleArgs", "(Lio/flutter/plugin/common/MethodCall;)Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "", "T", "", "toListOf", "(Ljava/lang/Object;)Ljava/util/List;", "", "toMutableListOf", "value", "Lcom/builttoroam/devicecalendar/models/Availability;", "parseAvailability", "(Ljava/lang/String;)Lcom/builttoroam/devicecalendar/models/Availability;", "Lcom/builttoroam/devicecalendar/models/EventStatus;", "parseEventStatus", "(Ljava/lang/String;)Lcom/builttoroam/devicecalendar/models/EventStatus;", "Ldb/a;", "flutterPluginBinding", "", "onAttachedToEngine", "(Ldb/a;)V", "binding", "onDetachedFromEngine", "Leb/b;", "onAttachedToActivity", "(Leb/b;)V", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "REQUEST_PERMISSIONS_METHOD", "Ljava/lang/String;", "HAS_PERMISSIONS_METHOD", "RETRIEVE_CALENDARS_METHOD", "RETRIEVE_EVENTS_METHOD", "DELETE_EVENT_METHOD", "DELETE_EVENT_INSTANCE_METHOD", "CREATE_OR_UPDATE_EVENT_METHOD", "CREATE_CALENDAR_METHOD", "DELETE_CALENDAR_METHOD", "CALENDAR_ID_ARGUMENT", "CALENDAR_NAME_ARGUMENT", "START_DATE_ARGUMENT", "END_DATE_ARGUMENT", "EVENT_IDS_ARGUMENT", "EVENT_ID_ARGUMENT", "EVENT_TITLE_ARGUMENT", "EVENT_LOCATION_ARGUMENT", "EVENT_URL_ARGUMENT", "EVENT_DESCRIPTION_ARGUMENT", "EVENT_ALL_DAY_ARGUMENT", "EVENT_START_DATE_ARGUMENT", "EVENT_END_DATE_ARGUMENT", "EVENT_START_TIMEZONE_ARGUMENT", "EVENT_END_TIMEZONE_ARGUMENT", "RECURRENCE_RULE_ARGUMENT", "RECURRENCE_FREQUENCY_ARGUMENT", "TOTAL_OCCURRENCES_ARGUMENT", "INTERVAL_ARGUMENT", "DAYS_OF_WEEK_ARGUMENT", "DAY_OF_MONTH_ARGUMENT", "MONTH_OF_YEAR_ARGUMENT", "WEEK_OF_MONTH_ARGUMENT", "ATTENDEES_ARGUMENT", "EMAIL_ADDRESS_ARGUMENT", "NAME_ARGUMENT", "ROLE_ARGUMENT", "REMINDERS_ARGUMENT", "MINUTES_ARGUMENT", "FOLLOWING_INSTANCES", "CALENDAR_COLOR_ARGUMENT", "LOCAL_ACCOUNT_NAME_ARGUMENT", "EVENT_AVAILABILITY_ARGUMENT", "ATTENDANCE_STATUS_ARGUMENT", "EVENT_STATUS_ARGUMENT", "Lcom/builttoroam/devicecalendar/CalendarDelegate;", "_calendarDelegate", "Lcom/builttoroam/devicecalendar/CalendarDelegate;", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceCalendarPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceCalendarPlugin.kt\ncom/builttoroam/devicecalendar/DeviceCalendarPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n249#1:271\n249#1:298\n800#2,11:272\n1549#2:283\n1620#2,3:284\n800#2,11:287\n800#2,11:299\n*S KotlinDebug\n*F\n+ 1 DeviceCalendarPlugin.kt\ncom/builttoroam/devicecalendar/DeviceCalendarPlugin\n*L\n230#1:271\n253#1:298\n230#1:272,11\n230#1:283\n230#1:284,3\n249#1:287,11\n253#1:299,11\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class DeviceCalendarPlugin implements InterfaceC0825b, MethodChannel.MethodCallHandler, eb.a {
    private CalendarDelegate _calendarDelegate;
    private Activity activity;
    private MethodChannel channel;
    private Context context;
    private final String REQUEST_PERMISSIONS_METHOD = StubApp.getString2(1798);
    private final String HAS_PERMISSIONS_METHOD = StubApp.getString2(9724);
    private final String RETRIEVE_CALENDARS_METHOD = StubApp.getString2(9725);
    private final String RETRIEVE_EVENTS_METHOD = StubApp.getString2(9726);
    private final String DELETE_EVENT_METHOD = StubApp.getString2(9727);
    private final String DELETE_EVENT_INSTANCE_METHOD = StubApp.getString2(9728);
    private final String CREATE_OR_UPDATE_EVENT_METHOD = StubApp.getString2(9729);
    private final String CREATE_CALENDAR_METHOD = StubApp.getString2(9730);
    private final String DELETE_CALENDAR_METHOD = StubApp.getString2(9731);
    private final String CALENDAR_ID_ARGUMENT = StubApp.getString2(9732);
    private final String CALENDAR_NAME_ARGUMENT = StubApp.getString2(9733);
    private final String START_DATE_ARGUMENT = StubApp.getString2(9734);
    private final String END_DATE_ARGUMENT = StubApp.getString2(9735);
    private final String EVENT_IDS_ARGUMENT = StubApp.getString2(9716);
    private final String EVENT_ID_ARGUMENT = StubApp.getString2(9736);
    private final String EVENT_TITLE_ARGUMENT = StubApp.getString2(9737);
    private final String EVENT_LOCATION_ARGUMENT = StubApp.getString2(2997);
    private final String EVENT_URL_ARGUMENT = StubApp.getString2(9738);
    private final String EVENT_DESCRIPTION_ARGUMENT = StubApp.getString2(9739);
    private final String EVENT_ALL_DAY_ARGUMENT = StubApp.getString2(9740);
    private final String EVENT_START_DATE_ARGUMENT = StubApp.getString2(9741);
    private final String EVENT_END_DATE_ARGUMENT = StubApp.getString2(9742);
    private final String EVENT_START_TIMEZONE_ARGUMENT = StubApp.getString2(9743);
    private final String EVENT_END_TIMEZONE_ARGUMENT = StubApp.getString2(9744);
    private final String RECURRENCE_RULE_ARGUMENT = StubApp.getString2(9745);
    private final String RECURRENCE_FREQUENCY_ARGUMENT = StubApp.getString2(9746);
    private final String TOTAL_OCCURRENCES_ARGUMENT = StubApp.getString2(9747);
    private final String INTERVAL_ARGUMENT = StubApp.getString2(9748);
    private final String DAYS_OF_WEEK_ARGUMENT = StubApp.getString2(9749);
    private final String DAY_OF_MONTH_ARGUMENT = StubApp.getString2(9750);
    private final String MONTH_OF_YEAR_ARGUMENT = StubApp.getString2(9751);
    private final String WEEK_OF_MONTH_ARGUMENT = StubApp.getString2(9752);
    private final String ATTENDEES_ARGUMENT = StubApp.getString2(9753);
    private final String EMAIL_ADDRESS_ARGUMENT = StubApp.getString2(9754);
    private final String NAME_ARGUMENT = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
    private final String ROLE_ARGUMENT = StubApp.getString2(9755);
    private final String REMINDERS_ARGUMENT = StubApp.getString2(9756);
    private final String MINUTES_ARGUMENT = StubApp.getString2(9690);
    private final String FOLLOWING_INSTANCES = StubApp.getString2(9757);
    private final String CALENDAR_COLOR_ARGUMENT = StubApp.getString2(9758);
    private final String LOCAL_ACCOUNT_NAME_ARGUMENT = StubApp.getString2(9759);
    private final String EVENT_AVAILABILITY_ARGUMENT = StubApp.getString2(9679);
    private final String ATTENDANCE_STATUS_ARGUMENT = StubApp.getString2(9760);
    private final String EVENT_STATUS_ARGUMENT = StubApp.getString2(9680);

    private final Availability parseAvailability(String value) {
        if (value == null || Intrinsics.areEqual(value, "UNAVAILABLE")) {
            return null;
        }
        return Availability.valueOf(value);
    }

    private final Event parseEventArgs(MethodCall call, String calendarId) {
        Event event = new Event();
        event.setEventTitle((String) call.argument(this.EVENT_TITLE_ARGUMENT));
        event.setCalendarId(calendarId);
        event.setEventId((String) call.argument(this.EVENT_ID_ARGUMENT));
        event.setEventDescription((String) call.argument(this.EVENT_DESCRIPTION_ARGUMENT));
        Boolean bool = (Boolean) call.argument(this.EVENT_ALL_DAY_ARGUMENT);
        event.setEventAllDay(bool != null ? bool.booleanValue() : false);
        Object argument = call.argument(this.EVENT_START_DATE_ARGUMENT);
        Intrinsics.checkNotNull(argument);
        event.setEventStartDate((Long) argument);
        Object argument2 = call.argument(this.EVENT_END_DATE_ARGUMENT);
        Intrinsics.checkNotNull(argument2);
        event.setEventEndDate((Long) argument2);
        event.setEventStartTimeZone((String) call.argument(this.EVENT_START_TIMEZONE_ARGUMENT));
        event.setEventEndTimeZone((String) call.argument(this.EVENT_END_TIMEZONE_ARGUMENT));
        event.setEventLocation((String) call.argument(this.EVENT_LOCATION_ARGUMENT));
        event.setEventURL((String) call.argument(this.EVENT_URL_ARGUMENT));
        event.setAvailability(parseAvailability((String) call.argument(this.EVENT_AVAILABILITY_ARGUMENT)));
        event.setEventStatus(parseEventStatus((String) call.argument(this.EVENT_STATUS_ARGUMENT)));
        if (call.hasArgument(this.RECURRENCE_RULE_ARGUMENT) && call.argument(this.RECURRENCE_RULE_ARGUMENT) != null) {
            event.setRecurrenceRule(parseRecurrenceRuleArgs(call));
        }
        boolean hasArgument = call.hasArgument(this.ATTENDEES_ARGUMENT);
        String string2 = StubApp.getString2(5320);
        if (hasArgument && call.argument(this.ATTENDEES_ARGUMENT) != null) {
            event.setAttendees(new ArrayList());
            Object argument3 = call.argument(this.ATTENDEES_ARGUMENT);
            Intrinsics.checkNotNull(argument3);
            for (Map map : (List) argument3) {
                List<Attendee> attendees = event.getAttendees();
                Object obj = map.get(this.EMAIL_ADDRESS_ARGUMENT);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) map.get(this.NAME_ARGUMENT);
                Object obj2 = map.get(this.ROLE_ARGUMENT);
                Intrinsics.checkNotNull(obj2, string2);
                attendees.add(new Attendee((String) obj, str, ((Integer) obj2).intValue(), (Integer) map.get(this.ATTENDANCE_STATUS_ARGUMENT), null, null));
            }
        }
        if (call.hasArgument(this.REMINDERS_ARGUMENT) && call.argument(this.REMINDERS_ARGUMENT) != null) {
            event.setReminders(new ArrayList());
            Object argument4 = call.argument(this.REMINDERS_ARGUMENT);
            Intrinsics.checkNotNull(argument4);
            for (Map map2 : (List) argument4) {
                List<Reminder> reminders = event.getReminders();
                Object obj3 = map2.get(this.MINUTES_ARGUMENT);
                Intrinsics.checkNotNull(obj3, string2);
                reminders.add(new Reminder(((Integer) obj3).intValue()));
            }
        }
        return event;
    }

    private final EventStatus parseEventStatus(String value) {
        if (value == null || Intrinsics.areEqual(value, "NONE")) {
            return null;
        }
        return EventStatus.valueOf(value);
    }

    private final RecurrenceRule parseRecurrenceRuleArgs(MethodCall call) {
        List list;
        Object argument = call.argument(this.RECURRENCE_RULE_ARGUMENT);
        Intrinsics.checkNotNull(argument);
        Map map = (Map) argument;
        Object obj = map.get(this.RECURRENCE_FREQUENCY_ARGUMENT);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
        RecurrenceRule recurrenceRule = new RecurrenceRule(RecurrenceFrequency.values()[((Integer) obj).intValue()]);
        if (map.containsKey(this.TOTAL_OCCURRENCES_ARGUMENT)) {
            Object obj2 = map.get(this.TOTAL_OCCURRENCES_ARGUMENT);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            recurrenceRule.setTotalOccurrences((Integer) obj2);
        }
        if (map.containsKey(this.INTERVAL_ARGUMENT)) {
            Object obj3 = map.get(this.INTERVAL_ARGUMENT);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            recurrenceRule.setInterval((Integer) obj3);
        }
        if (map.containsKey(this.END_DATE_ARGUMENT)) {
            Object obj4 = map.get(this.END_DATE_ARGUMENT);
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Long");
            recurrenceRule.setEndDate((Long) obj4);
        }
        if (map.containsKey(this.DAYS_OF_WEEK_ARGUMENT)) {
            List list2 = (List) map.get(this.DAYS_OF_WEEK_ARGUMENT);
            List<DayOfWeek> list3 = null;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list2) {
                    if (obj5 instanceof Integer) {
                        arrayList.add(obj5);
                    }
                }
                list = CollectionsKt.toList(arrayList);
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(DayOfWeek.values()[((Number) it.next()).intValue()]);
                }
                list3 = CollectionsKt.toMutableList((Collection) arrayList2);
            }
            recurrenceRule.setDaysOfWeek(list3);
        }
        if (map.containsKey(this.DAY_OF_MONTH_ARGUMENT)) {
            Object obj6 = map.get(this.DAY_OF_MONTH_ARGUMENT);
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            recurrenceRule.setDayOfMonth((Integer) obj6);
        }
        if (map.containsKey(this.MONTH_OF_YEAR_ARGUMENT)) {
            Object obj7 = map.get(this.MONTH_OF_YEAR_ARGUMENT);
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
            recurrenceRule.setMonthOfYear((Integer) obj7);
        }
        if (map.containsKey(this.WEEK_OF_MONTH_ARGUMENT)) {
            Object obj8 = map.get(this.WEEK_OF_MONTH_ARGUMENT);
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
            recurrenceRule.setWeekOfMonth((Integer) obj8);
        }
        return recurrenceRule;
    }

    private final /* synthetic */ <T> List<T> toListOf(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t3 : list) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (t3 != null) {
                arrayList.add(t3);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    private final /* synthetic */ <T> List<T> toMutableListOf(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t3 : (List) obj) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (t3 != null) {
                arrayList.add(t3);
            }
        }
        List list = CollectionsKt.toList(arrayList);
        if (list != null) {
            return CollectionsKt.toMutableList((Collection) list);
        }
        return null;
    }

    @Override // eb.a
    public void onAttachedToActivity(b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        d dVar = (d) binding;
        this.activity = dVar.f8882a;
        Context context = this.context;
        Intrinsics.checkNotNull(context);
        CalendarDelegate calendarDelegate = new CalendarDelegate(binding, context);
        this._calendarDelegate = calendarDelegate;
        dVar.b(calendarDelegate);
    }

    @Override // db.InterfaceC0825b
    public void onAttachedToEngine(C0824a flutterPluginBinding) {
        Intrinsics.checkNotNullParameter(flutterPluginBinding, "flutterPluginBinding");
        this.context = flutterPluginBinding.f13553a;
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.f13554b, StubApp.getString2(9761));
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        Context context = this.context;
        Intrinsics.checkNotNull(context);
        this._calendarDelegate = new CalendarDelegate(null, context);
    }

    @Override // eb.a
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // eb.a
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
    }

    @Override // db.InterfaceC0825b
    public void onDetachedFromEngine(C0824a binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        String str = call.method;
        boolean areEqual = Intrinsics.areEqual(str, this.REQUEST_PERMISSIONS_METHOD);
        CalendarDelegate calendarDelegate = null;
        String string2 = StubApp.getString2(9762);
        if (areEqual) {
            CalendarDelegate calendarDelegate2 = this._calendarDelegate;
            if (calendarDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate2;
            }
            calendarDelegate.requestPermissions(result);
            return;
        }
        if (Intrinsics.areEqual(str, this.HAS_PERMISSIONS_METHOD)) {
            CalendarDelegate calendarDelegate3 = this._calendarDelegate;
            if (calendarDelegate3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate3;
            }
            calendarDelegate.hasPermissions(result);
            return;
        }
        if (Intrinsics.areEqual(str, this.RETRIEVE_CALENDARS_METHOD)) {
            CalendarDelegate calendarDelegate4 = this._calendarDelegate;
            if (calendarDelegate4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate4;
            }
            calendarDelegate.retrieveCalendars(result);
            return;
        }
        if (Intrinsics.areEqual(str, this.RETRIEVE_EVENTS_METHOD)) {
            String str2 = (String) call.argument(this.CALENDAR_ID_ARGUMENT);
            Long l9 = (Long) call.argument(this.START_DATE_ARGUMENT);
            Long l10 = (Long) call.argument(this.END_DATE_ARGUMENT);
            List<String> list = (List) call.argument(this.EVENT_IDS_ARGUMENT);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            CalendarDelegate calendarDelegate5 = this._calendarDelegate;
            if (calendarDelegate5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate5;
            }
            Intrinsics.checkNotNull(str2);
            calendarDelegate.retrieveEvents(str2, l9, l10, list, result);
            return;
        }
        if (Intrinsics.areEqual(str, this.CREATE_OR_UPDATE_EVENT_METHOD)) {
            String str3 = (String) call.argument(this.CALENDAR_ID_ARGUMENT);
            Event parseEventArgs = parseEventArgs(call, str3);
            CalendarDelegate calendarDelegate6 = this._calendarDelegate;
            if (calendarDelegate6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate6;
            }
            Intrinsics.checkNotNull(str3);
            calendarDelegate.createOrUpdateEvent(str3, parseEventArgs, result);
            return;
        }
        if (Intrinsics.areEqual(str, this.DELETE_EVENT_METHOD)) {
            String str4 = (String) call.argument(this.CALENDAR_ID_ARGUMENT);
            String str5 = (String) call.argument(this.EVENT_ID_ARGUMENT);
            CalendarDelegate calendarDelegate7 = this._calendarDelegate;
            if (calendarDelegate7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                calendarDelegate7 = null;
            }
            Intrinsics.checkNotNull(str4);
            Intrinsics.checkNotNull(str5);
            CalendarDelegate.deleteEvent$default(calendarDelegate7, str4, str5, result, null, null, null, 56, null);
            return;
        }
        if (Intrinsics.areEqual(str, this.DELETE_EVENT_INSTANCE_METHOD)) {
            String str6 = (String) call.argument(this.CALENDAR_ID_ARGUMENT);
            String str7 = (String) call.argument(this.EVENT_ID_ARGUMENT);
            Long l11 = (Long) call.argument(this.EVENT_START_DATE_ARGUMENT);
            Long l12 = (Long) call.argument(this.EVENT_END_DATE_ARGUMENT);
            Boolean bool = (Boolean) call.argument(this.FOLLOWING_INSTANCES);
            CalendarDelegate calendarDelegate8 = this._calendarDelegate;
            if (calendarDelegate8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate8;
            }
            Intrinsics.checkNotNull(str6);
            Intrinsics.checkNotNull(str7);
            calendarDelegate.deleteEvent(str6, str7, result, l11, l12, bool);
            return;
        }
        if (Intrinsics.areEqual(str, this.CREATE_CALENDAR_METHOD)) {
            String str8 = (String) call.argument(this.CALENDAR_NAME_ARGUMENT);
            String str9 = (String) call.argument(this.CALENDAR_COLOR_ARGUMENT);
            String str10 = (String) call.argument(this.LOCAL_ACCOUNT_NAME_ARGUMENT);
            CalendarDelegate calendarDelegate9 = this._calendarDelegate;
            if (calendarDelegate9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                calendarDelegate = calendarDelegate9;
            }
            Intrinsics.checkNotNull(str8);
            Intrinsics.checkNotNull(str10);
            calendarDelegate.createCalendar(str8, str9, str10, result);
            return;
        }
        if (!Intrinsics.areEqual(str, this.DELETE_CALENDAR_METHOD)) {
            result.notImplemented();
            return;
        }
        String str11 = (String) call.argument(this.CALENDAR_ID_ARGUMENT);
        CalendarDelegate calendarDelegate10 = this._calendarDelegate;
        if (calendarDelegate10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            calendarDelegate10 = null;
        }
        Intrinsics.checkNotNull(str11);
        CalendarDelegate.deleteCalendar$default(calendarDelegate10, str11, result, false, 4, null);
    }

    @Override // eb.a
    public void onReattachedToActivityForConfigChanges(b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        d dVar = (d) binding;
        this.activity = dVar.f8882a;
        Context context = this.context;
        Intrinsics.checkNotNull(context);
        CalendarDelegate calendarDelegate = new CalendarDelegate(binding, context);
        this._calendarDelegate = calendarDelegate;
        dVar.b(calendarDelegate);
    }
}
