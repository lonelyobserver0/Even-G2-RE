package Q9;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static B6.a f5772c;

    /* renamed from: a, reason: collision with root package name */
    public BinaryMessenger f5773a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f5774b;

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        int allowedCapturePolicy;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            Object obj = call.arguments;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            String str = call.method;
            if (str != null) {
                int hashCode = str.hashCode();
                boolean z2 = false;
                String string2 = StubApp.getString2(5319);
                String string22 = StubApp.getString2(5320);
                switch (hashCode) {
                    case -1758921066:
                        if (!str.equals(StubApp.getString2("5363"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new H9.b(31);
                            }
                            B6.a aVar = f5772c;
                            Intrinsics.checkNotNull(aVar);
                            result.success(aVar.e());
                            return;
                        }
                    case -1698305881:
                        if (!str.equals(StubApp.getString2("5362"))) {
                            break;
                        } else {
                            B6.a aVar2 = f5772c;
                            Intrinsics.checkNotNull(aVar2);
                            Object obj2 = list.get(0);
                            Intrinsics.checkNotNull(obj2, string22);
                            result.success(aVar2.f(((Integer) obj2).intValue()));
                            return;
                        }
                    case -1679670739:
                        if (!str.equals(StubApp.getString2("5361"))) {
                            break;
                        } else {
                            B6.a aVar3 = f5772c;
                            Intrinsics.checkNotNull(aVar3);
                            result.success(aVar3.n());
                            return;
                        }
                    case -1582239800:
                        if (!str.equals(StubApp.getString2("5360"))) {
                            break;
                        } else {
                            B6.a aVar4 = f5772c;
                            Intrinsics.checkNotNull(aVar4);
                            Object obj3 = list.get(0);
                            Intrinsics.checkNotNull(obj3, string22);
                            result.success(aVar4.j(((Integer) obj3).intValue()));
                            return;
                        }
                    case -1562927400:
                        if (!str.equals(StubApp.getString2("5359"))) {
                            break;
                        } else {
                            B6.a aVar5 = f5772c;
                            Intrinsics.checkNotNull(aVar5);
                            result.success(aVar5.o());
                            return;
                        }
                    case -1524320654:
                        if (!str.equals(StubApp.getString2("5358"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new H9.b(29);
                            }
                            B6.a aVar6 = f5772c;
                            Intrinsics.checkNotNull(aVar6);
                            aVar6.getClass();
                            result.success(B6.a.m());
                            return;
                        }
                    case -1504647535:
                        if (!str.equals(StubApp.getString2("5357"))) {
                            break;
                        } else {
                            B6.a aVar7 = f5772c;
                            Intrinsics.checkNotNull(aVar7);
                            result.success(Boolean.valueOf(aVar7.p(list)));
                            return;
                        }
                    case -1413157019:
                        if (!str.equals(StubApp.getString2("5356"))) {
                            break;
                        } else {
                            B6.a aVar8 = f5772c;
                            Intrinsics.checkNotNull(aVar8);
                            Object obj4 = list.get(0);
                            Intrinsics.checkNotNull(obj4, string2);
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            AudioManager audioManager = (AudioManager) aVar8.f672f;
                            Intrinsics.checkNotNull(audioManager);
                            audioManager.setMicrophoneMute(booleanValue);
                            result.success(null);
                            return;
                        }
                    case -1296413680:
                        if (!str.equals(StubApp.getString2("5355"))) {
                            break;
                        } else {
                            B6.a aVar9 = f5772c;
                            Intrinsics.checkNotNull(aVar9);
                            Object obj5 = list.get(0);
                            Intrinsics.checkNotNull(obj5, string2);
                            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                            AudioManager audioManager2 = (AudioManager) aVar9.f672f;
                            Intrinsics.checkNotNull(audioManager2);
                            audioManager2.setSpeakerphoneOn(booleanValue2);
                            result.success(null);
                            return;
                        }
                    case -1285190630:
                        if (!str.equals(StubApp.getString2("5354"))) {
                            break;
                        } else {
                            B6.a aVar10 = f5772c;
                            Intrinsics.checkNotNull(aVar10);
                            AudioManager audioManager3 = (AudioManager) aVar10.f672f;
                            Intrinsics.checkNotNull(audioManager3);
                            result.success(Boolean.valueOf(audioManager3.isBluetoothScoOn()));
                            return;
                        }
                    case -1197068311:
                        if (!str.equals(StubApp.getString2("5353"))) {
                            break;
                        } else {
                            B6.a aVar11 = f5772c;
                            Intrinsics.checkNotNull(aVar11);
                            Object obj6 = list.get(0);
                            Intrinsics.checkNotNull(obj6, string22);
                            int intValue = ((Integer) obj6).intValue();
                            Object obj7 = list.get(1);
                            Intrinsics.checkNotNull(obj7, string22);
                            int intValue2 = ((Integer) obj7).intValue();
                            Object obj8 = list.get(2);
                            Intrinsics.checkNotNull(obj8, string22);
                            int intValue3 = ((Integer) obj8).intValue();
                            AudioManager audioManager4 = (AudioManager) aVar11.f672f;
                            Intrinsics.checkNotNull(audioManager4);
                            audioManager4.adjustStreamVolume(intValue, intValue2, intValue3);
                            result.success(null);
                            return;
                        }
                    case -1091382445:
                        if (!str.equals(StubApp.getString2("5352"))) {
                            break;
                        } else {
                            B6.a aVar12 = f5772c;
                            Intrinsics.checkNotNull(aVar12);
                            result.success(aVar12.g());
                            return;
                        }
                    case -1079290158:
                        if (!str.equals(StubApp.getString2("5351"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new H9.b(29);
                            }
                            B6.a aVar13 = f5772c;
                            Intrinsics.checkNotNull(aVar13);
                            Object obj9 = list.get(0);
                            Intrinsics.checkNotNull(obj9, string22);
                            int intValue4 = ((Integer) obj9).intValue();
                            AudioManager audioManager5 = (AudioManager) aVar13.f672f;
                            Intrinsics.checkNotNull(audioManager5);
                            audioManager5.setAllowedCapturePolicy(intValue4);
                            result.success(null);
                            return;
                        }
                    case -1018676910:
                        if (!str.equals(StubApp.getString2("5350"))) {
                            break;
                        } else {
                            B6.a aVar14 = f5772c;
                            Intrinsics.checkNotNull(aVar14);
                            Object obj10 = list.get(0);
                            Intrinsics.checkNotNull(obj10, string2);
                            boolean booleanValue3 = ((Boolean) obj10).booleanValue();
                            AudioManager audioManager6 = (AudioManager) aVar14.f672f;
                            Intrinsics.checkNotNull(audioManager6);
                            audioManager6.setBluetoothScoOn(booleanValue3);
                            result.success(null);
                            return;
                        }
                    case -809761226:
                        if (!str.equals(StubApp.getString2("5349"))) {
                            break;
                        } else {
                            B6.a aVar15 = f5772c;
                            Intrinsics.checkNotNull(aVar15);
                            Object obj11 = list.get(0);
                            Intrinsics.checkNotNull(obj11, string22);
                            int intValue5 = ((Integer) obj11).intValue();
                            AudioManager audioManager7 = (AudioManager) aVar15.f672f;
                            Intrinsics.checkNotNull(audioManager7);
                            result.success(Integer.valueOf(audioManager7.getStreamMinVolume(intValue5)));
                            return;
                        }
                    case -763512583:
                        if (!str.equals(StubApp.getString2("5348"))) {
                            break;
                        } else {
                            B6.a aVar16 = f5772c;
                            Intrinsics.checkNotNull(aVar16);
                            AudioManager audioManager8 = (AudioManager) aVar16.f672f;
                            Intrinsics.checkNotNull(audioManager8);
                            audioManager8.loadSoundEffects();
                            result.success(null);
                            return;
                        }
                    case -694417919:
                        if (!str.equals(StubApp.getString2("5347"))) {
                            break;
                        } else {
                            B6.a aVar17 = f5772c;
                            Intrinsics.checkNotNull(aVar17);
                            AudioManager audioManager9 = (AudioManager) aVar17.f672f;
                            Intrinsics.checkNotNull(audioManager9);
                            result.success(Boolean.valueOf(audioManager9.isMusicActive()));
                            return;
                        }
                    case -580980717:
                        if (!str.equals(StubApp.getString2("5346"))) {
                            break;
                        } else {
                            B6.a aVar18 = f5772c;
                            Intrinsics.checkNotNull(aVar18);
                            AudioManager audioManager10 = (AudioManager) aVar18.f672f;
                            Intrinsics.checkNotNull(audioManager10);
                            audioManager10.startBluetoothSco();
                            result.success(null);
                            return;
                        }
                    case -445792758:
                        if (!str.equals(StubApp.getString2("5345"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new H9.b(31);
                            }
                            B6.a aVar19 = f5772c;
                            Intrinsics.checkNotNull(aVar19);
                            Object obj12 = list.get(0);
                            Intrinsics.checkNotNull(obj12, string22);
                            int intValue6 = ((Integer) obj12).intValue();
                            Iterator it = ((ArrayList) aVar19.f674h).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) it.next();
                                    if (audioDeviceInfo.getId() == intValue6) {
                                        AudioManager audioManager11 = (AudioManager) aVar19.f672f;
                                        Intrinsics.checkNotNull(audioManager11);
                                        z2 = audioManager11.setCommunicationDevice(audioDeviceInfo);
                                    }
                                }
                            }
                            result.success(Boolean.valueOf(z2));
                            return;
                        }
                    case -380792370:
                        if (!str.equals(StubApp.getString2("5344"))) {
                            break;
                        } else {
                            B6.a aVar20 = f5772c;
                            Intrinsics.checkNotNull(aVar20);
                            Object obj13 = list.get(0);
                            Intrinsics.checkNotNull(obj13, string22);
                            int intValue7 = ((Integer) obj13).intValue();
                            Object obj14 = list.get(1);
                            Intrinsics.checkNotNull(obj14, string22);
                            int intValue8 = ((Integer) obj14).intValue();
                            Object obj15 = list.get(2);
                            Intrinsics.checkNotNull(obj15, string22);
                            int intValue9 = ((Integer) obj15).intValue();
                            AudioManager audioManager12 = (AudioManager) aVar20.f672f;
                            Intrinsics.checkNotNull(audioManager12);
                            result.success(Float.valueOf(audioManager12.getStreamVolumeDb(intValue7, intValue8, intValue9)));
                            return;
                        }
                    case -75324903:
                        if (!str.equals(StubApp.getString2("5343"))) {
                            break;
                        } else {
                            B6.a aVar21 = f5772c;
                            Intrinsics.checkNotNull(aVar21);
                            AudioManager audioManager13 = (AudioManager) aVar21.f672f;
                            Intrinsics.checkNotNull(audioManager13);
                            result.success(Integer.valueOf(audioManager13.getMode()));
                            return;
                        }
                    case 152385829:
                        if (!str.equals(StubApp.getString2("5342"))) {
                            break;
                        } else {
                            B6.a aVar22 = f5772c;
                            Intrinsics.checkNotNull(aVar22);
                            Object obj16 = list.get(0);
                            Intrinsics.checkNotNull(obj16, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            aVar22.c((Map) obj16);
                            result.success(null);
                            return;
                        }
                    case 160987616:
                        if (!str.equals(StubApp.getString2("5341"))) {
                            break;
                        } else {
                            B6.a aVar23 = f5772c;
                            Intrinsics.checkNotNull(aVar23);
                            String str2 = (String) list.get(0);
                            AudioManager audioManager14 = (AudioManager) aVar23.f672f;
                            Intrinsics.checkNotNull(audioManager14);
                            String parameters = audioManager14.getParameters(str2);
                            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                            result.success(parameters);
                            return;
                        }
                    case 186762163:
                        if (!str.equals(StubApp.getString2("5340"))) {
                            break;
                        } else {
                            B6.a aVar24 = f5772c;
                            Intrinsics.checkNotNull(aVar24);
                            AudioManager audioManager15 = (AudioManager) aVar24.f672f;
                            Intrinsics.checkNotNull(audioManager15);
                            audioManager15.stopBluetoothSco();
                            result.success(null);
                            return;
                        }
                    case 276698416:
                        if (!str.equals(StubApp.getString2("5339"))) {
                            break;
                        } else {
                            B6.a aVar25 = f5772c;
                            Intrinsics.checkNotNull(aVar25);
                            Object obj17 = list.get(0);
                            Intrinsics.checkNotNull(obj17, string22);
                            int intValue10 = ((Integer) obj17).intValue();
                            AudioManager audioManager16 = (AudioManager) aVar25.f672f;
                            Intrinsics.checkNotNull(audioManager16);
                            result.success(Integer.valueOf(audioManager16.getStreamVolume(intValue10)));
                            return;
                        }
                    case 469094495:
                        if (!str.equals(StubApp.getString2("5338"))) {
                            break;
                        } else {
                            B6.a aVar26 = f5772c;
                            Intrinsics.checkNotNull(aVar26);
                            AudioManager audioManager17 = (AudioManager) aVar26.f672f;
                            Intrinsics.checkNotNull(audioManager17);
                            result.success(Boolean.valueOf(audioManager17.isBluetoothScoAvailableOffCall()));
                            return;
                        }
                    case 623794710:
                        if (!str.equals(StubApp.getString2("5337"))) {
                            break;
                        } else {
                            B6.a aVar27 = f5772c;
                            Intrinsics.checkNotNull(aVar27);
                            AudioManager audioManager18 = (AudioManager) aVar27.f672f;
                            Intrinsics.checkNotNull(audioManager18);
                            result.success(Integer.valueOf(audioManager18.getRingerMode()));
                            return;
                        }
                    case 935118828:
                        if (!str.equals(StubApp.getString2("5336"))) {
                            break;
                        } else {
                            B6.a aVar28 = f5772c;
                            Intrinsics.checkNotNull(aVar28);
                            String str3 = (String) list.get(0);
                            AudioManager audioManager19 = (AudioManager) aVar28.f672f;
                            Intrinsics.checkNotNull(audioManager19);
                            audioManager19.setParameters(str3);
                            result.success(null);
                            return;
                        }
                    case 954131337:
                        if (!str.equals(StubApp.getString2("5335"))) {
                            break;
                        } else {
                            B6.a aVar29 = f5772c;
                            Intrinsics.checkNotNull(aVar29);
                            Object obj18 = list.get(0);
                            Intrinsics.checkNotNull(obj18, string22);
                            int intValue11 = ((Integer) obj18).intValue();
                            Object obj19 = list.get(1);
                            Intrinsics.checkNotNull(obj19, string22);
                            int intValue12 = ((Integer) obj19).intValue();
                            AudioManager audioManager20 = (AudioManager) aVar29.f672f;
                            Intrinsics.checkNotNull(audioManager20);
                            audioManager20.adjustVolume(intValue11, intValue12);
                            result.success(null);
                            return;
                        }
                    case 976310915:
                        if (!str.equals(StubApp.getString2("5334"))) {
                            break;
                        } else {
                            B6.a aVar30 = f5772c;
                            Intrinsics.checkNotNull(aVar30);
                            Object obj20 = list.get(0);
                            Intrinsics.checkNotNull(obj20, string22);
                            int intValue13 = ((Integer) obj20).intValue();
                            AudioManager audioManager21 = (AudioManager) aVar30.f672f;
                            Intrinsics.checkNotNull(audioManager21);
                            result.success(Boolean.valueOf(audioManager21.isStreamMute(intValue13)));
                            return;
                        }
                    case 1084758859:
                        if (!str.equals(StubApp.getString2("5333"))) {
                            break;
                        } else {
                            B6.a aVar31 = f5772c;
                            Intrinsics.checkNotNull(aVar31);
                            String str4 = (String) list.get(0);
                            AudioManager audioManager22 = (AudioManager) aVar31.f672f;
                            Intrinsics.checkNotNull(audioManager22);
                            String property = audioManager22.getProperty(str4);
                            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
                            result.success(property);
                            return;
                        }
                    case 1163405254:
                        if (!str.equals(StubApp.getString2("5332"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new H9.b(29);
                            }
                            B6.a aVar32 = f5772c;
                            Intrinsics.checkNotNull(aVar32);
                            AudioManager audioManager23 = (AudioManager) aVar32.f672f;
                            Intrinsics.checkNotNull(audioManager23);
                            allowedCapturePolicy = audioManager23.getAllowedCapturePolicy();
                            result.success(Integer.valueOf(allowedCapturePolicy));
                            return;
                        }
                    case 1187450940:
                        if (!str.equals(StubApp.getString2("5331"))) {
                            break;
                        } else {
                            B6.a aVar33 = f5772c;
                            Intrinsics.checkNotNull(aVar33);
                            Object obj21 = list.get(0);
                            Intrinsics.checkNotNull(obj21, string22);
                            int intValue14 = ((Integer) obj21).intValue();
                            Object obj22 = list.get(1);
                            Intrinsics.checkNotNull(obj22, string22);
                            int intValue15 = ((Integer) obj22).intValue();
                            Object obj23 = list.get(2);
                            Intrinsics.checkNotNull(obj23, string22);
                            int intValue16 = ((Integer) obj23).intValue();
                            AudioManager audioManager24 = (AudioManager) aVar33.f672f;
                            Intrinsics.checkNotNull(audioManager24);
                            audioManager24.setStreamVolume(intValue14, intValue15, intValue16);
                            result.success(null);
                            return;
                        }
                    case 1241312831:
                        if (!str.equals(StubApp.getString2("5330"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new H9.b(31);
                            }
                            B6.a aVar34 = f5772c;
                            Intrinsics.checkNotNull(aVar34);
                            AudioManager audioManager25 = (AudioManager) aVar34.f672f;
                            Intrinsics.checkNotNull(audioManager25);
                            audioManager25.clearCommunicationDevice();
                            result.success(null);
                            return;
                        }
                    case 1258134830:
                        if (!str.equals(StubApp.getString2("5329"))) {
                            break;
                        } else {
                            B6.a aVar35 = f5772c;
                            Intrinsics.checkNotNull(aVar35);
                            Object obj24 = list.get(0);
                            Intrinsics.checkNotNull(obj24, string22);
                            int intValue17 = ((Integer) obj24).intValue();
                            Object obj25 = list.get(1);
                            Intrinsics.checkNotNull(obj25, string22);
                            int intValue18 = ((Integer) obj25).intValue();
                            Object obj26 = list.get(2);
                            Intrinsics.checkNotNull(obj26, string22);
                            int intValue19 = ((Integer) obj26).intValue();
                            AudioManager audioManager26 = (AudioManager) aVar35.f672f;
                            Intrinsics.checkNotNull(audioManager26);
                            audioManager26.adjustSuggestedStreamVolume(intValue17, intValue18, intValue19);
                            result.success(null);
                            return;
                        }
                    case 1357290231:
                        if (!str.equals(StubApp.getString2("5328"))) {
                            break;
                        } else {
                            B6.a aVar36 = f5772c;
                            Intrinsics.checkNotNull(aVar36);
                            result.success(Boolean.valueOf(aVar36.a()));
                            return;
                        }
                    case 1378317714:
                        if (!str.equals(StubApp.getString2("5327"))) {
                            break;
                        } else {
                            B6.a aVar37 = f5772c;
                            Intrinsics.checkNotNull(aVar37);
                            AudioManager audioManager27 = (AudioManager) aVar37.f672f;
                            Intrinsics.checkNotNull(audioManager27);
                            audioManager27.unloadSoundEffects();
                            result.success(null);
                            return;
                        }
                    case 1397925922:
                        if (!str.equals(StubApp.getString2("5326"))) {
                            break;
                        } else {
                            B6.a aVar38 = f5772c;
                            Intrinsics.checkNotNull(aVar38);
                            Object obj27 = list.get(0);
                            Intrinsics.checkNotNull(obj27, string22);
                            int intValue20 = ((Integer) obj27).intValue();
                            AudioManager audioManager28 = (AudioManager) aVar38.f672f;
                            Intrinsics.checkNotNull(audioManager28);
                            audioManager28.setRingerMode(intValue20);
                            result.success(null);
                            return;
                        }
                    case 1504508844:
                        if (!str.equals(StubApp.getString2("5325"))) {
                            break;
                        } else {
                            B6.a aVar39 = f5772c;
                            Intrinsics.checkNotNull(aVar39);
                            Object obj28 = list.get(0);
                            Intrinsics.checkNotNull(obj28, string22);
                            int intValue21 = ((Integer) obj28).intValue();
                            Double d8 = (Double) list.get(1);
                            if (d8 != null) {
                                AudioManager audioManager29 = (AudioManager) aVar39.f672f;
                                Intrinsics.checkNotNull(audioManager29);
                                audioManager29.playSoundEffect(intValue21, (float) d8.doubleValue());
                            } else {
                                AudioManager audioManager30 = (AudioManager) aVar39.f672f;
                                Intrinsics.checkNotNull(audioManager30);
                                audioManager30.playSoundEffect(intValue21);
                            }
                            result.success(null);
                            return;
                        }
                    case 1570996442:
                        if (!str.equals(StubApp.getString2("5324"))) {
                            break;
                        } else {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new H9.b(31);
                            }
                            B6.a aVar40 = f5772c;
                            Intrinsics.checkNotNull(aVar40);
                            result.success(aVar40.d());
                            return;
                        }
                    case 1984784677:
                        if (!str.equals(StubApp.getString2("5323"))) {
                            break;
                        } else {
                            B6.a aVar41 = f5772c;
                            Intrinsics.checkNotNull(aVar41);
                            Object obj29 = list.get(0);
                            Intrinsics.checkNotNull(obj29, string22);
                            int intValue22 = ((Integer) obj29).intValue();
                            AudioManager audioManager31 = (AudioManager) aVar41.f672f;
                            Intrinsics.checkNotNull(audioManager31);
                            audioManager31.setMode(intValue22);
                            result.success(null);
                            return;
                        }
                    case 1986792688:
                        if (!str.equals(StubApp.getString2("5322"))) {
                            break;
                        } else {
                            B6.a aVar42 = f5772c;
                            Intrinsics.checkNotNull(aVar42);
                            AudioManager audioManager32 = (AudioManager) aVar42.f672f;
                            Intrinsics.checkNotNull(audioManager32);
                            result.success(Boolean.valueOf(audioManager32.isVolumeFixed()));
                            return;
                        }
                    case 2093966320:
                        if (!str.equals(StubApp.getString2("5321"))) {
                            break;
                        } else {
                            B6.a aVar43 = f5772c;
                            Intrinsics.checkNotNull(aVar43);
                            AudioManager audioManager33 = (AudioManager) aVar43.f672f;
                            Intrinsics.checkNotNull(audioManager33);
                            result.success(Integer.valueOf(audioManager33.generateAudioSessionId()));
                            return;
                        }
                }
            }
            result.notImplemented();
        } catch (Exception e10) {
            e10.printStackTrace();
            result.error(StubApp.getString2(5364) + e10, null, null);
        }
    }
}
