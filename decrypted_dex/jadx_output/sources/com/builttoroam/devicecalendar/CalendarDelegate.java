package com.builttoroam.devicecalendar;

import Ab.c;
import Qb.C0208m0;
import Qb.D;
import Qb.K0;
import Qb.L;
import Qb.W;
import Rc.A;
import Rc.B;
import Rc.C;
import Rc.C0252a;
import Rc.C0253b;
import Rc.C0265n;
import Rc.EnumC0259h;
import Rc.K;
import Rc.M;
import Rc.N;
import Xa.h;
import Ya.d;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.CalendarContract;
import b3.C0510l;
import com.builttoroam.devicecalendar.common.Constants;
import com.builttoroam.devicecalendar.common.DayOfWeek;
import com.builttoroam.devicecalendar.common.RecurrenceFrequency;
import com.builttoroam.devicecalendar.models.Attendee;
import com.builttoroam.devicecalendar.models.Availability;
import com.builttoroam.devicecalendar.models.CalendarMethodsParametersCacheModel;
import com.builttoroam.devicecalendar.models.Event;
import com.builttoroam.devicecalendar.models.EventStatus;
import com.builttoroam.devicecalendar.models.RecurrenceRule;
import com.builttoroam.devicecalendar.models.Reminder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stub.StubApp;
import eb.b;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.BERTags;
import p0.AbstractC1482f;
import w.AbstractC1856e;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0016J)\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J?\u0010(\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b(\u0010)J'\u0010,\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b,\u0010-JI\u00100\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b0\u00101J+\u00102\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b2\u0010\u001dJ!\u00105\u001a\u00020\u00142\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010.\u001a\u00020#H\u0002¢\u0006\u0004\b5\u00106J/\u00109\u001a\u00020\u00142\f\u00108\u001a\b\u0012\u0004\u0012\u0002070&2\b\u0010.\u001a\u0004\u0018\u00010#2\u0006\u00104\u001a\u000203H\u0003¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020;2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u0004\u0018\u00010\b2\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010H\u001a\u0004\u0018\u00010\b2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bH\u0010IJ1\u0010L\u001a\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0&2\b\u0010.\u001a\u0004\u0018\u00010#2\b\u00104\u001a\u0004\u0018\u000103H\u0003¢\u0006\u0004\bL\u0010:J)\u0010N\u001a\u00020\u00142\u0006\u0010.\u001a\u00020#2\u0006\u0010M\u001a\u00020J2\b\u00104\u001a\u0004\u0018\u000103H\u0003¢\u0006\u0004\bN\u0010OJ)\u0010P\u001a\u00020\u00142\u0006\u0010.\u001a\u00020#2\u0006\u0010M\u001a\u00020J2\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\bP\u0010OJ\u000f\u0010Q\u001a\u00020\u000fH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b\u0015\u0010UJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010VJ\u001b\u0010Y\u001a\u0004\u0018\u00010\u001b2\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u0004\u0018\u00010*2\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\b[\u0010\\J\u001b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010]\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b_\u0010`J!\u0010c\u001a\u0004\u0018\u00010\b2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u000bH\u0002¢\u0006\u0004\bc\u0010dJ#\u0010f\u001a\u0004\u0018\u00010J2\u0006\u0010e\u001a\u00020\u001b2\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u0004\u0018\u0001072\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010k\u001a\u00020\u000f2\u0006\u0010j\u001a\u00020\bH\u0002¢\u0006\u0004\bk\u0010lJ/\u0010n\u001a\b\u0012\u0004\u0012\u00020J0m2\u0006\u0010e\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103H\u0003¢\u0006\u0004\bn\u0010oJ'\u0010p\u001a\b\u0012\u0004\u0012\u0002070m2\u0006\u0010.\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103H\u0003¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\b2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020\u0014\"\u0004\b\u0000\u0010t2\u0006\u0010u\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bv\u0010wJ)\u0010z\u001a\u00020\u00142\u0006\u0010x\u001a\u00020\u000b2\b\u0010y\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b|\u0010\u0016J\u0017\u0010~\u001a\u00020\u000f2\u0006\u0010}\u001a\u00020\bH\u0002¢\u0006\u0004\b~\u0010lJ\u001a\u0010\u0080\u0001\u001a\u00020\u000b2\u0006\u0010\u007f\u001a\u00020^H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J#\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010&2\u0006\u0010\u007f\u001a\u00020^H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J)\u0010\u0086\u0001\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010b\u001a\u00020\u000b2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010F2\u0007\u0010\u008a\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020\b8\u0002X\u0082D¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u0017\u0010\u0090\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008e\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008e\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008e\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008e\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0096\u0001R$\u0010\u009b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020S0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¥\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001¨\u0006§\u0001"}, d2 = {"Lcom/builttoroam/devicecalendar/CalendarDelegate;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Leb/b;", "binding", "Landroid/content/Context;", "context", "<init>", "(Leb/b;Landroid/content/Context;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Lio/flutter/plugin/common/MethodChannel$Result;", "pendingChannelResult", "", "requestPermissions", "(Lio/flutter/plugin/common/MethodChannel$Result;)V", "hasPermissions", "retrieveCalendars", "calendarId", "isInternalCall", "Lcom/builttoroam/devicecalendar/models/Calendar;", "deleteCalendar", "(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Z)Lcom/builttoroam/devicecalendar/models/Calendar;", "calendarName", "calendarColor", "localAccountName", "createCalendar", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "startDate", "endDate", "", "eventIds", "retrieveEvents", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lio/flutter/plugin/common/MethodChannel$Result;)V", "Lcom/builttoroam/devicecalendar/models/Event;", "event", "createOrUpdateEvent", "(Ljava/lang/String;Lcom/builttoroam/devicecalendar/models/Event;Lio/flutter/plugin/common/MethodChannel$Result;)V", "eventId", "followingInstances", "deleteEvent", "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "retrieveCalendar", "Landroid/content/ContentResolver;", "contentResolver", "deleteExistingReminders", "(Landroid/content/ContentResolver;J)V", "Lcom/builttoroam/devicecalendar/models/Reminder;", "reminders", "insertReminders", "(Ljava/util/List;Ljava/lang/Long;Landroid/content/ContentResolver;)V", "Landroid/content/ContentValues;", "buildEventContentValues", "(Lcom/builttoroam/devicecalendar/models/Event;Ljava/lang/String;)Landroid/content/ContentValues;", "timeZoneString", "Ljava/util/TimeZone;", "getTimeZone", "(Ljava/lang/String;)Ljava/util/TimeZone;", "Lcom/builttoroam/devicecalendar/models/Availability;", "availability", "getAvailability", "(Lcom/builttoroam/devicecalendar/models/Availability;)Ljava/lang/Integer;", "Lcom/builttoroam/devicecalendar/models/EventStatus;", "eventStatus", "getEventStatus", "(Lcom/builttoroam/devicecalendar/models/EventStatus;)Ljava/lang/Integer;", "Lcom/builttoroam/devicecalendar/models/Attendee;", "attendees", "insertAttendees", "attendee", "deleteAttendee", "(JLcom/builttoroam/devicecalendar/models/Attendee;Landroid/content/ContentResolver;)V", "updateAttendeeStatus", "arePermissionsGranted", "()Z", "Lcom/builttoroam/devicecalendar/models/CalendarMethodsParametersCacheModel;", "parameters", "(Lcom/builttoroam/devicecalendar/models/CalendarMethodsParametersCacheModel;)V", "(I)V", "Landroid/database/Cursor;", "cursor", "parseCalendarRow", "(Landroid/database/Cursor;)Lcom/builttoroam/devicecalendar/models/Calendar;", "parseEvent", "(Ljava/lang/String;Landroid/database/Cursor;)Lcom/builttoroam/devicecalendar/models/Event;", "recurrenceRuleString", "Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "parseRecurrenceRuleString", "(Ljava/lang/String;)Lcom/builttoroam/devicecalendar/models/RecurrenceRule;", "rfcRecurrenceRuleString", "partName", "convertCalendarPartToNumericValues", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "calendar", "parseAttendeeRow", "(Lcom/builttoroam/devicecalendar/models/Calendar;Landroid/database/Cursor;)Lcom/builttoroam/devicecalendar/models/Attendee;", "parseReminderRow", "(Landroid/database/Cursor;)Lcom/builttoroam/devicecalendar/models/Reminder;", "accessLevel", "isCalendarReadOnly", "(I)Z", "", "retrieveAttendees", "(Lcom/builttoroam/devicecalendar/models/Calendar;Ljava/lang/String;Landroid/content/ContentResolver;)Ljava/util/List;", "retrieveReminders", "(Ljava/lang/String;Landroid/content/ContentResolver;)Ljava/util/List;", "generateUniqueRequestCodeAndCacheParameters", "(Lcom/builttoroam/devicecalendar/models/CalendarMethodsParametersCacheModel;)I", "T", "result", "finishWithSuccess", "(Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V", "errorCode", "errorMessage", "finishWithError", "(Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V", "clearCachedParameters", "api", "atLeastAPI", "recurrenceRule", "buildRecurrenceRuleParams", "(Lcom/builttoroam/devicecalendar/models/RecurrenceRule;)Ljava/lang/String;", "LRc/M;", "buildByDayPart", "(Lcom/builttoroam/devicecalendar/models/RecurrenceRule;)Ljava/util/List;", "values", "addPartWithValues", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "parseAvailability", "(I)Lcom/builttoroam/devicecalendar/models/Availability;", "status", "parseEventStatus", "(I)Lcom/builttoroam/devicecalendar/models/EventStatus;", "RETRIEVE_CALENDARS_REQUEST_CODE", "I", "RETRIEVE_EVENTS_REQUEST_CODE", "RETRIEVE_CALENDAR_REQUEST_CODE", "CREATE_OR_UPDATE_EVENT_REQUEST_CODE", "DELETE_EVENT_REQUEST_CODE", "REQUEST_PERMISSIONS_REQUEST_CODE", "DELETE_CALENDAR_REQUEST_CODE", "PART_TEMPLATE", "Ljava/lang/String;", "BYMONTHDAY_PART", "BYMONTH_PART", "BYSETPOS_PART", "", "_cachedParametersMap", "Ljava/util/Map;", "_binding", "Leb/b;", "_context", "Landroid/content/Context;", "Lcom/google/gson/Gson;", "_gson", "Lcom/google/gson/Gson;", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n48#2,4:1007\n48#2,4:1011\n1549#3:1015\n1620#3,3:1016\n1549#3:1021\n1620#3,3:1022\n1603#3,9:1027\n1855#3:1036\n1856#3:1039\n1612#3:1040\n1549#3:1041\n1620#3,3:1042\n766#3:1045\n857#3,2:1046\n1603#3,9:1048\n1855#3:1057\n1856#3:1061\n1612#3:1062\n1549#3:1063\n1620#3,3:1064\n37#4,2:1019\n37#4,2:1025\n1#5:1037\n1#5:1038\n1#5:1060\n1282#6,2:1058\n*S KotlinDebug\n*F\n+ 1 CalendarDelegate.kt\ncom/builttoroam/devicecalendar/CalendarDelegate\n*L\n343#1:1007,4\n392#1:1011,4\n472#1:1015\n472#1:1016,3\n538#1:1021\n538#1:1022,3\n786#1:1027,9\n786#1:1036\n786#1:1039\n786#1:1040\n820#1:1041\n820#1:1042,3\n916#1:1045\n916#1:1046,2\n975#1:1048,9\n975#1:1057\n975#1:1061\n975#1:1062\n979#1:1063\n979#1:1064,3\n478#1:1019,2\n553#1:1025,2\n786#1:1038\n975#1:1060\n976#1:1058,2\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CalendarDelegate implements PluginRegistry.RequestPermissionsResultListener {
    private final String BYMONTHDAY_PART;
    private final String BYMONTH_PART;
    private final String BYSETPOS_PART;
    private final int CREATE_OR_UPDATE_EVENT_REQUEST_CODE;
    private final int DELETE_CALENDAR_REQUEST_CODE;
    private final int DELETE_EVENT_REQUEST_CODE;
    private final String PART_TEMPLATE;
    private final int REQUEST_PERMISSIONS_REQUEST_CODE;
    private final int RETRIEVE_CALENDARS_REQUEST_CODE;
    private final int RETRIEVE_CALENDAR_REQUEST_CODE;
    private final int RETRIEVE_EVENTS_REQUEST_CODE;
    private b _binding;
    private final Map<Integer, CalendarMethodsParametersCacheModel> _cachedParametersMap;
    private Context _context;
    private Gson _gson;
    private final Handler uiThreadHandler;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Availability.values().length];
            try {
                iArr[Availability.BUSY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Availability.FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Availability.TENTATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventStatus.values().length];
            try {
                iArr2[EventStatus.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EventStatus.TENTATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EventStatus.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC0259h.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RecurrenceFrequency.values().length];
            try {
                iArr4[RecurrenceFrequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[RecurrenceFrequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[RecurrenceFrequency.MONTHLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[RecurrenceFrequency.YEARLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public CalendarDelegate(b bVar, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = this.RETRIEVE_CALENDARS_REQUEST_CODE;
        this.RETRIEVE_EVENTS_REQUEST_CODE = i3 + 1;
        this.RETRIEVE_CALENDAR_REQUEST_CODE = i3 + 2;
        this.CREATE_OR_UPDATE_EVENT_REQUEST_CODE = i3 + 3;
        this.DELETE_EVENT_REQUEST_CODE = i3 + 4;
        this.REQUEST_PERMISSIONS_REQUEST_CODE = i3 + 5;
        this.DELETE_CALENDAR_REQUEST_CODE = i3 + 6;
        this.PART_TEMPLATE = StubApp.getString2(9670);
        this.BYMONTHDAY_PART = StubApp.getString2(9671);
        this.BYMONTH_PART = StubApp.getString2(9672);
        this.BYSETPOS_PART = StubApp.getString2(9673);
        this._cachedParametersMap = new LinkedHashMap();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this._binding = bVar;
        this._context = context;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(RecurrenceFrequency.class, new RecurrenceFrequencySerializer());
        gsonBuilder.registerTypeAdapter(DayOfWeek.class, new DayOfWeekSerializer());
        gsonBuilder.registerTypeAdapter(Availability.class, new AvailabilitySerializer());
        gsonBuilder.registerTypeAdapter(EventStatus.class, new EventStatusSerializer());
        this._gson = gsonBuilder.create();
    }

    private final String addPartWithValues(String str, String str2, Integer num) {
        if (num == null) {
            return str;
        }
        StringBuilder b2 = AbstractC1856e.b(str);
        String format = String.format(this.PART_TEMPLATE, Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        b2.append(format);
        b2.append(num);
        return b2.toString();
    }

    private final boolean arePermissionsGranted() {
        b bVar;
        if (atLeastAPI(23) && (bVar = this._binding) != null) {
            Intrinsics.checkNotNull(bVar);
            boolean z2 = ((d) bVar).f8882a.checkSelfPermission(StubApp.getString2(1808)) == 0;
            b bVar2 = this._binding;
            Intrinsics.checkNotNull(bVar2);
            boolean z10 = ((d) bVar2).f8882a.checkSelfPermission(StubApp.getString2(1809)) == 0;
            if (!z2 || !z10) {
                return false;
            }
        }
        return true;
    }

    private final boolean atLeastAPI(int api) {
        return api <= Build.VERSION.SDK_INT;
    }

    private final List<M> buildByDayPart(RecurrenceRule recurrenceRule) {
        List<DayOfWeek> daysOfWeek;
        Pc.b bVar;
        List<DayOfWeek> daysOfWeek2 = recurrenceRule.getDaysOfWeek();
        if ((daysOfWeek2 != null && daysOfWeek2.isEmpty()) || (daysOfWeek = recurrenceRule.getDaysOfWeek()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = daysOfWeek.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            DayOfWeek dayOfWeek = (DayOfWeek) it.next();
            Pc.b[] values = Pc.b.values();
            int length = values.length;
            while (true) {
                if (i3 >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i3];
                if (bVar.ordinal() == dayOfWeek.ordinal()) {
                    break;
                }
                i3++;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pc.b bVar2 = (Pc.b) it2.next();
            Integer weekOfMonth = recurrenceRule.getWeekOfMonth();
            arrayList2.add(new M(weekOfMonth != null ? weekOfMonth.intValue() : 0, bVar2));
        }
        return arrayList2;
    }

    private final ContentValues buildEventContentValues(Event event, String calendarId) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(9674), Boolean.valueOf(event.getEventAllDay()));
        Long eventStartDate = event.getEventStartDate();
        Intrinsics.checkNotNull(eventStartDate);
        contentValues.put(StubApp.getString2(2995), eventStartDate);
        contentValues.put(StubApp.getString2(9675), getTimeZone(event.getEventStartTimeZone()).getID());
        Long eventEndDate = event.getEventEndDate();
        Intrinsics.checkNotNull(eventEndDate);
        contentValues.put(StubApp.getString2(2996), eventEndDate);
        contentValues.put(StubApp.getString2(9676), getTimeZone(event.getEventEndTimeZone()).getID());
        contentValues.put(StubApp.getString2(616), event.getEventTitle());
        contentValues.put(StubApp.getString2(659), event.getEventDescription());
        contentValues.put(StubApp.getString2(2997), event.getEventLocation());
        contentValues.put(StubApp.getString2(9677), event.getEventURL());
        contentValues.put(StubApp.getString2(9678), calendarId);
        contentValues.put(StubApp.getString2(2091), (String) null);
        contentValues.put(StubApp.getString2(9679), getAvailability(event.getAvailability()));
        contentValues.put(StubApp.getString2(9680), getEventStatus(event.getEventStatus()));
        if (event.getRecurrenceRule() != null) {
            RecurrenceRule recurrenceRule = event.getRecurrenceRule();
            Intrinsics.checkNotNull(recurrenceRule);
            contentValues.put(StubApp.getString2(9681), buildRecurrenceRuleParams(recurrenceRule));
        }
        return contentValues;
    }

    private final String buildRecurrenceRuleParams(RecurrenceRule recurrenceRule) {
        EnumC0259h enumC0259h;
        int i3 = WhenMappings.$EnumSwitchMapping$3[recurrenceRule.getRecurrenceFrequency().ordinal()];
        if (i3 == 1) {
            enumC0259h = EnumC0259h.f6399d;
        } else if (i3 == 2) {
            enumC0259h = EnumC0259h.f6398c;
        } else if (i3 == 3) {
            enumC0259h = EnumC0259h.f6397b;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            enumC0259h = EnumC0259h.f6396a;
        }
        N n10 = new N(enumC0259h);
        if (recurrenceRule.getInterval() != null) {
            Integer interval = recurrenceRule.getInterval();
            Intrinsics.checkNotNull(interval);
            int intValue = interval.intValue();
            EnumMap enumMap = n10.f6392b;
            if (intValue > 1) {
                enumMap.put((EnumMap) K.f6362c, (C) interval);
            } else {
                if (intValue <= 0) {
                    throw new IllegalArgumentException(StubApp.getString2(9682));
                }
                enumMap.remove(K.f6362c);
            }
        }
        if (recurrenceRule.getRecurrenceFrequency() == RecurrenceFrequency.WEEKLY || (recurrenceRule.getWeekOfMonth() != null && (recurrenceRule.getRecurrenceFrequency() == RecurrenceFrequency.MONTHLY || recurrenceRule.getRecurrenceFrequency() == RecurrenceFrequency.YEARLY))) {
            List<M> buildByDayPart = buildByDayPart(recurrenceRule);
            EnumMap enumMap2 = n10.f6392b;
            if (buildByDayPart == null || buildByDayPart.size() == 0) {
                enumMap2.remove(K.f6369l);
            }
            enumMap2.put((EnumMap) K.f6369l, (C0265n) buildByDayPart);
        }
        if (recurrenceRule.getTotalOccurrences() != null) {
            Integer totalOccurrences = recurrenceRule.getTotalOccurrences();
            Intrinsics.checkNotNull(totalOccurrences);
            totalOccurrences.getClass();
            B b2 = K.f6381z;
            EnumMap enumMap3 = n10.f6392b;
            enumMap3.put((EnumMap) b2, (B) totalOccurrences);
            enumMap3.remove(K.f6380y);
        } else if (recurrenceRule.getEndDate() != null) {
            Calendar calendar = Calendar.getInstance();
            Long endDate = recurrenceRule.getEndDate();
            Intrinsics.checkNotNull(endDate);
            calendar.setTimeInMillis(endDate.longValue());
            new SimpleDateFormat(StubApp.getString2(9683)).setTimeZone(calendar.getTimeZone());
            TimeZone timeZone = calendar.getTimeZone();
            Long endDate2 = recurrenceRule.getEndDate();
            Intrinsics.checkNotNull(endDate2);
            n10.b(new Pc.a(Pc.a.f5649f, timeZone, endDate2.longValue()));
        }
        String n11 = n10.toString();
        Intrinsics.checkNotNullExpressionValue(n11, "toString(...)");
        if (recurrenceRule.getMonthOfYear() != null && recurrenceRule.getRecurrenceFrequency() == RecurrenceFrequency.YEARLY) {
            n11 = addPartWithValues(n11, this.BYMONTH_PART, recurrenceRule.getMonthOfYear());
        }
        return ((recurrenceRule.getRecurrenceFrequency() == RecurrenceFrequency.MONTHLY || recurrenceRule.getRecurrenceFrequency() == RecurrenceFrequency.YEARLY) && recurrenceRule.getWeekOfMonth() == null) ? addPartWithValues(n11, this.BYMONTHDAY_PART, recurrenceRule.getDayOfMonth()) : n11;
    }

    private final void clearCachedParameters(MethodChannel.Result pendingChannelResult) {
        Collection<CalendarMethodsParametersCacheModel> values = this._cachedParametersMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (Intrinsics.areEqual(((CalendarMethodsParametersCacheModel) obj).getPendingChannelResult(), pendingChannelResult)) {
                arrayList.add(obj);
            }
        }
        for (CalendarMethodsParametersCacheModel calendarMethodsParametersCacheModel : CollectionsKt.toList(arrayList)) {
            if (this._cachedParametersMap.containsKey(calendarMethodsParametersCacheModel.getOwnCacheKey())) {
                Map<Integer, CalendarMethodsParametersCacheModel> map = this._cachedParametersMap;
                TypeIntrinsics.asMutableMap(map).remove(calendarMethodsParametersCacheModel.getOwnCacheKey());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{com.stub.StubApp.getString2(2359)}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{com.stub.StubApp.getString2(321)}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer convertCalendarPartToNumericValues(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            int r4 = kotlin.text.StringsKt.x(r3, r4)
            r0 = -1
            if (r4 != r0) goto L8
            goto L80
        L8:
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r4 = 1262(0x4ee, float:1.768E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r0 = 0
            r1 = 6
            java.util.List r3 = kotlin.text.StringsKt.I(r3, r4, r0, r1)
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L80
            r4 = 2359(0x937, float:3.306E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r3 = kotlin.text.StringsKt.I(r3, r4, r0, r1)
            if (r3 == 0) goto L80
            java.lang.Object r3 = kotlin.collections.CollectionsKt.lastOrNull(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L80
            r4 = 321(0x141, float:4.5E-43)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r3 = kotlin.text.StringsKt.I(r3, r4, r0, r1)
            if (r3 == 0) goto L80
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt.f(r3)
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L61:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            goto L61
        L79:
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
        L80:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.builttoroam.devicecalendar.CalendarDelegate.convertCalendarPartToNumericValues(java.lang.String, java.lang.String):java.lang.Integer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOrUpdateEvent$lambda$5(CalendarDelegate calendarDelegate, Ref.ObjectRef objectRef, MethodChannel.Result result, Throwable th) {
        if (th == null) {
            calendarDelegate.uiThreadHandler.post(new c(calendarDelegate, objectRef, result, 7));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void createOrUpdateEvent$lambda$5$lambda$4(CalendarDelegate calendarDelegate, Ref.ObjectRef objectRef, MethodChannel.Result result) {
        calendarDelegate.finishWithSuccess(((Long) objectRef.element).toString(), result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void deleteAttendee(long eventId, Attendee attendee, ContentResolver contentResolver) {
        String[] strArr = {eventId + "", attendee.getEmailAddress()};
        if (contentResolver != null) {
            contentResolver.delete(CalendarContract.Attendees.CONTENT_URI, StubApp.getString2(9684), strArr);
        }
    }

    public static /* synthetic */ com.builttoroam.devicecalendar.models.Calendar deleteCalendar$default(CalendarDelegate calendarDelegate, String str, MethodChannel.Result result, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return calendarDelegate.deleteCalendar(str, result, z2);
    }

    public static /* synthetic */ void deleteEvent$default(CalendarDelegate calendarDelegate, String str, String str2, MethodChannel.Result result, Long l9, Long l10, Boolean bool, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            l9 = null;
        }
        if ((i3 & 16) != 0) {
            l10 = null;
        }
        if ((i3 & 32) != 0) {
            bool = null;
        }
        calendarDelegate.deleteEvent(str, str2, result, l9, l10, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteExistingReminders(ContentResolver contentResolver, long eventId) {
        Cursor query = CalendarContract.Reminders.query(contentResolver, eventId, new String[]{StubApp.getString2(2829)});
        while (query != null && query.moveToNext()) {
            long j = query.getLong(0);
            Uri withAppendedId = j > 0 ? ContentUris.withAppendedId(CalendarContract.Reminders.CONTENT_URI, j) : null;
            if (withAppendedId != null && contentResolver != null) {
                contentResolver.delete(withAppendedId, null, null);
            }
        }
        if (query != null) {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithError(String errorCode, String errorMessage, MethodChannel.Result pendingChannelResult) {
        pendingChannelResult.error(errorCode, errorMessage, null);
        clearCachedParameters(pendingChannelResult);
    }

    private final <T> void finishWithSuccess(T result, MethodChannel.Result pendingChannelResult) {
        pendingChannelResult.success(result);
        clearCachedParameters(pendingChannelResult);
    }

    private final synchronized int generateUniqueRequestCodeAndCacheParameters(CalendarMethodsParametersCacheModel parameters) {
        Comparable maxOrNull;
        int intValue;
        try {
            maxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) ((Iterable) this._cachedParametersMap.keySet()));
            Integer num = (Integer) maxOrNull;
            intValue = (num != null ? num.intValue() : 0) + 1;
            parameters.setOwnCacheKey(Integer.valueOf(intValue));
            this._cachedParametersMap.put(Integer.valueOf(intValue), parameters);
        } catch (Throwable th) {
            throw th;
        }
        return intValue;
    }

    private final Integer getAvailability(Availability availability) {
        int i3 = availability == null ? -1 : WhenMappings.$EnumSwitchMapping$0[availability.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? null : 2;
        }
        return 1;
    }

    private final Integer getEventStatus(EventStatus eventStatus) {
        int i3 = eventStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$1[eventStatus.ordinal()];
        if (i3 == 1) {
            return 1;
        }
        if (i3 != 2) {
            return i3 != 3 ? null : 2;
        }
        return 0;
    }

    private final TimeZone getTimeZone(String timeZoneString) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        TimeZone timeZone2 = TimeZone.getTimeZone(timeZoneString == null ? timeZone.getID() : timeZoneString);
        if (Intrinsics.areEqual(timeZone2.getID(), "GMT") && !Intrinsics.areEqual(timeZoneString, "GMT")) {
            timeZone2 = TimeZone.getTimeZone(timeZone.getID());
        }
        Intrinsics.checkNotNull(timeZone2);
        return timeZone2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void insertAttendees(List<Attendee> attendees, Long eventId, ContentResolver contentResolver) {
        if (attendees.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.f(attendees));
        for (Attendee attendee : attendees) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(StubApp.getString2(9685), attendee.getName());
            contentValues.put(StubApp.getString2(9686), attendee.getEmailAddress());
            contentValues.put(StubApp.getString2(9687), (Integer) 1);
            contentValues.put(StubApp.getString2(9688), Integer.valueOf(attendee.getRole()));
            contentValues.put(StubApp.getString2(9689), attendee.getAttendanceStatus());
            contentValues.put(StubApp.getString2(1060), eventId);
            arrayList.add(contentValues);
        }
        ContentValues[] contentValuesArr = (ContentValues[]) arrayList.toArray(new ContentValues[0]);
        if (contentResolver != null) {
            contentResolver.bulkInsert(CalendarContract.Attendees.CONTENT_URI, contentValuesArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void insertReminders(List<Reminder> reminders, Long eventId, ContentResolver contentResolver) {
        if (reminders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.f(reminders));
        for (Reminder reminder : reminders) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(StubApp.getString2(1060), eventId);
            contentValues.put(StubApp.getString2(9690), Integer.valueOf(reminder.getMinutes()));
            contentValues.put(StubApp.getString2(6738), (Integer) 1);
            arrayList.add(contentValues);
        }
        contentResolver.bulkInsert(CalendarContract.Reminders.CONTENT_URI, (ContentValues[]) arrayList.toArray(new ContentValues[0]));
    }

    private final boolean isCalendarReadOnly(int accessLevel) {
        return (accessLevel == 500 || accessLevel == 600 || accessLevel == 700 || accessLevel == 800) ? false : true;
    }

    private final Attendee parseAttendeeRow(com.builttoroam.devicecalendar.models.Calendar calendar, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String string = cursor.getString(3);
        Intrinsics.checkNotNull(string);
        return new Attendee(string, cursor.getString(2), cursor.getInt(4), Integer.valueOf(cursor.getInt(6)), Boolean.valueOf(cursor.getInt(5) == 2), Boolean.valueOf(Intrinsics.areEqual(string, calendar.getOwnerAccount())));
    }

    private final Availability parseAvailability(int availability) {
        if (availability == 0) {
            return Availability.BUSY;
        }
        if (availability == 1) {
            return Availability.FREE;
        }
        if (availability != 2) {
            return null;
        }
        return Availability.TENTATIVE;
    }

    private final com.builttoroam.devicecalendar.models.Calendar parseCalendarRow(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        long j = cursor.getLong(0);
        String string = cursor.getString(3);
        int i3 = cursor.getInt(5);
        int i10 = cursor.getInt(6);
        String string2 = cursor.getString(1);
        String string3 = cursor.getString(2);
        String string4 = cursor.getString(4);
        String valueOf = String.valueOf(j);
        Intrinsics.checkNotNull(string);
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(string3);
        com.builttoroam.devicecalendar.models.Calendar calendar = new com.builttoroam.devicecalendar.models.Calendar(valueOf, string, i10, string2, string3, string4);
        calendar.setReadOnly(isCalendarReadOnly(i3));
        if (atLeastAPI(17)) {
            calendar.setDefault(Intrinsics.areEqual(cursor.getString(7), "1"));
            return calendar;
        }
        calendar.setDefault(false);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Event parseEvent(String calendarId, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        long j3 = cursor.getLong(3);
        long j10 = cursor.getLong(4);
        String string3 = cursor.getString(7);
        boolean z2 = cursor.getInt(8) > 0;
        String string4 = cursor.getString(9);
        String string5 = cursor.getString(10);
        String string6 = cursor.getString(11);
        String string7 = cursor.getString(12);
        Availability parseAvailability = parseAvailability(cursor.getInt(13));
        EventStatus parseEventStatus = parseEventStatus(cursor.getInt(14));
        Event event = new Event();
        if (string == null) {
            string = StubApp.getString2(9691);
        }
        event.setEventTitle(string);
        event.setEventId(String.valueOf(j));
        event.setCalendarId(calendarId);
        event.setEventDescription(string2);
        event.setEventStartDate(Long.valueOf(j3));
        event.setEventEndDate(Long.valueOf(j10));
        event.setEventAllDay(z2);
        event.setEventLocation(string4);
        event.setEventURL(string5);
        event.setRecurrenceRule(parseRecurrenceRuleString(string3));
        event.setEventStartTimeZone(string6);
        event.setEventEndTimeZone(string7);
        event.setAvailability(parseAvailability);
        event.setEventStatus(parseEventStatus);
        return event;
    }

    private final EventStatus parseEventStatus(int status) {
        if (status == 0) {
            return EventStatus.TENTATIVE;
        }
        if (status == 1) {
            return EventStatus.CONFIRMED;
        }
        if (status != 2) {
            return null;
        }
        return EventStatus.CANCELED;
    }

    private final RecurrenceRule parseRecurrenceRuleString(String recurrenceRuleString) {
        DayOfWeek dayOfWeek;
        List<DayOfWeek> list = null;
        if (recurrenceRuleString == null) {
            return null;
        }
        N n10 = new N(recurrenceRuleString);
        EnumC0259h a3 = n10.a();
        int i3 = a3 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[a3.ordinal()];
        RecurrenceFrequency recurrenceFrequency = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? null : RecurrenceFrequency.DAILY : RecurrenceFrequency.WEEKLY : RecurrenceFrequency.MONTHLY : RecurrenceFrequency.YEARLY;
        Intrinsics.checkNotNull(recurrenceFrequency);
        RecurrenceRule recurrenceRule = new RecurrenceRule(recurrenceFrequency);
        B b2 = K.f6381z;
        if (((Integer) n10.f6392b.get(b2)) != null) {
            recurrenceRule.setTotalOccurrences((Integer) n10.f6392b.get(b2));
        }
        Integer num = (Integer) n10.f6392b.get(K.f6362c);
        recurrenceRule.setInterval(Integer.valueOf(num == null ? 1 : num.intValue()));
        A a9 = K.f6380y;
        if (((Pc.a) n10.f6392b.get(a9)) != null) {
            recurrenceRule.setEndDate(Long.valueOf(((Pc.a) n10.f6392b.get(a9)).a()));
        }
        EnumC0259h a10 = n10.a();
        int i10 = a10 != null ? WhenMappings.$EnumSwitchMapping$2[a10.ordinal()] : -1;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            List<M> list2 = (List) n10.f6392b.get(K.f6369l);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (M m4 : list2) {
                    DayOfWeek[] values = DayOfWeek.values();
                    int length = values.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            dayOfWeek = null;
                            break;
                        }
                        dayOfWeek = values[i11];
                        if (dayOfWeek.ordinal() == m4.f6386b.ordinal()) {
                            break;
                        }
                        i11++;
                    }
                    if (dayOfWeek != null) {
                        arrayList.add(dayOfWeek);
                    }
                }
                list = CollectionsKt.toMutableList((Collection) arrayList);
            }
            recurrenceRule.setDaysOfWeek(list);
        } else {
            recurrenceRule.setDaysOfWeek(null);
        }
        String n11 = n10.toString();
        Intrinsics.checkNotNullExpressionValue(n11, "toString(...)");
        EnumC0259h a11 = n10.a();
        C0253b c0253b = EnumC0259h.f6397b;
        C0252a c0252a = EnumC0259h.f6396a;
        if (a11 == c0253b || n10.a() == c0252a) {
            recurrenceRule.setWeekOfMonth(convertCalendarPartToNumericValues(n11, this.BYSETPOS_PART));
            if (recurrenceRule.getWeekOfMonth() == null) {
                C0265n c0265n = K.f6369l;
                if (((List) n10.f6392b.get(c0265n)) != null) {
                    List list3 = (List) n10.f6392b.get(c0265n);
                    Intrinsics.checkNotNullExpressionValue(list3, "getByDayPart(...)");
                    recurrenceRule.setWeekOfMonth(Integer.valueOf(((M) CollectionsKt.first(list3)).f6385a));
                }
            }
            recurrenceRule.setDayOfMonth(convertCalendarPartToNumericValues(n11, this.BYMONTHDAY_PART));
            if (n10.a() == c0252a) {
                recurrenceRule.setMonthOfYear(convertCalendarPartToNumericValues(n11, this.BYMONTH_PART));
            }
        }
        return recurrenceRule;
    }

    private final Reminder parseReminderRow(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new Reminder(cursor.getInt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final List<Attendee> retrieveAttendees(com.builttoroam.devicecalendar.models.Calendar calendar, String eventId, ContentResolver contentResolver) {
        ArrayList arrayList = new ArrayList();
        Cursor query = contentResolver != null ? contentResolver.query(CalendarContract.Attendees.CONTENT_URI, Constants.INSTANCE.getATTENDEE_PROJECTION(), h.n(StubApp.getString2(9692), ')', eventId), null, null) : null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    do {
                        Attendee parseAttendeeRow = parseAttendeeRow(calendar, query);
                        if (parseAttendeeRow != null) {
                            arrayList.add(parseAttendeeRow);
                        }
                    } while (query.moveToNext());
                }
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(query, null);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e4, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r1 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.builttoroam.devicecalendar.models.Calendar retrieveCalendar(java.lang.String r14, io.flutter.plugin.common.MethodChannel.Result r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.builttoroam.devicecalendar.CalendarDelegate.retrieveCalendar(java.lang.String, io.flutter.plugin.common.MethodChannel$Result, boolean):com.builttoroam.devicecalendar.models.Calendar");
    }

    public static /* synthetic */ com.builttoroam.devicecalendar.models.Calendar retrieveCalendar$default(CalendarDelegate calendarDelegate, String str, MethodChannel.Result result, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return calendarDelegate.retrieveCalendar(str, result, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retrieveEvents$lambda$2(Cursor cursor, CalendarDelegate calendarDelegate, List list, MethodChannel.Result result, Throwable th) {
        if (cursor != null) {
            cursor.close();
        }
        if (th == null) {
            calendarDelegate.uiThreadHandler.post(new c(calendarDelegate, list, result, 6));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void retrieveEvents$lambda$2$lambda$1(CalendarDelegate calendarDelegate, List list, MethodChannel.Result result) {
        Gson gson = calendarDelegate._gson;
        calendarDelegate.finishWithSuccess(gson != null ? gson.toJson(list) : null, result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final List<Reminder> retrieveReminders(String eventId, ContentResolver contentResolver) {
        ArrayList arrayList = new ArrayList();
        Cursor query = contentResolver != null ? contentResolver.query(CalendarContract.Reminders.CONTENT_URI, Constants.INSTANCE.getREMINDER_PROJECTION(), h.n(StubApp.getString2(9692), ')', eventId), null, null) : null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    do {
                        Reminder parseReminderRow = parseReminderRow(query);
                        if (parseReminderRow != null) {
                            arrayList.add(parseReminderRow);
                        }
                    } while (query.moveToNext());
                }
            } finally {
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(query, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAttendeeStatus(long eventId, Attendee attendee, ContentResolver contentResolver) {
        String[] strArr = {eventId + "", attendee.getEmailAddress()};
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(9689), attendee.getAttendanceStatus());
        if (contentResolver != null) {
            contentResolver.update(CalendarContract.Attendees.CONTENT_URI, contentValues, StubApp.getString2(9684), strArr);
        }
    }

    public final void createCalendar(String calendarName, String calendarColor, String localAccountName, MethodChannel.Result pendingChannelResult) {
        String replace$default;
        Intrinsics.checkNotNullParameter(calendarName, "calendarName");
        Intrinsics.checkNotNullParameter(localAccountName, "localAccountName");
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        Context context = this._context;
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        Uri.Builder appendQueryParameter = CalendarContract.Calendars.CONTENT_URI.buildUpon().appendQueryParameter(StubApp.getString2(9698), StubApp.getString2(6547));
        String string2 = StubApp.getString2(9699);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(string2, localAccountName);
        String string22 = StubApp.getString2(3012);
        String string23 = StubApp.getString2(9700);
        Uri build = appendQueryParameter2.appendQueryParameter(string22, string23).build();
        ContentValues contentValues = new ContentValues();
        contentValues.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), calendarName);
        contentValues.put(StubApp.getString2(3011), calendarName);
        contentValues.put(string2, localAccountName);
        contentValues.put(string22, string23);
        contentValues.put(StubApp.getString2(9701), (Integer) 700);
        if (calendarColor == null) {
            calendarColor = StubApp.getString2(9702);
        }
        replace$default = StringsKt__StringsJVMKt.replace$default(calendarColor, StubApp.getString2(463), StubApp.getString2(919), false, 4, (Object) null);
        contentValues.put(StubApp.getString2(9703), Integer.valueOf(Color.parseColor(replace$default)));
        contentValues.put(StubApp.getString2(9704), localAccountName);
        contentValues.put(StubApp.getString2(9705), Calendar.getInstance().getTimeZone().getID());
        Uri insert = contentResolver != null ? contentResolver.insert(build, contentValues) : null;
        String lastPathSegment = insert != null ? insert.getLastPathSegment() : null;
        Intrinsics.checkNotNull(lastPathSegment);
        finishWithSuccess(String.valueOf(Long.parseLong(lastPathSegment)), pendingChannelResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Long] */
    public final void createOrUpdateEvent(String calendarId, Event event, MethodChannel.Result pendingChannelResult) {
        Ref.ObjectRef objectRef;
        K0 j;
        Intrinsics.checkNotNullParameter(calendarId, "calendarId");
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        if (!arePermissionsGranted()) {
            CalendarMethodsParametersCacheModel calendarMethodsParametersCacheModel = new CalendarMethodsParametersCacheModel(pendingChannelResult, this.CREATE_OR_UPDATE_EVENT_REQUEST_CODE, calendarId, null, null, null, null, null, 248, null);
            calendarMethodsParametersCacheModel.setEvent(event);
            requestPermissions(calendarMethodsParametersCacheModel);
            return;
        }
        if (event == null) {
            finishWithError(StubApp.getString2(9669), StubApp.getString2(9706), pendingChannelResult);
            return;
        }
        com.builttoroam.devicecalendar.models.Calendar retrieveCalendar = retrieveCalendar(calendarId, pendingChannelResult, true);
        if (retrieveCalendar == null) {
            finishWithError(StubApp.getString2(9696), E1.a.j(StubApp.getString2(9707), calendarId), pendingChannelResult);
            return;
        }
        Context context = this._context;
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        ContentValues buildEventContentValues = buildEventContentValues(event, calendarId);
        CalendarDelegate$createOrUpdateEvent$$inlined$CoroutineExceptionHandler$1 calendarDelegate$createOrUpdateEvent$$inlined$CoroutineExceptionHandler$1 = new CalendarDelegate$createOrUpdateEvent$$inlined$CoroutineExceptionHandler$1(D.f5808a, this, pendingChannelResult);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        String eventId = event.getEventId();
        T longOrNull = eventId != null ? StringsKt.toLongOrNull(eventId) : 0;
        objectRef2.element = longOrNull;
        C0208m0 c0208m0 = C0208m0.f5881a;
        if (longOrNull == 0) {
            Uri insert = contentResolver != null ? contentResolver.insert(CalendarContract.Events.CONTENT_URI, buildEventContentValues) : null;
            String lastPathSegment = insert != null ? insert.getLastPathSegment() : null;
            Intrinsics.checkNotNull(lastPathSegment);
            objectRef2.element = Long.valueOf(Long.parseLong(lastPathSegment));
            objectRef = objectRef2;
            j = L.j(c0208m0, W.f5839b.plus(calendarDelegate$createOrUpdateEvent$$inlined$CoroutineExceptionHandler$1), new CalendarDelegate$createOrUpdateEvent$1(this, event, objectRef2, contentResolver, null), 2);
        } else {
            objectRef = objectRef2;
            j = L.j(c0208m0, W.f5839b.plus(calendarDelegate$createOrUpdateEvent$$inlined$CoroutineExceptionHandler$1), new CalendarDelegate$createOrUpdateEvent$2(contentResolver, objectRef, buildEventContentValues, this, retrieveCalendar, event, null), 2);
        }
        j.I(new C0510l(this, objectRef, pendingChannelResult, 1));
    }

    public final com.builttoroam.devicecalendar.models.Calendar deleteCalendar(String calendarId, MethodChannel.Result pendingChannelResult, boolean isInternalCall) {
        Intrinsics.checkNotNullParameter(calendarId, "calendarId");
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        if (isInternalCall || arePermissionsGranted()) {
            Long longOrNull = StringsKt.toLongOrNull(calendarId);
            if (longOrNull == null) {
                if (!isInternalCall) {
                    finishWithError(StubApp.getString2(9694), StubApp.getString2(9695), pendingChannelResult);
                }
                return null;
            }
            Context context = this._context;
            ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
            if (retrieveCalendar(calendarId, pendingChannelResult, true) != null) {
                Uri withAppendedId = ContentUris.withAppendedId(CalendarContract.Calendars.CONTENT_URI, longOrNull.longValue());
                Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(...)");
                finishWithSuccess(Boolean.valueOf((contentResolver != null ? contentResolver.delete(withAppendedId, null, null) : 0) > 0), pendingChannelResult);
            } else if (!isInternalCall) {
                finishWithError(StubApp.getString2(9696), E1.a.k(StubApp.getString2(9693), calendarId, StubApp.getString2(9697)), pendingChannelResult);
            }
        } else {
            requestPermissions(new CalendarMethodsParametersCacheModel(pendingChannelResult, this.DELETE_CALENDAR_REQUEST_CODE, calendarId, null, null, null, null, null, 248, null));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void deleteEvent(java.lang.String r22, java.lang.String r23, io.flutter.plugin.common.MethodChannel.Result r24, java.lang.Long r25, java.lang.Long r26, java.lang.Boolean r27) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.builttoroam.devicecalendar.CalendarDelegate.deleteEvent(java.lang.String, java.lang.String, io.flutter.plugin.common.MethodChannel$Result, java.lang.Long, java.lang.Long, java.lang.Boolean):void");
    }

    public final void hasPermissions(MethodChannel.Result pendingChannelResult) {
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        finishWithSuccess(Boolean.valueOf(arePermissionsGranted()), pendingChannelResult);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        CalendarMethodsParametersCacheModel calendarMethodsParametersCacheModel;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean z2 = !(grantResults.length == 0) && grantResults[0] == 0;
        if (!this._cachedParametersMap.containsKey(Integer.valueOf(requestCode)) || (calendarMethodsParametersCacheModel = this._cachedParametersMap.get(Integer.valueOf(requestCode))) == null) {
            return false;
        }
        try {
            if (!z2) {
                finishWithError(StubApp.getString2("9714"), StubApp.getString2("9715"), calendarMethodsParametersCacheModel.getPendingChannelResult());
                return false;
            }
            int calendarDelegateMethodCode = calendarMethodsParametersCacheModel.getCalendarDelegateMethodCode();
            if (calendarDelegateMethodCode == this.RETRIEVE_CALENDARS_REQUEST_CODE) {
                retrieveCalendars(calendarMethodsParametersCacheModel.getPendingChannelResult());
            } else if (calendarDelegateMethodCode == this.RETRIEVE_EVENTS_REQUEST_CODE) {
                retrieveEvents(calendarMethodsParametersCacheModel.getCalendarId(), calendarMethodsParametersCacheModel.getCalendarEventsStartDate(), calendarMethodsParametersCacheModel.getCalendarEventsEndDate(), calendarMethodsParametersCacheModel.getCalendarEventsIds(), calendarMethodsParametersCacheModel.getPendingChannelResult());
            } else if (calendarDelegateMethodCode == this.RETRIEVE_CALENDAR_REQUEST_CODE) {
                retrieveCalendar$default(this, calendarMethodsParametersCacheModel.getCalendarId(), calendarMethodsParametersCacheModel.getPendingChannelResult(), false, 4, null);
            } else if (calendarDelegateMethodCode == this.CREATE_OR_UPDATE_EVENT_REQUEST_CODE) {
                createOrUpdateEvent(calendarMethodsParametersCacheModel.getCalendarId(), calendarMethodsParametersCacheModel.getEvent(), calendarMethodsParametersCacheModel.getPendingChannelResult());
            } else if (calendarDelegateMethodCode == this.DELETE_EVENT_REQUEST_CODE) {
                deleteEvent$default(this, calendarMethodsParametersCacheModel.getCalendarId(), calendarMethodsParametersCacheModel.getEventId(), calendarMethodsParametersCacheModel.getPendingChannelResult(), null, null, null, 56, null);
            } else if (calendarDelegateMethodCode == this.REQUEST_PERMISSIONS_REQUEST_CODE) {
                finishWithSuccess(Boolean.valueOf(z2), calendarMethodsParametersCacheModel.getPendingChannelResult());
            } else if (calendarDelegateMethodCode == this.DELETE_CALENDAR_REQUEST_CODE) {
                deleteCalendar$default(this, calendarMethodsParametersCacheModel.getCalendarId(), calendarMethodsParametersCacheModel.getPendingChannelResult(), false, 4, null);
            }
            return true;
        } finally {
            this._cachedParametersMap.remove(Integer.valueOf(calendarMethodsParametersCacheModel.getCalendarDelegateMethodCode()));
        }
    }

    public final void requestPermissions(MethodChannel.Result pendingChannelResult) {
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        if (arePermissionsGranted()) {
            finishWithSuccess(Boolean.TRUE, pendingChannelResult);
            return;
        }
        requestPermissions(new CalendarMethodsParametersCacheModel(pendingChannelResult, this.REQUEST_PERMISSIONS_REQUEST_CODE, null, null, null, null, null, null, 252, null));
    }

    @SuppressLint({"MissingPermission"})
    public final void retrieveCalendars(MethodChannel.Result pendingChannelResult) {
        Cursor query;
        Cursor cursor;
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        if (!arePermissionsGranted()) {
            requestPermissions(new CalendarMethodsParametersCacheModel(pendingChannelResult, this.RETRIEVE_CALENDARS_REQUEST_CODE, null, null, null, null, null, null, 252, null));
            return;
        }
        Context context = this._context;
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        Uri CONTENT_URI = CalendarContract.Calendars.CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(CONTENT_URI, "CONTENT_URI");
        if (atLeastAPI(17)) {
            if (contentResolver != null) {
                query = contentResolver.query(CONTENT_URI, Constants.INSTANCE.getCALENDAR_PROJECTION(), null, null, null);
                cursor = query;
            }
            cursor = null;
        } else {
            if (contentResolver != null) {
                query = contentResolver.query(CONTENT_URI, Constants.INSTANCE.getCALENDAR_PROJECTION_OLDER_API(), null, null, null);
                cursor = query;
            }
            cursor = null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor != null) {
            try {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    com.builttoroam.devicecalendar.models.Calendar parseCalendarRow = parseCalendarRow(cursor);
                    if (parseCalendarRow != null) {
                        arrayList.add(parseCalendarRow);
                    }
                } catch (Exception e10) {
                    finishWithError(StubApp.getString2("9669"), e10.getMessage(), pendingChannelResult);
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
            } finally {
            }
        }
        Gson gson = this._gson;
        finishWithSuccess(gson != null ? gson.toJson(arrayList) : null, pendingChannelResult);
        if (cursor != null) {
            cursor.close();
        }
    }

    public final void retrieveEvents(String calendarId, Long startDate, Long endDate, List<String> eventIds, final MethodChannel.Result pendingChannelResult) {
        String joinToString$default;
        Intrinsics.checkNotNullParameter(calendarId, "calendarId");
        Intrinsics.checkNotNullParameter(eventIds, StubApp.getString2(9716));
        Intrinsics.checkNotNullParameter(pendingChannelResult, "pendingChannelResult");
        if (startDate == null && endDate == null && eventIds.isEmpty()) {
            finishWithError(StubApp.getString2(9694), StubApp.getString2(9717), pendingChannelResult);
            return;
        }
        if (!arePermissionsGranted()) {
            requestPermissions(new CalendarMethodsParametersCacheModel(pendingChannelResult, this.RETRIEVE_EVENTS_REQUEST_CODE, calendarId, startDate, endDate, null, null, null, BERTags.FLAGS, null));
            return;
        }
        com.builttoroam.devicecalendar.models.Calendar retrieveCalendar = retrieveCalendar(calendarId, pendingChannelResult, true);
        if (retrieveCalendar == null) {
            finishWithError(StubApp.getString2(9696), E1.a.j(StubApp.getString2(9707), calendarId), pendingChannelResult);
            return;
        }
        Context context = this._context;
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        Uri.Builder buildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        ContentUris.appendId(buildUpon, startDate != null ? startDate.longValue() : new Date(0L).getTime());
        ContentUris.appendId(buildUpon, endDate != null ? endDate.longValue() : new Date(LongCompanionObject.MAX_VALUE).getTime());
        Uri build = buildUpon.build();
        String n10 = h.n(StubApp.getString2(9718), ')', calendarId);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(9719));
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(eventIds, null, null, null, 0, null, null, 63, null);
        String k3 = AbstractC1482f.k(sb2, joinToString$default, StubApp.getString2(9720));
        String g10 = AbstractC1482f.g(n10, StubApp.getString2(9721));
        if (!eventIds.isEmpty()) {
            g10 = g10 + StubApp.getString2(9722) + k3 + ')';
        }
        final Cursor query = contentResolver != null ? contentResolver.query(build, Constants.INSTANCE.getEVENT_PROJECTION(), g10, null, StubApp.getString2(9723)) : null;
        final ArrayList arrayList = new ArrayList();
        L.j(C0208m0.f5881a, W.f5839b.plus(new CalendarDelegate$retrieveEvents$$inlined$CoroutineExceptionHandler$1(D.f5808a, this, pendingChannelResult)), new CalendarDelegate$retrieveEvents$1(query, this, calendarId, arrayList, retrieveCalendar, contentResolver, null), 2).I(new Function1() { // from class: com.builttoroam.devicecalendar.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit retrieveEvents$lambda$2;
                CalendarDelegate calendarDelegate = this;
                ArrayList arrayList2 = arrayList;
                retrieveEvents$lambda$2 = CalendarDelegate.retrieveEvents$lambda$2(query, calendarDelegate, arrayList2, pendingChannelResult, (Throwable) obj);
                return retrieveEvents$lambda$2;
            }
        });
    }

    private final void requestPermissions(CalendarMethodsParametersCacheModel parameters) {
        requestPermissions(generateUniqueRequestCodeAndCacheParameters(parameters));
    }

    private final void requestPermissions(int requestCode) {
        if (atLeastAPI(23)) {
            b bVar = this._binding;
            Intrinsics.checkNotNull(bVar);
            ((d) bVar).f8882a.requestPermissions(new String[]{StubApp.getString2(1808), StubApp.getString2(1809)}, requestCode);
        }
    }
}
