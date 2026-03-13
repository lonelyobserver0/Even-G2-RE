package R7;

import com.mapbox.navigator.AmenityType;
import com.mapbox.navigator.IncidentImpact;
import com.mapbox.navigator.IncidentType;
import com.mapbox.navigator.MergingAreaType;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.ServiceAreaType;
import com.mapbox.navigator.TollCollectionType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6235a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f6236b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f6237c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f6238d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f6239e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int[] f6240f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f6241g;

    static {
        int[] iArr = new int[RoadObjectType.values().length];
        try {
            iArr[RoadObjectType.INCIDENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoadObjectType.TOLL_COLLECTION_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoadObjectType.BORDER_CROSSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RoadObjectType.TUNNEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RoadObjectType.RESTRICTED_AREA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RoadObjectType.SERVICE_AREA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RoadObjectType.BRIDGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RoadObjectType.CUSTOM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[RoadObjectType.RAILWAY_CROSSING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[RoadObjectType.IC.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[RoadObjectType.JCT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[RoadObjectType.NOTIFICATION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[RoadObjectType.MERGING_AREA.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        f6235a = iArr;
        int[] iArr2 = new int[TollCollectionType.values().length];
        try {
            iArr2[TollCollectionType.TOLL_BOOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[TollCollectionType.TOLL_GANTRY.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f6236b = iArr2;
        int[] iArr3 = new int[ServiceAreaType.values().length];
        try {
            iArr3[ServiceAreaType.REST_AREA.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[ServiceAreaType.SERVICE_AREA.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f6237c = iArr3;
        int[] iArr4 = new int[AmenityType.values().length];
        try {
            iArr4[AmenityType.ATM.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[AmenityType.BABY_CARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[AmenityType.COFFEE.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[AmenityType.ELECTRIC_CHARGING_STATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[AmenityType.FAX.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[AmenityType.FACILITIES_FOR_DISABLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[AmenityType.GAS_STATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[AmenityType.HOTEL.ordinal()] = 8;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[AmenityType.HOTSPRING.ordinal()] = 9;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[AmenityType.INFO.ordinal()] = 10;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[AmenityType.POST.ordinal()] = 11;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[AmenityType.PICNIC_SHELTER.ordinal()] = 12;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[AmenityType.RESTAURANT.ordinal()] = 13;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[AmenityType.SHOP.ordinal()] = 14;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[AmenityType.SHOWER.ordinal()] = 15;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[AmenityType.SNACK.ordinal()] = 16;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr4[AmenityType.TELEPHONE.ordinal()] = 17;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr4[AmenityType.TOILET.ordinal()] = 18;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr4[AmenityType.UNDEFINED.ordinal()] = 19;
        } catch (NoSuchFieldError unused36) {
        }
        f6238d = iArr4;
        int[] iArr5 = new int[IncidentType.values().length];
        try {
            iArr5[IncidentType.ACCIDENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr5[IncidentType.CONGESTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr5[IncidentType.CONSTRUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr5[IncidentType.DISABLED_VEHICLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr5[IncidentType.LANE_RESTRICTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr5[IncidentType.MASS_TRANSIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr5[IncidentType.MISCELLANEOUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr5[IncidentType.OTHER_NEWS.ordinal()] = 8;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr5[IncidentType.PLANNED_EVENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr5[IncidentType.ROAD_CLOSURE.ordinal()] = 10;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr5[IncidentType.ROAD_HAZARD.ordinal()] = 11;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr5[IncidentType.WEATHER.ordinal()] = 12;
        } catch (NoSuchFieldError unused48) {
        }
        f6239e = iArr5;
        int[] iArr6 = new int[IncidentImpact.values().length];
        try {
            iArr6[IncidentImpact.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr6[IncidentImpact.CRITICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr6[IncidentImpact.MAJOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr6[IncidentImpact.MINOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr6[IncidentImpact.LOW.ordinal()] = 5;
        } catch (NoSuchFieldError unused53) {
        }
        f6240f = iArr6;
        int[] iArr7 = new int[MergingAreaType.values().length];
        try {
            iArr7[MergingAreaType.FROM_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr7[MergingAreaType.FROM_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr7[MergingAreaType.FROM_BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused56) {
        }
        f6241g = iArr7;
    }
}
