package n9;

import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1395a {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f17885a = new Regex(StubApp.getString2(21464));

    public static final String a(Style style) {
        List<String> groupValues;
        Intrinsics.checkNotNullParameter(style, "<this>");
        String styleURI = style.getStyleURI();
        if (Intrinsics.areEqual(styleURI, "mapbox://styles/mapbox/navigation-day-v1")) {
            return StubApp.getString2(21465);
        }
        if (Intrinsics.areEqual(styleURI, "mapbox://styles/mapbox/navigation-night-v1")) {
            return StubApp.getString2(21466);
        }
        MatchResult find$default = Regex.find$default(f17885a, style.getStyleURI(), 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt.lastOrNull((List) groupValues);
    }
}
