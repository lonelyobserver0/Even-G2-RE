package com.mapbox.navigator;

import com.stub.StubApp;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public enum WeatherDetail {
    CLEAR(0, StubApp.getString2(15498)),
    CLOUDY(1, StubApp.getString2(15500)),
    FEW_CLOUDS(2, StubApp.getString2(15502)),
    PARTLY_CLOUDY(3, StubApp.getString2(15504)),
    OVERCAST(4, StubApp.getString2(15506)),
    WINDY(5, StubApp.getString2(15508)),
    CALM(6, StubApp.getString2(15510)),
    LIGHT_BREEZE(7, StubApp.getString2(15512)),
    GENTLE_BREEZE(8, StubApp.getString2(15514)),
    FRESH_BREEZE(9, StubApp.getString2(15516)),
    STRONG_BREEZE(10, StubApp.getString2(15518)),
    HIGH_WIND(11, StubApp.getString2(15520)),
    GALE(12, StubApp.getString2(15522)),
    STRONG_GALE(13, StubApp.getString2(15524)),
    STORM(14, StubApp.getString2(15526)),
    VIOLENT_STORM(15, StubApp.getString2(15528)),
    HURRICANE(16, StubApp.getString2(15530)),
    TORNADO(17, StubApp.getString2(15532)),
    TROPICAL_STORM(18, StubApp.getString2(15534)),
    SHOWER_RAIN(19, StubApp.getString2(15536)),
    HEAVY_SHOWER_RAIN(20, StubApp.getString2(15538)),
    THUNDERSHOWER(21, StubApp.getString2(15540)),
    HEAVY_THUNDERSTORM(22, StubApp.getString2(15542)),
    HAIL(23, StubApp.getString2(15544)),
    LIGHT_RAIN(24, StubApp.getString2(15546)),
    MODERATE_RAIN(25, StubApp.getString2(15548)),
    HEAVY_RAIN(26, StubApp.getString2(15550)),
    EXTREME_RAIN(27, StubApp.getString2(15552)),
    DRIZZLE_RAIN(28, StubApp.getString2(15554)),
    RAIN_STORM(29, StubApp.getString2(15556)),
    HEAVY_STORM(30, StubApp.getString2(15558)),
    SEVERE_STORM(31, StubApp.getString2(15560)),
    FREEZING_RAIN(32, StubApp.getString2(15562)),
    LIGHT_SNOW(33, StubApp.getString2(15564)),
    MODERATE_SNOW(34, StubApp.getString2(15566)),
    HEAVY_SNOW(35, StubApp.getString2(15568)),
    SNOWSTORM(36, StubApp.getString2(15570)),
    SLEET(37, StubApp.getString2(15572)),
    RAIN_AND_SNOW(38, StubApp.getString2(15574)),
    SHOWER_SNOW(39, StubApp.getString2(15576)),
    SNOW_FLURRY(40, StubApp.getString2(15578)),
    MIST(41, StubApp.getString2(15580)),
    FOGGY(42, StubApp.getString2(15582)),
    HAZE(43, StubApp.getString2(15584)),
    SAND(44, StubApp.getString2(15586)),
    DUST(45, StubApp.getString2(15588)),
    DUSTSTORM(46, StubApp.getString2(15590)),
    SANDSTORM(47, StubApp.getString2(15592)),
    HOT(48, StubApp.getString2(15594)),
    COLD(49, StubApp.getString2(15596)),
    ICE_PARTICLES(50, StubApp.getString2(15598)),
    ICE_NEEDLE(51, StubApp.getString2(15600)),
    UNKNOWN(CertificateBody.profileType, StubApp.getString2(2164));

    private String str;
    public final int value;

    WeatherDetail(int i3, String str) {
        this.value = i3;
        this.str = str;
    }

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
