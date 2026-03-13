package C7;

import Q7.e;
import R7.b;
import R7.c;
import R7.f;
import a8.C0392a;
import a8.C0393b;
import b8.C0532a;
import c8.C0575a;
import c8.C0576b;
import com.mapbox.navigator.AdminInfo;
import com.mapbox.navigator.Amenity;
import com.mapbox.navigator.AmenityType;
import com.mapbox.navigator.IncidentCongestion;
import com.mapbox.navigator.IncidentImpact;
import com.mapbox.navigator.IncidentInfo;
import com.mapbox.navigator.IncidentType;
import com.mapbox.navigator.LocalizedString;
import com.mapbox.navigator.MergingAreaInfo;
import com.mapbox.navigator.RoadObject;
import com.mapbox.navigator.RoadObjectProvider;
import com.mapbox.navigator.RoadObjectType;
import com.mapbox.navigator.ServiceAreaInfo;
import com.mapbox.navigator.TollCollectionInfo;
import com.mapbox.navigator.TunnelInfo;
import com.mapbox.navigator.UpcomingRouteAlertUpdate;
import com.stub.StubApp;
import e8.C0851a;
import e8.C0852b;
import f8.C0932a;
import g8.C0963a;
import g8.C0964b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final RoadObjectType[] f1133a = {RoadObjectType.INCIDENT, RoadObjectType.TOLL_COLLECTION_POINT, RoadObjectType.BORDER_CROSSING, RoadObjectType.TUNNEL, RoadObjectType.RESTRICTED_AREA, RoadObjectType.SERVICE_AREA, RoadObjectType.BRIDGE, RoadObjectType.CUSTOM, RoadObjectType.RAILWAY_CROSSING, RoadObjectType.IC, RoadObjectType.JCT, RoadObjectType.MERGING_AREA};

    public static b a(RoadObject nativeRoadObject) {
        String string2;
        int i3;
        String string22;
        String string23;
        String string24;
        Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
        Intrinsics.checkNotNullParameter(nativeRoadObject, "<this>");
        RoadObjectProvider provider = nativeRoadObject.getProvider();
        Intrinsics.checkNotNullExpressionValue(provider, "provider");
        Intrinsics.checkNotNullParameter(provider, "<this>");
        int i10 = e.f5761d[provider.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            string2 = StubApp.getString2(1141);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = StubApp.getString2(1140);
        }
        String provider2 = string2;
        int i12 = c.f6235a[nativeRoadObject.getType().ordinal()];
        String string25 = StubApp.getString2(1061);
        String string26 = StubApp.getString2(1142);
        String string27 = StubApp.getString2(345);
        String string28 = StubApp.getString2(290);
        switch (i12) {
            case 1:
                String id = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id, string28);
                IncidentInfo incidentInfo = nativeRoadObject.getMetadata().getIncidentInfo();
                Intrinsics.checkNotNullExpressionValue(incidentInfo, "metadata.incidentInfo");
                String id2 = incidentInfo.getId();
                Intrinsics.checkNotNullExpressionValue(id2, string28);
                IncidentType type = incidentInfo.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
                switch (c.f6239e[type.ordinal()]) {
                    case 1:
                        i3 = 41;
                        break;
                    case 2:
                        i3 = 42;
                        break;
                    case 3:
                        i3 = 43;
                        break;
                    case 4:
                        i3 = 44;
                        break;
                    case 5:
                        i3 = 45;
                        break;
                    case 6:
                        i3 = 46;
                        break;
                    case 7:
                        i3 = 47;
                        break;
                    case 8:
                        i3 = 48;
                        break;
                    case 9:
                        i3 = 49;
                        break;
                    case 10:
                        i3 = 50;
                        break;
                    case 11:
                        i3 = 51;
                        break;
                    case 12:
                        i3 = 52;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i13 = i3;
                IncidentImpact impact = incidentInfo.getImpact();
                Intrinsics.checkNotNullExpressionValue(impact, "impact");
                int i14 = c.f6240f[impact.ordinal()];
                if (i14 == 1) {
                    string22 = StubApp.getString2(351);
                } else if (i14 == 2) {
                    string22 = StubApp.getString2(1167);
                } else if (i14 == 3) {
                    string22 = StubApp.getString2(1166);
                } else if (i14 == 4) {
                    string22 = StubApp.getString2(1165);
                } else {
                    if (i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string22 = StubApp.getString2(347);
                }
                String str = string22;
                IncidentCongestion congestion = incidentInfo.getCongestion();
                X7.b bVar = congestion != null ? new X7.b(congestion.getValue()) : null;
                boolean roadClosed = incidentInfo.getRoadClosed();
                Date creationTime = incidentInfo.getCreationTime();
                Date startTime = incidentInfo.getStartTime();
                Date endTime = incidentInfo.getEndTime();
                String description = incidentInfo.getDescription();
                String subType = incidentInfo.getSubType();
                String subTypeDescription = incidentInfo.getSubTypeDescription();
                List<Integer> alertcCodes = incidentInfo.getAlertcCodes();
                HashMap<String, Integer> trafficCodes = incidentInfo.getTrafficCodes();
                Intrinsics.checkNotNullExpressionValue(trafficCodes, "trafficCodes");
                String iso_3166_1_alpha2 = incidentInfo.getIso_3166_1_alpha2();
                String iso_3166_1_alpha3 = incidentInfo.getIso_3166_1_alpha3();
                List<String> lanesBlocked = incidentInfo.getLanesBlocked();
                Intrinsics.checkNotNullExpressionValue(lanesBlocked, "lanesBlocked");
                String longDescription = incidentInfo.getLongDescription();
                String lanesClearDesc = incidentInfo.getLanesClearDesc();
                Long numLanesBlocked = incidentInfo.getNumLanesBlocked();
                List<String> affectedRoadNames = incidentInfo.getAffectedRoadNames();
                HashMap<String, List<String>> multiLingualAffectedRoadNames = incidentInfo.getMultiLingualAffectedRoadNames();
                Intrinsics.checkNotNullExpressionValue(multiLingualAffectedRoadNames, "multiLingualAffectedRoadNames");
                return new X7.a(id, new X7.c(id2, i13, str, bVar, roadClosed, creationTime, startTime, endTime, description, subType, subTypeDescription, alertcCodes, trafficCodes, iso_3166_1_alpha2, iso_3166_1_alpha3, lanesBlocked, longDescription, lanesClearDesc, numLanesBlocked, affectedRoadNames, multiLingualAffectedRoadNames, incidentInfo.getLength()), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 2:
                String id3 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id3, string28);
                TollCollectionInfo tollCollectionInfo = nativeRoadObject.getMetadata().getTollCollectionInfo();
                Intrinsics.checkNotNullExpressionValue(tollCollectionInfo, "metadata.tollCollectionInfo");
                int i15 = c.f6236b[tollCollectionInfo.getType().ordinal()];
                if (i15 == 1) {
                    i11 = 1;
                } else if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return new C0932a(id3, i11, nativeRoadObject.getMetadata().getTollCollectionInfo().getName(), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 3:
                String id4 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id4, string28);
                AdminInfo from = nativeRoadObject.getMetadata().getBorderCrossingInfo().getFrom();
                Intrinsics.checkNotNullExpressionValue(from, "metadata.borderCrossingInfo.from");
                String iso_3166_1 = from.getIso_3166_1();
                Intrinsics.checkNotNullExpressionValue(iso_3166_1, "iso_3166_1");
                String iso_3166_1_alpha32 = from.getIso_3166_1_alpha3();
                Intrinsics.checkNotNullExpressionValue(iso_3166_1_alpha32, "iso_3166_1_alpha3");
                S7.b bVar2 = new S7.b(iso_3166_1, iso_3166_1_alpha32);
                AdminInfo to = nativeRoadObject.getMetadata().getBorderCrossingInfo().getTo();
                Intrinsics.checkNotNullExpressionValue(to, "metadata.borderCrossingInfo.to");
                String iso_3166_12 = to.getIso_3166_1();
                Intrinsics.checkNotNullExpressionValue(iso_3166_12, "iso_3166_1");
                String iso_3166_1_alpha33 = to.getIso_3166_1_alpha3();
                Intrinsics.checkNotNullExpressionValue(iso_3166_1_alpha33, "iso_3166_1_alpha3");
                return new S7.a(id4, new S7.c(bVar2, new S7.b(iso_3166_12, iso_3166_1_alpha33)), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 4:
                String id5 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id5, string28);
                TunnelInfo tunnelInfo = nativeRoadObject.getMetadata().getTunnelInfo();
                Intrinsics.checkNotNullExpressionValue(tunnelInfo, "metadata.tunnelInfo");
                return new C0963a(id5, new C0964b(tunnelInfo.getName()), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 5:
                String id6 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id6, string28);
                Double length = nativeRoadObject.getLength();
                Boolean isUrban = nativeRoadObject.getIsUrban();
                Intrinsics.checkNotNullParameter(id6, string28);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
                return new C0532a(id6, 4, length, provider2, isUrban, nativeRoadObject, 3);
            case 6:
                String id7 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id7, string28);
                ServiceAreaInfo serviceAreaInfo = nativeRoadObject.getMetadata().getServiceAreaInfo();
                Intrinsics.checkNotNullExpressionValue(serviceAreaInfo, "metadata.serviceAreaInfo");
                int i16 = c.f6237c[serviceAreaInfo.getType().ordinal()];
                if (i16 == 1) {
                    i11 = 1;
                } else if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String name = nativeRoadObject.getMetadata().getServiceAreaInfo().getName();
                List<Amenity> amenities = nativeRoadObject.getMetadata().getServiceAreaInfo().getAmenities();
                Intrinsics.checkNotNullExpressionValue(amenities, "metadata.serviceAreaInfo.amenities");
                ArrayList arrayList = new ArrayList(CollectionsKt.f(amenities));
                for (Amenity amenity : amenities) {
                    AmenityType type2 = amenity.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "amenity.type");
                    switch (c.f6238d[type2.ordinal()]) {
                        case 1:
                            string23 = StubApp.getString2(1164);
                            break;
                        case 2:
                            string23 = StubApp.getString2(1163);
                            break;
                        case 3:
                            string23 = StubApp.getString2(1162);
                            break;
                        case 4:
                            string23 = StubApp.getString2(1161);
                            break;
                        case 5:
                            string23 = StubApp.getString2(1160);
                            break;
                        case 6:
                            string23 = StubApp.getString2(1159);
                            break;
                        case 7:
                            string23 = StubApp.getString2(1158);
                            break;
                        case 8:
                            string23 = StubApp.getString2(1157);
                            break;
                        case 9:
                            string23 = StubApp.getString2(1156);
                            break;
                        case 10:
                            string23 = StubApp.getString2(1155);
                            break;
                        case 11:
                            string23 = StubApp.getString2(1154);
                            break;
                        case 12:
                            string23 = StubApp.getString2(1153);
                            break;
                        case 13:
                            string23 = StubApp.getString2(1152);
                            break;
                        case 14:
                            string23 = StubApp.getString2(1151);
                            break;
                        case 15:
                            string23 = StubApp.getString2(1150);
                            break;
                        case 16:
                            string23 = StubApp.getString2(1149);
                            break;
                        case 17:
                            string23 = StubApp.getString2(1148);
                            break;
                        case 18:
                            string23 = StubApp.getString2(1147);
                            break;
                        case 19:
                            string23 = StubApp.getString2(1146);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(new C0851a(string23, amenity.getName(), amenity.getBrand()));
                }
                return new C0852b(id7, i11, name, arrayList, nativeRoadObject.getMetadata().getServiceAreaInfo().getGuideMapUri(), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 7:
                String id8 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id8, string28);
                Double length2 = nativeRoadObject.getLength();
                Boolean isUrban2 = nativeRoadObject.getIsUrban();
                Intrinsics.checkNotNullParameter(id8, string28);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
                return new C0532a(id8, 5, length2, provider2, isUrban2, nativeRoadObject, 1);
            case 8:
                String id9 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id9, string28);
                Double length3 = nativeRoadObject.getLength();
                Boolean isUrban3 = nativeRoadObject.getIsUrban();
                Intrinsics.checkNotNullParameter(id9, string28);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
                return new C0532a(id9, 7, length3, provider2, isUrban3, nativeRoadObject, 2);
            case 9:
                String id10 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id10, string28);
                Intrinsics.checkNotNullExpressionValue(nativeRoadObject.getMetadata().getRailwayCrossingInfo(), "metadata.railwayCrossingInfo");
                return new C0575a(id10, new C0576b(), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 10:
                String id11 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id11, string28);
                List<LocalizedString> name2 = nativeRoadObject.getMetadata().getIcInfo().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "metadata.icInfo.name");
                ArrayList arrayList2 = new ArrayList(CollectionsKt.f(name2));
                for (LocalizedString localizedString : name2) {
                    Intrinsics.checkNotNullExpressionValue(localizedString, string27);
                    String language = localizedString.getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language, string26);
                    String value = localizedString.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, string25);
                    arrayList2.add(new R7.a(language, value));
                }
                return new W7.a(id11, arrayList2, nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 11:
                String id12 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id12, string28);
                List<LocalizedString> name3 = nativeRoadObject.getMetadata().getJctInfo().getName();
                Intrinsics.checkNotNullExpressionValue(name3, "metadata.jctInfo.name");
                ArrayList arrayList3 = new ArrayList(CollectionsKt.f(name3));
                for (LocalizedString localizedString2 : name3) {
                    Intrinsics.checkNotNullExpressionValue(localizedString2, string27);
                    String language2 = localizedString2.getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language2, string26);
                    String value2 = localizedString2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, string25);
                    arrayList3.add(new R7.a(language2, value2));
                }
                return new Y7.a(id12, arrayList3, nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            case 12:
                String id13 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id13, string28);
                Double length4 = nativeRoadObject.getLength();
                Boolean isUrban4 = nativeRoadObject.getIsUrban();
                Intrinsics.checkNotNullParameter(id13, string28);
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Intrinsics.checkNotNullParameter(nativeRoadObject, "nativeRoadObject");
                return new C0532a(id13, 11, length4, provider2, isUrban4, nativeRoadObject, 0);
            case 13:
                String id14 = nativeRoadObject.getId();
                Intrinsics.checkNotNullExpressionValue(id14, string28);
                MergingAreaInfo mergingAreaInfo = nativeRoadObject.getMetadata().getMergingAreaInfo();
                Intrinsics.checkNotNullExpressionValue(mergingAreaInfo, "metadata.mergingAreaInfo");
                int i17 = c.f6241g[mergingAreaInfo.getMergeType().ordinal()];
                if (i17 == 1) {
                    string24 = StubApp.getString2(1145);
                } else if (i17 == 2) {
                    string24 = StubApp.getString2(1144);
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string24 = StubApp.getString2(1143);
                }
                return new C0392a(id14, new C0393b(string24), nativeRoadObject.getLength(), provider2, nativeRoadObject.getIsUrban(), nativeRoadObject);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ArrayList b(List list, List upcomingRouteAlertUpdates) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(upcomingRouteAlertUpdates, "upcomingRouteAlertUpdates");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.f(upcomingRouteAlertUpdates)), 16));
        Iterator it = upcomingRouteAlertUpdates.iterator();
        while (it.hasNext()) {
            UpcomingRouteAlertUpdate upcomingRouteAlertUpdate = (UpcomingRouteAlertUpdate) it.next();
            Pair pair = TuplesKt.to(upcomingRouteAlertUpdate.getId(), Double.valueOf(upcomingRouteAlertUpdate.getDistanceToStart()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f fVar = (f) it2.next();
            if (linkedHashMap.keySet().contains(fVar.f6246a.f6228a)) {
                b roadObject = fVar.f6246a;
                Double d8 = (Double) linkedHashMap.get(roadObject.f6228a);
                Intrinsics.checkNotNullParameter(roadObject, "roadObject");
                arrayList.add(new f(roadObject, d8));
            }
        }
        return arrayList;
    }
}
