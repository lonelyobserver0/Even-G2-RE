package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.stub.StubApp;
import java.util.HashMap;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class I extends AbstractBinderC0700x implements J {
    public static J asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String string2 = StubApp.getString2(11682);
        IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
        return queryLocalInterface instanceof J ? (J) queryLocalInterface : new H(iBinder, string2, 1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        boolean z2;
        String string2 = StubApp.getString2(11683);
        String string22 = StubApp.getString2(11676);
        L l9 = null;
        N n10 = null;
        L l10 = null;
        L l11 = null;
        L l12 = null;
        L l13 = null;
        Q q10 = null;
        Q q11 = null;
        Q q12 = null;
        L l14 = null;
        L l15 = null;
        L l16 = null;
        L l17 = null;
        L l18 = null;
        L l19 = null;
        T t3 = null;
        L l20 = null;
        L l21 = null;
        L l22 = null;
        L l23 = null;
        L l24 = null;
        switch (i3) {
            case 1:
                Z3.a N3 = Z3.b.N(parcel.readStrongBinder());
                U u2 = (U) AbstractC0705y.a(parcel, U.CREATOR);
                long readLong = parcel.readLong();
                AbstractC0705y.d(parcel);
                initialize(N3, u2, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                AbstractC0705y.d(parcel);
                logEvent(readString, readString2, bundle, z10, z11, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(string22);
                    l9 = queryLocalInterface instanceof L ? (L) queryLocalInterface : new K(readStrongBinder);
                }
                L l25 = l9;
                long readLong3 = parcel.readLong();
                AbstractC0705y.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, l25, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                Z3.a N10 = Z3.b.N(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC0705y.f11769a;
                z2 = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setUserProperty(readString5, readString6, N10, z2, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC0705y.f11769a;
                z2 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(string22);
                    l24 = queryLocalInterface2 instanceof L ? (L) queryLocalInterface2 : new K(readStrongBinder2);
                }
                AbstractC0705y.d(parcel);
                getUserProperties(readString7, readString8, z2, l24);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface(string22);
                    l23 = queryLocalInterface3 instanceof L ? (L) queryLocalInterface3 : new K(readStrongBinder3);
                }
                AbstractC0705y.d(parcel);
                getMaxUserProperties(readString9, l23);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                AbstractC0705y.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface(string22);
                    l22 = queryLocalInterface4 instanceof L ? (L) queryLocalInterface4 : new K(readStrongBinder4);
                }
                AbstractC0705y.d(parcel);
                getConditionalUserProperties(readString13, readString14, l22);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC0705y.f11769a;
                z2 = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setMeasurementEnabled(z2, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC0705y.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                Z3.a N11 = Z3.b.N(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setCurrentScreen(N11, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface(string22);
                    l21 = queryLocalInterface5 instanceof L ? (L) queryLocalInterface5 : new K(readStrongBinder5);
                }
                AbstractC0705y.d(parcel);
                getCurrentScreenName(l21);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface(string22);
                    l20 = queryLocalInterface6 instanceof L ? (L) queryLocalInterface6 : new K(readStrongBinder6);
                }
                AbstractC0705y.d(parcel);
                getCurrentScreenClass(l20);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    String string23 = StubApp.getString2(11685);
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface(string23);
                    t3 = queryLocalInterface7 instanceof T ? (T) queryLocalInterface7 : new S(readStrongBinder7, string23, 1);
                }
                AbstractC0705y.d(parcel);
                setInstanceIdProvider(t3);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface(string22);
                    l19 = queryLocalInterface8 instanceof L ? (L) queryLocalInterface8 : new K(readStrongBinder8);
                }
                AbstractC0705y.d(parcel);
                getCachedAppInstanceId(l19);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface(string22);
                    l18 = queryLocalInterface9 instanceof L ? (L) queryLocalInterface9 : new K(readStrongBinder9);
                }
                AbstractC0705y.d(parcel);
                getAppInstanceId(l18);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface(string22);
                    l17 = queryLocalInterface10 instanceof L ? (L) queryLocalInterface10 : new K(readStrongBinder10);
                }
                AbstractC0705y.d(parcel);
                getGmpAppId(l17);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface(string22);
                    l16 = queryLocalInterface11 instanceof L ? (L) queryLocalInterface11 : new K(readStrongBinder11);
                }
                AbstractC0705y.d(parcel);
                generateEventId(l16);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC0705y.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC0705y.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                Z3.a N12 = Z3.b.N(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityStarted(N12, readLong14);
                break;
            case 26:
                Z3.a N13 = Z3.b.N(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityStopped(N13, readLong15);
                break;
            case 27:
                Z3.a N14 = Z3.b.N(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityCreated(N14, bundle5, readLong16);
                break;
            case 28:
                Z3.a N15 = Z3.b.N(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityDestroyed(N15, readLong17);
                break;
            case 29:
                Z3.a N16 = Z3.b.N(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityPaused(N16, readLong18);
                break;
            case 30:
                Z3.a N17 = Z3.b.N(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityResumed(N17, readLong19);
                break;
            case 31:
                Z3.a N18 = Z3.b.N(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface(string22);
                    l15 = queryLocalInterface12 instanceof L ? (L) queryLocalInterface12 : new K(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivitySaveInstanceState(N18, l15, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface(string22);
                    l14 = queryLocalInterface13 instanceof L ? (L) queryLocalInterface13 : new K(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                AbstractC0705y.d(parcel);
                performAction(bundle6, l14, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                Z3.a N19 = Z3.b.N(parcel.readStrongBinder());
                Z3.a N20 = Z3.b.N(parcel.readStrongBinder());
                Z3.a N21 = Z3.b.N(parcel.readStrongBinder());
                AbstractC0705y.d(parcel);
                logHealthData(readInt, readString19, N19, N20, N21);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface(string2);
                    q12 = queryLocalInterface14 instanceof Q ? (Q) queryLocalInterface14 : new O(readStrongBinder14);
                }
                AbstractC0705y.d(parcel);
                setEventInterceptor(q12);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface(string2);
                    q11 = queryLocalInterface15 instanceof Q ? (Q) queryLocalInterface15 : new O(readStrongBinder15);
                }
                AbstractC0705y.d(parcel);
                registerOnMeasurementEventListener(q11);
                break;
            case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface(string2);
                    q10 = queryLocalInterface16 instanceof Q ? (Q) queryLocalInterface16 : new O(readStrongBinder16);
                }
                AbstractC0705y.d(parcel);
                unregisterOnMeasurementEventListener(q10);
                break;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                HashMap readHashMap = parcel.readHashMap(AbstractC0705y.f11769a);
                AbstractC0705y.d(parcel);
                initForTests(readHashMap);
                break;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface(string22);
                    l13 = queryLocalInterface17 instanceof L ? (L) queryLocalInterface17 : new K(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                AbstractC0705y.d(parcel);
                getTestFlag(l13, readInt2);
                break;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                ClassLoader classLoader4 = AbstractC0705y.f11769a;
                z2 = parcel.readInt() != 0;
                AbstractC0705y.d(parcel);
                setDataCollectionEnabled(z2);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface(string22);
                    l12 = queryLocalInterface18 instanceof L ? (L) queryLocalInterface18 : new K(readStrongBinder18);
                }
                AbstractC0705y.d(parcel);
                isDataCollectionEnabled(l12);
                break;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.PIN_USAGE_POLICY /* 47 */:
            case 49:
            default:
                return false;
            case EACTags.CURRENCY_CODE /* 42 */:
                Bundle bundle7 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                AbstractC0705y.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                long readLong22 = parcel.readLong();
                AbstractC0705y.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                Bundle bundle8 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                Bundle bundle9 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface(string22);
                    l11 = queryLocalInterface19 instanceof L ? (L) queryLocalInterface19 : new K(readStrongBinder19);
                }
                AbstractC0705y.d(parcel);
                getSessionId(l11);
                break;
            case 48:
                Intent intent = (Intent) AbstractC0705y.a(parcel, Intent.CREATOR);
                AbstractC0705y.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                W w10 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                AbstractC0705y.d(parcel);
                setCurrentScreenByScionActivityInfo(w10, readString20, readString21, readLong25);
                break;
            case EACTags.TRANSACTION_DATE /* 51 */:
                W w11 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                long readLong26 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityStartedByScionActivityInfo(w11, readLong26);
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                W w12 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                long readLong27 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityStoppedByScionActivityInfo(w12, readLong27);
                break;
            case EACTags.SEX /* 53 */:
                W w13 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                Bundle bundle10 = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityCreatedByScionActivityInfo(w13, bundle10, readLong28);
                break;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                W w14 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                long readLong29 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityDestroyedByScionActivityInfo(w14, readLong29);
                break;
            case 55:
                W w15 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                long readLong30 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityPausedByScionActivityInfo(w15, readLong30);
                break;
            case 56:
                W w16 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                long readLong31 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivityResumedByScionActivityInfo(w16, readLong31);
                break;
            case 57:
                W w17 = (W) AbstractC0705y.a(parcel, W.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface(string22);
                    l10 = queryLocalInterface20 instanceof L ? (L) queryLocalInterface20 : new K(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                AbstractC0705y.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(w17, l10, readLong32);
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    String string24 = StubApp.getString2(11684);
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface(string24);
                    n10 = queryLocalInterface21 instanceof N ? (N) queryLocalInterface21 : new M(readStrongBinder21, string24, 1);
                }
                AbstractC0705y.d(parcel);
                retrieveAndUploadBatches(n10);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
