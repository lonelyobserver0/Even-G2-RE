package com.mapbox.navigation.core.telemetry.events;

import com.stub.StubApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b3\bÆ\u0002\u0018\u00002\u00020\u0001:\u00043456B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent;", "", "()V", "ALTERNATIVE_ROUTE_NOT_EXPECTED", "", "ARRIVAL_FEEDBACK_CONFUSING_INSTRUCTIONS", "ARRIVAL_FEEDBACK_GOOD", "ARRIVAL_FEEDBACK_NOT_GOOD", "ARRIVAL_FEEDBACK_THIS_PLACE_IS_CLOSED", "ARRIVAL_FEEDBACK_WRONG_ENTRANCE", "ARRIVAL_FEEDBACK_WRONG_LOCATION", "CARS_NOT_ALLOWED_ON_STREET", "DRIVER_MODE_FREE_DRIVE", "DRIVER_MODE_TRIP", "EXIT_INFO_INCORRECT", "GUIDANCE_TOO_EARLY", "GUIDANCE_TOO_LATE", "INCORRECT_AUDIO_GUIDANCE", "INCORRECT_SPEED_LIMIT", "INCORRECT_VISUAL", "INCORRECT_VISUAL_GUIDANCE", "INSTRUCTION_MISSING", "INSTRUCTION_UNNECESSARY", "LANE_GUIDANCE_INCORRECT", "MANEUVER_INCORRECT", "MISSING_ROAD", "OTHER_ISSUE", "POSITIONING_ISSUE", "PRONUNCIATION_INCORRECT", "REROUTE", "ROAD_CLOSED", "ROAD_ISSUE", "ROAD_NAME_REPEATED", "ROUTED_DOWN_A_ONE_WAY", "ROUTE_HAD_ROADS_TOO_NARROW_TO_PASS", "ROUTE_INCLUDED_MISSING_ROADS", "ROUTE_NOT_ALLOWED", "ROUTE_NOT_DRIVE_ABLE", "ROUTE_NOT_PREFERRED", "ROUTING_ERROR", "STREET_NAME_INCORRECT", "STREET_PERMANENTLY_BLOCKED_OFF", "STREET_TEMPORARILY_BLOCKED_OFF", "TRAFFIC_CONGESTION", "TRAFFIC_ISSUE", "TRAFFIC_MODERATE", "TRAFFIC_NO", "TURN_ICON_INCORRECT", "TURN_WAS_NOT_ALLOWED", "UI", "VOICE_FEEDBACK", "DriverMode", "Source", "SubType", "Type", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeedbackEvent {
    public static final String ALTERNATIVE_ROUTE_NOT_EXPECTED = StubApp.getString2(14679);
    public static final String ARRIVAL_FEEDBACK_CONFUSING_INSTRUCTIONS = StubApp.getString2(14680);
    public static final String ARRIVAL_FEEDBACK_GOOD = StubApp.getString2(14681);
    public static final String ARRIVAL_FEEDBACK_NOT_GOOD = StubApp.getString2(14682);
    public static final String ARRIVAL_FEEDBACK_THIS_PLACE_IS_CLOSED = StubApp.getString2(14683);
    public static final String ARRIVAL_FEEDBACK_WRONG_ENTRANCE = StubApp.getString2(14684);
    public static final String ARRIVAL_FEEDBACK_WRONG_LOCATION = StubApp.getString2(14685);
    public static final String CARS_NOT_ALLOWED_ON_STREET = StubApp.getString2(14686);
    public static final String DRIVER_MODE_FREE_DRIVE = StubApp.getString2(2166);
    public static final String DRIVER_MODE_TRIP = StubApp.getString2(14687);
    public static final String EXIT_INFO_INCORRECT = StubApp.getString2(14688);
    public static final String GUIDANCE_TOO_EARLY = StubApp.getString2(14689);
    public static final String GUIDANCE_TOO_LATE = StubApp.getString2(14690);
    public static final String INCORRECT_AUDIO_GUIDANCE = StubApp.getString2(14691);
    public static final String INCORRECT_SPEED_LIMIT = StubApp.getString2(14692);
    public static final String INCORRECT_VISUAL = StubApp.getString2(14693);
    public static final String INCORRECT_VISUAL_GUIDANCE = StubApp.getString2(14694);
    public static final String INSTRUCTION_MISSING = StubApp.getString2(14695);
    public static final String INSTRUCTION_UNNECESSARY = StubApp.getString2(14696);
    public static final String LANE_GUIDANCE_INCORRECT = StubApp.getString2(14697);
    public static final String MANEUVER_INCORRECT = StubApp.getString2(14698);
    public static final String MISSING_ROAD = StubApp.getString2(14699);
    public static final String OTHER_ISSUE = StubApp.getString2(14700);
    public static final String POSITIONING_ISSUE = StubApp.getString2(14701);
    public static final String PRONUNCIATION_INCORRECT = StubApp.getString2(14702);
    public static final String REROUTE = StubApp.getString2(4409);
    public static final String ROAD_CLOSED = StubApp.getString2(14703);
    public static final String ROAD_ISSUE = StubApp.getString2(14704);
    public static final String ROAD_NAME_REPEATED = StubApp.getString2(14705);
    public static final String ROUTED_DOWN_A_ONE_WAY = StubApp.getString2(14706);
    public static final String ROUTE_HAD_ROADS_TOO_NARROW_TO_PASS = StubApp.getString2(14707);
    public static final String ROUTE_INCLUDED_MISSING_ROADS = StubApp.getString2(14708);
    public static final String ROUTE_NOT_ALLOWED = StubApp.getString2(14709);
    public static final String ROUTE_NOT_DRIVE_ABLE = StubApp.getString2(14710);
    public static final String ROUTE_NOT_PREFERRED = StubApp.getString2(14711);
    public static final String ROUTING_ERROR = StubApp.getString2(14712);
    public static final String STREET_NAME_INCORRECT = StubApp.getString2(14713);
    public static final String STREET_PERMANENTLY_BLOCKED_OFF = StubApp.getString2(14714);
    public static final String STREET_TEMPORARILY_BLOCKED_OFF = StubApp.getString2(14715);
    public static final String TRAFFIC_CONGESTION = StubApp.getString2(14716);
    public static final String TRAFFIC_ISSUE = StubApp.getString2(14717);
    public static final String TRAFFIC_MODERATE = StubApp.getString2(14718);
    public static final String TRAFFIC_NO = StubApp.getString2(14719);
    public static final String TURN_ICON_INCORRECT = StubApp.getString2(14720);
    public static final String TURN_WAS_NOT_ALLOWED = StubApp.getString2(14721);
    public static final String UI = StubApp.getString2(11522);
    public static final String VOICE_FEEDBACK = StubApp.getString2(14722);
    public static final FeedbackEvent INSTANCE = new FeedbackEvent();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent$DriverMode;", "", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface DriverMode {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent$Source;", "", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Deprecated(message = "Feedback source is not supported anymore")
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface Source {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent$SubType;", "", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface SubType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent$Type;", "", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface Type {
    }

    private FeedbackEvent() {
    }
}
