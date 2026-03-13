package com.builttoroam.devicecalendar.common;

import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/builttoroam/devicecalendar/common/Constants;", "", "<init>", "()V", "Companion", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Constants {
    public static final int ATTENDEE_EMAIL_INDEX = 3;
    public static final int ATTENDEE_EVENT_ID_INDEX = 1;
    public static final int ATTENDEE_ID_INDEX = 0;
    public static final int ATTENDEE_NAME_INDEX = 2;
    private static final String[] ATTENDEE_PROJECTION;
    public static final int ATTENDEE_RELATIONSHIP_INDEX = 5;
    public static final int ATTENDEE_STATUS_INDEX = 6;
    public static final int ATTENDEE_TYPE_INDEX = 4;
    public static final int CALENDAR_PROJECTION_ACCESS_LEVEL_INDEX = 5;
    public static final int CALENDAR_PROJECTION_ACCOUNT_NAME_INDEX = 1;
    public static final int CALENDAR_PROJECTION_ACCOUNT_TYPE_INDEX = 2;
    public static final int CALENDAR_PROJECTION_COLOR_INDEX = 6;
    public static final int CALENDAR_PROJECTION_DISPLAY_NAME_INDEX = 3;
    public static final int CALENDAR_PROJECTION_ID_INDEX = 0;
    public static final int CALENDAR_PROJECTION_IS_PRIMARY_INDEX = 7;
    public static final int CALENDAR_PROJECTION_OWNER_ACCOUNT_INDEX = 4;
    private static final String[] EVENT_INSTANCE_DELETION;
    public static final int EVENT_INSTANCE_DELETION_BEGIN_INDEX = 3;
    public static final int EVENT_INSTANCE_DELETION_END_INDEX = 4;
    public static final int EVENT_INSTANCE_DELETION_ID_INDEX = 0;
    public static final int EVENT_INSTANCE_DELETION_LAST_DATE_INDEX = 2;
    public static final int EVENT_INSTANCE_DELETION_RRULE_INDEX = 1;
    public static final int EVENT_PROJECTION_ALL_DAY_INDEX = 8;
    public static final int EVENT_PROJECTION_AVAILABILITY_INDEX = 13;
    public static final int EVENT_PROJECTION_BEGIN_INDEX = 3;
    public static final int EVENT_PROJECTION_CUSTOM_APP_URI_INDEX = 10;
    public static final int EVENT_PROJECTION_DESCRIPTION_INDEX = 2;
    public static final int EVENT_PROJECTION_END_INDEX = 4;
    public static final int EVENT_PROJECTION_END_TIMEZONE_INDEX = 12;
    public static final int EVENT_PROJECTION_EVENT_LOCATION_INDEX = 9;
    public static final int EVENT_PROJECTION_ID_INDEX = 0;
    public static final int EVENT_PROJECTION_RECURRING_RULE_INDEX = 7;
    public static final int EVENT_PROJECTION_START_TIMEZONE_INDEX = 11;
    public static final int EVENT_PROJECTION_STATUS_INDEX = 14;
    public static final int EVENT_PROJECTION_TITLE_INDEX = 1;
    public static final int REMINDER_MINUTES_INDEX = 1;
    private static final String[] REMINDER_PROJECTION;
    public static final String AVAILABILITY_UNAVAILABLE = StubApp.getString2(9765);
    public static final String EVENT_STATUS_NONE = StubApp.getString2(207);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] CALENDAR_PROJECTION = {StubApp.getString2(2829), StubApp.getString2(9699), StubApp.getString2(3012), StubApp.getString2(3011), StubApp.getString2(9704), StubApp.getString2(9701), StubApp.getString2(9703), StubApp.getString2(5264)};
    private static final String[] CALENDAR_PROJECTION_OLDER_API = {StubApp.getString2(2829), StubApp.getString2(9699), StubApp.getString2(3012), StubApp.getString2(3011), StubApp.getString2(9704), StubApp.getString2(9701), StubApp.getString2(9703)};
    private static final String[] EVENT_PROJECTION = {StubApp.getString2(1060), StubApp.getString2(616), StubApp.getString2(659), StubApp.getString2(6523), StubApp.getString2(6550), StubApp.getString2(2091), StubApp.getString2(9763), StubApp.getString2(9681), StubApp.getString2(9674), StubApp.getString2(2997), StubApp.getString2(9677), StubApp.getString2(9675), StubApp.getString2(9676), StubApp.getString2(9679), StubApp.getString2(9680)};

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b#\u0010\u0011R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b*\u0010\u0011R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b3\u0010\u0011R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0019\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b6\u0010\u0011R\u000e\u00107\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/builttoroam/devicecalendar/common/Constants$Companion;", "", "<init>", "()V", "CALENDAR_PROJECTION_ID_INDEX", "", "CALENDAR_PROJECTION_ACCOUNT_NAME_INDEX", "CALENDAR_PROJECTION_ACCOUNT_TYPE_INDEX", "CALENDAR_PROJECTION_DISPLAY_NAME_INDEX", "CALENDAR_PROJECTION_OWNER_ACCOUNT_INDEX", "CALENDAR_PROJECTION_ACCESS_LEVEL_INDEX", "CALENDAR_PROJECTION_COLOR_INDEX", "CALENDAR_PROJECTION_IS_PRIMARY_INDEX", "CALENDAR_PROJECTION", "", "", "getCALENDAR_PROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "CALENDAR_PROJECTION_OLDER_API", "getCALENDAR_PROJECTION_OLDER_API", "EVENT_PROJECTION_ID_INDEX", "EVENT_PROJECTION_TITLE_INDEX", "EVENT_PROJECTION_DESCRIPTION_INDEX", "EVENT_PROJECTION_BEGIN_INDEX", "EVENT_PROJECTION_END_INDEX", "EVENT_PROJECTION_RECURRING_RULE_INDEX", "EVENT_PROJECTION_ALL_DAY_INDEX", "EVENT_PROJECTION_EVENT_LOCATION_INDEX", "EVENT_PROJECTION_CUSTOM_APP_URI_INDEX", "EVENT_PROJECTION_START_TIMEZONE_INDEX", "EVENT_PROJECTION_END_TIMEZONE_INDEX", "EVENT_PROJECTION_AVAILABILITY_INDEX", "EVENT_PROJECTION_STATUS_INDEX", "EVENT_PROJECTION", "getEVENT_PROJECTION", "EVENT_INSTANCE_DELETION_ID_INDEX", "EVENT_INSTANCE_DELETION_RRULE_INDEX", "EVENT_INSTANCE_DELETION_LAST_DATE_INDEX", "EVENT_INSTANCE_DELETION_BEGIN_INDEX", "EVENT_INSTANCE_DELETION_END_INDEX", "EVENT_INSTANCE_DELETION", "getEVENT_INSTANCE_DELETION", "ATTENDEE_ID_INDEX", "ATTENDEE_EVENT_ID_INDEX", "ATTENDEE_NAME_INDEX", "ATTENDEE_EMAIL_INDEX", "ATTENDEE_TYPE_INDEX", "ATTENDEE_RELATIONSHIP_INDEX", "ATTENDEE_STATUS_INDEX", "ATTENDEE_PROJECTION", "getATTENDEE_PROJECTION", "REMINDER_MINUTES_INDEX", "REMINDER_PROJECTION", "getREMINDER_PROJECTION", "AVAILABILITY_UNAVAILABLE", "EVENT_STATUS_NONE", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String[] getATTENDEE_PROJECTION() {
            return Constants.ATTENDEE_PROJECTION;
        }

        public final String[] getCALENDAR_PROJECTION() {
            return Constants.CALENDAR_PROJECTION;
        }

        public final String[] getCALENDAR_PROJECTION_OLDER_API() {
            return Constants.CALENDAR_PROJECTION_OLDER_API;
        }

        public final String[] getEVENT_INSTANCE_DELETION() {
            return Constants.EVENT_INSTANCE_DELETION;
        }

        public final String[] getEVENT_PROJECTION() {
            return Constants.EVENT_PROJECTION;
        }

        public final String[] getREMINDER_PROJECTION() {
            return Constants.REMINDER_PROJECTION;
        }

        private Companion() {
        }
    }

    static {
        String string2 = StubApp.getString2(6523);
        String string22 = StubApp.getString2(6550);
        String string23 = StubApp.getString2(1060);
        EVENT_INSTANCE_DELETION = new String[]{string23, StubApp.getString2(9681), StubApp.getString2(9764), string2, string22};
        ATTENDEE_PROJECTION = new String[]{StubApp.getString2(2829), StubApp.getString2(1060), StubApp.getString2(9685), StubApp.getString2(9686), StubApp.getString2(9688), StubApp.getString2(9687), StubApp.getString2(9689)};
        REMINDER_PROJECTION = new String[]{string23, StubApp.getString2(9690)};
    }
}
