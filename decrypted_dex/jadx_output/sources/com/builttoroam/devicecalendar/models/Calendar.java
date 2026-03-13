package com.builttoroam.devicecalendar.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/builttoroam/devicecalendar/models/Calendar;", "", "id", "", "name", "color", "", "accountName", "accountType", "ownerAccount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getColor", "()I", "getAccountName", "getAccountType", "getOwnerAccount", "isReadOnly", "", "()Z", "setReadOnly", "(Z)V", "isDefault", "setDefault", "device_calendar_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Calendar {
    private final String accountName;
    private final String accountType;
    private final int color;
    private final String id;
    private boolean isDefault;
    private boolean isReadOnly;
    private final String name;
    private final String ownerAccount;

    public Calendar(String id, String name, int i3, String accountName, String accountType, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.id = id;
        this.name = name;
        this.color = i3;
        this.accountName = accountName;
        this.accountType = accountType;
        this.ownerAccount = str;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerAccount() {
        return this.ownerAccount;
    }

    /* renamed from: isDefault, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: isReadOnly, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void setDefault(boolean z2) {
        this.isDefault = z2;
    }

    public final void setReadOnly(boolean z2) {
        this.isReadOnly = z2;
    }
}
