package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ConnectedLaneSequence implements Serializable {
    private final Integer branchingFromSequenceIndex;
    private final List<Integer> incomingMergingSequenceIndexes;
    private final List<Integer> incomingSequenceIndexes;
    private final boolean isDivergent;
    private final boolean isOnRouteLaneGuidanceFinish;
    private final boolean isOnRouteLaneGuidanceStart;
    private final List<Long> laneIds;
    private final double length;
    private final Integer mergingIntoSequenceIndex;
    private final List<Integer> outboundBranchingSequenceIndexes;
    private final List<Integer> outboundSequenceIndexes;
    private final Integer requiredLaneChangeCountNotToDeviate;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ConnectedLaneSequence(List<Long> list, boolean z2, double d8, boolean z10, boolean z11, Integer num, List<Integer> list2, List<Integer> list3, List<Integer> list4, Integer num2, List<Integer> list5, Integer num3) {
        this.laneIds = list;
        this.isDivergent = z2;
        this.length = d8;
        this.isOnRouteLaneGuidanceStart = z10;
        this.isOnRouteLaneGuidanceFinish = z11;
        this.requiredLaneChangeCountNotToDeviate = num;
        this.incomingSequenceIndexes = list2;
        this.outboundSequenceIndexes = list3;
        this.incomingMergingSequenceIndexes = list4;
        this.mergingIntoSequenceIndex = num2;
        this.outboundBranchingSequenceIndexes = list5;
        this.branchingFromSequenceIndex = num3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectedLaneSequence connectedLaneSequence = (ConnectedLaneSequence) obj;
        return Objects.equals(this.laneIds, connectedLaneSequence.laneIds) && this.isDivergent == connectedLaneSequence.isDivergent && PartialEq.compare(this.length, connectedLaneSequence.length) && this.isOnRouteLaneGuidanceStart == connectedLaneSequence.isOnRouteLaneGuidanceStart && this.isOnRouteLaneGuidanceFinish == connectedLaneSequence.isOnRouteLaneGuidanceFinish && Objects.equals(this.requiredLaneChangeCountNotToDeviate, connectedLaneSequence.requiredLaneChangeCountNotToDeviate) && Objects.equals(this.incomingSequenceIndexes, connectedLaneSequence.incomingSequenceIndexes) && Objects.equals(this.outboundSequenceIndexes, connectedLaneSequence.outboundSequenceIndexes) && Objects.equals(this.incomingMergingSequenceIndexes, connectedLaneSequence.incomingMergingSequenceIndexes) && Objects.equals(this.mergingIntoSequenceIndex, connectedLaneSequence.mergingIntoSequenceIndex) && Objects.equals(this.outboundBranchingSequenceIndexes, connectedLaneSequence.outboundBranchingSequenceIndexes) && Objects.equals(this.branchingFromSequenceIndex, connectedLaneSequence.branchingFromSequenceIndex);
    }

    public Integer getBranchingFromSequenceIndex() {
        return this.branchingFromSequenceIndex;
    }

    public List<Integer> getIncomingMergingSequenceIndexes() {
        return this.incomingMergingSequenceIndexes;
    }

    public List<Integer> getIncomingSequenceIndexes() {
        return this.incomingSequenceIndexes;
    }

    public boolean getIsDivergent() {
        return this.isDivergent;
    }

    public boolean getIsOnRouteLaneGuidanceFinish() {
        return this.isOnRouteLaneGuidanceFinish;
    }

    public boolean getIsOnRouteLaneGuidanceStart() {
        return this.isOnRouteLaneGuidanceStart;
    }

    public List<Long> getLaneIds() {
        return this.laneIds;
    }

    public double getLength() {
        return this.length;
    }

    public Integer getMergingIntoSequenceIndex() {
        return this.mergingIntoSequenceIndex;
    }

    public List<Integer> getOutboundBranchingSequenceIndexes() {
        return this.outboundBranchingSequenceIndexes;
    }

    public List<Integer> getOutboundSequenceIndexes() {
        return this.outboundSequenceIndexes;
    }

    public Integer getRequiredLaneChangeCountNotToDeviate() {
        return this.requiredLaneChangeCountNotToDeviate;
    }

    public int hashCode() {
        return Objects.hash(this.laneIds, Boolean.valueOf(this.isDivergent), Double.valueOf(this.length), Boolean.valueOf(this.isOnRouteLaneGuidanceStart), Boolean.valueOf(this.isOnRouteLaneGuidanceFinish), this.requiredLaneChangeCountNotToDeviate, this.incomingSequenceIndexes, this.outboundSequenceIndexes, this.incomingMergingSequenceIndexes, this.mergingIntoSequenceIndex, this.outboundBranchingSequenceIndexes, this.branchingFromSequenceIndex);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[laneIds: ");
        b.v(", isDivergent: ", sb2, this.laneIds);
        h.A(this.isDivergent, sb2, ", length: ");
        b.m(this.length, sb2, ", isOnRouteLaneGuidanceStart: ");
        h.A(this.isOnRouteLaneGuidanceStart, sb2, ", isOnRouteLaneGuidanceFinish: ");
        h.A(this.isOnRouteLaneGuidanceFinish, sb2, ", requiredLaneChangeCountNotToDeviate: ");
        b.t(this.requiredLaneChangeCountNotToDeviate, sb2, ", incomingSequenceIndexes: ");
        b.v(", outboundSequenceIndexes: ", sb2, this.incomingSequenceIndexes);
        b.v(", incomingMergingSequenceIndexes: ", sb2, this.outboundSequenceIndexes);
        b.v(", mergingIntoSequenceIndex: ", sb2, this.incomingMergingSequenceIndexes);
        b.t(this.mergingIntoSequenceIndex, sb2, ", outboundBranchingSequenceIndexes: ");
        b.v(", branchingFromSequenceIndex: ", sb2, this.outboundBranchingSequenceIndexes);
        sb2.append(RecordUtils.fieldToString(this.branchingFromSequenceIndex));
        sb2.append("]");
        return sb2.toString();
    }
}
