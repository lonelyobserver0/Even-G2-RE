package com.mapbox.maps.attribution;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import c7.C0574a;
import com.mapbox.maps.R;
import com.stub.StubApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0005\b\u0016\u0018\u0000 ;2\u00020\u0001:\u0002;<B]\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010!J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010&J\u000f\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010\u0018J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u0007H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0014H\u0004¢\u0006\u0004\b3\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u000f088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser;", AttributionParser.EMPTY_STRING, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "context", AttributionParser.EMPTY_STRING, "attributionData", AttributionParser.EMPTY_STRING, "withImproveMap", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", AttributionParser.EMPTY_STRING, "Lc7/a;", "extraAttributions", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;ZZZZZZLjava/util/List;)V", "stringLiteralList", AttributionParser.EMPTY_STRING, "parseStringLiteralToAttributions", "(Ljava/util/List;)V", "parseAttributions", "()V", "Landroid/text/SpannableStringBuilder;", "htmlBuilder", "Landroid/text/style/URLSpan;", "urlSpan", "parseUrlSpan", "(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)V", "url", "isUrlValid", "(Ljava/lang/String;)Z", "anchor", "isImproveThisMapAnchor", "anchorString", "translateImproveThisMapAnchor", "(Ljava/lang/String;)Ljava/lang/String;", "isValidForImproveThisMap", "isValidForMapbox", "parseAnchorValue", "(Landroid/text/SpannableStringBuilder;Landroid/text/style/URLSpan;)Ljava/lang/String;", "stripCopyright", "addAdditionalAttributions", AttributionParser.EMPTY_STRING, "getAttributions", "()Ljava/util/Set;", "shortenedOutput", "createAttributionString", "(Z)Ljava/lang/String;", "parse", "Ljava/lang/ref/WeakReference;", "Ljava/lang/String;", "Z", "Ljava/util/List;", AttributionParser.EMPTY_STRING, "attributions", "Ljava/util/Set;", "Companion", "Options", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AttributionParser {
    private static final String EMPTY_STRING = "";
    private static final List<String> IMPROVE_MAP_URLS;
    private final String attributionData;
    private final Set<C0574a> attributions;
    private final WeakReference<Context> context;
    private final List<C0574a> extraAttributions;
    private final boolean withCopyrightSign;
    private final boolean withImproveMap;
    private final boolean withMapboxAttribution;
    private final boolean withMapboxGeofencingConsent;
    private final boolean withMapboxPrivacyPolicy;
    private final boolean withTelemetryAttribution;
    private static final String COPYRIGHT = StubApp.getString2(14335);
    private static final String IMPROVE_THIS_MAP = StubApp.getString2(14336);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Companion;", AttributionParser.EMPTY_STRING, "()V", "COPYRIGHT", AttributionParser.EMPTY_STRING, "EMPTY_STRING", "IMPROVE_MAP_URLS", AttributionParser.EMPTY_STRING, "getIMPROVE_MAP_URLS", "()Ljava/util/List;", "IMPROVE_THIS_MAP", "fromHtml", "Landroid/text/Spanned;", "html", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Spanned fromHtml(String html) {
            Spanned fromHtml = Html.fromHtml(html, 0);
            Intrinsics.checkNotNullExpressionValue(fromHtml, "{\n        Html.fromHtml(…HTML_MODE_LEGACY)\n      }");
            return fromHtml;
        }

        public final List<String> getIMPROVE_MAP_URLS() {
            return AttributionParser.IMPROVE_MAP_URLS;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006+"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Options;", AttributionParser.EMPTY_STRING, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", AttributionParser.EMPTY_STRING, AttributionParser.EMPTY_STRING, "attribution", "parseAttribution", "([Ljava/lang/String;)Ljava/lang/String;", "htmlStr", AttributionParser.EMPTY_STRING, "hasValidHTMLTag", "(Ljava/lang/String;)Z", "attributionData", "withAttributionData", "([Ljava/lang/String;)Lcom/mapbox/maps/attribution/AttributionParser$Options;", AttributionParser.EMPTY_STRING, "Lc7/a;", "attributions", "withExtraAttributions", "(Ljava/util/List;)Lcom/mapbox/maps/attribution/AttributionParser$Options;", "withImproveMap", "(Z)Lcom/mapbox/maps/attribution/AttributionParser$Options;", "withCopyrightSign", "withTelemetryAttribution", "withMapboxAttribution", "withMapboxPrivacyPolicy", "withMapboxGeofencingConsent", "Lcom/mapbox/maps/attribution/AttributionParser;", "build", "()Lcom/mapbox/maps/attribution/AttributionParser;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Z", "attributionDataStringArray", "[Ljava/lang/String;", AttributionParser.EMPTY_STRING, "stringLiteralArray", "Ljava/util/List;", "extraAttributions", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Options {
        private String[] attributionDataStringArray;
        private final WeakReference<Context> context;
        private List<C0574a> extraAttributions;
        private List<String> stringLiteralArray;
        private boolean withCopyrightSign;
        private boolean withImproveMap;
        private boolean withMapboxAttribution;
        private boolean withMapboxGeofencingConsent;
        private boolean withMapboxPrivacyPolicy;
        private boolean withTelemetryAttribution;

        @Deprecated
        public static final String HTML_STYLE_REGEX = StubApp.getString2(14330);
        private static final Companion Companion = new Companion(null);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/attribution/AttributionParser$Options$Companion;", AttributionParser.EMPTY_STRING, "()V", "HTML_STYLE_REGEX", AttributionParser.EMPTY_STRING, "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Options(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = new WeakReference<>(context);
            this.withImproveMap = true;
            this.withCopyrightSign = true;
            this.withMapboxAttribution = true;
            this.withMapboxPrivacyPolicy = true;
            this.withMapboxGeofencingConsent = true;
            this.stringLiteralArray = new ArrayList();
            this.extraAttributions = CollectionsKt.emptyList();
        }

        private final boolean hasValidHTMLTag(String htmlStr) {
            return Pattern.compile(StubApp.getString2(14330)).matcher(htmlStr).find();
        }

        private final String parseAttribution(String[] attribution) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : attribution) {
                if (str.length() > 0) {
                    if (hasValidHTMLTag(str)) {
                        sb2.append(str);
                    } else {
                        this.stringLiteralArray.add(str);
                    }
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
            return sb3;
        }

        public final AttributionParser build() {
            String[] strArr = this.attributionDataStringArray;
            if (strArr == null) {
                throw new IllegalStateException(StubApp.getString2(14331));
            }
            Intrinsics.checkNotNull(strArr);
            AttributionParser attributionParser = new AttributionParser(this.context, parseAttribution(strArr), this.withImproveMap, this.withCopyrightSign, this.withTelemetryAttribution, this.withMapboxAttribution, this.withMapboxPrivacyPolicy, this.withMapboxGeofencingConsent, this.extraAttributions);
            attributionParser.parse();
            attributionParser.parseStringLiteralToAttributions(this.stringLiteralArray);
            return attributionParser;
        }

        public final Options withAttributionData(String... attributionData) {
            Intrinsics.checkNotNullParameter(attributionData, "attributionData");
            this.attributionDataStringArray = (String[]) Arrays.copyOf(attributionData, attributionData.length);
            return this;
        }

        public final Options withCopyrightSign(boolean withCopyrightSign) {
            this.withCopyrightSign = withCopyrightSign;
            return this;
        }

        public final Options withExtraAttributions(List<C0574a> attributions) {
            Intrinsics.checkNotNullParameter(attributions, "attributions");
            this.extraAttributions = attributions;
            return this;
        }

        public final Options withImproveMap(boolean withImproveMap) {
            this.withImproveMap = withImproveMap;
            return this;
        }

        public final Options withMapboxAttribution(boolean withMapboxAttribution) {
            this.withMapboxAttribution = withMapboxAttribution;
            return this;
        }

        public final Options withMapboxGeofencingConsent(boolean withMapboxGeofencingConsent) {
            this.withMapboxGeofencingConsent = withMapboxGeofencingConsent;
            return this;
        }

        public final Options withMapboxPrivacyPolicy(boolean withMapboxPrivacyPolicy) {
            this.withMapboxPrivacyPolicy = withMapboxPrivacyPolicy;
            return this;
        }

        public final Options withTelemetryAttribution(boolean withTelemetryAttribution) {
            this.withTelemetryAttribution = withTelemetryAttribution;
            return this;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        IMPROVE_MAP_URLS = arrayList;
        arrayList.add(StubApp.getString2(14332));
        arrayList.add(StubApp.getString2(14333));
        arrayList.add(StubApp.getString2(14334));
    }

    public AttributionParser(WeakReference<Context> context, String attributionData, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List<C0574a> extraAttributions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributionData, "attributionData");
        Intrinsics.checkNotNullParameter(extraAttributions, "extraAttributions");
        this.context = context;
        this.attributionData = attributionData;
        this.withImproveMap = z2;
        this.withCopyrightSign = z10;
        this.withTelemetryAttribution = z11;
        this.withMapboxAttribution = z12;
        this.withMapboxPrivacyPolicy = z13;
        this.withMapboxGeofencingConsent = z14;
        this.extraAttributions = extraAttributions;
        this.attributions = new LinkedHashSet();
    }

    private final void addAdditionalAttributions() {
        String string2;
        String string22;
        String string23;
        Context context = this.context.get();
        if (this.withTelemetryAttribution) {
            Set<C0574a> set = this.attributions;
            if (context == null || (string23 = context.getString(R.string.mapbox_telemetrySettings)) == null) {
                string23 = StubApp.getString2(14337);
            }
            set.add(new C0574a(string23, StubApp.getString2(14338)));
        }
        if (this.withMapboxGeofencingConsent) {
            Set<C0574a> set2 = this.attributions;
            if (context == null || (string22 = context.getString(R.string.mapbox_geofencing_consent)) == null) {
                string22 = StubApp.getString2(14339);
            }
            set2.add(new C0574a(string22, StubApp.getString2(14340)));
        }
        if (this.withMapboxPrivacyPolicy) {
            Set<C0574a> set3 = this.attributions;
            if (context == null || (string2 = context.getString(R.string.mapbox_privacy_policy)) == null) {
                string2 = StubApp.getString2(14341);
            }
            set3.add(new C0574a(string2, StubApp.getString2(14342)));
        }
        this.attributions.addAll(this.extraAttributions);
    }

    public static /* synthetic */ String createAttributionString$default(AttributionParser attributionParser, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(StubApp.getString2(14343));
        }
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        return attributionParser.createAttributionString(z2);
    }

    private final boolean isImproveThisMapAnchor(String anchor) {
        return Intrinsics.areEqual(anchor, "Improve this map");
    }

    private final boolean isUrlValid(String url) {
        return isValidForImproveThisMap(url) && isValidForMapbox(url);
    }

    private final boolean isValidForImproveThisMap(String url) {
        return this.withImproveMap || !IMPROVE_MAP_URLS.contains(url);
    }

    private final boolean isValidForMapbox(String url) {
        return this.withMapboxAttribution || !Intrinsics.areEqual(url, "https://www.mapbox.com/about/maps/");
    }

    private final String parseAnchorValue(SpannableStringBuilder htmlBuilder, URLSpan urlSpan) {
        int spanStart = htmlBuilder.getSpanStart(urlSpan);
        int spanEnd = htmlBuilder.getSpanEnd(urlSpan);
        char[] cArr = new char[spanEnd - spanStart];
        htmlBuilder.getChars(spanStart, spanEnd, cArr, 0);
        return stripCopyright(new String(cArr));
    }

    private final void parseAttributions() {
        Spanned fromHtml = INSTANCE.fromHtml(this.attributionData);
        Intrinsics.checkNotNull(fromHtml, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) fromHtml;
        URLSpan[] urlSpans = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(urlSpans, "urlSpans");
        for (URLSpan urlSpan : urlSpans) {
            Intrinsics.checkNotNullExpressionValue(urlSpan, "urlSpan");
            parseUrlSpan(spannableStringBuilder, urlSpan);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseStringLiteralToAttributions(List<String> stringLiteralList) {
        Iterator<String> it = stringLiteralList.iterator();
        while (it.hasNext()) {
            String obj = INSTANCE.fromHtml(it.next()).toString();
            if (!this.withCopyrightSign) {
                obj = stripCopyright(obj);
            }
            this.attributions.add(new C0574a(obj, EMPTY_STRING));
        }
    }

    private final void parseUrlSpan(SpannableStringBuilder htmlBuilder, URLSpan urlSpan) {
        String url = urlSpan.getURL();
        Intrinsics.checkNotNullExpressionValue(url, "url");
        if (isUrlValid(url)) {
            String parseAnchorValue = parseAnchorValue(htmlBuilder, urlSpan);
            if (isImproveThisMapAnchor(parseAnchorValue)) {
                if (!this.withImproveMap) {
                    return;
                } else {
                    parseAnchorValue = translateImproveThisMapAnchor(parseAnchorValue);
                }
            }
            this.attributions.add(new C0574a(parseAnchorValue, url));
        }
    }

    private final String stripCopyright(String anchorString) {
        if (this.withCopyrightSign || !StringsKt.O(anchorString, StubApp.getString2(14335))) {
            return anchorString;
        }
        String substring = anchorString.substring(2, anchorString.length());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private final String translateImproveThisMapAnchor(String anchorString) {
        Context context = this.context.get();
        if (context == null) {
            return anchorString;
        }
        String string = context.getString(R.string.mapbox_telemetryImproveMap);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…pbox_telemetryImproveMap)");
        return string;
    }

    @JvmOverloads
    public final String createAttributionString() {
        return createAttributionString$default(this, false, 1, null);
    }

    public final Set<C0574a> getAttributions() {
        return this.attributions;
    }

    public final void parse() {
        parseAttributions();
        addAdditionalAttributions();
    }

    @JvmOverloads
    public final String createAttributionString(boolean shortenedOutput) {
        String str;
        boolean isEmpty = this.attributions.isEmpty();
        String str2 = EMPTY_STRING;
        if (isEmpty) {
            return EMPTY_STRING;
        }
        if (!this.withCopyrightSign) {
            str2 = StubApp.getString2(14335);
        }
        StringBuilder sb2 = new StringBuilder(str2);
        int i3 = 0;
        for (C0574a c0574a : this.attributions) {
            i3++;
            if (shortenedOutput) {
                str = c0574a.f10995a;
                if (Intrinsics.areEqual(str, "OpenStreetMap")) {
                    str = StubApp.getString2(14344);
                }
            } else {
                str = c0574a.f10995a;
            }
            sb2.append(str);
            if (i3 != this.attributions.size()) {
                sb2.append(StubApp.getString2(14345));
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "stringBuilder.toString()");
        return sb3;
    }
}
