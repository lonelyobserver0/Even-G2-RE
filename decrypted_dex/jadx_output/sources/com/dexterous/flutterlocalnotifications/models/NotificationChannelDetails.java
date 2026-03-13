package com.dexterous.flutterlocalnotifications.models;

import android.graphics.Color;
import androidx.annotation.Keep;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.io.Serializable;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NotificationChannelDetails implements Serializable {
    private static final String AUDIO_ATTRIBUTES_USAGE = StubApp.getString2(9820);
    private static final String BYPASS_DND = StubApp.getString2(9815);
    private static final String CHANNEL_ACTION = StubApp.getString2(9927);
    private static final String DESCRIPTION = StubApp.getString2(659);
    private static final String ENABLE_LIGHTS = StubApp.getString2(9818);
    private static final String ENABLE_VIBRATION = StubApp.getString2(9816);
    private static final String GROUP_ID = StubApp.getString2(9810);
    private static final String ID = StubApp.getString2(290);
    private static final String IMPORTANCE = StubApp.getString2(2644);
    private static final String LED_COLOR_ALPHA = StubApp.getString2(9928);
    private static final String LED_COLOR_BLUE = StubApp.getString2(9929);
    private static final String LED_COLOR_GREEN = StubApp.getString2(9930);
    private static final String LED_COLOR_RED = StubApp.getString2(9931);
    private static final String NAME = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
    private static final String PLAY_SOUND = StubApp.getString2(9812);
    private static final String SHOW_BADGE = StubApp.getString2(9811);
    private static final String SOUND = StubApp.getString2(5841);
    private static final String SOUND_SOURCE = StubApp.getString2(9814);
    private static final String VIBRATION_PATTERN = StubApp.getString2(9817);
    public Integer audioAttributesUsage;
    public Boolean bypassDnd;
    public NotificationChannelAction channelAction;
    public String description;
    public Boolean enableLights;
    public Boolean enableVibration;
    public String groupId;
    public String id;
    public Integer importance;
    public Integer ledColor;
    public String name;
    public Boolean playSound;
    public Boolean showBadge;
    public String sound;
    public SoundSource soundSource;
    public long[] vibrationPattern;

    public static NotificationChannelDetails from(Map<String, Object> map) {
        NotificationChannelDetails notificationChannelDetails = new NotificationChannelDetails();
        notificationChannelDetails.id = (String) map.get(ID);
        notificationChannelDetails.name = (String) map.get(NAME);
        notificationChannelDetails.description = (String) map.get(DESCRIPTION);
        notificationChannelDetails.groupId = (String) map.get(GROUP_ID);
        notificationChannelDetails.importance = (Integer) map.get(IMPORTANCE);
        notificationChannelDetails.bypassDnd = (Boolean) map.get(BYPASS_DND);
        notificationChannelDetails.showBadge = (Boolean) map.get(SHOW_BADGE);
        notificationChannelDetails.channelAction = NotificationChannelAction.values()[((Integer) map.get(CHANNEL_ACTION)).intValue()];
        notificationChannelDetails.enableVibration = (Boolean) map.get(ENABLE_VIBRATION);
        notificationChannelDetails.vibrationPattern = (long[]) map.get(VIBRATION_PATTERN);
        notificationChannelDetails.playSound = (Boolean) map.get(PLAY_SOUND);
        notificationChannelDetails.sound = (String) map.get(SOUND);
        notificationChannelDetails.audioAttributesUsage = (Integer) map.get(AUDIO_ATTRIBUTES_USAGE);
        Integer num = (Integer) map.get(SOUND_SOURCE);
        if (num != null) {
            notificationChannelDetails.soundSource = SoundSource.values()[num.intValue()];
        }
        Integer num2 = (Integer) map.get(LED_COLOR_ALPHA);
        Integer num3 = (Integer) map.get(LED_COLOR_RED);
        Integer num4 = (Integer) map.get(LED_COLOR_GREEN);
        Integer num5 = (Integer) map.get(LED_COLOR_BLUE);
        if (num2 != null && num3 != null && num4 != null && num5 != null) {
            notificationChannelDetails.ledColor = Integer.valueOf(Color.argb(num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue()));
        }
        notificationChannelDetails.enableLights = (Boolean) map.get(ENABLE_LIGHTS);
        return notificationChannelDetails;
    }

    public static NotificationChannelDetails fromNotificationDetails(NotificationDetails notificationDetails) {
        NotificationChannelDetails notificationChannelDetails = new NotificationChannelDetails();
        notificationChannelDetails.id = notificationDetails.channelId;
        notificationChannelDetails.name = notificationDetails.channelName;
        notificationChannelDetails.description = notificationDetails.channelDescription;
        notificationChannelDetails.importance = notificationDetails.importance;
        notificationChannelDetails.bypassDnd = notificationDetails.channelBypassDnd;
        notificationChannelDetails.showBadge = notificationDetails.channelShowBadge;
        NotificationChannelAction notificationChannelAction = notificationDetails.channelAction;
        if (notificationChannelAction == null) {
            notificationChannelDetails.channelAction = NotificationChannelAction.CreateIfNotExists;
        } else {
            notificationChannelDetails.channelAction = notificationChannelAction;
        }
        notificationChannelDetails.enableVibration = notificationDetails.enableVibration;
        notificationChannelDetails.vibrationPattern = notificationDetails.vibrationPattern;
        notificationChannelDetails.playSound = notificationDetails.playSound;
        notificationChannelDetails.sound = notificationDetails.sound;
        notificationChannelDetails.soundSource = notificationDetails.soundSource;
        notificationChannelDetails.audioAttributesUsage = notificationDetails.audioAttributesUsage;
        notificationChannelDetails.ledColor = notificationDetails.ledColor;
        notificationChannelDetails.enableLights = notificationDetails.enableLights;
        return notificationChannelDetails;
    }
}
