package com.mapbox.navigation.copilot;

import Xa.h;
import androidx.annotation.Keep;
import com.stub.StubApp;
import i2.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000f¨\u0006/"}, d2 = {"Lcom/mapbox/navigation/copilot/AttachmentMetadata;", "", "name", "", "created", "fileId", "format", "type", "sessionId", "size", "", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCreated", "()Ljava/lang/String;", "getEndTime", "setEndTime", "(Ljava/lang/String;)V", "getFileId", "getFormat", "getName", "getSessionId", "getSize", "()Ljava/lang/Integer;", "setSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStartTime", "setStartTime", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/navigation/copilot/AttachmentMetadata;", "equals", "", "other", "hashCode", "toString", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class AttachmentMetadata {
    private final String created;
    private String endTime;
    private final String fileId;
    private final String format;
    private final String name;
    private final String sessionId;
    private Integer size;
    private String startTime;
    private final String type;

    public AttachmentMetadata(String name, String created, String fileId, String format, String type, String sessionId, Integer num, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(created, "created");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.name = name;
        this.created = created;
        this.fileId = fileId;
        this.format = format;
        this.type = type;
        this.sessionId = sessionId;
        this.size = num;
        this.startTime = str;
        this.endTime = str2;
    }

    public static /* synthetic */ AttachmentMetadata copy$default(AttachmentMetadata attachmentMetadata, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = attachmentMetadata.name;
        }
        if ((i3 & 2) != 0) {
            str2 = attachmentMetadata.created;
        }
        if ((i3 & 4) != 0) {
            str3 = attachmentMetadata.fileId;
        }
        if ((i3 & 8) != 0) {
            str4 = attachmentMetadata.format;
        }
        if ((i3 & 16) != 0) {
            str5 = attachmentMetadata.type;
        }
        if ((i3 & 32) != 0) {
            str6 = attachmentMetadata.sessionId;
        }
        if ((i3 & 64) != 0) {
            num = attachmentMetadata.size;
        }
        if ((i3 & 128) != 0) {
            str7 = attachmentMetadata.startTime;
        }
        if ((i3 & 256) != 0) {
            str8 = attachmentMetadata.endTime;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        Integer num2 = num;
        String str12 = str5;
        String str13 = str3;
        return attachmentMetadata.copy(str, str2, str13, str4, str12, str11, num2, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreated() {
        return this.created;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    public final AttachmentMetadata copy(String name, String created, String fileId, String format, String type, String sessionId, Integer size, String startTime, String endTime) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(created, "created");
        Intrinsics.checkNotNullParameter(fileId, "fileId");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(type, StubApp.getString2(660));
        Intrinsics.checkNotNullParameter(sessionId, StubApp.getString2(2649));
        return new AttachmentMetadata(name, created, fileId, format, type, sessionId, size, startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentMetadata)) {
            return false;
        }
        AttachmentMetadata attachmentMetadata = (AttachmentMetadata) other;
        return Intrinsics.areEqual(this.name, attachmentMetadata.name) && Intrinsics.areEqual(this.created, attachmentMetadata.created) && Intrinsics.areEqual(this.fileId, attachmentMetadata.fileId) && Intrinsics.areEqual(this.format, attachmentMetadata.format) && Intrinsics.areEqual(this.type, attachmentMetadata.type) && Intrinsics.areEqual(this.sessionId, attachmentMetadata.sessionId) && Intrinsics.areEqual(this.size, attachmentMetadata.size) && Intrinsics.areEqual(this.startTime, attachmentMetadata.startTime) && Intrinsics.areEqual(this.endTime, attachmentMetadata.endTime);
    }

    public final String getCreated() {
        return this.created;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int d8 = u.d(u.d(u.d(u.d(u.d(this.name.hashCode() * 31, 31, this.created), 31, this.fileId), 31, this.format), 31, this.type), 31, this.sessionId);
        Integer num = this.size;
        int hashCode = (d8 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.startTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTime;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEndTime(String str) {
        this.endTime = str;
    }

    public final void setSize(Integer num) {
        this.size = num;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14648));
        sb2.append(this.name);
        sb2.append(StubApp.getString2(14649));
        sb2.append(this.created);
        sb2.append(StubApp.getString2(14650));
        sb2.append(this.fileId);
        sb2.append(StubApp.getString2(14651));
        sb2.append(this.format);
        sb2.append(StubApp.getString2(2148));
        sb2.append(this.type);
        sb2.append(StubApp.getString2(9442));
        sb2.append(this.sessionId);
        sb2.append(StubApp.getString2(14652));
        sb2.append(this.size);
        sb2.append(StubApp.getString2(7298));
        sb2.append(this.startTime);
        sb2.append(StubApp.getString2(7299));
        return h.s(sb2, this.endTime, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AttachmentMetadata(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 2
            if (r1 == 0) goto Lf
            java.lang.String r14 = com.mapbox.common.TelemetrySystemUtils.obtainCurrentDate()
            java.lang.String r1 = "obtainCurrentDate()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r1)
        Lf:
            r4 = r14
            r14 = r0 & 64
            r1 = 0
            if (r14 == 0) goto L17
            r9 = r1
            goto L19
        L17:
            r9 = r19
        L19:
            r14 = r0 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L1f
            r10 = r1
            goto L21
        L1f:
            r10 = r20
        L21:
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L30
            r11 = r1
        L26:
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            goto L33
        L30:
            r11 = r21
            goto L26
        L33:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.copilot.AttachmentMetadata.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
