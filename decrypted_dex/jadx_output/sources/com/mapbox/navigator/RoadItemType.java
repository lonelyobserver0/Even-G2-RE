package com.mapbox.navigator;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum RoadItemType {
    DANGER_SIGN(StubApp.getString2(15179)),
    PASS_LEFT_OR_RIGHT_SIDE_SIGN(StubApp.getString2(15181)),
    PASS_LEFT_SIDE_SIGN(StubApp.getString2(15183)),
    PASS_RIGHT_SIDE_SIGN(StubApp.getString2(15185)),
    DOMESTIC_ANIMALS_CROSSING_SIGN(StubApp.getString2(15187)),
    WILD_ANIMALS_CROSSING_SIGN(StubApp.getString2(15189)),
    ROAD_WORKS_SIGN(StubApp.getString2(15191)),
    RESIDENTIAL_AREA_SIGN(StubApp.getString2(15193)),
    END_OF_RESIDENTIAL_AREA_SIGN(StubApp.getString2(15195)),
    RIGHT_BEND_SIGN(StubApp.getString2(15197)),
    LEFT_BEND_SIGN(StubApp.getString2(15199)),
    DOUBLE_BEND_RIGHT_FIRST_SIGN(StubApp.getString2(15201)),
    DOUBLE_BEND_LEFT_FIRST_SIGN(StubApp.getString2(15203)),
    CURVY_ROAD_SIGN(StubApp.getString2(15205)),
    OVERTAKING_BY_GOODS_VEHICLES_PROHIBITED_SIGN(StubApp.getString2(15207)),
    END_OF_PROHIBITION_ON_OVERTAKING_FOR_GOODS_VEHICLES_SIGN(StubApp.getString2(15209)),
    DANGEROUS_INTERSECTION_SIGN(StubApp.getString2(15211)),
    TUNNEL_SIGN(StubApp.getString2(15213)),
    FERRY_TERMINAL_SIGN(StubApp.getString2(15215)),
    NARROW_BRIDGE_SIGN(StubApp.getString2(15217)),
    HUMPBACK_BRIDGE_BRIDGE_SIGN(StubApp.getString2(15219)),
    RIVER_BANK_SIGN(StubApp.getString2(15221)),
    RIVER_BANK_LEFT_SIGN(StubApp.getString2(15223)),
    YIELD_SIGN(StubApp.getString2(15225)),
    STOP_SIGN(StubApp.getString2(15227)),
    PRIORITY_ROAD_SIGN(StubApp.getString2(15229)),
    INTERSECTION_SIGN(StubApp.getString2(15231)),
    INTERSECTION_WITH_MINOR_ROAD_SIGN(StubApp.getString2(15233)),
    INTERSECTION_WITH_PRIORITY_TO_THE_RIGHT_SIGN(StubApp.getString2(15235)),
    DIRECTION_TO_THE_RIGHT_SIGN(StubApp.getString2(15237)),
    DIRECTION_TO_THE_LEFT_SIGN(StubApp.getString2(15239)),
    CARRIAGEWAY_NARROWS_SIGN(StubApp.getString2(15241)),
    CARRIAGEWAY_NARROWS_RIGHT_SIGN(StubApp.getString2(15243)),
    CARRIAGEWAY_NARROWS_LEFT_SIGN(StubApp.getString2(15245)),
    LANE_MERGE_LEFT_SIGN(StubApp.getString2(15247)),
    LANE_MERGE_RIGHT_SIGN(StubApp.getString2(15249)),
    LANE_MERGE_CENTER_SIGN(StubApp.getString2(15251)),
    OVERTAKING_PROHIBITED_SIGN(StubApp.getString2(15253)),
    END_OF_PROHIBITION_ON_OVERTAKING_SIGN(StubApp.getString2(15255)),
    PROTECTIVE_OVERTAKING_SIGN(StubApp.getString2(15257)),
    PEDESTRIANS_SIGN(StubApp.getString2(15259)),
    PEDESTRIAN_CROSSING_SIGN(StubApp.getString2(15261)),
    CHILDREN_SIGN(StubApp.getString2(15263)),
    SCHOOL_ZONE_SIGN(StubApp.getString2(15265)),
    CYCLISTS_SIGN(StubApp.getString2(15267)),
    TWO_WAY_TRAFFIC_SIGN(StubApp.getString2(15269)),
    RAILWAY_CROSSING_WITH_GATES_SIGN(StubApp.getString2(15271)),
    RAILWAY_CROSSING_WITHOUT_GATES_SIGN(StubApp.getString2(15273)),
    RAILWAY_CROSSING_SIGN(StubApp.getString2(15275)),
    TRAMWAY_SIGN(StubApp.getString2(15277)),
    FALLING_ROCKS_SIGN(StubApp.getString2(15279)),
    FALLING_ROCKS_LEFT_SIGN(StubApp.getString2(15281)),
    FALLING_ROCKS_RIGHT_SIGN(StubApp.getString2(15283)),
    STEEP_DROP_LEFT_SIGN(StubApp.getString2(15285)),
    STEEP_DROP_RIGHT_SIGN(StubApp.getString2(15287)),
    VARIABLE_SIGN_MECHANIC_ELEMENTS_SIGN(StubApp.getString2(15289)),
    SLIPPERY_ROAD_SIGN(StubApp.getString2(15291)),
    STEEP_ASCENT_SIGN(StubApp.getString2(15293)),
    STEEP_DESCENT_SIGN(StubApp.getString2(15295)),
    UNEVEN_ROAD_SIGN(StubApp.getString2(15297)),
    HUMP_SIGN(StubApp.getString2(15299)),
    DIP_SIGN(StubApp.getString2(15301)),
    ROAD_FLOODS_SIGN(StubApp.getString2(15303)),
    ICY_ROAD_SIGN(StubApp.getString2(15305)),
    SIDE_WINDS_SIGN(StubApp.getString2(15307)),
    TRAFFIC_CONGESTION_SIGN(StubApp.getString2(15309)),
    HIGH_ACCIDENT_AREA_SIGN(StubApp.getString2(15311)),
    VARIABLE_SIGN_LIGHT_ELEMENTS_SIGN(StubApp.getString2(15313)),
    PRIORITY_OVER_ONCOMING_TRAFFIC_SIGN(StubApp.getString2(15315)),
    PRIORITY_FOR_ONCOMING_TRAFFIC_SIGN(StubApp.getString2(15317)),
    SPEED_LIMIT_SIGN(StubApp.getString2(15319)),
    TOLL_BOOTH(StubApp.getString2(15321)),
    ROAD_CAM_SPEED_INTERVAL_END(StubApp.getString2(15323)),
    ROAD_CAM_SPEED_INTERVAL_START(StubApp.getString2(15325)),
    ROAD_CAM_SPEED_INTERVAL(StubApp.getString2(15327)),
    ROAD_CAM_LANE_NON_MOTORIZED(StubApp.getString2(15329)),
    ROAD_CAM_LANE_EMERGENCY(StubApp.getString2(15331)),
    ROAD_CAM_LANE_BUS(StubApp.getString2(15333)),
    ROAD_CAM_VIOLATION(StubApp.getString2(15335)),
    ROAD_CAM_RED_LIGHT(StubApp.getString2(15337)),
    ROAD_CAM_SURVEILLANCE(StubApp.getString2(15339)),
    ROAD_CAM_SPEED_CURRENT_SPEED(StubApp.getString2(15341)),
    RAILROAD_CROSSING(StubApp.getString2(15343)),
    ZEBRA(StubApp.getString2(15345)),
    SPEED_BUMP(StubApp.getString2(15347)),
    TRAFFIC_LIGHT(StubApp.getString2(15349));

    private String str;

    RoadItemType(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
