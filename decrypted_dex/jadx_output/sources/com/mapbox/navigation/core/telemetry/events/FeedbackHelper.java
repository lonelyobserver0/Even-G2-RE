package com.mapbox.navigation.core.telemetry.events;

import android.graphics.Bitmap;
import android.util.Base64;
import com.mapbox.navigation.core.telemetry.events.BitmapEncodeOptions;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u000b0\nH\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u000b0\nH\u0007¢\u0006\u0002\u0010\fJ\"\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u000f0\n2\b\b\u0001\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u000b0\nH\u0007¢\u0006\u0002\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/mapbox/navigation/core/telemetry/events/FeedbackHelper;", "", "()V", "encodeScreenshot", "", "screenshot", "Landroid/graphics/Bitmap;", "options", "Lcom/mapbox/navigation/core/telemetry/events/BitmapEncodeOptions;", "getActiveNavigationFeedbackTypes", "", "Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent$Type;", "()[Ljava/lang/String;", "getArrivalFeedbackTypes", "getFeedbackSubTypes", "Lcom/mapbox/navigation/core/telemetry/events/FeedbackEvent$SubType;", "feedbackType", "(Ljava/lang/String;)[Ljava/lang/String;", "getFreeDriveFeedbackTypes", "navigation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FeedbackHelper {
    public static final FeedbackHelper INSTANCE = new FeedbackHelper();

    private FeedbackHelper() {
    }

    @JvmStatic
    @JvmOverloads
    public static final String encodeScreenshot(Bitmap screenshot) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        return encodeScreenshot$default(screenshot, null, 2, null);
    }

    public static /* synthetic */ String encodeScreenshot$default(Bitmap bitmap, BitmapEncodeOptions bitmapEncodeOptions, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            bitmapEncodeOptions = new BitmapEncodeOptions.Builder().build();
        }
        return encodeScreenshot(bitmap, bitmapEncodeOptions);
    }

    @JvmStatic
    public static final String[] getActiveNavigationFeedbackTypes() {
        return new String[]{StubApp.getString2(14694), StubApp.getString2(14691), StubApp.getString2(14712), StubApp.getString2(14709), StubApp.getString2(14703), StubApp.getString2(14701)};
    }

    @JvmStatic
    public static final String[] getArrivalFeedbackTypes() {
        return new String[]{StubApp.getString2(14681), StubApp.getString2(14682)};
    }

    @JvmStatic
    public static final String[] getFeedbackSubTypes(@FeedbackEvent.Type String feedbackType) {
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        int hashCode = feedbackType.hashCode();
        String string2 = StubApp.getString2(14692);
        String string22 = StubApp.getString2(14713);
        String string23 = StubApp.getString2(14695);
        String string24 = StubApp.getString2(14714);
        switch (hashCode) {
            case -2086290618:
                if (feedbackType.equals(StubApp.getString2(14709))) {
                    return new String[]{StubApp.getString2(14706), StubApp.getString2(14721), StubApp.getString2(14686)};
                }
                break;
            case -1687248675:
                if (feedbackType.equals(StubApp.getString2(14694))) {
                    return new String[]{StubApp.getString2(14720), string22, StubApp.getString2(14696), string23, StubApp.getString2(14698), StubApp.getString2(14688), StubApp.getString2(14697), string2};
                }
                break;
            case -1383962289:
                if (feedbackType.equals(StubApp.getString2(14712))) {
                    return new String[]{StubApp.getString2(14710), StubApp.getString2(14711), StubApp.getString2(14679), StubApp.getString2(14708), StubApp.getString2(14707)};
                }
                break;
            case -1363869974:
                if (feedbackType.equals(StubApp.getString2(14700))) {
                    return new String[0];
                }
                break;
            case -1061440774:
                if (feedbackType.equals(StubApp.getString2(14704))) {
                    return new String[]{string24, StubApp.getString2(14715), StubApp.getString2(14699)};
                }
                break;
            case -639231718:
                if (feedbackType.equals(StubApp.getString2(14693))) {
                    return new String[]{string22, string2};
                }
                break;
            case -366483619:
                if (feedbackType.equals(StubApp.getString2(14682))) {
                    return new String[]{StubApp.getString2(14685), StubApp.getString2(14684), StubApp.getString2(14680), StubApp.getString2(14683)};
                }
                break;
            case 203947031:
                if (feedbackType.equals(StubApp.getString2(14717))) {
                    return new String[]{StubApp.getString2(14716), StubApp.getString2(14718), StubApp.getString2(14719)};
                }
                break;
            case 233867121:
                if (feedbackType.equals(StubApp.getString2(14681))) {
                    return new String[0];
                }
                break;
            case 280660347:
                if (feedbackType.equals(StubApp.getString2(14691))) {
                    return new String[]{StubApp.getString2(14689), StubApp.getString2(14690), StubApp.getString2(14702), StubApp.getString2(14705), string23};
                }
                break;
            case 1067145011:
                if (feedbackType.equals(StubApp.getString2(14701))) {
                    return new String[0];
                }
                break;
            case 1276713835:
                if (feedbackType.equals(StubApp.getString2(14703))) {
                    return new String[]{string24};
                }
                break;
        }
        throw new IllegalArgumentException(E1.a.k(StubApp.getString2(14723), feedbackType, StubApp.getString2(2453)));
    }

    @JvmStatic
    public static final String[] getFreeDriveFeedbackTypes() {
        return new String[]{StubApp.getString2(14693), StubApp.getString2(14704), StubApp.getString2(14717), StubApp.getString2(14701), StubApp.getString2(14700)};
    }

    @JvmStatic
    @JvmOverloads
    public static final String encodeScreenshot(Bitmap screenshot, BitmapEncodeOptions options) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(screenshot, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int width = options.getWidth();
        Intrinsics.checkNotNullParameter(screenshot, "<this>");
        int min = Math.min(screenshot.getWidth(), width);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(screenshot, min, MathKt.roundToInt((min * screenshot.getHeight()) / screenshot.getWidth()), true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this,…alWidth, newHeight, true)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, options.getCompressQuality(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "out.toByteArray()");
        String encodeToString = Base64.encodeToString(byteArray, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(screensho…options), Base64.DEFAULT)");
        return encodeToString;
    }
}
