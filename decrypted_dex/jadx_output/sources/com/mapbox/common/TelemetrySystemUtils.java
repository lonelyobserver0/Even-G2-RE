package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.stub.StubApp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TelemetrySystemUtils {
    private static final int DEFAULT_BATTERY_LEVEL = -1;
    private static final String NO_STATE = "";
    private static final int PERCENT_SCALE = 100;
    private static final int UNAVAILABLE_BATTERY_LEVEL = -1;
    private static final String BACKGROUND = StubApp.getString2(13357);
    private static final String CODE_DIVISION_MULTIPLE_ACCESS = StubApp.getString2(172);
    private static final String DATE_AND_TIME_PATTERN = StubApp.getString2(13478);
    private static final String ENHANCED_DATA_GSM_EVOLUTION = StubApp.getString2(170);
    private static final String ENHANCED_HIGH_RATE_PACKET_DATA = StubApp.getString2(182);
    private static final String EVOLUTION_DATA_OPTIMIZED_0 = StubApp.getString2(173);
    private static final String EVOLUTION_DATA_OPTIMIZED_A = StubApp.getString2(174);
    private static final String EVOLUTION_DATA_OPTIMIZED_B = StubApp.getString2(180);
    private static final String FOREGROUND = StubApp.getString2(13353);
    private static final String GENERAL_PACKET_RADIO_SERVICE = StubApp.getString2(169);
    private static final String HIGH_SPEED_DOWNLINK_PACKET_ACCESS = StubApp.getString2(176);
    private static final String HIGH_SPEED_PACKET_ACCESS = StubApp.getString2(178);
    private static final String HIGH_SPEED_PACKET_ACCESS_PLUS = StubApp.getString2(183);
    private static final String HIGH_SPEED_UNLINK_PACKET_ACCESS = StubApp.getString2(177);
    private static final String INTEGRATED_DIGITAL_ENHANCED_NETWORK = StubApp.getString2(179);
    private static final String LONG_TERM_EVOLUTION = StubApp.getString2(181);
    private static final String MAPBOX_SHARED_PREFERENCES = StubApp.getString2(13479);
    private static final String MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID = StubApp.getString2(13480);
    private static final String SINGLE_CARRIER_RTT = StubApp.getString2(13477);
    private static final String TAG = StubApp.getString2(13481);
    private static final String UNIVERSAL_MOBILE_TELCO_SERVICE = StubApp.getString2(171);
    private static final String UNKNOWN = StubApp.getString2(2164);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat(StubApp.getString2(13478), Locale.US);
    private static final Map<Integer, String> NETWORKS = new HashMap<Integer, String>() { // from class: com.mapbox.common.TelemetrySystemUtils.1
        {
            put(7, StubApp.getString2(13477));
            put(4, StubApp.getString2(172));
            put(2, StubApp.getString2(170));
            put(14, StubApp.getString2(182));
            put(5, StubApp.getString2(173));
            put(6, StubApp.getString2(174));
            put(12, StubApp.getString2(180));
            put(1, StubApp.getString2(169));
            put(8, StubApp.getString2(176));
            put(10, StubApp.getString2(178));
            put(15, StubApp.getString2(183));
            put(9, StubApp.getString2(177));
            put(11, StubApp.getString2(179));
            put(13, StubApp.getString2(181));
            put(3, StubApp.getString2(171));
            put(0, StubApp.getString2(2164));
        }
    };

    public static String generateCreateDateFormatted(Date date) {
        return dateFormat.format(date);
    }

    public static boolean isPluggedIn(Context context) {
        Intent registerBatteryUpdates = registerBatteryUpdates(context);
        if (registerBatteryUpdates == null) {
            return false;
        }
        int intExtra = registerBatteryUpdates.getIntExtra(StubApp.getString2(5739), -1);
        return (intExtra == 2) || (intExtra == 1);
    }

    public static int obtainBatteryLevel(Context context) {
        Intent registerBatteryUpdates = registerBatteryUpdates(context);
        if (registerBatteryUpdates == null) {
            return -1;
        }
        int intExtra = registerBatteryUpdates.getIntExtra(StubApp.getString2(9577), -1);
        int intExtra2 = registerBatteryUpdates.getIntExtra(StubApp.getString2(9578), -1);
        if (intExtra < 0 || intExtra2 <= 0) {
            return -1;
        }
        return Math.round((intExtra / intExtra2) * 100.0f);
    }

    @SuppressLint({"MissingPermission"})
    public static String obtainCellularNetworkType(Context context) {
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(StubApp.getString2(1817));
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                i3 = telephonyManager.getDataNetworkType();
            } catch (SecurityException e10) {
                Log.debug(e10.toString(), StubApp.getString2(13481));
                i3 = 0;
            }
        } else {
            i3 = telephonyManager.getNetworkType();
        }
        Map<Integer, String> map = NETWORKS;
        return map.containsKey(Integer.valueOf(i3)) ? map.get(Integer.valueOf(i3)) : StubApp.getString2(2164);
    }

    public static String obtainCurrentDate() {
        return dateFormat.format(new Date());
    }

    public static String obtainUniversalUniqueIdentifier() {
        return UUID.randomUUID().toString();
    }

    private static Intent registerBatteryUpdates(Context context) {
        try {
            return context.registerReceiver(null, new IntentFilter(StubApp.getString2("5738")));
        } catch (Exception e10) {
            Log.error(AbstractC1482f.g(e10.toString(), StubApp.getString2(13482)), StubApp.getString2(13481));
            return null;
        }
    }
}
