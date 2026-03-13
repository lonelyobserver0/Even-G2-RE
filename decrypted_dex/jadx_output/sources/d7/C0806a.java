package d7;

import android.content.res.TypedArray;
import android.graphics.Color;
import com.mapbox.maps.ImageHolder;
import com.stub.StubApp;
import f7.C0930a;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.asn1.eac.CertificateBody;
import p7.C1495a;
import s7.C1603a;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0806a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypedArray f13440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0806a(TypedArray typedArray, float f10, int i3) {
        super(1);
        this.f13439a = i3;
        this.f13440b = typedArray;
        this.f13441c = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13439a) {
            case 0:
                C0807b AttributionSettings = (C0807b) obj;
                Intrinsics.checkNotNullParameter(AttributionSettings, "$this$AttributionSettings");
                TypedArray typedArray = this.f13440b;
                AttributionSettings.f13442a = typedArray.getBoolean(1, true);
                AttributionSettings.f13443b = typedArray.getColor(3, Color.parseColor(StubApp.getString2(9630)));
                AttributionSettings.f13444c = typedArray.getInt(2, 8388691);
                float f10 = this.f13441c;
                AttributionSettings.f13445d = typedArray.getDimension(5, 92.0f * f10);
                float f11 = f10 * 4.0f;
                AttributionSettings.f13446e = typedArray.getDimension(7, f11);
                AttributionSettings.f13447f = typedArray.getDimension(6, f11);
                AttributionSettings.f13448g = typedArray.getDimension(4, f11);
                AttributionSettings.f13449h = typedArray.getBoolean(0, true);
                break;
            case 1:
                C0930a CompassSettings = (C0930a) obj;
                Intrinsics.checkNotNullParameter(CompassSettings, "$this$CompassSettings");
                TypedArray typedArray2 = this.f13440b;
                CompassSettings.f14158a = typedArray2.getBoolean(20, true);
                CompassSettings.f14159b = typedArray2.getInt(22, 8388661);
                float f12 = this.f13441c * 4.0f;
                CompassSettings.f14160c = typedArray2.getDimension(25, f12);
                CompassSettings.f14161d = typedArray2.getDimension(27, f12);
                CompassSettings.f14162e = typedArray2.getDimension(26, f12);
                CompassSettings.f14163f = typedArray2.getDimension(24, f12);
                CompassSettings.f14164g = typedArray2.getFloat(28, 1.0f);
                CompassSettings.f14165h = typedArray2.getFloat(29, 0.0f);
                CompassSettings.f14166i = typedArray2.getBoolean(30, true);
                CompassSettings.j = typedArray2.getBoolean(21, true);
                CompassSettings.f14167k = typedArray2.getBoolean(19, true);
                CompassSettings.f14168l = ImageHolder.INSTANCE.from(typedArray2.getResourceId(23, -1));
                break;
            case 2:
                C1495a LogoSettings = (C1495a) obj;
                Intrinsics.checkNotNullParameter(LogoSettings, "$this$LogoSettings");
                TypedArray typedArray3 = this.f13440b;
                LogoSettings.f19706a = typedArray3.getBoolean(97, true);
                LogoSettings.f19707b = typedArray3.getInt(98, 8388691);
                float f13 = this.f13441c * 4.0f;
                LogoSettings.f19708c = typedArray3.getDimension(100, f13);
                LogoSettings.f19709d = typedArray3.getDimension(102, f13);
                LogoSettings.f19710e = typedArray3.getDimension(101, f13);
                LogoSettings.f19711f = typedArray3.getDimension(99, f13);
                break;
            default:
                C1603a ScaleBarSettings = (C1603a) obj;
                Intrinsics.checkNotNullParameter(ScaleBarSettings, "$this$ScaleBarSettings");
                TypedArray typedArray4 = this.f13440b;
                ScaleBarSettings.f20777a = typedArray4.getBoolean(115, true);
                ScaleBarSettings.f20778b = typedArray4.getInt(116, 8388659);
                float f14 = this.f13441c;
                float f15 = 4.0f * f14;
                ScaleBarSettings.f20779c = typedArray4.getDimension(120, f15);
                ScaleBarSettings.f20780d = typedArray4.getDimension(122, f15);
                ScaleBarSettings.f20781e = typedArray4.getDimension(121, f15);
                ScaleBarSettings.f20782f = typedArray4.getDimension(119, f15);
                ScaleBarSettings.f20783g = typedArray4.getColor(130, -16777216);
                ScaleBarSettings.f20784h = typedArray4.getColor(123, -16777216);
                ScaleBarSettings.f20785i = typedArray4.getColor(126, -1);
                float f16 = 2.0f * f14;
                ScaleBarSettings.j = typedArray4.getDimension(114, f16);
                ScaleBarSettings.f20786k = typedArray4.getDimension(117, f16);
                float f17 = f14 * 8.0f;
                ScaleBarSettings.f20787l = typedArray4.getDimension(128, f17);
                ScaleBarSettings.f20788m = typedArray4.getDimension(129, f16);
                ScaleBarSettings.f20789n = typedArray4.getDimension(131, f17);
                String country = Locale.getDefault().getCountry();
                Intrinsics.checkNotNullExpressionValue(country, "getDefault().country");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String upperCase = country.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                int hashCode = upperCase.hashCode();
                ScaleBarSettings.f20790o = typedArray4.getBoolean(118, hashCode == 2438 ? !upperCase.equals(StubApp.getString2(4644)) : !(hashCode == 2464 ? upperCase.equals(StubApp.getString2(4629)) : hashCode == 2718 && upperCase.equals(StubApp.getString2(2912))));
                ScaleBarSettings.f20791p = typedArray4.getInt(125, 15);
                ScaleBarSettings.f20792q = typedArray4.getBoolean(CertificateBody.profileType, true);
                ScaleBarSettings.f20793r = typedArray4.getFloat(124, 0.5f);
                ScaleBarSettings.f20794s = typedArray4.getBoolean(132, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
