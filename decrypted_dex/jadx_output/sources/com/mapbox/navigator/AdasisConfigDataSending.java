package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AdasisConfigDataSending implements Serializable {
    private final boolean continuePathOnOffsetOverflow;
    private final boolean enableRetransmission;
    private final int messageIntervalMs;
    private final int messagesInPackage;
    private final int metadataCycleSeconds;
    private final MessageBinaryFormat outputBinaryFormat;
    private final int retransmissionMeters;
    private final boolean setRouteIsReset;
    private final int treeTrailingLength;
    private final boolean updatesEnabled;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigDataSending(MessageBinaryFormat messageBinaryFormat, int i3, int i10, int i11, boolean z2, int i12, int i13, boolean z10, boolean z11, boolean z12) {
        this.outputBinaryFormat = messageBinaryFormat;
        this.messageIntervalMs = i3;
        this.messagesInPackage = i10;
        this.metadataCycleSeconds = i11;
        this.enableRetransmission = z2;
        this.retransmissionMeters = i12;
        this.treeTrailingLength = i13;
        this.updatesEnabled = z10;
        this.continuePathOnOffsetOverflow = z11;
        this.setRouteIsReset = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigDataSending adasisConfigDataSending = (AdasisConfigDataSending) obj;
        return Objects.equals(this.outputBinaryFormat, adasisConfigDataSending.outputBinaryFormat) && this.messageIntervalMs == adasisConfigDataSending.messageIntervalMs && this.messagesInPackage == adasisConfigDataSending.messagesInPackage && this.metadataCycleSeconds == adasisConfigDataSending.metadataCycleSeconds && this.enableRetransmission == adasisConfigDataSending.enableRetransmission && this.retransmissionMeters == adasisConfigDataSending.retransmissionMeters && this.treeTrailingLength == adasisConfigDataSending.treeTrailingLength && this.updatesEnabled == adasisConfigDataSending.updatesEnabled && this.continuePathOnOffsetOverflow == adasisConfigDataSending.continuePathOnOffsetOverflow && this.setRouteIsReset == adasisConfigDataSending.setRouteIsReset;
    }

    public boolean getContinuePathOnOffsetOverflow() {
        return this.continuePathOnOffsetOverflow;
    }

    public boolean getEnableRetransmission() {
        return this.enableRetransmission;
    }

    public int getMessageIntervalMs() {
        return this.messageIntervalMs;
    }

    public int getMessagesInPackage() {
        return this.messagesInPackage;
    }

    public int getMetadataCycleSeconds() {
        return this.metadataCycleSeconds;
    }

    public MessageBinaryFormat getOutputBinaryFormat() {
        return this.outputBinaryFormat;
    }

    public int getRetransmissionMeters() {
        return this.retransmissionMeters;
    }

    public boolean getSetRouteIsReset() {
        return this.setRouteIsReset;
    }

    public int getTreeTrailingLength() {
        return this.treeTrailingLength;
    }

    public boolean getUpdatesEnabled() {
        return this.updatesEnabled;
    }

    public int hashCode() {
        return Objects.hash(this.outputBinaryFormat, Integer.valueOf(this.messageIntervalMs), Integer.valueOf(this.messagesInPackage), Integer.valueOf(this.metadataCycleSeconds), Boolean.valueOf(this.enableRetransmission), Integer.valueOf(this.retransmissionMeters), Integer.valueOf(this.treeTrailingLength), Boolean.valueOf(this.updatesEnabled), Boolean.valueOf(this.continuePathOnOffsetOverflow), Boolean.valueOf(this.setRouteIsReset));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[outputBinaryFormat: ");
        sb2.append(RecordUtils.fieldToString(this.outputBinaryFormat));
        sb2.append(", messageIntervalMs: ");
        b.o(this.messageIntervalMs, ", messagesInPackage: ", sb2);
        b.o(this.messagesInPackage, ", metadataCycleSeconds: ", sb2);
        b.o(this.metadataCycleSeconds, ", enableRetransmission: ", sb2);
        h.A(this.enableRetransmission, sb2, ", retransmissionMeters: ");
        b.o(this.retransmissionMeters, ", treeTrailingLength: ", sb2);
        b.o(this.treeTrailingLength, ", updatesEnabled: ", sb2);
        h.A(this.updatesEnabled, sb2, ", continuePathOnOffsetOverflow: ");
        h.A(this.continuePathOnOffsetOverflow, sb2, ", setRouteIsReset: ");
        return b.k(this.setRouteIsReset, sb2, "]");
    }

    public AdasisConfigDataSending(MessageBinaryFormat messageBinaryFormat) {
        this.outputBinaryFormat = messageBinaryFormat;
        this.messageIntervalMs = 100;
        this.messagesInPackage = 4;
        this.metadataCycleSeconds = 5;
        this.enableRetransmission = false;
        this.retransmissionMeters = 100;
        this.treeTrailingLength = 300;
        this.updatesEnabled = true;
        this.continuePathOnOffsetOverflow = true;
        this.setRouteIsReset = true;
    }
}
