package com.dexterous.flutterlocalnotifications.models;

import Tc.d;
import android.graphics.Color;
import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.annotations.SerializedName;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NotificationDetails implements Serializable {
    private static final String ACTIONS = StubApp.getString2(9932);
    private static final String ADDITIONAL_FLAGS = StubApp.getString2(9933);
    private static final String AUDIO_ATTRIBUTES_USAGE = StubApp.getString2(9820);
    private static final String AUTO_CANCEL = StubApp.getString2(9934);
    private static final String BIG_PICTURE = StubApp.getString2(9935);
    private static final String BIG_PICTURE_BITMAP_SOURCE = StubApp.getString2(9936);
    private static final String BIG_TEXT = StubApp.getString2(9807);
    private static final String BODY = StubApp.getString2(9806);
    private static final String BOT = StubApp.getString2(9795);
    private static final String CALLED_AT = StubApp.getString2(9937);
    private static final String CATEGORY = StubApp.getString2(2069);
    private static final String CHANNEL_ACTION = StubApp.getString2(9927);
    private static final String CHANNEL_BYPASS_DND = StubApp.getString2(9938);
    private static final String CHANNEL_DESCRIPTION = StubApp.getString2(9939);
    private static final String CHANNEL_ID = StubApp.getString2(9804);
    private static final String CHANNEL_NAME = StubApp.getString2(9423);
    private static final String CHANNEL_SHOW_BADGE = StubApp.getString2(9940);
    private static final String CHRONOMETER_COUNT_DOWN = StubApp.getString2(9941);
    private static final String COLORIZED = StubApp.getString2(9942);
    private static final String COLOR_ALPHA = StubApp.getString2(9943);
    private static final String COLOR_BLUE = StubApp.getString2(9944);
    private static final String COLOR_GREEN = StubApp.getString2(9945);
    private static final String COLOR_RED = StubApp.getString2(9946);
    private static final String CONTENT_TITLE = StubApp.getString2(9947);
    private static final String CONVERSATION_TITLE = StubApp.getString2(9799);
    private static final String DATA_MIME_TYPE = StubApp.getString2(9801);
    private static final String DATA_URI = StubApp.getString2(9800);
    private static final String DAY = StubApp.getString2(9948);
    private static final String ENABLE_LIGHTS = StubApp.getString2(9818);
    private static final String ENABLE_VIBRATION = StubApp.getString2(9816);
    private static final String FULL_SCREEN_INTENT = StubApp.getString2(9949);
    private static final String GROUP_ALERT_BEHAVIOR = StubApp.getString2(9950);
    private static final String GROUP_CONVERSATION = StubApp.getString2(9798);
    private static final String GROUP_KEY = StubApp.getString2(9805);
    private static final String HIDE_EXPANDED_LARGE_ICON = StubApp.getString2(9951);
    private static final String HTML_FORMAT_BIG_TEXT = StubApp.getString2(9952);
    private static final String HTML_FORMAT_CONTENT = StubApp.getString2(9953);
    private static final String HTML_FORMAT_CONTENT_TITLE = StubApp.getString2(9954);
    private static final String HTML_FORMAT_LINES = StubApp.getString2(9955);
    private static final String HTML_FORMAT_SUMMARY_TEXT = StubApp.getString2(9956);
    private static final String HTML_FORMAT_TITLE = StubApp.getString2(9957);
    private static final String ICON = StubApp.getString2(727);
    private static final String ICON_SOURCE = StubApp.getString2(9958);
    private static final String ID = StubApp.getString2(290);
    private static final String IMPORTANCE = StubApp.getString2(2644);
    private static final String IMPORTANT = StubApp.getString2(9796);
    private static final String INDETERMINATE = StubApp.getString2(9959);
    private static final String KEY = StubApp.getString2(728);
    private static final String LARGE_ICON = StubApp.getString2(9960);
    private static final String LARGE_ICON_BITMAP_SOURCE = StubApp.getString2(9961);
    private static final String LED_COLOR_ALPHA = StubApp.getString2(9928);
    private static final String LED_COLOR_BLUE = StubApp.getString2(9929);
    private static final String LED_COLOR_GREEN = StubApp.getString2(9930);
    private static final String LED_COLOR_RED = StubApp.getString2(9931);
    private static final String LED_OFF_MS = StubApp.getString2(9962);
    private static final String LED_ON_MS = StubApp.getString2(9963);
    private static final String LINES = StubApp.getString2(9964);
    private static final String MATCH_DATE_TIME_COMPONENTS = StubApp.getString2(9965);
    private static final String MAX_PROGRESS = StubApp.getString2(9966);
    private static final String MESSAGES = StubApp.getString2(9802);
    private static final String MILLISECONDS_SINCE_EPOCH = StubApp.getString2(9967);
    private static final String NAME = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
    private static final String NUMBER = StubApp.getString2(9968);
    private static final String ONGOING = StubApp.getString2(9969);
    private static final String ONLY_ALERT_ONCE = StubApp.getString2(9970);
    private static final String PAYLOAD = StubApp.getString2(1055);
    private static final String PERSON = StubApp.getString2(703);
    private static final String PLATFORM_SPECIFICS = StubApp.getString2(9971);
    private static final String PLAY_SOUND = StubApp.getString2(9812);
    private static final String PRIORITY = StubApp.getString2(1044);
    private static final String PROGRESS = StubApp.getString2(4838);
    private static final String REPEAT_INTERVAL = StubApp.getString2(9972);
    private static final String REPEAT_INTERVAL_MILLISECONDS = StubApp.getString2(9973);
    private static final String REPEAT_TIME = StubApp.getString2(9974);
    private static final String SCHEDULED_DATE_TIME = StubApp.getString2(9975);
    private static final String SCHEDULED_NOTIFICATION_REPEAT_FREQUENCY = StubApp.getString2(9976);
    private static final String SCHEDULE_MODE = StubApp.getString2(9977);
    private static final String SET_AS_GROUP_SUMMARY = StubApp.getString2(9978);
    private static final String SHORTCUT_ID = StubApp.getString2(9979);
    private static final String SHOW_PROGRESS = StubApp.getString2(9980);
    private static final String SHOW_WHEN = StubApp.getString2(9981);
    private static final String SILENT = StubApp.getString2(752);
    private static final String SOUND = StubApp.getString2(5841);
    private static final String SOUND_SOURCE = StubApp.getString2(9814);
    private static final String STYLE = StubApp.getString2(9982);
    private static final String STYLE_INFORMATION = StubApp.getString2(9983);
    private static final String SUB_TEXT = StubApp.getString2(9984);
    private static final String SUMMARY_TEXT = StubApp.getString2(9985);
    private static final String TAG = StubApp.getString2(3514);
    private static final String TEXT = StubApp.getString2(613);
    private static final String TICKER = StubApp.getString2(9986);
    private static final String TIMEOUT_AFTER = StubApp.getString2(9987);
    private static final String TIMESTAMP = StubApp.getString2(1350);
    private static final String TIME_ZONE_NAME = StubApp.getString2(9988);
    private static final String TITLE = StubApp.getString2(616);
    private static final String URI = StubApp.getString2(614);
    private static final String USES_CHRONOMETER = StubApp.getString2(9989);
    private static final String VIBRATION_PATTERN = StubApp.getString2(9817);
    private static final String VISIBILITY = StubApp.getString2(1338);
    private static final String WHEN = StubApp.getString2(9990);
    public List<NotificationAction> actions;
    public int[] additionalFlags;
    public Integer audioAttributesUsage;
    public Boolean autoCancel;
    public String body;
    public Long calledAt;
    public String category;
    public NotificationChannelAction channelAction;
    public Boolean channelBypassDnd;
    public String channelDescription;
    public String channelId = "Default_Channel_Id";
    public String channelName;
    public Boolean channelShowBadge;
    public Boolean chronometerCountDown;
    public Integer color;
    public Boolean colorized;
    public Integer day;
    public Boolean enableLights;
    public Boolean enableVibration;
    public Boolean fullScreenIntent;
    public Integer groupAlertBehavior;
    public String groupKey;
    public String icon;
    public Integer iconResourceId;
    public Integer id;
    public Integer importance;
    public Boolean indeterminate;
    public Object largeIcon;
    public BitmapSource largeIconBitmapSource;
    public Integer ledColor;
    public Integer ledOffMs;
    public Integer ledOnMs;
    public DateTimeComponents matchDateTimeComponents;
    public Integer maxProgress;
    public Long millisecondsSinceEpoch;
    public Integer number;
    public Boolean ongoing;
    public Boolean onlyAlertOnce;
    public String payload;
    public Boolean playSound;
    public Integer priority;
    public Integer progress;
    public RepeatInterval repeatInterval;
    public Integer repeatIntervalMilliseconds;
    public Time repeatTime;

    @SerializedName(alternate = {"allowWhileIdle"}, value = SCHEDULE_MODE)
    public ScheduleMode scheduleMode;
    public String scheduledDateTime;
    public ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency;
    public Boolean setAsGroupSummary;
    public String shortcutId;
    public Boolean showProgress;
    public Boolean showWhen;
    public Boolean silent;
    public String sound;
    public SoundSource soundSource;
    public NotificationStyle style;
    public StyleInformation styleInformation;
    public String subText;
    public String tag;
    public String ticker;
    public String timeZoneName;
    public Long timeoutAfter;
    public String title;
    public Boolean usesChronometer;
    public long[] vibrationPattern;
    public Integer visibility;
    public Long when;

    public static NotificationDetails from(Map<String, Object> map) {
        NotificationDetails notificationDetails = new NotificationDetails();
        notificationDetails.payload = (String) map.get(PAYLOAD);
        notificationDetails.id = (Integer) map.get(ID);
        notificationDetails.title = (String) map.get(TITLE);
        notificationDetails.body = (String) map.get(BODY);
        notificationDetails.scheduledDateTime = (String) map.get(SCHEDULED_DATE_TIME);
        notificationDetails.timeZoneName = (String) map.get(TIME_ZONE_NAME);
        if (map.containsKey(SCHEDULED_NOTIFICATION_REPEAT_FREQUENCY)) {
            notificationDetails.scheduledNotificationRepeatFrequency = ScheduledNotificationRepeatFrequency.values()[((Integer) map.get(SCHEDULED_NOTIFICATION_REPEAT_FREQUENCY)).intValue()];
        }
        if (map.containsKey(MATCH_DATE_TIME_COMPONENTS)) {
            notificationDetails.matchDateTimeComponents = DateTimeComponents.values()[((Integer) map.get(MATCH_DATE_TIME_COMPONENTS)).intValue()];
        }
        if (map.containsKey(MILLISECONDS_SINCE_EPOCH)) {
            notificationDetails.millisecondsSinceEpoch = (Long) map.get(MILLISECONDS_SINCE_EPOCH);
        }
        if (map.containsKey(CALLED_AT)) {
            notificationDetails.calledAt = (Long) map.get(CALLED_AT);
        }
        if (map.containsKey(REPEAT_INTERVAL)) {
            notificationDetails.repeatInterval = RepeatInterval.values()[((Integer) map.get(REPEAT_INTERVAL)).intValue()];
        }
        if (map.containsKey(REPEAT_INTERVAL_MILLISECONDS)) {
            notificationDetails.repeatIntervalMilliseconds = (Integer) map.get(REPEAT_INTERVAL_MILLISECONDS);
        }
        if (map.containsKey(REPEAT_TIME)) {
            notificationDetails.repeatTime = Time.from((Map) map.get(REPEAT_TIME));
        }
        if (map.containsKey(DAY)) {
            notificationDetails.day = (Integer) map.get(DAY);
        }
        readPlatformSpecifics(map, notificationDetails);
        return notificationDetails;
    }

    private static DefaultStyleInformation getDefaultStyleInformation(Map<String, Object> map) {
        return new DefaultStyleInformation((Boolean) map.get(HTML_FORMAT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT));
    }

    private static void readBigPictureStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        BitmapSource bitmapSource;
        String str = (String) map.get(CONTENT_TITLE);
        Boolean bool = (Boolean) map.get(HTML_FORMAT_CONTENT_TITLE);
        String str2 = (String) map.get(SUMMARY_TEXT);
        Boolean bool2 = (Boolean) map.get(HTML_FORMAT_SUMMARY_TEXT);
        Object obj = map.get(LARGE_ICON);
        if (map.containsKey(LARGE_ICON_BITMAP_SOURCE)) {
            bitmapSource = BitmapSource.values()[((Integer) map.get(LARGE_ICON_BITMAP_SOURCE)).intValue()];
        } else {
            bitmapSource = null;
        }
        BitmapSource bitmapSource2 = bitmapSource;
        notificationDetails.styleInformation = new BigPictureStyleInformation(defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody, str, bool, str2, bool2, obj, bitmapSource2, map.get(BIG_PICTURE), BitmapSource.values()[((Integer) map.get(BIG_PICTURE_BITMAP_SOURCE)).intValue()], (Boolean) map.get(HIDE_EXPANDED_LARGE_ICON));
    }

    private static void readBigTextStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new BigTextStyleInformation(defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody, (String) map.get(BIG_TEXT), (Boolean) map.get(HTML_FORMAT_BIG_TEXT), (String) map.get(CONTENT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT_TITLE), (String) map.get(SUMMARY_TEXT), (Boolean) map.get(HTML_FORMAT_SUMMARY_TEXT));
    }

    private static void readChannelInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.channelId = (String) map.get(CHANNEL_ID);
        notificationDetails.channelName = (String) map.get(CHANNEL_NAME);
        notificationDetails.channelDescription = (String) map.get(CHANNEL_DESCRIPTION);
        notificationDetails.importance = (Integer) map.get(IMPORTANCE);
        notificationDetails.channelBypassDnd = (Boolean) map.get(CHANNEL_BYPASS_DND);
        notificationDetails.channelShowBadge = (Boolean) map.get(CHANNEL_SHOW_BADGE);
        notificationDetails.channelAction = NotificationChannelAction.values()[((Integer) map.get(CHANNEL_ACTION)).intValue()];
    }

    private static void readColor(NotificationDetails notificationDetails, Map<String, Object> map) {
        Integer num = (Integer) map.get(COLOR_ALPHA);
        Integer num2 = (Integer) map.get(COLOR_RED);
        Integer num3 = (Integer) map.get(COLOR_GREEN);
        Integer num4 = (Integer) map.get(COLOR_BLUE);
        if (num == null || num2 == null || num3 == null || num4 == null) {
            return;
        }
        notificationDetails.color = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
    }

    private static void readGroupingInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.groupKey = (String) map.get(GROUP_KEY);
        notificationDetails.setAsGroupSummary = (Boolean) map.get(SET_AS_GROUP_SUMMARY);
        notificationDetails.groupAlertBehavior = (Integer) map.get(GROUP_ALERT_BEHAVIOR);
    }

    private static void readInboxStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new InboxStyleInformation(defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody, (String) map.get(CONTENT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT_TITLE), (String) map.get(SUMMARY_TEXT), (Boolean) map.get(HTML_FORMAT_SUMMARY_TEXT), (ArrayList) map.get(LINES), (Boolean) map.get(HTML_FORMAT_LINES));
    }

    private static void readLargeIconInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        Integer num;
        notificationDetails.largeIcon = map.get(LARGE_ICON);
        if (!map.containsKey(LARGE_ICON_BITMAP_SOURCE) || (num = (Integer) map.get(LARGE_ICON_BITMAP_SOURCE)) == null) {
            return;
        }
        notificationDetails.largeIconBitmapSource = BitmapSource.values()[num.intValue()];
    }

    private static void readLedInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        Integer num = (Integer) map.get(LED_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(LED_COLOR_RED);
        Integer num3 = (Integer) map.get(LED_COLOR_GREEN);
        Integer num4 = (Integer) map.get(LED_COLOR_BLUE);
        if (num != null && num2 != null && num3 != null && num4 != null) {
            notificationDetails.ledColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        notificationDetails.enableLights = (Boolean) map.get(ENABLE_LIGHTS);
        notificationDetails.ledOnMs = (Integer) map.get(LED_ON_MS);
        notificationDetails.ledOffMs = (Integer) map.get(LED_OFF_MS);
    }

    private static ArrayList<MessageDetails> readMessages(ArrayList<Map<String, Object>> arrayList) {
        ArrayList<MessageDetails> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<Map<String, Object>> it = arrayList.iterator();
            while (it.hasNext()) {
                Map<String, Object> next = it.next();
                arrayList2.add(new MessageDetails((String) next.get(TEXT), d.o(next.get(TIMESTAMP)), readPersonDetails((Map) next.get(PERSON)), (String) next.get(DATA_MIME_TYPE), (String) next.get(DATA_URI)));
            }
        }
        return arrayList2;
    }

    private static void readMessagingStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new MessagingStyleInformation(readPersonDetails((Map) map.get(PERSON)), (String) map.get(CONVERSATION_TITLE), (Boolean) map.get(GROUP_CONVERSATION), readMessages((ArrayList) map.get(MESSAGES)), defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody);
    }

    private static PersonDetails readPersonDetails(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        Boolean bool = (Boolean) map.get(BOT);
        Object obj = map.get(ICON);
        Integer num = (Integer) map.get(ICON_SOURCE);
        return new PersonDetails(bool, obj, num != null ? IconSource.values()[num.intValue()] : null, (Boolean) map.get(IMPORTANT), (String) map.get(KEY), (String) map.get(NAME), (String) map.get(URI));
    }

    private static void readPlatformSpecifics(Map<String, Object> map, NotificationDetails notificationDetails) {
        List list;
        Map map2 = (Map) map.get(PLATFORM_SPECIFICS);
        if (map2 != null) {
            notificationDetails.autoCancel = (Boolean) map2.get(AUTO_CANCEL);
            notificationDetails.ongoing = (Boolean) map2.get(ONGOING);
            notificationDetails.silent = (Boolean) map2.get(SILENT);
            notificationDetails.style = NotificationStyle.values()[((Integer) map2.get(STYLE)).intValue()];
            readStyleInformation(notificationDetails, map2);
            notificationDetails.icon = (String) map2.get(ICON);
            notificationDetails.priority = (Integer) map2.get(PRIORITY);
            readSoundInformation(notificationDetails, map2);
            notificationDetails.enableVibration = (Boolean) map2.get(ENABLE_VIBRATION);
            notificationDetails.vibrationPattern = (long[]) map2.get(VIBRATION_PATTERN);
            readGroupingInformation(notificationDetails, map2);
            notificationDetails.onlyAlertOnce = (Boolean) map2.get(ONLY_ALERT_ONCE);
            notificationDetails.showWhen = (Boolean) map2.get(SHOW_WHEN);
            notificationDetails.when = d.o(map2.get(WHEN));
            notificationDetails.usesChronometer = (Boolean) map2.get(USES_CHRONOMETER);
            notificationDetails.chronometerCountDown = (Boolean) map2.get(CHRONOMETER_COUNT_DOWN);
            readProgressInformation(notificationDetails, map2);
            readColor(notificationDetails, map2);
            readChannelInformation(notificationDetails, map2);
            readLedInformation(notificationDetails, map2);
            readLargeIconInformation(notificationDetails, map2);
            notificationDetails.ticker = (String) map2.get(TICKER);
            notificationDetails.visibility = (Integer) map2.get(VISIBILITY);
            if (map2.containsKey(SCHEDULE_MODE)) {
                notificationDetails.scheduleMode = ScheduleMode.valueOf((String) map2.get(SCHEDULE_MODE));
            }
            notificationDetails.timeoutAfter = d.o(map2.get(TIMEOUT_AFTER));
            notificationDetails.category = (String) map2.get(CATEGORY);
            notificationDetails.fullScreenIntent = (Boolean) map2.get(FULL_SCREEN_INTENT);
            notificationDetails.shortcutId = (String) map2.get(SHORTCUT_ID);
            notificationDetails.additionalFlags = (int[]) map2.get(ADDITIONAL_FLAGS);
            notificationDetails.subText = (String) map2.get(SUB_TEXT);
            notificationDetails.tag = (String) map2.get(TAG);
            notificationDetails.colorized = (Boolean) map2.get(COLORIZED);
            notificationDetails.number = (Integer) map2.get(NUMBER);
            notificationDetails.audioAttributesUsage = (Integer) map2.get(AUDIO_ATTRIBUTES_USAGE);
            if (!map2.containsKey(ACTIONS) || (list = (List) map2.get(ACTIONS)) == null || list.isEmpty()) {
                return;
            }
            notificationDetails.actions = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                notificationDetails.actions.add(new NotificationAction((Map) it.next()));
            }
        }
    }

    private static void readProgressInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.showProgress = (Boolean) map.get(SHOW_PROGRESS);
        if (map.containsKey(MAX_PROGRESS)) {
            notificationDetails.maxProgress = (Integer) map.get(MAX_PROGRESS);
        }
        if (map.containsKey(PROGRESS)) {
            notificationDetails.progress = (Integer) map.get(PROGRESS);
        }
        if (map.containsKey(INDETERMINATE)) {
            notificationDetails.indeterminate = (Boolean) map.get(INDETERMINATE);
        }
    }

    private static void readSoundInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.playSound = (Boolean) map.get(PLAY_SOUND);
        notificationDetails.sound = (String) map.get(SOUND);
        Integer num = (Integer) map.get(SOUND_SOURCE);
        if (num != null) {
            notificationDetails.soundSource = SoundSource.values()[num.intValue()];
        }
    }

    private static void readStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        Map map2 = (Map) map.get(STYLE_INFORMATION);
        DefaultStyleInformation defaultStyleInformation = getDefaultStyleInformation(map2);
        NotificationStyle notificationStyle = notificationDetails.style;
        if (notificationStyle == NotificationStyle.Default) {
            notificationDetails.styleInformation = defaultStyleInformation;
            return;
        }
        if (notificationStyle == NotificationStyle.BigPicture) {
            readBigPictureStyleInformation(notificationDetails, map2, defaultStyleInformation);
            return;
        }
        if (notificationStyle == NotificationStyle.BigText) {
            readBigTextStyleInformation(notificationDetails, map2, defaultStyleInformation);
            return;
        }
        if (notificationStyle == NotificationStyle.Inbox) {
            readInboxStyleInformation(notificationDetails, map2, defaultStyleInformation);
        } else if (notificationStyle == NotificationStyle.Messaging) {
            readMessagingStyleInformation(notificationDetails, map2, defaultStyleInformation);
        } else if (notificationStyle == NotificationStyle.Media) {
            notificationDetails.styleInformation = defaultStyleInformation;
        }
    }
}
