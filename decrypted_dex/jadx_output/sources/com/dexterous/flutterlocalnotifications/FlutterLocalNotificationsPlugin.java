package com.dexterous.flutterlocalnotifications;

import C.A;
import C.AbstractC0025b;
import C.B;
import C.C0029f;
import C.C0033j;
import C.C0034k;
import C.C0036m;
import C.J;
import C.K;
import C.M;
import C.u;
import Xa.AbstractActivityC0364d;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class FlutterLocalNotificationsPlugin implements MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener, InterfaceC0825b, eb.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    static final int NOTIFICATION_POLICY_ACCESS_REQUEST_CODE = 4;
    static Gson gson;
    private Context applicationContext;
    private j callback;
    private MethodChannel channel;
    private Activity mainActivity;
    private h permissionRequestProgress = h.f11115a;
    private static final String ACTION_ID = StubApp.getString2(9793);
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = StubApp.getString2(9858);
    private static final String CALLBACK_HANDLE = StubApp.getString2(9834);
    private static final String CANCEL_ALL_METHOD = StubApp.getString2(9863);
    private static final String CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD = StubApp.getString2(9868);
    private static final String CANCEL_ID = StubApp.getString2(290);
    private static final String CANCEL_METHOD = StubApp.getString2(6385);
    static final String CANCEL_NOTIFICATION = StubApp.getString2(9782);
    private static final String CANCEL_TAG = StubApp.getString2(3514);
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = StubApp.getString2(9857);
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = StubApp.getString2(9861);
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = StubApp.getString2(9853);
    private static final String DEFAULT_ICON = StubApp.getString2(9832);
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = StubApp.getString2(9874);
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = StubApp.getString2(9856);
    private static final String DISPATCHER_HANDLE = StubApp.getString2(9833);
    private static final String DRAWABLE = StubApp.getString2(5102);
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = StubApp.getString2(9878);
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = StubApp.getString2(9879);
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = StubApp.getString2(9854);
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = StubApp.getString2(9803);
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = StubApp.getString2(9864);
    private static final String GET_CALLBACK_HANDLE_METHOD = StubApp.getString2(9860);
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = StubApp.getString2(9867);
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = StubApp.getString2(9823);
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = StubApp.getString2(9875);
    private static final String HAS_NOTIFICATION_POLICY_ACCESS_METHOD = StubApp.getString2(9872);
    private static final String INITIALIZE_METHOD = StubApp.getString2(9859);
    private static final String INPUT = StubApp.getString2(294);
    private static final String INPUT_RESULT = StubApp.getString2(743);
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = StubApp.getString2(9824);
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = StubApp.getString2(9880);
    private static final String INVALID_ICON_ERROR_CODE = StubApp.getString2(9825);
    private static final String INVALID_LARGE_ICON_ERROR_CODE = StubApp.getString2(9826);
    private static final String INVALID_LED_DETAILS_ERROR_CODE = StubApp.getString2(9828);
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = StubApp.getString2(9827);
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = StubApp.getString2(9881);
    private static final String INVALID_SOUND_ERROR_CODE = StubApp.getString2(9831);
    private static final String METHOD_CHANNEL = StubApp.getString2(9850);
    static String NOTIFICATION_DETAILS = StubApp.getString2(9882);
    static final String NOTIFICATION_ID = StubApp.getString2(9783);
    private static final String NOTIFICATION_LAUNCHED_APP = StubApp.getString2(9822);
    private static final String NOTIFICATION_RESPONSE_TYPE = StubApp.getString2(9797);
    static final String NOTIFICATION_TAG = StubApp.getString2(9784);
    static final String PAYLOAD = StubApp.getString2(1055);
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = StubApp.getString2(9869);
    private static final String PERIODICALLY_SHOW_METHOD = StubApp.getString2(9865);
    private static final String PERIODICALLY_SHOW_WITH_DURATION_METHOD = StubApp.getString2(9851);
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = StubApp.getString2(9883);
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = StubApp.getString2(9884);
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = StubApp.getString2(9871);
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = StubApp.getString2(9870);
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = StubApp.getString2(9873);
    private static final String REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD = StubApp.getString2(9852);
    private static final String SCHEDULED_NOTIFICATIONS = StubApp.getString2(9837);
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = StubApp.getString2(9792);
    private static final String SELECT_NOTIFICATION = StubApp.getString2(9791);
    private static final String SHARED_PREFERENCES_KEY = StubApp.getString2(9835);
    private static final String SHOW_METHOD = StubApp.getString2(9866);
    private static final String START_FOREGROUND_SERVICE = StubApp.getString2(9855);
    private static final String STOP_FOREGROUND_SERVICE = StubApp.getString2(9876);
    private static final String TAG = StubApp.getString2(9838);
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = StubApp.getString2(9808);
    private static final String ZONED_SCHEDULE_METHOD = StubApp.getString2(9862);

    public class a extends TypeToken<ArrayList<NotificationDetails>> {
    }

    private static void applyGrouping(NotificationDetails notificationDetails, C0036m c0036m) {
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            return;
        }
        c0036m.f877s = notificationDetails.groupKey;
        if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
            c0036m.f878t = true;
        }
        c0036m.f855G = notificationDetails.groupAlertBehavior.intValue();
    }

    private void areNotificationsEnabled(MethodChannel.Result result) {
        result.success(Boolean.valueOf(getNotificationManager(this.applicationContext).f810b.areNotificationsEnabled()));
    }

    public static Gson buildGson() {
        if (gson == null) {
            gson = new GsonBuilder().registerTypeAdapter(ScheduleMode.class, new ScheduleMode.Deserializer()).registerTypeAdapterFactory(RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class)).create();
        }
        return gson;
    }

    private static K buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        boolean value = BooleanUtils.getValue(personDetails.bot);
        Object obj = personDetails.icon;
        IconCompat iconFromSource = (obj == null || (iconSource = personDetails.iconBitmapSource) == null) ? null : getIconFromSource(context, obj, iconSource);
        boolean value2 = BooleanUtils.getValue(personDetails.important);
        String str = personDetails.key;
        if (str == null) {
            str = null;
        }
        String str2 = personDetails.name;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = personDetails.uri;
        String str4 = str3 != null ? str3 : null;
        K k3 = new K();
        k3.f811a = str2;
        k3.f812b = iconFromSource;
        k3.f813c = str4;
        k3.f814d = str;
        k3.f815e = value;
        k3.f816f = value2;
        return k3;
    }

    private static long calculateNextNotificationTrigger(long j, long j3) {
        while (j < System.currentTimeMillis()) {
            j += j3;
        }
        return j;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        if (notificationDetails.repeatIntervalMilliseconds != null) {
            return r0.intValue();
        }
        int i3 = f.f11111a[notificationDetails.repeatInterval.ordinal()];
        if (i3 == 1) {
            return 60000L;
        }
        if (i3 == 2) {
            return 3600000L;
        }
        if (i3 != 3) {
            return i3 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(StubApp.getString2(490))).getNotificationChannel(notificationChannelDetails.id);
        return Boolean.valueOf((!(notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) && (notificationChannel == null || notificationChannelDetails.channelAction != NotificationChannelAction.Update)) ? $assertionsDisabled : true);
    }

    private void cancel(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        cancelNotification((Integer) map.get(StubApp.getString2(290)), (String) map.get(StubApp.getString2(3514)));
        result.success(null);
    }

    private void cancelAllNotifications(MethodChannel.Result result) {
        getNotificationManager(this.applicationContext).f810b.cancelAll();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            result.success(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        result.success(null);
    }

    private void cancelAllPendingNotifications(MethodChannel.Result result) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            result.success(null);
            return;
        }
        AlarmManager alarmManager = getAlarmManager(this.applicationContext);
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            alarmManager.cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        result.success(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        J notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.a(num.intValue(), null);
        } else {
            notificationManager.a(num.intValue(), str);
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            bArr[i3] = (byte) ((Double) arrayList.get(i3)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                throw new g();
            }
        }
    }

    private static A createMessage(Context context, MessageDetails messageDetails) {
        String str;
        A a3 = new A(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            Uri parse = Uri.parse(str2);
            a3.f773e = str;
            a3.f774f = parse;
        }
        return a3;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        int i3;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(StubApp.getString2(9791));
        Integer num = notificationDetails.id;
        String string2 = StubApp.getString2(9783);
        launchIntent.putExtra(string2, num);
        String str = notificationDetails.payload;
        String string22 = StubApp.getString2(1055);
        launchIntent.putExtra(string22, str);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        C0036m c0036m = new C0036m(context, notificationDetails.channelId);
        c0036m.f864e = C0036m.c(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title);
        c0036m.f865f = C0036m.c(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body);
        c0036m.f857I.tickerText = C0036m.c(notificationDetails.ticker);
        c0036m.d(16, BooleanUtils.getValue(notificationDetails.autoCancel));
        c0036m.f866g = activity;
        c0036m.f869k = notificationDetails.priority.intValue();
        c0036m.d(2, BooleanUtils.getValue(notificationDetails.ongoing));
        c0036m.f858J = BooleanUtils.getValue(notificationDetails.silent);
        c0036m.d(8, BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        int i10 = 0;
        if (notificationDetails.actions != null) {
            int intValue = notificationDetails.id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconFromSource = (TextUtils.isEmpty(notificationAction.icon) || (iconSource = notificationAction.iconSource) == null) ? null : getIconFromSource(context, notificationAction.icon, iconSource);
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    intent.setAction(StubApp.getString2(9781));
                } else {
                    intent = getLaunchIntent(context);
                    intent.setAction(StubApp.getString2(9792));
                }
                intent.putExtra(string2, notificationDetails.id).putExtra(StubApp.getString2(9784), notificationDetails.tag).putExtra(StubApp.getString2(9793), notificationAction.id).putExtra(StubApp.getString2(9782), notificationAction.cancelNotification).putExtra(string22, notificationDetails.payload);
                List<G2.a> list = notificationAction.actionInputs;
                int i11 = (list == null || list.isEmpty()) ? 201326592 : Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i3 = intValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, intValue, intent, i11);
                } else {
                    i3 = intValue + 1;
                    broadcast = PendingIntent.getActivity(context, intValue, intent, i11);
                }
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), i10, spannableString.length(), i10);
                }
                C0029f c0029f = new C0029f(iconFromSource, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c0029f.f833i = bool3.booleanValue();
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c0029f.f832h = bool4.booleanValue();
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c0029f.f828d = bool5.booleanValue();
                }
                Integer num2 = notificationAction.semanticAction;
                if (num2 != null) {
                    c0029f.f831g = num2.intValue();
                }
                List<G2.a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (G2.a aVar : list2) {
                        HashSet hashSet = new HashSet();
                        Bundle bundle = new Bundle();
                        String str2 = aVar.f2375c;
                        Boolean bool6 = aVar.f2374b;
                        boolean booleanValue = bool6 != null ? bool6.booleanValue() : true;
                        List list3 = aVar.f2376d;
                        if (list3 != null) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                hashSet.add((String) it.next());
                            }
                        }
                        List list4 = aVar.f2373a;
                        M m4 = new M(str2, list4 != null ? (CharSequence[]) list4.toArray(new CharSequence[0]) : null, booleanValue, bundle, hashSet);
                        if (c0029f.f830f == null) {
                            c0029f.f830f = new ArrayList();
                        }
                        c0029f.f830f.add(m4);
                        i10 = 0;
                    }
                }
                int i12 = i10;
                if (BooleanUtils.getValue(notificationAction.invisible)) {
                    c0036m.f863d.add(c0029f.a());
                } else {
                    c0036m.f861b.add(c0029f.a());
                }
                intValue = i3;
                i10 = i12;
            }
        }
        int i13 = i10;
        setSmallIcon(context, notificationDetails, c0036m);
        Bitmap bitmapFromSource = getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource);
        c0036m.f868i = bitmapFromSource == null ? null : IconCompat.d(bitmapFromSource);
        Integer num3 = notificationDetails.color;
        if (num3 != null) {
            c0036m.f884z = num3.intValue();
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            c0036m.f880v = bool7.booleanValue();
            c0036m.f881w = true;
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            c0036m.f870l = BooleanUtils.getValue(bool8);
        }
        Long l9 = notificationDetails.when;
        if (l9 != null) {
            c0036m.f857I.when = l9.longValue();
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            c0036m.f871m = bool9.booleanValue();
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null) {
            boolean booleanValue2 = bool10.booleanValue();
            if (c0036m.f883y == null) {
                c0036m.f883y = new Bundle();
            }
            c0036m.f883y.putBoolean(StubApp.getString2(9794), booleanValue2);
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            c0036m.f867h = activity;
            c0036m.d(128, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            c0036m.f853E = notificationDetails.shortcutId;
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            c0036m.f873o = C0036m.c(notificationDetails.subText);
        }
        Integer num4 = notificationDetails.number;
        if (num4 != null) {
            c0036m.j = num4.intValue();
        }
        setVisibility(notificationDetails, c0036m);
        applyGrouping(notificationDetails, c0036m);
        setSound(context, notificationDetails, c0036m);
        setVibrationPattern(notificationDetails, c0036m);
        setLights(notificationDetails, c0036m);
        setStyle(context, notificationDetails, c0036m);
        setProgress(notificationDetails, c0036m);
        setCategory(notificationDetails, c0036m);
        setTimeoutAfter(notificationDetails, c0036m);
        Notification b2 = c0036m.b();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length;
            for (int i14 = i13; i14 < length; i14++) {
                b2.flags = iArr[i14] | b2.flags;
            }
        }
        return b2;
    }

    private void createNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) methodCall.arguments()));
        result.success(null);
    }

    private void createNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) methodCall.arguments());
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490));
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.id, from.name);
        notificationChannelGroup.setDescription(from.description);
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        result.success(null);
    }

    private void deleteNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        ((NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490))).deleteNotificationChannel((String) methodCall.arguments());
        result.success(null);
    }

    private void deleteNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        ((NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490))).deleteNotificationChannelGroup((String) methodCall.arguments());
        result.success(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        IconSource iconSource;
        String resourceEntryName;
        if (iconCompat == null) {
            return null;
        }
        int i3 = iconCompat.f9662a;
        if (i3 == -1) {
            i3 = ((Icon) iconCompat.f9663b).getType();
        }
        if (i3 == 2) {
            iconSource = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.f());
        } else {
            if (i3 != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.g().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(376), Integer.valueOf(iconSource.ordinal()));
        hashMap.put(StubApp.getString2(1485), resourceEntryName);
        return hashMap;
    }

    private Map<String, Object> describePerson(K k3) {
        if (k3 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(728), k3.f814d);
        hashMap.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), k3.f811a);
        hashMap.put(StubApp.getString2(614), k3.f813c);
        hashMap.put(StubApp.getString2(9795), Boolean.valueOf(k3.f815e));
        hashMap.put(StubApp.getString2(9796), Boolean.valueOf(k3.f816f));
        hashMap.put(StubApp.getString2(727), describeIcon(k3.f812b));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(MethodChannel.Result result, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(result, from.icon) || hasInvalidLargeIcon(result, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(result, from) || hasInvalidRawSoundResource(result, from) || hasInvalidLedDetails(result, from)) {
            return null;
        }
        return from;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        String string2 = StubApp.getString2(9783);
        int intExtra = intent.getIntExtra(string2, 0);
        HashMap hashMap = new HashMap();
        hashMap.put(string2, Integer.valueOf(intExtra));
        String string22 = StubApp.getString2(9784);
        hashMap.put(string22, intent.getStringExtra(string22));
        String string23 = StubApp.getString2(9793);
        hashMap.put(string23, intent.getStringExtra(string23));
        String string24 = StubApp.getString2(1055);
        hashMap.put(string24, intent.getStringExtra(string24));
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            hashMap.put(StubApp.getString2(294), resultsFromIntent.getString(StubApp.getString2(743)));
        }
        boolean equals = StubApp.getString2(9791).equals(intent.getAction());
        String string25 = StubApp.getString2(9797);
        if (equals) {
            hashMap.put(string25, 0);
        }
        if (StubApp.getString2(9792).equals(intent.getAction())) {
            hashMap.put(string25, 1);
        }
        return hashMap;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Html.fromHtml(str, 0);
    }

    private void getActiveNotificationMessagingStyle(MethodCall methodCall, MethodChannel.Result result) {
        Notification notification;
        String string2 = StubApp.getString2(703);
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490));
        try {
            Map map = (Map) methodCall.arguments();
            int intValue = ((Integer) map.get(StubApp.getString2("290"))).intValue();
            String str = (String) map.get(StubApp.getString2("3514"));
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() != intValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                }
                notification = statusBarNotification.getNotification();
            }
            notification = null;
            if (notification == null) {
                result.success(null);
                return;
            }
            B e10 = B.e(notification);
            if (e10 == null) {
                result.success(null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(StubApp.getString2("9798"), Boolean.valueOf(e10.f()));
            hashMap.put(string2, describePerson(e10.f777g));
            hashMap.put(StubApp.getString2("9799"), e10.f778h);
            ArrayList arrayList = new ArrayList();
            Iterator it = e10.f775e.iterator();
            while (it.hasNext()) {
                A a3 = (A) it.next();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(StubApp.getString2("613"), a3.f769a);
                hashMap2.put(StubApp.getString2("1350"), Long.valueOf(a3.f770b));
                hashMap2.put(string2, describePerson(a3.f771c));
                Uri uri = a3.f774f;
                if (uri != null) {
                    hashMap2.put(StubApp.getString2("9800"), uri.toString());
                }
                String str2 = a3.f773e;
                if (str2 != null) {
                    hashMap2.put(StubApp.getString2("9801"), str2);
                }
                arrayList.add(hashMap2);
            }
            hashMap.put(StubApp.getString2("9802"), arrayList);
            result.success(hashMap);
        } catch (Throwable th) {
            result.error(StubApp.getString2(9803), th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(MethodChannel.Result result) {
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490))).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2("290"), Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                hashMap.put(StubApp.getString2("9804"), notification.getChannelId());
                hashMap.put(StubApp.getString2("3514"), statusBarNotification.getTag());
                hashMap.put(StubApp.getString2("9805"), notification.getGroup());
                hashMap.put(StubApp.getString2("616"), notification.extras.getCharSequence(StubApp.getString2("3680")));
                hashMap.put(StubApp.getString2("9806"), notification.extras.getCharSequence(StubApp.getString2("813")));
                hashMap.put(StubApp.getString2("9807"), notification.extras.getCharSequence(StubApp.getString2("716")));
                arrayList.add(hashMap);
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(StubApp.getString2(9808), th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService(StubApp.getString2(1822));
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i3, Intent intent) {
        return PendingIntent.getBroadcast(context, i3, intent, 201326592);
    }

    private void getCallbackHandle(MethodChannel.Result result) {
        result.success(Long.valueOf(this.applicationContext.getSharedPreferences(StubApp.getString2(9787), 0).getLong(StubApp.getString2(9809), -1L)));
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, StubApp.getString2(5102), context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i3 = f.f11112b[iconSource.ordinal()];
        if (i3 == 1) {
            int drawableResourceId = getDrawableResourceId(context, (String) obj);
            PorterDuff.Mode mode = IconCompat.f9661k;
            context.getClass();
            return IconCompat.e(context.getResources(), context.getPackageName(), drawableResourceId);
        }
        if (i3 == 2) {
            return IconCompat.d(BitmapFactory.decodeFile((String) obj));
        }
        if (i3 == 3) {
            String str = (String) obj;
            PorterDuff.Mode mode2 = IconCompat.f9661k;
            str.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f9663b = str;
            return iconCompat;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                return null;
            }
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            int length = castObjectToByteArray.length;
            IconCompat iconCompat2 = new IconCompat(3);
            iconCompat2.f9663b = castObjectToByteArray;
            iconCompat2.f9666e = 0;
            iconCompat2.f9667f = length;
            return iconCompat2;
        }
        try {
            AssetFileDescriptor openFd = context.getAssets().openFd(((bb.d) Q2.g.H().f5711b).b((String) obj));
            FileInputStream createInputStream = openFd.createInputStream();
            IconCompat d8 = IconCompat.d(BitmapFactory.decodeStream(createInputStream));
            createInputStream.close();
            openFd.close();
            return d8;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(StubApp.getString2(290), notificationChannel.getId());
        hashMap.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), notificationChannel.getName());
        hashMap.put(StubApp.getString2(659), notificationChannel.getDescription());
        hashMap.put(StubApp.getString2(9810), notificationChannel.getGroup());
        hashMap.put(StubApp.getString2(9811), Boolean.valueOf(notificationChannel.canShowBadge()));
        hashMap.put(StubApp.getString2(2644), Integer.valueOf(notificationChannel.getImportance()));
        Uri sound = notificationChannel.getSound();
        String string2 = StubApp.getString2(9812);
        String string22 = StubApp.getString2(5841);
        if (sound == null) {
            hashMap.put(string22, null);
            hashMap.put(string2, Boolean.FALSE);
        } else {
            hashMap.put(string2, Boolean.TRUE);
            List asList = Arrays.asList(SoundSource.values());
            boolean equals = sound.getScheme().equals(StubApp.getString2(9813));
            String string23 = StubApp.getString2(9814);
            if (equals) {
                String str = sound.toString().split(StubApp.getString2(601))[r1.length - 1];
                Integer tryParseInt = tryParseInt(str);
                if (tryParseInt == null) {
                    hashMap.put(string23, Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    hashMap.put(string22, str);
                } else {
                    try {
                        String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue());
                        if (resourceEntryName != null) {
                            hashMap.put(string23, Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                            hashMap.put(string22, resourceEntryName);
                        }
                    } catch (Exception unused) {
                        hashMap.put(string22, null);
                        hashMap.put(string2, Boolean.FALSE);
                    }
                }
            } else {
                hashMap.put(string23, Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                hashMap.put(string22, sound.toString());
            }
        }
        hashMap.put(StubApp.getString2(9815), Boolean.valueOf(notificationChannel.canBypassDnd()));
        hashMap.put(StubApp.getString2(9816), Boolean.valueOf(notificationChannel.shouldVibrate()));
        hashMap.put(StubApp.getString2(9817), notificationChannel.getVibrationPattern());
        hashMap.put(StubApp.getString2(9818), Boolean.valueOf(notificationChannel.shouldShowLights()));
        hashMap.put(StubApp.getString2(9819), Integer.valueOf(notificationChannel.getLightColor()));
        AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
        hashMap.put(StubApp.getString2(9820), Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        return hashMap;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        }
        if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
            return null;
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
        ZonedDateTime now = ZonedDateTime.now(of);
        ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
        while (of3.isBefore(now)) {
            of3 = of3.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                of3 = of3.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                of3 = of3.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        }
        while (true) {
            if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
            }
            of3 = of3.plusDays(1L);
        }
    }

    private void getNotificationAppLaunchDetails(MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            boolean z2 = (intent == null || !(StubApp.getString2(9791).equals(intent.getAction()) || StubApp.getString2(9792).equals(intent.getAction())) || launchedActivityFromHistory(intent)) ? $assertionsDisabled : true;
            Boolean valueOf = Boolean.valueOf(z2);
            if (z2) {
                hashMap.put(StubApp.getString2(9821), extractNotificationResponseMap(intent));
            }
            bool = valueOf;
        }
        hashMap.put(StubApp.getString2(9822), bool);
        result.success(hashMap);
    }

    private void getNotificationChannels(MethodChannel.Result result) {
        try {
            List<NotificationChannel> notificationChannels = getNotificationManager(this.applicationContext).f810b.getNotificationChannels();
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = notificationChannels.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(it.next()));
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(StubApp.getString2(9823), th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static J getNotificationManager(Context context) {
        return new J(context);
    }

    private boolean hasInvalidBigPictureResources(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.style == NotificationStyle.BigPicture) {
            BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
            if (hasInvalidLargeIcon(result, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
                return true;
            }
            BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
            if (bitmapSource == BitmapSource.DrawableResource) {
                String str = (String) bigPictureStyleInformation.bigPicture;
                if (!StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, result, StubApp.getString2(9824))) {
                    return $assertionsDisabled;
                }
                return true;
            }
            if (bitmapSource == BitmapSource.FilePath) {
                return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
            }
            if (bitmapSource == BitmapSource.ByteArray) {
                byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
                if (bArr == null || bArr.length == 0) {
                    return true;
                }
                return $assertionsDisabled;
            }
        }
        return $assertionsDisabled;
    }

    private boolean hasInvalidIcon(MethodChannel.Result result, String str) {
        if (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, result, StubApp.getString2(9825))) {
            return $assertionsDisabled;
        }
        return true;
    }

    private boolean hasInvalidLargeIcon(MethodChannel.Result result, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            if (bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0) {
                return true;
            }
            return $assertionsDisabled;
        }
        String str = (String) obj;
        if (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, result, StubApp.getString2(9826))) {
            return $assertionsDisabled;
        }
        return true;
    }

    private boolean hasInvalidLedDetails(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return $assertionsDisabled;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return $assertionsDisabled;
        }
        result.error(StubApp.getString2(9828), StubApp.getString2(9827), null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            return $assertionsDisabled;
        }
        SoundSource soundSource = notificationDetails.soundSource;
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            return $assertionsDisabled;
        }
        if (this.applicationContext.getResources().getIdentifier(notificationDetails.sound, StubApp.getString2(5108), this.applicationContext.getPackageName()) != 0) {
            return $assertionsDisabled;
        }
        result.error(StubApp.getString2(9831), E1.a.k(StubApp.getString2(9829), notificationDetails.sound, StubApp.getString2(9830)), null);
        return true;
    }

    private void initialize(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        String string2 = StubApp.getString2(9832);
        String str = (String) map.get(string2);
        if (isValidDrawableResource(this.applicationContext, str, result, StubApp.getString2(9825))) {
            Long o5 = Tc.d.o(methodCall.argument(StubApp.getString2(9833)));
            Long o10 = Tc.d.o(methodCall.argument(StubApp.getString2(9834)));
            if (o5 != null && o10 != null) {
                Context context = this.applicationContext;
                String string22 = StubApp.getString2(9787);
                context.getSharedPreferences(string22, 0).edit().putLong(StubApp.getString2(9788), o5.longValue()).apply();
                context.getSharedPreferences(string22, 0).edit().putLong(StubApp.getString2(9809), o10.longValue()).apply();
            }
            this.applicationContext.getSharedPreferences(StubApp.getString2(9835), 0).edit().putString(string2, str).apply();
            result.success(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, MethodChannel.Result result, String str2) {
        if (context.getResources().getIdentifier(str, StubApp.getString2(5102), context.getPackageName()) != 0) {
            return true;
        }
        result.error(str2, E1.a.k(StubApp.getString2(9829), str, StubApp.getString2(9836)), null);
        return $assertionsDisabled;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        if (intent == null || (intent.getFlags() & PKIFailureInfo.badCertTemplate) != 1048576) {
            return $assertionsDisabled;
        }
        return true;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string2 = StubApp.getString2(9837);
        String string = context.getSharedPreferences(string2, 0).getString(string2, null);
        return string != null ? (ArrayList) buildGson().fromJson(string, new a().getType()) : arrayList;
    }

    private void pendingNotificationRequests(MethodChannel.Result result) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(StubApp.getString2(290), next.id);
            hashMap.put(StubApp.getString2(616), next.title);
            hashMap.put(StubApp.getString2(9806), next.body);
            hashMap.put(StubApp.getString2(1055), next.payload);
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(StubApp.getString2(9782), $assertionsDisabled)) {
            new J(this.applicationContext).a(((Integer) map.get(StubApp.getString2(9783))).intValue(), null);
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                result.success(null);
            } catch (g e10) {
                result.error(e10.f11114a, e10.getMessage(), null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            longValue = calendar.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String json = buildGson().toJson(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, json);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
            } catch (g e10) {
                Log.e(StubApp.getString2(9838), e10.getMessage());
                removeNotificationFromCache(context, next.id);
            }
            if (next.repeatInterval == null && next.repeatIntervalMilliseconds == null) {
                if (next.timeZoneName != null) {
                    zonedScheduleNotification(context, next, Boolean.FALSE);
                } else {
                    scheduleNotification(context, next, Boolean.FALSE);
                }
            }
            repeatNotification(context, next, Boolean.FALSE);
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse(StubApp.getString2(5109) + context.getPackageName() + StubApp.getString2(5110) + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        String json = buildGson().toJson(arrayList);
        String string2 = StubApp.getString2(9837);
        context.getSharedPreferences(string2, 0).edit().putString(string2, json).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
                return;
            }
            if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
                return;
            }
            if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                removeNotificationFromCache(context, notificationDetails.id);
                return;
            }
            scheduleNextRepeatingNotification(context, notificationDetails);
        } catch (g e10) {
            Log.e(StubApp.getString2(9838), e10.getMessage());
            removeNotificationFromCache(context, notificationDetails.id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String json = buildGson().toJson(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, json);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String json = buildGson().toJson(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, json);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        boolean equals = StubApp.getString2(9791).equals(intent.getAction());
        String string2 = StubApp.getString2(9792);
        if (!equals && !string2.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> extractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (string2.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap);
        }
        this.channel.invokeMethod(StubApp.getString2(9839), extractNotificationResponseMap);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, C0036m c0036m) {
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        C0033j c0033j = new C0033j();
        if (bigPictureStyleInformation.contentTitle != null) {
            c0033j.f781b = C0036m.c(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            c0033j.f782c = C0036m.c(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
            c0033j.f783d = true;
        }
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            c0033j.f844f = null;
            c0033j.f845g = true;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                Bitmap bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
                c0033j.f844f = bitmapFromSource == null ? null : IconCompat.d(bitmapFromSource);
                c0033j.f845g = true;
            }
        }
        Bitmap bitmapFromSource2 = getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource);
        c0033j.f843e = bitmapFromSource2 != null ? IconCompat.d(bitmapFromSource2) : null;
        c0036m.g(c0033j);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, C0036m c0036m) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C0034k c0034k = new C0034k(0);
        if (bigTextStyleInformation.bigText != null) {
            c0034k.f848f = C0036m.c(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            c0034k.f781b = C0036m.c(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            c0034k.f782c = C0036m.c(bigTextStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigTextStyleInformation.summaryText) : bigTextStyleInformation.summaryText);
            c0034k.f783d = true;
        }
        c0036m.g(c0034k);
    }

    private void setCanScheduleExactNotifications(MethodChannel.Result result) {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT < 31) {
            result.success(Boolean.TRUE);
        } else {
            canScheduleExactAlarms = getAlarmManager(this.applicationContext).canScheduleExactAlarms();
            result.success(Boolean.valueOf(canScheduleExactAlarms));
        }
    }

    private static void setCategory(NotificationDetails notificationDetails, C0036m c0036m) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        c0036m.f882x = str;
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, C0036m c0036m) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        C0034k c0034k = new C0034k(1);
        if (inboxStyleInformation.contentTitle != null) {
            c0034k.f781b = C0036m.c(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            c0034k.f782c = C0036m.c(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
            c0034k.f783d = true;
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CharSequence charSequence = next;
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    charSequence = fromHtml(next);
                }
                if (charSequence != null) {
                    ((ArrayList) c0034k.f848f).add(C0036m.c(charSequence));
                }
            }
        }
        c0036m.g(c0034k);
    }

    private static void setLights(NotificationDetails notificationDetails, C0036m c0036m) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        int intValue = notificationDetails.ledColor.intValue();
        int intValue2 = notificationDetails.ledOnMs.intValue();
        int intValue3 = notificationDetails.ledOffMs.intValue();
        Notification notification = c0036m.f857I;
        notification.ledARGB = intValue;
        notification.ledOnMS = intValue2;
        notification.ledOffMS = intValue3;
        notification.flags = ((intValue2 == 0 || intValue3 == 0) ? 0 : 1) | (notification.flags & (-2));
    }

    private static void setMediaStyle(C0036m c0036m) {
        c0036m.g(new u(1));
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, C0036m c0036m) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        B b2 = new B(buildPerson(context, messagingStyleInformation.person));
        b2.f779i = Boolean.valueOf(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            b2.f778h = str;
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                A createMessage = createMessage(context, it.next());
                if (createMessage != null) {
                    ArrayList arrayList2 = b2.f775e;
                    arrayList2.add(createMessage);
                    if (arrayList2.size() > 25) {
                        arrayList2.remove(0);
                    }
                }
            }
        }
        c0036m.g(b2);
    }

    private static void setProgress(NotificationDetails notificationDetails, C0036m c0036m) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            c0036m.e(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, C0036m c0036m) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            c0036m.f857I.icon = getDrawableResourceId(context, notificationDetails.icon);
            return;
        }
        String string = context.getSharedPreferences(StubApp.getString2(9835), 0).getString(StubApp.getString2(9832), null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            c0036m.f857I.icon = notificationDetails.iconResourceId.intValue();
        } else {
            c0036m.f857I.icon = getDrawableResourceId(context, string);
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, C0036m c0036m) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            c0036m.f(retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource));
        } else {
            c0036m.f(null);
        }
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, C0036m c0036m) {
        int i3 = f.f11113c[notificationDetails.style.ordinal()];
        if (i3 == 1) {
            setBigPictureStyle(context, notificationDetails, c0036m);
            return;
        }
        if (i3 == 2) {
            setBigTextStyle(notificationDetails, c0036m);
            return;
        }
        if (i3 == 3) {
            setInboxStyle(notificationDetails, c0036m);
        } else if (i3 == 4) {
            setMessagingStyle(context, notificationDetails, c0036m);
        } else {
            if (i3 != 5) {
                return;
            }
            setMediaStyle(c0036m);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, C0036m c0036m) {
        Long l9 = notificationDetails.timeoutAfter;
        if (l9 == null) {
            return;
        }
        c0036m.f854F = l9.longValue();
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, C0036m c0036m) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            c0036m.f857I.vibrate = new long[]{0};
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        c0036m.f857I.vibrate = jArr;
    }

    private static void setVisibility(NotificationDetails notificationDetails, C0036m c0036m) {
        int i3;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            i3 = 1;
            if (intValue != 1) {
                if (intValue != 2) {
                    throw new IllegalArgumentException(StubApp.getString2(9840) + notificationDetails.visibility);
                }
                i3 = -1;
            }
        } else {
            i3 = 0;
        }
        c0036m.f849A = i3;
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExact(0, j, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExactAndAllowWhileIdle(0, j, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.setAndAllowWhileIdle(0, j, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(StubApp.getString2(490));
        NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
        notificationChannel.setDescription(notificationChannelDetails.description);
        notificationChannel.setGroup(notificationChannelDetails.groupId);
        if (notificationChannelDetails.playSound.booleanValue()) {
            Integer num2 = notificationChannelDetails.audioAttributesUsage;
            notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(num2 != null ? num2.intValue() : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        if (BooleanUtils.getValue(notificationChannelDetails.bypassDnd)) {
            if (notificationManager.isNotificationPolicyAccessGranted()) {
                notificationChannel.setBypassDnd(true);
            } else {
                Log.w(StubApp.getString2(9838), StubApp.getString2(9841) + notificationChannelDetails.name + StubApp.getString2(9842));
            }
        }
        notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
        long[] jArr = notificationChannelDetails.vibrationPattern;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
        notificationChannel.enableLights(value);
        if (value && (num = notificationChannelDetails.ledColor) != null) {
            notificationChannel.setLightColor(num.intValue());
        }
        notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private void show(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            result.success(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        J notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.c(str, notificationDetails.id.intValue(), createNotification);
        } else {
            notificationManager.c(null, notificationDetails.id.intValue(), createNotification);
        }
    }

    private void startForegroundService(MethodCall methodCall, MethodChannel.Result result) {
        Map<String, Object> map = (Map) methodCall.argument(StubApp.getString2(9843));
        Integer num = (Integer) methodCall.argument(StubApp.getString2(9844));
        ArrayList arrayList = (ArrayList) methodCall.argument(StubApp.getString2(9845));
        String string2 = StubApp.getString2(9846);
        if (arrayList != null && arrayList.size() == 0) {
            result.error(string2, StubApp.getString2(9847), null);
            return;
        }
        if (map == null || num == null) {
            result.error(string2, StubApp.getString2(9849), null);
            return;
        }
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, map);
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.id.intValue() == 0) {
                result.error(string2, StubApp.getString2(9848), null);
                return;
            }
            i iVar = new i(extractNotificationDetails, num.intValue(), arrayList);
            Intent intent = new Intent(this.applicationContext, (Class<?>) ForegroundService.class);
            intent.putExtra(StubApp.getString2(1288), iVar);
            this.applicationContext.startForegroundService(intent);
            result.success(null);
        }
    }

    private void stopForegroundService(MethodChannel.Result result) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) ForegroundService.class));
        result.success(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                result.success(null);
            } catch (g e10) {
                result.error(e10.f11114a, e10.getMessage(), null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String json = buildGson().toJson(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, json);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void hasNotificationPolicyAccess(MethodChannel.Result result) {
        result.success(Boolean.valueOf(((NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490))).isNotificationPolicyAccessGranted()));
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i3, int i10, Intent intent) {
        boolean canUseFullScreenIntent;
        boolean canScheduleExactAlarms;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            return $assertionsDisabled;
        }
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.f11118d;
        h hVar3 = h.f11115a;
        if (hVar == hVar2 && i3 == 2 && Build.VERSION.SDK_INT >= 31) {
            AlarmManager alarmManager = getAlarmManager(this.applicationContext);
            j jVar = this.callback;
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            jVar.b(canScheduleExactAlarms);
            this.permissionRequestProgress = hVar3;
        }
        h hVar4 = this.permissionRequestProgress;
        h hVar5 = h.f11119e;
        String string2 = StubApp.getString2(490);
        if (hVar4 == hVar5 && i3 == 3 && Build.VERSION.SDK_INT >= 34) {
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService(string2);
            j jVar2 = this.callback;
            canUseFullScreenIntent = notificationManager.canUseFullScreenIntent();
            jVar2.b(canUseFullScreenIntent);
            this.permissionRequestProgress = hVar3;
        }
        if (this.permissionRequestProgress == h.f11117c && i3 == 4) {
            this.callback.b(((NotificationManager) this.applicationContext.getSystemService(string2)).isNotificationPolicyAccessGranted());
            this.permissionRequestProgress = hVar3;
        }
        return true;
    }

    @Override // eb.a
    public void onAttachedToActivity(eb.b bVar) {
        Ya.d dVar = (Ya.d) bVar;
        dVar.f8886e.add(this);
        dVar.b(this);
        dVar.a(this);
        AbstractActivityC0364d abstractActivityC0364d = dVar.f8882a;
        this.mainActivity = abstractActivityC0364d;
        Intent intent = abstractActivityC0364d.getIntent();
        if (launchedActivityFromHistory(intent)) {
            return;
        }
        if (StubApp.getString2(9792).equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
        }
    }

    @Override // db.InterfaceC0825b
    public void onAttachedToEngine(C0824a c0824a) {
        this.applicationContext = c0824a.f13553a;
        MethodChannel methodChannel = new MethodChannel(c0824a.f13554b, StubApp.getString2(9850));
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // eb.a
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // eb.a
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // db.InterfaceC0825b
    public void onDetachedFromEngine(C0824a c0824a) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(StubApp.getString2(9876))) {
                    c10 = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(StubApp.getString2(9875))) {
                    c10 = 1;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(StubApp.getString2(9874))) {
                    c10 = 2;
                    break;
                }
                break;
            case -1785484984:
                if (str.equals(StubApp.getString2(9873))) {
                    c10 = 3;
                    break;
                }
                break;
            case -1624574341:
                if (str.equals(StubApp.getString2(9872))) {
                    c10 = 4;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(StubApp.getString2(6385))) {
                    c10 = 5;
                    break;
                }
                break;
            case -1108601471:
                if (str.equals(StubApp.getString2(9871))) {
                    c10 = 6;
                    break;
                }
                break;
            case -950516363:
                if (str.equals(StubApp.getString2(9870))) {
                    c10 = 7;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(StubApp.getString2(9869))) {
                    c10 = '\b';
                    break;
                }
                break;
            case -321037320:
                if (str.equals(StubApp.getString2(9868))) {
                    c10 = '\t';
                    break;
                }
                break;
            case -208611345:
                if (str.equals(StubApp.getString2(9867))) {
                    c10 = '\n';
                    break;
                }
                break;
            case 3529469:
                if (str.equals(StubApp.getString2(9866))) {
                    c10 = 11;
                    break;
                }
                break;
            case 6625712:
                if (str.equals(StubApp.getString2(9865))) {
                    c10 = '\f';
                    break;
                }
                break;
            case 116003316:
                if (str.equals(StubApp.getString2(9864))) {
                    c10 = '\r';
                    break;
                }
                break;
            case 476547271:
                if (str.equals(StubApp.getString2(9863))) {
                    c10 = 14;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(StubApp.getString2(9862))) {
                    c10 = 15;
                    break;
                }
                break;
            case 767006947:
                if (str.equals(StubApp.getString2(9861))) {
                    c10 = 16;
                    break;
                }
                break;
            case 825311171:
                if (str.equals(StubApp.getString2(9860))) {
                    c10 = 17;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(StubApp.getString2(9859))) {
                    c10 = 18;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(StubApp.getString2(9858))) {
                    c10 = 19;
                    break;
                }
                break;
            case 972029712:
                if (str.equals(StubApp.getString2(9857))) {
                    c10 = 20;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(StubApp.getString2(9856))) {
                    c10 = 21;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(StubApp.getString2(9855))) {
                    c10 = 22;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(StubApp.getString2(9854))) {
                    c10 = 23;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(StubApp.getString2(9853))) {
                    c10 = 24;
                    break;
                }
                break;
            case 2017789808:
                if (str.equals(StubApp.getString2(9852))) {
                    c10 = 25;
                    break;
                }
                break;
            case 2147197514:
                if (str.equals(StubApp.getString2(9851))) {
                    c10 = 26;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                stopForegroundService(result);
                break;
            case 1:
                getNotificationChannels(result);
                break;
            case 2:
                deleteNotificationChannelGroup(methodCall, result);
                break;
            case 3:
                requestNotificationsPermission(new b(result));
                break;
            case 4:
                hasNotificationPolicyAccess(result);
                break;
            case 5:
                cancel(methodCall, result);
                break;
            case 6:
                requestExactAlarmsPermission(new c(result));
                break;
            case 7:
                requestFullScreenIntentPermission(new d(result));
                break;
            case '\b':
                pendingNotificationRequests(result);
                break;
            case '\t':
                cancelAllPendingNotifications(result);
                break;
            case '\n':
                getNotificationAppLaunchDetails(result);
                break;
            case 11:
                show(methodCall, result);
                break;
            case '\f':
                repeat(methodCall, result);
                break;
            case '\r':
                getActiveNotificationMessagingStyle(methodCall, result);
                break;
            case 14:
                cancelAllNotifications(result);
                break;
            case 15:
                zonedSchedule(methodCall, result);
                break;
            case 16:
                createNotificationChannelGroup(methodCall, result);
                break;
            case 17:
                getCallbackHandle(result);
                break;
            case 18:
                initialize(methodCall, result);
                break;
            case 19:
                areNotificationsEnabled(result);
                break;
            case 20:
                setCanScheduleExactNotifications(result);
                break;
            case 21:
                deleteNotificationChannel(methodCall, result);
                break;
            case 22:
                startForegroundService(methodCall, result);
                break;
            case 23:
                getActiveNotifications(result);
                break;
            case 24:
                createNotificationChannel(methodCall, result);
                break;
            case 25:
                requestNotificationPolicyAccess(new e(result));
                break;
            case 26:
                repeat(methodCall, result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    @Override // eb.a
    public void onReattachedToActivityForConfigChanges(eb.b bVar) {
        Ya.d dVar = (Ya.d) bVar;
        dVar.f8886e.add(this);
        dVar.b(this);
        dVar.a(this);
        this.mainActivity = dVar.f8882a;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.f11116b;
        boolean z2 = $assertionsDisabled;
        if (hVar == hVar2 && i3 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z2 = true;
            }
            this.callback.b(z2);
            this.permissionRequestProgress = h.f11115a;
        }
        return z2;
    }

    public void requestExactAlarmsPermission(j jVar) {
        boolean canScheduleExactAlarms;
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.f11115a;
        if (hVar != hVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (Build.VERSION.SDK_INT < 31) {
            jVar.b(true);
            return;
        }
        canScheduleExactAlarms = getAlarmManager(this.applicationContext).canScheduleExactAlarms();
        if (canScheduleExactAlarms) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
            return;
        }
        this.permissionRequestProgress = h.f11118d;
        this.mainActivity.startActivityForResult(new Intent(StubApp.getString2(1807), Uri.parse(StubApp.getString2(142) + this.applicationContext.getPackageName())), 2);
    }

    public void requestFullScreenIntentPermission(j jVar) {
        boolean canUseFullScreenIntent;
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.f11115a;
        if (hVar != hVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (Build.VERSION.SDK_INT < 34) {
            jVar.b(true);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490));
        getAlarmManager(this.applicationContext);
        canUseFullScreenIntent = notificationManager.canUseFullScreenIntent();
        if (canUseFullScreenIntent) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
            return;
        }
        this.permissionRequestProgress = h.f11119e;
        this.mainActivity.startActivityForResult(new Intent(StubApp.getString2(9877), Uri.parse(StubApp.getString2(142) + this.applicationContext.getPackageName())), 3);
    }

    public void requestNotificationPolicyAccess(j jVar) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.f11115a;
        if (hVar != hVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (((NotificationManager) this.applicationContext.getSystemService(StubApp.getString2(490))).isNotificationPolicyAccessGranted()) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
        } else {
            this.permissionRequestProgress = h.f11117c;
            this.mainActivity.startActivityForResult(new Intent(StubApp.getString2(1806)), 4);
        }
    }

    public void requestNotificationsPermission(j jVar) {
        h hVar = this.permissionRequestProgress;
        h hVar2 = h.f11115a;
        if (hVar != hVar2) {
            jVar.a();
            return;
        }
        this.callback = jVar;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.b(new J(this.mainActivity).f810b.areNotificationsEnabled());
            return;
        }
        Activity activity = this.mainActivity;
        String string2 = StubApp.getString2(783);
        if (D.a.a(activity, string2) == 0) {
            this.callback.b(true);
            this.permissionRequestProgress = hVar2;
        } else {
            this.permissionRequestProgress = h.f11116b;
            AbstractC0025b.d(this.mainActivity, new String[]{string2}, 1);
        }
    }
}
