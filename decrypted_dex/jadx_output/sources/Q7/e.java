package Q7;

import com.mapbox.navigator.ElectronicHorizonResultType;
import com.mapbox.navigator.FunctionalRoadClass;
import com.mapbox.navigator.RoadObjectProvider;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.RoadSurface;
import com.mapbox.navigator.match.openlr.Orientation;
import com.mapbox.navigator.match.openlr.SideOfRoad;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5758a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f5759b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f5760c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int[] f5761d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int[] f5762e;

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
        f5758a = iArr;
        int[] iArr2 = new int[SideOfRoad.values().length];
        try {
            iArr2[SideOfRoad.BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[SideOfRoad.LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[SideOfRoad.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[SideOfRoad.ON_ROAD_OR_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        f5759b = iArr2;
        int[] iArr3 = new int[Orientation.values().length];
        try {
            iArr3[Orientation.BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[Orientation.NO_ORIENTATION_OR_UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[Orientation.WITH_LINE_DIRECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[Orientation.AGAINST_LINE_DIRECTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        f5760c = iArr3;
        int[] iArr4 = new int[RoadObjectProvider.values().length];
        try {
            iArr4[RoadObjectProvider.MAPBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[RoadObjectProvider.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        f5761d = iArr4;
        int[] iArr5 = new int[FunctionalRoadClass.values().length];
        try {
            iArr5[FunctionalRoadClass.MOTORWAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[FunctionalRoadClass.TRUNK.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[FunctionalRoadClass.PRIMARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[FunctionalRoadClass.SECONDARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr5[FunctionalRoadClass.TERTIARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr5[FunctionalRoadClass.UNCLASSIFIED.ordinal()] = 6;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr5[FunctionalRoadClass.RESIDENTIAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[FunctionalRoadClass.SERVICE_OTHER.ordinal()] = 8;
        } catch (NoSuchFieldError unused31) {
        }
        int[] iArr6 = new int[ElectronicHorizonResultType.values().length];
        try {
            iArr6[ElectronicHorizonResultType.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr6[ElectronicHorizonResultType.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[ElectronicHorizonResultType.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused34) {
        }
        f5762e = iArr6;
        int[] iArr7 = new int[RoadSurface.values().length];
        try {
            iArr7[RoadSurface.PAVED_SMOOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr7[RoadSurface.PAVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr7[RoadSurface.PAVED_ROUGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr7[RoadSurface.COMPACTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr7[RoadSurface.DIRT.ordinal()] = 5;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr7[RoadSurface.GRAVEL.ordinal()] = 6;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr7[RoadSurface.PATH.ordinal()] = 7;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr7[RoadSurface.IMPASSABLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused42) {
        }
    }
}
