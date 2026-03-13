package com.builttoroam.devicecalendar.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\b\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\n\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/builttoroam/devicecalendar/models/Attendee;", "", "emailAddress", "", "name", "role", "", "attendanceStatus", "isOrganizer", "", "isCurrentUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEmailAddress", "()Ljava/lang/String;", "getName", "getRole", "()I", "getAttendanceStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Attendee {
    private final Integer attendanceStatus;
    private final String emailAddress;
    private final Boolean isCurrentUser;
    private final Boolean isOrganizer;
    private final String name;
    private final int role;

    public Attendee(String emailAddress, String str, int i3, Integer num, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        this.emailAddress = emailAddress;
        this.name = str;
        this.role = i3;
        this.attendanceStatus = num;
        this.isOrganizer = bool;
        this.isCurrentUser = bool2;
    }

    public final Integer getAttendanceStatus() {
        return this.attendanceStatus;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRole() {
        return this.role;
    }

    /* renamed from: isCurrentUser, reason: from getter */
    public final Boolean getIsCurrentUser() {
        return this.isCurrentUser;
    }

    /* renamed from: isOrganizer, reason: from getter */
    public final Boolean getIsOrganizer() {
        return this.isOrganizer;
    }
}
