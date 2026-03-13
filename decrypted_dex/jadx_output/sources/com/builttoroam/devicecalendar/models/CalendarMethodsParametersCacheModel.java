package com.builttoroam.devicecalendar.models;

import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/builttoroam/devicecalendar/models/CalendarMethodsParametersCacheModel;", "", "pendingChannelResult", "Lio/flutter/plugin/common/MethodChannel$Result;", "calendarDelegateMethodCode", "", "calendarId", "", "calendarEventsStartDate", "", "calendarEventsEndDate", "calendarEventsIds", "", "eventId", "event", "Lcom/builttoroam/devicecalendar/models/Event;", "<init>", "(Lio/flutter/plugin/common/MethodChannel$Result;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lcom/builttoroam/devicecalendar/models/Event;)V", "getPendingChannelResult", "()Lio/flutter/plugin/common/MethodChannel$Result;", "getCalendarDelegateMethodCode", "()I", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getCalendarEventsStartDate", "()Ljava/lang/Long;", "setCalendarEventsStartDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCalendarEventsEndDate", "setCalendarEventsEndDate", "getCalendarEventsIds", "()Ljava/util/List;", "setCalendarEventsIds", "(Ljava/util/List;)V", "getEventId", "setEventId", "getEvent", "()Lcom/builttoroam/devicecalendar/models/Event;", "setEvent", "(Lcom/builttoroam/devicecalendar/models/Event;)V", "ownCacheKey", "getOwnCacheKey", "()Ljava/lang/Integer;", "setOwnCacheKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CalendarMethodsParametersCacheModel {
    private final int calendarDelegateMethodCode;
    private Long calendarEventsEndDate;
    private List<String> calendarEventsIds;
    private Long calendarEventsStartDate;
    private String calendarId;
    private Event event;
    private String eventId;
    private Integer ownCacheKey;
    private final MethodChannel.Result pendingChannelResult;

    public CalendarMethodsParametersCacheModel(MethodChannel.Result pendingChannelResult, int i3, String calendarId, Long l9, Long l10, List<String> calendarEventsIds, String eventId, Event event) {
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        Intrinsics.checkNotNullParameter(calendarId, "calendarId");
        Intrinsics.checkNotNullParameter(calendarEventsIds, "calendarEventsIds");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.pendingChannelResult = pendingChannelResult;
        this.calendarDelegateMethodCode = i3;
        this.calendarId = calendarId;
        this.calendarEventsStartDate = l9;
        this.calendarEventsEndDate = l10;
        this.calendarEventsIds = calendarEventsIds;
        this.eventId = eventId;
        this.event = event;
    }

    public final int getCalendarDelegateMethodCode() {
        return this.calendarDelegateMethodCode;
    }

    public final Long getCalendarEventsEndDate() {
        return this.calendarEventsEndDate;
    }

    public final List<String> getCalendarEventsIds() {
        return this.calendarEventsIds;
    }

    public final Long getCalendarEventsStartDate() {
        return this.calendarEventsStartDate;
    }

    public final String getCalendarId() {
        return this.calendarId;
    }

    public final Event getEvent() {
        return this.event;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Integer getOwnCacheKey() {
        return this.ownCacheKey;
    }

    public final MethodChannel.Result getPendingChannelResult() {
        return this.pendingChannelResult;
    }

    public final void setCalendarEventsEndDate(Long l9) {
        this.calendarEventsEndDate = l9;
    }

    public final void setCalendarEventsIds(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.calendarEventsIds = list;
    }

    public final void setCalendarEventsStartDate(Long l9) {
        this.calendarEventsStartDate = l9;
    }

    public final void setCalendarId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.calendarId = str;
    }

    public final void setEvent(Event event) {
        this.event = event;
    }

    public final void setEventId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventId = str;
    }

    public final void setOwnCacheKey(Integer num) {
        this.ownCacheKey = num;
    }

    public /* synthetic */ CalendarMethodsParametersCacheModel(MethodChannel.Result result, int i3, String str, Long l9, Long l10, List list, String str2, Event event, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(result, i3, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? null : l9, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? CollectionsKt.emptyList() : list, (i10 & 64) != 0 ? "" : str2, (i10 & 128) != 0 ? null : event);
    }
}
