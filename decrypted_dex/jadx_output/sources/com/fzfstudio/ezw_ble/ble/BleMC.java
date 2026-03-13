package com.fzfstudio.ezw_ble.ble;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.fzfstudio.ezw_ble.ble.models.BleConfig;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.gson.Gson;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import o3.AbstractC1457a;
import o3.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/BleMC;", "", "<init>", "(Ljava/lang/String;I)V", "GET_PLATFORM_VERSION", "BLE_STATE", "INIT_CONFIGS", "START_SCAN", "STOP_SCAN", "CONNECT_DEVICE", "DEVICE_PRE_CONNECTED", "DEVICE_CONNECTED", "DISCONNECT_DEVICE", "SEND_CMD", "ENTER_UPGRADE_STATE", "QUITE_UPGRADE_STATE", "CLEAN_CONNECT_CACHE", "RESET_BLE", "OPEN_BLE_SETTINGS", "OPEN_APP_SETTINGS", "UNKNOWN", "handle", "", "context", "Landroid/content/Context;", "arguments", "", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "Companion", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBleChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleChannel.kt\ncom/fzfstudio/ezw_ble/ble/BleMC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 GsonSerializable.kt\ncom/fzfstudio/ezw_utils/gson/GsonSerializableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1617#2,9:193\n1869#2:202\n1870#2:206\n1626#2:207\n21#3,2:203\n1#4:205\n*S KotlinDebug\n*F\n+ 1 BleChannel.kt\ncom/fzfstudio/ezw_ble/ble/BleMC\n*L\n71#1:193,9\n71#1:202\n71#1:206\n71#1:207\n71#1:203,2\n71#1:205\n*E\n"})
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleMC {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BleMC[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BleMC GET_PLATFORM_VERSION = new BleMC(StubApp.getString2(11225), 0);
    public static final BleMC BLE_STATE = new BleMC(StubApp.getString2(11218), 1);
    public static final BleMC INIT_CONFIGS = new BleMC(StubApp.getString2(11226), 2);
    public static final BleMC START_SCAN = new BleMC(StubApp.getString2(11227), 3);
    public static final BleMC STOP_SCAN = new BleMC(StubApp.getString2(11228), 4);
    public static final BleMC CONNECT_DEVICE = new BleMC(StubApp.getString2(11229), 5);
    public static final BleMC DEVICE_PRE_CONNECTED = new BleMC(StubApp.getString2(11230), 6);
    public static final BleMC DEVICE_CONNECTED = new BleMC(StubApp.getString2(11231), 7);
    public static final BleMC DISCONNECT_DEVICE = new BleMC(StubApp.getString2(11232), 8);
    public static final BleMC SEND_CMD = new BleMC(StubApp.getString2(11233), 9);
    public static final BleMC ENTER_UPGRADE_STATE = new BleMC(StubApp.getString2(11234), 10);
    public static final BleMC QUITE_UPGRADE_STATE = new BleMC(StubApp.getString2(11235), 11);
    public static final BleMC CLEAN_CONNECT_CACHE = new BleMC(StubApp.getString2(11236), 12);
    public static final BleMC RESET_BLE = new BleMC(StubApp.getString2(11237), 13);
    public static final BleMC OPEN_BLE_SETTINGS = new BleMC(StubApp.getString2(11238), 14);
    public static final BleMC OPEN_APP_SETTINGS = new BleMC(StubApp.getString2(11239), 15);
    public static final BleMC UNKNOWN = new BleMC(StubApp.getString2(343), 16);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/BleMC$Companion;", "", "<init>", "()V", "from", "Lcom/fzfstudio/ezw_ble/ble/BleMC;", "method", "", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BleMC from(String method) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(method, "<this>");
            String upperCase = new Regex(StubApp.getString2(11223)).replace(method, StubApp.getString2(11224)).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return BleMC.valueOf(upperCase);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BleMC.values().length];
            try {
                iArr[BleMC.GET_PLATFORM_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleMC.BLE_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleMC.INIT_CONFIGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleMC.START_SCAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleMC.STOP_SCAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BleMC.CONNECT_DEVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BleMC.DEVICE_PRE_CONNECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BleMC.DEVICE_CONNECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BleMC.DISCONNECT_DEVICE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BleMC.SEND_CMD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BleMC.ENTER_UPGRADE_STATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BleMC.QUITE_UPGRADE_STATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BleMC.CLEAN_CONNECT_CACHE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BleMC.RESET_BLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BleMC.OPEN_BLE_SETTINGS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BleMC.OPEN_APP_SETTINGS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ BleMC[] $values() {
        return new BleMC[]{GET_PLATFORM_VERSION, BLE_STATE, INIT_CONFIGS, START_SCAN, STOP_SCAN, CONNECT_DEVICE, DEVICE_PRE_CONNECTED, DEVICE_CONNECTED, DISCONNECT_DEVICE, SEND_CMD, ENTER_UPGRADE_STATE, QUITE_UPGRADE_STATE, CLEAN_CONNECT_CACHE, RESET_BLE, OPEN_BLE_SETTINGS, OPEN_APP_SETTINGS, UNKNOWN};
    }

    static {
        BleMC[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private BleMC(String str, int i3) {
    }

    public static EnumEntries<BleMC> getEntries() {
        return $ENTRIES;
    }

    public static BleMC valueOf(String str) {
        return (BleMC) Enum.valueOf(BleMC.class, str);
    }

    public static BleMC[] values() {
        return (BleMC[]) $VALUES.clone();
    }

    public final void handle(Context context, Object arguments, MethodChannel.Result result) {
        ArrayList arrayList;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(result, "result");
        int i3 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        String string2 = StubApp.getString2(11240);
        switch (i3) {
            case 1:
                result.success(StubApp.getString2(2817) + Build.VERSION.RELEASE);
                return;
            case 2:
                result.success(Integer.valueOf(BleManager.INSTANCE.getInstance().getCurrentBleState()));
                return;
            case 3:
                List list = (List) arguments;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        Gson gson = b.f18362a;
                        BleConfig bleConfig = (BleConfig) ((AbstractC1457a) gson.fromJson(gson.toJson((Map) obj), BleConfig.class));
                        if (bleConfig != null) {
                            arrayList.add(bleConfig);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    BleManager.INSTANCE.getInstance().initConfigs(arrayList);
                    break;
                }
                break;
            case 4:
                Map map = (Map) arguments;
                Object obj2 = map != null ? map.get(StubApp.getString2(11246)) : null;
                Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                BleManager.INSTANCE.getInstance().startScan(bool != null ? bool.booleanValue() : false);
                break;
            case 5:
                BleManager.stopScan$default(BleManager.INSTANCE.getInstance(), false, 1, null);
                break;
            case 6:
                Map map2 = (Map) arguments;
                String str2 = (String) (map2 != null ? map2.get(StubApp.getString2(11243)) : null);
                String str3 = str2 == null ? "" : str2;
                String str4 = (String) (map2 != null ? map2.get(string2) : null);
                String str5 = str4 == null ? "" : str4;
                String str6 = (String) (map2 != null ? map2.get(StubApp.getString2(ModuleDescriptor.MODULE_VERSION)) : null);
                String str7 = str6 == null ? "" : str6;
                String str8 = (String) (map2 != null ? map2.get(StubApp.getString2(11244)) : null);
                String str9 = str8 == null ? "" : str8;
                boolean areEqual = Intrinsics.areEqual((Boolean) (map2 != null ? map2.get(StubApp.getString2(11245)) : null), Boolean.TRUE);
                if (str5.length() > 0 && str9.length() > 0) {
                    BleManager.connect$default(BleManager.INSTANCE.getInstance(), str3, str5, str7, str9, false, areEqual, false, 80, null);
                    break;
                }
                break;
            case 7:
                String str10 = (String) arguments;
                BleManager.INSTANCE.getInstance().setPreConnected(str10 != null ? str10 : "");
                break;
            case 8:
                String str11 = (String) arguments;
                BleManager.INSTANCE.getInstance().setConnected(str11 != null ? str11 : "");
                break;
            case 9:
                Map map3 = (Map) arguments;
                String str12 = (String) (map3 != null ? map3.get(string2) : null);
                str = str12 != null ? str12 : "";
                Boolean bool2 = (Boolean) (map3 != null ? map3.get(StubApp.getString2(11242)) : null);
                BleManager.INSTANCE.getInstance().disconnect(str, bool2 != null ? bool2.booleanValue() : false);
                break;
            case 10:
                Map map4 = (Map) arguments;
                String str13 = (String) (map4 != null ? map4.get(string2) : null);
                str = str13 != null ? str13 : "";
                byte[] bArr = (byte[]) (map4 != null ? map4.get(StubApp.getString2(1485)) : null);
                if (bArr == null) {
                    bArr = new byte[0];
                }
                Integer num = (Integer) (map4 != null ? map4.get(StubApp.getString2(11241)) : null);
                BleManager.INSTANCE.getInstance().sendCmd(str, bArr, num != null ? num.intValue() : 0);
                break;
            case 11:
                String str14 = (String) arguments;
                BleManager.INSTANCE.getInstance().enterUpgradeState(str14 != null ? str14 : "");
                break;
            case 12:
                String str15 = (String) arguments;
                BleManager.INSTANCE.getInstance().quiteUpgradeState(str15 != null ? str15 : "");
                break;
            case 13:
                BleManager.INSTANCE.getInstance().cleanConnectCache();
                break;
            case 14:
                BleManager.INSTANCE.getInstance().reset();
                break;
            case 15:
                Intent intent = new Intent(StubApp.getString2(5826));
                intent.addFlags(268435456);
                context.startActivity(intent);
                break;
            case 16:
                Intent intent2 = new Intent(StubApp.getString2(143));
                intent2.setData(Uri.fromParts(StubApp.getString2(3503), context.getPackageName(), null));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                break;
        }
        result.success(null);
    }
}
