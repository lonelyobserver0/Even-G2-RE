package com.mapbox.navigation.copilot;

import Xa.h;
import androidx.annotation.Keep;
import com.stub.StubApp;
import i2.u;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/mapbox/navigation/copilot/NavFeedbackSubmitted;", "", "", "feedbackId", "type", "", "subtype", "Lcom/mapbox/navigation/copilot/HistoryPoint;", "location", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/mapbox/navigation/copilot/HistoryPoint;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Set;", "component4", "()Lcom/mapbox/navigation/copilot/HistoryPoint;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/mapbox/navigation/copilot/HistoryPoint;Ljava/lang/String;)Lcom/mapbox/navigation/copilot/NavFeedbackSubmitted;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFeedbackId", "getType", "Ljava/util/Set;", "getSubtype", "Lcom/mapbox/navigation/copilot/HistoryPoint;", "getLocation", "getDescription", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class NavFeedbackSubmitted {
    private final String description;
    private final String feedbackId;
    private final HistoryPoint location;
    private final Set<String> subtype;
    private final String type;

    public NavFeedbackSubmitted(String feedbackId, String type, Set<String> subtype, HistoryPoint location, String description) {
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(description, "description");
        this.feedbackId = feedbackId;
        this.type = type;
        this.subtype = subtype;
        this.location = location;
        this.description = description;
    }

    public static /* synthetic */ NavFeedbackSubmitted copy$default(NavFeedbackSubmitted navFeedbackSubmitted, String str, String str2, Set set, HistoryPoint historyPoint, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = navFeedbackSubmitted.feedbackId;
        }
        if ((i3 & 2) != 0) {
            str2 = navFeedbackSubmitted.type;
        }
        if ((i3 & 4) != 0) {
            set = navFeedbackSubmitted.subtype;
        }
        if ((i3 & 8) != 0) {
            historyPoint = navFeedbackSubmitted.location;
        }
        if ((i3 & 16) != 0) {
            str3 = navFeedbackSubmitted.description;
        }
        String str4 = str3;
        Set set2 = set;
        return navFeedbackSubmitted.copy(str, str2, set2, historyPoint, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFeedbackId() {
        return this.feedbackId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Set<String> component3() {
        return this.subtype;
    }

    /* renamed from: component4, reason: from getter */
    public final HistoryPoint getLocation() {
        return this.location;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final NavFeedbackSubmitted copy(String feedbackId, String type, Set<String> subtype, HistoryPoint location, String description) {
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(description, "description");
        return new NavFeedbackSubmitted(feedbackId, type, subtype, location, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavFeedbackSubmitted)) {
            return false;
        }
        NavFeedbackSubmitted navFeedbackSubmitted = (NavFeedbackSubmitted) other;
        return Intrinsics.areEqual(this.feedbackId, navFeedbackSubmitted.feedbackId) && Intrinsics.areEqual(this.type, navFeedbackSubmitted.type) && Intrinsics.areEqual(this.subtype, navFeedbackSubmitted.subtype) && Intrinsics.areEqual(this.location, navFeedbackSubmitted.location) && Intrinsics.areEqual(this.description, navFeedbackSubmitted.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFeedbackId() {
        return this.feedbackId;
    }

    public final HistoryPoint getLocation() {
        return this.location;
    }

    public final Set<String> getSubtype() {
        return this.subtype;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + ((this.location.hashCode() + ((this.subtype.hashCode() + u.d(this.feedbackId.hashCode() * 31, 31, this.type)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14662));
        sb2.append(this.feedbackId);
        sb2.append(StubApp.getString2(2148));
        sb2.append(this.type);
        sb2.append(StubApp.getString2(12809));
        sb2.append(this.subtype);
        sb2.append(StubApp.getString2(5745));
        sb2.append(this.location);
        sb2.append(StubApp.getString2(7300));
        return h.s(sb2, this.description, ')');
    }
}
