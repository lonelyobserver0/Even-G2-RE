package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import c4.AbstractC0566a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class H extends AbstractC0566a implements J {
    @Override // com.google.android.gms.internal.measurement.J
    public final void beginAdUnitExposure(String str, long j) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeLong(j);
        L(g10, 23);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        AbstractC0705y.b(g10, bundle);
        L(g10, 9);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void endAdUnitExposure(String str, long j) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeLong(j);
        L(g10, 24);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void generateEventId(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 22);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getAppInstanceId(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 20);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getCachedAppInstanceId(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 19);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getConditionalUserProperties(String str, String str2, L l9) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        AbstractC0705y.c(g10, l9);
        L(g10, 10);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getCurrentScreenClass(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 17);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getCurrentScreenName(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 16);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getGmpAppId(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 21);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getMaxUserProperties(String str, L l9) {
        Parcel g10 = g();
        g10.writeString(str);
        AbstractC0705y.c(g10, l9);
        L(g10, 6);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getSessionId(L l9) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, l9);
        L(g10, 46);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void getUserProperties(String str, String str2, boolean z2, L l9) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        ClassLoader classLoader = AbstractC0705y.f11769a;
        g10.writeInt(z2 ? 1 : 0);
        AbstractC0705y.c(g10, l9);
        L(g10, 5);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void initialize(Z3.a aVar, U u2, long j) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, aVar);
        AbstractC0705y.b(g10, u2);
        g10.writeLong(j);
        L(g10, 1);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        AbstractC0705y.b(g10, bundle);
        g10.writeInt(z2 ? 1 : 0);
        g10.writeInt(1);
        g10.writeLong(j);
        L(g10, 2);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void logHealthData(int i3, String str, Z3.a aVar, Z3.a aVar2, Z3.a aVar3) {
        Parcel g10 = g();
        g10.writeInt(5);
        g10.writeString(str);
        AbstractC0705y.c(g10, aVar);
        AbstractC0705y.c(g10, aVar2);
        AbstractC0705y.c(g10, aVar3);
        L(g10, 33);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityCreatedByScionActivityInfo(W w10, Bundle bundle, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        AbstractC0705y.b(g10, bundle);
        g10.writeLong(j);
        L(g10, 53);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityDestroyedByScionActivityInfo(W w10, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        g10.writeLong(j);
        L(g10, 54);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityPausedByScionActivityInfo(W w10, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        g10.writeLong(j);
        L(g10, 55);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityResumedByScionActivityInfo(W w10, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        g10.writeLong(j);
        L(g10, 56);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivitySaveInstanceStateByScionActivityInfo(W w10, L l9, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        AbstractC0705y.c(g10, l9);
        g10.writeLong(j);
        L(g10, 57);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityStartedByScionActivityInfo(W w10, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        g10.writeLong(j);
        L(g10, 51);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void onActivityStoppedByScionActivityInfo(W w10, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        g10.writeLong(j);
        L(g10, 52);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void registerOnMeasurementEventListener(Q q10) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, q10);
        L(g10, 35);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void resetAnalyticsData(long j) {
        Parcel g10 = g();
        g10.writeLong(j);
        L(g10, 12);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void retrieveAndUploadBatches(N n10) {
        Parcel g10 = g();
        AbstractC0705y.c(g10, n10);
        L(g10, 58);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, bundle);
        g10.writeLong(j);
        L(g10, 8);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, bundle);
        g10.writeLong(j);
        L(g10, 45);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setCurrentScreenByScionActivityInfo(W w10, String str, String str2, long j) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, w10);
        g10.writeString(str);
        g10.writeString(str2);
        g10.writeLong(j);
        L(g10, 50);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setDataCollectionEnabled(boolean z2) {
        Parcel g10 = g();
        ClassLoader classLoader = AbstractC0705y.f11769a;
        g10.writeInt(z2 ? 1 : 0);
        L(g10, 39);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel g10 = g();
        AbstractC0705y.b(g10, bundle);
        L(g10, 42);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setMeasurementEnabled(boolean z2, long j) {
        Parcel g10 = g();
        ClassLoader classLoader = AbstractC0705y.f11769a;
        g10.writeInt(z2 ? 1 : 0);
        g10.writeLong(j);
        L(g10, 11);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setSessionTimeoutDuration(long j) {
        Parcel g10 = g();
        g10.writeLong(j);
        L(g10, 14);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setUserId(String str, long j) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeLong(j);
        L(g10, 7);
    }

    @Override // com.google.android.gms.internal.measurement.J
    public final void setUserProperty(String str, String str2, Z3.a aVar, boolean z2, long j) {
        Parcel g10 = g();
        g10.writeString(str);
        g10.writeString(str2);
        AbstractC0705y.c(g10, aVar);
        g10.writeInt(z2 ? 1 : 0);
        g10.writeLong(j);
        L(g10, 4);
    }
}
